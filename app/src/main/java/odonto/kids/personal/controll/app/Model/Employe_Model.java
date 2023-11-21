package odonto.kids.personal.controll.app.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import reactor.util.annotation.NonNull;

@Data
public class Employe_Model {
    @Id
    private Long ID;
    @NonNull
    private String NAME_EMPLOYE;
    private String APELLIDO_MATERNO_EMPLOYE;
    private String APELLIDO_PATERNO_EMPLOYE;
    private String POSITION_EMPOYE;
    private String SALARY_EMPLOYE;

}
