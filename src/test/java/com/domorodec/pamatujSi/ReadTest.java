package com.domorodec.pamatujSi;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadTest {
    String s;
    String[] temp;
    List<String> collection = new ArrayList<>();
    public static final Scanner scanner = new Scanner(System.in);

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Tisk na zacatku tridy");
    }


    @Test
    public void readFile() {
        try (
                BufferedReader br = new BufferedReader(new
                        FileReader("C:\\Users\\PC\\projects\\pamatujSi\\pamatujSi\\src\\test\\java\\com\\domorodec\\pamatujSi\\readtest.txt"))) {

            while ((s = br.readLine()) != null) {
                    temp = s.split("[^a-zA-Zěščřžýáíéůúň]+");
                    if (temp.length > 0) {
                        for (String s: temp) {
                            collection.add(s);
                        }
                    }
                }



                for(int i=0;i<collection.size();i++) {
                    if (!collection.get(i).isEmpty()) {
                        System.out.println(collection.get(i));
                        }
                    }


        } catch (
                IOException vyj) {
            System.out.println("Error during reading file: " + vyj);
        }
    }
}