package com.alura.conversorMonedas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConsultarApp consultar = new ConsultarApp();
        ProcesarResultado procesar = null;

        String menu = """
                \n***************************************************
                *** Sea bienvenido al Conversor de Monedas ***
                
                ::::::::::: PESO MEXICANO A OTRA MONEDA ::::::::::::::
                 1: (MXN) PESO MEXICANO -->  (USD) DOLAR ESTADOUNIDENSE
                 2: (MXN) PESO MEXICANO -->  (EUR) EURO
                 3: (MXN) PESO MEXICANO -->  (GBP) LIBRA ESTERLINA
                
                ::::::::::: OTRA MONEDA A PESO MEXICANO ::::::::::::::
                4: (USD) DOLAR ESTADOUNIDENSE -->  (MXN) PESO MEXICANO
                5: (EUR) EURO                 -->  (MXN) PESO MEXICANO
                6: (GBP) LIBRA ESTERLINA      -->  (MXN) PESO MEXICANO
                
                
                
                7: Otra opción de conversión
                8: Salir
                ***************************************************
                """;

        while (true){
            try {
                System.out.println(menu);
                int opcion = sc.nextInt();

                LocalDateTime fechas = LocalDateTime.now();
                DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
                String fecha = fechas.format(formato);
                if (opcion == 8) break;

                switch (opcion) {
                    case 1:
                        procesar = new ProcesarResultado("MXN", "USD", consultar, fecha);
                        break;

                    case 2:
                        procesar = new ProcesarResultado("MXN", "EUR", consultar, fecha);
                        break;

                    case 3:
                        procesar = new ProcesarResultado("MXN", "GBP", consultar, fecha);
                        break;

                    case 4:
                        procesar = new ProcesarResultado("USD", "MXN", consultar, fecha);
                        break;

                    case 5:
                        procesar = new ProcesarResultado("EUR", "MXN", consultar, fecha);
                        break;

                    case 6:
                        procesar = new ProcesarResultado("GBP", "MXN", consultar, fecha);
                        break;

                    case 7:
                        try {
                            procesar = new ProcesarResultado(consultar, fecha);
                        }catch (Exception e){
                            System.out.println("\n[!] Ingrese correctamente los valores");
                            sc.nextLine();
                        }

                        break;

                    default:
                        System.out.println("\n[!]Ingrese una opcion valida");
                        break;
                }

                if (procesar != null) {
                    procesar.mostrarConversion();
                }
            } catch (InputMismatchException e){
                    System.out.println("Ingrese un valor numerico correcto");
                    sc.nextLine(); // limpia el buffer
                }
        }
        System.out.println("Finalizando Programa");

    }
}
