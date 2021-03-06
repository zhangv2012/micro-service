package com.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OauthSystemExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public OauthSystemExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
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

        public Criteria andSystemIdIsNull() {
            addCriterion("`system_id` is null");
            return (Criteria) this;
        }

        public Criteria andSystemIdIsNotNull() {
            addCriterion("`system_id` is not null");
            return (Criteria) this;
        }

        public Criteria andSystemIdEqualTo(Integer value) {
            addCriterion("`system_id` =", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotEqualTo(Integer value) {
            addCriterion("`system_id` <>", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThan(Integer value) {
            addCriterion("`system_id` >", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("`system_id` >=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThan(Integer value) {
            addCriterion("`system_id` <", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdLessThanOrEqualTo(Integer value) {
            addCriterion("`system_id` <=", value, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdIn(List<Integer> values) {
            addCriterion("`system_id` in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotIn(List<Integer> values) {
            addCriterion("`system_id` not in", values, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdBetween(Integer value1, Integer value2) {
            addCriterion("`system_id` between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("`system_id` not between", value1, value2, "systemId");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNull() {
            addCriterion("`system_name` is null");
            return (Criteria) this;
        }

        public Criteria andSystemNameIsNotNull() {
            addCriterion("`system_name` is not null");
            return (Criteria) this;
        }

        public Criteria andSystemNameEqualTo(String value) {
            addCriterion("`system_name` =", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotEqualTo(String value) {
            addCriterion("`system_name` <>", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThan(String value) {
            addCriterion("`system_name` >", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameGreaterThanOrEqualTo(String value) {
            addCriterion("`system_name` >=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThan(String value) {
            addCriterion("`system_name` <", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLessThanOrEqualTo(String value) {
            addCriterion("`system_name` <=", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameLike(String value) {
            addCriterion("`system_name` like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotLike(String value) {
            addCriterion("`system_name` not like", value, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameIn(List<String> values) {
            addCriterion("`system_name` in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotIn(List<String> values) {
            addCriterion("`system_name` not in", values, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameBetween(String value1, String value2) {
            addCriterion("`system_name` between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemNameNotBetween(String value1, String value2) {
            addCriterion("`system_name` not between", value1, value2, "systemName");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkIsNull() {
            addCriterion("`system_remark` is null");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkIsNotNull() {
            addCriterion("`system_remark` is not null");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkEqualTo(String value) {
            addCriterion("`system_remark` =", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkNotEqualTo(String value) {
            addCriterion("`system_remark` <>", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkGreaterThan(String value) {
            addCriterion("`system_remark` >", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("`system_remark` >=", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkLessThan(String value) {
            addCriterion("`system_remark` <", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkLessThanOrEqualTo(String value) {
            addCriterion("`system_remark` <=", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkLike(String value) {
            addCriterion("`system_remark` like", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkNotLike(String value) {
            addCriterion("`system_remark` not like", value, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkIn(List<String> values) {
            addCriterion("`system_remark` in", values, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkNotIn(List<String> values) {
            addCriterion("`system_remark` not in", values, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkBetween(String value1, String value2) {
            addCriterion("`system_remark` between", value1, value2, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andSystemRemarkNotBetween(String value1, String value2) {
            addCriterion("`system_remark` not between", value1, value2, "systemRemark");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNull() {
            addCriterion("`client_id` is null");
            return (Criteria) this;
        }

        public Criteria andClientIdIsNotNull() {
            addCriterion("`client_id` is not null");
            return (Criteria) this;
        }

        public Criteria andClientIdEqualTo(String value) {
            addCriterion("`client_id` =", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotEqualTo(String value) {
            addCriterion("`client_id` <>", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThan(String value) {
            addCriterion("`client_id` >", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdGreaterThanOrEqualTo(String value) {
            addCriterion("`client_id` >=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThan(String value) {
            addCriterion("`client_id` <", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLessThanOrEqualTo(String value) {
            addCriterion("`client_id` <=", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdLike(String value) {
            addCriterion("`client_id` like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotLike(String value) {
            addCriterion("`client_id` not like", value, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdIn(List<String> values) {
            addCriterion("`client_id` in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotIn(List<String> values) {
            addCriterion("`client_id` not in", values, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdBetween(String value1, String value2) {
            addCriterion("`client_id` between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andClientIdNotBetween(String value1, String value2) {
            addCriterion("`client_id` not between", value1, value2, "clientId");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNull() {
            addCriterion("`system_type` is null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIsNotNull() {
            addCriterion("`system_type` is not null");
            return (Criteria) this;
        }

        public Criteria andSystemTypeEqualTo(Integer value) {
            addCriterion("`system_type` =", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotEqualTo(Integer value) {
            addCriterion("`system_type` <>", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThan(Integer value) {
            addCriterion("`system_type` >", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`system_type` >=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThan(Integer value) {
            addCriterion("`system_type` <", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`system_type` <=", value, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeIn(List<Integer> values) {
            addCriterion("`system_type` in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotIn(List<Integer> values) {
            addCriterion("`system_type` not in", values, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeBetween(Integer value1, Integer value2) {
            addCriterion("`system_type` between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andSystemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`system_type` not between", value1, value2, "systemType");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("`create_time` is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("`create_time` is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("`create_time` =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("`create_time` <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("`create_time` >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`create_time` >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("`create_time` <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`create_time` <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("`create_time` in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("`create_time` not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("`create_time` between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`create_time` not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("`update_time` is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("`update_time` is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("`update_time` =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("`update_time` <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("`update_time` >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`update_time` >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("`update_time` <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("`update_time` <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("`update_time` in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("`update_time` not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("`update_time` between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("`update_time` not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumIsNull() {
            addCriterion("`daily_access_num` is null");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumIsNotNull() {
            addCriterion("`daily_access_num` is not null");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumEqualTo(Integer value) {
            addCriterion("`daily_access_num` =", value, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumNotEqualTo(Integer value) {
            addCriterion("`daily_access_num` <>", value, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumGreaterThan(Integer value) {
            addCriterion("`daily_access_num` >", value, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("`daily_access_num` >=", value, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumLessThan(Integer value) {
            addCriterion("`daily_access_num` <", value, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("`daily_access_num` <=", value, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumIn(List<Integer> values) {
            addCriterion("`daily_access_num` in", values, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumNotIn(List<Integer> values) {
            addCriterion("`daily_access_num` not in", values, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumBetween(Integer value1, Integer value2) {
            addCriterion("`daily_access_num` between", value1, value2, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andDailyAccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("`daily_access_num` not between", value1, value2, "dailyAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumIsNull() {
            addCriterion("`minute_access_num` is null");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumIsNotNull() {
            addCriterion("`minute_access_num` is not null");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumEqualTo(Integer value) {
            addCriterion("`minute_access_num` =", value, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumNotEqualTo(Integer value) {
            addCriterion("`minute_access_num` <>", value, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumGreaterThan(Integer value) {
            addCriterion("`minute_access_num` >", value, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("`minute_access_num` >=", value, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumLessThan(Integer value) {
            addCriterion("`minute_access_num` <", value, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumLessThanOrEqualTo(Integer value) {
            addCriterion("`minute_access_num` <=", value, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumIn(List<Integer> values) {
            addCriterion("`minute_access_num` in", values, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumNotIn(List<Integer> values) {
            addCriterion("`minute_access_num` not in", values, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumBetween(Integer value1, Integer value2) {
            addCriterion("`minute_access_num` between", value1, value2, "minuteAccessNum");
            return (Criteria) this;
        }

        public Criteria andMinuteAccessNumNotBetween(Integer value1, Integer value2) {
            addCriterion("`minute_access_num` not between", value1, value2, "minuteAccessNum");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oauth_system
     *
     * @mbggenerated do_not_delete_during_merge Fri Jun 02 17:07:11 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table oauth_system
     *
     * @mbggenerated Fri Jun 02 17:07:11 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

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
    }
}