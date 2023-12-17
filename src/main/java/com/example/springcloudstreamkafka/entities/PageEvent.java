package com.example.springcloudstreamkafka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@AllArgsConstructor @NoArgsConstructor @Data @ToString
public class PageEvent {
    private String user;
    private String name;
    private Date date;
    private long duration;
}
