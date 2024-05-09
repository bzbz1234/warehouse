package com.lqyrmk.transportation.controller;

import com.lqyrmk.transportation.entity.Shipper;
import com.lqyrmk.transportation.service.ShipperService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
public class ShipperController {

    @Autowired
    private ShipperService shipperService;

    @GetMapping("/register")
    public String registerPage() {
        return "register";
    }

    @PostMapping("/register")
    public String register(Shipper shipper, String passwordConfirm, Model model) {

        model.addAttribute("shipperName", shipper.getShipperName());
        model.addAttribute("password", shipper.getPassword());
        model.addAttribute("passwordConfirm", passwordConfirm);

        if (!shipper.getPassword().equals(passwordConfirm)) {
            // 两次密码不一致
            model.addAttribute("registerError", "两次密码不一致");
            return "register";
        }

        // 用户名已存在
        if (shipperService.getShipperByName(shipper.getShipperName()) != null) {
            model.addAttribute("registerError", "用户名已存在");
            return "register";
        }
        // 用户名可用
        shipperService.registerShipper(shipper);
        // 重定向防止表单重复提交
        return "redirect:/login";
    }

    @GetMapping(value = {"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(Shipper shipper, HttpSession session, Model model) {

        Shipper loginShipper = shipperService.login(shipper.getShipperName(), shipper.getPassword());

        if (loginShipper != null) {
            log.info("login shipper: {}", loginShipper);
            // 把登录成功的用户保存起来
            session.setAttribute("loginShipper", loginShipper);
            // 登录成功重定向到index.html，重定向防止表单重复提交
            return "redirect:/index.html";
        }
        // 登录失败回到登录页面
        else {
            model.addAttribute("loginError", "用户名或密码错误");
            // 回到登录页面
            return "login";
        }
    }

    @GetMapping("/index.html")
    public String indexPage(HttpSession session, Model model) {
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.removeAttribute("loginShipper");
        return "login";
    }

}
