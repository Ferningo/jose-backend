package org.generation.app.saborAmor.controller;

import org.generation.app.saborAmor.model.Pedido;
import org.generation.app.saborAmor.model.PedidoProducto;
import org.generation.app.saborAmor.service.PedidoProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
@CrossOrigin
public class PedidoProductoController {

    @Autowired
    PedidoProductoService pedidoProductoService;

    @GetMapping("pedido-producto/{pedidoId}")
    public Iterable<PedidoProducto> getAllPedidoProductoByPedidoId(@PathVariable("pedidoId") int pedidoId ){
        return pedidoProductoService.getAllPedidoProductoByPedidoId(pedidoId);
    }


}
