package sbz.biochemical.analysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sbz.biochemical.analysis.model.analysis.Results;
import sbz.biochemical.analysis.model.analysis.SymptomsAndDiseases;
import sbz.biochemical.analysis.service.ResultsService;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "api/results")
public class ResultsController {

    private final ResultsService resultsService;

    @Autowired
    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @PostMapping
    public ResponseEntity<?> sendResults(@RequestBody Results results ) {
        Results r1 = new Results(results.getGender(), results.getBloodAnalysis(), results.getBonesAnalysis(),
                results.getElectrolytes(), results.getOrgansAnalysis(), results.getUrineAnalysis());

        SymptomsAndDiseases symptomsAndDiseases = resultsService.getSymptomsToCheck(r1);
        return new ResponseEntity<SymptomsAndDiseases>(symptomsAndDiseases, HttpStatus.OK);
    }
}
