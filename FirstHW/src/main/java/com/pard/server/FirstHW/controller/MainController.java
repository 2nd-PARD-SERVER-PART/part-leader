package com.pard.server.FirstHW.controller;

import com.pard.server.FirstHW.dto.MyInfoDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String startPage() {
        return "start";
    }

    @PostMapping("/showInfo")
    public String showForm(MyInfoDto dto, Model model) {
        // 중요중요중요! 클라이언트, 백앤드끼리 정보를 주고 받기 위해서는 정보를 객체에 담아 전달해야함!
        // 따라서 *dto 객체*를 모델에 추가하여 Mustache 템플릿으로 전달!
        model.addAttribute("myInfo", dto);
        return "showInfo";
    }

    @GetMapping("/submitInfo")
    public String newInfoForm() {
        return "submitInfo";
    }

}
