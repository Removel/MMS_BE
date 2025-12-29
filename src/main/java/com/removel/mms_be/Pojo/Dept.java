package com.removel.mms_be.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dept {
    private int id;
    private String name;
    private String description;
    private String leaderId;
    private LocalDateTime createTime;
}
