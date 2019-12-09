package turntabl.io.tplatter.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import turntabl.io.tplatter.models.DomainTplatter;
import turntabl.io.tplatter.services.TplatterService;


@ RestController
@RequestMapping("/")
public class TplatterController {

    private TplatterService tplatterService;

    public TplatterController(TplatterService tplatterService) {
        this.tplatterService = tplatterService;
    }

    @GetMapping("/list")
    public  Iterable<DomainTplatter> list(){
        return tplatterService.list();
    }

    //    @GetMapping("/")
//    public String index(){
//        return "hello-world";
//    }

}
