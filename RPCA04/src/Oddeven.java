
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Oddeven {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(String vec) {
        int contador = 0;
        char caracter = 0;
        LinkedHashMap<Character, Integer> m = new LinkedHashMap();
        for (char c : vec.toCharArray()) {
            m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
        }

//        m.forEach((c, v) -> {
//            System.out.println("La letra " + c + " tiene " + v + " letras");
//        });
        boolean odd = false;
        boolean even = false;
        for (Map.Entry<Character, Integer> pair : m.entrySet()) {
            if (pair.getValue() % 2 == 0) {
                even = true;
            }
            if (pair.getValue() % 2 != 0) {
                odd = true;
            }
//            System.out.format("key: %s, value: %d%n", pair.getKey(), pair.getValue());
        }

        
        if (even == true && odd == true) {
            System.out.println("0/1");
        } else if (even == true){
            System.out.println(0);
        } else if (odd == true ) {
            System.out.println(1);
        }

    }

    public static void pc2Read() {
        String vec;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            vec = buffer.readLine();
            process(vec);
            buffer.close();
        } catch (NullPointerException | IOException e) {
        }
    }
}
