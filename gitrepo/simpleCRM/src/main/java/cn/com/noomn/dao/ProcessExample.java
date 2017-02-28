package cn.com.noomn.dao;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ProcessExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProcessExample() {
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

        public Criteria andProcessIdIsNull() {
            addCriterion("PROCESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessIdIsNotNull() {
            addCriterion("PROCESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessIdEqualTo(String value) {
            addCriterion("PROCESS_ID =", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotEqualTo(String value) {
            addCriterion("PROCESS_ID <>", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThan(String value) {
            addCriterion("PROCESS_ID >", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID >=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThan(String value) {
            addCriterion("PROCESS_ID <", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_ID <=", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdLike(String value) {
            addCriterion("PROCESS_ID like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotLike(String value) {
            addCriterion("PROCESS_ID not like", value, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdIn(List<String> values) {
            addCriterion("PROCESS_ID in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotIn(List<String> values) {
            addCriterion("PROCESS_ID not in", values, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdBetween(String value1, String value2) {
            addCriterion("PROCESS_ID between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_ID not between", value1, value2, "processId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdIsNull() {
            addCriterion("PROCESS_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdIsNotNull() {
            addCriterion("PROCESS_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID =", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID <>", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdGreaterThan(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID >", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID >=", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdLessThan(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID <", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID <=", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdLike(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID like", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotLike(String value) {
            addCriterion("PROCESS_EMPLOYEE_ID not like", value, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdIn(List<String> values) {
            addCriterion("PROCESS_EMPLOYEE_ID in", values, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotIn(List<String> values) {
            addCriterion("PROCESS_EMPLOYEE_ID not in", values, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdBetween(String value1, String value2) {
            addCriterion("PROCESS_EMPLOYEE_ID between", value1, value2, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andProcessEmployeeIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_EMPLOYEE_ID not between", value1, value2, "processEmployeeId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNull() {
            addCriterion("CUSTOM_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdIsNotNull() {
            addCriterion("CUSTOM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdEqualTo(String value) {
            addCriterion("CUSTOM_ID =", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotEqualTo(String value) {
            addCriterion("CUSTOM_ID <>", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThan(String value) {
            addCriterion("CUSTOM_ID >", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID >=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThan(String value) {
            addCriterion("CUSTOM_ID <", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLessThanOrEqualTo(String value) {
            addCriterion("CUSTOM_ID <=", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdLike(String value) {
            addCriterion("CUSTOM_ID like", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotLike(String value) {
            addCriterion("CUSTOM_ID not like", value, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdIn(List<String> values) {
            addCriterion("CUSTOM_ID in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotIn(List<String> values) {
            addCriterion("CUSTOM_ID not in", values, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andCustomIdNotBetween(String value1, String value2) {
            addCriterion("CUSTOM_ID not between", value1, value2, "customId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdIsNull() {
            addCriterion("PROCESS_TEMPLET_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdIsNotNull() {
            addCriterion("PROCESS_TEMPLET_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID =", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID <>", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdGreaterThan(String value) {
            addCriterion("PROCESS_TEMPLET_ID >", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID >=", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdLessThan(String value) {
            addCriterion("PROCESS_TEMPLET_ID <", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_TEMPLET_ID <=", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdLike(String value) {
            addCriterion("PROCESS_TEMPLET_ID like", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotLike(String value) {
            addCriterion("PROCESS_TEMPLET_ID not like", value, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdIn(List<String> values) {
            addCriterion("PROCESS_TEMPLET_ID in", values, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotIn(List<String> values) {
            addCriterion("PROCESS_TEMPLET_ID not in", values, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdBetween(String value1, String value2) {
            addCriterion("PROCESS_TEMPLET_ID between", value1, value2, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andProcessTempletIdNotBetween(String value1, String value2) {
            addCriterion("PROCESS_TEMPLET_ID not between", value1, value2, "processTempletId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdIsNull() {
            addCriterion("STEP_DETAILE_ID is null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdIsNotNull() {
            addCriterion("STEP_DETAILE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID =", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID <>", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdGreaterThan(String value) {
            addCriterion("STEP_DETAILE_ID >", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdGreaterThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID >=", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdLessThan(String value) {
            addCriterion("STEP_DETAILE_ID <", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdLessThanOrEqualTo(String value) {
            addCriterion("STEP_DETAILE_ID <=", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdLike(String value) {
            addCriterion("STEP_DETAILE_ID like", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotLike(String value) {
            addCriterion("STEP_DETAILE_ID not like", value, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdIn(List<String> values) {
            addCriterion("STEP_DETAILE_ID in", values, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotIn(List<String> values) {
            addCriterion("STEP_DETAILE_ID not in", values, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_ID between", value1, value2, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andStepDetaileIdNotBetween(String value1, String value2) {
            addCriterion("STEP_DETAILE_ID not between", value1, value2, "stepDetaileId");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNull() {
            addCriterion("PROCESS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessDateIsNotNull() {
            addCriterion("PROCESS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessDateEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE =", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE <>", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThan(Timestamp value) {
            addCriterion("PROCESS_DATE >", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE >=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThan(Timestamp value) {
            addCriterion("PROCESS_DATE <", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateLessThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_DATE <=", value, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateIn(List<Timestamp> values) {
            addCriterion("PROCESS_DATE in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotIn(List<Timestamp> values) {
            addCriterion("PROCESS_DATE not in", values, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_DATE between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessDateNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_DATE not between", value1, value2, "processDate");
            return (Criteria) this;
        }

        public Criteria andProcessContentIsNull() {
            addCriterion("PROCESS_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andProcessContentIsNotNull() {
            addCriterion("PROCESS_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andProcessContentEqualTo(String value) {
            addCriterion("PROCESS_CONTENT =", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotEqualTo(String value) {
            addCriterion("PROCESS_CONTENT <>", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentGreaterThan(String value) {
            addCriterion("PROCESS_CONTENT >", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_CONTENT >=", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLessThan(String value) {
            addCriterion("PROCESS_CONTENT <", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_CONTENT <=", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentLike(String value) {
            addCriterion("PROCESS_CONTENT like", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotLike(String value) {
            addCriterion("PROCESS_CONTENT not like", value, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentIn(List<String> values) {
            addCriterion("PROCESS_CONTENT in", values, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotIn(List<String> values) {
            addCriterion("PROCESS_CONTENT not in", values, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentBetween(String value1, String value2) {
            addCriterion("PROCESS_CONTENT between", value1, value2, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessContentNotBetween(String value1, String value2) {
            addCriterion("PROCESS_CONTENT not between", value1, value2, "processContent");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeIsNull() {
            addCriterion("PROCESS_START_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeIsNotNull() {
            addCriterion("PROCESS_START_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeEqualTo(Timestamp value) {
            addCriterion("PROCESS_START_TIME =", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeNotEqualTo(Timestamp value) {
            addCriterion("PROCESS_START_TIME <>", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeGreaterThan(Timestamp value) {
            addCriterion("PROCESS_START_TIME >", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_START_TIME >=", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeLessThan(Timestamp value) {
            addCriterion("PROCESS_START_TIME <", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_START_TIME <=", value, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeIn(List<Timestamp> values) {
            addCriterion("PROCESS_START_TIME in", values, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeNotIn(List<Timestamp> values) {
            addCriterion("PROCESS_START_TIME not in", values, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_START_TIME between", value1, value2, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessStartTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_START_TIME not between", value1, value2, "processStartTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeIsNull() {
            addCriterion("PROCESS_END_TIME is null");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeIsNotNull() {
            addCriterion("PROCESS_END_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeEqualTo(Timestamp value) {
            addCriterion("PROCESS_END_TIME =", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeNotEqualTo(Timestamp value) {
            addCriterion("PROCESS_END_TIME <>", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeGreaterThan(Timestamp value) {
            addCriterion("PROCESS_END_TIME >", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_END_TIME >=", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeLessThan(Timestamp value) {
            addCriterion("PROCESS_END_TIME <", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("PROCESS_END_TIME <=", value, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeIn(List<Timestamp> values) {
            addCriterion("PROCESS_END_TIME in", values, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeNotIn(List<Timestamp> values) {
            addCriterion("PROCESS_END_TIME not in", values, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_END_TIME between", value1, value2, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessEndTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("PROCESS_END_TIME not between", value1, value2, "processEndTime");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyIsNull() {
            addCriterion("PROCESS_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyIsNotNull() {
            addCriterion("PROCESS_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyEqualTo(BigDecimal value) {
            addCriterion("PROCESS_MONEY =", value, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyNotEqualTo(BigDecimal value) {
            addCriterion("PROCESS_MONEY <>", value, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyGreaterThan(BigDecimal value) {
            addCriterion("PROCESS_MONEY >", value, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESS_MONEY >=", value, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyLessThan(BigDecimal value) {
            addCriterion("PROCESS_MONEY <", value, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PROCESS_MONEY <=", value, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyIn(List<BigDecimal> values) {
            addCriterion("PROCESS_MONEY in", values, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyNotIn(List<BigDecimal> values) {
            addCriterion("PROCESS_MONEY not in", values, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESS_MONEY between", value1, value2, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PROCESS_MONEY not between", value1, value2, "processMoney");
            return (Criteria) this;
        }

        public Criteria andProcessStateIsNull() {
            addCriterion("PROCESS_STATE is null");
            return (Criteria) this;
        }

        public Criteria andProcessStateIsNotNull() {
            addCriterion("PROCESS_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessStateEqualTo(String value) {
            addCriterion("PROCESS_STATE =", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotEqualTo(String value) {
            addCriterion("PROCESS_STATE <>", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateGreaterThan(String value) {
            addCriterion("PROCESS_STATE >", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATE >=", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLessThan(String value) {
            addCriterion("PROCESS_STATE <", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLessThanOrEqualTo(String value) {
            addCriterion("PROCESS_STATE <=", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateLike(String value) {
            addCriterion("PROCESS_STATE like", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotLike(String value) {
            addCriterion("PROCESS_STATE not like", value, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateIn(List<String> values) {
            addCriterion("PROCESS_STATE in", values, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotIn(List<String> values) {
            addCriterion("PROCESS_STATE not in", values, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateBetween(String value1, String value2) {
            addCriterion("PROCESS_STATE between", value1, value2, "processState");
            return (Criteria) this;
        }

        public Criteria andProcessStateNotBetween(String value1, String value2) {
            addCriterion("PROCESS_STATE not between", value1, value2, "processState");
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