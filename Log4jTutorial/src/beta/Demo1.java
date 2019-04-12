package beta;

import java.util.logging.LogManager;
import java.util.logging.Logger;
//import org.apache.logging.log4j.*;

public class Demo1
{
	private static Logger log = LogManager.getLogger(Demo.class.getName());
	
	
	public static void main(String[] args)
	{
	
		log.debug("I am debugging");
		if(2>0)
		{
			log.debug("object is present");
		}
		else
		{
			log.debug("object is not present");
		}
	}

}
