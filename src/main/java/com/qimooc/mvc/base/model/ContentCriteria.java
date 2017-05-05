package com.qimooc.mvc.base.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContentCriteria() {
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

        public Criteria andContent_idIsNull() {
            addCriterion("content_id is null");
            return (Criteria) this;
        }

        public Criteria andContent_idIsNotNull() {
            addCriterion("content_id is not null");
            return (Criteria) this;
        }

        public Criteria andContent_idEqualTo(Integer value) {
            addCriterion("content_id =", value, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idNotEqualTo(Integer value) {
            addCriterion("content_id <>", value, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idGreaterThan(Integer value) {
            addCriterion("content_id >", value, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("content_id >=", value, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idLessThan(Integer value) {
            addCriterion("content_id <", value, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idLessThanOrEqualTo(Integer value) {
            addCriterion("content_id <=", value, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idIn(List<Integer> values) {
            addCriterion("content_id in", values, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idNotIn(List<Integer> values) {
            addCriterion("content_id not in", values, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idBetween(Integer value1, Integer value2) {
            addCriterion("content_id between", value1, value2, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_idNotBetween(Integer value1, Integer value2) {
            addCriterion("content_id not between", value1, value2, "content_id");
            return (Criteria) this;
        }

        public Criteria andContent_nameIsNull() {
            addCriterion("content_name is null");
            return (Criteria) this;
        }

        public Criteria andContent_nameIsNotNull() {
            addCriterion("content_name is not null");
            return (Criteria) this;
        }

        public Criteria andContent_nameEqualTo(String value) {
            addCriterion("content_name =", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameNotEqualTo(String value) {
            addCriterion("content_name <>", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameGreaterThan(String value) {
            addCriterion("content_name >", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameGreaterThanOrEqualTo(String value) {
            addCriterion("content_name >=", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameLessThan(String value) {
            addCriterion("content_name <", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameLessThanOrEqualTo(String value) {
            addCriterion("content_name <=", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameLike(String value) {
            addCriterion("content_name like", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameNotLike(String value) {
            addCriterion("content_name not like", value, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameIn(List<String> values) {
            addCriterion("content_name in", values, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameNotIn(List<String> values) {
            addCriterion("content_name not in", values, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameBetween(String value1, String value2) {
            addCriterion("content_name between", value1, value2, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_nameNotBetween(String value1, String value2) {
            addCriterion("content_name not between", value1, value2, "content_name");
            return (Criteria) this;
        }

        public Criteria andContent_codeIsNull() {
            addCriterion("content_code is null");
            return (Criteria) this;
        }

        public Criteria andContent_codeIsNotNull() {
            addCriterion("content_code is not null");
            return (Criteria) this;
        }

        public Criteria andContent_codeEqualTo(String value) {
            addCriterion("content_code =", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeNotEqualTo(String value) {
            addCriterion("content_code <>", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeGreaterThan(String value) {
            addCriterion("content_code >", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeGreaterThanOrEqualTo(String value) {
            addCriterion("content_code >=", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeLessThan(String value) {
            addCriterion("content_code <", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeLessThanOrEqualTo(String value) {
            addCriterion("content_code <=", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeLike(String value) {
            addCriterion("content_code like", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeNotLike(String value) {
            addCriterion("content_code not like", value, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeIn(List<String> values) {
            addCriterion("content_code in", values, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeNotIn(List<String> values) {
            addCriterion("content_code not in", values, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeBetween(String value1, String value2) {
            addCriterion("content_code between", value1, value2, "content_code");
            return (Criteria) this;
        }

        public Criteria andContent_codeNotBetween(String value1, String value2) {
            addCriterion("content_code not between", value1, value2, "content_code");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andSite_idIsNull() {
            addCriterion("site_id is null");
            return (Criteria) this;
        }

        public Criteria andSite_idIsNotNull() {
            addCriterion("site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSite_idEqualTo(Integer value) {
            addCriterion("site_id =", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idNotEqualTo(Integer value) {
            addCriterion("site_id <>", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idGreaterThan(Integer value) {
            addCriterion("site_id >", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("site_id >=", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idLessThan(Integer value) {
            addCriterion("site_id <", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idLessThanOrEqualTo(Integer value) {
            addCriterion("site_id <=", value, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idIn(List<Integer> values) {
            addCriterion("site_id in", values, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idNotIn(List<Integer> values) {
            addCriterion("site_id not in", values, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idBetween(Integer value1, Integer value2) {
            addCriterion("site_id between", value1, value2, "site_id");
            return (Criteria) this;
        }

        public Criteria andSite_idNotBetween(Integer value1, Integer value2) {
            addCriterion("site_id not between", value1, value2, "site_id");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNull() {
            addCriterion("dept_id is null");
            return (Criteria) this;
        }

        public Criteria andDept_idIsNotNull() {
            addCriterion("dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andDept_idEqualTo(Integer value) {
            addCriterion("dept_id =", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotEqualTo(Integer value) {
            addCriterion("dept_id <>", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThan(Integer value) {
            addCriterion("dept_id >", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("dept_id >=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThan(Integer value) {
            addCriterion("dept_id <", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idLessThanOrEqualTo(Integer value) {
            addCriterion("dept_id <=", value, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idIn(List<Integer> values) {
            addCriterion("dept_id in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotIn(List<Integer> values) {
            addCriterion("dept_id not in", values, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idBetween(Integer value1, Integer value2) {
            addCriterion("dept_id between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andDept_idNotBetween(Integer value1, Integer value2) {
            addCriterion("dept_id not between", value1, value2, "dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idIsNull() {
            addCriterion("shared_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idIsNotNull() {
            addCriterion("shared_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idEqualTo(Integer value) {
            addCriterion("shared_dept_id =", value, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idNotEqualTo(Integer value) {
            addCriterion("shared_dept_id <>", value, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idGreaterThan(Integer value) {
            addCriterion("shared_dept_id >", value, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("shared_dept_id >=", value, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idLessThan(Integer value) {
            addCriterion("shared_dept_id <", value, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idLessThanOrEqualTo(Integer value) {
            addCriterion("shared_dept_id <=", value, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idIn(List<Integer> values) {
            addCriterion("shared_dept_id in", values, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idNotIn(List<Integer> values) {
            addCriterion("shared_dept_id not in", values, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idBetween(Integer value1, Integer value2) {
            addCriterion("shared_dept_id between", value1, value2, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andShared_dept_idNotBetween(Integer value1, Integer value2) {
            addCriterion("shared_dept_id not between", value1, value2, "shared_dept_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idIsNull() {
            addCriterion("source_site_id is null");
            return (Criteria) this;
        }

        public Criteria andSource_site_idIsNotNull() {
            addCriterion("source_site_id is not null");
            return (Criteria) this;
        }

        public Criteria andSource_site_idEqualTo(Integer value) {
            addCriterion("source_site_id =", value, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idNotEqualTo(Integer value) {
            addCriterion("source_site_id <>", value, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idGreaterThan(Integer value) {
            addCriterion("source_site_id >", value, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_site_id >=", value, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idLessThan(Integer value) {
            addCriterion("source_site_id <", value, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idLessThanOrEqualTo(Integer value) {
            addCriterion("source_site_id <=", value, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idIn(List<Integer> values) {
            addCriterion("source_site_id in", values, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idNotIn(List<Integer> values) {
            addCriterion("source_site_id not in", values, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idBetween(Integer value1, Integer value2) {
            addCriterion("source_site_id between", value1, value2, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_site_idNotBetween(Integer value1, Integer value2) {
            addCriterion("source_site_id not between", value1, value2, "source_site_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idIsNull() {
            addCriterion("source_content_id is null");
            return (Criteria) this;
        }

        public Criteria andSource_content_idIsNotNull() {
            addCriterion("source_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andSource_content_idEqualTo(Integer value) {
            addCriterion("source_content_id =", value, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idNotEqualTo(Integer value) {
            addCriterion("source_content_id <>", value, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idGreaterThan(Integer value) {
            addCriterion("source_content_id >", value, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_content_id >=", value, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idLessThan(Integer value) {
            addCriterion("source_content_id <", value, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idLessThanOrEqualTo(Integer value) {
            addCriterion("source_content_id <=", value, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idIn(List<Integer> values) {
            addCriterion("source_content_id in", values, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idNotIn(List<Integer> values) {
            addCriterion("source_content_id not in", values, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idBetween(Integer value1, Integer value2) {
            addCriterion("source_content_id between", value1, value2, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andSource_content_idNotBetween(Integer value1, Integer value2) {
            addCriterion("source_content_id not between", value1, value2, "source_content_id");
            return (Criteria) this;
        }

        public Criteria andResource_typeIsNull() {
            addCriterion("resource_type is null");
            return (Criteria) this;
        }

        public Criteria andResource_typeIsNotNull() {
            addCriterion("resource_type is not null");
            return (Criteria) this;
        }

        public Criteria andResource_typeEqualTo(String value) {
            addCriterion("resource_type =", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeNotEqualTo(String value) {
            addCriterion("resource_type <>", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeGreaterThan(String value) {
            addCriterion("resource_type >", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeGreaterThanOrEqualTo(String value) {
            addCriterion("resource_type >=", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeLessThan(String value) {
            addCriterion("resource_type <", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeLessThanOrEqualTo(String value) {
            addCriterion("resource_type <=", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeLike(String value) {
            addCriterion("resource_type like", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeNotLike(String value) {
            addCriterion("resource_type not like", value, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeIn(List<String> values) {
            addCriterion("resource_type in", values, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeNotIn(List<String> values) {
            addCriterion("resource_type not in", values, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeBetween(String value1, String value2) {
            addCriterion("resource_type between", value1, value2, "resource_type");
            return (Criteria) this;
        }

        public Criteria andResource_typeNotBetween(String value1, String value2) {
            addCriterion("resource_type not between", value1, value2, "resource_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeIsNull() {
            addCriterion("content_type is null");
            return (Criteria) this;
        }

        public Criteria andContent_typeIsNotNull() {
            addCriterion("content_type is not null");
            return (Criteria) this;
        }

        public Criteria andContent_typeEqualTo(String value) {
            addCriterion("content_type =", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeNotEqualTo(String value) {
            addCriterion("content_type <>", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeGreaterThan(String value) {
            addCriterion("content_type >", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeGreaterThanOrEqualTo(String value) {
            addCriterion("content_type >=", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeLessThan(String value) {
            addCriterion("content_type <", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeLessThanOrEqualTo(String value) {
            addCriterion("content_type <=", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeLike(String value) {
            addCriterion("content_type like", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeNotLike(String value) {
            addCriterion("content_type not like", value, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeIn(List<String> values) {
            addCriterion("content_type in", values, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeNotIn(List<String> values) {
            addCriterion("content_type not in", values, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeBetween(String value1, String value2) {
            addCriterion("content_type between", value1, value2, "content_type");
            return (Criteria) this;
        }

        public Criteria andContent_typeNotBetween(String value1, String value2) {
            addCriterion("content_type not between", value1, value2, "content_type");
            return (Criteria) this;
        }

        public Criteria andStart_dateIsNull() {
            addCriterion("start_date is null");
            return (Criteria) this;
        }

        public Criteria andStart_dateIsNotNull() {
            addCriterion("start_date is not null");
            return (Criteria) this;
        }

        public Criteria andStart_dateEqualTo(Date value) {
            addCriterion("start_date =", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotEqualTo(Date value) {
            addCriterion("start_date <>", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateGreaterThan(Date value) {
            addCriterion("start_date >", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("start_date >=", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateLessThan(Date value) {
            addCriterion("start_date <", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateLessThanOrEqualTo(Date value) {
            addCriterion("start_date <=", value, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateIn(List<Date> values) {
            addCriterion("start_date in", values, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotIn(List<Date> values) {
            addCriterion("start_date not in", values, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateBetween(Date value1, Date value2) {
            addCriterion("start_date between", value1, value2, "start_date");
            return (Criteria) this;
        }

        public Criteria andStart_dateNotBetween(Date value1, Date value2) {
            addCriterion("start_date not between", value1, value2, "start_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_dateEqualTo(Date value) {
            addCriterion("end_date =", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateGreaterThan(Date value) {
            addCriterion("end_date >", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateLessThan(Date value) {
            addCriterion("end_date <", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateIn(List<Date> values) {
            addCriterion("end_date in", values, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "end_date");
            return (Criteria) this;
        }

        public Criteria andEnd_dateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "end_date");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNull() {
            addCriterion("img_url is null");
            return (Criteria) this;
        }

        public Criteria andImg_urlIsNotNull() {
            addCriterion("img_url is not null");
            return (Criteria) this;
        }

        public Criteria andImg_urlEqualTo(String value) {
            addCriterion("img_url =", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotEqualTo(String value) {
            addCriterion("img_url <>", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThan(String value) {
            addCriterion("img_url >", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlGreaterThanOrEqualTo(String value) {
            addCriterion("img_url >=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThan(String value) {
            addCriterion("img_url <", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLessThanOrEqualTo(String value) {
            addCriterion("img_url <=", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlLike(String value) {
            addCriterion("img_url like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotLike(String value) {
            addCriterion("img_url not like", value, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlIn(List<String> values) {
            addCriterion("img_url in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotIn(List<String> values) {
            addCriterion("img_url not in", values, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlBetween(String value1, String value2) {
            addCriterion("img_url between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andImg_urlNotBetween(String value1, String value2) {
            addCriterion("img_url not between", value1, value2, "img_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idIsNull() {
            addCriterion("demo_start_id is null");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idIsNotNull() {
            addCriterion("demo_start_id is not null");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idEqualTo(Integer value) {
            addCriterion("demo_start_id =", value, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idNotEqualTo(Integer value) {
            addCriterion("demo_start_id <>", value, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idGreaterThan(Integer value) {
            addCriterion("demo_start_id >", value, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("demo_start_id >=", value, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idLessThan(Integer value) {
            addCriterion("demo_start_id <", value, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idLessThanOrEqualTo(Integer value) {
            addCriterion("demo_start_id <=", value, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idIn(List<Integer> values) {
            addCriterion("demo_start_id in", values, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idNotIn(List<Integer> values) {
            addCriterion("demo_start_id not in", values, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idBetween(Integer value1, Integer value2) {
            addCriterion("demo_start_id between", value1, value2, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_idNotBetween(Integer value1, Integer value2) {
            addCriterion("demo_start_id not between", value1, value2, "demo_start_id");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlIsNull() {
            addCriterion("demo_start_url is null");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlIsNotNull() {
            addCriterion("demo_start_url is not null");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlEqualTo(String value) {
            addCriterion("demo_start_url =", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlNotEqualTo(String value) {
            addCriterion("demo_start_url <>", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlGreaterThan(String value) {
            addCriterion("demo_start_url >", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlGreaterThanOrEqualTo(String value) {
            addCriterion("demo_start_url >=", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlLessThan(String value) {
            addCriterion("demo_start_url <", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlLessThanOrEqualTo(String value) {
            addCriterion("demo_start_url <=", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlLike(String value) {
            addCriterion("demo_start_url like", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlNotLike(String value) {
            addCriterion("demo_start_url not like", value, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlIn(List<String> values) {
            addCriterion("demo_start_url in", values, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlNotIn(List<String> values) {
            addCriterion("demo_start_url not in", values, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlBetween(String value1, String value2) {
            addCriterion("demo_start_url between", value1, value2, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDemo_start_urlNotBetween(String value1, String value2) {
            addCriterion("demo_start_url not between", value1, value2, "demo_start_url");
            return (Criteria) this;
        }

        public Criteria andDurationIsNull() {
            addCriterion("duration is null");
            return (Criteria) this;
        }

        public Criteria andDurationIsNotNull() {
            addCriterion("duration is not null");
            return (Criteria) this;
        }

        public Criteria andDurationEqualTo(Integer value) {
            addCriterion("duration =", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotEqualTo(Integer value) {
            addCriterion("duration <>", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThan(Integer value) {
            addCriterion("duration >", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationGreaterThanOrEqualTo(Integer value) {
            addCriterion("duration >=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThan(Integer value) {
            addCriterion("duration <", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationLessThanOrEqualTo(Integer value) {
            addCriterion("duration <=", value, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationIn(List<Integer> values) {
            addCriterion("duration in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotIn(List<Integer> values) {
            addCriterion("duration not in", values, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationBetween(Integer value1, Integer value2) {
            addCriterion("duration between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andDurationNotBetween(Integer value1, Integer value2) {
            addCriterion("duration not between", value1, value2, "duration");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsIsNull() {
            addCriterion("lesson_periods is null");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsIsNotNull() {
            addCriterion("lesson_periods is not null");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsEqualTo(BigDecimal value) {
            addCriterion("lesson_periods =", value, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsNotEqualTo(BigDecimal value) {
            addCriterion("lesson_periods <>", value, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsGreaterThan(BigDecimal value) {
            addCriterion("lesson_periods >", value, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("lesson_periods >=", value, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsLessThan(BigDecimal value) {
            addCriterion("lesson_periods <", value, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("lesson_periods <=", value, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsIn(List<BigDecimal> values) {
            addCriterion("lesson_periods in", values, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsNotIn(List<BigDecimal> values) {
            addCriterion("lesson_periods not in", values, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lesson_periods between", value1, value2, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andLesson_periodsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("lesson_periods not between", value1, value2, "lesson_periods");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNull() {
            addCriterion("credits is null");
            return (Criteria) this;
        }

        public Criteria andCreditsIsNotNull() {
            addCriterion("credits is not null");
            return (Criteria) this;
        }

        public Criteria andCreditsEqualTo(BigDecimal value) {
            addCriterion("credits =", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotEqualTo(BigDecimal value) {
            addCriterion("credits <>", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThan(BigDecimal value) {
            addCriterion("credits >", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("credits >=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThan(BigDecimal value) {
            addCriterion("credits <", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("credits <=", value, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsIn(List<BigDecimal> values) {
            addCriterion("credits in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotIn(List<BigDecimal> values) {
            addCriterion("credits not in", values, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credits between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andCreditsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("credits not between", value1, value2, "credits");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNull() {
            addCriterion("language is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("language is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("language =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("language <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("language >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("language >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("language <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("language <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("language like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("language not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("language in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("language not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("language between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("language not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNull() {
            addCriterion("keywords is null");
            return (Criteria) this;
        }

        public Criteria andKeywordsIsNotNull() {
            addCriterion("keywords is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordsEqualTo(String value) {
            addCriterion("keywords =", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotEqualTo(String value) {
            addCriterion("keywords <>", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThan(String value) {
            addCriterion("keywords >", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsGreaterThanOrEqualTo(String value) {
            addCriterion("keywords >=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThan(String value) {
            addCriterion("keywords <", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLessThanOrEqualTo(String value) {
            addCriterion("keywords <=", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsLike(String value) {
            addCriterion("keywords like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotLike(String value) {
            addCriterion("keywords not like", value, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsIn(List<String> values) {
            addCriterion("keywords in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotIn(List<String> values) {
            addCriterion("keywords not in", values, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsBetween(String value1, String value2) {
            addCriterion("keywords between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andKeywordsNotBetween(String value1, String value2) {
            addCriterion("keywords not between", value1, value2, "keywords");
            return (Criteria) this;
        }

        public Criteria andIs_classicIsNull() {
            addCriterion("is_classic is null");
            return (Criteria) this;
        }

        public Criteria andIs_classicIsNotNull() {
            addCriterion("is_classic is not null");
            return (Criteria) this;
        }

        public Criteria andIs_classicEqualTo(String value) {
            addCriterion("is_classic =", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicNotEqualTo(String value) {
            addCriterion("is_classic <>", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicGreaterThan(String value) {
            addCriterion("is_classic >", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicGreaterThanOrEqualTo(String value) {
            addCriterion("is_classic >=", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicLessThan(String value) {
            addCriterion("is_classic <", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicLessThanOrEqualTo(String value) {
            addCriterion("is_classic <=", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicLike(String value) {
            addCriterion("is_classic like", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicNotLike(String value) {
            addCriterion("is_classic not like", value, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicIn(List<String> values) {
            addCriterion("is_classic in", values, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicNotIn(List<String> values) {
            addCriterion("is_classic not in", values, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicBetween(String value1, String value2) {
            addCriterion("is_classic between", value1, value2, "is_classic");
            return (Criteria) this;
        }

        public Criteria andIs_classicNotBetween(String value1, String value2) {
            addCriterion("is_classic not between", value1, value2, "is_classic");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrder_idIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrder_idEqualTo(Integer value) {
            addCriterion("order_id =", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThan(Integer value) {
            addCriterion("order_id >", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThan(Integer value) {
            addCriterion("order_id <", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idIn(List<Integer> values) {
            addCriterion("order_id in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andOrder_idNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "order_id");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitIsNull() {
            addCriterion("max_user_limit is null");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitIsNotNull() {
            addCriterion("max_user_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitEqualTo(Integer value) {
            addCriterion("max_user_limit =", value, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitNotEqualTo(Integer value) {
            addCriterion("max_user_limit <>", value, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitGreaterThan(Integer value) {
            addCriterion("max_user_limit >", value, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_user_limit >=", value, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitLessThan(Integer value) {
            addCriterion("max_user_limit <", value, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitLessThanOrEqualTo(Integer value) {
            addCriterion("max_user_limit <=", value, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitIn(List<Integer> values) {
            addCriterion("max_user_limit in", values, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitNotIn(List<Integer> values) {
            addCriterion("max_user_limit not in", values, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitBetween(Integer value1, Integer value2) {
            addCriterion("max_user_limit between", value1, value2, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andMax_user_limitNotBetween(Integer value1, Integer value2) {
            addCriterion("max_user_limit not between", value1, value2, "max_user_limit");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIsNull() {
            addCriterion("teacher_id is null");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIsNotNull() {
            addCriterion("teacher_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeacher_idEqualTo(Integer value) {
            addCriterion("teacher_id =", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotEqualTo(Integer value) {
            addCriterion("teacher_id <>", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idGreaterThan(Integer value) {
            addCriterion("teacher_id >", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("teacher_id >=", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLessThan(Integer value) {
            addCriterion("teacher_id <", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idLessThanOrEqualTo(Integer value) {
            addCriterion("teacher_id <=", value, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idIn(List<Integer> values) {
            addCriterion("teacher_id in", values, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotIn(List<Integer> values) {
            addCriterion("teacher_id not in", values, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id between", value1, value2, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andTeacher_idNotBetween(Integer value1, Integer value2) {
            addCriterion("teacher_id not between", value1, value2, "teacher_id");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledIsNull() {
            addCriterion("is_comment_enabled is null");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledIsNotNull() {
            addCriterion("is_comment_enabled is not null");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledEqualTo(String value) {
            addCriterion("is_comment_enabled =", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledNotEqualTo(String value) {
            addCriterion("is_comment_enabled <>", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledGreaterThan(String value) {
            addCriterion("is_comment_enabled >", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledGreaterThanOrEqualTo(String value) {
            addCriterion("is_comment_enabled >=", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledLessThan(String value) {
            addCriterion("is_comment_enabled <", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledLessThanOrEqualTo(String value) {
            addCriterion("is_comment_enabled <=", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledLike(String value) {
            addCriterion("is_comment_enabled like", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledNotLike(String value) {
            addCriterion("is_comment_enabled not like", value, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledIn(List<String> values) {
            addCriterion("is_comment_enabled in", values, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledNotIn(List<String> values) {
            addCriterion("is_comment_enabled not in", values, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledBetween(String value1, String value2) {
            addCriterion("is_comment_enabled between", value1, value2, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andIs_comment_enabledNotBetween(String value1, String value2) {
            addCriterion("is_comment_enabled not between", value1, value2, "is_comment_enabled");
            return (Criteria) this;
        }

        public Criteria andAccess_clientIsNull() {
            addCriterion("access_client is null");
            return (Criteria) this;
        }

        public Criteria andAccess_clientIsNotNull() {
            addCriterion("access_client is not null");
            return (Criteria) this;
        }

        public Criteria andAccess_clientEqualTo(String value) {
            addCriterion("access_client =", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientNotEqualTo(String value) {
            addCriterion("access_client <>", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientGreaterThan(String value) {
            addCriterion("access_client >", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientGreaterThanOrEqualTo(String value) {
            addCriterion("access_client >=", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientLessThan(String value) {
            addCriterion("access_client <", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientLessThanOrEqualTo(String value) {
            addCriterion("access_client <=", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientLike(String value) {
            addCriterion("access_client like", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientNotLike(String value) {
            addCriterion("access_client not like", value, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientIn(List<String> values) {
            addCriterion("access_client in", values, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientNotIn(List<String> values) {
            addCriterion("access_client not in", values, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientBetween(String value1, String value2) {
            addCriterion("access_client between", value1, value2, "access_client");
            return (Criteria) this;
        }

        public Criteria andAccess_clientNotBetween(String value1, String value2) {
            addCriterion("access_client not between", value1, value2, "access_client");
            return (Criteria) this;
        }

        public Criteria andIs_publishedIsNull() {
            addCriterion("is_published is null");
            return (Criteria) this;
        }

        public Criteria andIs_publishedIsNotNull() {
            addCriterion("is_published is not null");
            return (Criteria) this;
        }

        public Criteria andIs_publishedEqualTo(String value) {
            addCriterion("is_published =", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedNotEqualTo(String value) {
            addCriterion("is_published <>", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedGreaterThan(String value) {
            addCriterion("is_published >", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedGreaterThanOrEqualTo(String value) {
            addCriterion("is_published >=", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedLessThan(String value) {
            addCriterion("is_published <", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedLessThanOrEqualTo(String value) {
            addCriterion("is_published <=", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedLike(String value) {
            addCriterion("is_published like", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedNotLike(String value) {
            addCriterion("is_published not like", value, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedIn(List<String> values) {
            addCriterion("is_published in", values, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedNotIn(List<String> values) {
            addCriterion("is_published not in", values, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedBetween(String value1, String value2) {
            addCriterion("is_published between", value1, value2, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_publishedNotBetween(String value1, String value2) {
            addCriterion("is_published not between", value1, value2, "is_published");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNull() {
            addCriterion("is_deleted is null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIsNotNull() {
            addCriterion("is_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andIs_deletedEqualTo(String value) {
            addCriterion("is_deleted =", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotEqualTo(String value) {
            addCriterion("is_deleted <>", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThan(String value) {
            addCriterion("is_deleted >", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedGreaterThanOrEqualTo(String value) {
            addCriterion("is_deleted >=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThan(String value) {
            addCriterion("is_deleted <", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLessThanOrEqualTo(String value) {
            addCriterion("is_deleted <=", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedLike(String value) {
            addCriterion("is_deleted like", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotLike(String value) {
            addCriterion("is_deleted not like", value, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedIn(List<String> values) {
            addCriterion("is_deleted in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotIn(List<String> values) {
            addCriterion("is_deleted not in", values, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedBetween(String value1, String value2) {
            addCriterion("is_deleted between", value1, value2, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andIs_deletedNotBetween(String value1, String value2) {
            addCriterion("is_deleted not between", value1, value2, "is_deleted");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNull() {
            addCriterion("author is null");
            return (Criteria) this;
        }

        public Criteria andAuthorIsNotNull() {
            addCriterion("author is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorEqualTo(String value) {
            addCriterion("author =", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotEqualTo(String value) {
            addCriterion("author <>", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThan(String value) {
            addCriterion("author >", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorGreaterThanOrEqualTo(String value) {
            addCriterion("author >=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThan(String value) {
            addCriterion("author <", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLessThanOrEqualTo(String value) {
            addCriterion("author <=", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorLike(String value) {
            addCriterion("author like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotLike(String value) {
            addCriterion("author not like", value, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorIn(List<String> values) {
            addCriterion("author in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotIn(List<String> values) {
            addCriterion("author not in", values, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorBetween(String value1, String value2) {
            addCriterion("author between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andAuthorNotBetween(String value1, String value2) {
            addCriterion("author not between", value1, value2, "author");
            return (Criteria) this;
        }

        public Criteria andCopy_rightIsNull() {
            addCriterion("copy_right is null");
            return (Criteria) this;
        }

        public Criteria andCopy_rightIsNotNull() {
            addCriterion("copy_right is not null");
            return (Criteria) this;
        }

        public Criteria andCopy_rightEqualTo(String value) {
            addCriterion("copy_right =", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightNotEqualTo(String value) {
            addCriterion("copy_right <>", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightGreaterThan(String value) {
            addCriterion("copy_right >", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightGreaterThanOrEqualTo(String value) {
            addCriterion("copy_right >=", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightLessThan(String value) {
            addCriterion("copy_right <", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightLessThanOrEqualTo(String value) {
            addCriterion("copy_right <=", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightLike(String value) {
            addCriterion("copy_right like", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightNotLike(String value) {
            addCriterion("copy_right not like", value, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightIn(List<String> values) {
            addCriterion("copy_right in", values, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightNotIn(List<String> values) {
            addCriterion("copy_right not in", values, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightBetween(String value1, String value2) {
            addCriterion("copy_right between", value1, value2, "copy_right");
            return (Criteria) this;
        }

        public Criteria andCopy_rightNotBetween(String value1, String value2) {
            addCriterion("copy_right not between", value1, value2, "copy_right");
            return (Criteria) this;
        }

        public Criteria andVersionIsNull() {
            addCriterion("version is null");
            return (Criteria) this;
        }

        public Criteria andVersionIsNotNull() {
            addCriterion("version is not null");
            return (Criteria) this;
        }

        public Criteria andVersionEqualTo(String value) {
            addCriterion("version =", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotEqualTo(String value) {
            addCriterion("version <>", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThan(String value) {
            addCriterion("version >", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionGreaterThanOrEqualTo(String value) {
            addCriterion("version >=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThan(String value) {
            addCriterion("version <", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLessThanOrEqualTo(String value) {
            addCriterion("version <=", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionLike(String value) {
            addCriterion("version like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotLike(String value) {
            addCriterion("version not like", value, "version");
            return (Criteria) this;
        }

        public Criteria andVersionIn(List<String> values) {
            addCriterion("version in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotIn(List<String> values) {
            addCriterion("version not in", values, "version");
            return (Criteria) this;
        }

        public Criteria andVersionBetween(String value1, String value2) {
            addCriterion("version between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andVersionNotBetween(String value1, String value2) {
            addCriterion("version not between", value1, value2, "version");
            return (Criteria) this;
        }

        public Criteria andCreate_typeIsNull() {
            addCriterion("create_type is null");
            return (Criteria) this;
        }

        public Criteria andCreate_typeIsNotNull() {
            addCriterion("create_type is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_typeEqualTo(String value) {
            addCriterion("create_type =", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeNotEqualTo(String value) {
            addCriterion("create_type <>", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeGreaterThan(String value) {
            addCriterion("create_type >", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeGreaterThanOrEqualTo(String value) {
            addCriterion("create_type >=", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeLessThan(String value) {
            addCriterion("create_type <", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeLessThanOrEqualTo(String value) {
            addCriterion("create_type <=", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeLike(String value) {
            addCriterion("create_type like", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeNotLike(String value) {
            addCriterion("create_type not like", value, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeIn(List<String> values) {
            addCriterion("create_type in", values, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeNotIn(List<String> values) {
            addCriterion("create_type not in", values, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeBetween(String value1, String value2) {
            addCriterion("create_type between", value1, value2, "create_type");
            return (Criteria) this;
        }

        public Criteria andCreate_typeNotBetween(String value1, String value2) {
            addCriterion("create_type not between", value1, value2, "create_type");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idIsNull() {
            addCriterion("copied_content_id is null");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idIsNotNull() {
            addCriterion("copied_content_id is not null");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idEqualTo(Integer value) {
            addCriterion("copied_content_id =", value, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idNotEqualTo(Integer value) {
            addCriterion("copied_content_id <>", value, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idGreaterThan(Integer value) {
            addCriterion("copied_content_id >", value, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("copied_content_id >=", value, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idLessThan(Integer value) {
            addCriterion("copied_content_id <", value, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idLessThanOrEqualTo(Integer value) {
            addCriterion("copied_content_id <=", value, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idIn(List<Integer> values) {
            addCriterion("copied_content_id in", values, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idNotIn(List<Integer> values) {
            addCriterion("copied_content_id not in", values, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idBetween(Integer value1, Integer value2) {
            addCriterion("copied_content_id between", value1, value2, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCopied_content_idNotBetween(Integer value1, Integer value2) {
            addCriterion("copied_content_id not between", value1, value2, "copied_content_id");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_dateEqualTo(Date value) {
            addCriterion("create_date =", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThan(Date value) {
            addCriterion("create_date >", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThan(Date value) {
            addCriterion("create_date <", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateIn(List<Date> values) {
            addCriterion("create_date in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreate_dateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "create_date");
            return (Criteria) this;
        }

        public Criteria andCreated_byIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreated_byIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreated_byEqualTo(Integer value) {
            addCriterion("created_by =", value, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byGreaterThan(Integer value) {
            addCriterion("created_by >", value, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byLessThan(Integer value) {
            addCriterion("created_by <", value, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byIn(List<Integer> values) {
            addCriterion("created_by in", values, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "created_by");
            return (Criteria) this;
        }

        public Criteria andCreated_byNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "created_by");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateIsNull() {
            addCriterion("last_update_date is null");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateIsNotNull() {
            addCriterion("last_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateEqualTo(Date value) {
            addCriterion("last_update_date =", value, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateNotEqualTo(Date value) {
            addCriterion("last_update_date <>", value, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateGreaterThan(Date value) {
            addCriterion("last_update_date >", value, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("last_update_date >=", value, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateLessThan(Date value) {
            addCriterion("last_update_date <", value, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateLessThanOrEqualTo(Date value) {
            addCriterion("last_update_date <=", value, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateIn(List<Date> values) {
            addCriterion("last_update_date in", values, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateNotIn(List<Date> values) {
            addCriterion("last_update_date not in", values, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateBetween(Date value1, Date value2) {
            addCriterion("last_update_date between", value1, value2, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_update_dateNotBetween(Date value1, Date value2) {
            addCriterion("last_update_date not between", value1, value2, "last_update_date");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byIsNull() {
            addCriterion("last_updated_by is null");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byIsNotNull() {
            addCriterion("last_updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byEqualTo(Integer value) {
            addCriterion("last_updated_by =", value, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byNotEqualTo(Integer value) {
            addCriterion("last_updated_by <>", value, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byGreaterThan(Integer value) {
            addCriterion("last_updated_by >", value, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byGreaterThanOrEqualTo(Integer value) {
            addCriterion("last_updated_by >=", value, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byLessThan(Integer value) {
            addCriterion("last_updated_by <", value, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byLessThanOrEqualTo(Integer value) {
            addCriterion("last_updated_by <=", value, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byIn(List<Integer> values) {
            addCriterion("last_updated_by in", values, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byNotIn(List<Integer> values) {
            addCriterion("last_updated_by not in", values, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byBetween(Integer value1, Integer value2) {
            addCriterion("last_updated_by between", value1, value2, "last_updated_by");
            return (Criteria) this;
        }

        public Criteria andLast_updated_byNotBetween(Integer value1, Integer value2) {
            addCriterion("last_updated_by not between", value1, value2, "last_updated_by");
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