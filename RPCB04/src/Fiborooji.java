
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Fiborooji {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(String vec[]) {
        ArrayList<Integer> secuencia = new ArrayList();
        int n1, n2;
        n1 = Integer.parseInt(vec[0]);
        n2 = Integer.parseInt(vec[1]);
        secuencia.add(n1);
        secuencia.add(n2);
        int i = 0;
        int op = 0;
        String cambio;
        int ult = 0;
        boolean start = false;
        while (start != true) {
            op = secuencia.get(i) + secuencia.get(i + 1);
            cambio = Integer.toString(op);
            ult = Integer.parseInt(String.valueOf(cambio.charAt(cambio.length() - 1)));

            if (secuencia.get(i + 1) == n1 && ult == n2) {
                secuencia.add(ult);
                start = true;
            } else {
                secuencia.add(ult);
            }
            i++;
        }

        System.out.println(secuencia.size());
    }

    public static void pc2Read() {
        String vec[], line = "";
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();
            vec = line.split(" ");
            process(vec);
            buffer.close();
        } catch (NullPointerException | IOException e) {
        }
    }

}
