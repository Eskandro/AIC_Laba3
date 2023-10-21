package com.example.demoSpring1;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UserInfoController {
    @PostMapping("/user")
    public String userStatus(@RequestBody List<UserInfo> userList) {
        return String.format("Added %d users", userList.size());
    }

}
