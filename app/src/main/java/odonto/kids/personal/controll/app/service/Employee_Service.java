package odonto.kids.personal.controll.app.service;

import odonto.kids.personal.controll.app.dto.EmployeeDTO;
import odonto.kids.personal.controll.app.model.Employee_Model;

public class Employee_Service implements  IEmployee_Builder{



    @Override
    public Employee_Model buildEmployee(EmployeeDTO employeeDTO) {
        Employee_Model employeeModel = new Employee_Model();
        employeeModel.setNAME_EMPLOYE("employeeDTO.getNAME_EMPLOYEE()");
        employeeModel.setAPELLIDO_PATERNO_EMPLOYE( "employeeDTO.getAPELLIDO_PATERNO_EMPLOYEE()");
        employeeModel.setAPELLIDO_MATERNO_EMPLOYE( "employeeDTO.getAPELLIDO_MATERNO_EMPLOYEE()");
        employeeModel.setPOSITION_EMPOYE( "employeeDTO.getPOSITION_EMPLOYEE()");
        employeeModel.setSALARY_EMPLOYE( "employeeDTO.getSALARY_EMPLOYEE()");

        return  employeeModel;
    }
}
