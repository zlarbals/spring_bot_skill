package com.example.spring_bot_skill.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "IAC_MEMBERSHIP")
@Getter
@EqualsAndHashCode(of = "membershipName", callSuper = true)
public class Membership extends BaseTimeEntity{

    @Id
    @Column(name = "MEMBERSHIP_NAME")
    private String membershipName;

    @Column(name = "MEMBERSHIP_KEY", unique = true)
    private String key;

}
