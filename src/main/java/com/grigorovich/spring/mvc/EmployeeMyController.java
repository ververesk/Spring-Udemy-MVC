package com.grigorovich.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class EmployeeMyController {

        @RequestMapping("/") //если вводим просто слэш то возвращается это JSP
        public String showFirstView() {
            return "first-view";
        }

        @RequestMapping("/askEmpDetails")
        public String askEmployeeDetails(Model model) {
            model.addAttribute("employee", new Employee());
            return "new-ask-emp-details-view";
        }
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

        @RequestMapping("/showEmpDetails")
        public String showEmpDetails(@ModelAttribute("employee") Employee emp) {
            return "new-show-emp-details-view";
        }
    }


