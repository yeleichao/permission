package com.ylc.permission.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.List;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author ylc
 * @since 2019-11-30
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysAclModule implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type= IdType.AUTO)
    private Integer id;

    /**
     * 权限模块名称
     */
    private String name;

    /**
     * 上级权限模块id
     */
    private Integer parentId;

    /**
     * 权限模块层级
     */
    private String level;

    /**
     * 权限模块在当前层级下的顺序，由小到大
     */
    private Integer seq;

    /**
     * 状态，1：正常，0：冻结
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 最后一次操作时间
     */
    private LocalDateTime operateTime;

    /**
     * 最后一次更新操作者的ip地址
     */
    private String operateIp;


    private List<SysAclModule> children;
}
