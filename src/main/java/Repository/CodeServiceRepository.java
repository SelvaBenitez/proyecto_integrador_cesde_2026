package Repository;

import co.edu.cesde.pi.models.Period;
import java.util.List;

public interface CodeServiceRepository {

    Period create(Period period);
    boolean update(Period period);
    boolean delete(String period_id);
    Period findById(String period_id);
    List<Period> findAll();
    List<Period> findByCode(long code);
}