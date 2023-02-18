package com.example.JPointV2.dto;
import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class DepartmentDto {
    private Long id;
    private String name;
    private String description;
    private Long peopleCount;

}
