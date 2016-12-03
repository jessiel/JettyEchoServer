import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
//import Jackson.Json


public class ExampleServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    resp.setStatus(HttpStatus.OK_200);
    resp.getWriter().println();


    StringBuffer jb = new StringBuffer();
    String line = null;
    try {
      BufferedReader reader = req.getReader();
      while((line = reader.readLine()) != null) {
        jb.append(line);
      }
    }catch (Exception e) {}

    System.out.println(jb.toString());

  }


}
