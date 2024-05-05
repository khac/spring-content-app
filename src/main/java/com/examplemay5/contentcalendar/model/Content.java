package com.examplemay5.contentcalendar.model;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record Content (
    Integer id,
    @NotBlank
    String title,
    @NotBlank
    String desc,
    Status status,
    Type contentType,
    @PastOrPresent
    LocalDateTime dateCreated,
    @PastOrPresent
    LocalDateTime dateUpdated,
    String url
){
}
