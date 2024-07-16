package com.example.bt_caculator;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
//@RequestMapping("/display")
public class Controller {

    @GetMapping()
    public String display(){
        return "display";
    }

    @PostMapping("/caculator")
    public String caculator(
            @RequestParam(defaultValue = "0") Double num1,
            @RequestParam(defaultValue = "0") Double num2,
            @RequestParam String operation,
            Model model) {
        Double result = 0.0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "sub":
                result = num1 - num2;
                break;
            case "multi":
                result = num1 * num2;
                break;
            case "divi":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "display";
    }
}
