package com.qimooc.mvc.base.dao;

import com.qimooc.mvc.base.model.Department;
import com.qimooc.mvc.base.model.DepartmentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DepartmentMapper {
    int countByExample(DepartmentCriteria example);

    int deleteByExample(DepartmentCriteria example);

    int deleteByPrimaryKey(Integer dept_id);

    int insert(Department record);

    int insertSelective(Department record);

    List<Department> selectByExample(DepartmentCriteria example);

    Department selectByPrimaryKey(Integer dept_id);

    int updateByExampleSelective(@Param("record") Department record, @Param("example") DepartmentCriteria example);

    int updateByExample(@Param("record") Department record, @Param("example") DepartmentCriteria example);

    int updateByPrimaryKeySelective(Department record);

    int updateByPrimaryKey(Department record);
}