import java.io.*;
import java.util.Date;
import java.net.*;
class daytime_client
{
	public static void main(String args[])throws IOException
	{
		Socket skt=null;
		try{
			skt=new Socket("localhost",5775);
			OutputStreamWriter out=new OutputStreamWriter(skt.getOutputStream());
			out.write("this is from client..");
			out.flush();
			BufferedReader br=new BufferedReader(new InputStreamReader(skt.getInputStream()));
			System.out.println(br.readLine());
			skt.close();
		}
		catch(IOException e)
		{
			System.out.print(e);
		}
		finally	
		{
			try{
				if(skt!=null)
					skt.close();
			}
			catch(IOException e)
			{
				System.out.print(e);
			}
		}
	}
}	