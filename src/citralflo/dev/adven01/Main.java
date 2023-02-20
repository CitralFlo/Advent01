package citralflo.dev.adven01;

import java.io.*;

public class Main {
    public static int[] kcal = new int[255];

    public static void main(String[] args) {

        File file = new File("C:\\Users\\wojta\\IdeaProjects\\Advent01\\src\\input.txt");

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String st = null;


        int i = 0;
        while (true) {
            try {
                if ((st = br.readLine()) == null) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (st.isEmpty()) i++;
            else{
                kcal[i] = kcal[i] + Integer.parseInt(st);
            }

        }

        System.out.println("zczytywanie zakonczono, podaje i: " + i );

        int max, max2 , max3 ;
        max = findMax( 0, 0);
        max2 = findMax( max, 0);
        max3 = findMax( max, max2);
    }

    public static int findMax( int max1, int max2) {
        int max = 0;
        int number_elf =0;

            for (int k = 0; k <= kcal.length - 1; k++) {
                if (k != max1 && k != max2) {
                    if (kcal[k] >= max) {
                        //    System.out.println(kcal[k]);
                        max = kcal[k];
                        number_elf = k;
                    }
                }
            }
            System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);
        return number_elf;
        }
    }