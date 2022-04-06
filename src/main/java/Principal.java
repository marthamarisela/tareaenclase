/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author PC-14
 */
public class Principal {
    public static void main(String args[]){
        
         var autoJuan=new Auto();
         autoJuan.color="amarillo";
         autoJuan.marca="jetour";
         autoJuan.year=2022;
         autoJuan.placa="zdfd4";
         autoJuan.precio=23145d;
        
         
         System.out.println(autoJuan.color+"-------------"+
                 autoJuan.marca+"---------"+
                 autoJuan.year+"--------"+
                 autoJuan.placa+"---------");
         var autoMauricio=new Auto();
         autoMauricio.color="rojo";
         autoMauricio.marca="hino";
         autoMauricio.year=2022;
         autoMauricio.placa="zdfd4";
         autoMauricio.precio=566666d;
         
        System.out.println(autoMauricio.color+"-----------"+
                 autoMauricio.marca+"---------"+
                 autoMauricio.year+"--------"+
                 autoMauricio.placa+"---------");
        
         var esTaxi=false;
         esTaxi=autoJuan.esTaxi();
         if(esTaxi==true){
         System.out.println("el auto de placa: "+autoJuan.placa+" es un taxi");
         }else{
             System.out.println("el auto de placa: "+autoJuan.placa+" No es un taxi");
         }
         
         esTaxi=autoMauricio.esTaxi();
         if(esTaxi==true){
         System.out.println("el auto de placa: "+autoMauricio.placa+" es un taxi");
         }else{
             System.out.println("el auto de placa: "+autoMauricio.placa+" No es un taxi");
         }
         
         System.out.println("el auto de precio"+
                 autoJuan.precio+
                 "debe pagar de tasa solidaria"
                 +autoJuan.calcularTasaSolidaria()); 
         
         System.out.println("el auto de precio"+
                 autoMauricio.precio+
                 "debe pagar de tasa solidaria"
                 +autoMauricio.calcularTasaSolidaria());
         System.out.println("el valor de matricula es "+autoMauricio.calcularMatricula());
         System.out.println("el valor de matricula es "+autoJuan.calcularMatricula());
    }
        
    
}
