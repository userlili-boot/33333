package org.free.manage.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 询价表
 */
@Data
@Table(name = "t_car")
public class Car {

    @ApiModelProperty(value = "主键,自增",example = "1")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ApiModelProperty(value = "车架号",example = "LFPM4ACP1B1A08953")
    private String frameNum;

    @ApiModelProperty(value = "车主姓名",example = "麻恒")
    private String carOwnerName;

    private String carPhone;

    private String carIdCard;

    private Integer operator;

    private Date createTime;

    private Date updateTime;

    private String tpPoliceId;

    private String policeId;
}
