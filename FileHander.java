import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileHander {
    public static int n;
    public static int k;
    public static int num;

    public void read()
    {
        try(InputStream i = new FileInputStream("input.txt")) {
            String [] temp = new String(i.readAllBytes()).split("\s|\r\n");
            n = Integer.parseInt(temp[0]);
            k = Integer.parseInt(temp[1]);
            num = Integer.parseInt(temp[2]);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public void write(int i)
    {
        try(OutputStream o = new FileOutputStream("output.txt"))
        {
            o.write(String.valueOf(i).getBytes());
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
