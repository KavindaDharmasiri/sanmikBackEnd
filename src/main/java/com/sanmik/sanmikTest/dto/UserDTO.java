package com.sanmik.sanmikTest.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Created By kavinda_d on 10/12/2023
 *
 * @AUTHOR : kavinda_d
 * @DATE : 10/12/2023
 * @PROJECT : sanmik
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class UserDTO {
    private String name;
    private int id;
    private String address;
    private int age;
    private String contact;
}
