package com.ylc.permission.mapper;

import com.ylc.permission.entity.SysAclModule;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ylc
 * @since 2019-11-30
 */
public interface SysAclModuleMapper extends BaseMapper<SysAclModule> {

    List<SysAclModule> selectAllMenu();
}
