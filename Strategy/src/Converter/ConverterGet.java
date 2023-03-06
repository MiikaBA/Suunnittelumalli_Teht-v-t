package Converter;

import java.util.List;

public class ConverterGet implements IListConverter {

    @Override
    public String listToString(List<String> list) {
        String a = "";

        for(int i = 0;i<list.size();i++){
            a = a + list.get(i);

            if(i % 3 == 0){
                a = a + "\n";
            }
        }

        return a;
    }
    
}
