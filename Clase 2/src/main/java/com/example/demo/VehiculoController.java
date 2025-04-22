package com.example.demo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Modelos.Vehiculo;

@RequestMapping("vehiculo")
@RestController()
public class VehiculoController {
 
    @GetMapping("todos")
    public ArrayList<Vehiculo> obtenerUno(@RequestParam(name="precioMax", required = true) int precioMax) {

        ArrayList<Vehiculo> todos = new ArrayList<>();

        Vehiculo nuevo1 = new Vehiculo();
        nuevo1.setMarca("suzuki");
        nuevo1.setModelo("Spresso");
        nuevo1.setPrecio(6000);

        todos.add(nuevo1);

        Vehiculo nuevo2 = new Vehiculo();
        nuevo2.setMarca("suzuki");
        nuevo2.setModelo("Swift");
        nuevo2.setPrecio(10000);

        todos.add(nuevo2);

        ArrayList<Vehiculo> filtrados = new ArrayList<>();

        for (Vehiculo vehiculo : todos) {
            if (vehiculo.getPrecio() <= precioMax) {
                filtrados.add(vehiculo);
            }
        }

        return filtrados;
    }
}
