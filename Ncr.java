import aamec.network.*;
import java.io.*;
import gowri.photos.*;
class NCR
{
public static void main(String args[])throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter n,r");
int n=Integer.parseInt(br.readLine());
int r=Integer.parseInt(br.readLine());
aamec.network.First f=new aamec.network.First();
int ncr=f.fact(n)/(f.fact(r)*f.fact(n-r));
gowri.photos.First g=new gowri.photos.First();
g.design();
System.out.println("ncr:"=ncr);
g.design1();
}
}

