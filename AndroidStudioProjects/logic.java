package logic;

public class logic extends t {
    public static String[][][] t = new String[8][8][8];//student
    public static String[][][] tt = new String[8][8][8];//t
    public static int xyz;

    public void tgl() {
        if (x * y >= xx) {

            for (int i1 = 0; i1 < p; i1++) {
                xyz = 0;
                for (int n = 0; n < xy; n++) {
                    p1[n] = q[n];
                    for (int i = 0; i < y; i++) {
                        for (int j = 0; j < x; j++) {
                            if (p1[n] > 0) {
                                if (tt[n][i][j] == null && t[i1][i][j] == null ) {

                                    tt[n][i][j] = p2[i1];

                                    t[i1][i][j] = a3[n]+" "+a1[n];
                                    xyz++;
                                    p1[n]--;
                                }
                            }
                        }
                    }
                }

                if (xyz == xx) {
                } else {
                    n=true;
                    System.out.println(n);
                }
            }System.out.println(xyz);
        }
    }


    static void ttt() {
        if (x * y >= xx) {
            for (int x1 = 0; x1 < p; x1++) {
                System.out.println("Batch"+(x1+1));
                for (int i = 0; i < y; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print(t[x1][i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            System.out.println("----------------------------------------");
            System.out.println();
            for (int x1 = 0; x1 < xy; x1++) {
                System.out.println("time table of "+a1[x1]);
                for (int i = 0; i < y; i++) {
                    for (int j = 0; j < x; j++) {
                        System.out.print(tt[x1][i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }

        }
    }
}

