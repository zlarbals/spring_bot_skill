package com.example.spring_bot_skill.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "IAC_MEMBER")
@Getter
@EqualsAndHashCode(of = "seq", callSuper = true)
public class Member extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_SEQ")
    private Long seq;

    @Column(name = "PASSWORD")
    private String password;

    @Column(unique = true, name = "EMAIL")
    private String email;

    @Column(name = "USE_YN")
    @Enumerated(EnumType.STRING)
    private UseStatusYn useYn;

    @Column(name = "DISABLED_DATE")
    private LocalDate disabledDate;

    @Column(name = "JOIN_DATE")
    private LocalDate joinDate;

    @OneToMany(mappedBy = "member")
    private List<MemberMembershipLink> membershipList = new ArrayList<>();

}
