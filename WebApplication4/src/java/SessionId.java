/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.DateFormat;
import java.util.Date;
import javax.servlet.http.*;
/**
*
* @author mehta
*/
@WebServlet(description = "", urlPatterns = { "/SessionId" })
public class SessionId extends HttpServlet 
{
protected void doGet(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException 
{
try 
{
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
HttpSession session=request.getSession();
Date ct=new Date(session.getCreationTime());
Date lt =new Date(session.getLastAccessedTime());
 DateFormat f = 
DateFormat.getDateTimeInstance(DateFormat.MEDIUM, 
DateFormat.MEDIUM);
pw.println("Session Id is: "+session.getId());
pw.println("<br>");
pw.println("Creattion time is: "+f.format(ct));
}
catch(Exception e)
{
System.out.println(e);
}
}
protected void doPost(HttpServletRequest request, HttpServletResponse 
response) throws ServletException, IOException
{
doGet(request, response);
}
}