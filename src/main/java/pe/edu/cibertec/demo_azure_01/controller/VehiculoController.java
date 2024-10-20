package pe.edu.cibertec.demo_azure_01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pe.edu.cibertec.demo_azure_01.viewmodel.VehiculoModel;

import java.util.ArrayList;
import java.util.List;

@Controller
public class VehiculoController {
    @GetMapping("/")
    public String obtenerVehiculos(Model model) {

        List<VehiculoModel> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(new VehiculoModel(1, "Toyota", "Corolla", "Rojo", "ABC123"));
        listaVehiculos.add(new VehiculoModel(2, "Honda", "Civic", "Azul", "DEF456"));
        listaVehiculos.add(new VehiculoModel(3, "Ford", "Focus", "Negro", "GHI789"));
        listaVehiculos.add(new VehiculoModel(4, "Chevrolet", "Cruze", "Blanco", "JKL012"));
        listaVehiculos.add(new VehiculoModel(5, "Nissan", "Sentra", "Gris", "MNO345"));

        model.addAttribute("listaVehiculos", listaVehiculos); // Añadimos la lista al modelo

        return "listaVehiculos"; // Nombre de la vista que se renderizará (ejemplo: listaVehiculos.html)
    }
}
