package com.jh.project.account.entity;

import com.jh.project.common.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Account extends BaseEntity {

    @Id @GeneratedValue
    private Long accountId;
}
