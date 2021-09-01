package com.xgsama.seckill.stock.consumer;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

/**
 * SQLType
 *
 * @author : xgSama
 * @date : 2021/9/1 21:06:36
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class SQLType {
    /**
     * 插入
     */
    public static final String INSERT = "INSERT";
    /**
     * 更新
     */
    public static final String UPDATE = "UPDATE";
    /**
     * 删除
     */
    public static final String DELETE = "DELETE";

}
