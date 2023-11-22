package odonto.kids.personal.controll.app.controller;


//import odonto.kids.personal.controll.app.service.IEmploye;
import odonto.kids.personal.controll.app.dto.EmployeeDTO;
import odonto.kids.personal.controll.app.service.Employee_Service;
import odonto.kids.personal.controll.app.service.IEmploye;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employees")
public class Employee_Controller {

    private final IEmploye iEmploye;

    public Employee_Controller(IEmploye iEmploye) {
        this.iEmploye = iEmploye;
    }


    @GetMapping("/getEmployees")
    public EmployeeDTO listEmployees(){
        EmployeeDTO employeeDTO1 = new EmployeeDTO();
        return employeeDTO1;

    }

    @PostMapping("/saveEmployees")
    public String saveEmployees(@RequestBody EmployeeDTO employeeDTO){
        Employee_Service employeeService = new Employee_Service();

        iEmploye.save(employeeService.buildEmployee(employeeDTO));
         return "Successfully saved";

    }

    @DeleteMapping("/deleteEmployees")
    public String getEmployees(){
        return "hola, lograste comiunicarte con este servicio web";

    }


}
