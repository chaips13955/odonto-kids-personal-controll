package odonto.kids.personal.controll.app.service;

import odonto.kids.personal.controll.app.dto.EmployeeDTO;
import odonto.kids.personal.controll.app.model.Employee_Model;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmploye extends CrudRepository <Employee_Model, Integer>{

}
