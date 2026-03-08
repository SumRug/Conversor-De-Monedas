package com.alura.conversorMonedas;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class HistorialJson {

    public static void guardar(ProcesarResultado resultado){

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        try(FileWriter writer = new FileWriter("historial.json", true)){
            gson.toJson(resultado, writer);
            writer.write("\n");
        } catch (IOException e){
            System.out.println("Error guardando historial");
        }
    }
}
