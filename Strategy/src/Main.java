import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Converter.ConverterArray;
import Converter.ConverterGet;
import Converter.ConverterIterator;
import Converter.IListConverter;

public class Main{
    public static void main(String[] args) {
        
        List<String> lista = new ArrayList<>();
        lista.add("Mammas");
        lista.add("Pappas");
        lista.add("Mummos");
        lista.add("Veljes");
        lista.add("Siskos");

        IListConverter iteeraus = new ConverterIterator();
        System.out.println(iteeraus.listToString(lista));
        
        IListConverter taulukko = new ConverterArray();
        System.out.println(taulukko.listToString(lista));

        IListConverter get = new ConverterGet();
        System.out.println(get.listToString(lista));
    }
}
