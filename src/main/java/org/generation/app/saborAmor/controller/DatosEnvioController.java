package org.generation.app.saborAmor.controller;

import java.util.List;

import org.generation.app.saborAmor.model.DatosEnvio;
import org.generation.app.saborAmor.service.IDatosEnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
@CrossOrigin
public class DatosEnvioController {

    @Autowired
    IDatosEnvioService datosEnvioService;


    @GetMapping("/datos-envio/{id}")
    public List<DatosEnvio> getAllDatosEnvioByIdUsuario(@PathVariable("id") int idUsuario){
        return datosEnvioService.getAllMetodosPagoByFkIdUsuario(idUsuario);
    }

}