package com.batool.shblak.library_magement_system_app.patron;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Schema(name = "Patron", description = "Patron Model")
@JsonInclude(JsonInclude.Include.NON_NULL) // Ignore null values during serialization
public class PatronDto {

    private Long id;

    @NotBlank(message = "Name is Required And Not Null")
    private String name;

    @NotBlank(message = "Email is Required And Not Null")
    @Email(message = "Email Must Be Valid")
    @Schema(example = "youssef.gamal@gmail.com")
    private String email;

    @NotBlank(message = "Phone is Required And Not Null")
    @Pattern(regexp = "^(?:\\(\\+02\\))\\s(011|012|015)[0-9]{8}$")
    @Schema(example = "(+02) 01112345678")
    private String phone;

    @NotBlank(message = "Address is Required And Not Null")
    private String address;
}
