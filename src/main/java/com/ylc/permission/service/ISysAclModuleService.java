package com.ylc.permission.service;

import com.ylc.permission.entity.SysAclModule;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author ylc
 * @since 2019-11-30
 */
public interface ISysAclModuleService extends IService<SysAclModule> {

    List<SysAclModule> selectAllMenu();

}
