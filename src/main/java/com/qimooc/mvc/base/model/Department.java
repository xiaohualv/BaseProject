package com.qimooc.mvc.base.model;

import com.qimooc.common.model.BaseModel;
import java.util.Date;

public class Department extends BaseModel {
    private Integer dept_id;

    private String dept_name;

    private Integer parent_dept_id;

    private Integer site_id;

    private String dept_code;

    private String is_parent;

    private Integer level;

    private Integer display_order;

    private Integer created_by;

    private Date create_date;

    private Integer last_updated_by;

    private Date last_update_date;

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name == null ? null : dept_name.trim();
    }

    public Integer getParent_dept_id() {
        return parent_dept_id;
    }

    public void setParent_dept_id(Integer parent_dept_id) {
        this.parent_dept_id = parent_dept_id;
    }

    public Integer getSite_id() {
        return site_id;
    }

    public void setSite_id(Integer site_id) {
        this.site_id = site_id;
    }

    public String getDept_code() {
        return dept_code;
    }

    public void setDept_code(String dept_code) {
        this.dept_code = dept_code == null ? null : dept_code.trim();
    }

    public String getIs_parent() {
        return is_parent;
    }

    public void setIs_parent(String is_parent) {
        this.is_parent = is_parent == null ? null : is_parent.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getDisplay_order() {
        return display_order;
    }

    public void setDisplay_order(Integer display_order) {
        this.display_order = display_order;
    }

    public Integer getCreated_by() {
        return created_by;
    }

    public void setCreated_by(Integer created_by) {
        this.created_by = created_by;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Integer getLast_updated_by() {
        return last_updated_by;
    }

    public void setLast_updated_by(Integer last_updated_by) {
        this.last_updated_by = last_updated_by;
    }

    public Date getLast_update_date() {
        return last_update_date;
    }

    public void setLast_update_date(Date last_update_date) {
        this.last_update_date = last_update_date;
    }
}