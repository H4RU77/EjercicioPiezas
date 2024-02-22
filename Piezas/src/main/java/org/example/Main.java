package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static Pieza[] piezas = new Pieza[5];
    public static void listadoAlfabetico(){
        String[] listado=new String[5];
        for (int i=0;i<5;i++){
            listado[i]=piezas[i].getNombre();
        }
        Arrays.sort(listado);
        System.out.println("El listado en orden alfabético de los artículos es: ");
        System.out.println(Arrays.toString(listado));

    }

    public static void piezaMayorPrecio(){
        double mayor=0; String nombre="";
        for (int i=0;i<5;i++){
            if(i==0){
                mayor=piezas[i].getPrecio();
                nombre=piezas[i].getNombre();
            }
            if(piezas[i].getPrecio()>mayor){
                nombre=piezas[i].getNombre();
            }
        }
        System.out.println("La pieza de mayor precio es: "+nombre);

    }
    public static void sumaTotal(){
        double suma=0;
        for (int i=0;i<5;i++){
            suma += piezas[i].getPrecio();

        }
        System.out.println("El valor total de las piezas procesadas es "+suma);
    }
    public static void getListadoPais(){
        String pais = "China";
        System.out.println("Las piezas de este país son: ");
        for (int i=0;i<5;i++){
            if(piezas[i].getPais()==pais){
                System.out.println(piezas[i].getNombre());
            }

        }

    }
    public static void getDatos(){
        int codigo= 1112;
        System.out.println("Los datos de la pieza con el código "+codigo+" son: ");
        for (int i=0;i<5;i++){
            if(piezas[i].getCodigo()==codigo){
                System.out.println("Nombre: "+piezas[i].getNombre());
                System.out.println("País: "+piezas[i].getPais());
                System.out.println("Cantidad: "+piezas[i].getCant());
                System.out.println("Precio: "+piezas[i].getPrecio());


            }

        }
    }

    public static void main(String[] args) {

        Pieza x = new Pieza("Tornillo", 1112,"Japon",5,12.50);
        piezas[0]=x;
        x= new Pieza("Herradura", 1234,"China",40,6.20);
        piezas[1]=x;
        x= new Pieza("Llave", 1456,"China",45,7.20);
        piezas[2]=x;
        x= new Pieza("Martillo", 1246,"China",30,8.20);
        piezas[3]=x;
        x= new Pieza("Ganzúa", 1299,"China",49,9.20);
        piezas[4]=x;

        listadoAlfabetico();
        System.out.println();
        piezaMayorPrecio();
        System.out.println();
        sumaTotal();
        System.out.println();
        getListadoPais();
        System.out.println();
        getDatos();

    }
}