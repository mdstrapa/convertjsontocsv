package com.marcosoft.convertjsontocsv.model;

import java.sql.Timestamp;

public class Monitoria {
    private String numeroSinistro;
    private String nomeSegurado;
    private String cpfCnpjSegurado;
    private String nomeSeguradora;
    private Timestamp dataOcorrencia;
    private Timestamp dataAviso;
    private String agencia;
    private String nomeFamilia;

    public Monitoria(String numeroSinistro, String nomeSegurado, String cpfCnpjSegurado, String nomeSeguradora, Timestamp dataOcorrencia, Timestamp dataAviso, String agencia, String nomeFamilia) {
        this.numeroSinistro = numeroSinistro;
        this.nomeSegurado = nomeSegurado;
        this.cpfCnpjSegurado = cpfCnpjSegurado;
        this.nomeSeguradora = nomeSeguradora;
        this.dataOcorrencia = dataOcorrencia;
        this.dataAviso = dataAviso;
        this.agencia = agencia;
        this.nomeFamilia = nomeFamilia;
    }

    public Monitoria() {
    }

    public String getNumeroSinistro() {
        return numeroSinistro;
    }

    public void setNumeroSinistro(String numeroSinistro) {
        this.numeroSinistro = numeroSinistro;
    }

    public String getNomeSegurado() {
        return nomeSegurado;
    }

    public void setNomeSegurado(String nomeSegurado) {
        this.nomeSegurado = nomeSegurado;
    }

    public String getCpfCnpjSegurado() {
        return cpfCnpjSegurado;
    }

    public void setCpfCnpjSegurado(String cpfCnpjSegurado) {
        this.cpfCnpjSegurado = cpfCnpjSegurado;
    }

    public String getNomeSeguradora() {
        return nomeSeguradora;
    }

    public void setNomeSeguradora(String nomeSeguradora) {
        this.nomeSeguradora = nomeSeguradora;
    }

    public Timestamp getDataOcorrencia() {
        return dataOcorrencia;
    }

    public void setDataOcorrencia(Timestamp dataOcorrencia) {
        this.dataOcorrencia = dataOcorrencia;
    }

    public Timestamp getDataAviso() {
        return dataAviso;
    }

    public void setDataAviso(Timestamp dataAviso) {
        this.dataAviso = dataAviso;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeFamilia() {
        return nomeFamilia;
    }

    public void setNomeFamilia(String nomeFamilia) {
        this.nomeFamilia = nomeFamilia;
    }
}
