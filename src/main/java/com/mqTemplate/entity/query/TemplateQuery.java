package com.mqTemplate.entity.query;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class TemplateQuery {
    private Integer pageNum = 1;
    private Integer pageSize = 2;
    private String templateName;
    private String topic;
}
