import java.net.*;
import java.io.*;
import java.util.Date;
class daytime_server
{
	public static void main(String args[])throws IOException
	{
		try{
			ServerSocket server=new ServerSocket(5775);
			Socket skt=null;
			while(true)
			{
				try{
					skt=server.accept();
					Date now=new Date();
					OutputStreamWriter out=new OutputStreamWriter(skt.getOutputStream());
					out.write("today's date:"+now.toString());
					out.flush();
					skt.close();
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
				finally
				{
					if(skt!=null)
						skt.close();
				}
			}
		}

			catch(IOException e)
			{
				System.out.print(e);
			}
		
	}
}
			