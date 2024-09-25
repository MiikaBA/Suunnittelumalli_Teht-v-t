package Main;

import Printers.IPrinter;
import Printers.BasicPrinter;
import Printers.EncryptedPrinter;
import Printers.FilePrinter;

public class Main {
    public static void main(String[] args) {
    	/*
        // Basic printer - prints to console
        IPrinter basicPrinter = new BasicPrinter();
        basicPrinter.print("Hello World!");

        // File printer - prints to both file and console
        IPrinter filePrinter = new FilePrinter(new BasicPrinter());
        filePrinter.print("Hello File!");

        // Encrypted printer - encrypts and prints to console
        IPrinter encryptedPrinter = new EncryptedPrinter(new BasicPrinter());
        encryptedPrinter.print("Hello Encrypted!");

        // Encrypted + File printer - encrypts and prints to file
        IPrinter encryptedFilePrinter = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
        encryptedFilePrinter.print("Hello Encrypted File!");
        */
    	
    	//Basic printer prints to console.
    	IPrinter printer = new BasicPrinter();
    	printer.print("Hello World!");
    	
    	IPrinter printer2 = new EncryptedPrinter(new FilePrinter(new BasicPrinter()));
    	printer2.print("Hello World!");
    }
}
