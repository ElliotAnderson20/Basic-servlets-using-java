import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
*
* @author ronit
*/
@WebServlet(urlPatterns = {"/Exp21"})
public class Exp21 extends HttpServlet {
 
 @Override 
 protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException 
 { 
response.setContentType("text/html;charset=UTF8"); 
try(PrintWriter out = response.getWriter()) 
{ 
out.println("Welcome at Maharashtra State Board of Technical Education"); 
} 
} 
}
