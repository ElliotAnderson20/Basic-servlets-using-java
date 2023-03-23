
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
@WebServlet(urlPatterns = {"/Servlet1"})
public class Servlet1 extends HttpServlet {
public void doPost(HttpServletRequest request, HttpServletResponse 
response){ 
try{ 
response.setContentType("text/html"); 
PrintWriter out = response.getWriter(); 
Cookie ck[]=request.getCookies(); 
out.println("<h3>Your name is "+ck[0].getValue()+"<h3>"); 
out.println("<h3><br>Your roll number is "+ck[1].getValue()+"<h3>"); 
out.println("<h3><br>Your class is "+ck[2].getValue()+"<h3>"); 
out.close(); 
} 
catch(Exception e){System.out.println(e);} 
} 
}