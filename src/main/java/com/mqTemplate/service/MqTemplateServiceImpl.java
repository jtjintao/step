package com.mqTemplate.service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mqTemplate.dao.MqTemplateDao;
import com.mqTemplate.entity.MqTemplate;
import com.mqTemplate.entity.query.TemplateQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class MqTemplateServiceImpl implements MqTemplateService {
    @Autowired
    private MqTemplateDao mqTemplateDao;
    @Override
    public PageInfo<MqTemplate> listMqTemplate(@RequestBody TemplateQuery templateQuery) {
        PageHelper.startPage(templateQuery.getPageNum(),templateQuery.getPageSize());
        return new PageInfo<MqTemplate>(mqTemplateDao.listMqTemplate(templateQuery));


    }

    @Override
    public Integer updateMqTemplate(@RequestBody MqTemplate mt) {
       return  mqTemplateDao.updateTemplate(mt);
    }

    @Override
    public Integer createMqTemplate(@RequestBody MqTemplate mt) {
        return mqTemplateDao.createTemplate(mt);
    }

    @Override
    public Integer deleteMqTemplate(Integer id) {
        return mqTemplateDao.deleteTemplate(id);
    }
}
