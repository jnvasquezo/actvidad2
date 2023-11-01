public class Main {
    public static void main(String[] args) {
        gato g1 = new gato("Misufus");
        gato g2 = new gato("Señor gato");
        perro p1 = new perro("Firulais");
        perro p2 = new perro("Coraje");
        perro p3 = new perro("chandoso");

        animal[] animales = {g1,g2,p1,p2,p3};
        sonidos(animales);
    }
    public static void sonidos(animal[] animales) {
        System.out.println("Sonidos de animales");
        for(animal Animal: animales){
            System.out.println(Animal.getNombre()+ " hace ");
            Animal.sonido();

        }
    }
}
