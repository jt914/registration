package cavhack.registration.model;

import jakarta.persistence.*;

@Entity
@Table(name = "registration")
public class Participant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="par_id")
    private Long par_id;

    @Column(name="gradYr")
    private int gradYr;

    @Column(name="school")
    private String school;

    @Column(name="gender")
    private int gender;
    //0 = male
    //1 = female

    @Column(name="first_name")
    private String first_name;

    @Column(name="last_name")
    private String last_name;

    public Long getId() {
        return par_id;
    }

    public void setPar_id(Long par_id) {
        this.par_id = par_id;
    }

    public int getGradYr() {
        return gradYr;
    }

    public void setGradYr(int gradYr) {
        this.gradYr = gradYr;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
}

