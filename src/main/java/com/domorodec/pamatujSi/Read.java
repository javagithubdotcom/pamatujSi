package com.domorodec.pamatujSi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Read {
    static long timeStart;
    String s;
    List<String> collection = new ArrayList<>();
    String[] text;

    public static final Scanner scanner = new Scanner(System.in);

    public void readFile() {

        Random random = new Random();

        try (BufferedReader br = new BufferedReader(new
                FileReader(/*"C:\\Users\\PC\\projects\\javaProject1\\src\\com\\domorodec\\read.txt"*/"C:\\Users\\PC\\projects\\pamatujSi\\pamatujSi\\src\\main\\java\\com\\domorodec\\pamatujSi\\read.txt"))) {

            while ((s = br.readLine()) != null) {
                text = s.split("[^a-zA-Zěščřžýáíéůúň]+");
                if (text.length > 0) {
                    for (String s : text) {
                        collection.add(s);
                    }
                }
            }
            boolean smycka = true;
            boolean smycka1;

            //while (!smycka) {
            do {
                smycka1 = true;
                System.out.println("Zadej pocet slov pro zapamatovani. Maximalne " + collection.size());
                if (!scanner.hasNextInt()) {
                    scanner.nextLine();
                    System.out.println("Nezadali jste cislo. Znovu..");
                    //scanner.nextLine();
                    smycka1 = false;
                }

                // }
                while (smycka1) {
                    smycka = false;
                    int slova = scanner.nextInt();
                    if (slova <= collection.size()) {
                        System.out.println("Zapamatujte si nasledujici slova:");
                        System.out.println("---------------------------------");
                        timeStart = System.currentTimeMillis();
                        for (int i = 0; i < slova; i++) {
                            int n = random.nextInt(collection.size() - 1) + 1;
                            if (!collection.get(n).isEmpty()) {
                                System.out.println(collection.get(n));
                                String item = collection.get(n);
                                //new CompareIt().ulozPole(item);
                                CompareIt.ulozPole(item);
                            }


                        }
                        smycka1 = false;


                    } else {
                        System.out.println("Zadali jste prilis velke cislo. Znovu.");
                        smycka = true;
                        smycka1 = false;
                    }

                    //  break;


                }
            } while (smycka);


        } catch (IOException vyj) {
            System.out.println("Error during reading file: " + vyj);
        } finally {
            //scanner.close();
            //metoda pro casovac
            //metoda pro porovnani vstupu z klavesnice s vybranymi slovy
        }


    }
}
