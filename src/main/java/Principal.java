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
         autoJuan.year=2010;
         autoJuan.placa="ABB 0102";
         autoJuan.precio=23145d;
        
         
         System.out.println(autoJuan.color+"-------------"+
                 autoJuan.marca+"---------"+
                 autoJuan.year+"--------"+
                 autoJuan.placa+"---------");
         var autoMauricio=new Auto();
         autoMauricio.color="rojo";
         autoMauricio.marca="hino";
         autoMauricio.year=2015;
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
        var costoMatricula=10000d;
        costoMatricula=autoJuan.calcularMatricula(2010, 10000);
        System.out.println("Debe pagar "+costoMatricula+" USD por concepto de matrícula");
        
       
        System.out.println("el auto es de la provincia de "+autoJuan.obtenerProvincia());
        System.out.println("el auto es de la provincia de "+autoMauricio.obtenerProvincia());
        System.out.println("el año actual del vehiculo es :"+autoJuan.calcularYears(2022));
         System.out.println("el año actual del vehiculo es :"+autoMauricio.calcularYears(2022));
        System.out.println(" el auto se puede asegurar:"+autoJuan.sePuedeAsegurar(2022, 6));
        System.out.println(" el auto se puede asegurar:"+autoMauricio.sePuedeAsegurar(2022, 7));

       
    }
        
    
}
