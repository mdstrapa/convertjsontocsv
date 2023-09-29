package com.marcosoft.convertjsontocsv;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.marcosoft.convertjsontocsv.model.Monitoria;


import java.io.*;
import java.util.List;

public class App {

    public static void main(String[] args) throws FileNotFoundException {

        String file ="/Users/marcosstrapazon/Library/Mobile Documents/com~apple~CloudDocs/Sicredi/Monitoria de Seguros/previa_massificados.json";

        BufferedReader reader = new BufferedReader(new FileReader(file));
        try {
            String fileContent = reader.readLine();
            ObjectMapper jsonConverter = new ObjectMapper();
            List<Monitoria> monitoriaList = jsonConverter.readValue(fileContent, new TypeReference<List<Monitoria>>(){});
            reader.close();
            createCsvFile(monitoriaList);

            for(Monitoria m:monitoriaList){
                System.out.println("Monitoria " + m.getNumeroSinistro());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createCsvFile(List<Monitoria> monitoriaList){
        StringBuilder fileContent = new StringBuilder();
        fileContent.append("numeroSinistro,nomeSegurado,cpfCnpjSegurado,nomeSeguradora,dataOcorrencia,dataAviso,agencianomeFamilia");
        fileContent.append(System.getProperty("line.separator"));
        for(Monitoria m:monitoriaList){
            fileContent.append(m.getNumeroSinistro())
                    .append(",").append(m.getNomeSegurado())
                    .append(",").append(m.getCpfCnpjSegurado())
                    .append(",").append(m.getDataOcorrencia())
                    .append(",").append(m.getDataAviso())
                    .append(",").append(m.getAgencia())
                    .append(",").append(m.getNomeFamilia())
                    .append(System.getProperty("line.separator"));
        }

        File file = null;

        FileWriter filewriter = null;

        try {
            file = new File("/Users/marcosstrapazon/Library/Mobile Documents/com~apple~CloudDocs/Sicredi/Monitoria de Seguros/previa_massificados.csv");
            filewriter = new FileWriter(file);
            filewriter.write(fileContent.toString());
            filewriter.close();
            System.out.println("File writing done.");
        }

        catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                if (filewriter != null) {
                    filewriter.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }


    }

}
