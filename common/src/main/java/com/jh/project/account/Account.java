package com.jh.project.account;

import com.jh.project.common.BaseEntity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Account extends BaseEntity {

    @Id @GeneratedValue
    private Long accountId;
    private String userName;

    private String email;
    private String password;

}
