package com.film.industry.actorApplication.dto;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@JsonInclude
@NoArgsConstructor
@AllArgsConstructor
public class ActorDto {

        private Integer actorId;

        private String firstName;

        private String lastName;

        private LocalDateTime last_update;




}
