package com.example.Book_My_show.Converters;

import com.example.Book_My_show.DTO.UserEntryDTO;
import com.example.Book_My_show.Entity.UserEntity;
import com.example.Book_My_show.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.Book_My_show.DTO.UserEntryDTO;
import com.example.Book_My_show.Entity.UserEntity;

public class UserConverter {
    //// Making converters as static so that we don't have to make it's object to call it
    public static UserEntity convertToUserEntity(UserEntryDTO userEntryDTO){
        UserEntity userEntity = UserEntity.builder().age(userEntryDTO.getAge()).name(userEntryDTO.getName()).
                email(userEntryDTO.getEmail()).mobNo(userEntryDTO.getMobNo()).address(userEntryDTO.getAddress())
                .password(userEntryDTO.getPassword())
                .build();
        return userEntity;
    }
}
