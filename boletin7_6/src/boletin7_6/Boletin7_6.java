package boletin7_6;
//@author irodriguezsteuerberg

import java.util.Scanner;

 
public class Boletin7_6 {

    public static void main(String[] args) {
 Scanner resposta = new  Scanner (System.in);
        System.out.println("Introduce un numero");
         int  num = resposta.nextInt( );
    if ( num % 2 == 0 )
            System.out.println("numero par");
    else if ( num > 0 )
            System . out .println ("é impar positivo ") ;
    else
            System . out .println ("é impar  negativo") ;

}
}   
    
    

