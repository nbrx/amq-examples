package cl.nbrx.camel.samples.dequeue.main;

import org.apache.camel.spring.Main;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.log4j.PropertyConfigurator;

public class MainStandalone {

	
	private static Log logger = LogFactory.getLog(MainStandalone.class);
	
	public void run(String[] args) throws Exception {
		
		logger.info("iniciando app");
		Main main = new Main();    
	    main.setApplicationContextUri("META-INF/spring/camel-context.xml");
		main.start();
	}
	
	public static void main(String[] args)  {		
		MainStandalone mainStandalone = new MainStandalone();
		try {
			mainStandalone.run(args);
		} catch (Exception e) {
			logger.error(e);
		}	    
	}

}
