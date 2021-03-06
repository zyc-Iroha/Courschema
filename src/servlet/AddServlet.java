package servlet;



import bean.CourseBean;
import service.ShowService;
import service.ShowServiceImpl;
import service.UpdateService;
import service.UpdateServiceImpl;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.List;

@WebServlet(name = "AddServlet")
public class AddServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        Enumeration enu = request.getParameterNames();
        while (enu.hasMoreElements()) {
            String paraName = (String) enu.nextElement();
            System.out.println(paraName + ": " + request.getParameter(paraName));
        }
        String courseName = request.getParameter("courseName");
        String shortName = request.getParameter("shortName");
        String credit = request.getParameter("credit");
        String semester = request.getParameter("semester");
        String major = request.getParameter("major");
        String pre = request.getParameter("pc1");
        if(pre!=null){
            if(request.getParameter("pc2")!=null){
                pre+=","+request.getParameter("pc2");
            }
            if(request.getParameter("pc3")!=null){
                pre+=","+request.getParameter("pc3");
            }
        }
        System.out.println("pre:"+pre);
//        System.out.println("pre:"+pre);
//        System.out.println("cscm: "+courseName+" "+shortName+" "+credit+" "+semester+" "+major);
//        System.out.println("ydp: "+request.getSession().getAttribute("year")+" "+
//                request.getSession().getAttribute("department")+" "+ request.getSession().getAttribute("plan") );
        UpdateService us = new UpdateServiceImpl();
        if(request.getSession().getAttribute("year")==null||request.getSession().getAttribute("department")==null
        ||request.getSession().getAttribute("plan")==null){
            response.getWriter().println("<script>alert('请先选择培养方案。');  window.location='course.jsp' </script>");
            response.getWriter().flush();
            response.getWriter().close();
//            request.getRequestDispatcher("AdjustServlet").forward(request,response);
        }
        try {
            int re = us.add(pre,courseName,shortName,credit,semester,major,request.getSession().getAttribute("year"),
                    request.getSession().getAttribute("department"),request.getSession().getAttribute("plan"));
            if(re==1){
                System.out.println("success");
                response.getWriter().println("<script>alert('添加成功。');  window.location='course.jsp' </script>");
                response.getWriter().flush();
                response.getWriter().close();
//                request.getRequestDispatcher("AdjustServlet").forward(request,response);
            }else {
                System.out.println("failure");
                response.getWriter().println("<script>alert('请核实课程信息后填写。');window.location='course.jsp'  </script>");
                response.getWriter().flush();
                response.getWriter().close();
//                request.getRequestDispatcher("AdjustServlet").forward(request,response);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        doGet(request, response);
    }

}