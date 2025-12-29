package com.removel.mms_be.Pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Member {

    private int id;
    private String name;
    private String studentId;
    private String gender;
    private String qq;
    private String email;
    private String department;
    private String status;
    private LocalDate joinTime;

}
