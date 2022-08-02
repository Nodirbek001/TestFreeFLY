package uz.b.testfreefly.dto;

import lombok.*;
import uz.b.testfreefly.domains.Users;
import uz.b.testfreefly.util.Utils;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class LoginDTO {
    private String username;
    private String password;

    public Users toUser(){
        return Users.builder()
                .username(this.username)
                .password(Utils.encodePassword(password))
                .build();
    }
}
