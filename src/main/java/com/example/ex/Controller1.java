package com.example.ex;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;



@Controller
public class Controller1 {

    @GetMapping("/")
    public String showForm() {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@RequestParam String name,
                             @RequestParam int age,
                             @RequestParam String gender,
                             @RequestParam String[] hobbies,
                             @RequestParam String education) {
        System.out.println("姓名: " + name);
        System.out.println("年龄: " + age);
        System.out.println("性别: " + gender);
        System.out.println("爱好: " + String.join(", ", hobbies));
        System.out.println("学历：" + education);

        return "redirect:/";
    }
}