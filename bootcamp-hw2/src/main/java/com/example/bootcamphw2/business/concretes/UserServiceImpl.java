package com.example.bootcamphw2.business.concretes;

import com.example.bootcamphw2.business.UserManager;
import com.example.bootcamphw2.business.abstracts.UserService;
import com.example.bootcamphw2.entitiy.User;
import com.example.bootcamphw2.mapper.UserMapper;
import com.example.bootcamphw2.model.UserRequestDTO;
import com.example.bootcamphw2.model.UserResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
   private final UserManager userManager;

    /**
     * @param userRequestDTO
     * @return UserResponseDTO
     * save islemi sırasında email,username ve telefon no kontrolleri gerceklesmektedir.
     */
    @Override
    public UserResponseDTO save(UserRequestDTO userRequestDTO){
       User user = UserMapper.INSTANCE.converToUser(userRequestDTO);
       User userControl = userManager.findUserByEmail(user.getEmail());
       if( userControl != null){
           throw new IllegalArgumentException("Aynı e-posta adresi ile kullanıcı kaydı yapılmıştır");
       }
       userControl = userManager.findUserByPhoneNo(user.getPhoneNo());
       if(userControl != null){
           throw new IllegalArgumentException("Aynı telefon numarasıyla kullanıcı kaydı yapılmıştır");
       }
       userControl = userManager.findUserByUserName(user.getUserName());
        if(userControl != null){
            throw new IllegalArgumentException("Aynı kullanıcı adıyla kullanıcı kaydı yapılmıştır");
        }
       user = userManager.save(user);
        return UserMapper.INSTANCE.converToUserResponseDTO(user);
    }

    /**
     * @return UserResponseDTO
     * butun kullaniciları getirir
     */
    @Override
    public List<UserResponseDTO> findAll() {
       List<User> userList = userManager.findAll();
       return  UserMapper.INSTANCE.convertToUserResponseDTOList(userList);
    }

}
