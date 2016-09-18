import java.io.FileNotFoundException;
import java.net.URISyntaxException;

/**
 * Created by Elizaveta Naimark on 12.09.2016.
 */

/*Нужно перехватить NullPointerException и FileNotFoundException, но не перехватывать
        ArithmeticException и URISyntaxException. Как это сделать?
        */
public class ExceptionPractice1 {
    public static void main(String[] args) throws URISyntaxException, ArithmeticException {
        try {
            method1();
        } catch (NullPointerException | FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException
    {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new NullPointerException();
        if (i == 1)
            throw new ArithmeticException();
        if (i == 2)
            throw new FileNotFoundException();
        if (i == 3)
            throw new URISyntaxException("", "");
    }

}
