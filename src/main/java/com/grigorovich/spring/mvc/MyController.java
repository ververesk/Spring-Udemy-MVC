package com.grigorovich.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

//@Controller
////@RequestMapping("/employee") перед всеми адресами будет добавляться например /employee/askDetails
//public class MyController {
//
//    @RequestMapping("/") //если вводим просто слэш то возвращается это JSP
//    public String showFirstView() {
//        return "first-view";
//    }
//
//    @RequestMapping("/askDetails")
//    public String askEmployeeDetails() {
//        return "ask-emp-details-view";
//    }
//    @RequestMapping("/showDetails")
//    public String showEmpDetails() {
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(HttpServletRequest request, Model model) {
//        String empName=request.getParameter("employeeName");
//        empName="Ms. "+empName;
//        model.addAttribute("nameAttribute", empName);
//        model.addAttribute("description","woman"); //второй объект типа Object может туда добавлять всё что угодно
//        return "show-emp-details-view";
//    }

//    @RequestMapping("/showDetails")
//    public String showEmpDetails(@RequestParam("employeeName") String empName, Model model) {
//        empName="Ms. "+empName;
//        model.addAttribute("nameAttribute", empName);
//
//        return "show-emp-details-view";
//    }
//}
