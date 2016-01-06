package com.demo.cloudserver.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.demo.cloudserver.entity.StudentInfo;
import com.demo.cloudserver.service.UserService;
import com.demo.cloudserver.service.impl.UserServiceImpl;


/**
 * Servlet implementation class UserLoginServlet
 */
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserLoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 设置输出内容类型
		response.setContentType("text/html;charset=utf-8");

		// 获取out输出对象
		PrintWriter out = response.getWriter();

		// 设置字符编码
		request.setCharacterEncoding("utf-8");

		// 获取提交的数据
		String user_name = request.getParameter("user_name");
		// System.out.println(">>>"+ user_name);
		String user_password = request.getParameter("user_password");

		if (null != user_name && null != user_password) {

			UserService userService = new UserServiceImpl();
			StudentInfo studentInfo = userService.login(user_name, user_password);

			if (null != studentInfo) {

				//调用fastJSON进行解析
				out.print(JSON.toJSONString(studentInfo));
			}
		} else {
			out.println("-1");
		}
	}

}
