package Converter;

import java.util.Iterator;
import java.util.List;

public class ConverterIterator implements IListConverter {

    @Override
    public String listToString(List<String> list) {
        Iterator<String> it = list.iterator();
        String r = "";
        while(it.hasNext()){
            r = r + it.next();
            r = r + "\n";
        }

        return r;
    }
    
}
