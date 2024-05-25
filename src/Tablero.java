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
}
