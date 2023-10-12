package com.sanmik.sanmikTest.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created By kavinda_d on 10/12/2023
 *
 * @AUTHOR : kavinda_d
 * @DATE : 10/12/2023
 * @PROJECT : sanmik
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
@Table(name = "USER_TBL")
public class User {
    private String name;
    @Id
    private int id;
    private String address;
    private int age;
    private String contact;
}
