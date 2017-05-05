package com.qimooc.mvc.base.model;

import com.qimooc.common.model.BaseModel;
import java.math.BigDecimal;
import java.util.Date;

public class Content extends BaseModel {
    private Integer content_id;

    private String content_name;

    private String content_code;

    private String description;

    private Integer site_id;

    private Integer dept_id;

    private Integer shared_dept_id;

    private Integer source_site_id;

    private Integer source_content_id;

    private String resource_type;

    private String content_type;

    private Date start_date;

    private Date end_date;

    private String img_url;

    private Integer demo_start_id;

    private String demo_start_url;

    private Integer duration;

    private BigDecimal lesson_periods;

    private BigDecimal credits;

    private String language;

    private String keywords;

    private String is_classic;

    private Integer order_id;

    private Integer max_user_limit;

    private Integer teacher_id;

    private String is_comment_enabled;

    private String access_client;

    private String is_published;

    private String is_deleted;

    private String author;

    private String copy_right;

    private String version;

    private String create_type;

    private Integer copied_content_id;

    private Date create_date;

    private Integer created_by;

    private Date last_update_date;

    private Integer last_updated_by;

    public Integer getContent_id() {
        return content_id;
    }

    public void setContent_id(Integer content_id) {
        this.content_id = content_id;
    }

    public String getContent_name() {
        return content_name;
    }

    public void setContent_name(String content_name) {
        this.content_name = content_name == null ? null : content_name.trim();
    }

    public String getContent_code() {
        return content_code;
    }

    public void setContent_code(String content_code) {
        this.content_code = content_code == null ? null : content_code.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
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

    public Integer getShared_dept_id() {
        return shared_dept_id;
    }

    public void setShared_dept_id(Integer shared_dept_id) {
        this.shared_dept_id = shared_dept_id;
    }

    public Integer getSource_site_id() {
        return source_site_id;
    }

    public void setSource_site_id(Integer source_site_id) {
        this.source_site_id = source_site_id;
    }

    public Integer getSource_content_id() {
        return source_content_id;
    }

    public void setSource_content_id(Integer source_content_id) {
        this.source_content_id = source_content_id;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type == null ? null : resource_type.trim();
    }

    public String getContent_type() {
        return content_type;
    }

    public void setContent_type(String content_type) {
        this.content_type = content_type == null ? null : content_type.trim();
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getImg_url() {
        return img_url;
    }

    public void setImg_url(String img_url) {
        this.img_url = img_url == null ? null : img_url.trim();
    }

    public Integer getDemo_start_id() {
        return demo_start_id;
    }

    public void setDemo_start_id(Integer demo_start_id) {
        this.demo_start_id = demo_start_id;
    }

    public String getDemo_start_url() {
        return demo_start_url;
    }

    public void setDemo_start_url(String demo_start_url) {
        this.demo_start_url = demo_start_url == null ? null : demo_start_url.trim();
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public BigDecimal getLesson_periods() {
        return lesson_periods;
    }

    public void setLesson_periods(BigDecimal lesson_periods) {
        this.lesson_periods = lesson_periods;
    }

    public BigDecimal getCredits() {
        return credits;
    }

    public void setCredits(BigDecimal credits) {
        this.credits = credits;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language == null ? null : language.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getIs_classic() {
        return is_classic;
    }

    public void setIs_classic(String is_classic) {
        this.is_classic = is_classic == null ? null : is_classic.trim();
    }

    public Integer getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }

    public Integer getMax_user_limit() {
        return max_user_limit;
    }

    public void setMax_user_limit(Integer max_user_limit) {
        this.max_user_limit = max_user_limit;
    }

    public Integer getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(Integer teacher_id) {
        this.teacher_id = teacher_id;
    }

    public String getIs_comment_enabled() {
        return is_comment_enabled;
    }

    public void setIs_comment_enabled(String is_comment_enabled) {
        this.is_comment_enabled = is_comment_enabled == null ? null : is_comment_enabled.trim();
    }

    public String getAccess_client() {
        return access_client;
    }

    public void setAccess_client(String access_client) {
        this.access_client = access_client == null ? null : access_client.trim();
    }

    public String getIs_published() {
        return is_published;
    }

    public void setIs_published(String is_published) {
        this.is_published = is_published == null ? null : is_published.trim();
    }

    public String getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(String is_deleted) {
        this.is_deleted = is_deleted == null ? null : is_deleted.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCopy_right() {
        return copy_right;
    }

    public void setCopy_right(String copy_right) {
        this.copy_right = copy_right == null ? null : copy_right.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getCreate_type() {
        return create_type;
    }

    public void setCreate_type(String create_type) {
        this.create_type = create_type == null ? null : create_type.trim();
    }

    public Integer getCopied_content_id() {
        return copied_content_id;
    }

    public void setCopied_content_id(Integer copied_content_id) {
        this.copied_content_id = copied_content_id;
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