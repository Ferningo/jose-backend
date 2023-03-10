package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.service.IPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class PedidoController {

    @Autowired
    IPedidoService pedidoService;


    @GetMapping("/pedido/{id}")
    public List<Pedido> getAllPedidosByUsuarioId(@PathVariable("id") int idUsuario){
        return pedidoService.getAllPedidosByUsuarioId(idUsuario);
    }



    @PostMapping("/pedido/")
    public Pedido createPedido(@RequestBody Pedido newPedidoData){
        return pedidoService.savePedido(newPedidoData);
    }





}
