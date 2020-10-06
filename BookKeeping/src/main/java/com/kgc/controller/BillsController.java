package com.kgc.controller;

import com.kgc.pojo.Bills;
import com.kgc.pojo.Btype;
import com.kgc.service.BillsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Controller
public class BillsController {
    @Resource
    BillsService billsService;

    @RequestMapping("/index.do")
    public String list(Integer typeid, Date btime, Model model) {
        List<Bills> list = billsService.getlist(typeid, btime);
        List<Btype> btypeList = billsService.getlistbt();
        model.addAttribute("list", list);
        model.addAttribute("btypeList", btypeList);
        return "/index";
    }
    @RequestMapping("/toadd")
    public String add(Bills bills){
        int i=billsService.add(bills);
        return "redirect:/index.do";
    }
}




