package com.p2p.qiyun.lxm.domain;

import java.util.ArrayList;
import java.util.List;

public class ProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProjectExample() {
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

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPmoneybigIsNull() {
            addCriterion("Pmoneybig is null");
            return (Criteria) this;
        }

        public Criteria andPmoneybigIsNotNull() {
            addCriterion("Pmoneybig is not null");
            return (Criteria) this;
        }

        public Criteria andPmoneybigEqualTo(Double value) {
            addCriterion("Pmoneybig =", value, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigNotEqualTo(Double value) {
            addCriterion("Pmoneybig <>", value, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigGreaterThan(Double value) {
            addCriterion("Pmoneybig >", value, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigGreaterThanOrEqualTo(Double value) {
            addCriterion("Pmoneybig >=", value, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigLessThan(Double value) {
            addCriterion("Pmoneybig <", value, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigLessThanOrEqualTo(Double value) {
            addCriterion("Pmoneybig <=", value, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigIn(List<Double> values) {
            addCriterion("Pmoneybig in", values, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigNotIn(List<Double> values) {
            addCriterion("Pmoneybig not in", values, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigBetween(Double value1, Double value2) {
            addCriterion("Pmoneybig between", value1, value2, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneybigNotBetween(Double value1, Double value2) {
            addCriterion("Pmoneybig not between", value1, value2, "pmoneybig");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallIsNull() {
            addCriterion("Pmoneysmall is null");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallIsNotNull() {
            addCriterion("Pmoneysmall is not null");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallEqualTo(Double value) {
            addCriterion("Pmoneysmall =", value, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallNotEqualTo(Double value) {
            addCriterion("Pmoneysmall <>", value, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallGreaterThan(Double value) {
            addCriterion("Pmoneysmall >", value, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallGreaterThanOrEqualTo(Double value) {
            addCriterion("Pmoneysmall >=", value, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallLessThan(Double value) {
            addCriterion("Pmoneysmall <", value, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallLessThanOrEqualTo(Double value) {
            addCriterion("Pmoneysmall <=", value, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallIn(List<Double> values) {
            addCriterion("Pmoneysmall in", values, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallNotIn(List<Double> values) {
            addCriterion("Pmoneysmall not in", values, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallBetween(Double value1, Double value2) {
            addCriterion("Pmoneysmall between", value1, value2, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPmoneysmallNotBetween(Double value1, Double value2) {
            addCriterion("Pmoneysmall not between", value1, value2, "pmoneysmall");
            return (Criteria) this;
        }

        public Criteria andPbudgetIsNull() {
            addCriterion("Pbudget is null");
            return (Criteria) this;
        }

        public Criteria andPbudgetIsNotNull() {
            addCriterion("Pbudget is not null");
            return (Criteria) this;
        }

        public Criteria andPbudgetEqualTo(Double value) {
            addCriterion("Pbudget =", value, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetNotEqualTo(Double value) {
            addCriterion("Pbudget <>", value, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetGreaterThan(Double value) {
            addCriterion("Pbudget >", value, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetGreaterThanOrEqualTo(Double value) {
            addCriterion("Pbudget >=", value, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetLessThan(Double value) {
            addCriterion("Pbudget <", value, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetLessThanOrEqualTo(Double value) {
            addCriterion("Pbudget <=", value, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetIn(List<Double> values) {
            addCriterion("Pbudget in", values, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetNotIn(List<Double> values) {
            addCriterion("Pbudget not in", values, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetBetween(Double value1, Double value2) {
            addCriterion("Pbudget between", value1, value2, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPbudgetNotBetween(Double value1, Double value2) {
            addCriterion("Pbudget not between", value1, value2, "pbudget");
            return (Criteria) this;
        }

        public Criteria andPclosingIsNull() {
            addCriterion("Pclosing is null");
            return (Criteria) this;
        }

        public Criteria andPclosingIsNotNull() {
            addCriterion("Pclosing is not null");
            return (Criteria) this;
        }

        public Criteria andPclosingEqualTo(String value) {
            addCriterion("Pclosing =", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingNotEqualTo(String value) {
            addCriterion("Pclosing <>", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingGreaterThan(String value) {
            addCriterion("Pclosing >", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingGreaterThanOrEqualTo(String value) {
            addCriterion("Pclosing >=", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingLessThan(String value) {
            addCriterion("Pclosing <", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingLessThanOrEqualTo(String value) {
            addCriterion("Pclosing <=", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingLike(String value) {
            addCriterion("Pclosing like", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingNotLike(String value) {
            addCriterion("Pclosing not like", value, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingIn(List<String> values) {
            addCriterion("Pclosing in", values, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingNotIn(List<String> values) {
            addCriterion("Pclosing not in", values, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingBetween(String value1, String value2) {
            addCriterion("Pclosing between", value1, value2, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPclosingNotBetween(String value1, String value2) {
            addCriterion("Pclosing not between", value1, value2, "pclosing");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNull() {
            addCriterion("Pstatus is null");
            return (Criteria) this;
        }

        public Criteria andPstatusIsNotNull() {
            addCriterion("Pstatus is not null");
            return (Criteria) this;
        }

        public Criteria andPstatusEqualTo(Integer value) {
            addCriterion("Pstatus =", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotEqualTo(Integer value) {
            addCriterion("Pstatus <>", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThan(Integer value) {
            addCriterion("Pstatus >", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pstatus >=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThan(Integer value) {
            addCriterion("Pstatus <", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusLessThanOrEqualTo(Integer value) {
            addCriterion("Pstatus <=", value, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusIn(List<Integer> values) {
            addCriterion("Pstatus in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotIn(List<Integer> values) {
            addCriterion("Pstatus not in", values, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusBetween(Integer value1, Integer value2) {
            addCriterion("Pstatus between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("Pstatus not between", value1, value2, "pstatus");
            return (Criteria) this;
        }

        public Criteria andPlcureIsNull() {
            addCriterion("plcure is null");
            return (Criteria) this;
        }

        public Criteria andPlcureIsNotNull() {
            addCriterion("plcure is not null");
            return (Criteria) this;
        }

        public Criteria andPlcureEqualTo(Double value) {
            addCriterion("plcure =", value, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureNotEqualTo(Double value) {
            addCriterion("plcure <>", value, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureGreaterThan(Double value) {
            addCriterion("plcure >", value, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureGreaterThanOrEqualTo(Double value) {
            addCriterion("plcure >=", value, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureLessThan(Double value) {
            addCriterion("plcure <", value, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureLessThanOrEqualTo(Double value) {
            addCriterion("plcure <=", value, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureIn(List<Double> values) {
            addCriterion("plcure in", values, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureNotIn(List<Double> values) {
            addCriterion("plcure not in", values, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureBetween(Double value1, Double value2) {
            addCriterion("plcure between", value1, value2, "plcure");
            return (Criteria) this;
        }

        public Criteria andPlcureNotBetween(Double value1, Double value2) {
            addCriterion("plcure not between", value1, value2, "plcure");
            return (Criteria) this;
        }

        public Criteria andPncomeIsNull() {
            addCriterion("Pncome is null");
            return (Criteria) this;
        }

        public Criteria andPncomeIsNotNull() {
            addCriterion("Pncome is not null");
            return (Criteria) this;
        }

        public Criteria andPncomeEqualTo(String value) {
            addCriterion("Pncome =", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeNotEqualTo(String value) {
            addCriterion("Pncome <>", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeGreaterThan(String value) {
            addCriterion("Pncome >", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeGreaterThanOrEqualTo(String value) {
            addCriterion("Pncome >=", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeLessThan(String value) {
            addCriterion("Pncome <", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeLessThanOrEqualTo(String value) {
            addCriterion("Pncome <=", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeLike(String value) {
            addCriterion("Pncome like", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeNotLike(String value) {
            addCriterion("Pncome not like", value, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeIn(List<String> values) {
            addCriterion("Pncome in", values, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeNotIn(List<String> values) {
            addCriterion("Pncome not in", values, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeBetween(String value1, String value2) {
            addCriterion("Pncome between", value1, value2, "pncome");
            return (Criteria) this;
        }

        public Criteria andPncomeNotBetween(String value1, String value2) {
            addCriterion("Pncome not between", value1, value2, "pncome");
            return (Criteria) this;
        }

        public Criteria andPdateIsNull() {
            addCriterion("Pdate is null");
            return (Criteria) this;
        }

        public Criteria andPdateIsNotNull() {
            addCriterion("Pdate is not null");
            return (Criteria) this;
        }

        public Criteria andPdateEqualTo(String value) {
            addCriterion("Pdate =", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotEqualTo(String value) {
            addCriterion("Pdate <>", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThan(String value) {
            addCriterion("Pdate >", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateGreaterThanOrEqualTo(String value) {
            addCriterion("Pdate >=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThan(String value) {
            addCriterion("Pdate <", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLessThanOrEqualTo(String value) {
            addCriterion("Pdate <=", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateLike(String value) {
            addCriterion("Pdate like", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotLike(String value) {
            addCriterion("Pdate not like", value, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateIn(List<String> values) {
            addCriterion("Pdate in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotIn(List<String> values) {
            addCriterion("Pdate not in", values, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateBetween(String value1, String value2) {
            addCriterion("Pdate between", value1, value2, "pdate");
            return (Criteria) this;
        }

        public Criteria andPdateNotBetween(String value1, String value2) {
            addCriterion("Pdate not between", value1, value2, "pdate");
            return (Criteria) this;
        }

        public Criteria andPtransferIsNull() {
            addCriterion("Ptransfer is null");
            return (Criteria) this;
        }

        public Criteria andPtransferIsNotNull() {
            addCriterion("Ptransfer is not null");
            return (Criteria) this;
        }

        public Criteria andPtransferEqualTo(Integer value) {
            addCriterion("Ptransfer =", value, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferNotEqualTo(Integer value) {
            addCriterion("Ptransfer <>", value, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferGreaterThan(Integer value) {
            addCriterion("Ptransfer >", value, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ptransfer >=", value, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferLessThan(Integer value) {
            addCriterion("Ptransfer <", value, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferLessThanOrEqualTo(Integer value) {
            addCriterion("Ptransfer <=", value, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferIn(List<Integer> values) {
            addCriterion("Ptransfer in", values, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferNotIn(List<Integer> values) {
            addCriterion("Ptransfer not in", values, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferBetween(Integer value1, Integer value2) {
            addCriterion("Ptransfer between", value1, value2, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPtransferNotBetween(Integer value1, Integer value2) {
            addCriterion("Ptransfer not between", value1, value2, "ptransfer");
            return (Criteria) this;
        }

        public Criteria andPnmoneyIsNull() {
            addCriterion("Pnmoney is null");
            return (Criteria) this;
        }

        public Criteria andPnmoneyIsNotNull() {
            addCriterion("Pnmoney is not null");
            return (Criteria) this;
        }

        public Criteria andPnmoneyEqualTo(Double value) {
            addCriterion("Pnmoney =", value, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyNotEqualTo(Double value) {
            addCriterion("Pnmoney <>", value, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyGreaterThan(Double value) {
            addCriterion("Pnmoney >", value, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("Pnmoney >=", value, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyLessThan(Double value) {
            addCriterion("Pnmoney <", value, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyLessThanOrEqualTo(Double value) {
            addCriterion("Pnmoney <=", value, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyIn(List<Double> values) {
            addCriterion("Pnmoney in", values, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyNotIn(List<Double> values) {
            addCriterion("Pnmoney not in", values, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyBetween(Double value1, Double value2) {
            addCriterion("Pnmoney between", value1, value2, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnmoneyNotBetween(Double value1, Double value2) {
            addCriterion("Pnmoney not between", value1, value2, "pnmoney");
            return (Criteria) this;
        }

        public Criteria andPnterestIsNull() {
            addCriterion("Pnterest is null");
            return (Criteria) this;
        }

        public Criteria andPnterestIsNotNull() {
            addCriterion("Pnterest is not null");
            return (Criteria) this;
        }

        public Criteria andPnterestEqualTo(Double value) {
            addCriterion("Pnterest =", value, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestNotEqualTo(Double value) {
            addCriterion("Pnterest <>", value, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestGreaterThan(Double value) {
            addCriterion("Pnterest >", value, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestGreaterThanOrEqualTo(Double value) {
            addCriterion("Pnterest >=", value, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestLessThan(Double value) {
            addCriterion("Pnterest <", value, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestLessThanOrEqualTo(Double value) {
            addCriterion("Pnterest <=", value, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestIn(List<Double> values) {
            addCriterion("Pnterest in", values, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestNotIn(List<Double> values) {
            addCriterion("Pnterest not in", values, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestBetween(Double value1, Double value2) {
            addCriterion("Pnterest between", value1, value2, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPnterestNotBetween(Double value1, Double value2) {
            addCriterion("Pnterest not between", value1, value2, "pnterest");
            return (Criteria) this;
        }

        public Criteria andPsurplusIsNull() {
            addCriterion("Psurplus is null");
            return (Criteria) this;
        }

        public Criteria andPsurplusIsNotNull() {
            addCriterion("Psurplus is not null");
            return (Criteria) this;
        }

        public Criteria andPsurplusEqualTo(Double value) {
            addCriterion("Psurplus =", value, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusNotEqualTo(Double value) {
            addCriterion("Psurplus <>", value, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusGreaterThan(Double value) {
            addCriterion("Psurplus >", value, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusGreaterThanOrEqualTo(Double value) {
            addCriterion("Psurplus >=", value, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusLessThan(Double value) {
            addCriterion("Psurplus <", value, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusLessThanOrEqualTo(Double value) {
            addCriterion("Psurplus <=", value, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusIn(List<Double> values) {
            addCriterion("Psurplus in", values, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusNotIn(List<Double> values) {
            addCriterion("Psurplus not in", values, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusBetween(Double value1, Double value2) {
            addCriterion("Psurplus between", value1, value2, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPsurplusNotBetween(Double value1, Double value2) {
            addCriterion("Psurplus not between", value1, value2, "psurplus");
            return (Criteria) this;
        }

        public Criteria andPinfoIsNull() {
            addCriterion("Pinfo is null");
            return (Criteria) this;
        }

        public Criteria andPinfoIsNotNull() {
            addCriterion("Pinfo is not null");
            return (Criteria) this;
        }

        public Criteria andPinfoEqualTo(Double value) {
            addCriterion("Pinfo =", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotEqualTo(Double value) {
            addCriterion("Pinfo <>", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoGreaterThan(Double value) {
            addCriterion("Pinfo >", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoGreaterThanOrEqualTo(Double value) {
            addCriterion("Pinfo >=", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoLessThan(Double value) {
            addCriterion("Pinfo <", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoLessThanOrEqualTo(Double value) {
            addCriterion("Pinfo <=", value, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoIn(List<Double> values) {
            addCriterion("Pinfo in", values, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotIn(List<Double> values) {
            addCriterion("Pinfo not in", values, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoBetween(Double value1, Double value2) {
            addCriterion("Pinfo between", value1, value2, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPinfoNotBetween(Double value1, Double value2) {
            addCriterion("Pinfo not between", value1, value2, "pinfo");
            return (Criteria) this;
        }

        public Criteria andPattornIsNull() {
            addCriterion("Pattorn is null");
            return (Criteria) this;
        }

        public Criteria andPattornIsNotNull() {
            addCriterion("Pattorn is not null");
            return (Criteria) this;
        }

        public Criteria andPattornEqualTo(Double value) {
            addCriterion("Pattorn =", value, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornNotEqualTo(Double value) {
            addCriterion("Pattorn <>", value, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornGreaterThan(Double value) {
            addCriterion("Pattorn >", value, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornGreaterThanOrEqualTo(Double value) {
            addCriterion("Pattorn >=", value, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornLessThan(Double value) {
            addCriterion("Pattorn <", value, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornLessThanOrEqualTo(Double value) {
            addCriterion("Pattorn <=", value, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornIn(List<Double> values) {
            addCriterion("Pattorn in", values, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornNotIn(List<Double> values) {
            addCriterion("Pattorn not in", values, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornBetween(Double value1, Double value2) {
            addCriterion("Pattorn between", value1, value2, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPattornNotBetween(Double value1, Double value2) {
            addCriterion("Pattorn not between", value1, value2, "pattorn");
            return (Criteria) this;
        }

        public Criteria andPpublishIsNull() {
            addCriterion("Ppublish is null");
            return (Criteria) this;
        }

        public Criteria andPpublishIsNotNull() {
            addCriterion("Ppublish is not null");
            return (Criteria) this;
        }

        public Criteria andPpublishEqualTo(String value) {
            addCriterion("Ppublish =", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishNotEqualTo(String value) {
            addCriterion("Ppublish <>", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishGreaterThan(String value) {
            addCriterion("Ppublish >", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishGreaterThanOrEqualTo(String value) {
            addCriterion("Ppublish >=", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishLessThan(String value) {
            addCriterion("Ppublish <", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishLessThanOrEqualTo(String value) {
            addCriterion("Ppublish <=", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishLike(String value) {
            addCriterion("Ppublish like", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishNotLike(String value) {
            addCriterion("Ppublish not like", value, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishIn(List<String> values) {
            addCriterion("Ppublish in", values, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishNotIn(List<String> values) {
            addCriterion("Ppublish not in", values, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishBetween(String value1, String value2) {
            addCriterion("Ppublish between", value1, value2, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPpublishNotBetween(String value1, String value2) {
            addCriterion("Ppublish not between", value1, value2, "ppublish");
            return (Criteria) this;
        }

        public Criteria andPnumberIsNull() {
            addCriterion("Pnumber is null");
            return (Criteria) this;
        }

        public Criteria andPnumberIsNotNull() {
            addCriterion("Pnumber is not null");
            return (Criteria) this;
        }

        public Criteria andPnumberEqualTo(String value) {
            addCriterion("Pnumber =", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotEqualTo(String value) {
            addCriterion("Pnumber <>", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberGreaterThan(String value) {
            addCriterion("Pnumber >", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Pnumber >=", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberLessThan(String value) {
            addCriterion("Pnumber <", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberLessThanOrEqualTo(String value) {
            addCriterion("Pnumber <=", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberLike(String value) {
            addCriterion("Pnumber like", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotLike(String value) {
            addCriterion("Pnumber not like", value, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberIn(List<String> values) {
            addCriterion("Pnumber in", values, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotIn(List<String> values) {
            addCriterion("Pnumber not in", values, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberBetween(String value1, String value2) {
            addCriterion("Pnumber between", value1, value2, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPnumberNotBetween(String value1, String value2) {
            addCriterion("Pnumber not between", value1, value2, "pnumber");
            return (Criteria) this;
        }

        public Criteria andPscheduleIsNull() {
            addCriterion("Pschedule is null");
            return (Criteria) this;
        }

        public Criteria andPscheduleIsNotNull() {
            addCriterion("Pschedule is not null");
            return (Criteria) this;
        }

        public Criteria andPscheduleEqualTo(Double value) {
            addCriterion("Pschedule =", value, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleNotEqualTo(Double value) {
            addCriterion("Pschedule <>", value, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleGreaterThan(Double value) {
            addCriterion("Pschedule >", value, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleGreaterThanOrEqualTo(Double value) {
            addCriterion("Pschedule >=", value, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleLessThan(Double value) {
            addCriterion("Pschedule <", value, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleLessThanOrEqualTo(Double value) {
            addCriterion("Pschedule <=", value, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleIn(List<Double> values) {
            addCriterion("Pschedule in", values, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleNotIn(List<Double> values) {
            addCriterion("Pschedule not in", values, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleBetween(Double value1, Double value2) {
            addCriterion("Pschedule between", value1, value2, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPscheduleNotBetween(Double value1, Double value2) {
            addCriterion("Pschedule not between", value1, value2, "pschedule");
            return (Criteria) this;
        }

        public Criteria andPestimateIsNull() {
            addCriterion("Pestimate is null");
            return (Criteria) this;
        }

        public Criteria andPestimateIsNotNull() {
            addCriterion("Pestimate is not null");
            return (Criteria) this;
        }

        public Criteria andPestimateEqualTo(Integer value) {
            addCriterion("Pestimate =", value, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateNotEqualTo(Integer value) {
            addCriterion("Pestimate <>", value, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateGreaterThan(Integer value) {
            addCriterion("Pestimate >", value, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateGreaterThanOrEqualTo(Integer value) {
            addCriterion("Pestimate >=", value, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateLessThan(Integer value) {
            addCriterion("Pestimate <", value, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateLessThanOrEqualTo(Integer value) {
            addCriterion("Pestimate <=", value, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateIn(List<Integer> values) {
            addCriterion("Pestimate in", values, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateNotIn(List<Integer> values) {
            addCriterion("Pestimate not in", values, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateBetween(Integer value1, Integer value2) {
            addCriterion("Pestimate between", value1, value2, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPestimateNotBetween(Integer value1, Integer value2) {
            addCriterion("Pestimate not between", value1, value2, "pestimate");
            return (Criteria) this;
        }

        public Criteria andPstarttimeIsNull() {
            addCriterion("pStartTime is null");
            return (Criteria) this;
        }

        public Criteria andPstarttimeIsNotNull() {
            addCriterion("pStartTime is not null");
            return (Criteria) this;
        }

        public Criteria andPstarttimeEqualTo(String value) {
            addCriterion("pStartTime =", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotEqualTo(String value) {
            addCriterion("pStartTime <>", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeGreaterThan(String value) {
            addCriterion("pStartTime >", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("pStartTime >=", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeLessThan(String value) {
            addCriterion("pStartTime <", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeLessThanOrEqualTo(String value) {
            addCriterion("pStartTime <=", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeLike(String value) {
            addCriterion("pStartTime like", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotLike(String value) {
            addCriterion("pStartTime not like", value, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeIn(List<String> values) {
            addCriterion("pStartTime in", values, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotIn(List<String> values) {
            addCriterion("pStartTime not in", values, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeBetween(String value1, String value2) {
            addCriterion("pStartTime between", value1, value2, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPstarttimeNotBetween(String value1, String value2) {
            addCriterion("pStartTime not between", value1, value2, "pstarttime");
            return (Criteria) this;
        }

        public Criteria andPpersonIsNull() {
            addCriterion("pPerson is null");
            return (Criteria) this;
        }

        public Criteria andPpersonIsNotNull() {
            addCriterion("pPerson is not null");
            return (Criteria) this;
        }

        public Criteria andPpersonEqualTo(Integer value) {
            addCriterion("pPerson =", value, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonNotEqualTo(Integer value) {
            addCriterion("pPerson <>", value, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonGreaterThan(Integer value) {
            addCriterion("pPerson >", value, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("pPerson >=", value, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonLessThan(Integer value) {
            addCriterion("pPerson <", value, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonLessThanOrEqualTo(Integer value) {
            addCriterion("pPerson <=", value, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonIn(List<Integer> values) {
            addCriterion("pPerson in", values, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonNotIn(List<Integer> values) {
            addCriterion("pPerson not in", values, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonBetween(Integer value1, Integer value2) {
            addCriterion("pPerson between", value1, value2, "pperson");
            return (Criteria) this;
        }

        public Criteria andPpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("pPerson not between", value1, value2, "pperson");
            return (Criteria) this;
        }

        public Criteria andPassessorIsNull() {
            addCriterion("pAssessor is null");
            return (Criteria) this;
        }

        public Criteria andPassessorIsNotNull() {
            addCriterion("pAssessor is not null");
            return (Criteria) this;
        }

        public Criteria andPassessorEqualTo(Integer value) {
            addCriterion("pAssessor =", value, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorNotEqualTo(Integer value) {
            addCriterion("pAssessor <>", value, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorGreaterThan(Integer value) {
            addCriterion("pAssessor >", value, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorGreaterThanOrEqualTo(Integer value) {
            addCriterion("pAssessor >=", value, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorLessThan(Integer value) {
            addCriterion("pAssessor <", value, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorLessThanOrEqualTo(Integer value) {
            addCriterion("pAssessor <=", value, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorIn(List<Integer> values) {
            addCriterion("pAssessor in", values, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorNotIn(List<Integer> values) {
            addCriterion("pAssessor not in", values, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorBetween(Integer value1, Integer value2) {
            addCriterion("pAssessor between", value1, value2, "passessor");
            return (Criteria) this;
        }

        public Criteria andPassessorNotBetween(Integer value1, Integer value2) {
            addCriterion("pAssessor not between", value1, value2, "passessor");
            return (Criteria) this;
        }

        public Criteria andLenderidIsNull() {
            addCriterion("lenderId is null");
            return (Criteria) this;
        }

        public Criteria andLenderidIsNotNull() {
            addCriterion("lenderId is not null");
            return (Criteria) this;
        }

        public Criteria andLenderidEqualTo(Integer value) {
            addCriterion("lenderId =", value, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidNotEqualTo(Integer value) {
            addCriterion("lenderId <>", value, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidGreaterThan(Integer value) {
            addCriterion("lenderId >", value, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("lenderId >=", value, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidLessThan(Integer value) {
            addCriterion("lenderId <", value, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidLessThanOrEqualTo(Integer value) {
            addCriterion("lenderId <=", value, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidIn(List<Integer> values) {
            addCriterion("lenderId in", values, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidNotIn(List<Integer> values) {
            addCriterion("lenderId not in", values, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidBetween(Integer value1, Integer value2) {
            addCriterion("lenderId between", value1, value2, "lenderid");
            return (Criteria) this;
        }

        public Criteria andLenderidNotBetween(Integer value1, Integer value2) {
            addCriterion("lenderId not between", value1, value2, "lenderid");
            return (Criteria) this;
        }

        public Criteria andRisktakingIsNull() {
            addCriterion("Risktaking is null");
            return (Criteria) this;
        }

        public Criteria andRisktakingIsNotNull() {
            addCriterion("Risktaking is not null");
            return (Criteria) this;
        }

        public Criteria andRisktakingEqualTo(Integer value) {
            addCriterion("Risktaking =", value, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingNotEqualTo(Integer value) {
            addCriterion("Risktaking <>", value, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingGreaterThan(Integer value) {
            addCriterion("Risktaking >", value, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingGreaterThanOrEqualTo(Integer value) {
            addCriterion("Risktaking >=", value, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingLessThan(Integer value) {
            addCriterion("Risktaking <", value, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingLessThanOrEqualTo(Integer value) {
            addCriterion("Risktaking <=", value, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingIn(List<Integer> values) {
            addCriterion("Risktaking in", values, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingNotIn(List<Integer> values) {
            addCriterion("Risktaking not in", values, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingBetween(Integer value1, Integer value2) {
            addCriterion("Risktaking between", value1, value2, "risktaking");
            return (Criteria) this;
        }

        public Criteria andRisktakingNotBetween(Integer value1, Integer value2) {
            addCriterion("Risktaking not between", value1, value2, "risktaking");
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