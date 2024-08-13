package net.javabackend.springboot.bean;

public class Empleado {
    private int id;
    private String nombre;
    private String apellidos;
    private String fechanacimiento;
    private String lugarnacimiento;
    private String domicilio;
    private String puesto;
    private String departamento;
    private boolean isJefe;
    private boolean isSuperJefe;

    public Empleado(int id, String nombre, String apellidos, String fechanacimiento, String lugarnacimiento, String domicilio, String puesto, String departamento, boolean isJefe, boolean isSuperJefe) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechanacimiento = fechanacimiento;
        this.lugarnacimiento = lugarnacimiento;
        this.domicilio = domicilio;
        this.puesto = puesto;
        this.departamento = departamento;
        this.isJefe = isJefe;
        this.isSuperJefe = isSuperJefe;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getLugarnacimiento() {
        return lugarnacimiento;
    }

    public void setLugarnacimiento(String lugarnacimiento) {
        this.lugarnacimiento = lugarnacimiento;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isJefe() {
        return isJefe;
    }

    public void setJefe(boolean jefe) {
        isJefe = jefe;
    }

    public boolean isSuperJefe() {
        return isSuperJefe;
    }

    public void setSuperJefe(boolean superJefe) {
        isSuperJefe = superJefe;
    }
}

