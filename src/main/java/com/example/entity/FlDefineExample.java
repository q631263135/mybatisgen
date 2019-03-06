package com.example.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FlDefineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FlDefineExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andRIdIsNull() {
            addCriterion("R_ID is null");
            return (Criteria) this;
        }

        public Criteria andRIdIsNotNull() {
            addCriterion("R_ID is not null");
            return (Criteria) this;
        }

        public Criteria andRIdEqualTo(Long value) {
            addCriterion("R_ID =", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotEqualTo(Long value) {
            addCriterion("R_ID <>", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThan(Long value) {
            addCriterion("R_ID >", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdGreaterThanOrEqualTo(Long value) {
            addCriterion("R_ID >=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThan(Long value) {
            addCriterion("R_ID <", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdLessThanOrEqualTo(Long value) {
            addCriterion("R_ID <=", value, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdIn(List<Long> values) {
            addCriterion("R_ID in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotIn(List<Long> values) {
            addCriterion("R_ID not in", values, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdBetween(Long value1, Long value2) {
            addCriterion("R_ID between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andRIdNotBetween(Long value1, Long value2) {
            addCriterion("R_ID not between", value1, value2, "rId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOTypeIsNull() {
            addCriterion("O_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOTypeIsNotNull() {
            addCriterion("O_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOTypeEqualTo(BigDecimal value) {
            addCriterion("O_TYPE =", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotEqualTo(BigDecimal value) {
            addCriterion("O_TYPE <>", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeGreaterThan(BigDecimal value) {
            addCriterion("O_TYPE >", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("O_TYPE >=", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLessThan(BigDecimal value) {
            addCriterion("O_TYPE <", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("O_TYPE <=", value, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeIn(List<BigDecimal> values) {
            addCriterion("O_TYPE in", values, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotIn(List<BigDecimal> values) {
            addCriterion("O_TYPE not in", values, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_TYPE between", value1, value2, "oType");
            return (Criteria) this;
        }

        public Criteria andOTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("O_TYPE not between", value1, value2, "oType");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNull() {
            addCriterion("TABLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andTableNameIsNotNull() {
            addCriterion("TABLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andTableNameEqualTo(String value) {
            addCriterion("TABLE_NAME =", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotEqualTo(String value) {
            addCriterion("TABLE_NAME <>", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThan(String value) {
            addCriterion("TABLE_NAME >", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME >=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThan(String value) {
            addCriterion("TABLE_NAME <", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLessThanOrEqualTo(String value) {
            addCriterion("TABLE_NAME <=", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameLike(String value) {
            addCriterion("TABLE_NAME like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotLike(String value) {
            addCriterion("TABLE_NAME not like", value, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameIn(List<String> values) {
            addCriterion("TABLE_NAME in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotIn(List<String> values) {
            addCriterion("TABLE_NAME not in", values, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameBetween(String value1, String value2) {
            addCriterion("TABLE_NAME between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andTableNameNotBetween(String value1, String value2) {
            addCriterion("TABLE_NAME not between", value1, value2, "tableName");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNull() {
            addCriterion("MENU_ID is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("MENU_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(String value) {
            addCriterion("MENU_ID =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(String value) {
            addCriterion("MENU_ID <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(String value) {
            addCriterion("MENU_ID >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(String value) {
            addCriterion("MENU_ID >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(String value) {
            addCriterion("MENU_ID <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(String value) {
            addCriterion("MENU_ID <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLike(String value) {
            addCriterion("MENU_ID like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotLike(String value) {
            addCriterion("MENU_ID not like", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<String> values) {
            addCriterion("MENU_ID in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<String> values) {
            addCriterion("MENU_ID not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(String value1, String value2) {
            addCriterion("MENU_ID between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(String value1, String value2) {
            addCriterion("MENU_ID not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andUserSearchIsNull() {
            addCriterion("USER_SEARCH is null");
            return (Criteria) this;
        }

        public Criteria andUserSearchIsNotNull() {
            addCriterion("USER_SEARCH is not null");
            return (Criteria) this;
        }

        public Criteria andUserSearchEqualTo(String value) {
            addCriterion("USER_SEARCH =", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchNotEqualTo(String value) {
            addCriterion("USER_SEARCH <>", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchGreaterThan(String value) {
            addCriterion("USER_SEARCH >", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchGreaterThanOrEqualTo(String value) {
            addCriterion("USER_SEARCH >=", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchLessThan(String value) {
            addCriterion("USER_SEARCH <", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchLessThanOrEqualTo(String value) {
            addCriterion("USER_SEARCH <=", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchLike(String value) {
            addCriterion("USER_SEARCH like", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchNotLike(String value) {
            addCriterion("USER_SEARCH not like", value, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchIn(List<String> values) {
            addCriterion("USER_SEARCH in", values, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchNotIn(List<String> values) {
            addCriterion("USER_SEARCH not in", values, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchBetween(String value1, String value2) {
            addCriterion("USER_SEARCH between", value1, value2, "userSearch");
            return (Criteria) this;
        }

        public Criteria andUserSearchNotBetween(String value1, String value2) {
            addCriterion("USER_SEARCH not between", value1, value2, "userSearch");
            return (Criteria) this;
        }

        public Criteria andExpressIsNull() {
            addCriterion("EXPRESS is null");
            return (Criteria) this;
        }

        public Criteria andExpressIsNotNull() {
            addCriterion("EXPRESS is not null");
            return (Criteria) this;
        }

        public Criteria andExpressEqualTo(String value) {
            addCriterion("EXPRESS =", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotEqualTo(String value) {
            addCriterion("EXPRESS <>", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressGreaterThan(String value) {
            addCriterion("EXPRESS >", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressGreaterThanOrEqualTo(String value) {
            addCriterion("EXPRESS >=", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLessThan(String value) {
            addCriterion("EXPRESS <", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLessThanOrEqualTo(String value) {
            addCriterion("EXPRESS <=", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressLike(String value) {
            addCriterion("EXPRESS like", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotLike(String value) {
            addCriterion("EXPRESS not like", value, "express");
            return (Criteria) this;
        }

        public Criteria andExpressIn(List<String> values) {
            addCriterion("EXPRESS in", values, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotIn(List<String> values) {
            addCriterion("EXPRESS not in", values, "express");
            return (Criteria) this;
        }

        public Criteria andExpressBetween(String value1, String value2) {
            addCriterion("EXPRESS between", value1, value2, "express");
            return (Criteria) this;
        }

        public Criteria andExpressNotBetween(String value1, String value2) {
            addCriterion("EXPRESS not between", value1, value2, "express");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesIsNull() {
            addCriterion("EXCLUDE_COL_CODES is null");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesIsNotNull() {
            addCriterion("EXCLUDE_COL_CODES is not null");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesEqualTo(String value) {
            addCriterion("EXCLUDE_COL_CODES =", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesNotEqualTo(String value) {
            addCriterion("EXCLUDE_COL_CODES <>", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesGreaterThan(String value) {
            addCriterion("EXCLUDE_COL_CODES >", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesGreaterThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_COL_CODES >=", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesLessThan(String value) {
            addCriterion("EXCLUDE_COL_CODES <", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesLessThanOrEqualTo(String value) {
            addCriterion("EXCLUDE_COL_CODES <=", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesLike(String value) {
            addCriterion("EXCLUDE_COL_CODES like", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesNotLike(String value) {
            addCriterion("EXCLUDE_COL_CODES not like", value, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesIn(List<String> values) {
            addCriterion("EXCLUDE_COL_CODES in", values, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesNotIn(List<String> values) {
            addCriterion("EXCLUDE_COL_CODES not in", values, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesBetween(String value1, String value2) {
            addCriterion("EXCLUDE_COL_CODES between", value1, value2, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andExcludeColCodesNotBetween(String value1, String value2) {
            addCriterion("EXCLUDE_COL_CODES not between", value1, value2, "excludeColCodes");
            return (Criteria) this;
        }

        public Criteria andCanOperateIsNull() {
            addCriterion("CAN_OPERATE is null");
            return (Criteria) this;
        }

        public Criteria andCanOperateIsNotNull() {
            addCriterion("CAN_OPERATE is not null");
            return (Criteria) this;
        }

        public Criteria andCanOperateEqualTo(Short value) {
            addCriterion("CAN_OPERATE =", value, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateNotEqualTo(Short value) {
            addCriterion("CAN_OPERATE <>", value, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateGreaterThan(Short value) {
            addCriterion("CAN_OPERATE >", value, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateGreaterThanOrEqualTo(Short value) {
            addCriterion("CAN_OPERATE >=", value, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateLessThan(Short value) {
            addCriterion("CAN_OPERATE <", value, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateLessThanOrEqualTo(Short value) {
            addCriterion("CAN_OPERATE <=", value, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateIn(List<Short> values) {
            addCriterion("CAN_OPERATE in", values, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateNotIn(List<Short> values) {
            addCriterion("CAN_OPERATE not in", values, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateBetween(Short value1, Short value2) {
            addCriterion("CAN_OPERATE between", value1, value2, "canOperate");
            return (Criteria) this;
        }

        public Criteria andCanOperateNotBetween(Short value1, Short value2) {
            addCriterion("CAN_OPERATE not between", value1, value2, "canOperate");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Short value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Short value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Short value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Short value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Short value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Short> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Short> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Short value1, Short value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Short value1, Short value2) {
            addCriterion("TYPE not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNull() {
            addCriterion("OPERATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIsNotNull() {
            addCriterion("OPERATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTypeEqualTo(BigDecimal value) {
            addCriterion("OPERATE_TYPE =", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotEqualTo(BigDecimal value) {
            addCriterion("OPERATE_TYPE <>", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThan(BigDecimal value) {
            addCriterion("OPERATE_TYPE >", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATE_TYPE >=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThan(BigDecimal value) {
            addCriterion("OPERATE_TYPE <", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OPERATE_TYPE <=", value, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeIn(List<BigDecimal> values) {
            addCriterion("OPERATE_TYPE in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotIn(List<BigDecimal> values) {
            addCriterion("OPERATE_TYPE not in", values, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATE_TYPE between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andOperateTypeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OPERATE_TYPE not between", value1, value2, "operateType");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNull() {
            addCriterion("FORM_ID is null");
            return (Criteria) this;
        }

        public Criteria andFormIdIsNotNull() {
            addCriterion("FORM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFormIdEqualTo(BigDecimal value) {
            addCriterion("FORM_ID =", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotEqualTo(BigDecimal value) {
            addCriterion("FORM_ID <>", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThan(BigDecimal value) {
            addCriterion("FORM_ID >", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_ID >=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThan(BigDecimal value) {
            addCriterion("FORM_ID <", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FORM_ID <=", value, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdIn(List<BigDecimal> values) {
            addCriterion("FORM_ID in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotIn(List<BigDecimal> values) {
            addCriterion("FORM_ID not in", values, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_ID between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFormIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FORM_ID not between", value1, value2, "formId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNull() {
            addCriterion("FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andFlowIdIsNotNull() {
            addCriterion("FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFlowIdEqualTo(BigDecimal value) {
            addCriterion("FLOW_ID =", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotEqualTo(BigDecimal value) {
            addCriterion("FLOW_ID <>", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThan(BigDecimal value) {
            addCriterion("FLOW_ID >", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOW_ID >=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThan(BigDecimal value) {
            addCriterion("FLOW_ID <", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FLOW_ID <=", value, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdIn(List<BigDecimal> values) {
            addCriterion("FLOW_ID in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotIn(List<BigDecimal> values) {
            addCriterion("FLOW_ID not in", values, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOW_ID between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andFlowIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FLOW_ID not between", value1, value2, "flowId");
            return (Criteria) this;
        }

        public Criteria andCanViewIsNull() {
            addCriterion("CAN_VIEW is null");
            return (Criteria) this;
        }

        public Criteria andCanViewIsNotNull() {
            addCriterion("CAN_VIEW is not null");
            return (Criteria) this;
        }

        public Criteria andCanViewEqualTo(Short value) {
            addCriterion("CAN_VIEW =", value, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewNotEqualTo(Short value) {
            addCriterion("CAN_VIEW <>", value, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewGreaterThan(Short value) {
            addCriterion("CAN_VIEW >", value, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewGreaterThanOrEqualTo(Short value) {
            addCriterion("CAN_VIEW >=", value, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewLessThan(Short value) {
            addCriterion("CAN_VIEW <", value, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewLessThanOrEqualTo(Short value) {
            addCriterion("CAN_VIEW <=", value, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewIn(List<Short> values) {
            addCriterion("CAN_VIEW in", values, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewNotIn(List<Short> values) {
            addCriterion("CAN_VIEW not in", values, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewBetween(Short value1, Short value2) {
            addCriterion("CAN_VIEW between", value1, value2, "canView");
            return (Criteria) this;
        }

        public Criteria andCanViewNotBetween(Short value1, Short value2) {
            addCriterion("CAN_VIEW not between", value1, value2, "canView");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsIsNull() {
            addCriterion("HIDDEN_PARAMS is null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsIsNotNull() {
            addCriterion("HIDDEN_PARAMS is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS =", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsNotEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS <>", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsGreaterThan(String value) {
            addCriterion("HIDDEN_PARAMS >", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsGreaterThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS >=", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsLessThan(String value) {
            addCriterion("HIDDEN_PARAMS <", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsLessThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS <=", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsLike(String value) {
            addCriterion("HIDDEN_PARAMS like", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsNotLike(String value) {
            addCriterion("HIDDEN_PARAMS not like", value, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS in", values, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsNotIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS not in", values, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS between", value1, value2, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsNotBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS not between", value1, value2, "hiddenParams");
            return (Criteria) this;
        }

        public Criteria andParamsUrlIsNull() {
            addCriterion("PARAMS_URL is null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlIsNotNull() {
            addCriterion("PARAMS_URL is not null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlEqualTo(String value) {
            addCriterion("PARAMS_URL =", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlNotEqualTo(String value) {
            addCriterion("PARAMS_URL <>", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlGreaterThan(String value) {
            addCriterion("PARAMS_URL >", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL >=", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlLessThan(String value) {
            addCriterion("PARAMS_URL <", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL <=", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlLike(String value) {
            addCriterion("PARAMS_URL like", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlNotLike(String value) {
            addCriterion("PARAMS_URL not like", value, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlIn(List<String> values) {
            addCriterion("PARAMS_URL in", values, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlNotIn(List<String> values) {
            addCriterion("PARAMS_URL not in", values, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlBetween(String value1, String value2) {
            addCriterion("PARAMS_URL between", value1, value2, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andParamsUrlNotBetween(String value1, String value2) {
            addCriterion("PARAMS_URL not between", value1, value2, "paramsUrl");
            return (Criteria) this;
        }

        public Criteria andCanDeleteIsNull() {
            addCriterion("CAN_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andCanDeleteIsNotNull() {
            addCriterion("CAN_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andCanDeleteEqualTo(Short value) {
            addCriterion("CAN_DELETE =", value, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteNotEqualTo(Short value) {
            addCriterion("CAN_DELETE <>", value, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteGreaterThan(Short value) {
            addCriterion("CAN_DELETE >", value, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteGreaterThanOrEqualTo(Short value) {
            addCriterion("CAN_DELETE >=", value, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteLessThan(Short value) {
            addCriterion("CAN_DELETE <", value, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteLessThanOrEqualTo(Short value) {
            addCriterion("CAN_DELETE <=", value, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteIn(List<Short> values) {
            addCriterion("CAN_DELETE in", values, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteNotIn(List<Short> values) {
            addCriterion("CAN_DELETE not in", values, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteBetween(Short value1, Short value2) {
            addCriterion("CAN_DELETE between", value1, value2, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanDeleteNotBetween(Short value1, Short value2) {
            addCriterion("CAN_DELETE not between", value1, value2, "canDelete");
            return (Criteria) this;
        }

        public Criteria andCanAddIsNull() {
            addCriterion("CAN_ADD is null");
            return (Criteria) this;
        }

        public Criteria andCanAddIsNotNull() {
            addCriterion("CAN_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andCanAddEqualTo(Short value) {
            addCriterion("CAN_ADD =", value, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddNotEqualTo(Short value) {
            addCriterion("CAN_ADD <>", value, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddGreaterThan(Short value) {
            addCriterion("CAN_ADD >", value, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddGreaterThanOrEqualTo(Short value) {
            addCriterion("CAN_ADD >=", value, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddLessThan(Short value) {
            addCriterion("CAN_ADD <", value, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddLessThanOrEqualTo(Short value) {
            addCriterion("CAN_ADD <=", value, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddIn(List<Short> values) {
            addCriterion("CAN_ADD in", values, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddNotIn(List<Short> values) {
            addCriterion("CAN_ADD not in", values, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddBetween(Short value1, Short value2) {
            addCriterion("CAN_ADD between", value1, value2, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanAddNotBetween(Short value1, Short value2) {
            addCriterion("CAN_ADD not between", value1, value2, "canAdd");
            return (Criteria) this;
        }

        public Criteria andCanUpdateIsNull() {
            addCriterion("CAN_UPDATE is null");
            return (Criteria) this;
        }

        public Criteria andCanUpdateIsNotNull() {
            addCriterion("CAN_UPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCanUpdateEqualTo(Short value) {
            addCriterion("CAN_UPDATE =", value, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateNotEqualTo(Short value) {
            addCriterion("CAN_UPDATE <>", value, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateGreaterThan(Short value) {
            addCriterion("CAN_UPDATE >", value, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateGreaterThanOrEqualTo(Short value) {
            addCriterion("CAN_UPDATE >=", value, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateLessThan(Short value) {
            addCriterion("CAN_UPDATE <", value, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateLessThanOrEqualTo(Short value) {
            addCriterion("CAN_UPDATE <=", value, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateIn(List<Short> values) {
            addCriterion("CAN_UPDATE in", values, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateNotIn(List<Short> values) {
            addCriterion("CAN_UPDATE not in", values, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateBetween(Short value1, Short value2) {
            addCriterion("CAN_UPDATE between", value1, value2, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanUpdateNotBetween(Short value1, Short value2) {
            addCriterion("CAN_UPDATE not between", value1, value2, "canUpdate");
            return (Criteria) this;
        }

        public Criteria andCanExportIsNull() {
            addCriterion("CAN_EXPORT is null");
            return (Criteria) this;
        }

        public Criteria andCanExportIsNotNull() {
            addCriterion("CAN_EXPORT is not null");
            return (Criteria) this;
        }

        public Criteria andCanExportEqualTo(Short value) {
            addCriterion("CAN_EXPORT =", value, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportNotEqualTo(Short value) {
            addCriterion("CAN_EXPORT <>", value, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportGreaterThan(Short value) {
            addCriterion("CAN_EXPORT >", value, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportGreaterThanOrEqualTo(Short value) {
            addCriterion("CAN_EXPORT >=", value, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportLessThan(Short value) {
            addCriterion("CAN_EXPORT <", value, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportLessThanOrEqualTo(Short value) {
            addCriterion("CAN_EXPORT <=", value, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportIn(List<Short> values) {
            addCriterion("CAN_EXPORT in", values, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportNotIn(List<Short> values) {
            addCriterion("CAN_EXPORT not in", values, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportBetween(Short value1, Short value2) {
            addCriterion("CAN_EXPORT between", value1, value2, "canExport");
            return (Criteria) this;
        }

        public Criteria andCanExportNotBetween(Short value1, Short value2) {
            addCriterion("CAN_EXPORT not between", value1, value2, "canExport");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdIsNull() {
            addCriterion("STEP_MODULE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdIsNotNull() {
            addCriterion("STEP_MODULE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdEqualTo(BigDecimal value) {
            addCriterion("STEP_MODULE_ID =", value, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdNotEqualTo(BigDecimal value) {
            addCriterion("STEP_MODULE_ID <>", value, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdGreaterThan(BigDecimal value) {
            addCriterion("STEP_MODULE_ID >", value, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("STEP_MODULE_ID >=", value, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdLessThan(BigDecimal value) {
            addCriterion("STEP_MODULE_ID <", value, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdLessThanOrEqualTo(BigDecimal value) {
            addCriterion("STEP_MODULE_ID <=", value, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdIn(List<BigDecimal> values) {
            addCriterion("STEP_MODULE_ID in", values, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdNotIn(List<BigDecimal> values) {
            addCriterion("STEP_MODULE_ID not in", values, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STEP_MODULE_ID between", value1, value2, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andStepModuleIdNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("STEP_MODULE_ID not between", value1, value2, "stepModuleId");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectIsNull() {
            addCriterion("MULTIPLE_SELECT is null");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectIsNotNull() {
            addCriterion("MULTIPLE_SELECT is not null");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectEqualTo(Short value) {
            addCriterion("MULTIPLE_SELECT =", value, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectNotEqualTo(Short value) {
            addCriterion("MULTIPLE_SELECT <>", value, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectGreaterThan(Short value) {
            addCriterion("MULTIPLE_SELECT >", value, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectGreaterThanOrEqualTo(Short value) {
            addCriterion("MULTIPLE_SELECT >=", value, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectLessThan(Short value) {
            addCriterion("MULTIPLE_SELECT <", value, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectLessThanOrEqualTo(Short value) {
            addCriterion("MULTIPLE_SELECT <=", value, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectIn(List<Short> values) {
            addCriterion("MULTIPLE_SELECT in", values, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectNotIn(List<Short> values) {
            addCriterion("MULTIPLE_SELECT not in", values, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectBetween(Short value1, Short value2) {
            addCriterion("MULTIPLE_SELECT between", value1, value2, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andMultipleSelectNotBetween(Short value1, Short value2) {
            addCriterion("MULTIPLE_SELECT not between", value1, value2, "multipleSelect");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlIsNull() {
            addCriterion("TOOL_PAGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlIsNotNull() {
            addCriterion("TOOL_PAGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlEqualTo(String value) {
            addCriterion("TOOL_PAGE_URL =", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlNotEqualTo(String value) {
            addCriterion("TOOL_PAGE_URL <>", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlGreaterThan(String value) {
            addCriterion("TOOL_PAGE_URL >", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlGreaterThanOrEqualTo(String value) {
            addCriterion("TOOL_PAGE_URL >=", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlLessThan(String value) {
            addCriterion("TOOL_PAGE_URL <", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlLessThanOrEqualTo(String value) {
            addCriterion("TOOL_PAGE_URL <=", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlLike(String value) {
            addCriterion("TOOL_PAGE_URL like", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlNotLike(String value) {
            addCriterion("TOOL_PAGE_URL not like", value, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlIn(List<String> values) {
            addCriterion("TOOL_PAGE_URL in", values, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlNotIn(List<String> values) {
            addCriterion("TOOL_PAGE_URL not in", values, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlBetween(String value1, String value2) {
            addCriterion("TOOL_PAGE_URL between", value1, value2, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andToolPageUrlNotBetween(String value1, String value2) {
            addCriterion("TOOL_PAGE_URL not between", value1, value2, "toolPageUrl");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddIsNull() {
            addCriterion("HIDDEN_PARAMS_FOR_ADD is null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddIsNotNull() {
            addCriterion("HIDDEN_PARAMS_FOR_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD =", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddNotEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD <>", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddGreaterThan(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD >", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddGreaterThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD >=", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddLessThan(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD <", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddLessThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD <=", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddLike(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD like", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddNotLike(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD not like", value, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD in", values, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddNotIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD not in", values, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD between", value1, value2, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForAddNotBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS_FOR_ADD not between", value1, value2, "hiddenParamsForAdd");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditIsNull() {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT is null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditIsNotNull() {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT =", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditNotEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT <>", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditGreaterThan(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT >", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditGreaterThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT >=", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditLessThan(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT <", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditLessThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT <=", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditLike(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT like", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditNotLike(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT not like", value, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT in", values, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditNotIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT not in", values, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT between", value1, value2, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForEditNotBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS_FOR_EDIT not between", value1, value2, "hiddenParamsForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddIsNull() {
            addCriterion("PARAMS_URL_FOR_ADD is null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddIsNotNull() {
            addCriterion("PARAMS_URL_FOR_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_ADD =", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddNotEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_ADD <>", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddGreaterThan(String value) {
            addCriterion("PARAMS_URL_FOR_ADD >", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_ADD >=", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddLessThan(String value) {
            addCriterion("PARAMS_URL_FOR_ADD <", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_ADD <=", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddLike(String value) {
            addCriterion("PARAMS_URL_FOR_ADD like", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddNotLike(String value) {
            addCriterion("PARAMS_URL_FOR_ADD not like", value, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddIn(List<String> values) {
            addCriterion("PARAMS_URL_FOR_ADD in", values, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddNotIn(List<String> values) {
            addCriterion("PARAMS_URL_FOR_ADD not in", values, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddBetween(String value1, String value2) {
            addCriterion("PARAMS_URL_FOR_ADD between", value1, value2, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForAddNotBetween(String value1, String value2) {
            addCriterion("PARAMS_URL_FOR_ADD not between", value1, value2, "paramsUrlForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditIsNull() {
            addCriterion("PARAMS_URL_FOR_EDIT is null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditIsNotNull() {
            addCriterion("PARAMS_URL_FOR_EDIT is not null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT =", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditNotEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT <>", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditGreaterThan(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT >", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT >=", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditLessThan(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT <", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT <=", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditLike(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT like", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditNotLike(String value) {
            addCriterion("PARAMS_URL_FOR_EDIT not like", value, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditIn(List<String> values) {
            addCriterion("PARAMS_URL_FOR_EDIT in", values, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditNotIn(List<String> values) {
            addCriterion("PARAMS_URL_FOR_EDIT not in", values, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditBetween(String value1, String value2) {
            addCriterion("PARAMS_URL_FOR_EDIT between", value1, value2, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForEditNotBetween(String value1, String value2) {
            addCriterion("PARAMS_URL_FOR_EDIT not between", value1, value2, "paramsUrlForEdit");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteIsNull() {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteIsNotNull() {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE =", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteNotEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE <>", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteGreaterThan(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE >", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE >=", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteLessThan(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE <", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteLessThanOrEqualTo(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE <=", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteLike(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE like", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteNotLike(String value) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE not like", value, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE in", values, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteNotIn(List<String> values) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE not in", values, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE between", value1, value2, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andHiddenParamsForDeleteNotBetween(String value1, String value2) {
            addCriterion("HIDDEN_PARAMS_FOR_DELETE not between", value1, value2, "hiddenParamsForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteIsNull() {
            addCriterion("PARAMS_URL_FOR_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteIsNotNull() {
            addCriterion("PARAMS_URL_FOR_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE =", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteNotEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE <>", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteGreaterThan(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE >", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE >=", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteLessThan(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE <", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE <=", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteLike(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE like", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteNotLike(String value) {
            addCriterion("PARAMS_URL_FOR_DELETE not like", value, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteIn(List<String> values) {
            addCriterion("PARAMS_URL_FOR_DELETE in", values, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteNotIn(List<String> values) {
            addCriterion("PARAMS_URL_FOR_DELETE not in", values, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteBetween(String value1, String value2) {
            addCriterion("PARAMS_URL_FOR_DELETE between", value1, value2, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsUrlForDeleteNotBetween(String value1, String value2) {
            addCriterion("PARAMS_URL_FOR_DELETE not between", value1, value2, "paramsUrlForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueIsNull() {
            addCriterion("PARAMS_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andParamsValueIsNotNull() {
            addCriterion("PARAMS_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andParamsValueEqualTo(String value) {
            addCriterion("PARAMS_VALUE =", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueNotEqualTo(String value) {
            addCriterion("PARAMS_VALUE <>", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueGreaterThan(String value) {
            addCriterion("PARAMS_VALUE >", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE >=", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueLessThan(String value) {
            addCriterion("PARAMS_VALUE <", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE <=", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueLike(String value) {
            addCriterion("PARAMS_VALUE like", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueNotLike(String value) {
            addCriterion("PARAMS_VALUE not like", value, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueIn(List<String> values) {
            addCriterion("PARAMS_VALUE in", values, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueNotIn(List<String> values) {
            addCriterion("PARAMS_VALUE not in", values, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE between", value1, value2, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueNotBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE not between", value1, value2, "paramsValue");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddIsNull() {
            addCriterion("PARAMS_VALUE_FOR_ADD is null");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddIsNotNull() {
            addCriterion("PARAMS_VALUE_FOR_ADD is not null");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD =", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddNotEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD <>", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddGreaterThan(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD >", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD >=", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddLessThan(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD <", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD <=", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddLike(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD like", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddNotLike(String value) {
            addCriterion("PARAMS_VALUE_FOR_ADD not like", value, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddIn(List<String> values) {
            addCriterion("PARAMS_VALUE_FOR_ADD in", values, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddNotIn(List<String> values) {
            addCriterion("PARAMS_VALUE_FOR_ADD not in", values, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE_FOR_ADD between", value1, value2, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForAddNotBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE_FOR_ADD not between", value1, value2, "paramsValueForAdd");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditIsNull() {
            addCriterion("PARAMS_VALUE_FOR_EDIT is null");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditIsNotNull() {
            addCriterion("PARAMS_VALUE_FOR_EDIT is not null");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT =", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditNotEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT <>", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditGreaterThan(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT >", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT >=", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditLessThan(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT <", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT <=", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditLike(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT like", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditNotLike(String value) {
            addCriterion("PARAMS_VALUE_FOR_EDIT not like", value, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditIn(List<String> values) {
            addCriterion("PARAMS_VALUE_FOR_EDIT in", values, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditNotIn(List<String> values) {
            addCriterion("PARAMS_VALUE_FOR_EDIT not in", values, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE_FOR_EDIT between", value1, value2, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForEditNotBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE_FOR_EDIT not between", value1, value2, "paramsValueForEdit");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteIsNull() {
            addCriterion("PARAMS_VALUE_FOR_DELETE is null");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteIsNotNull() {
            addCriterion("PARAMS_VALUE_FOR_DELETE is not null");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE =", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteNotEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE <>", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteGreaterThan(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE >", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteGreaterThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE >=", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteLessThan(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE <", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteLessThanOrEqualTo(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE <=", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteLike(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE like", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteNotLike(String value) {
            addCriterion("PARAMS_VALUE_FOR_DELETE not like", value, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteIn(List<String> values) {
            addCriterion("PARAMS_VALUE_FOR_DELETE in", values, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteNotIn(List<String> values) {
            addCriterion("PARAMS_VALUE_FOR_DELETE not in", values, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE_FOR_DELETE between", value1, value2, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andParamsValueForDeleteNotBetween(String value1, String value2) {
            addCriterion("PARAMS_VALUE_FOR_DELETE not between", value1, value2, "paramsValueForDelete");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionIsNull() {
            addCriterion("SELF_QUERY_CONDITION is null");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionIsNotNull() {
            addCriterion("SELF_QUERY_CONDITION is not null");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionEqualTo(String value) {
            addCriterion("SELF_QUERY_CONDITION =", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionNotEqualTo(String value) {
            addCriterion("SELF_QUERY_CONDITION <>", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionGreaterThan(String value) {
            addCriterion("SELF_QUERY_CONDITION >", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_QUERY_CONDITION >=", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionLessThan(String value) {
            addCriterion("SELF_QUERY_CONDITION <", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionLessThanOrEqualTo(String value) {
            addCriterion("SELF_QUERY_CONDITION <=", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionLike(String value) {
            addCriterion("SELF_QUERY_CONDITION like", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionNotLike(String value) {
            addCriterion("SELF_QUERY_CONDITION not like", value, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionIn(List<String> values) {
            addCriterion("SELF_QUERY_CONDITION in", values, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionNotIn(List<String> values) {
            addCriterion("SELF_QUERY_CONDITION not in", values, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionBetween(String value1, String value2) {
            addCriterion("SELF_QUERY_CONDITION between", value1, value2, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andSelfQueryConditionNotBetween(String value1, String value2) {
            addCriterion("SELF_QUERY_CONDITION not between", value1, value2, "selfQueryCondition");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnIsNull() {
            addCriterion("SHOW_PROCESS_FLOW_BTN is null");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnIsNotNull() {
            addCriterion("SHOW_PROCESS_FLOW_BTN is not null");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnEqualTo(Short value) {
            addCriterion("SHOW_PROCESS_FLOW_BTN =", value, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnNotEqualTo(Short value) {
            addCriterion("SHOW_PROCESS_FLOW_BTN <>", value, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnGreaterThan(Short value) {
            addCriterion("SHOW_PROCESS_FLOW_BTN >", value, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnGreaterThanOrEqualTo(Short value) {
            addCriterion("SHOW_PROCESS_FLOW_BTN >=", value, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnLessThan(Short value) {
            addCriterion("SHOW_PROCESS_FLOW_BTN <", value, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnLessThanOrEqualTo(Short value) {
            addCriterion("SHOW_PROCESS_FLOW_BTN <=", value, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnIn(List<Short> values) {
            addCriterion("SHOW_PROCESS_FLOW_BTN in", values, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnNotIn(List<Short> values) {
            addCriterion("SHOW_PROCESS_FLOW_BTN not in", values, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnBetween(Short value1, Short value2) {
            addCriterion("SHOW_PROCESS_FLOW_BTN between", value1, value2, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andShowProcessFlowBtnNotBetween(Short value1, Short value2) {
            addCriterion("SHOW_PROCESS_FLOW_BTN not between", value1, value2, "showProcessFlowBtn");
            return (Criteria) this;
        }

        public Criteria andField2IsNull() {
            addCriterion("FIELD2 is null");
            return (Criteria) this;
        }

        public Criteria andField2IsNotNull() {
            addCriterion("FIELD2 is not null");
            return (Criteria) this;
        }

        public Criteria andField2EqualTo(String value) {
            addCriterion("FIELD2 =", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotEqualTo(String value) {
            addCriterion("FIELD2 <>", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThan(String value) {
            addCriterion("FIELD2 >", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2GreaterThanOrEqualTo(String value) {
            addCriterion("FIELD2 >=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThan(String value) {
            addCriterion("FIELD2 <", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2LessThanOrEqualTo(String value) {
            addCriterion("FIELD2 <=", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Like(String value) {
            addCriterion("FIELD2 like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotLike(String value) {
            addCriterion("FIELD2 not like", value, "field2");
            return (Criteria) this;
        }

        public Criteria andField2In(List<String> values) {
            addCriterion("FIELD2 in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotIn(List<String> values) {
            addCriterion("FIELD2 not in", values, "field2");
            return (Criteria) this;
        }

        public Criteria andField2Between(String value1, String value2) {
            addCriterion("FIELD2 between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField2NotBetween(String value1, String value2) {
            addCriterion("FIELD2 not between", value1, value2, "field2");
            return (Criteria) this;
        }

        public Criteria andField3IsNull() {
            addCriterion("FIELD3 is null");
            return (Criteria) this;
        }

        public Criteria andField3IsNotNull() {
            addCriterion("FIELD3 is not null");
            return (Criteria) this;
        }

        public Criteria andField3EqualTo(String value) {
            addCriterion("FIELD3 =", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotEqualTo(String value) {
            addCriterion("FIELD3 <>", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThan(String value) {
            addCriterion("FIELD3 >", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3GreaterThanOrEqualTo(String value) {
            addCriterion("FIELD3 >=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThan(String value) {
            addCriterion("FIELD3 <", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3LessThanOrEqualTo(String value) {
            addCriterion("FIELD3 <=", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Like(String value) {
            addCriterion("FIELD3 like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotLike(String value) {
            addCriterion("FIELD3 not like", value, "field3");
            return (Criteria) this;
        }

        public Criteria andField3In(List<String> values) {
            addCriterion("FIELD3 in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotIn(List<String> values) {
            addCriterion("FIELD3 not in", values, "field3");
            return (Criteria) this;
        }

        public Criteria andField3Between(String value1, String value2) {
            addCriterion("FIELD3 between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField3NotBetween(String value1, String value2) {
            addCriterion("FIELD3 not between", value1, value2, "field3");
            return (Criteria) this;
        }

        public Criteria andField4IsNull() {
            addCriterion("FIELD4 is null");
            return (Criteria) this;
        }

        public Criteria andField4IsNotNull() {
            addCriterion("FIELD4 is not null");
            return (Criteria) this;
        }

        public Criteria andField4EqualTo(String value) {
            addCriterion("FIELD4 =", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotEqualTo(String value) {
            addCriterion("FIELD4 <>", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThan(String value) {
            addCriterion("FIELD4 >", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4GreaterThanOrEqualTo(String value) {
            addCriterion("FIELD4 >=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThan(String value) {
            addCriterion("FIELD4 <", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4LessThanOrEqualTo(String value) {
            addCriterion("FIELD4 <=", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Like(String value) {
            addCriterion("FIELD4 like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotLike(String value) {
            addCriterion("FIELD4 not like", value, "field4");
            return (Criteria) this;
        }

        public Criteria andField4In(List<String> values) {
            addCriterion("FIELD4 in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotIn(List<String> values) {
            addCriterion("FIELD4 not in", values, "field4");
            return (Criteria) this;
        }

        public Criteria andField4Between(String value1, String value2) {
            addCriterion("FIELD4 between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField4NotBetween(String value1, String value2) {
            addCriterion("FIELD4 not between", value1, value2, "field4");
            return (Criteria) this;
        }

        public Criteria andField5IsNull() {
            addCriterion("FIELD5 is null");
            return (Criteria) this;
        }

        public Criteria andField5IsNotNull() {
            addCriterion("FIELD5 is not null");
            return (Criteria) this;
        }

        public Criteria andField5EqualTo(String value) {
            addCriterion("FIELD5 =", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotEqualTo(String value) {
            addCriterion("FIELD5 <>", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThan(String value) {
            addCriterion("FIELD5 >", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5GreaterThanOrEqualTo(String value) {
            addCriterion("FIELD5 >=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThan(String value) {
            addCriterion("FIELD5 <", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5LessThanOrEqualTo(String value) {
            addCriterion("FIELD5 <=", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Like(String value) {
            addCriterion("FIELD5 like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotLike(String value) {
            addCriterion("FIELD5 not like", value, "field5");
            return (Criteria) this;
        }

        public Criteria andField5In(List<String> values) {
            addCriterion("FIELD5 in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotIn(List<String> values) {
            addCriterion("FIELD5 not in", values, "field5");
            return (Criteria) this;
        }

        public Criteria andField5Between(String value1, String value2) {
            addCriterion("FIELD5 between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andField5NotBetween(String value1, String value2) {
            addCriterion("FIELD5 not between", value1, value2, "field5");
            return (Criteria) this;
        }

        public Criteria andTableCodeIsNull() {
            addCriterion("TABLE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andTableCodeIsNotNull() {
            addCriterion("TABLE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andTableCodeEqualTo(String value) {
            addCriterion("TABLE_CODE =", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotEqualTo(String value) {
            addCriterion("TABLE_CODE <>", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeGreaterThan(String value) {
            addCriterion("TABLE_CODE >", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeGreaterThanOrEqualTo(String value) {
            addCriterion("TABLE_CODE >=", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeLessThan(String value) {
            addCriterion("TABLE_CODE <", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeLessThanOrEqualTo(String value) {
            addCriterion("TABLE_CODE <=", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeLike(String value) {
            addCriterion("TABLE_CODE like", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotLike(String value) {
            addCriterion("TABLE_CODE not like", value, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeIn(List<String> values) {
            addCriterion("TABLE_CODE in", values, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotIn(List<String> values) {
            addCriterion("TABLE_CODE not in", values, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeBetween(String value1, String value2) {
            addCriterion("TABLE_CODE between", value1, value2, "tableCode");
            return (Criteria) this;
        }

        public Criteria andTableCodeNotBetween(String value1, String value2) {
            addCriterion("TABLE_CODE not between", value1, value2, "tableCode");
            return (Criteria) this;
        }

        public Criteria andField1IsNull() {
            addCriterion("FIELD1 is null");
            return (Criteria) this;
        }

        public Criteria andField1IsNotNull() {
            addCriterion("FIELD1 is not null");
            return (Criteria) this;
        }

        public Criteria andField1EqualTo(String value) {
            addCriterion("FIELD1 =", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotEqualTo(String value) {
            addCriterion("FIELD1 <>", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThan(String value) {
            addCriterion("FIELD1 >", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1GreaterThanOrEqualTo(String value) {
            addCriterion("FIELD1 >=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThan(String value) {
            addCriterion("FIELD1 <", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1LessThanOrEqualTo(String value) {
            addCriterion("FIELD1 <=", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Like(String value) {
            addCriterion("FIELD1 like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotLike(String value) {
            addCriterion("FIELD1 not like", value, "field1");
            return (Criteria) this;
        }

        public Criteria andField1In(List<String> values) {
            addCriterion("FIELD1 in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotIn(List<String> values) {
            addCriterion("FIELD1 not in", values, "field1");
            return (Criteria) this;
        }

        public Criteria andField1Between(String value1, String value2) {
            addCriterion("FIELD1 between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andField1NotBetween(String value1, String value2) {
            addCriterion("FIELD1 not between", value1, value2, "field1");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoIsNull() {
            addCriterion("SELF_TABLE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoIsNotNull() {
            addCriterion("SELF_TABLE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoEqualTo(String value) {
            addCriterion("SELF_TABLE_INFO =", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoNotEqualTo(String value) {
            addCriterion("SELF_TABLE_INFO <>", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoGreaterThan(String value) {
            addCriterion("SELF_TABLE_INFO >", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_TABLE_INFO >=", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoLessThan(String value) {
            addCriterion("SELF_TABLE_INFO <", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoLessThanOrEqualTo(String value) {
            addCriterion("SELF_TABLE_INFO <=", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoLike(String value) {
            addCriterion("SELF_TABLE_INFO like", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoNotLike(String value) {
            addCriterion("SELF_TABLE_INFO not like", value, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoIn(List<String> values) {
            addCriterion("SELF_TABLE_INFO in", values, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoNotIn(List<String> values) {
            addCriterion("SELF_TABLE_INFO not in", values, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoBetween(String value1, String value2) {
            addCriterion("SELF_TABLE_INFO between", value1, value2, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andSelfTableInfoNotBetween(String value1, String value2) {
            addCriterion("SELF_TABLE_INFO not between", value1, value2, "selfTableInfo");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteIsNull() {
            addCriterion("RPT_CANDELETE is null");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteIsNotNull() {
            addCriterion("RPT_CANDELETE is not null");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteEqualTo(String value) {
            addCriterion("RPT_CANDELETE =", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteNotEqualTo(String value) {
            addCriterion("RPT_CANDELETE <>", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteGreaterThan(String value) {
            addCriterion("RPT_CANDELETE >", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_CANDELETE >=", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteLessThan(String value) {
            addCriterion("RPT_CANDELETE <", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteLessThanOrEqualTo(String value) {
            addCriterion("RPT_CANDELETE <=", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteLike(String value) {
            addCriterion("RPT_CANDELETE like", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteNotLike(String value) {
            addCriterion("RPT_CANDELETE not like", value, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteIn(List<String> values) {
            addCriterion("RPT_CANDELETE in", values, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteNotIn(List<String> values) {
            addCriterion("RPT_CANDELETE not in", values, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteBetween(String value1, String value2) {
            addCriterion("RPT_CANDELETE between", value1, value2, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCandeleteNotBetween(String value1, String value2) {
            addCriterion("RPT_CANDELETE not between", value1, value2, "rptCandelete");
            return (Criteria) this;
        }

        public Criteria andRptCaneditIsNull() {
            addCriterion("RPT_CANEDIT is null");
            return (Criteria) this;
        }

        public Criteria andRptCaneditIsNotNull() {
            addCriterion("RPT_CANEDIT is not null");
            return (Criteria) this;
        }

        public Criteria andRptCaneditEqualTo(String value) {
            addCriterion("RPT_CANEDIT =", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditNotEqualTo(String value) {
            addCriterion("RPT_CANEDIT <>", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditGreaterThan(String value) {
            addCriterion("RPT_CANEDIT >", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditGreaterThanOrEqualTo(String value) {
            addCriterion("RPT_CANEDIT >=", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditLessThan(String value) {
            addCriterion("RPT_CANEDIT <", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditLessThanOrEqualTo(String value) {
            addCriterion("RPT_CANEDIT <=", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditLike(String value) {
            addCriterion("RPT_CANEDIT like", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditNotLike(String value) {
            addCriterion("RPT_CANEDIT not like", value, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditIn(List<String> values) {
            addCriterion("RPT_CANEDIT in", values, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditNotIn(List<String> values) {
            addCriterion("RPT_CANEDIT not in", values, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditBetween(String value1, String value2) {
            addCriterion("RPT_CANEDIT between", value1, value2, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andRptCaneditNotBetween(String value1, String value2) {
            addCriterion("RPT_CANEDIT not between", value1, value2, "rptCanedit");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingIsNull() {
            addCriterion("CAN_BATCH_PROCESSING is null");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingIsNotNull() {
            addCriterion("CAN_BATCH_PROCESSING is not null");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingEqualTo(BigDecimal value) {
            addCriterion("CAN_BATCH_PROCESSING =", value, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingNotEqualTo(BigDecimal value) {
            addCriterion("CAN_BATCH_PROCESSING <>", value, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingGreaterThan(BigDecimal value) {
            addCriterion("CAN_BATCH_PROCESSING >", value, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAN_BATCH_PROCESSING >=", value, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingLessThan(BigDecimal value) {
            addCriterion("CAN_BATCH_PROCESSING <", value, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAN_BATCH_PROCESSING <=", value, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingIn(List<BigDecimal> values) {
            addCriterion("CAN_BATCH_PROCESSING in", values, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingNotIn(List<BigDecimal> values) {
            addCriterion("CAN_BATCH_PROCESSING not in", values, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAN_BATCH_PROCESSING between", value1, value2, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanBatchProcessingNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAN_BATCH_PROCESSING not between", value1, value2, "canBatchProcessing");
            return (Criteria) this;
        }

        public Criteria andCanMaintainIsNull() {
            addCriterion("CAN_MAINTAIN is null");
            return (Criteria) this;
        }

        public Criteria andCanMaintainIsNotNull() {
            addCriterion("CAN_MAINTAIN is not null");
            return (Criteria) this;
        }

        public Criteria andCanMaintainEqualTo(BigDecimal value) {
            addCriterion("CAN_MAINTAIN =", value, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainNotEqualTo(BigDecimal value) {
            addCriterion("CAN_MAINTAIN <>", value, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainGreaterThan(BigDecimal value) {
            addCriterion("CAN_MAINTAIN >", value, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAN_MAINTAIN >=", value, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainLessThan(BigDecimal value) {
            addCriterion("CAN_MAINTAIN <", value, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAN_MAINTAIN <=", value, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainIn(List<BigDecimal> values) {
            addCriterion("CAN_MAINTAIN in", values, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainNotIn(List<BigDecimal> values) {
            addCriterion("CAN_MAINTAIN not in", values, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAN_MAINTAIN between", value1, value2, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andCanMaintainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAN_MAINTAIN not between", value1, value2, "canMaintain");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidIsNull() {
            addCriterion("NO_FLOW_PROXYID is null");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidIsNotNull() {
            addCriterion("NO_FLOW_PROXYID is not null");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidEqualTo(BigDecimal value) {
            addCriterion("NO_FLOW_PROXYID =", value, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidNotEqualTo(BigDecimal value) {
            addCriterion("NO_FLOW_PROXYID <>", value, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidGreaterThan(BigDecimal value) {
            addCriterion("NO_FLOW_PROXYID >", value, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_FLOW_PROXYID >=", value, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidLessThan(BigDecimal value) {
            addCriterion("NO_FLOW_PROXYID <", value, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NO_FLOW_PROXYID <=", value, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidIn(List<BigDecimal> values) {
            addCriterion("NO_FLOW_PROXYID in", values, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidNotIn(List<BigDecimal> values) {
            addCriterion("NO_FLOW_PROXYID not in", values, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_FLOW_PROXYID between", value1, value2, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andNoFlowProxyidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NO_FLOW_PROXYID not between", value1, value2, "noFlowProxyid");
            return (Criteria) this;
        }

        public Criteria andColFieldParamIsNull() {
            addCriterion("COL_FIELD_PARAM is null");
            return (Criteria) this;
        }

        public Criteria andColFieldParamIsNotNull() {
            addCriterion("COL_FIELD_PARAM is not null");
            return (Criteria) this;
        }

        public Criteria andColFieldParamEqualTo(String value) {
            addCriterion("COL_FIELD_PARAM =", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamNotEqualTo(String value) {
            addCriterion("COL_FIELD_PARAM <>", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamGreaterThan(String value) {
            addCriterion("COL_FIELD_PARAM >", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamGreaterThanOrEqualTo(String value) {
            addCriterion("COL_FIELD_PARAM >=", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamLessThan(String value) {
            addCriterion("COL_FIELD_PARAM <", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamLessThanOrEqualTo(String value) {
            addCriterion("COL_FIELD_PARAM <=", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamLike(String value) {
            addCriterion("COL_FIELD_PARAM like", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamNotLike(String value) {
            addCriterion("COL_FIELD_PARAM not like", value, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamIn(List<String> values) {
            addCriterion("COL_FIELD_PARAM in", values, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamNotIn(List<String> values) {
            addCriterion("COL_FIELD_PARAM not in", values, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamBetween(String value1, String value2) {
            addCriterion("COL_FIELD_PARAM between", value1, value2, "colFieldParam");
            return (Criteria) this;
        }

        public Criteria andColFieldParamNotBetween(String value1, String value2) {
            addCriterion("COL_FIELD_PARAM not between", value1, value2, "colFieldParam");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}