import java.io.IOException;
import java.util.Scanner;
public class ReadTest{
    public static void main(String[] args) throws IOException
    {
        //方法一
        //读取一个字节到a
        int a=System.in.read();
        System.out.println("a="+a);

        //读取字节数组到b
        byte[] b=new byte[512];
        int count=System.in.read(b);

        System.out.println("count="+count);
       
        for (int i=0; i<count-1; i++)
        {
            System.out.printf("%c ",b[i]);
        }
        System.out.println();

        //方法二，Scanner
        Scanner in=new Scanner(System.in); 

        String  name=in.nextLine();//读一行  
        System.out.println("name="+name);

        String  word=in.next();//读一个字符串，空格为分隔符  
        System.out.println("word="+word);

        Integer n=in.nextInt();//读一个数字 
        System.out.println("n="+n);
    }
}