package com.example.spring_bot_skill.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Table(name = "IAC_MEMBER_MEMBERSHIP_LINK")
@Getter
public class MemberMembershipLink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_MEMBERSHIP_LINK_SEQ")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBER_SEQ")
    private Member member;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEMBERSHIP_NAME")
    private Membership membership;
}
