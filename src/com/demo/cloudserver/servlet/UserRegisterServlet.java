package com.demo.cloudserver.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.demo.cloudserver.entity.JsonBean;
import com.demo.cloudserver.entity.StudentInfo;
import com.demo.cloudserver.service.UserService;
import com.demo.cloudserver.service.impl.UserServiceImpl;

/**
 * Servlet implementation class UserRegisterServlet
 */
public class UserRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserRegisterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // 设置输出内容类型
        response.setContentType("text/html;charset=utf-8");

        // 获取out输出对象
        PrintWriter out = response.getWriter();

        // 设置字符编码
        request.setCharacterEncoding("utf-8");
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String genderStr  =request.getParameter("gender");
        int gender = Integer.parseInt(genderStr);
        String major = request.getParameter("major");
        String photo = request.getParameter("photo");
        boolean isSuccess = false;
        if (null != username && null != password) {

            UserService userService = new UserServiceImpl();

            isSuccess = userService.register(username, password,gender,major,photo);

            if (isSuccess) {

                JsonBean jsonBean = new JsonBean(200, "响应成功！");
                //调用fastJSON进行解析
                out.print(JSON.toJSON(jsonBean));
            }
        } else {
            JsonBean jsonBean = new JsonBean(100, "请求失败！");
            out.print(JSON.toJSON(jsonBean));
        }
	}

}
