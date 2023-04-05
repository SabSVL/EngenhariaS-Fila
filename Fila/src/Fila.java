public class Fila {
    private static Fila instancia;

    private Fila() {

    }

    public static Fila getInstancia() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }
    /* Imprimir documento */
    public void ImprimirDocumento() {

    }
    public void RemoveDocumento(){

    }
    public void RemoveTodosDocumentos(){

    }
}