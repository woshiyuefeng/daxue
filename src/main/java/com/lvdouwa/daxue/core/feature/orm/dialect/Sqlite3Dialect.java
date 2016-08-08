package com.lvdouwa.daxue.core.feature.orm.dialect;

/**
 * Created by u6031313 on 8/8/2016.
 */
public class Sqlite3Dialect extends Dialect {

    protected static final String SQL_END_DELIMITER = ";";
    @Override
    public String getLimitString(String sql, int offset, int limit) {
        return null;
    }

    @Override
    public String getCountString(String sql) {
        return null;
    }
}
