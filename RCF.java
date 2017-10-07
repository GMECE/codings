import java.io.*;
class RCF
{
public static void main(String arg[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Filename");
String fname=br.readLine();
int ch;
FileInputStream fis=new FileInputStream(fname);
while((ch=fis.read())!=-1)
System.out.println((char)ch);
fis.close();
}
}
