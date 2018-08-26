import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Hashtable;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class TestContextListener implements ServletContextListener {
    	//ArrayList parameters;
    	Hashtable<String,String> parameters;
    	String line = "";
    	String arrayParameters[];
    	String file="";

    	public void contextInitialized(ServletContextEvent servletcontextevent) {
        	ServletContext servletcontext = servletcontextevent.getServletContext();
        	servletcontext.log(" ++++++++++  Loadind database parameters +++++++++ ");
        	file = servletcontext.getInitParameter("DBParameters");
        	servletcontext.log("***********" + "File = " + file + "***********");
        	parameters = new Hashtable<String,String>();
        	try {
            		InputStream inputstream = servletcontext.getResourceAsStream(file);
            		BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
            		do {
                		line = bufferedreader.readLine();
                		if(line != null) {
                    			servletcontext.log(line);
                    			arrayParameters = line.split("=");
                    			parameters.put(new String(arrayParameters[0]), new String (arrayParameters[1]));
                		}
            		} while(line != null);
            		bufferedreader.close();
            		servletcontext.setAttribute("parameters", parameters);
            		servletcontext.log(" El archivo de los parámetros de la BD ha sido cargado en el contexto");
        	} catch(Exception exception) {
            		servletcontext.log("Excepcion en Siu_Admin_DBContextFile ");
            		exception.printStackTrace();
        	}
	}

	public void contextDestroyed(ServletContextEvent servletcontextevent) {}
}
