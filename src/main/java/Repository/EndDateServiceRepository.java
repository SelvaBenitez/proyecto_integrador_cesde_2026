package Repository;

import co.edu.cesde.pi.models.Period;
import java.time.LocalDate;
import java.util.List;

public interface EndDateServiceRepository {

    Period create(Period period);
    boolean update(Period period);
    boolean delete(String period_id);
    Period findById(String period_id);
    List<Period> findAll();
    List<Period> findByEndDate(LocalDate endDate);
    List<Period> findByDateRange(LocalDate startDate, LocalDate endDate);
}