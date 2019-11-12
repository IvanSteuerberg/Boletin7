package boletin7_4;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Boletin7_4 {


    public static void main(String[] args) {
int  x = 0,n = 16 ;
while ( n % 2 == 0) {
    x = x + n ;
   n = n / 2 ;
    }
System.out.println(x);    
}
}