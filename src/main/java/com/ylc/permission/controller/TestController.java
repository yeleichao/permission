package com.ylc.permission.controller;

import com.ylc.permission.entity.SysAclModule;
import com.ylc.permission.service.ISysAclModuleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description: TODO
 * @Date: 2019/11/24
 */
@Controller
@Slf4j
public class TestController {


    /*@Autowired
    public SysAclMapper sysAclMapper;

    @RequestMapping("/test")
    public List<SysAcl> test(){
        return sysAclMapper.selectAll();
    }
*/

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

   /* @RequestMapping("/{index}")
    public String index(@PathVariable("index") String index){

        return index;
    }*/
    @RequestMapping("/dept")
    public String index2(){
        return "dept";
    }

    @Autowired
    private ISysAclModuleService sysAclModuleService;

    @RequestMapping("/allMenu")
    @ResponseBody
    public List<SysAclModule> selectAllMenu(){

        return sysAclModuleService.selectAllMenu();
    }

}
