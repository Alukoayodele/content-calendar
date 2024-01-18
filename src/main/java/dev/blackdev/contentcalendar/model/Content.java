package dev.blackdev.contentcalendar.model;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public record Content(
        @Id
        Integer id,
        @NotBlank
        String tittle,
        String desc,
        Status status,
        Type contentType,
        @FutureOrPresent
        LocalDateTime dateCreated,
        LocalDateTime dateUpdated,
        String url
) {
}
