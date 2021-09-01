package com.xgsama.seckill.api.constant;

/**
 * SeckillConstant
 *
 * @author : xgSama
 * @date : 2021/8/31 22:40:38
 */
public class SeckillConstant {
    //订单状态， -1:无效 0:成功 1:已付款
    public static final short ORDER_INVALID = -1;
    public static final short ORDER_VALID = 1;
    public static final short ORDER_PAYED = 2;

    //秒杀的限流阈值
    public static final int MAX_ENTER = 50;
    public static final int PER_SECOND_ENTER = 2;
}
