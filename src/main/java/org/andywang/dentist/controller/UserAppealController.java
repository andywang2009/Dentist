package org.andywang.dentist.controller;

import org.andywang.dentist.eneity.UserAppealDetails;
import org.andywang.dentist.service.UserAppealService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RequestMapping("/api")
@RestController
public class UserAppealController {
    private UserAppealService userAppealService;
    public UserAppealController(UserAppealService userAppealService) {
        this.userAppealService = userAppealService;
    }

    @PostMapping("/appeal")
    public ResponseEntity<?> appeal(@RequestBody UserAppealDetails userAppealDetails) {
        return ResponseEntity.ok(userAppealService.Appeal(userAppealDetails.getName(),userAppealDetails.getPhonenumber(),userAppealDetails.getPreferedtime()));
    }
}
