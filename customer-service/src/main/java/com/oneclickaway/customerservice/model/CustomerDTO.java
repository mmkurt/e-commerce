package com.oneclickaway.customerservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {

    private Long id;
    private String username;
    private String email;
    private String gender;
    private String name;
    private String surname;

    public static CustomerDTO create() {
        return new CustomerDTO();
    }

}
