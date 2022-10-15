import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class to create Http Servlet
public class MyServletDemo extends HttpServlet {

   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String mymsg;

   public void init() throws ServletException {
      mymsg = "Hello World!";
   }

   public void doGet(HttpServletRequest request,
         HttpServletResponse response)
         throws ServletException, IOException {

      // Setting up the content type of webpage
      response.setContentType("text/html");

      // Writing message to the web page
      PrintWriter out = response.getWriter();
      out.println("<h1>" + mymsg + "</h1>");
   }

   public void destroy() {
      /*
       * leaving empty for now this can be
       * used when we want to do something at the end
       * of Servlet life cycle
       */
   }
}