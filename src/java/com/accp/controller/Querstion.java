package com.accp.controller;

import com.accp.biz.answersBiz;
import com.accp.biz.querstionsBiz;
import com.accp.entiey.answers;
import com.accp.entiey.querstions;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class Querstion {
    @Resource(name = "answersBiz")
    private answersBiz abiz;
    @Resource(name = "querstionsBiz")
    private querstionsBiz qbiz;

    @RequestMapping("/show.do")
    public String showQuerstions(Model m){
        m.addAttribute("querstions",qbiz.queryQuerstions());
        return "index";
    }

    @RequestMapping("/add.do")
    public String add(){
        return "insert";
    }

    @RequestMapping("/insert.do")
    public String insert(Model m, querstions q,String title,String detailDesc){
        q.setTitle(title);
        q.setDetailDesc(detailDesc);
        m.addAttribute(qbiz.addQuerstions(q));
        return showQuerstions(m);
    }


    @RequestMapping("/queryById.do")
    public String insert(Model m, String id){
        m.addAttribute("querstion",qbiz.queryQuerstionsById(Integer.parseInt(id)));
        m.addAttribute("answerss",qbiz.queryAnswers(Integer.parseInt(id)));
        return "answers";
    }

    @RequestMapping("/addAnswers.do")
    public String insert(Model m, answers a,String ansContent,String qid){
        a.setQid(Integer.parseInt(qid));
        a.setAnsContent(ansContent);
        if(ansContent!=null&&ansContent!=""){
            m.addAttribute("answerss",abiz.addAnswers(a));
        }
        return insert(m,String.valueOf(a.getQid()));
    }



}
