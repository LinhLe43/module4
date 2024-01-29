package com.codegym.controller;

import com.codegym.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/home")
    public ModelAndView showHome() {
//        String name = "Hello";
//        ModelAndView modelAndView = new ModelAndView("home");
//        modelAndView.addObject("name", name);
//        return modelAndView;
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Linh", 28));
        students.add(new Student(2, "Giang", 27));
        students.add(new Student(3, "Vanh", 27));
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("students", students);
        return modelAndView;
    }
    @GetMapping("/add")
    public ModelAndView showFormAdd() {
        ModelAndView modelAndView = new ModelAndView("add");
        Student student = new Student();
        modelAndView.addObject("student", student);
        return modelAndView;
    }

    @PostMapping("/add")
    public String add(@ModelAttribute Student student) {
        System.out.println(student);
        return "";
    }
}
