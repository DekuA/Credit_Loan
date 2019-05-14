package com.p2p.qiyun.lxm.domain;

import java.util.ArrayList;
import java.util.List;

public class InvestnotesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InvestnotesExample() {
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

        public Criteria andIidIsNull() {
            addCriterion("iid is null");
            return (Criteria) this;
        }

        public Criteria andIidIsNotNull() {
            addCriterion("iid is not null");
            return (Criteria) this;
        }

        public Criteria andIidEqualTo(Integer value) {
            addCriterion("iid =", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotEqualTo(Integer value) {
            addCriterion("iid <>", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThan(Integer value) {
            addCriterion("iid >", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("iid >=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThan(Integer value) {
            addCriterion("iid <", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidLessThanOrEqualTo(Integer value) {
            addCriterion("iid <=", value, "iid");
            return (Criteria) this;
        }

        public Criteria andIidIn(List<Integer> values) {
            addCriterion("iid in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotIn(List<Integer> values) {
            addCriterion("iid not in", values, "iid");
            return (Criteria) this;
        }

        public Criteria andIidBetween(Integer value1, Integer value2) {
            addCriterion("iid between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andIidNotBetween(Integer value1, Integer value2) {
            addCriterion("iid not between", value1, value2, "iid");
            return (Criteria) this;
        }

        public Criteria andImoneyIsNull() {
            addCriterion("iMoney is null");
            return (Criteria) this;
        }

        public Criteria andImoneyIsNotNull() {
            addCriterion("iMoney is not null");
            return (Criteria) this;
        }

        public Criteria andImoneyEqualTo(Double value) {
            addCriterion("iMoney =", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyNotEqualTo(Double value) {
            addCriterion("iMoney <>", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyGreaterThan(Double value) {
            addCriterion("iMoney >", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("iMoney >=", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyLessThan(Double value) {
            addCriterion("iMoney <", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyLessThanOrEqualTo(Double value) {
            addCriterion("iMoney <=", value, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyIn(List<Double> values) {
            addCriterion("iMoney in", values, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyNotIn(List<Double> values) {
            addCriterion("iMoney not in", values, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyBetween(Double value1, Double value2) {
            addCriterion("iMoney between", value1, value2, "imoney");
            return (Criteria) this;
        }

        public Criteria andImoneyNotBetween(Double value1, Double value2) {
            addCriterion("iMoney not between", value1, value2, "imoney");
            return (Criteria) this;
        }

        public Criteria andIdateIsNull() {
            addCriterion("idate is null");
            return (Criteria) this;
        }

        public Criteria andIdateIsNotNull() {
            addCriterion("idate is not null");
            return (Criteria) this;
        }

        public Criteria andIdateEqualTo(String value) {
            addCriterion("idate =", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateNotEqualTo(String value) {
            addCriterion("idate <>", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateGreaterThan(String value) {
            addCriterion("idate >", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateGreaterThanOrEqualTo(String value) {
            addCriterion("idate >=", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateLessThan(String value) {
            addCriterion("idate <", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateLessThanOrEqualTo(String value) {
            addCriterion("idate <=", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateLike(String value) {
            addCriterion("idate like", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateNotLike(String value) {
            addCriterion("idate not like", value, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateIn(List<String> values) {
            addCriterion("idate in", values, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateNotIn(List<String> values) {
            addCriterion("idate not in", values, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateBetween(String value1, String value2) {
            addCriterion("idate between", value1, value2, "idate");
            return (Criteria) this;
        }

        public Criteria andIdateNotBetween(String value1, String value2) {
            addCriterion("idate not between", value1, value2, "idate");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPtransIsNull() {
            addCriterion("ptrans is null");
            return (Criteria) this;
        }

        public Criteria andPtransIsNotNull() {
            addCriterion("ptrans is not null");
            return (Criteria) this;
        }

        public Criteria andPtransEqualTo(Integer value) {
            addCriterion("ptrans =", value, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransNotEqualTo(Integer value) {
            addCriterion("ptrans <>", value, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransGreaterThan(Integer value) {
            addCriterion("ptrans >", value, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransGreaterThanOrEqualTo(Integer value) {
            addCriterion("ptrans >=", value, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransLessThan(Integer value) {
            addCriterion("ptrans <", value, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransLessThanOrEqualTo(Integer value) {
            addCriterion("ptrans <=", value, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransIn(List<Integer> values) {
            addCriterion("ptrans in", values, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransNotIn(List<Integer> values) {
            addCriterion("ptrans not in", values, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransBetween(Integer value1, Integer value2) {
            addCriterion("ptrans between", value1, value2, "ptrans");
            return (Criteria) this;
        }

        public Criteria andPtransNotBetween(Integer value1, Integer value2) {
            addCriterion("ptrans not between", value1, value2, "ptrans");
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