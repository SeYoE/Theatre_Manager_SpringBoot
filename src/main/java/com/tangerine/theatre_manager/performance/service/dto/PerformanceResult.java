package com.tangerine.theatre_manager.performance.service.dto;

import com.tangerine.theatre_manager.performance.vo.AgeRate;
import com.tangerine.theatre_manager.performance.vo.Genre;
import com.tangerine.theatre_manager.performance.vo.PerformanceName;
import com.tangerine.theatre_manager.performance.vo.Stage;

import java.time.LocalDate;
import java.util.UUID;

public record PerformanceResult(
        UUID performanceId,
        PerformanceName performanceName,
        Genre genre,
        AgeRate ageRate,
        LocalDate openRun,
        LocalDate closeRun,
        Stage stage
) {
}