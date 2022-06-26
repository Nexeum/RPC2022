
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Soccer {

    public static void main(String[] args) {
        pc2Read();
    }

    public static void process(String vec[]) {
        ArrayList<Integer> datos = new ArrayList();
        datos.add(Integer.parseInt(vec[0]));
        datos.add(Integer.parseInt(vec[1]));
        datos.add(Integer.parseInt(vec[2]));
        datos.add(Integer.parseInt(vec[3]));
        datos.add(Integer.parseInt(vec[4]));

        try {
            Collections.sort(datos);
            int w = 0;
            int d = 0;

            boolean composicion = false;
            int i = 0;
            int formPoint;
            int point = 0;
            int j = 4;
            int possible = 0;
            while (composicion == false) {
                w = datos.get((int) (Math.random() * 3));
                d = datos.get((int) (Math.random() * 3));
                formPoint = (w * 3) + d;
                possible = datos.get(j);
                if (formPoint == possible) {
                    datos.remove(datos.indexOf(w));
                    datos.remove(datos.indexOf(d));
                    point = possible;
                    datos.remove(datos.indexOf(possible));
                    composicion = true;
                }

                if (j == 4) {
                    j = 0;
                } else {
                    j++;
                }

                if (i == 4) {
                    i = 0;
                } else {
                    i++;
                }
            }

            int MP = 0;
            int l = 0;
            if (datos.get(0) > datos.get(1)) {
                MP = datos.get(0);
                datos.remove(datos.indexOf(MP));
                l = datos.get(1);
                datos.remove(datos.indexOf(l));
            } else {
                MP = datos.get(1);
                datos.remove(datos.indexOf(MP));
                l = datos.get(0);
                datos.remove(datos.indexOf(l));
            }
            datos.add(MP);
            datos.add(w);
            datos.add(d);
            datos.add(l);
            datos.add(point);
            for (int k = 0; k < datos.size(); k++) {
                System.out.print(datos.get(k) + " ");
            }
            System.out.println();
        } catch  (NullPointerException e){

        }

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
