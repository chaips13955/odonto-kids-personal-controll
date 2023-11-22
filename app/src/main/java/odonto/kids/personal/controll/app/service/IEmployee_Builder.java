package odonto.kids.personal.controll.app.service;

import odonto.kids.personal.controll.app.dto.EmployeeDTO;
import odonto.kids.personal.controll.app.model.Employee_Model;

public interface IEmployee_Builder {

    Employee_Model buildEmployee (EmployeeDTO employeeDTO);


}
