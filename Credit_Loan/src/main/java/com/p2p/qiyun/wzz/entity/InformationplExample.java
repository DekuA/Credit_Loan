package com.p2p.qiyun.wzz.entity;

import java.util.ArrayList;
import java.util.List;

public class InformationplExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InformationplExample() {
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

        public Criteria andInformationIdIsNull() {
            addCriterion("information_id is null");
            return (Criteria) this;
        }

        public Criteria andInformationIdIsNotNull() {
            addCriterion("information_id is not null");
            return (Criteria) this;
        }

        public Criteria andInformationIdEqualTo(Integer value) {
            addCriterion("information_id =", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotEqualTo(Integer value) {
            addCriterion("information_id <>", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThan(Integer value) {
            addCriterion("information_id >", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("information_id >=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThan(Integer value) {
            addCriterion("information_id <", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdLessThanOrEqualTo(Integer value) {
            addCriterion("information_id <=", value, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdIn(List<Integer> values) {
            addCriterion("information_id in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotIn(List<Integer> values) {
            addCriterion("information_id not in", values, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdBetween(Integer value1, Integer value2) {
            addCriterion("information_id between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationIdNotBetween(Integer value1, Integer value2) {
            addCriterion("information_id not between", value1, value2, "informationId");
            return (Criteria) this;
        }

        public Criteria andInformationDataIsNull() {
            addCriterion("information_data is null");
            return (Criteria) this;
        }

        public Criteria andInformationDataIsNotNull() {
            addCriterion("information_data is not null");
            return (Criteria) this;
        }

        public Criteria andInformationDataEqualTo(String value) {
            addCriterion("information_data =", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataNotEqualTo(String value) {
            addCriterion("information_data <>", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataGreaterThan(String value) {
            addCriterion("information_data >", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataGreaterThanOrEqualTo(String value) {
            addCriterion("information_data >=", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataLessThan(String value) {
            addCriterion("information_data <", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataLessThanOrEqualTo(String value) {
            addCriterion("information_data <=", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataLike(String value) {
            addCriterion("information_data like", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataNotLike(String value) {
            addCriterion("information_data not like", value, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataIn(List<String> values) {
            addCriterion("information_data in", values, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataNotIn(List<String> values) {
            addCriterion("information_data not in", values, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataBetween(String value1, String value2) {
            addCriterion("information_data between", value1, value2, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationDataNotBetween(String value1, String value2) {
            addCriterion("information_data not between", value1, value2, "informationData");
            return (Criteria) this;
        }

        public Criteria andInformationSafeIsNull() {
            addCriterion("information_safe is null");
            return (Criteria) this;
        }

        public Criteria andInformationSafeIsNotNull() {
            addCriterion("information_safe is not null");
            return (Criteria) this;
        }

        public Criteria andInformationSafeEqualTo(String value) {
            addCriterion("information_safe =", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeNotEqualTo(String value) {
            addCriterion("information_safe <>", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeGreaterThan(String value) {
            addCriterion("information_safe >", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeGreaterThanOrEqualTo(String value) {
            addCriterion("information_safe >=", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeLessThan(String value) {
            addCriterion("information_safe <", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeLessThanOrEqualTo(String value) {
            addCriterion("information_safe <=", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeLike(String value) {
            addCriterion("information_safe like", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeNotLike(String value) {
            addCriterion("information_safe not like", value, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeIn(List<String> values) {
            addCriterion("information_safe in", values, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeNotIn(List<String> values) {
            addCriterion("information_safe not in", values, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeBetween(String value1, String value2) {
            addCriterion("information_safe between", value1, value2, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationSafeNotBetween(String value1, String value2) {
            addCriterion("information_safe not between", value1, value2, "informationSafe");
            return (Criteria) this;
        }

        public Criteria andInformationRiskIsNull() {
            addCriterion("information_risk is null");
            return (Criteria) this;
        }

        public Criteria andInformationRiskIsNotNull() {
            addCriterion("information_risk is not null");
            return (Criteria) this;
        }

        public Criteria andInformationRiskEqualTo(String value) {
            addCriterion("information_risk =", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskNotEqualTo(String value) {
            addCriterion("information_risk <>", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskGreaterThan(String value) {
            addCriterion("information_risk >", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskGreaterThanOrEqualTo(String value) {
            addCriterion("information_risk >=", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskLessThan(String value) {
            addCriterion("information_risk <", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskLessThanOrEqualTo(String value) {
            addCriterion("information_risk <=", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskLike(String value) {
            addCriterion("information_risk like", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskNotLike(String value) {
            addCriterion("information_risk not like", value, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskIn(List<String> values) {
            addCriterion("information_risk in", values, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskNotIn(List<String> values) {
            addCriterion("information_risk not in", values, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskBetween(String value1, String value2) {
            addCriterion("information_risk between", value1, value2, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationRiskNotBetween(String value1, String value2) {
            addCriterion("information_risk not between", value1, value2, "informationRisk");
            return (Criteria) this;
        }

        public Criteria andInformationEducationIsNull() {
            addCriterion("information_education is null");
            return (Criteria) this;
        }

        public Criteria andInformationEducationIsNotNull() {
            addCriterion("information_education is not null");
            return (Criteria) this;
        }

        public Criteria andInformationEducationEqualTo(String value) {
            addCriterion("information_education =", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationNotEqualTo(String value) {
            addCriterion("information_education <>", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationGreaterThan(String value) {
            addCriterion("information_education >", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationGreaterThanOrEqualTo(String value) {
            addCriterion("information_education >=", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationLessThan(String value) {
            addCriterion("information_education <", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationLessThanOrEqualTo(String value) {
            addCriterion("information_education <=", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationLike(String value) {
            addCriterion("information_education like", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationNotLike(String value) {
            addCriterion("information_education not like", value, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationIn(List<String> values) {
            addCriterion("information_education in", values, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationNotIn(List<String> values) {
            addCriterion("information_education not in", values, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationBetween(String value1, String value2) {
            addCriterion("information_education between", value1, value2, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationEducationNotBetween(String value1, String value2) {
            addCriterion("information_education not between", value1, value2, "informationEducation");
            return (Criteria) this;
        }

        public Criteria andInformationChargeIsNull() {
            addCriterion("information_charge is null");
            return (Criteria) this;
        }

        public Criteria andInformationChargeIsNotNull() {
            addCriterion("information_charge is not null");
            return (Criteria) this;
        }

        public Criteria andInformationChargeEqualTo(String value) {
            addCriterion("information_charge =", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeNotEqualTo(String value) {
            addCriterion("information_charge <>", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeGreaterThan(String value) {
            addCriterion("information_charge >", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeGreaterThanOrEqualTo(String value) {
            addCriterion("information_charge >=", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeLessThan(String value) {
            addCriterion("information_charge <", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeLessThanOrEqualTo(String value) {
            addCriterion("information_charge <=", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeLike(String value) {
            addCriterion("information_charge like", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeNotLike(String value) {
            addCriterion("information_charge not like", value, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeIn(List<String> values) {
            addCriterion("information_charge in", values, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeNotIn(List<String> values) {
            addCriterion("information_charge not in", values, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeBetween(String value1, String value2) {
            addCriterion("information_charge between", value1, value2, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationChargeNotBetween(String value1, String value2) {
            addCriterion("information_charge not between", value1, value2, "informationCharge");
            return (Criteria) this;
        }

        public Criteria andInformationUsIsNull() {
            addCriterion("information_us is null");
            return (Criteria) this;
        }

        public Criteria andInformationUsIsNotNull() {
            addCriterion("information_us is not null");
            return (Criteria) this;
        }

        public Criteria andInformationUsEqualTo(String value) {
            addCriterion("information_us =", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsNotEqualTo(String value) {
            addCriterion("information_us <>", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsGreaterThan(String value) {
            addCriterion("information_us >", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsGreaterThanOrEqualTo(String value) {
            addCriterion("information_us >=", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsLessThan(String value) {
            addCriterion("information_us <", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsLessThanOrEqualTo(String value) {
            addCriterion("information_us <=", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsLike(String value) {
            addCriterion("information_us like", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsNotLike(String value) {
            addCriterion("information_us not like", value, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsIn(List<String> values) {
            addCriterion("information_us in", values, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsNotIn(List<String> values) {
            addCriterion("information_us not in", values, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsBetween(String value1, String value2) {
            addCriterion("information_us between", value1, value2, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationUsNotBetween(String value1, String value2) {
            addCriterion("information_us not between", value1, value2, "informationUs");
            return (Criteria) this;
        }

        public Criteria andInformationDuceIsNull() {
            addCriterion("information_duce is null");
            return (Criteria) this;
        }

        public Criteria andInformationDuceIsNotNull() {
            addCriterion("information_duce is not null");
            return (Criteria) this;
        }

        public Criteria andInformationDuceEqualTo(String value) {
            addCriterion("information_duce =", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceNotEqualTo(String value) {
            addCriterion("information_duce <>", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceGreaterThan(String value) {
            addCriterion("information_duce >", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceGreaterThanOrEqualTo(String value) {
            addCriterion("information_duce >=", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceLessThan(String value) {
            addCriterion("information_duce <", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceLessThanOrEqualTo(String value) {
            addCriterion("information_duce <=", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceLike(String value) {
            addCriterion("information_duce like", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceNotLike(String value) {
            addCriterion("information_duce not like", value, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceIn(List<String> values) {
            addCriterion("information_duce in", values, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceNotIn(List<String> values) {
            addCriterion("information_duce not in", values, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceBetween(String value1, String value2) {
            addCriterion("information_duce between", value1, value2, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationDuceNotBetween(String value1, String value2) {
            addCriterion("information_duce not between", value1, value2, "informationDuce");
            return (Criteria) this;
        }

        public Criteria andInformationNewsIsNull() {
            addCriterion("information_news is null");
            return (Criteria) this;
        }

        public Criteria andInformationNewsIsNotNull() {
            addCriterion("information_news is not null");
            return (Criteria) this;
        }

        public Criteria andInformationNewsEqualTo(String value) {
            addCriterion("information_news =", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsNotEqualTo(String value) {
            addCriterion("information_news <>", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsGreaterThan(String value) {
            addCriterion("information_news >", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsGreaterThanOrEqualTo(String value) {
            addCriterion("information_news >=", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsLessThan(String value) {
            addCriterion("information_news <", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsLessThanOrEqualTo(String value) {
            addCriterion("information_news <=", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsLike(String value) {
            addCriterion("information_news like", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsNotLike(String value) {
            addCriterion("information_news not like", value, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsIn(List<String> values) {
            addCriterion("information_news in", values, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsNotIn(List<String> values) {
            addCriterion("information_news not in", values, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsBetween(String value1, String value2) {
            addCriterion("information_news between", value1, value2, "informationNews");
            return (Criteria) this;
        }

        public Criteria andInformationNewsNotBetween(String value1, String value2) {
            addCriterion("information_news not between", value1, value2, "informationNews");
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