package com.prac.page.dto;


import com.prac.page.entity.Schedule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class AllScheduleResponseDto {

    private final Long scheduleId;

    private final String title;

    private final String nickname;

    private final String details;



    public static AllScheduleResponseDto of(Schedule schedule) {
        return AllScheduleResponseDto.builder()
                .scheduleId(schedule.getId())
                .title(schedule.getTitle())
                .nickname(schedule.getMember().getNickname())
                .details(schedule.getDetails())
                .build();
    }

}
