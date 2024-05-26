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
        List<Casilla> resultadoParcial = new ArrayList<>(); // recorrido actual
        int casillasARecorrer = tablero.casillasSinPasto();//cant total de casillas sin pasto
        int numeroPisadas = 0; //cant casillas recorri
        back(resultadoParcial, c,c, casillasARecorrer, numeroPisadas);
        return resultados;
    }

    private void back(List<Casilla> resultadoParcial, Casilla casillaActual, Casilla casillaOrigen, int casillasARecorrer, int numeroPisadas){
        if(this.tablero.hayMovimientos(cas))
            if((numeroPisadas == casillasARecorrer) && casillaActual.esVecina(casillaOrigen)){
            this.resultados.add(resultadoParcial);

            }else{
                int[] MOV_X = {-1, 1, 0, 0}; // Movimientos en las direcciones: arriba, abajo, izquierda, derecha
                int[] MOV_Y = {0, 0, -1, 1};
            }
    }
}
