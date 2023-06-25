package com.cawe.poemon.dtos;

import com.cawe.poemon.enums.TypeEnum;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PoemonDto {
    @NotBlank
    private String name;
    @NotNull
    private TypeEnum type;
    @NotNull
    private String color;
}
