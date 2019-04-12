package alpha;

import java.util.logging.LogManager;
import java.util.logging.Logger;
//import org.apache.logging.log4j.*;

public class Demo
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
		
		
		///////////////////////////////
		
		log.debug("I have clicked on button");
		
		log.info("Button is displaying");
		
		log.error("Buttton is not displayed");
		
		log.fatal("Button is missing");
		
		
	}

}
