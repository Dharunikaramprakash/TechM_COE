HelloWorldServlet.java
--------------------------
package pack7;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class HelloWorldServlet
 */
@WebServlet("/HelloWorldServlet")
public class HelloWorldServlet extends HttpServlet { 
	
	protected void doGet(HttpServletRequest request, 
		      HttpServletResponse response) throws ServletException, IOException 
		  {
		    // reading the user input
		    String color= request.getParameter("color");    
		    PrintWriter out = response.getWriter();
		    out.println("<html> \n" +		    	    
		    	        "<body style=\"background-color:"+color+";> \n" +
		    	          "<font size=\"16px\">" +
"Hello World from JSP page!" +
		    	          "</font> \n" +
		    	        "</body> \n" +
		    	      "</html>" 
		    	    );  
		    	  }  
		    	}
-------------------------------------------------------------------------------------------------------------------
Home.jsp
----------
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title> My first JSP   </title>
	</head>	
	<body>		
		<form action="HelloWorldServlet">			 		
			 Please enter a color <br>
			<input type="text" name="color"size="20px">
			<input type="submit" value="submit">						
		</form>		
	</body>	
</html>