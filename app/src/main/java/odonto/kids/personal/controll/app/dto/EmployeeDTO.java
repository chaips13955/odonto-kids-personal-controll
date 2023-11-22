package odonto.kids.personal.controll.app.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)


public class EmployeeDTO {
    private Long ID;
    private String NAME_EMPLOYEE;
    private String APELLIDO_MATERNO_EMPLOYEE;
    private String APELLIDO_PATERNO_EMPLOYEE;
    private String POSITION_EMPLOYEE;
    private String SALARY_EMPLOYEE;



}

