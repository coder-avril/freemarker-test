package com.lding.jk.controller;

import com.lding.jk.pojo.query.DictTypeQuery;
import com.lding.jk.service.DictTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dictType")
public class DictTypeController {
    @Autowired
    private DictTypeService dictTypeService;

    @GetMapping("/list")
    public String list(Model model, DictTypeQuery query) {
        this.dictTypeService.list(query);
        model.addAttribute("query", query);
        // freemarker的默认前缀是 classpath:/templates/ ;默认后缀是 .ftlh
        return "pages/DictTypeList";
    }
}
