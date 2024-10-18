package com.stac.attendance.domain.errors;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class ErrorObject {
    private String message;
    private Date timeStamp;
    private Integer status;
}
