package top.chengyunlai.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import top.chengyunlai.group.UserInfoGroup;
import top.chengyunlai.group.UserPasswordGroup;

import javax.validation.constraints.NotBlank;
import java.util.Date;

/**
 * @ClassName
 * @Description
 * @Author:chengyunlai
 * @Date
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String id;

    @NotBlank
    @Length(min = 6,max = 20,message = "{user.username.notblank}",groups = UserPasswordGroup.class )
    private String username;

    @NotBlank(message = "{user.name.notblank}",groups = UserInfoGroup.class)
    private String name;

    private Date birthday;

    private byte[] photoFile;

    private Department department;
}
