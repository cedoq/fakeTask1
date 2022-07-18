import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Objects;

public class Main {
    /*
    Написать программу, которая будет суммировать числа,
     которые вводит пользователь, до тех пор,
      пока пользователь не введет слово стоп.
    После слова стоп, напечатать сумму в консоль.


     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("простой суммарный калькулятор. Вводишь число - оно суммируется с теми что ты ввел ранее");
        System.out.println("после каждого числа нажимайте ENTER");
        System.out.println("после слова 'стоп' программа остановится и ты увидишь сумму");
        int sum = 0;
        String line;
        while(true) {
            line = br.readLine();
            if(Objects.equals(line,"стоп")){
                System.out.println("sum: " + sum);
                break;
            }
            else{
                sum = sum + Integer.parseInt(line);
            }
        }

    }
}