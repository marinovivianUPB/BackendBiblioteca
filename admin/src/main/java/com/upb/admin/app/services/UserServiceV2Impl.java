package com.upb.admin.app.services;

import com.upb.admin.infrastructure.entity.UserEntity;
import com.upb.admin.domain.models.User;
import com.upb.admin.domain.interfaces.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class UserServiceV2Impl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User save(User user) {
        if(user.getId() == null) {
            user.setId(UUID.randomUUID().toString());
        }
        UserEntity entity = new UserEntity();
        BeanUtils.copyProperties(user,entity);
        userRepository.save(entity);
        return user;
    }

    @Override
    public User getById(String id) {
        UserEntity userEntity = this.userRepository.getById(id);
        User user = new User();
        BeanUtils.copyProperties(userEntity, user);
        return user;
    }

    @Override
    public List<User> getAll() {
        List<UserEntity> userEntities = this.userRepository.findAll();
        List<User> userList = userEntities.stream().map(userEntity -> {
            User user = new User();
            BeanUtils.copyProperties(userEntity, user);
            return user;
        }).collect(Collectors.toList());
        return userList;
    }

    @Override
    public User deleteById(String id) {
        User user = this.getById(id);
        this.userRepository.deleteById(id);
        //obtener identidad
        //merge con nuevo modelo
        //modelo -> entidad
        return user;
    }

    @Override
    public User updateUser(String id, User user) {
        UserEntity originalEntity = this.userRepository.getById(id);

        BeanUtils.copyProperties(user, originalEntity, "id");
        UserEntity updatedEntity = this.userRepository.save(originalEntity);
        System.out.println(updatedEntity.isAdmin());
        User userUpdated = new User();
        BeanUtils.copyProperties(updatedEntity, userUpdated);
        return userUpdated;
    }

}
