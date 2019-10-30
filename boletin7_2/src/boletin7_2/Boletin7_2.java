package boletin7_2;
// @author irodriguezsteuerberg
 
public class Boletin7_2 {

    public static void main(String[] args) {
int x,z;
x=2;
/*
Con ifs:
if ( x == 3) {
    z = 0;
}
else if (x==1)
    z = 1 ;
else
    z = x ;
*/
//Con Switch:
switch (x) {
    case 3:
        z = 0;
        break;
    case 1:
        z = 1 ;
        break;
    default:
        z = x ;
        break;
        }


}
}