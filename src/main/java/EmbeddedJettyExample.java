import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.AbstractHandler;
import org.eclipse.jetty.servlet.ServletContextHandler;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EmbeddedJettyExample {

  public static void main(String[] args) throws Exception {
    Server server = new Server(8686);
    ServletContextHandler handler = (new ServletContextHandler(server, "/responseEndpoint"));
    handler.addServlet(ExampleServlet.class, "/");
    server.start();
  }


}