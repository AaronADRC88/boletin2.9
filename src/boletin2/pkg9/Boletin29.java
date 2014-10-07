/*billetes2cantidade€ */
package boletin2.pkg9;

import java.util.Scanner;

/**
 *
 * @author aferreiradominguez
 */
public class Boletin29 {

    public static void main(String[] args) {
int c, v, cinc , u ;
System.out.println("billetes 100€=");
Scanner dato=new Scanner(System.in);
c=100*dato.nextInt();
System.out.println("billetes 20€=");
Scanner dato1=new Scanner(System.in);
v=20*dato1.nextInt();
System.out.println("billetes 5€=");
Scanner dato2=new Scanner(System.in);
cinc=5*dato2.nextInt();
System.out.println("monedas 1€=");
Scanner dato3=new Scanner(System.in);
u=dato3.nextInt();
int euros;
euros=c+v+cinc+u ;
System.out.println("€ totales="+euros);


    }
    
}
