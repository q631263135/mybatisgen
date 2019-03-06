package com.example.entity;

public class FlDefineWithBLOBs extends FlDefine {
    private String sql;

    private String beforeSql;

    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public String getBeforeSql() {
        return beforeSql;
    }

    public void setBeforeSql(String beforeSql) {
        this.beforeSql = beforeSql;
    }
}