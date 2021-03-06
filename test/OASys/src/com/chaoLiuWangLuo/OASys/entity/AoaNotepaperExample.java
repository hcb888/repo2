package com.chaoLiuWangLuo.OASys.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AoaNotepaperExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AoaNotepaperExample() {
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

        public Criteria andNotepaperIdIsNull() {
            addCriterion("notepaper_id is null");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdIsNotNull() {
            addCriterion("notepaper_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdEqualTo(Long value) {
            addCriterion("notepaper_id =", value, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdNotEqualTo(Long value) {
            addCriterion("notepaper_id <>", value, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdGreaterThan(Long value) {
            addCriterion("notepaper_id >", value, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notepaper_id >=", value, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdLessThan(Long value) {
            addCriterion("notepaper_id <", value, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdLessThanOrEqualTo(Long value) {
            addCriterion("notepaper_id <=", value, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdIn(List<Long> values) {
            addCriterion("notepaper_id in", values, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdNotIn(List<Long> values) {
            addCriterion("notepaper_id not in", values, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdBetween(Long value1, Long value2) {
            addCriterion("notepaper_id between", value1, value2, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andNotepaperIdNotBetween(Long value1, Long value2) {
            addCriterion("notepaper_id not between", value1, value2, "notepaperId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdIsNull() {
            addCriterion("notepaper_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdIsNotNull() {
            addCriterion("notepaper_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdEqualTo(Long value) {
            addCriterion("notepaper_user_id =", value, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdNotEqualTo(Long value) {
            addCriterion("notepaper_user_id <>", value, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdGreaterThan(Long value) {
            addCriterion("notepaper_user_id >", value, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("notepaper_user_id >=", value, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdLessThan(Long value) {
            addCriterion("notepaper_user_id <", value, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdLessThanOrEqualTo(Long value) {
            addCriterion("notepaper_user_id <=", value, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdIn(List<Long> values) {
            addCriterion("notepaper_user_id in", values, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdNotIn(List<Long> values) {
            addCriterion("notepaper_user_id not in", values, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdBetween(Long value1, Long value2) {
            addCriterion("notepaper_user_id between", value1, value2, "notepaperUserId");
            return (Criteria) this;
        }

        public Criteria andNotepaperUserIdNotBetween(Long value1, Long value2) {
            addCriterion("notepaper_user_id not between", value1, value2, "notepaperUserId");
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