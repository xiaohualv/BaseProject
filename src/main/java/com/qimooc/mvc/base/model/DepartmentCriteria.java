package com.qimooc.mvc.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DepartmentCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DepartmentCriteria() {
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

        public Criteria andDept_nameIsNull() {
            addCriterion("dept_name is null");
            return (Criteria) this;
        }

        public Criteria andDept_nameIsNotNull() {
            addCriterion("dept_name is not null");
            return (Criteria) this;
        }

        public Criteria andDept_nameEqualTo(String value) {
            addCriterion("dept_name =", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameNotEqualTo(String value) {
            addCriterion("dept_name <>", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameGreaterThan(String value) {
            addCriterion("dept_name >", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameGreaterThanOrEqualTo(String value) {
            addCriterion("dept_name >=", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameLessThan(String value) {
            addCriterion("dept_name <", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameLessThanOrEqualTo(String value) {
            addCriterion("dept_name <=", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameLike(String value) {
            addCriterion("dept_name like", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameNotLike(String value) {
            addCriterion("dept_name not like", value, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameIn(List<String> values) {
            addCriterion("dept_name in", values, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameNotIn(List<String> values) {
            addCriterion("dept_name not in", values, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameBetween(String value1, String value2) {
            addCriterion("dept_name between", value1, value2, "dept_name");
            return (Criteria) this;
        }

        public Criteria andDept_nameNotBetween(String value1, String value2) {
            addCriterion("dept_name not between", value1, value2, "dept_name");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idIsNull() {
            addCriterion("parent_dept_id is null");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idIsNotNull() {
            addCriterion("parent_dept_id is not null");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idEqualTo(Integer value) {
            addCriterion("parent_dept_id =", value, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idNotEqualTo(Integer value) {
            addCriterion("parent_dept_id <>", value, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idGreaterThan(Integer value) {
            addCriterion("parent_dept_id >", value, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_dept_id >=", value, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idLessThan(Integer value) {
            addCriterion("parent_dept_id <", value, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idLessThanOrEqualTo(Integer value) {
            addCriterion("parent_dept_id <=", value, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idIn(List<Integer> values) {
            addCriterion("parent_dept_id in", values, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idNotIn(List<Integer> values) {
            addCriterion("parent_dept_id not in", values, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idBetween(Integer value1, Integer value2) {
            addCriterion("parent_dept_id between", value1, value2, "parent_dept_id");
            return (Criteria) this;
        }

        public Criteria andParent_dept_idNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_dept_id not between", value1, value2, "parent_dept_id");
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

        public Criteria andDept_codeIsNull() {
            addCriterion("dept_code is null");
            return (Criteria) this;
        }

        public Criteria andDept_codeIsNotNull() {
            addCriterion("dept_code is not null");
            return (Criteria) this;
        }

        public Criteria andDept_codeEqualTo(String value) {
            addCriterion("dept_code =", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeNotEqualTo(String value) {
            addCriterion("dept_code <>", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeGreaterThan(String value) {
            addCriterion("dept_code >", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeGreaterThanOrEqualTo(String value) {
            addCriterion("dept_code >=", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeLessThan(String value) {
            addCriterion("dept_code <", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeLessThanOrEqualTo(String value) {
            addCriterion("dept_code <=", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeLike(String value) {
            addCriterion("dept_code like", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeNotLike(String value) {
            addCriterion("dept_code not like", value, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeIn(List<String> values) {
            addCriterion("dept_code in", values, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeNotIn(List<String> values) {
            addCriterion("dept_code not in", values, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeBetween(String value1, String value2) {
            addCriterion("dept_code between", value1, value2, "dept_code");
            return (Criteria) this;
        }

        public Criteria andDept_codeNotBetween(String value1, String value2) {
            addCriterion("dept_code not between", value1, value2, "dept_code");
            return (Criteria) this;
        }

        public Criteria andIs_parentIsNull() {
            addCriterion("is_parent is null");
            return (Criteria) this;
        }

        public Criteria andIs_parentIsNotNull() {
            addCriterion("is_parent is not null");
            return (Criteria) this;
        }

        public Criteria andIs_parentEqualTo(String value) {
            addCriterion("is_parent =", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentNotEqualTo(String value) {
            addCriterion("is_parent <>", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentGreaterThan(String value) {
            addCriterion("is_parent >", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentGreaterThanOrEqualTo(String value) {
            addCriterion("is_parent >=", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentLessThan(String value) {
            addCriterion("is_parent <", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentLessThanOrEqualTo(String value) {
            addCriterion("is_parent <=", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentLike(String value) {
            addCriterion("is_parent like", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentNotLike(String value) {
            addCriterion("is_parent not like", value, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentIn(List<String> values) {
            addCriterion("is_parent in", values, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentNotIn(List<String> values) {
            addCriterion("is_parent not in", values, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentBetween(String value1, String value2) {
            addCriterion("is_parent between", value1, value2, "is_parent");
            return (Criteria) this;
        }

        public Criteria andIs_parentNotBetween(String value1, String value2) {
            addCriterion("is_parent not between", value1, value2, "is_parent");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderIsNull() {
            addCriterion("display_order is null");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderIsNotNull() {
            addCriterion("display_order is not null");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderEqualTo(Integer value) {
            addCriterion("display_order =", value, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderNotEqualTo(Integer value) {
            addCriterion("display_order <>", value, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderGreaterThan(Integer value) {
            addCriterion("display_order >", value, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderGreaterThanOrEqualTo(Integer value) {
            addCriterion("display_order >=", value, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderLessThan(Integer value) {
            addCriterion("display_order <", value, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderLessThanOrEqualTo(Integer value) {
            addCriterion("display_order <=", value, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderIn(List<Integer> values) {
            addCriterion("display_order in", values, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderNotIn(List<Integer> values) {
            addCriterion("display_order not in", values, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderBetween(Integer value1, Integer value2) {
            addCriterion("display_order between", value1, value2, "display_order");
            return (Criteria) this;
        }

        public Criteria andDisplay_orderNotBetween(Integer value1, Integer value2) {
            addCriterion("display_order not between", value1, value2, "display_order");
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