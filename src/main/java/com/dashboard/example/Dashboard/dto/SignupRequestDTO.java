package com.dashboard.example.Dashboard.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Component
public class SignupRequestDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
