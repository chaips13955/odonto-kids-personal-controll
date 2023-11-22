package odonto.kids.personal.controll.app.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.*;
import reactor.util.annotation.NonNull;

@Entity
@Table(name = "EMPLOYEE")
@Builder
@Data



public class Employee_Model {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long ID;
    @NonNull
    private String NAME_EMPLOYE;
    private String APELLIDO_MATERNO_EMPLOYE;
    private String APELLIDO_PATERNO_EMPLOYE;
    private String POSITION_EMPOYE;
    private String SALARY_EMPLOYE;


    public Employee_Model() {

    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    @NonNull
    public String getNAME_EMPLOYE() {
        return NAME_EMPLOYE;
    }

    public void setNAME_EMPLOYE(@NonNull String NAME_EMPLOYE) {
        this.NAME_EMPLOYE = NAME_EMPLOYE;
    }

    public String getAPELLIDO_MATERNO_EMPLOYE() {
        return APELLIDO_MATERNO_EMPLOYE;
    }

    public void setAPELLIDO_MATERNO_EMPLOYE(String APELLIDO_MATERNO_EMPLOYE) {
        this.APELLIDO_MATERNO_EMPLOYE = APELLIDO_MATERNO_EMPLOYE;
    }

    public String getAPELLIDO_PATERNO_EMPLOYE() {
        return APELLIDO_PATERNO_EMPLOYE;
    }

    public void setAPELLIDO_PATERNO_EMPLOYE(String APELLIDO_PATERNO_EMPLOYE) {
        this.APELLIDO_PATERNO_EMPLOYE = APELLIDO_PATERNO_EMPLOYE;
    }

    public String getPOSITION_EMPOYE() {
        return POSITION_EMPOYE;
    }

    public void setPOSITION_EMPOYE(String POSITION_EMPOYE) {
        this.POSITION_EMPOYE = POSITION_EMPOYE;
    }

    public String getSALARY_EMPLOYE() {
        return SALARY_EMPLOYE;
    }

    public void setSALARY_EMPLOYE(String SALARY_EMPLOYE) {
        this.SALARY_EMPLOYE = SALARY_EMPLOYE;
    }
}


