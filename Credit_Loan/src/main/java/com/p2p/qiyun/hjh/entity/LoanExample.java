package com.p2p.qiyun.hjh.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LoanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LoanExample() {
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

        public Criteria andLoanidIsNull() {
            addCriterion("loanid is null");
            return (Criteria) this;
        }

        public Criteria andLoanidIsNotNull() {
            addCriterion("loanid is not null");
            return (Criteria) this;
        }

        public Criteria andLoanidEqualTo(Integer value) {
            addCriterion("loanid =", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotEqualTo(Integer value) {
            addCriterion("loanid <>", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidGreaterThan(Integer value) {
            addCriterion("loanid >", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("loanid >=", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidLessThan(Integer value) {
            addCriterion("loanid <", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidLessThanOrEqualTo(Integer value) {
            addCriterion("loanid <=", value, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidIn(List<Integer> values) {
            addCriterion("loanid in", values, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotIn(List<Integer> values) {
            addCriterion("loanid not in", values, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidBetween(Integer value1, Integer value2) {
            addCriterion("loanid between", value1, value2, "loanid");
            return (Criteria) this;
        }

        public Criteria andLoanidNotBetween(Integer value1, Integer value2) {
            addCriterion("loanid not between", value1, value2, "loanid");
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

        public Criteria andLoanrateIsNull() {
            addCriterion("loanrate is null");
            return (Criteria) this;
        }

        public Criteria andLoanrateIsNotNull() {
            addCriterion("loanrate is not null");
            return (Criteria) this;
        }

        public Criteria andLoanrateEqualTo(Double value) {
            addCriterion("loanrate =", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotEqualTo(Double value) {
            addCriterion("loanrate <>", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThan(Double value) {
            addCriterion("loanrate >", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateGreaterThanOrEqualTo(Double value) {
            addCriterion("loanrate >=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThan(Double value) {
            addCriterion("loanrate <", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateLessThanOrEqualTo(Double value) {
            addCriterion("loanrate <=", value, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateIn(List<Double> values) {
            addCriterion("loanrate in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotIn(List<Double> values) {
            addCriterion("loanrate not in", values, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateBetween(Double value1, Double value2) {
            addCriterion("loanrate between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andLoanrateNotBetween(Double value1, Double value2) {
            addCriterion("loanrate not between", value1, value2, "loanrate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateIsNull() {
            addCriterion("applicationdate is null");
            return (Criteria) this;
        }

        public Criteria andApplicationdateIsNotNull() {
            addCriterion("applicationdate is not null");
            return (Criteria) this;
        }

        public Criteria andApplicationdateEqualTo(Date value) {
            addCriterion("applicationdate =", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateNotEqualTo(Date value) {
            addCriterion("applicationdate <>", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateGreaterThan(Date value) {
            addCriterion("applicationdate >", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("applicationdate >=", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateLessThan(Date value) {
            addCriterion("applicationdate <", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateLessThanOrEqualTo(Date value) {
            addCriterion("applicationdate <=", value, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateIn(List<Date> values) {
            addCriterion("applicationdate in", values, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateNotIn(List<Date> values) {
            addCriterion("applicationdate not in", values, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateBetween(Date value1, Date value2) {
            addCriterion("applicationdate between", value1, value2, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andApplicationdateNotBetween(Date value1, Date value2) {
            addCriterion("applicationdate not between", value1, value2, "applicationdate");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNull() {
            addCriterion("loanamount is null");
            return (Criteria) this;
        }

        public Criteria andLoanamountIsNotNull() {
            addCriterion("loanamount is not null");
            return (Criteria) this;
        }

        public Criteria andLoanamountEqualTo(Double value) {
            addCriterion("loanamount =", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotEqualTo(Double value) {
            addCriterion("loanamount <>", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThan(Double value) {
            addCriterion("loanamount >", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountGreaterThanOrEqualTo(Double value) {
            addCriterion("loanamount >=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThan(Double value) {
            addCriterion("loanamount <", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountLessThanOrEqualTo(Double value) {
            addCriterion("loanamount <=", value, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountIn(List<Double> values) {
            addCriterion("loanamount in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotIn(List<Double> values) {
            addCriterion("loanamount not in", values, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountBetween(Double value1, Double value2) {
            addCriterion("loanamount between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andLoanamountNotBetween(Double value1, Double value2) {
            addCriterion("loanamount not between", value1, value2, "loanamount");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodIsNull() {
            addCriterion("repaymentperiod is null");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodIsNotNull() {
            addCriterion("repaymentperiod is not null");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodEqualTo(Double value) {
            addCriterion("repaymentperiod =", value, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodNotEqualTo(Double value) {
            addCriterion("repaymentperiod <>", value, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodGreaterThan(Double value) {
            addCriterion("repaymentperiod >", value, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodGreaterThanOrEqualTo(Double value) {
            addCriterion("repaymentperiod >=", value, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodLessThan(Double value) {
            addCriterion("repaymentperiod <", value, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodLessThanOrEqualTo(Double value) {
            addCriterion("repaymentperiod <=", value, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodIn(List<Double> values) {
            addCriterion("repaymentperiod in", values, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodNotIn(List<Double> values) {
            addCriterion("repaymentperiod not in", values, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodBetween(Double value1, Double value2) {
            addCriterion("repaymentperiod between", value1, value2, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andRepaymentperiodNotBetween(Double value1, Double value2) {
            addCriterion("repaymentperiod not between", value1, value2, "repaymentperiod");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIsNull() {
            addCriterion("approvalstatus is null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIsNotNull() {
            addCriterion("approvalstatus is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusEqualTo(String value) {
            addCriterion("approvalstatus =", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotEqualTo(String value) {
            addCriterion("approvalstatus <>", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusGreaterThan(String value) {
            addCriterion("approvalstatus >", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusGreaterThanOrEqualTo(String value) {
            addCriterion("approvalstatus >=", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLessThan(String value) {
            addCriterion("approvalstatus <", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLessThanOrEqualTo(String value) {
            addCriterion("approvalstatus <=", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusLike(String value) {
            addCriterion("approvalstatus like", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotLike(String value) {
            addCriterion("approvalstatus not like", value, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusIn(List<String> values) {
            addCriterion("approvalstatus in", values, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotIn(List<String> values) {
            addCriterion("approvalstatus not in", values, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusBetween(String value1, String value2) {
            addCriterion("approvalstatus between", value1, value2, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApprovalstatusNotBetween(String value1, String value2) {
            addCriterion("approvalstatus not between", value1, value2, "approvalstatus");
            return (Criteria) this;
        }

        public Criteria andApproverIsNull() {
            addCriterion("approver is null");
            return (Criteria) this;
        }

        public Criteria andApproverIsNotNull() {
            addCriterion("approver is not null");
            return (Criteria) this;
        }

        public Criteria andApproverEqualTo(Integer value) {
            addCriterion("approver =", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotEqualTo(Integer value) {
            addCriterion("approver <>", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThan(Integer value) {
            addCriterion("approver >", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverGreaterThanOrEqualTo(Integer value) {
            addCriterion("approver >=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThan(Integer value) {
            addCriterion("approver <", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverLessThanOrEqualTo(Integer value) {
            addCriterion("approver <=", value, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverIn(List<Integer> values) {
            addCriterion("approver in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotIn(List<Integer> values) {
            addCriterion("approver not in", values, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverBetween(Integer value1, Integer value2) {
            addCriterion("approver between", value1, value2, "approver");
            return (Criteria) this;
        }

        public Criteria andApproverNotBetween(Integer value1, Integer value2) {
            addCriterion("approver not between", value1, value2, "approver");
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