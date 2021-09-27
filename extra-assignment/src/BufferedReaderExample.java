//Java program demonstrating BufferedReader methods
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class BufferedReaderExample
{
    public static void main(String[] args) throws IOException
    {
        FileReader fr = new FileReader("ABC.txt");
        BufferedReader br = new BufferedReader(fr);
        char c[]=new char[20];

        //illustrating markSupported() method
        if(br.markSupported())
        {
            System.out.println("mark() method is supported");

            //illustrating mark method
            br.mark(100);
        }

		/*File Contents
		* This is first line
		this is second line
		*/

        //skipping 8 characters
        br.skip(8);

        //illustrating ready() method
        if(br.ready())
        {
            //illustrating readLine() method
            System.out.println(br.readLine());

            //illustrating read(char c[],int off,int len)
            br.read(c);
            for (int i = 0; i <20 ; i++)
            {
                System.out.print(c[i]);
            }
            System.out.println();

            //illustrating reset() method
            br.reset();
            for (int i = 0; i <8 ; i++)
            {
                //illustrating read() method
                System.out.print((char)br.read());
            }
        }
    }
}
