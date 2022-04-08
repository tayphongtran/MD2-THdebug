package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromData {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("//input.txt");
        Scanner scanner = new Scanner(file);
        if (scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }
}
