package com.rabin.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor @NoArgsConstructor
public class EmailRequest {

    private String toEmail;
    private String subject;
    private String messageBody;
    private String attachement;
    private String[] toEmails;

}
