package framework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class ParserCsv {

    public static Iterator<Object[]> loadDataFromFile() {
        List<Object[]> list = new ArrayList<Object[]>();
        String filePath = new File("src/main/resources/Data.csv").getAbsolutePath();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            reader.read();
            String line = reader.readLine();

            while (line != null) {
                //String[] params = line.split(",");
                //list.add(new Object[]{params[0],params[1]});
                String params = line;
                list.add(new Object[]{params});
                line = reader.readLine();
            }
        } catch (Exception e) {
        }
        return list.iterator();
    }
}
