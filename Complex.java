import java.io.*;
class Complex
{
float sum(float a,float b,float c)
{
return(a+b+c);
}
}
class CMain
{
public static void main(String arg[])
{
Complex g=new Complex();
System.out.println(g.sum(2.4f,2.4f,2.5f,2.4f));
}
}
