package sbz.biochemical.analysis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sbz.biochemical.analysis.model.Gender;
import sbz.biochemical.analysis.model.Results;
import sbz.biochemical.analysis.service.ResultsService;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "api/results")
public class ResultsController {

    private final ResultsService resultsService;

    @Autowired
    public ResultsController(ResultsService resultsService) {
        this.resultsService = resultsService;
    }

    @PostMapping
    public ResponseEntity<?> sendResults(@RequestBody Results results) {
        Results r1 = new Results(results.getGender(), results.getBloodAnalysis(), results.getBonesAnalysis(),
                results.getElectrolytes(), results.getOrgansAnalysis(), results.getUrineAnalysis());

        return new ResponseEntity<ArrayList<String>>(resultsService.getSymptomsToCheck(r1), HttpStatus.OK);
    }
}
