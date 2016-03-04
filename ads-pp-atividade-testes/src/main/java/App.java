
import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import implementacao.RepositorioPessoa;
import implementacao.ValidaCPF;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NandaPC
 */
public class App {
    
    public static void main(String[] args) {
        
//        ValidaCPF v = new ValidaCPF();
//        CPF cpf = new CPF("09913628458");
//       
//        v.validar(cpf);
//        
        RepositorioPessoa repositorioPessoa = new RepositorioPessoa();
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("fernanda");
        
        pessoa.setCpf(new CPF("1234556"));
        Endereco endereco = new Endereco("rua", "bairro");
        pessoa.setEndereco(endereco );
        pessoa.setFoto(null);
      
        
        repositorioPessoa.salvar(pessoa);
        
    }
    
}
