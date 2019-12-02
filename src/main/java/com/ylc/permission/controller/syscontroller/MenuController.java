package com.ylc.permission.controller.syscontroller;

import com.ylc.permission.entity.SysAclModule;
import com.ylc.permission.service.ISysAclModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 菜单
 * @Date: 2019/12/1
 */
@RestController("/menu")
public class MenuController {

    /*@Autowired
    private ISysAclModuleService sysAclModuleService;

    @RequestMapping("/allMenu")
    public List<SysAclModule> selectAllMenu(){
        return sysAclModuleService.selectAllMenu();
    }*/

}
