import java.util.ArrayList;
import java.util.List;

public class Zaidejas {
    List<String> kortos = new ArrayList<>();
    String vardas;

    public Zaidejas(String vardas) {
        this.vardas = vardas;
        this.kortos = new ArrayList<>();
    }
    public Zaidejas(){}

    public List<String> getKortos() {
        return kortos;
    }

    public void pridetiKorta(String korta) {
        this.kortos.add(korta);
    }

    @Override
    public String toString(){
        return vardas + " has these cards: " + kortos;
    }
}
