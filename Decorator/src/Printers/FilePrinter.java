package Printers;

import java.io.FileWriter;
import java.io.IOException;

public class FilePrinter implements IPrinter {
    private IPrinter wrappedPrinter;

    public FilePrinter(IPrinter printer) {
        this.wrappedPrinter = printer;
    }

    @Override
    public void print(String message) {
        // Print to file
        try (FileWriter fileWriter = new FileWriter("output.txt", true)) {
            fileWriter.write(message + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Optionally, you can also print to console via wrapped printer
        wrappedPrinter.print(message);
    }
}

