package Converter;

import java.util.List;

public class ConverterArray implements IListConverter {

    @Override
    public String listToString(List<String> list) {
        String s = "";

        String[] strArr = new String[list.size()];
        strArr = list.toArray(strArr);

        for(int i = 0;i < list.size();i++){
            s = s + strArr[i];
            if(i % 2 == 0){
                s = s + "\n";
            }
        }
        return s;
    }

}
