package com.xgsama.seckill.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * SimpleOrderDTO
 * 定单
 * 说明： 秒杀商品表和主商品表不同
 *
 * @author : xgSama
 * @date : 2021/8/31 22:48:45
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SimpleOrderDTO implements Serializable {
    //秒杀用户的用户ID
    private Long userId;


    //秒杀商品，和订单是一对多的关系
    private Long skuId;

    //验证码
    String md5;
}
