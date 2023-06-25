package com.cawe.poemon.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class AuthDto {
    @NotBlank
    @Size(max = 150)
    private String email;
    @NotBlank
    @Size(max = 100)
    private String password;
}