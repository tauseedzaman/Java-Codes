import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import java.io.File;

public class WebDemo {
    public static void main(String... args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setBaseDir("chapter10/web-app/out");
        tomcat.setPort(8080);
        String contextPath = "/demo";
        String docBase = new File(".").getAbsolutePath();
        Context context = tomcat.addContext(contextPath, docBase);
        SampleServlet servlet = new SampleServlet();
        tomcat.addServlet(contextPath, servlet.getServletName(), servlet);
        context.addServletMapping(servlet.getUrlPattern(), servlet.getServletName());
        tomcat.start();
        tomcat.getServer().await();
    }
}