package com.request;

import javax.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Square extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	int k=(int)req.getAttribute("k");
	k=k*k;
	PrintWriter out=res.getWriter();
	out.println("result ="+k);
}
}
