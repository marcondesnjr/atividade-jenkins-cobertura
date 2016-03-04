/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import ifpb.pp.ServiceException;
import implementacao.RepositorioPessoa;
import implementacao.ServicePessoa;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

/**
 *
 * @author NandaPC
 */
public class TesteMockito {
    
    Repositorio repositorioPessoa;
    Service servicePessoa;
    Validador<Pessoa> validador;

    public TesteMockito() {
    }
    
    @Test
    public void TestSalvar(){
        
        repositorioPessoa = Mockito.mock(RepositorioPessoa.class);
        validador = Mockito.mock(Validador.class);
        
        ServicePessoa servicePessoa = new ServicePessoa(validador,repositorioPessoa);
        CPF cpf = new CPF("09913628458");
        Endereco endereco  = new Endereco("Rua", "Bairo");
        Pessoa pessoa = new Pessoa(1l, "Fernanda", new byte[4],cpf ,endereco);
        
        Mockito.when(repositorioPessoa.salvar(pessoa)).thenReturn(Boolean.TRUE);
        Mockito.when(validador.validar(pessoa)).thenReturn(Boolean.TRUE);
        
        Assert.assertTrue(servicePessoa.salvar(pessoa));
        
    }
    
    @Test(expected = ValidadorException.class)
    public void TesteSalvarPessoaNula(){
        
        repositorioPessoa = Mockito.mock(RepositorioPessoa.class);
        validador = Mockito.mock(Validador.class);
        
        ServicePessoa servicePessoa = new ServicePessoa(validador,repositorioPessoa);
        Pessoa pessoa = new Pessoa();
        
        Mockito.when(repositorioPessoa.salvar(null)).thenThrow(new ValidadorException());
        Mockito.when(validador.validar(null)).thenThrow(new ValidadorException());
        
        Assert.assertFalse(servicePessoa.salvar(null));
    }
    
    @Test
    public void TettListarTodos(){
        
        repositorioPessoa = Mockito.mock(RepositorioPessoa.class);
        List<Pessoa> listaPessoas = new ArrayList<Pessoa>();
        CPF cpf = new CPF("09913628458");
        Endereco endereco  = new Endereco("Rua", "Bairo");
        Pessoa pessoa = new Pessoa(1l, "Fernanda", new byte[4],cpf ,endereco);
        listaPessoas.add(pessoa);
        
        ServicePessoa servicePessoa = new ServicePessoa(validador,repositorioPessoa);
        
        Mockito.when(repositorioPessoa.todos()).thenReturn(listaPessoas);
        
        Assert.assertNotNull(servicePessoa.todos());
        
    }
}
