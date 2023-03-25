package com.fastcampus.springrunner.divelog.web.diveresort.dto;

import com.fastcampus.springrunner.divelog.core.diveresort.application.dto.DiveResortRegisterCommand;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

/**
 * 다이브리조트 등록요청
 *
 * @author springrunner.kr@gmail.com
 */
@Getter
public class DiveResortRegisterRequest {
    @NotBlank
    private String name;
    @NotBlank
    private String ownerName;
    @NotBlank
    private String contactNumber;
    @NotBlank
    private String address;
    @NotBlank
    private String description;

    public DiveResortRegisterCommand convertToRegisterCommand() {
        return DiveResortRegisterCommand.create(
                getName(),
                getOwnerName(),
                getContactNumber(),
                getAddress(),
                getDescription()
        );
    }
}