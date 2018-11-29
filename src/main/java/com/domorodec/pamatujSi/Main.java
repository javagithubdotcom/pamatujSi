/**
 * <h1>Pamatuj Si</h1>
 * <br>
 * Program pro načtení obsahu v souboru read.txt a zobrazení náhodného počtu slovíček
 * pro zapamatování. Jedná se o procvičení paměti.
 * Program je intuitivní a není nutné nějaké další vysvětlování
 *<br>
 *<br>
 * @author Martin Fabián
 * @version 1.0
 * @since 27.11.2018
 *
 *
 */




package com.domorodec.pamatujSi;

public class Main {

       public static void main(String[] args) {

        Read rd = new Read();
        System.out.println("***************************************************************");
        System.out.println("**************Vitejte v programu na pamatovani slov************");
        System.out.println("*******************Verze 1.0.***********************************");
        System.out.println("***************************************************************");
        System.out.println("\n");

           /**
            * Odkaz na metodu readFile() ve třídě Read, která provede načtení
            * obsahu souboru a také dotaz na zadání počtu slov pro zapamatování
            */
        rd.readFile();

        System.out.println("|--------------------------------------|");
        System.out.println("Pokud jste pripraveni, stisknete ENTER.");
        System.out.println("|--------------------------------------|");

        try
        {
            int a = System.in.read(new byte[2]);//cist pouze 2 bajty pro \r a \n vyloucit dalsi znak
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        for(int i = 0; i < 10; i++){
            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * ");
            for(int j = 0; j < 1; j++){
                System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
            }
        }



        System.out.println("Zacnete psat slova, ktera jste si zapamatovali:");

        CompareIt.porovnej();
        System.out.println("|--------------------------------------|");
        System.out.println("Puvodni hodnty byly:");
        System.out.println("Doba trvani = " + (-((Read.timeStart - CompareIt.stopTime)/1000))+" sekund/y" );
        System.out.println("|--------------------------------------|");
        CompareIt.tiskPole();

        System.out.println("\n");
        System.out.println("***************************************************************");
        System.out.println("**************Nashledanou priste*******************************");
        System.out.println("*******************Verze 1.0.***********************************");
        System.out.println("***************************************************************");

    }

}
