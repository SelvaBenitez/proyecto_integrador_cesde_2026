package co.edu.cesde.pi.service;

import co.edu.cesde.pi.models.Period;
import java.util.List;
import java.time.LocalDate;

public interface PeriodService {

    Period create(Period period);

    boolean update(Period period);

    boolean delete(String period_id);

    Period findById(String period_id);

    List<Period> findAll();

    List<Period> findByStartDate(LocalDate startDate);

    List<Period> findByEndDate(LocalDate endDate);

    List<Period> findByDateRange(LocalDate startDate, LocalDate endDate);

}