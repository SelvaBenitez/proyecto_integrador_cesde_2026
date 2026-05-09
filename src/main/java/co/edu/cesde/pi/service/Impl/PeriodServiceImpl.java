package co.edu.cesde.pi.service.Impl;

import co.edu.cesde.pi.service.PeriodService;
import co.edu.cesde.pi.models.Period;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PeriodServiceImpl implements PeriodService {

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
    public List<Period> findByStartDate(LocalDate startDate) {
        if (startDate == null) {
            return new ArrayList<>();
        }
        System.out.println("Buscando periodos con fecha de inicio: " + startDate);
        return new ArrayList<>();
    }

    @Override
    public List<Period> findByEndDate(LocalDate endDate) {
        if (endDate == null) {
            return new ArrayList<>();
        }
        System.out.println("Buscando periodos con fecha de fin: " + endDate);
        return new ArrayList<>();
    }

    @Override
    public List<Period> findByDateRange(LocalDate startDate, LocalDate endDate) {
        if (startDate == null || endDate == null || startDate.isAfter(endDate)) {
            System.out.println("Error: Rango de fechas inválido.");
            return new ArrayList<>();
        }
        System.out.println("Buscando periodos entre: " + startDate + " y " + endDate);
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