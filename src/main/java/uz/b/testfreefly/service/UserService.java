package uz.b.testfreefly.service;

import lombok.NonNull;
import uz.b.testfreefly.dao.UserDAO;
import uz.b.testfreefly.domains.Users;
import uz.b.testfreefly.dto.LoginDTO;
import uz.b.testfreefly.dto.RegisterDTO;
import uz.b.testfreefly.exceptions.BadRequestException;
import uz.b.testfreefly.util.Utils;

import java.util.Objects;

public class UserService extends Service<UserDAO>{


    public UserService(UserDAO dao) {
        super(dao);
    }

    public void create(@NonNull RegisterDTO dto){
        if (Objects.isNull(dto.getUsername())) {
            throw new BadRequestException("Username can not be null");
        }
//        if (Objects.equals(dto.getUsername(),)) {
//            throw new BadRequestException("Password can not be null");
//        }
        if (Objects.isNull(dto.getPassword())) {
            throw new BadRequestException("Password can not be null");
        }
        if (!Objects.equals(dto.getPassword(),dto.getConfirmPassword())){
            throw new BadRequestException("Password did not match");
        }

        Users users = dto.toUser();
        dao.create(users);
    }


    public Users login(LoginDTO loginDTO){
        Users user = dao.findByUsername(loginDTO.getUsername()).orElseThrow(() -> {
            throw new BadRequestException("Bad credentials");
        });
        if (!Utils.matchPassword(loginDTO.getPassword(),user.getPassword())) {
            throw new BadRequestException("Bad credentials");
        }
        return user;
    }


}
