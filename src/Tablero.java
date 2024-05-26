import java.util.ArrayList;

public class Tablero {

    private Casilla[][] casillas;
    private int n;

    public Tablero(int n) {
        this.n = n;
        this.casillas=new Casilla[n][n];
    }

    public void setCasilla(int fila, int columna, Casilla c){
        this.casillas[fila][columna]= c;
    }

    public Casilla getCasilla(int fila, int columna){
        return this.casillas[fila][columna];
    }

    public int getN() {
        return n;
    }
    public int casillasSinPasto(){
        int total = 0;
        for(int i=0; i<casillas.length;i++){
            for(int j=0; j<this.casillas[i].length; j++){
                if(!casillas[i][j].isConPasto()){
                    total++;
                }
            }
        }
        return total;
    }

    public boolean esValido(int fila, int columna){
        return ((fila>= 0 && fila<n)&&(columna>=0 && columna<n));
    }

    public boolean hayMovimientos(Casilla casilla){
        Casilla derecha = this.getCasilla(casilla.getFila(), casilla.getColumna()+1);
        Casilla izquierda = this.getCasilla(casilla.getFila(), casilla.getColumna()-1);
        Casilla arriba = this.getCasilla(casilla.getFila()-1, casilla.getColumna());
        Casilla abajo = this.getCasilla(casilla.getFila()+1, casilla.getColumna());
        int inaccesibles=0;
        ArrayList<Casilla>aux = new ArrayList<>();
        ArrayList<Casilla>vecinos = new ArrayList<>();
        aux.add(derecha);
        aux.add(izquierda);
        aux.add(abajo);
        aux.add(arriba);

        for (Casilla c:aux){
            if(this.esValido(c.getFila(),c.getColumna())){
                vecinos.add(c);
            }
        }

        for (Casilla c:vecinos){
            if (c.isConPasto() || c.isFuiPisada()
                    || this.esValido(c.getFila(), c.getColumna())) {
                inaccesibles++;
        }

        }if(inaccesibles==vecinos.size()){
            return false;
        }
        return true;
    }
}
