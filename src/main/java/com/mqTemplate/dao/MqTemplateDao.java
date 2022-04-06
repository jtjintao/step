package com.mqTemplate.dao;

import com.mqTemplate.entity.MqTemplate;
import com.mqTemplate.entity.query.TemplateQuery;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface MqTemplateDao {
    //根据条件查询mq Template列表
    public List<MqTemplate> listMqTemplate(TemplateQuery templateQuery);
    //更新mq Template
    public Integer updateTemplate(MqTemplate mt);
    //增加模板
    public Integer createTemplate(MqTemplate mt);
    //根据id，删除模板
    public Integer deleteTemplate(Integer id);
}
