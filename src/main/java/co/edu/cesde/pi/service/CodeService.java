package co.edu.cesde.pi.service;

import co.edu.cesde.pi.models.Period;
import java.util.List;

public interface CodeService {

    Period create(Period period);

    boolean update(Period period);

    boolean delete(String period_id);

    Period findById(String period_id);

    List<Period> findAll();

    List<Period> findByCode(long code);

}