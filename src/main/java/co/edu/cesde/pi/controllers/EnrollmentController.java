/*package co.edu.cesde.pi.controllers;
//semana 15
import co.edu.cesde.pi.Service.EnrollmentService;
import co.edu.cesde.pi.models.Enrollment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EnrollmentController {
    private final EnrollmentService enrollmentService;
    public EnrollmentController(EnrollmentService enrollmentService) {
        this.enrollmentService = enrollmentService;
    }

    @GetMapping
    public ResponseEntity<List<Enrollment>> listarEnrollment() {
        return ResponseEntity.ok(EnrollmentService.listarEnrollment());
    }

    @PostMapping
    public ResponseEntity<Enrollment> create(@RequestBody EnrollmentRequest request) {
        EnrollmentService.createEnrollment(new);
    }
}
*/