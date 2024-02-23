package com.ebay.mail.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : mail
 * Created date : 2/22/2024
 * Created time : 11:09 AM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MailDetailsDto {
    private String toMail;
    private String message;
    private String subject;
}
