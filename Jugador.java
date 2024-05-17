import java.util.concurrent.atomic.AtomicInteger;

public class Jugador {

    // Atributos
    private static final AtomicInteger genId = new AtomicInteger(0);
    private int id;
    private String name;
    private String elo;
    private int level;
    private String personajeFavorito;

    //Creador del id automatico, con ayuda de la clase sincronica 2.
    public static int getNextId(){
        return genId.incrementAndGet();
    }

    // Constructor
    public Jugador( String name, String elo, String personajeFavorito, int level) {
        this.name = name;
        this.elo = elo;
        this.personajeFavorito = personajeFavorito;
        this.level = level;
        this.id = getNextId();
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getElo() {
        return elo;
    }

    public int getLevel() {
        return level;
    }

    public String getPersonajeFavorito() {
        return personajeFavorito;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setElo(String elo) {
        this.elo = elo;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setPersonajeFavorito(String personajeFavorito) {
        this.personajeFavorito = personajeFavorito;
    }


    //Para cuando invoquemos a Jugador nos muestre los datos correctos
    @Override
    public String toString() {
        return("Id: " + id + "| Nombre: " + name + "| Elo: " + elo + "| Personaje Favorito: " + personajeFavorito + "| Nivel: " + level);
    }
}
