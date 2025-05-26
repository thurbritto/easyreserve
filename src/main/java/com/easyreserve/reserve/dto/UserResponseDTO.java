package com.easyreserve.reserve.dto;

import com.easyreserve.reserve.enums.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UserResponseDTO {
    private Integer id;
    private String name;
    private String email;

}
