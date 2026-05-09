package co.edu.cesde.pi.service.Impl;

import co.edu.cesde.pi.service.CodeService;
import co.edu.cesde.pi.models.Period;
import java.util.ArrayList;
import java.util.List;

public class CodeServiceImpl implements CodeService {

    @Override
    public Period create(Period period) {
        if (isInvalidPeriod(period)) {
            System.out.println("Error: Datos del periodo incompletos o inválidos.");
            return null;
        }
        System.out.println("Periodo creado: " + period);
        return period;
    }

    @Override
    public boolean update(Period period) {
        if (isInvalidPeriod(period)) {
            return false;
        }
        System.out.println("Periodo actualizado: " + period);
        return true;
    }

    @Override
    public boolean delete(String period_id) {
        if (!isNotBlank(period_id)) {
            return false;
        }
        System.out.println("Periodo eliminado con id: " + period_id);
        return true;
    }

    @Override
    public Period findById(String period_id) {
        if (!isNotBlank(period_id)) {
            return null;
        }
        System.out.println("Buscando periodo con id: " + period_id);
        return null;
    }

    @Override
    public List<Period> findAll() {
        System.out.println("Listando todos los periodos.");
        return new ArrayList<>();
    }

    @Override
    public List<Period> findByCode(long code) {
        if (code <= 0) {
            return new ArrayList<>();
        }
        System.out.println("Buscando periodos con código: " + code);
        return new ArrayList<>();
    }

    private boolean isInvalidPeriod(Period period) {
        return period == null
                || period.getStartDate() == null
                || period.getEndDate() == null
                || period.getStartDate().isAfter(period.getEndDate());
    }

    private boolean isNotBlank(String value) {
        return value != null && !value.isBlank();
    }
}