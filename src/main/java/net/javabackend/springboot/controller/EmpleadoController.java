package net.javabackend.springboot.controller;

import net.javabackend.springboot.bean.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("empleados")
public class EmpleadoController {

    @GetMapping("empleado")
    public ResponseEntity<Empleado> getEmpleado(){
        Empleado empleado = new Empleado(
                1,
                "Carlo Gael",
                "Bañuelos Maldonado",
                "17/10/2001",
                "Monterrey, Nuevo Leon",
                "Santiga Roel",
                "Desarrollador Java",
                "TI",
                true,
                false
        );
        return ResponseEntity.ok().body(empleado);
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> getEmpleados(){
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado(1,"Carlo Gael", "Bañuelos Maldonado", "17/10/2001", "Monterrey, Nuevo Leon", "Santiga Roel", "Desarrollador Java","TI",true,false));
        empleados.add(new Empleado(1,"Federico Peluche", "Bañuelos Maldonado", "8/07/1980", "Monterrey, Nuevo Leon", "Aviles Maximiliano", "Desarrollador REACT JS","TI",true,true));
        return ResponseEntity.ok(empleados);
    }

    @GetMapping("{id}")
    public ResponseEntity<Empleado> empleadoPathVariable(@PathVariable("id") int empleadoId){
        Empleado empleado =  new Empleado(empleadoId,"Carlo Gael", "Bañuelos Maldonado", "17/10/2001", "Monterrey, Nuevo Leon", "Santiga Roel", "Desarrollador Java","TI",true,false);
        return ResponseEntity.ok().body(empleado);
    }

    @GetMapping("query")
    public ResponseEntity<Empleado> empleadoRequestVariable(@RequestParam String departamento){
        Empleado empleado =  new Empleado(1,"Carlo Gael", "Bañuelos Maldonado", "17/10/2001", "Monterrey, Nuevo Leon", "Santiga Roel", "Desarrollador Java",departamento,true,false);
        return ResponseEntity.ok().body(empleado);
    }

    @PostMapping("create")
    //@ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Empleado> createEmpleado(@RequestBody Empleado empleado){
        System.out.println(empleado.getId());
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellidos());
        System.out.println(empleado.getFechanacimiento());
        System.out.println(empleado.getLugarnacimiento());
        System.out.println(empleado.getDomicilio());
        System.out.println(empleado.getPuesto());
        System.out.println(empleado.getDepartamento());
        System.out.println(empleado.isJefe());
        System.out.println(empleado.isSuperJefe());
        return new ResponseEntity<>(empleado, HttpStatus.CREATED);
    }

    @PutMapping("update/{id}")
    //@ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<Empleado> updateEmpleado(@RequestBody Empleado empleado, @PathVariable("id") int empleadoId){
        System.out.println(empleado.getNombre());
        System.out.println(empleado.getApellidos());
        System.out.println(empleado.getFechanacimiento());
        System.out.println(empleado.getLugarnacimiento());
        System.out.println(empleado.getDomicilio());
        System.out.println(empleado.getPuesto());
        System.out.println(empleado.getDepartamento());
        System.out.println(empleado.isJefe());
        System.out.println(empleado.isSuperJefe());
        return new ResponseEntity<>(empleado, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("delete/{id}")
    //@ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> deleteEmpleado(@PathVariable("id") int empleadoID){
        return ResponseEntity.ok().body("Empleado Eliminado con Exito");
    }
}
