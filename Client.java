import java.io.*;
import java.net.*;

class Client
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client of Marvellous chat messenger is running..");

        Socket sobj = new Socket("localhost",2100);
        System.out.println("Client is waiting for server to accept the request..");

        PrintStream PS = new PrintStream(sobj.getOutputStream());

        BufferedReader br1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));
        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Marvellous chat messenger started...");

        String str1,str2;

        while(!(str1=br2.readLine()).equals("end"))
        {
            PS.println(str1);
            System.out.println("Enter messege for server: ");
            str2 = br1.readLine();
            System.out.println("Server says:"+str2);
        }
        System.out.println("Thank you for using Marvellous chat messenger..");

    }
}