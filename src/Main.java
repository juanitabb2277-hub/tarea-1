import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random ale =new Random();
        int n3=0,i,j = 0;
        for (i=1; i<=100; i++){
            n3=ale.nextInt((100-1)+1)+1;
            System.out.println(n3);
            j+=n3;
        }
        System.out.println(j);
//generar 100 numeros aleatorios entre 1-200 y cuanto es la suma de los pares y cuanto de los impares
        Random al =new Random();
        int n4,m,pares = 0,impares=0;
        for (m=1; m<=100; m++){
            n4=al.nextInt((100-1)+1)+1;
            System.out.println(n3);
            if (n4%2==0){
               pares+=n4;
            } else if (n4%2!=0) {
                impares=n4+impares;
            }
        }
        System.out.println("La suma de los pares es: " +pares);
        System.out.println("La suma de los impares es: " +impares);
    }
}