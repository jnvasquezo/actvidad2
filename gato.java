public class gato extends animal{
    public gato(){
        super();//la clase super sirve para 
    }
    public gato(String nombre){
        this.setNombre(nombre);
    }
    
    @Override
    public void sonido(){
        System.out.println("miau");
    }
}