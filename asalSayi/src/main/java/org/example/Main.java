package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        boolean asal;
        for(int i=2; i<=100; i++){
            asal = true;
            for(int k=2; k<i; k++){
                if(i%k==0){
                    asal = false;
                    break;
                }
            }
            if(asal){
                System.out.print(i + " ");
            }
        }
    }


}