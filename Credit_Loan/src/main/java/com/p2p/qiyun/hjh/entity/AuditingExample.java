package com.p2p.qiyun.hjh.entity;

import java.util.ArrayList;
import java.util.List;

public class AuditingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AuditingExample() {
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

        public Criteria andAidIsNull() {
            addCriterion("aid is null");
            return (Criteria) this;
        }

        public Criteria andAidIsNotNull() {
            addCriterion("aid is not null");
            return (Criteria) this;
        }

        public Criteria andAidEqualTo(Integer value) {
            addCriterion("aid =", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotEqualTo(Integer value) {
            addCriterion("aid <>", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThan(Integer value) {
            addCriterion("aid >", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidGreaterThanOrEqualTo(Integer value) {
            addCriterion("aid >=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThan(Integer value) {
            addCriterion("aid <", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidLessThanOrEqualTo(Integer value) {
            addCriterion("aid <=", value, "aid");
            return (Criteria) this;
        }

        public Criteria andAidIn(List<Integer> values) {
            addCriterion("aid in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotIn(List<Integer> values) {
            addCriterion("aid not in", values, "aid");
            return (Criteria) this;
        }

        public Criteria andAidBetween(Integer value1, Integer value2) {
            addCriterion("aid between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAidNotBetween(Integer value1, Integer value2) {
            addCriterion("aid not between", value1, value2, "aid");
            return (Criteria) this;
        }

        public Criteria andAnameIsNull() {
            addCriterion("aname is null");
            return (Criteria) this;
        }

        public Criteria andAnameIsNotNull() {
            addCriterion("aname is not null");
            return (Criteria) this;
        }

        public Criteria andAnameEqualTo(Integer value) {
            addCriterion("aname =", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotEqualTo(Integer value) {
            addCriterion("aname <>", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThan(Integer value) {
            addCriterion("aname >", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameGreaterThanOrEqualTo(Integer value) {
            addCriterion("aname >=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThan(Integer value) {
            addCriterion("aname <", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameLessThanOrEqualTo(Integer value) {
            addCriterion("aname <=", value, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameIn(List<Integer> values) {
            addCriterion("aname in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotIn(List<Integer> values) {
            addCriterion("aname not in", values, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameBetween(Integer value1, Integer value2) {
            addCriterion("aname between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAnameNotBetween(Integer value1, Integer value2) {
            addCriterion("aname not between", value1, value2, "aname");
            return (Criteria) this;
        }

        public Criteria andAdateIsNull() {
            addCriterion("adate is null");
            return (Criteria) this;
        }

        public Criteria andAdateIsNotNull() {
            addCriterion("adate is not null");
            return (Criteria) this;
        }

        public Criteria andAdateEqualTo(String value) {
            addCriterion("adate =", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotEqualTo(String value) {
            addCriterion("adate <>", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThan(String value) {
            addCriterion("adate >", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateGreaterThanOrEqualTo(String value) {
            addCriterion("adate >=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThan(String value) {
            addCriterion("adate <", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLessThanOrEqualTo(String value) {
            addCriterion("adate <=", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateLike(String value) {
            addCriterion("adate like", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotLike(String value) {
            addCriterion("adate not like", value, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateIn(List<String> values) {
            addCriterion("adate in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotIn(List<String> values) {
            addCriterion("adate not in", values, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateBetween(String value1, String value2) {
            addCriterion("adate between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAdateNotBetween(String value1, String value2) {
            addCriterion("adate not between", value1, value2, "adate");
            return (Criteria) this;
        }

        public Criteria andAmoneyIsNull() {
            addCriterion("amoney is null");
            return (Criteria) this;
        }

        public Criteria andAmoneyIsNotNull() {
            addCriterion("amoney is not null");
            return (Criteria) this;
        }

        public Criteria andAmoneyEqualTo(String value) {
            addCriterion("amoney =", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotEqualTo(String value) {
            addCriterion("amoney <>", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyGreaterThan(String value) {
            addCriterion("amoney >", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyGreaterThanOrEqualTo(String value) {
            addCriterion("amoney >=", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyLessThan(String value) {
            addCriterion("amoney <", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyLessThanOrEqualTo(String value) {
            addCriterion("amoney <=", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyLike(String value) {
            addCriterion("amoney like", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotLike(String value) {
            addCriterion("amoney not like", value, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyIn(List<String> values) {
            addCriterion("amoney in", values, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotIn(List<String> values) {
            addCriterion("amoney not in", values, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyBetween(String value1, String value2) {
            addCriterion("amoney between", value1, value2, "amoney");
            return (Criteria) this;
        }

        public Criteria andAmoneyNotBetween(String value1, String value2) {
            addCriterion("amoney not between", value1, value2, "amoney");
            return (Criteria) this;
        }

        public Criteria andAstatusIsNull() {
            addCriterion("astatus is null");
            return (Criteria) this;
        }

        public Criteria andAstatusIsNotNull() {
            addCriterion("astatus is not null");
            return (Criteria) this;
        }

        public Criteria andAstatusEqualTo(Integer value) {
            addCriterion("astatus =", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotEqualTo(Integer value) {
            addCriterion("astatus <>", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusGreaterThan(Integer value) {
            addCriterion("astatus >", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("astatus >=", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLessThan(Integer value) {
            addCriterion("astatus <", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusLessThanOrEqualTo(Integer value) {
            addCriterion("astatus <=", value, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusIn(List<Integer> values) {
            addCriterion("astatus in", values, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotIn(List<Integer> values) {
            addCriterion("astatus not in", values, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusBetween(Integer value1, Integer value2) {
            addCriterion("astatus between", value1, value2, "astatus");
            return (Criteria) this;
        }

        public Criteria andAstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("astatus not between", value1, value2, "astatus");
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