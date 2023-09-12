package java_5th;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AfterSuccess extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			HttpSession session = req.getSession();
			String uname = (String) session.getAttribute("username");
			PrintWriter out = res.getWriter();
			out.println("<h1>hello " + uname + "<h1>");
			out.println("<h2>You are logged in Succesfully</h2>");
		} catch (IOException e) {

		}
	}
}