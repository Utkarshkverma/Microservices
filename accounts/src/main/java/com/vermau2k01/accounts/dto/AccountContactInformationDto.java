package com.vermau2k01.accounts.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "accounts")
public record AccountContactInformationDto(String message,
                                           Map<String,String> contactDetails,
                                           List<String> onCallSupport) {
}
