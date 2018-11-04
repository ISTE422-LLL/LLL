import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import java.io.*;

public class MainTester
{ 	
	public static void main(String [] args)
	{ 
		String delim = "|";
		String input1 = "";
		String input2 = "";
		if(args.length == 0)
		{
			input1 = "1";
			input2 = "test";	
		}
		else if(args[0].equals("-h"))
		{
			System.out.println("Help Menu:\n\t-h: Show help message.\n\t-n: Take the following command as a the test object.\n\t-f: What the following is the name of a test object file, containing one or more test objects.\n\t***You are not allow to use -n and -f at the same time.");
			return;
		}
		else if(args[0].equals("-n"))
		{
			input1 = args[1].split(",")[0];
			input2 = args[1].split(",")[1];
		}
		else if(args[0].equals("-f"))
		{
			try
			{			
				BufferedReader reader = new BufferedReader(new FileReader(args[1]));
	    			String input = reader.readLine();
				input1 = input.split(",")[0];
				input2 = input.split(",")[1];
			}
			catch(Exception ex){}
		}
		System.setProperty("input",input1 + delim + input2);
		
		Result resultTest1 = JUnitCore.runClasses(EdgeFieldTest.class);
		Result resultTest2 = JUnitCore.runClasses(EdgeTableTest.class);
		
		
		/*for(Failure failure : resultTest2.getFailures())
		{
			System.out.println(failure.toString());
		}
		*/
		
		System.out.println("EdgeFieldTest: " + resultTest1.wasSuccessful());
		System.out.println("EdgeTableTest: " + resultTest2.wasSuccessful());
	}

}

