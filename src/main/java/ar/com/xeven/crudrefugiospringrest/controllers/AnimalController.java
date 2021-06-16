package ar.com.xeven.crudrefugiospringrest.controllers;


import ar.com.xeven.crudrefugiospringrest.AnimalService;
import ar.com.xeven.crudrefugiospringrest.entities.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animales")
public class AnimalController {

    private final AnimalService animalService;
    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @PostMapping()
    public Animal crear(@RequestBody Animal animal){
        animalService.save(animal);
        return animal;
    }
    @DeleteMapping("{id}")
    public void borrar(@PathVariable Integer id){
        animalService.deleteById(id);
    }

    @GetMapping("buscar/nombre/{nombre}")
    public List<Animal> buscarPorNombre(@PathVariable String nombre){
        return animalService.findByNombreContaining(nombre);
    }
    @GetMapping("buscar/color/{color}")
    public List<Animal> buscarPorColor(@PathVariable String color){
        return animalService.findByColor(color);
    }
    @GetMapping
    public List<Animal> verTodos(){
        return animalService.getAnimales();
    }
}
