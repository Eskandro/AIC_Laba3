package com.example.demoSpring1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;

public class checkPassword {

    private final PasswordGenerator generator = new PasswordGenerator();

    @PostMapping("/getPassword")
    public String postGenerate(@RequestParam String length) {
        int lengthInt;
        try {
            lengthInt = Integer.parseInt(length);
            if (lengthInt > 99) {
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Your password is too long");
            } else {
                return generator.generate(lengthInt);
            }
        } catch (NumberFormatException e) {
            lengthInt = 0;
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid arguments were entered");
        }
    }

    @GetMapping("/getPassword")
    public String getGenerate() {
        return generator.generate(10);
    }

}
