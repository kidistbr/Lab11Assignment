package com.kidist.lab11Assignment;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "CalculatorServlet", value = "/CalculatorServlet")
public class HelloServlet extends HttpServlet {


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Calculator</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Calculator</h1>"+
                "<a href='/lab11Assignment_war_exploded'>Calculator</a>" +
                "</body>\n" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input1=req.getParameter("number1");
        String input2=req.getParameter("number2");
        String input3=req.getParameter("number3");
        String input4=req.getParameter("number4");

        int number1 = 0,number2 = 0,number3=0,number4 = 0,sum=0,product=0;
        String htmlString="";
        if(!input1.equals("")||!input2.equals("")){
             number1=Integer.parseInt(input1);
             number2=Integer.parseInt(input2);
            sum=number1+number2;
            System.out.println("if 1");
            htmlString+="<strong>"+input1+" + "+input2+"="+sum+"</strong>";
        }
        if(!input3.equals("")||!input4.equals("")) {
            number3 = Integer.parseInt(input3);
            number4 = Integer.parseInt(input4);
            product=number3*number4;
            System.out.println("if 2");

            htmlString+="<br/><br/><strong>"+input3+" + "+input4+"="+product+"</strong><br/><br/>";
        }
//        else{
//            System.out.println("if 3");
//
//            htmlString="<strong>"+input1+" + "+input2+"="+sum+"</strong>"+"<br/>"+
//                    "<strong>"+input3+" + "+input4+"="+product+"</strong>";
//        }



        PrintWriter out = resp.getWriter();
        out.print("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Calculator</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "<h1>Calculator</h1>"+htmlString+

                "<a href='/lab11Assignment_war_exploded'>Go Back</a>" +
                "</body>\n" +
                "</html>");

    }

    public void destroy() {
    }
}