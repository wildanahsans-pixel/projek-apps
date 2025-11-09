package oop4;

import java.util.Scanner;

public class CODELAND{
  public static int luas(int n,int k){
      return n*k;
  }
  
  public static int keliling(int n,int k){
      return 2*n+2*k;
  }
  
  
  public static void main(String[]args){
      Scanner input = new Scanner(System.in);{
      int n;
      int k = 0;
     
      if(n<=0){
      System.out.println("Masukkan lebar : ");
       n = input.nextInt();
      }else {
          System.out.println("Input tidak valid");
      }
      if(k<=0){
      System.out.println("Masukkan panjang : ");
      k = input.nextInt();
      }else {
          System.out.println("Input tidak valid");
      }
     
     System.out.println("Luas : "+ luas(n, k));
         System.out.println("Keliling : "+ keliling(n, k));
     
          
      } 
  }
}