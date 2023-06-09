package com.fastcampus.springrunner.divelog.core.diveresort.application.dto;

import java.time.LocalDateTime;

import com.fastcampus.springrunner.divelog.core.diveresort.domain.DiveResort;

import lombok.Getter;

@Getter
public class DiveResortDto {
    private Long id;
    private String name;
    private String address;
    private String ownerName;
    private String contactNumber;
    private String description;
    private LocalDateTime createdDateTime;
    private LocalDateTime lastModifiedDateTime;

    public static DiveResortDto ofEntity(DiveResort diveResort) {
        DiveResortDto diveResortDto = new DiveResortDto();
        diveResortDto.id = diveResort.getId();
        diveResortDto.name = diveResort.getName();
        diveResortDto.address = diveResort.getAddress();
        diveResortDto.ownerName = diveResort.getOwnerName();
        diveResortDto.contactNumber = diveResort.getContactNumber();
        diveResortDto.description = diveResort.getDescription();
        diveResortDto.createdDateTime = diveResort.getCreatedDateTime();
        diveResortDto.lastModifiedDateTime = diveResort.getLastModifiedDateTime();
        return diveResortDto;
    }
}