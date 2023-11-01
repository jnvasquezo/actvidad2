public class animal {
    private String nombre;

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void sonido(){
        System.out.println("No tiene sonido, solo las subclases");
    }
}
