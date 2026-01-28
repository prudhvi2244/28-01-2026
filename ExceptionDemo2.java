import java.io.File;
import java.io.IOException;
class ExceptionDemo2{
       
   static void f1() throws IOException{
        File f=new File("sample.txt");
         f.createNewFile();
        }
      
     public static void main(String[] args) throws IOException{
        ExceptionDemo2.f1();

     }
}