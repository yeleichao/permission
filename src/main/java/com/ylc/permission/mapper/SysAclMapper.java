package com.ylc.permission.mapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylc.permission.entity.SysAcl;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author ylc
 * @since 2019-11-30
 */
public interface SysAclMapper extends BaseMapper<SysAcl> {

    IPage<SysAcl> selectSysAcl(Page page);
}
