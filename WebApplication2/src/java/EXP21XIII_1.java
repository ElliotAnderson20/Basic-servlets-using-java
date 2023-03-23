import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
*
* @author mehta
*/
@WebServlet(urlPatterns = {"/EXP21XIII_1"})
public class EXP21XIII_1 extends HttpServlet {
 
 @Override 
 protected void doGet(HttpServletRequest request, HttpServletResponse 
response)throws ServletException, IOException 
 { 
response.setContentType("text/html;charset=UTF8"); 
try(PrintWriter out = response.getWriter()) 
{ 
out.println("Welcome at Maharashtra State Board of Technical Education"); 
} 
} 
}
