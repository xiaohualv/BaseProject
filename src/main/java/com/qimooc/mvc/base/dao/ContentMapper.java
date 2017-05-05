package com.qimooc.mvc.base.dao;

import com.qimooc.mvc.base.model.Content;
import com.qimooc.mvc.base.model.ContentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentMapper {
    int countByExample(ContentCriteria example);

    int deleteByExample(ContentCriteria example);

    int deleteByPrimaryKey(Integer content_id);

    int insert(Content record);

    int insertSelective(Content record);

    List<Content> selectByExample(ContentCriteria example);

    Content selectByPrimaryKey(Integer content_id);

    int updateByExampleSelective(@Param("record") Content record, @Param("example") ContentCriteria example);

    int updateByExample(@Param("record") Content record, @Param("example") ContentCriteria example);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);
}