package org.andywang.dentist.service;

import jakarta.persistence.Entity;
import org.andywang.dentist.dao.UserDetailsDAO;
import org.andywang.dentist.eneity.UserAppealDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserAppealService {
    private final UserDetailsDAO userDetailsDAO;
    public UserAppealService(UserDetailsDAO userDetailsDAO) {
        this.userDetailsDAO = userDetailsDAO;
    }
    public String Appeal(String username, String phonenumber, String date) {
        UserAppealDetails userAppealDetails = userDetailsDAO.findByName(username);
        if (userAppealDetails == null) {
            UserAppealDetails  userAppealDetails1 = new UserAppealDetails();
            userAppealDetails1.setName(username);
            userAppealDetails1.setPhonenumber(phonenumber);
            userAppealDetails1.setPreferedtime(date);
            userDetailsDAO.save(userAppealDetails1);
            return "success";
        }
        else if (userAppealDetails != null) {
            return "AlreadyPrefrered";
        }
        return "Error";
    }
}
