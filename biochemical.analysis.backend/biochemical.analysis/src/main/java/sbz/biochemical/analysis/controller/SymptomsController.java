package sbz.biochemical.analysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sbz.biochemical.analysis.model.Symptoms;
import sbz.biochemical.analysis.service.SymptomsService;

@RestController
@RequestMapping(path = "api/symptoms")
public class SymptomsController {

    private final SymptomsService symptomsService;

    @Autowired
    public SymptomsController(SymptomsService symptomsService) { this.symptomsService = symptomsService; }

    @PostMapping
    public ResponseEntity<?> sendSymptoms(@RequestBody Symptoms symptoms) {
        Symptoms s = new Symptoms(symptoms.isLossOfAppetite());

        return new ResponseEntity<String>(symptomsService.getDiagnosis(s), HttpStatus.OK);
    }
}
