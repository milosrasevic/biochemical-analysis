package sbz.biochemical.analysis.controller;

import org.apache.tools.ant.taskdefs.condition.Http;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import sbz.biochemical.analysis.exception.MindStateAlreadyLogged;
import sbz.biochemical.analysis.model.mind.DailyMindStateDTO;
import sbz.biochemical.analysis.model.mind.MentalDiseases;
import sbz.biochemical.analysis.service.DailyMindStateService;

import java.security.Principal;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class DailyMindStateController {

    @Autowired
    private DailyMindStateService dailyMindStateService;

    @PostMapping("/log-daily-mind-state")
    @PreAuthorize("hasRole('USER')")
    public ResponseEntity<?> logDailyMindState(Principal user, @RequestBody DailyMindStateDTO dailyMindStateDTO) {
        try {
            MentalDiseases discoveredMentalDiseases = this.dailyMindStateService.logTodaysMindState(user.getName(), dailyMindStateDTO);
            return new ResponseEntity<MentalDiseases>(discoveredMentalDiseases,HttpStatus.OK);
        } catch (MindStateAlreadyLogged mindStateAlreadyLogged) {
            return new ResponseEntity<String>(mindStateAlreadyLogged.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
