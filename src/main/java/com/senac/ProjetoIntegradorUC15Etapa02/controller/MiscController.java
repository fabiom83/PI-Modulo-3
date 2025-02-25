package com.senac.ProjetoIntegradorUC15Etapa02.controller;

import com.senac.ProjetoIntegradorUC15Etapa02.controller.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MiscController {
    
    @RequestMapping("/pessoa")
    public String getPaginaPessoa(){
        return "pessoa";
    }
    
    @RequestMapping("/advogado")
    public String getPaginaAdvogado(){
        return "advogado";
    }
    
    @RequestMapping("/processo")
    public String getPaginaProcesso(){
        return "processo";
    }
    
    @RequestMapping("/index")
    public String getPaginaIndex(){
        return "index";
    }
}
