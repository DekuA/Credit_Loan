package com.p2p.qiyun.dyj.pojo;

import java.util.ArrayList;
import java.util.List;

public class LogintimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LogintimeExample() {
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

        public Criteria andLtidIsNull() {
            addCriterion("ltid is null");
            return (Criteria) this;
        }

        public Criteria andLtidIsNotNull() {
            addCriterion("ltid is not null");
            return (Criteria) this;
        }

        public Criteria andLtidEqualTo(Integer value) {
            addCriterion("ltid =", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidNotEqualTo(Integer value) {
            addCriterion("ltid <>", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidGreaterThan(Integer value) {
            addCriterion("ltid >", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ltid >=", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidLessThan(Integer value) {
            addCriterion("ltid <", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidLessThanOrEqualTo(Integer value) {
            addCriterion("ltid <=", value, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidIn(List<Integer> values) {
            addCriterion("ltid in", values, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidNotIn(List<Integer> values) {
            addCriterion("ltid not in", values, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidBetween(Integer value1, Integer value2) {
            addCriterion("ltid between", value1, value2, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtidNotBetween(Integer value1, Integer value2) {
            addCriterion("ltid not between", value1, value2, "ltid");
            return (Criteria) this;
        }

        public Criteria andLtnameIsNull() {
            addCriterion("ltname is null");
            return (Criteria) this;
        }

        public Criteria andLtnameIsNotNull() {
            addCriterion("ltname is not null");
            return (Criteria) this;
        }

        public Criteria andLtnameEqualTo(String value) {
            addCriterion("ltname =", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameNotEqualTo(String value) {
            addCriterion("ltname <>", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameGreaterThan(String value) {
            addCriterion("ltname >", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameGreaterThanOrEqualTo(String value) {
            addCriterion("ltname >=", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameLessThan(String value) {
            addCriterion("ltname <", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameLessThanOrEqualTo(String value) {
            addCriterion("ltname <=", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameLike(String value) {
            addCriterion("ltname like", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameNotLike(String value) {
            addCriterion("ltname not like", value, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameIn(List<String> values) {
            addCriterion("ltname in", values, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameNotIn(List<String> values) {
            addCriterion("ltname not in", values, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameBetween(String value1, String value2) {
            addCriterion("ltname between", value1, value2, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtnameNotBetween(String value1, String value2) {
            addCriterion("ltname not between", value1, value2, "ltname");
            return (Criteria) this;
        }

        public Criteria andLtdateIsNull() {
            addCriterion("ltdate is null");
            return (Criteria) this;
        }

        public Criteria andLtdateIsNotNull() {
            addCriterion("ltdate is not null");
            return (Criteria) this;
        }

        public Criteria andLtdateEqualTo(String value) {
            addCriterion("ltdate =", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateNotEqualTo(String value) {
            addCriterion("ltdate <>", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateGreaterThan(String value) {
            addCriterion("ltdate >", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateGreaterThanOrEqualTo(String value) {
            addCriterion("ltdate >=", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateLessThan(String value) {
            addCriterion("ltdate <", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateLessThanOrEqualTo(String value) {
            addCriterion("ltdate <=", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateLike(String value) {
            addCriterion("ltdate like", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateNotLike(String value) {
            addCriterion("ltdate not like", value, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateIn(List<String> values) {
            addCriterion("ltdate in", values, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateNotIn(List<String> values) {
            addCriterion("ltdate not in", values, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateBetween(String value1, String value2) {
            addCriterion("ltdate between", value1, value2, "ltdate");
            return (Criteria) this;
        }

        public Criteria andLtdateNotBetween(String value1, String value2) {
            addCriterion("ltdate not between", value1, value2, "ltdate");
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