
package com.sena.leydder;

import java.util.Scanner;
public class Leydder {
static Scanner dato = new Scanner(System.in);
    public static void main(String[] args) {
        int Edad,Nhc1=0,Urg=0,Con=0,Gen=0;
        String Sexo,TC;
        
        while(Nhc1!=-1){
            System.out.println ("ingrese el numero de historia clinica");
        Nhc1= dato.nextInt();
        if(Nhc1==-1){
            break;
        }
        System.out.println("ingrese su edad");
        Edad= dato.nextInt();
        dato.nextLine();
        System.out.println("ingrese su sexo");
        Sexo= dato.nextLine();
        System.out.println("ingrese su tipo de consuta");
        TC= dato.nextLine();
        
            if(TC.equalsIgnoreCase("urgencias")){
                Urg++;
            }else if(TC.equalsIgnoreCase("control")){
                Con++;
            }else if(TC.equalsIgnoreCase("general")){
                Gen++;
            }else{
                System.out.println("el tipo consulta no es valido");
                   
            }
            
        }
            System.out.println("la cantidad de consultas por urgencia fueron"+Urg);
            System.out.println("la cantidad de consultas por control fueron"+ Con);
            System.out.println("la cantidad de consultas por general fueron"+ Gen);
            
                
    }
}

        
        
        
        
        
