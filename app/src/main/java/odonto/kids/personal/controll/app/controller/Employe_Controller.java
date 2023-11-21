package odonto.kids.personal.controll.app.controller;


import odonto.kids.personal.controll.app.Model.Employe_Model;
//import odonto.kids.personal.controll.app.service.IEmploye;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/employes")
public class Employe_Controller {

    //@Autowired
    //IEmploye iEmploye;

    @GetMapping("/getEmployes")
    public String getEmployes(){
        return "hola, lograste comiunicarte con este servicio web";

    }


}
