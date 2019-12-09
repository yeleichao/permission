package com.ylc.permission.controller.syscontroller;

import com.ylc.permission.entity.SysDept;
import com.ylc.permission.service.ISysDeptService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: TODO
 * @Date: 2019/12/7
 */
@Controller
@RequestMapping("/sys/dept")
@Slf4j
public class SysDeptController {


    @Autowired
    private ISysDeptService sysDeptService;

    @RequestMapping(method = RequestMethod.GET,value = "/dept.html")
    public String getDept(){
        return "dept";
    }

    @RequestMapping(method = RequestMethod.POST,value = "/selectDept.json")
    @ResponseBody
    public List<SysDept> selectDept(){

        return sysDeptService.selectAllDept();
    }


}
