package com.dream.backend.controller.welfare.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class WelfareResponse {

    private String name;

    private String organization;

    private LocalDateTime start_date;

    private LocalDateTime end_date;

    private String route;

    private String submission;

    private int support_fund;

    private String description_origin;

//    private String description;

    private String url;

    private String img;

    private int support_period;

    String etc;

    @Builder
    public WelfareResponse(String name, String organization, LocalDateTime start_date, LocalDateTime end_date, String route, String submission, int support_fund, String description_origin, String url, String img, int support_period, String etc) {
        this.name = name;
        this.organization = organization;
        this.start_date = start_date;
        this.end_date = end_date;
        this.route = route;
        this.submission = submission;
        this.support_fund = support_fund;
        this.description_origin = description_origin;
        this.url = url;
        this.img = img;
        this.support_period = support_period;
        this.etc = etc;
    }
}
