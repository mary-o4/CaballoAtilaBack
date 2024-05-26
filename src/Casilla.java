public class Casilla {
    private int fila;
    private int columna;
    private boolean conPasto;
    private boolean fuiPisada;

    public Casilla(int fila, int columna, boolean conPasto) {
        this.fila = fila;
        this.columna = columna;
        this.conPasto = conPasto;
    }

    public boolean esVecina(Casilla vecina){
        if((this.getFila()== vecina.getFila())&&(this.getColumna()==(vecina.getColumna()+1))
           ||(this.getFila()== vecina.getFila())&&(this.getColumna()==(vecina.getColumna()-1))){
            return true;
        }else if((this.getFila()== (vecina.getFila()+1))&&(this.getColumna()==vecina.getColumna())
                ||(this.getFila()== (vecina.getFila()-1))&&(this.getColumna()==vecina.getColumna())){
            return true;
        }else{
            return false;
        }

    }
    public boolean isFuiPisada() {
        return fuiPisada;
    }

    public void setFuiPisada(boolean fuiPisada) {
        this.fuiPisada = fuiPisada;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean isConPasto() {
        return conPasto;
    }

    public void setConPasto(boolean conPasto) {
        this.conPasto = conPasto;
    }
}
