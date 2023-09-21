package com.dream.backend.service.user.dto;

import com.dream.backend.domain.region.Region;
import com.dream.backend.domain.region.repository.RegionRepository;
import com.dream.backend.domain.user.User;
import lombok.Builder;
import lombok.Data;

import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@Data
public class JoinUserDto {

    private RegionRepository regionRepository;

    private String name;
    private String email;
    private String password;
    private int residenceInfo;
    private Long regionKey;
    private LocalDateTime endDate;
    private boolean isEnded;
    private LocalDateTime createdDate;
    private boolean myData;


    @Builder
    public JoinUserDto(String name, String email, String password, int residenceInfo, Long regionKey, LocalDateTime endDate, LocalDateTime createdDate, boolean isEnded, boolean myData) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.residenceInfo = residenceInfo;
        this.regionKey = regionKey;
        this.endDate = endDate;
        this.createdDate = createdDate;
        this.isEnded = isEnded;
        this.myData = myData;
    }

    public User toEntity(Optional<Region> region) {
//        여기에 regionKey 에 알맞는 region 객체를 찾아오고 싶음.
        System.out.println("regionKey: "+this.regionKey);
        //region 객체가 안가져와짐
        System.out.print("find: "+region.get().getId());
        return User.builder()
                .name(this.name)
                .email(this.email)
                .password(this.password)
                .residence_info(this.residenceInfo)
                .region(region.get())
                .is_ended(this.isEnded)
                .end_date(this.endDate)
                .created_date(this.createdDate)
                .my_data(this.myData)
                .build();
    }
}
