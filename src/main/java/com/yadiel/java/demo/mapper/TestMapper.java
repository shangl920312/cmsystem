package com.yadiel.java.demo.mapper;

import com.yadiel.java.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public interface TestMapper {

    ArrayList<User> getAllUsers ();
}
