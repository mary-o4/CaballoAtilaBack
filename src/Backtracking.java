import java.util.ArrayList;
import java.util.List;

public class Backtracking {
    private Tablero tablero;
    private List<List<Casilla>> resultados;

    public Backtracking(Tablero tablero) {
        this.tablero = tablero;
        this.resultados= new ArrayList<>();
    }

    public List<List<Casilla>> encontrarRecorridos(int filaOrigen, int columnaorigen){
        Casilla c= this.tablero.getCasilla(filaOrigen,columnaorigen);
        List<Casilla> resultadoParcial = new ArrayList<>();
        int casillasARecorrer = tablero.casillasSinPasto();
        back(resultadoParcial, c, casillasARecorrer);
        return resultados;
    }

    private void back(List<Casilla> resultadoParcial, Casilla inicio, int casillasARecorrer){
        if((inicio == casillasARecorrer)
    }
}
