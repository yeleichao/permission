package com.ylc.permission.service.impl;

import com.ylc.permission.entity.SysAclModule;
import com.ylc.permission.mapper.SysAclModuleMapper;
import com.ylc.permission.service.ISysAclModuleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author ylc
 * @since 2019-11-30
 */
@Service
public class SysAclModuleServiceImpl extends ServiceImpl<SysAclModuleMapper, SysAclModule> implements ISysAclModuleService {

    @Autowired
    private SysAclModuleMapper sysAclModuleMapper;

    @Override
    public List<SysAclModule> selectAllMenu() {
        return sysAclModuleMapper.selectAllMenu();
    }
}
