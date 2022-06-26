
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caterpillar {

    public static void main(String[] args) {
        pc2Read();
    }

    public static int processX(String vec[], int x) {
        int s = Integer.parseInt(vec[0]);
        int w = Integer.parseInt(vec[1]);

        x = (s - x + w);
        return x;
    }

    public static int processY(String vec[], int y) {
        int h = Integer.parseInt(vec[2]);
        y = (h + h);
        return y;
    }

    public static void pc2Read() {
        String nr[], line = "", vec[];
        int n, x = 0, y = 0;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
            line = buffer.readLine();

            nr = line.split(" ");
            n = Integer.parseInt(nr[0]);
            vec = new String[n];
            for (int i = 0; i < n; i++) {
                line = buffer.readLine();
                vec = line.split(" ");
                x += processX(vec, x);
                y += processY(vec, y);
            }
            
            buffer.close();
            System.out.println(x + y + (100 - x));

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
