// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
 
// Extend HttpServlet class
public class ReadCookies extends HttpServlet {
 
   /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
      
      Cookie cookie = null;
      Cookie[] cookies = null;

      // Get an array of Cookies associated with this domain
      cookies = request.getCookies();

      // Set response content type
      response.setContentType("text/html");

      PrintWriter out = response.getWriter();
      String title = "Reading Cookies Example";
      String docType =
         "<!doctype html public \"-//w3c//dtd html 4.0 " +
         "transitional//en\">\n";
         
      out.println(docType +
         "<html>\n" +
         "<head><title>" + title + "</title></head>\n" +
         "<body bgcolor = \"#f0f0f0\">\n" );

      if( cookies != null ) {
         out.println("<h2> Found Cookies Name and Value</h2>");

         for (int i = 0; i < cookies.length; i++) {
            cookie = cookies[i];
            out.print("Name : " + cookie.getName( ) + ",  ");
            out.print("Value: " + cookie.getValue( ) + " <br/>");
         }
      } else {
         out.println("<h2>No cookies founds</h2>");
      }
      if( cookies != null ) {
          for (int i = cookies.length-1; i >= 0; i--) {
             cookie = cookies[i];
             if(cookie.getName().contains("first_name")) {
            	 out.print("Welcome " + cookie.getValue() + " from ");
             }
             if(cookie.getName().contains("campus")) {
            	 out.print(cookie.getValue() + " campus </br>");
             }
          }
       }
      out.println("<a href=\"http://localhost:8080/Servlet-Programming/DeleteCookies\">"
             + "<button type=\"button\">Delete all cookies</button></a>");
      out.println("</body>");
      out.println("</html>");
   }
}
