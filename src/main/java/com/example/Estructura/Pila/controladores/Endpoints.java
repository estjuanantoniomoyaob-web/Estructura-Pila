package com.example.Estructura.Pila.controladores;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.Estructura.Pila.estructura.Pila;

@RestController
@RequestMapping("/api/v1")
public class Endpoints {

    Pila pilita = new Pila();

    @GetMapping("/insertar")
    public String insertar(@RequestParam String x) {
    pilita.agregar(x);
    return "Insertado: " + x;
}

    @GetMapping("/eliminar")
    public String eliminar() {
        Object eliminado = pilita.quitar();
        if (eliminado == null) {
            return "Pila vacia";
        }
        return "Eliminado: " + eliminado;
    }

    @GetMapping("/ver")
    public String ver() {
        return pilita.mostrar();
    }

    @GetMapping("/tamanyo")
    public String tamanyo() {
        return "Tamanyo: " + pilita.size();
    }
}