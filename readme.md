# TUGAS 1 ASISTENSI ALPRO - Jumat, 12 April 2019
NAMA: ANTONIO GALILEO TANDO
NRP: 06111840000071

## DESKRIPSI SOAL
Input : Koefisien $a,b,c$ dari polinomial $P_2(x)=ax^2+bx+c$ dimana $a\neq0$.

Output :

Diskriminan
Akar-akar dari polinomial
Titik stasioner
Kecekungan Kurva
Nilai maksimum/minimum lokal

## METODE PENYELESAIAN
Diberikan suatu polinomial berderajat dua $P_2(x)$, dimana:

$P_2(x)=ax^2+bx+c$, dimana $a\neq0$; dan

Cara mencari akar-akar polinomial berderajat 2 secara eksak (exact value), $P_2(x)$ adalah dengan mencari nilai $x$ yang menyebabkan $P_2(x)=0$. Hal ini sudah diperlajari pada jenjang sekolah dahulu dengan menggunakan formula :

$x_{12}=\dfrac{-b\,\pm\,\sqrt{D}}{2a}$

dimana $D$ menyatakan diskriminan, dengan $D=b^2-4ac$.

Kemudian, dari polinomial tersebut didapat turunan pertama terhadap $x$ yaitu $P'_2(x)=2ax+b$. Untuk mencari titik stasioner dari kurva tersebut dicari suatu garis lurus dengan gradien yang sejajar sumbu $x$. Dengan kata lain

$m=P'_2(x)=0$.

Artinya, $x=-\dfrac{b}{2a}$ disebut absis titik stasioner dari $P_2(x)$. Lalu, untuk ordinat titik stasioner diberikan oleh

$P_2(-\frac{b}{2a})=a(-\frac{b}{2a})^2+b(-\frac{b}{2a})+c=-\dfrac{b^2-4ac}{4a}=-\dfrac{D}{4a}$.

Sehingga, titik stasioner yang didapat adalah $(\frac{-b}{2a},-\frac{D}{4a})$.

Untuk mengecek kecekungan kurva, perlu dicari nilai dari turunan kedua $P''_2(x)=2a$. Bila $a&gt;0$, maka kurva cekung ke atas (membuka ke atas). Bila $a&lt;0$, maka kurva cekung ke bawah (membuka ke bawah).

Penentuan nilai maksimum / minimum lokal didapat dari nilai stasioner.

## SOURCE CODE
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

Output :

Diskriminan
Akar-akar dari polinomial
Titik stasioner
Kecekungan Kurva
Nilai maksimum/minimum lokal


## input yang harus di run:
~~~~
Input : -2 3 0

Output :
Polinomial -2x^2 + 3x memiliki
1. Diskriminan               : 9.0
2. Akar-akar dari polinomial : -0.0 dan 1.5
3. Titik stasioner           : -0.375 dan 1.125
4. Kecekungan Kurva          : Bawah
5. Nilai minimum lokal       : 1.125

Input :1 -2 1

Output :
Polinomial x^2 -2x +x memiliki
1. Diskriminan               : 0.0
2. Akar-akar dari polinomial :1.0 dan 1.0
3. Titik stasioner           : -0.5 dan -0.0
4. Kecekungan Kurva          : Atas
5. Nilai minimum lokal       : -0.0

Input : -3 0 -3

Output :
Polinomial -3x^2 - 3 memiliki
1. Diskriminan               : -36.0
2. Akar-akar dari polinomial : NaN dan NaN
3. Titik stasioner           :  -0.0 dan 3.0
4. Kecekungan Kurva          : Bawah
5. Nilai minimum lokal       : -3.0

Input : 0 0 0

Output :
Nilai a tidak boleh 0
~~~~
![Screenshot (12)](https://user-images.githubusercontent.com/49533248/56495799-0b55a880-6521-11e9-9f1c-82a7471811d4.png)
![Screenshot (13)](https://user-images.githubusercontent.com/49533248/56495810-1577a700-6521-11e9-8bbd-ca1ee0b9a7f0.png)
![Screenshot (14)](https://user-images.githubusercontent.com/49533248/56495818-190b2e00-6521-11e9-9e2a-23c2bfe9205a.png)
![Screenshot (15)](https://user-images.githubusercontent.com/49533248/56495823-1c9eb500-6521-11e9-96e9-296592338142.png)


[link ke laporan]
