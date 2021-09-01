package com.xgsama.seckill.base.common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * UserDTO
 *
 * @author : xgSama
 * @date : 2021/9/1 21:33:35
 */
@Data
public class UserDTO {

    //用户ID,后台用
    @ApiModelProperty("后台用户ID")
    private Long id;
    //用户ID,前台用
    @ApiModelProperty("前台用户ID")
    private Long userId;
    //用户名
    @ApiModelProperty("用户名")
    private String username;
    //用户登录密码
    @ApiModelProperty("密码")
    private String password;
    //用户姓名
    @ApiModelProperty("昵称")
    private String nickname;
    //用户token
    @ApiModelProperty("令牌")
    private String token;


    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    //创建时间
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date updateTime;


    private String headImgUrl;
    private String mobile;
    private Integer sex;
    private Boolean enabled;
    private String type;
    private String openId;
    private boolean isDel;

}
