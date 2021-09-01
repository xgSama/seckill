package com.xgsama.seckill.stock.consumer;

import com.alibaba.otter.canal.protocol.FlatMessage;

import java.util.Collection;

/**
 * CanalSynService
 *
 * @author : xgSama
 * @date : 2021/9/1 21:07:58
 */
public interface CanalSynService<T> {

    /**
     * 处理数据
     *
     * @param flatMessage CanalMQ数据
     */
    void process(FlatMessage flatMessage);

    /**
     * DDL语句处理
     *
     * @param flatMessage CanalMQ数据
     */
    void ddl(FlatMessage flatMessage);

    /**
     * 插入
     *
     * @param list 新增数据
     */
    void insert(Collection<T> list);

    /**
     * 更新
     *
     * @param list 更新数据
     */
    void update(Collection<T> list);

    /**
     * 删除
     *
     * @param list 删除数据
     */
    void delete(Collection<T> list);
}
