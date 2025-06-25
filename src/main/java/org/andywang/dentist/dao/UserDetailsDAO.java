package org.andywang.dentist.dao;

import org.andywang.dentist.eneity.UserAppealDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDetailsDAO extends JpaRepository<UserAppealDetails, Integer> {
    public UserAppealDetails findByName(String username) throws UsernameNotFoundException;
}
