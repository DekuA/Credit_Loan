package com.p2p.qiyun.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class QuestionTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuestionTypeExample() {
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

        public Criteria andQTTypeIsNull() {
            addCriterion("q_t_type is null");
            return (Criteria) this;
        }

        public Criteria andQTTypeIsNotNull() {
            addCriterion("q_t_type is not null");
            return (Criteria) this;
        }

        public Criteria andQTTypeEqualTo(String value) {
            addCriterion("q_t_type =", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeNotEqualTo(String value) {
            addCriterion("q_t_type <>", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeGreaterThan(String value) {
            addCriterion("q_t_type >", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeGreaterThanOrEqualTo(String value) {
            addCriterion("q_t_type >=", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeLessThan(String value) {
            addCriterion("q_t_type <", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeLessThanOrEqualTo(String value) {
            addCriterion("q_t_type <=", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeLike(String value) {
            addCriterion("q_t_type like", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeNotLike(String value) {
            addCriterion("q_t_type not like", value, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeIn(List<String> values) {
            addCriterion("q_t_type in", values, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeNotIn(List<String> values) {
            addCriterion("q_t_type not in", values, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeBetween(String value1, String value2) {
            addCriterion("q_t_type between", value1, value2, "qTType");
            return (Criteria) this;
        }

        public Criteria andQTTypeNotBetween(String value1, String value2) {
            addCriterion("q_t_type not between", value1, value2, "qTType");
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