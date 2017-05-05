package com.qimooc.mvc.base.model;

import com.qimooc.common.model.BaseModel;
import java.util.Date;

public class User extends BaseModel {
    private Integer user_id;

    private String user_name;

    private String real_name;

    private String company_name;

    private String gender;

    private String mobile_phone;

    private String is_valid_phone;

    private String email;

    private String is_valid_email;

    private String weixin_unionid;

    private String weixin_appid;

    private String weixin_openid;

    private String inner_id;

    private Integer site_id;

    private Integer dept_id;

    private String img_url;

    private Integer source_id;

    private String password;

    private String salt;

    private String national_id;

    private String is_expired;

    private Date expire_date;

    private Date entry_date;

    private Integer new_employee_day;

    private String is_new_employee;

    private Integer post_id;

    private String agent_code;

    private String register_type;

    private String is_hidden_layout_guide;

    private String is_hidden_app_guide;

    private Date create_date;

    private Integer created_by;

    private Date last_update_date;

    private Integer last_updated_by;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name == null ? null : user_name.trim();
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name == null ? null : real_name.trim();
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name == null ? null : company_name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone == null ? null : mobile_phone.trim();
    }

    public String getIs_valid_phone() {
        return is_valid_phone;
    }

    public void setIs_valid_phone(String is_valid_phone) {
        this.is_valid_phone = is_valid_phone == null ? null : is_valid_phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIs_valid_email() {
        return is_valid_email;
    }

    public void setIs_valid_email(String is_valid_email) {
        this.is_valid_email = is_valid_email == null ? null : is_valid_email.trim();
    }

    public String getWeixin_unionid() {
        return weixin_unionid;
    }

    public void setWeixin_unionid(String weixin_unionid) {
        this.weixin_unionid = weixin_unionid == null ? null : weixin_unionid.trim();
    }

    public String getWeixin_appid() {
        return weixin_appid;
    }

    public void setWeixin_appid(String weixin_appid) {
        this.weixin_appid = weixin_appid == null ? null : weixin_appid.trim();
    }

    public String getWeixin_openid() {
        return weixin_openid;
    }

    public void setWeixin_openid(String weixin_openid) {
        this.weixin_openid = weixin_openid == null ? null : weixin_openid.trim();
    }

    public String getInner_id() {
        return inner_id;
    }

    public void setInner_id(String inner_id) {
        this.inner_id = inner_id == null ? null : inner_id.trim();
    }

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url == null ? null : img_url.trim();
    }

    public Integer getSource_id() {
        return source_id;
    }

    public void setSource_id(Integer source_id) {
        this.source_id = source_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getNational_id() {
        return national_id;
    }

    public void setNational_id(String national_id) {
        this.national_id = national_id == null ? null : national_id.trim();
    }

    public String getIs_expired() {
        return is_expired;
    }

    public void setIs_expired(String is_expired) {
        this.is_expired = is_expired == null ? null : is_expired.trim();
    }

    public Date getExpire_date() {
        return expire_date;
    }

    public void setExpire_date(Date expire_date) {
        this.expire_date = expire_date;
    }

    public Date getEntry_date() {
        return entry_date;
    }

    public void setEntry_date(Date entry_date) {
        this.entry_date = entry_date;
    }

    public Integer getNew_employee_day() {
        return new_employee_day;
    }

    public void setNew_employee_day(Integer new_employee_day) {
        this.new_employee_day = new_employee_day;
    }

    public String getIs_new_employee() {
        return is_new_employee;
    }

    public void setIs_new_employee(String is_new_employee) {
        this.is_new_employee = is_new_employee == null ? null : is_new_employee.trim();
    }

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getAgent_code() {
        return agent_code;
    }

    public void setAgent_code(String agent_code) {
        this.agent_code = agent_code == null ? null : agent_code.trim();
    }

    public String getRegister_type() {
        return register_type;
    }

    public void setRegister_type(String register_type) {
        this.register_type = register_type == null ? null : register_type.trim();
    }

    public String getIs_hidden_layout_guide() {
        return is_hidden_layout_guide;
    }

    public void setIs_hidden_layout_guide(String is_hidden_layout_guide) {
        this.is_hidden_layout_guide = is_hidden_layout_guide == null ? null : is_hidden_layout_guide.trim();
    }

    public String getIs_hidden_app_guide() {
        return is_hidden_app_guide;
    }

    public void setIs_hidden_app_guide(String is_hidden_app_guide) {
        this.is_hidden_app_guide = is_hidden_app_guide == null ? null : is_hidden_app_guide.trim();
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }

    public Integer getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(Integer last_updated_by) {
        this.last_updated_by = last_updated_by;
    }
}