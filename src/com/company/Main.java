package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\wojta\\Desktop\\SKRYPTY\\studia\\Advent01.1\\src\\input.txt");

        int kcal[] = new int[255];
        int j;

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
                if (!((st = br.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.println(st);
            if (st.isEmpty()) i++;
            else{
                kcal[i] = kcal[i] + Integer.parseInt(st);
            }

        }

        System.out.println("zczytywanie zakonczono, podaje i: " + i );

        int max = 0;
        int number_elf = 0;
        for(int k = 0; k <= 254 ; k++)
        {

            if( kcal[k] >= max )
            {
            //    System.out.println(kcal[k]);
                max = kcal[k];
                number_elf = k;
            }
        }
        System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);

        max = 0;
        number_elf = 0;
        for(int k = 0; k <= 254 ; k++)
        {
            if(k != 34) {
                if (kcal[k] >= max) {
                //    System.out.println(kcal[k]);
                    max = kcal[k];
                    number_elf = k;
                }
            }
        }
        System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);

        max = 0;
        number_elf = 0;
        for(int k = 0; k <= 254 ; k++)
        {
            if(k != 224 && k !=34) {
                if (kcal[k] >= max) {
                //    System.out.println(kcal[k]);
                    max = kcal[k];
                    number_elf = k;
                }
            }
        }
        System.out.println("Ilosc kcal  " + max + "  numer elfa: " + number_elf);
    }
}
