package com.spring.springboot.task9springboot.Controller;

import com.spring.springboot.task9springboot.Dto.EmpolyeeDto;
import com.spring.springboot.task9springboot.Service.EmpolyeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("employees")
public class EmpolyeeWebController {
    private EmpolyeeService empolyeeService;
    @Autowired
    private EmpolyeeWebController(EmpolyeeService empolyeeService){
        this.empolyeeService=empolyeeService;
    }
    @GetMapping
    public String viewHomePage(Model model){
        List<EmpolyeeDto >listEmpolyees=empolyeeService.getAllEmployees();
        model.addAttribute("listEmpolyees",listEmpolyees);
        return "employees";
    }
    // فتح صفحة إضافة موظف جديد
    @GetMapping("/new")
    public String showCreateEmployeeForm(Model model) {
        EmpolyeeDto employeeDto = new EmpolyeeDto();
        model.addAttribute("employee", employeeDto);
        return "employee_form"; // اسم صفحة الـ HTML الخاصة بالإضافة
    }


    // 3. استقبال الداتا من الفورم وحفظها في الداتا بيز
    @PostMapping("/save")
    public String saveEmployee(@Valid @ModelAttribute("employee") EmpolyeeDto employeeDto, BindingResult result) {
        if (result.hasErrors()) {
            return "employee_form"; // لو فيه خطأ في الـ Validation يرجع لنفس الفورم
        }
        empolyeeService.createEmployee(employeeDto);
        return "redirect:/employees"; // بعد الحفظ يرجع لصفحة الجدول عشان يشوف الموظف الجديد
    }

    // 4. حذف موظف من الجدول مباشرة
    @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        empolyeeService.removeEmployee(id);
        return "redirect:/employees";
    }
    @GetMapping("/test-page")
    @ResponseBody
    public String testPage() {
        return "Controller is working!";
    }


}
