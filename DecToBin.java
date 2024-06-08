import java.io.*;
public class DecToBin{
    static void binary(int n){
    int[] bin = new int[100];
    int i=0;
    while(n>0){
        bin[i]=n%2;
        n=n/2;
        i++;
    }
    for(int j=i-1;j>=0;j--){
        System.out.print(bin[j]);
    }
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        int n=10;
        binary(n);
    }  
}