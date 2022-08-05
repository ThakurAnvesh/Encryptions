package com.example.Qualifier;

import com.example.Qualifier.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@SpringBootApplication
public class QualifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(QualifierApplication.class, args);
    }

    public interface EncryptionService {
        String getMyName();
    }

    @Service
    @Qualifier("encryptionFirst")
    public static class EncryptionFirst implements EncryptionService {
        @Override
        public String getMyName() {
            return "EncryptionServiceImplFirst";
        }
    }

    @Service
    @Qualifier("encryptionSecond")
    public static class EncryptionSecond implements EncryptionService {
        @Override
        public String getMyName() {
            throw new RuntimeException();
        }
    }

    @RestController
    @RequestMapping("/name")
    public class EncryptionController {

        private List<EncryptionService> encryptionService;

        @Autowired
        public void Encryption(List<EncryptionService> serviceList) {
            this.encryptionService = serviceList;
        }

        @GetMapping
        public String getName() {
            return encryptionService.get(0).getMyName();
        }
    }

    @RestController
    @RequestMapping("/user")
    public class UserValidation {
        @PostMapping
        public UserDto checkUser(@Valid @RequestBody UserDto userDto) {
            return userDto;
        }
    }
}
