package com.accp.domain;

import java.util.ArrayList;
import java.util.List;

public class KechenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KechenExample() {
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

        public Criteria andKeidIsNull() {
            addCriterion("keid is null");
            return (Criteria) this;
        }

        public Criteria andKeidIsNotNull() {
            addCriterion("keid is not null");
            return (Criteria) this;
        }

        public Criteria andKeidEqualTo(Integer value) {
            addCriterion("keid =", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotEqualTo(Integer value) {
            addCriterion("keid <>", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidGreaterThan(Integer value) {
            addCriterion("keid >", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidGreaterThanOrEqualTo(Integer value) {
            addCriterion("keid >=", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidLessThan(Integer value) {
            addCriterion("keid <", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidLessThanOrEqualTo(Integer value) {
            addCriterion("keid <=", value, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidIn(List<Integer> values) {
            addCriterion("keid in", values, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotIn(List<Integer> values) {
            addCriterion("keid not in", values, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidBetween(Integer value1, Integer value2) {
            addCriterion("keid between", value1, value2, "keid");
            return (Criteria) this;
        }

        public Criteria andKeidNotBetween(Integer value1, Integer value2) {
            addCriterion("keid not between", value1, value2, "keid");
            return (Criteria) this;
        }

        public Criteria andKenameIsNull() {
            addCriterion("kename is null");
            return (Criteria) this;
        }

        public Criteria andKenameIsNotNull() {
            addCriterion("kename is not null");
            return (Criteria) this;
        }

        public Criteria andKenameEqualTo(String value) {
            addCriterion("kename =", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameNotEqualTo(String value) {
            addCriterion("kename <>", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameGreaterThan(String value) {
            addCriterion("kename >", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameGreaterThanOrEqualTo(String value) {
            addCriterion("kename >=", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameLessThan(String value) {
            addCriterion("kename <", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameLessThanOrEqualTo(String value) {
            addCriterion("kename <=", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameLike(String value) {
            addCriterion("kename like", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameNotLike(String value) {
            addCriterion("kename not like", value, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameIn(List<String> values) {
            addCriterion("kename in", values, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameNotIn(List<String> values) {
            addCriterion("kename not in", values, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameBetween(String value1, String value2) {
            addCriterion("kename between", value1, value2, "kename");
            return (Criteria) this;
        }

        public Criteria andKenameNotBetween(String value1, String value2) {
            addCriterion("kename not between", value1, value2, "kename");
            return (Criteria) this;
        }

        public Criteria andZhuanidIsNull() {
            addCriterion("zhuanid is null");
            return (Criteria) this;
        }

        public Criteria andZhuanidIsNotNull() {
            addCriterion("zhuanid is not null");
            return (Criteria) this;
        }

        public Criteria andZhuanidEqualTo(Integer value) {
            addCriterion("zhuanid =", value, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidNotEqualTo(Integer value) {
            addCriterion("zhuanid <>", value, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidGreaterThan(Integer value) {
            addCriterion("zhuanid >", value, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidGreaterThanOrEqualTo(Integer value) {
            addCriterion("zhuanid >=", value, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidLessThan(Integer value) {
            addCriterion("zhuanid <", value, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidLessThanOrEqualTo(Integer value) {
            addCriterion("zhuanid <=", value, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidIn(List<Integer> values) {
            addCriterion("zhuanid in", values, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidNotIn(List<Integer> values) {
            addCriterion("zhuanid not in", values, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidBetween(Integer value1, Integer value2) {
            addCriterion("zhuanid between", value1, value2, "zhuanid");
            return (Criteria) this;
        }

        public Criteria andZhuanidNotBetween(Integer value1, Integer value2) {
            addCriterion("zhuanid not between", value1, value2, "zhuanid");
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