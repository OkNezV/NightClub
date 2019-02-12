package data;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum Person {

    KATE("Катя", new String[]{"hip hop", "electro dance"}),
    LENA("Лена", new String[]{"танцы под поп-музыку"}),
    MICHAEL("Миша", new String[]{"electro dance"}),
    MAX("Максим", new String[]{"танцы под поп-музыку", "RnB"}),
    ALEX("Саша", new String[]{});

    String name;
    String [] dancing;

    public static List getArrayAsList(String [] dancing){
        return Arrays.asList(dancing);
    }
}