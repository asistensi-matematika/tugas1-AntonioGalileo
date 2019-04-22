package javaapplication2;

import java.util.Scanner;

public class Praktikum {

public static void main(String[] args) {

double a,b,c;

double d,e,f,g,x1,x2;

Scanner input = new Scanner(System.in);

System.out.println("Nilai a: ");

a = input.nextInt();

System.out.println("Nilai b: ");

b = input.nextInt();

System.out.println("Nilai c: ");

c = input.nextInt();

if(a==0){

System.out.println("Nilai a tidak boleh 0");

} else {

d = Math.pow(b,2)-(4*a*c);

e = b/(4*a);

f = -d/(4*a);

g = f;

x1 = (-b+(Math.sqrt(d)))/(2*a);

x2 = (-b-(Math.sqrt(d)))/(2*a);

System.out.println("Persamaan polinomial " +a+"x^2 + "+b+ "x + "+c+" memiliki");

System.out.println("Nilai Diskriminan: "+d);

System.out.println("Nilai akar-akar persamaan adalah: "+x1+ " dan " +x2);

System.out.println("Titik stasioner: "+e+ " dan " +f);

if(a>0){

System.out.println("Cekung Atas");

}else if(a<0){

System.out.println("Cekung Bawah");

}

System.out.println("Nilai minimum lokal: "+g);

}

}

}

