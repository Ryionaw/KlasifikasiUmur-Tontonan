package net.ryanaw.programku;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

        public static void main(String[]args) {

            Scanner inputUser = new Scanner(System.in);
            Calendar kalender = Calendar.getInstance();
            int tahunSekarang = kalender.get(Calendar.YEAR);
            System.out.println("Masukkan Nama Anda: ");

            String nama = inputUser.nextLine();
            System.out.println("Masukkan Tahun Lahir anda ");

            int tahunLahir = inputUser.nextInt();

            int umur = tahunSekarang - tahunLahir;

            if(umur<13 )
            {
                System.out.println(nama +", anda berusia " + umur + " ,dapat menonton film dengan klasifikasi SU");
            }
            else if(umur>=13 && umur<17)
            {
                System.out.println(nama +", anda berusia " + umur + " ,dapat menonton film dengan klasifikasi SU,+13");
            }
            else if(umur>=17 && umur<21)
            {
                System.out.println(nama +", anda berusia " + umur + " ,dapat menonton film dengan klasifikasi SU,+13,+17");
            }
            else if (umur>21)
            {
                System.out.println(nama +", anda berusia " + umur + " ,dapat menonton film dengan klasifikasi SU,+13,+17,+21");
            }

        }
    }


