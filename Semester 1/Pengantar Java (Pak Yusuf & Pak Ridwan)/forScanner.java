import java.util.*;
/**
  Nama  : Taufik Hidayat
  NIM   : 301200032
  Prodi : Teknik Informatika
*/
 // Compiler version JDK 11.0.2

 class forScanner
 {
   public static void main(String args[])
   { 
    Scanner inp = new Scanner(System.in);
    int i = 1;
    int x = 2;
    System.out.print("Masukkan jumlah perulangan : ");
    int j = inp.nextInt();
    System.out.println("\nGanjil");
    for(int a = 1;a<=j;a++){
      System.out.print(i+" ");
      i+=2;
    }
    System.out.println("\nGenap");
    for(int b = 1;b<=j;b++){
      System.out.print(x+" ");
      x+=2;
    }
   }
 }
