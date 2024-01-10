package com.myblog7.myblog7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Registration> names = Arrays.asList(
                new Registration("nimesh", "testing"),
                new Registration("mehul", "testing"),
                new Registration("priyank", "testing")
        );
        List<RegistrationDto> dtos = names.stream().map(registration -> mapToDto(registration)).collect(Collectors.toList());
        System.out.println(dtos);
    }
    static RegistrationDto mapToDto (Registration registration){
        RegistrationDto dto= new RegistrationDto();
        dto.setUserName(registration.getUserName());
        dto.setPassword(registration.getPassword());
        return dto;
    }
}
