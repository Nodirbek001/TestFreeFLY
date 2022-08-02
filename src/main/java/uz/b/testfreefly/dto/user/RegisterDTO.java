package uz.b.testfreefly.dto.user;

import lombok.*;
import uz.b.testfreefly.domains.Users;
import uz.b.testfreefly.util.Utils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class RegisterDTO {
    private String fullName;
    private String username;
    private String password;
    private String confirmPassword;
    private String email;


    public Users toUser(){
        return Users.builder()
                .fullName(this.fullName)
                .username(this.username)
                .password(Utils.encodePassword(password))
                .role(Users.Role.USER)
                .email(this.email)
                .build();
    }
}
