/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import ifpb.pp.Service;
import ifpb.pp.pessoa.Pessoa;
import java.util.List;

/**
 *
 * @author NandaPC
 */
public class ServicePessoa implements Service<Long, Pessoa>{
    
    ValidaPessoa validaPessoa = new ValidaPessoa();
    RepositorioPessoa repositorioPessoa = new RepositorioPessoa();

    public ServicePessoa(RepositorioPessoa repositorioPessoa) {
        this.repositorioPessoa = repositorioPessoa;
    }

    @Override
    public boolean salvar(Pessoa pessoa) {
        if(validaPessoa.validar(pessoa)){
           return repositorioPessoa.salvar(pessoa);
            
        }
        return false;
    }

    @Override
    public boolean remover(Pessoa pessoa) {
        return repositorioPessoa.remover(pessoa);
        }

    @Override
    public Pessoa localizar(Long key) {
        return repositorioPessoa.localizar(key);
        
    }

    @Override
    public List<Pessoa> todos() {
        return repositorioPessoa.todos();
    }
    
}
