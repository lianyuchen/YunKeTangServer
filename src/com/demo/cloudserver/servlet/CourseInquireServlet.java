package com.demo.cloudserver.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.demo.cloudserver.entity.CourseInfo;
import com.demo.cloudserver.entity.JsonBean;
import com.demo.cloudserver.service.CourseService;
import com.demo.cloudserver.service.impl.CourseServiceImpl;

/**
 * Servlet implementation class CourseInquireServlet
 */
public class CourseInquireServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseInquireServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	    //设置输出内容类型
        response.setContentType("text/html;charseet=utf-8");
        
        //获取out输出对象
        PrintWriter out = response.getWriter();
        
        //设置字符编码
        request.setCharacterEncoding("utf-8");
        
        //String coursename = request.getParameter("coursename");
        //String coursetime = request.getParameter("coursetime");
        //String courselocation = request.getParameter("courselocation");
        
          String coursetime="25";
          
          CourseService courseService = new CourseServiceImpl();
          List<CourseInfo> CourseInfo=courseService.select(coursetime);
          
          if (null != CourseInfo) {
              
              JsonBean jsonBean = new JsonBean(200, "响应成功！");
              out.print(JSON.toJSON(jsonBean));
              
          } else {

              JsonBean jsonBean = new JsonBean(100, "请求失败！");
              out.print(JSON.toJSON(jsonBean));
          }
          
          
	}

}
