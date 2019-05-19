import java.io.IOException;
import java.util.*;
import java.io.*;

public class read {
    public static void main(String[] args) throws FileNotFoundException, IOException  { //static tähistab seda, et ei pea uut objekti looma 
        //new Program().main() - ilma static
        //Program.main() - static

        Scanner scanner = null;
        //kui scanner ei leia faili, siis toimib "printStackTrace"
        try {
            scanner = new Scanner(new File("C:\\Users\\raitv\\Desktop\\artiklikogumik.txt"));
        } catch (FileNotFoundException scannererror) { //saab muuta "scannererrori" nime
            scannererror.printStackTrace();
        }
        Map<String, Integer> map = new HashMap<String, Integer>();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList(map.entrySet());

        //muutuja i = 0, i ei oma tähtsust, järgmine rida kontroll, kas see on väiksem, kui tingimus on True,
        //siis koodiplokk läheb tööle, i++ väärtus suureneb ja läheb uuesti tööle, sp. ,et map size on suur NR.
        for (int i = 0; i < map.size(); i++) {
            System.out.println(entries.get(entries.size() - i - 1).getKey().toLowerCase()
                    + " " + entries.get(entries.size() - i - 1).getValue());
        }
    }

    }









