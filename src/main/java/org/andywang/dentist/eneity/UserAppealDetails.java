package org.andywang.dentist.eneity;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Entity
@Table(name = "appealdetails")
public class UserAppealDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "phonenumber")
    private String phonenumber;
    @Column(name = "preferedtime") // 确保这个名称与数据库中的一致
    private String preferedtime;
    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPreferedtime() {
        return preferedtime;
    }

    public void setPreferedtime(String preferedtime) {
        this.preferedtime = preferedtime;
    }

}
