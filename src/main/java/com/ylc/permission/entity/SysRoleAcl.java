package com.ylc.permission.entity;

import java.time.LocalDateTime;
import java.io.Serializable;

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
public class SysRoleAcl implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type= IdType.AUTO)
    private Integer id;

    /**
     * 角色id
     */
    private Integer roleId;

    /**
     * 权限id
     */
    private Integer aclId;

    /**
     * 操作者
     */
    private String operator;

    /**
     * 最后一次更新的时间
     */
    private LocalDateTime operateTime;

    /**
     * 最后一次更新者的ip
     */
    private String operateIp;


}
