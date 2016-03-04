package ifpb.pp.pessoa;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/03/2016, 15:26:51
 */
public class CPF {

    private String valor;

    public CPF(String valor) {
        this.valor = valor;
    }
    
    public String formatado(){
        // Formatar
        return valor;
    }
    public String valor(){
        return valor;
    }
}
