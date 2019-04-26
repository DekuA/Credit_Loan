package com.p2p.qiyun.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionExample() {
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

        public Criteria andQIdIsNull() {
            addCriterion("q_id is null");
            return (Criteria) this;
        }

        public Criteria andQIdIsNotNull() {
            addCriterion("q_id is not null");
            return (Criteria) this;
        }

        public Criteria andQIdEqualTo(Integer value) {
            addCriterion("q_id =", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotEqualTo(Integer value) {
            addCriterion("q_id <>", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThan(Integer value) {
            addCriterion("q_id >", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_id >=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThan(Integer value) {
            addCriterion("q_id <", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_id <=", value, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdIn(List<Integer> values) {
            addCriterion("q_id in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotIn(List<Integer> values) {
            addCriterion("q_id not in", values, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdBetween(Integer value1, Integer value2) {
            addCriterion("q_id between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_id not between", value1, value2, "qId");
            return (Criteria) this;
        }

        public Criteria andQTIdIsNull() {
            addCriterion("q_t_id is null");
            return (Criteria) this;
        }

        public Criteria andQTIdIsNotNull() {
            addCriterion("q_t_id is not null");
            return (Criteria) this;
        }

        public Criteria andQTIdEqualTo(Integer value) {
            addCriterion("q_t_id =", value, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdNotEqualTo(Integer value) {
            addCriterion("q_t_id <>", value, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdGreaterThan(Integer value) {
            addCriterion("q_t_id >", value, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("q_t_id >=", value, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdLessThan(Integer value) {
            addCriterion("q_t_id <", value, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdLessThanOrEqualTo(Integer value) {
            addCriterion("q_t_id <=", value, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdIn(List<Integer> values) {
            addCriterion("q_t_id in", values, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdNotIn(List<Integer> values) {
            addCriterion("q_t_id not in", values, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdBetween(Integer value1, Integer value2) {
            addCriterion("q_t_id between", value1, value2, "qTId");
            return (Criteria) this;
        }

        public Criteria andQTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("q_t_id not between", value1, value2, "qTId");
            return (Criteria) this;
        }

        public Criteria andQQuestionIsNull() {
            addCriterion("q_question is null");
            return (Criteria) this;
        }

        public Criteria andQQuestionIsNotNull() {
            addCriterion("q_question is not null");
            return (Criteria) this;
        }

        public Criteria andQQuestionEqualTo(String value) {
            addCriterion("q_question =", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionNotEqualTo(String value) {
            addCriterion("q_question <>", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionGreaterThan(String value) {
            addCriterion("q_question >", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionGreaterThanOrEqualTo(String value) {
            addCriterion("q_question >=", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionLessThan(String value) {
            addCriterion("q_question <", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionLessThanOrEqualTo(String value) {
            addCriterion("q_question <=", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionLike(String value) {
            addCriterion("q_question like", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionNotLike(String value) {
            addCriterion("q_question not like", value, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionIn(List<String> values) {
            addCriterion("q_question in", values, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionNotIn(List<String> values) {
            addCriterion("q_question not in", values, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionBetween(String value1, String value2) {
            addCriterion("q_question between", value1, value2, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQQuestionNotBetween(String value1, String value2) {
            addCriterion("q_question not between", value1, value2, "qQuestion");
            return (Criteria) this;
        }

        public Criteria andQResolventIsNull() {
            addCriterion("q_resolvent is null");
            return (Criteria) this;
        }

        public Criteria andQResolventIsNotNull() {
            addCriterion("q_resolvent is not null");
            return (Criteria) this;
        }

        public Criteria andQResolventEqualTo(String value) {
            addCriterion("q_resolvent =", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventNotEqualTo(String value) {
            addCriterion("q_resolvent <>", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventGreaterThan(String value) {
            addCriterion("q_resolvent >", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventGreaterThanOrEqualTo(String value) {
            addCriterion("q_resolvent >=", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventLessThan(String value) {
            addCriterion("q_resolvent <", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventLessThanOrEqualTo(String value) {
            addCriterion("q_resolvent <=", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventLike(String value) {
            addCriterion("q_resolvent like", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventNotLike(String value) {
            addCriterion("q_resolvent not like", value, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventIn(List<String> values) {
            addCriterion("q_resolvent in", values, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventNotIn(List<String> values) {
            addCriterion("q_resolvent not in", values, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventBetween(String value1, String value2) {
            addCriterion("q_resolvent between", value1, value2, "qResolvent");
            return (Criteria) this;
        }

        public Criteria andQResolventNotBetween(String value1, String value2) {
            addCriterion("q_resolvent not between", value1, value2, "qResolvent");
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