package com.lvdouwa.daxue.core.feature.orm.dialect;

/**
 * 数据库方言抽象类
 * Created by u6031313 on 8/8/2016.
 */
public abstract class Dialect {
    /**
     * 得到分页sql
     *
     * @param sql
     * @param offset
     * @param limit
     * @return
     */
    public abstract String getLimitString(String sql, int offset, int limit);
    /**
     * 得到总数量 sql
     *
     * @param sql
     * @return
     */
    public abstract String getCountString(String sql);
}
