/*
package com.mxz.service.web;

import com.mxz.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.Duration;
import java.time.LocalDateTime;

*/
/**
 * 模板显示页面
 *
 * @author mxz on 2020/07/23 14:06
 *//*

@Controller
public class TemplateController {

    @RequestMapping(value = {"", "/index"})
    public String index(Model model) {
        LocalDateTime meet = LocalDateTime.of(2020, 7, 29, 22, 0);
        LocalDateTime now = LocalDateTime.now();
        Duration between = Duration.between(now, meet);
        model.addAttribute("day", between.toDays());
        model.addAttribute("hour", between.toHours());
        model.addAttribute("minute", between.toMinutes());
        model.addAttribute("seconds", between.toMillis());
        User user = new User();
        user.setAge(121);
        user.setUsername("dock3333e");
        model.addAttribute("user",user);
        return "index";
    }
}
*/
