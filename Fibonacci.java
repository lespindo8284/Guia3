import java.util.*;

public class Fibonacci {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero,temp1,temp2,i;

        System.out.print("¿Que cantidad de terminos desea? --> ");
        numero = sc.nextInt();
        
        temp1=1;
        temp2=1; 

        System.out.print(temp1 + " ");
        for(i=2;i<=numero;i++){
             System.out.print(temp2 + " ");
             temp2 = temp1 + temp2;
             temp1 = temp2 - temp1;
        }
        System.out.println();
    }
}
