package com.qimooc.mvc.base.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserCriteria() {
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

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(Integer value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(Integer value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(Integer value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<Integer> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUser_nameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUser_nameEqualTo(String value) {
            addCriterion("user_name =", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThan(String value) {
            addCriterion("user_name >", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThan(String value) {
            addCriterion("user_name <", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameLike(String value) {
            addCriterion("user_name like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotLike(String value) {
            addCriterion("user_name not like", value, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameIn(List<String> values) {
            addCriterion("user_name in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andUser_nameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "user_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameIsNull() {
            addCriterion("real_name is null");
            return (Criteria) this;
        }

        public Criteria andReal_nameIsNotNull() {
            addCriterion("real_name is not null");
            return (Criteria) this;
        }

        public Criteria andReal_nameEqualTo(String value) {
            addCriterion("real_name =", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotEqualTo(String value) {
            addCriterion("real_name <>", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameGreaterThan(String value) {
            addCriterion("real_name >", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameGreaterThanOrEqualTo(String value) {
            addCriterion("real_name >=", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLessThan(String value) {
            addCriterion("real_name <", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLessThanOrEqualTo(String value) {
            addCriterion("real_name <=", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameLike(String value) {
            addCriterion("real_name like", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotLike(String value) {
            addCriterion("real_name not like", value, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameIn(List<String> values) {
            addCriterion("real_name in", values, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotIn(List<String> values) {
            addCriterion("real_name not in", values, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameBetween(String value1, String value2) {
            addCriterion("real_name between", value1, value2, "real_name");
            return (Criteria) this;
        }

        public Criteria andReal_nameNotBetween(String value1, String value2) {
            addCriterion("real_name not between", value1, value2, "real_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompany_nameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompany_nameEqualTo(String value) {
            addCriterion("company_name =", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameGreaterThan(String value) {
            addCriterion("company_name >", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameLessThan(String value) {
            addCriterion("company_name <", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameLike(String value) {
            addCriterion("company_name like", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotLike(String value) {
            addCriterion("company_name not like", value, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameIn(List<String> values) {
            addCriterion("company_name in", values, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "company_name");
            return (Criteria) this;
        }

        public Criteria andCompany_nameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "company_name");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIsNull() {
            addCriterion("mobile_phone is null");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIsNotNull() {
            addCriterion("mobile_phone is not null");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneEqualTo(String value) {
            addCriterion("mobile_phone =", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotEqualTo(String value) {
            addCriterion("mobile_phone <>", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneGreaterThan(String value) {
            addCriterion("mobile_phone >", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_phone >=", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLessThan(String value) {
            addCriterion("mobile_phone <", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLessThanOrEqualTo(String value) {
            addCriterion("mobile_phone <=", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneLike(String value) {
            addCriterion("mobile_phone like", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotLike(String value) {
            addCriterion("mobile_phone not like", value, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneIn(List<String> values) {
            addCriterion("mobile_phone in", values, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotIn(List<String> values) {
            addCriterion("mobile_phone not in", values, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneBetween(String value1, String value2) {
            addCriterion("mobile_phone between", value1, value2, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andMobile_phoneNotBetween(String value1, String value2) {
            addCriterion("mobile_phone not between", value1, value2, "mobile_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneIsNull() {
            addCriterion("is_valid_phone is null");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneIsNotNull() {
            addCriterion("is_valid_phone is not null");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneEqualTo(String value) {
            addCriterion("is_valid_phone =", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneNotEqualTo(String value) {
            addCriterion("is_valid_phone <>", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneGreaterThan(String value) {
            addCriterion("is_valid_phone >", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid_phone >=", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneLessThan(String value) {
            addCriterion("is_valid_phone <", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneLessThanOrEqualTo(String value) {
            addCriterion("is_valid_phone <=", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneLike(String value) {
            addCriterion("is_valid_phone like", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneNotLike(String value) {
            addCriterion("is_valid_phone not like", value, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneIn(List<String> values) {
            addCriterion("is_valid_phone in", values, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneNotIn(List<String> values) {
            addCriterion("is_valid_phone not in", values, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneBetween(String value1, String value2) {
            addCriterion("is_valid_phone between", value1, value2, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andIs_valid_phoneNotBetween(String value1, String value2) {
            addCriterion("is_valid_phone not between", value1, value2, "is_valid_phone");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailIsNull() {
            addCriterion("is_valid_email is null");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailIsNotNull() {
            addCriterion("is_valid_email is not null");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailEqualTo(String value) {
            addCriterion("is_valid_email =", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailNotEqualTo(String value) {
            addCriterion("is_valid_email <>", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailGreaterThan(String value) {
            addCriterion("is_valid_email >", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailGreaterThanOrEqualTo(String value) {
            addCriterion("is_valid_email >=", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailLessThan(String value) {
            addCriterion("is_valid_email <", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailLessThanOrEqualTo(String value) {
            addCriterion("is_valid_email <=", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailLike(String value) {
            addCriterion("is_valid_email like", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailNotLike(String value) {
            addCriterion("is_valid_email not like", value, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailIn(List<String> values) {
            addCriterion("is_valid_email in", values, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailNotIn(List<String> values) {
            addCriterion("is_valid_email not in", values, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailBetween(String value1, String value2) {
            addCriterion("is_valid_email between", value1, value2, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andIs_valid_emailNotBetween(String value1, String value2) {
            addCriterion("is_valid_email not between", value1, value2, "is_valid_email");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidIsNull() {
            addCriterion("weixin_unionid is null");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidIsNotNull() {
            addCriterion("weixin_unionid is not null");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidEqualTo(String value) {
            addCriterion("weixin_unionid =", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidNotEqualTo(String value) {
            addCriterion("weixin_unionid <>", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidGreaterThan(String value) {
            addCriterion("weixin_unionid >", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_unionid >=", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidLessThan(String value) {
            addCriterion("weixin_unionid <", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidLessThanOrEqualTo(String value) {
            addCriterion("weixin_unionid <=", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidLike(String value) {
            addCriterion("weixin_unionid like", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidNotLike(String value) {
            addCriterion("weixin_unionid not like", value, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidIn(List<String> values) {
            addCriterion("weixin_unionid in", values, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidNotIn(List<String> values) {
            addCriterion("weixin_unionid not in", values, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidBetween(String value1, String value2) {
            addCriterion("weixin_unionid between", value1, value2, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_unionidNotBetween(String value1, String value2) {
            addCriterion("weixin_unionid not between", value1, value2, "weixin_unionid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidIsNull() {
            addCriterion("weixin_appid is null");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidIsNotNull() {
            addCriterion("weixin_appid is not null");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidEqualTo(String value) {
            addCriterion("weixin_appid =", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidNotEqualTo(String value) {
            addCriterion("weixin_appid <>", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidGreaterThan(String value) {
            addCriterion("weixin_appid >", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_appid >=", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidLessThan(String value) {
            addCriterion("weixin_appid <", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidLessThanOrEqualTo(String value) {
            addCriterion("weixin_appid <=", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidLike(String value) {
            addCriterion("weixin_appid like", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidNotLike(String value) {
            addCriterion("weixin_appid not like", value, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidIn(List<String> values) {
            addCriterion("weixin_appid in", values, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidNotIn(List<String> values) {
            addCriterion("weixin_appid not in", values, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidBetween(String value1, String value2) {
            addCriterion("weixin_appid between", value1, value2, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_appidNotBetween(String value1, String value2) {
            addCriterion("weixin_appid not between", value1, value2, "weixin_appid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidIsNull() {
            addCriterion("weixin_openid is null");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidIsNotNull() {
            addCriterion("weixin_openid is not null");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidEqualTo(String value) {
            addCriterion("weixin_openid =", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidNotEqualTo(String value) {
            addCriterion("weixin_openid <>", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidGreaterThan(String value) {
            addCriterion("weixin_openid >", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidGreaterThanOrEqualTo(String value) {
            addCriterion("weixin_openid >=", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidLessThan(String value) {
            addCriterion("weixin_openid <", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidLessThanOrEqualTo(String value) {
            addCriterion("weixin_openid <=", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidLike(String value) {
            addCriterion("weixin_openid like", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidNotLike(String value) {
            addCriterion("weixin_openid not like", value, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidIn(List<String> values) {
            addCriterion("weixin_openid in", values, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidNotIn(List<String> values) {
            addCriterion("weixin_openid not in", values, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidBetween(String value1, String value2) {
            addCriterion("weixin_openid between", value1, value2, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andWeixin_openidNotBetween(String value1, String value2) {
            addCriterion("weixin_openid not between", value1, value2, "weixin_openid");
            return (Criteria) this;
        }

        public Criteria andInner_idIsNull() {
            addCriterion("inner_id is null");
            return (Criteria) this;
        }

        public Criteria andInner_idIsNotNull() {
            addCriterion("inner_id is not null");
            return (Criteria) this;
        }

        public Criteria andInner_idEqualTo(String value) {
            addCriterion("inner_id =", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idNotEqualTo(String value) {
            addCriterion("inner_id <>", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idGreaterThan(String value) {
            addCriterion("inner_id >", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idGreaterThanOrEqualTo(String value) {
            addCriterion("inner_id >=", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idLessThan(String value) {
            addCriterion("inner_id <", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idLessThanOrEqualTo(String value) {
            addCriterion("inner_id <=", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idLike(String value) {
            addCriterion("inner_id like", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idNotLike(String value) {
            addCriterion("inner_id not like", value, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idIn(List<String> values) {
            addCriterion("inner_id in", values, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idNotIn(List<String> values) {
            addCriterion("inner_id not in", values, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idBetween(String value1, String value2) {
            addCriterion("inner_id between", value1, value2, "inner_id");
            return (Criteria) this;
        }

        public Criteria andInner_idNotBetween(String value1, String value2) {
            addCriterion("inner_id not between", value1, value2, "inner_id");
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

        public Criteria andSource_idIsNull() {
            addCriterion("source_id is null");
            return (Criteria) this;
        }

        public Criteria andSource_idIsNotNull() {
            addCriterion("source_id is not null");
            return (Criteria) this;
        }

        public Criteria andSource_idEqualTo(Integer value) {
            addCriterion("source_id =", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idNotEqualTo(Integer value) {
            addCriterion("source_id <>", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idGreaterThan(Integer value) {
            addCriterion("source_id >", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("source_id >=", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idLessThan(Integer value) {
            addCriterion("source_id <", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idLessThanOrEqualTo(Integer value) {
            addCriterion("source_id <=", value, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idIn(List<Integer> values) {
            addCriterion("source_id in", values, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idNotIn(List<Integer> values) {
            addCriterion("source_id not in", values, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idBetween(Integer value1, Integer value2) {
            addCriterion("source_id between", value1, value2, "source_id");
            return (Criteria) this;
        }

        public Criteria andSource_idNotBetween(Integer value1, Integer value2) {
            addCriterion("source_id not between", value1, value2, "source_id");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andSaltIsNull() {
            addCriterion("salt is null");
            return (Criteria) this;
        }

        public Criteria andSaltIsNotNull() {
            addCriterion("salt is not null");
            return (Criteria) this;
        }

        public Criteria andSaltEqualTo(String value) {
            addCriterion("salt =", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotEqualTo(String value) {
            addCriterion("salt <>", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThan(String value) {
            addCriterion("salt >", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltGreaterThanOrEqualTo(String value) {
            addCriterion("salt >=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThan(String value) {
            addCriterion("salt <", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLessThanOrEqualTo(String value) {
            addCriterion("salt <=", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltLike(String value) {
            addCriterion("salt like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotLike(String value) {
            addCriterion("salt not like", value, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltIn(List<String> values) {
            addCriterion("salt in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotIn(List<String> values) {
            addCriterion("salt not in", values, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltBetween(String value1, String value2) {
            addCriterion("salt between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andSaltNotBetween(String value1, String value2) {
            addCriterion("salt not between", value1, value2, "salt");
            return (Criteria) this;
        }

        public Criteria andNational_idIsNull() {
            addCriterion("national_id is null");
            return (Criteria) this;
        }

        public Criteria andNational_idIsNotNull() {
            addCriterion("national_id is not null");
            return (Criteria) this;
        }

        public Criteria andNational_idEqualTo(String value) {
            addCriterion("national_id =", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idNotEqualTo(String value) {
            addCriterion("national_id <>", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idGreaterThan(String value) {
            addCriterion("national_id >", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idGreaterThanOrEqualTo(String value) {
            addCriterion("national_id >=", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idLessThan(String value) {
            addCriterion("national_id <", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idLessThanOrEqualTo(String value) {
            addCriterion("national_id <=", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idLike(String value) {
            addCriterion("national_id like", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idNotLike(String value) {
            addCriterion("national_id not like", value, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idIn(List<String> values) {
            addCriterion("national_id in", values, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idNotIn(List<String> values) {
            addCriterion("national_id not in", values, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idBetween(String value1, String value2) {
            addCriterion("national_id between", value1, value2, "national_id");
            return (Criteria) this;
        }

        public Criteria andNational_idNotBetween(String value1, String value2) {
            addCriterion("national_id not between", value1, value2, "national_id");
            return (Criteria) this;
        }

        public Criteria andIs_expiredIsNull() {
            addCriterion("is_expired is null");
            return (Criteria) this;
        }

        public Criteria andIs_expiredIsNotNull() {
            addCriterion("is_expired is not null");
            return (Criteria) this;
        }

        public Criteria andIs_expiredEqualTo(String value) {
            addCriterion("is_expired =", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredNotEqualTo(String value) {
            addCriterion("is_expired <>", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredGreaterThan(String value) {
            addCriterion("is_expired >", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredGreaterThanOrEqualTo(String value) {
            addCriterion("is_expired >=", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredLessThan(String value) {
            addCriterion("is_expired <", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredLessThanOrEqualTo(String value) {
            addCriterion("is_expired <=", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredLike(String value) {
            addCriterion("is_expired like", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredNotLike(String value) {
            addCriterion("is_expired not like", value, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredIn(List<String> values) {
            addCriterion("is_expired in", values, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredNotIn(List<String> values) {
            addCriterion("is_expired not in", values, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredBetween(String value1, String value2) {
            addCriterion("is_expired between", value1, value2, "is_expired");
            return (Criteria) this;
        }

        public Criteria andIs_expiredNotBetween(String value1, String value2) {
            addCriterion("is_expired not between", value1, value2, "is_expired");
            return (Criteria) this;
        }

        public Criteria andExpire_dateIsNull() {
            addCriterion("expire_date is null");
            return (Criteria) this;
        }

        public Criteria andExpire_dateIsNotNull() {
            addCriterion("expire_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpire_dateEqualTo(Date value) {
            addCriterion("expire_date =", value, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateNotEqualTo(Date value) {
            addCriterion("expire_date <>", value, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateGreaterThan(Date value) {
            addCriterion("expire_date >", value, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("expire_date >=", value, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateLessThan(Date value) {
            addCriterion("expire_date <", value, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateLessThanOrEqualTo(Date value) {
            addCriterion("expire_date <=", value, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateIn(List<Date> values) {
            addCriterion("expire_date in", values, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateNotIn(List<Date> values) {
            addCriterion("expire_date not in", values, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateBetween(Date value1, Date value2) {
            addCriterion("expire_date between", value1, value2, "expire_date");
            return (Criteria) this;
        }

        public Criteria andExpire_dateNotBetween(Date value1, Date value2) {
            addCriterion("expire_date not between", value1, value2, "expire_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateIsNull() {
            addCriterion("entry_date is null");
            return (Criteria) this;
        }

        public Criteria andEntry_dateIsNotNull() {
            addCriterion("entry_date is not null");
            return (Criteria) this;
        }

        public Criteria andEntry_dateEqualTo(Date value) {
            addCriterion("entry_date =", value, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateNotEqualTo(Date value) {
            addCriterion("entry_date <>", value, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateGreaterThan(Date value) {
            addCriterion("entry_date >", value, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("entry_date >=", value, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateLessThan(Date value) {
            addCriterion("entry_date <", value, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateLessThanOrEqualTo(Date value) {
            addCriterion("entry_date <=", value, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateIn(List<Date> values) {
            addCriterion("entry_date in", values, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateNotIn(List<Date> values) {
            addCriterion("entry_date not in", values, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateBetween(Date value1, Date value2) {
            addCriterion("entry_date between", value1, value2, "entry_date");
            return (Criteria) this;
        }

        public Criteria andEntry_dateNotBetween(Date value1, Date value2) {
            addCriterion("entry_date not between", value1, value2, "entry_date");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayIsNull() {
            addCriterion("new_employee_day is null");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayIsNotNull() {
            addCriterion("new_employee_day is not null");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayEqualTo(Integer value) {
            addCriterion("new_employee_day =", value, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayNotEqualTo(Integer value) {
            addCriterion("new_employee_day <>", value, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayGreaterThan(Integer value) {
            addCriterion("new_employee_day >", value, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayGreaterThanOrEqualTo(Integer value) {
            addCriterion("new_employee_day >=", value, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayLessThan(Integer value) {
            addCriterion("new_employee_day <", value, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayLessThanOrEqualTo(Integer value) {
            addCriterion("new_employee_day <=", value, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayIn(List<Integer> values) {
            addCriterion("new_employee_day in", values, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayNotIn(List<Integer> values) {
            addCriterion("new_employee_day not in", values, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayBetween(Integer value1, Integer value2) {
            addCriterion("new_employee_day between", value1, value2, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andNew_employee_dayNotBetween(Integer value1, Integer value2) {
            addCriterion("new_employee_day not between", value1, value2, "new_employee_day");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeIsNull() {
            addCriterion("is_new_employee is null");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeIsNotNull() {
            addCriterion("is_new_employee is not null");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeEqualTo(String value) {
            addCriterion("is_new_employee =", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeNotEqualTo(String value) {
            addCriterion("is_new_employee <>", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeGreaterThan(String value) {
            addCriterion("is_new_employee >", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeGreaterThanOrEqualTo(String value) {
            addCriterion("is_new_employee >=", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeLessThan(String value) {
            addCriterion("is_new_employee <", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeLessThanOrEqualTo(String value) {
            addCriterion("is_new_employee <=", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeLike(String value) {
            addCriterion("is_new_employee like", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeNotLike(String value) {
            addCriterion("is_new_employee not like", value, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeIn(List<String> values) {
            addCriterion("is_new_employee in", values, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeNotIn(List<String> values) {
            addCriterion("is_new_employee not in", values, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeBetween(String value1, String value2) {
            addCriterion("is_new_employee between", value1, value2, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andIs_new_employeeNotBetween(String value1, String value2) {
            addCriterion("is_new_employee not between", value1, value2, "is_new_employee");
            return (Criteria) this;
        }

        public Criteria andPost_idIsNull() {
            addCriterion("post_id is null");
            return (Criteria) this;
        }

        public Criteria andPost_idIsNotNull() {
            addCriterion("post_id is not null");
            return (Criteria) this;
        }

        public Criteria andPost_idEqualTo(Integer value) {
            addCriterion("post_id =", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idNotEqualTo(Integer value) {
            addCriterion("post_id <>", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idGreaterThan(Integer value) {
            addCriterion("post_id >", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("post_id >=", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idLessThan(Integer value) {
            addCriterion("post_id <", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idLessThanOrEqualTo(Integer value) {
            addCriterion("post_id <=", value, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idIn(List<Integer> values) {
            addCriterion("post_id in", values, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idNotIn(List<Integer> values) {
            addCriterion("post_id not in", values, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idBetween(Integer value1, Integer value2) {
            addCriterion("post_id between", value1, value2, "post_id");
            return (Criteria) this;
        }

        public Criteria andPost_idNotBetween(Integer value1, Integer value2) {
            addCriterion("post_id not between", value1, value2, "post_id");
            return (Criteria) this;
        }

        public Criteria andAgent_codeIsNull() {
            addCriterion("agent_code is null");
            return (Criteria) this;
        }

        public Criteria andAgent_codeIsNotNull() {
            addCriterion("agent_code is not null");
            return (Criteria) this;
        }

        public Criteria andAgent_codeEqualTo(String value) {
            addCriterion("agent_code =", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeNotEqualTo(String value) {
            addCriterion("agent_code <>", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeGreaterThan(String value) {
            addCriterion("agent_code >", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeGreaterThanOrEqualTo(String value) {
            addCriterion("agent_code >=", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeLessThan(String value) {
            addCriterion("agent_code <", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeLessThanOrEqualTo(String value) {
            addCriterion("agent_code <=", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeLike(String value) {
            addCriterion("agent_code like", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeNotLike(String value) {
            addCriterion("agent_code not like", value, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeIn(List<String> values) {
            addCriterion("agent_code in", values, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeNotIn(List<String> values) {
            addCriterion("agent_code not in", values, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeBetween(String value1, String value2) {
            addCriterion("agent_code between", value1, value2, "agent_code");
            return (Criteria) this;
        }

        public Criteria andAgent_codeNotBetween(String value1, String value2) {
            addCriterion("agent_code not between", value1, value2, "agent_code");
            return (Criteria) this;
        }

        public Criteria andRegister_typeIsNull() {
            addCriterion("register_type is null");
            return (Criteria) this;
        }

        public Criteria andRegister_typeIsNotNull() {
            addCriterion("register_type is not null");
            return (Criteria) this;
        }

        public Criteria andRegister_typeEqualTo(String value) {
            addCriterion("register_type =", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeNotEqualTo(String value) {
            addCriterion("register_type <>", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeGreaterThan(String value) {
            addCriterion("register_type >", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeGreaterThanOrEqualTo(String value) {
            addCriterion("register_type >=", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeLessThan(String value) {
            addCriterion("register_type <", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeLessThanOrEqualTo(String value) {
            addCriterion("register_type <=", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeLike(String value) {
            addCriterion("register_type like", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeNotLike(String value) {
            addCriterion("register_type not like", value, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeIn(List<String> values) {
            addCriterion("register_type in", values, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeNotIn(List<String> values) {
            addCriterion("register_type not in", values, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeBetween(String value1, String value2) {
            addCriterion("register_type between", value1, value2, "register_type");
            return (Criteria) this;
        }

        public Criteria andRegister_typeNotBetween(String value1, String value2) {
            addCriterion("register_type not between", value1, value2, "register_type");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideIsNull() {
            addCriterion("is_hidden_layout_guide is null");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideIsNotNull() {
            addCriterion("is_hidden_layout_guide is not null");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideEqualTo(String value) {
            addCriterion("is_hidden_layout_guide =", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideNotEqualTo(String value) {
            addCriterion("is_hidden_layout_guide <>", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideGreaterThan(String value) {
            addCriterion("is_hidden_layout_guide >", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideGreaterThanOrEqualTo(String value) {
            addCriterion("is_hidden_layout_guide >=", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideLessThan(String value) {
            addCriterion("is_hidden_layout_guide <", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideLessThanOrEqualTo(String value) {
            addCriterion("is_hidden_layout_guide <=", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideLike(String value) {
            addCriterion("is_hidden_layout_guide like", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideNotLike(String value) {
            addCriterion("is_hidden_layout_guide not like", value, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideIn(List<String> values) {
            addCriterion("is_hidden_layout_guide in", values, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideNotIn(List<String> values) {
            addCriterion("is_hidden_layout_guide not in", values, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideBetween(String value1, String value2) {
            addCriterion("is_hidden_layout_guide between", value1, value2, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_layout_guideNotBetween(String value1, String value2) {
            addCriterion("is_hidden_layout_guide not between", value1, value2, "is_hidden_layout_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideIsNull() {
            addCriterion("is_hidden_app_guide is null");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideIsNotNull() {
            addCriterion("is_hidden_app_guide is not null");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideEqualTo(String value) {
            addCriterion("is_hidden_app_guide =", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideNotEqualTo(String value) {
            addCriterion("is_hidden_app_guide <>", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideGreaterThan(String value) {
            addCriterion("is_hidden_app_guide >", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideGreaterThanOrEqualTo(String value) {
            addCriterion("is_hidden_app_guide >=", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideLessThan(String value) {
            addCriterion("is_hidden_app_guide <", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideLessThanOrEqualTo(String value) {
            addCriterion("is_hidden_app_guide <=", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideLike(String value) {
            addCriterion("is_hidden_app_guide like", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideNotLike(String value) {
            addCriterion("is_hidden_app_guide not like", value, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideIn(List<String> values) {
            addCriterion("is_hidden_app_guide in", values, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideNotIn(List<String> values) {
            addCriterion("is_hidden_app_guide not in", values, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideBetween(String value1, String value2) {
            addCriterion("is_hidden_app_guide between", value1, value2, "is_hidden_app_guide");
            return (Criteria) this;
        }

        public Criteria andIs_hidden_app_guideNotBetween(String value1, String value2) {
            addCriterion("is_hidden_app_guide not between", value1, value2, "is_hidden_app_guide");
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