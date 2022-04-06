package com.mqTemplate.controller;

import com.github.pagehelper.PageInfo;
import com.mqTemplate.entity.MqTemplate;
import com.mqTemplate.entity.query.TemplateQuery;
import com.mqTemplate.entity.vo.ResultVo;
import com.mqTemplate.service.MqTemplateService;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MqTemplateController {
    @Autowired
    private MqTemplateService mqTemplateService;
    @GetMapping("/")
    public String index(TemplateQuery tq, Model ml){
        PageInfo<MqTemplate> pi = mqTemplateService.listMqTemplate(tq);
        ml.addAttribute("mqTemplate",pi);
        return "index";
    }
    @PostMapping("/updateMT")
    @ResponseBody
    public ResultVo updateMT(@RequestBody MqTemplate mt){
        Integer result =null;
        result = mqTemplateService.updateMqTemplate(mt);
        ResultVo rv=new ResultVo();
        if(result==null || result==0){
            rv.setSuccess(false);
            rv.setMessage("update fail");
            rv.setData(null);
        }
        else{
            rv.setSuccess(true);
            rv.setMessage("update success");
            rv.setData(mt.getId());
        }
        return rv;
    }
    @PostMapping("/createMT")
    public String createMT(@RequestBody MqTemplate mt,Model ml){
        mqTemplateService.createMqTemplate(mt);
        TemplateQuery tq = new TemplateQuery();
        PageInfo<MqTemplate> pi = mqTemplateService.listMqTemplate(tq);
        ml.addAttribute("mqTemplate",pi);
        return "index";
    }
    @PostMapping("/deleteMT")
    public String deleteMT(@RequestBody  MqTemplate mt,Model ml){
        mqTemplateService.deleteMqTemplate(mt.getId());
        TemplateQuery tq = new TemplateQuery();
        PageInfo<MqTemplate> pi = mqTemplateService.listMqTemplate(tq);
        ml.addAttribute("mqTemplate",pi);
        return "index";
    }
    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
    @GetMapping("/templateManager")
    public String templateManager(){
        return "templateManager";
    }
}
