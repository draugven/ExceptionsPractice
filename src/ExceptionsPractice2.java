import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Elizaveta Naimark on 12.09.2016.
 */
public class ExceptionsPractice2 {


    //1) Перехватить все необходимые эксепшены и вывести их стектрейс
    //2) Определить свой класс исключений и выбросить такое исключение в том случае, когда в программу не передали имя файла (т.е. args - пустой массив).
    // Исключение должно содержать описание ошибки.
    //3) Закрытие входного потока должно происходить в любом случае
    //4) Выделить методы checkArguments, openFile и readFromFile и вывести сообщение в том случае, если был выброшен эксепшен (стектрейсы из 1 задания нужно будет убрать)

    public static void main(String[] args) {
        String thisLine;
        ArrayList list = new ArrayList();
        BufferedReader fin = null;

        fin = new BufferedReader(new InputStreamReader(
                new FileInputStream(args[0])));
        while ((thisLine = fin.readLine()) != null) {
            System.out.println("Line " + thisLine);
            list.add(thisLine);
        }
        fin.close();
    }

}
