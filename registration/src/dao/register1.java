package dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import encap.names;
import userbean.db;

public class register1 extends HttpServlet{
public void doPost(HttpServletRequest request, HttpServletResponse response) {
	try {
	PrintWriter out=response.getWriter();
	String u=request.getParameter("username");
	String p=request.getParameter("password");
	String e=request.getParameter("email");
	names m=new names();
	m.setUsername(u);
	m.setPassword(p);
	m.setEmail(e);
	
	db.add(m);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
