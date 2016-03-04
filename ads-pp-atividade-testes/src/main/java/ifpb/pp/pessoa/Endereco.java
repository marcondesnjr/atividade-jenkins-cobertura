package ifpb.pp.pessoa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/03/2016, 15:57:59
 */
@Entity
public class Endereco implements Serializable{

    @Id
    @GeneratedValue
    private int id;
    private String rua;
    private String bairro;

    public Endereco() {
    }
   

    public Endereco(String rua, String bairro) {
        this.rua = rua;
        this.bairro = bairro;
    }
   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
