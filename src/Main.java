import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(result("file.txt"));

    }
    /*
    Есть не пустой текстовый файл такого вида:
    1
    2
    3
    4
    5
    Написать метод, возвращаюший среднее арифметическое всех этих чисел.
     */
    public static int result (String file){
        int number = 0;
        List<Integer> res = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            int num = 0;
            String counter = " ";

            while((counter=br.readLine())!=null){
                num=Integer.parseInt(counter);
                res.add(num);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        for (int i=0;i<res.size();i++){
            number+= res.get(i);
        }
        number=number/res.size();
        return number;
    }
}