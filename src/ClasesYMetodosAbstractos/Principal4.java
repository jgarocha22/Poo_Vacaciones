package ClasesYMetodosAbstractos;

public class Principal4 {

    public static void main(String[] args) {
        Planta planta = new Planta();
        AnimalCarnivoro animalc = new AnimalCarnivoro();
        AnimalHerbivoro animalh = new AnimalHerbivoro();

        planta.alimentarse();
        animalc.alimentarse();
        animalh.alimentarse();
    }
}
