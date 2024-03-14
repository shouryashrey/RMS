package com.shouryashrey.RMS.Service.Response;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseHandler {
    private String responseMessage;
    private int status;
}
