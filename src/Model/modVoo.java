package Model;

/**
 *
 * @author Administrador
 */
public class modVoo {
    private int _numeroVoo;
    private String _origem;
    private String _destino;
    private int _qtdLugaresDisponiveis;

    public int getNumeroVoo() {
        return _numeroVoo;
    }

    public void setNumeroVoo(int _numeroVoo) {
        this._numeroVoo = _numeroVoo;
    }

    public String getOrigem() {
        return _origem;
    }

    public void setOrigem(String _origem) {
        this._origem = _origem;
    }

    public String getDestino() {
        return _destino;
    }

    public void setDestino(String _destino) {
        this._destino = _destino;
    }

    public int getQtdLugaresDisponiveis() {
        return _qtdLugaresDisponiveis;
    }

    public void setQtdLugaresDisponiveis(int _qtdLugaresDisponiveis) {
        this._qtdLugaresDisponiveis = _qtdLugaresDisponiveis;
    }
    
}
