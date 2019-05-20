package com.zzx.webfluxs.entity;


import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Builder
public class UserEntity  {
    private String name;
    private String age;
    private String sex;
    private String time;
}
