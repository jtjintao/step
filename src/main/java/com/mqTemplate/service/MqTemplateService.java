package com.mqTemplate.service;

import com.github.pagehelper.PageInfo;
import com.mqTemplate.entity.MqTemplate;
import com.mqTemplate.entity.query.TemplateQuery;



public interface MqTemplateService {
    public PageInfo<MqTemplate> listMqTemplate(TemplateQuery templateQuery);
    public Integer updateMqTemplate(MqTemplate mt);
    public Integer createMqTemplate(MqTemplate mt);
    public Integer deleteMqTemplate(Integer id);
}
