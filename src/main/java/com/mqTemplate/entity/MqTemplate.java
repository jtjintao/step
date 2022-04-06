package com.mqTemplate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MqTemplate {
    private int id;
    private String name;
    private String content;
    private String topic;
    private int app_id;
}
