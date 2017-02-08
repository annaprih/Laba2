package by.belstu.it.prykhach.basejava;


import java.util.Scanner;

import static java.lang.Math.*;

/**
 * Created by Anna on 04.02.2017.
 */
public class JavaTest {
    static int sint;
    public final int TEMPCONST1 = 5;
    final int TEMPCONST2 = 8;
    public static final int TEMPCONST = 2;

    public static void main(String[] args) {
        Boolean tempB = true;
        Integer tempI = 12;
        Integer tempI_1 = 15;
        System.out.println(tempI + " " + tempI_1);
        tempI = tempI_1;
        tempI_1 = 7;
        System.out.println(tempI.toString() + " " + tempI_1);
        Character tempC = 'p';
        Byte tempBt = -24;
        Short tempS = 1452;
        Long tempL = 15436464646l;
        Double tempD = 12.36;


        char tempChar1 = '\u0061', tempChar2 = 97, tempChar = 'a';
        int  tempInt2, tempInt = 128;
        boolean tempBoolean1, tempBoolean2 = true, tempBoolean3 = false;
        byte  tempByte2, tempByte = 5;
        short tempShort = 148;
        long tempLong2, tempLong = 1516510623, tempLong1 = 9223372036854775807l, tempLong3 = 0x7fff_ffff_ffffl;
        String tempString = "Java";
        double tempDouble = 5.48;


         System.out.println(tempString + tempInt);
         System.out.println(tempString + tempChar);
         System.out.println(tempString + tempDouble);
         

        tempByte2 = (byte) (tempByte + tempInt);
        System.out.println(tempByte2);
         
        tempInt2 = (int) (tempDouble + tempLong);
        System.out.println(tempInt2);
         
        tempLong2 =(long)tempInt + 2147483647l;
        System.out.println(tempLong2);

         System.out.println(sint);
         tempBoolean1 = tempBoolean2&&tempBoolean3;
         System.out.println(tempBoolean1);
         tempBoolean1 = tempBoolean2^tempBoolean3;
         System.out.println(tempBoolean1);
        //tempBoolean1 = tempBoolean2+tempBoolean3;

         System.out.println(tempChar1);
         System.out.println(tempChar2);
         System.out.println(tempChar);
         System.out.println(tempChar1 + tempChar2 + tempChar);



         System.out.println(3.45 % 2.4);
         System.out.println(1.0/0.0);
         System.out.println(log( -345));
         System.out.println(0.0/0.0);
         System.out.println(Float.intBitsToFloat(0x7F800000));
         System.out.println(Float.intBitsToFloat(0xFF800000));


        System.out.println(PI);
        System.out.println(E);
        System.out.println(round(PI));
        System.out.println(round(E));
        System.out.println(min(PI, E));
        System.out.println(random());


        System.out.println(tempBt>>>4);
        System.out.println(tempI>>2);
        System.out.println(~tempI_1);
        System.out.println(tempC&tempL);
        System.out.println(tempS*tempBt);
        System.out.println(tempL+tempI);
        System.out.println(tempL-tempI);

        System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " " + Double.MAX_VALUE);
        Integer tempI_2 = 12; //упаковка
        Byte tempBt_1 = 24;
        tempInt2 = tempI; //распаковка
        tempByte = tempBt;

        int a = Integer.parseInt("123");
        String a1 = Integer.toHexString(5);
        int a2 = Integer.compare(7, 8);
        String a3 = tempI_2.toString();
        int a4 = Integer.bitCount(22);

        String s34 = "2345";
        int s = Integer.valueOf(s34);
        int s1 = Integer.parseInt(s34);

        byte [] mas = "Hello".getBytes();
        String str = new String(mas);
        String str1 = "true";
        boolean bool = Boolean.parseBoolean(str1);
        boolean bool1 = Boolean.valueOf(str1);

        String str2 = "true";
        System.out.println(str1==str2); //возвращают тру или фолс
        System.out.println(str1.equals(str2));
        System.out.println(str1.compareTo(str2)); // возвращает -1/0/1
        str2 = null;
        System.out.println(str1==str2); //возвращают тру или фолс
        System.out.println(str1.equals(str2));
        //System.out.println(str1.compareTo(str2)); // возвращает -1/0/1

        String string = "I Love Java";
        String [] strMas = string.split(" ");
        boolean str6 = string.contains("Lov");
        System.out.println(string.hashCode());
        System.out.println(string.indexOf('L'));
        System.out.println(string.length());
        System.out.println(string.replace('L', 'l'));


        char [][] c1;
        char [] c2[] = {
                {'a','a'},
                {'b', 'b'},
                {'c', 'c'}
        };

        char c3[][]= {
                {'a','a'},
                {'b', 'b'},
                {'c', 'c'}
        };

        c1 = new char[3][];
        c1[0] =  new char [1];
        c1[1] =  new char [2];
        c1[2] =  new char [3];
        System.out.println(c1.length);
        System.out.println(c1[0].length);
        System.out.println(c1[1].length);
        System.out.println(c1[2].length);
        System.out.println(c2==c3);

        for (char [] i: c2) {
            for (char j: i) {

                System.out.print(j + " ");
            }
            System.out.println();
        }
        int c;
        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        System.out.println(c);






























    }
}
