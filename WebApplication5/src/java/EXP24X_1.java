import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
*
* @author mehta
*/
@WebServlet(urlPatterns = {"/EXP24X_1"})
public class EXP24X_1 extends HttpServlet {
 public void doPost(HttpServletRequest request, HttpServletResponse 
response) 
{ 
try 
{ 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
String n=request.getParameter("name"); 
String roll=request.getParameter("roll"); 
String year=request.getParameter("year"); 
out.println("Welcome "+n); 
out.println("<br>Click the below go button to view your entered details.<br>"); 
Cookie ck=new Cookie("name",n); 
Cookie ck1=new Cookie("roll",roll); 
Cookie ck2=new Cookie("class",year); 
response.addCookie(ck); 
response.addCookie(ck1); 
response.addCookie(ck2); 
//creating submit button 
out.print("<form action='Servlet1' method='POST'>"); 
out.print("<input type='submit' value='go'>"); 
out.print("</form>"); 
out.close(); 
} 
catch(Exception e){System.out.println(e);} 
} 
}
