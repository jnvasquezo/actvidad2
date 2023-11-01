public class perro extends animal{
    public perro(){
        super();//la clase super sirve para 
    }
    public perro(String nombre){
        this.setNombre(nombre);
    }
    
    @Override
    public void sonido(){
        System.out.println("guauuuu");
    }
}