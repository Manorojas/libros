package com.aluracursos.libros.principal;
import com.aluracursos.libros.model.Datos;
import com.aluracursos.libros.model.DatosLibros;
import com.aluracursos.libros.service.ConsumoAPI;
import com.aluracursos.libros.service.ConvierteDatos;

import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI =new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private final String URL_BASE = "https://gutendex.com/books/";
    private String mensaje;
    private String tituloLibro;
    private int opcion;

    public void muestraElMenu() {
       // System.out.println("Digite nombre del libro a buscar" );
        //tituloLibro = teclado.nextLine();
        //var json = consumoAPI.obtenerDatos(URL_BASE + tituloLibro.replace(" ","+"));
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);
        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);



        //mensaje = """
        //        1.- Busca libro
             
         //       """;
        //System.out.println("Digite opción");
        //opcion = teclado.nextInt();
        //while (opcion != 5){

          //  switch (opcion) {

            //    case 1:
              //      System.out.println("Digite nombre del libro a buscar" );
                //    tituloLibro = teclado.nextLine();
                  //  break;
            //}


        //}


    }
}
