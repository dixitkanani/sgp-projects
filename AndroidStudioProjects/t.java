package logic;

import java.util.Scanner;

public class t {
        public static String[] a1=new String[36];
        public static String[] a2=new String[36];
        public static String[] a3=new String[36];
        public static final int[] q=new int[36];
        public static int[] p1=new int[36];
        public static int[] p0=new int[36];
        public static int[] z =new int[36];
        public static String[] p2=new String[36];
        public static int x, y, z1, p,xx=0,xy=0;

    public static boolean n;
        public static void input() {
            Scanner s = new Scanner(System.in);
            Scanner t1 = new Scanner(System.in);
            //x=onday y=no of letcher pr day z=no of faclty z1= no of sub p=no of room q=credits
            System.out.println("enter study day pr week");
            x = s.nextByte();
            System.out.println("enter let pr day");
            y = s.nextInt();
            System.out.println("no of batches");
            p = s.nextInt();
            for (int i = 0; i < p; i++) {
                p0[i] = i;
                p2[i] = "BATCH" + Integer.toString(p0[i]+1);
            }




            System.out.println("enter no of sub");
            z1 = s.nextInt();

            for (int i = 0; i < z1; i++) {
                System.out.println("enter s name");
                a2[i] = t1.nextLine();
                System.out.println("enter no of faculty ");
                z[i]= s.nextInt();
                for (int j=0; j < z[i]; j++) {
                    System.out.println("enter faculty name of "+a2[i]);
                    a1[xy] = t1.nextLine();
                    System.out.println("enter credit of "+a1[xy]);
                    q[xy] = s.nextInt();
                    xx+=q[xy];
                    a3[xy]=a2[i];
                    xy++;

                }
            } System.out.println(xx);

        }
        public static void main(String[] args) {
            logic l=new logic();
            input();
            l.tgl();
//            if(n==false)
            l.ttt();
//            else {
//                System.out.println("invalid");
//            }
        }
}