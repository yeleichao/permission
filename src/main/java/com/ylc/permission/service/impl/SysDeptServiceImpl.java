package com.ylc.permission.service.impl;

import com.ylc.permission.entity.SysDept;
import com.ylc.permission.mapper.SysDeptMapper;
import com.ylc.permission.service.ISysDeptService;
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
public class SysDeptServiceImpl extends ServiceImpl<SysDeptMapper, SysDept> implements ISysDeptService {

    @Autowired
    private SysDeptMapper sysDeptMapper;

    @Override
    public List<SysDept> selectAllDept() {
        return sysDeptMapper.selectAllDept();
    }
}
