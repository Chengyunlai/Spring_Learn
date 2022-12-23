package top.chengyunlai.bean;

import lombok.Data;

import javax.persistence.*;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Entity
@Table(name = "tbl_department")
@Data
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private String tel;

}
