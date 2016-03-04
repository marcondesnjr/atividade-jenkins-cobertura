/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.impl;

import ifpb.pp.Repositorio;
import ifpb.pp.Service;
import ifpb.pp.Validador;
import ifpb.pp.ValidadorException;
import ifpb.pp.impl.ServicePessoa;
import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
public class ServicePessoaTest {
    
    private Repositorio repositorioPessoa;
    private Service servicePessoa;
    private Validador<Pessoa> validador;
    
    public ServicePessoaTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSalvar() {
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
    public void testSalvarPessoaNula(){
        
        repositorioPessoa = Mockito.mock(RepositorioPessoa.class);
        validador = Mockito.mock(Validador.class);
        
        ServicePessoa servicePessoa = new ServicePessoa(validador,repositorioPessoa);
        Pessoa pessoa = new Pessoa();
        
        Mockito.when(repositorioPessoa.salvar(null)).thenThrow(new ValidadorException());
        Mockito.when(validador.validar(null)).thenThrow(new ValidadorException());
        
        Assert.assertFalse(servicePessoa.salvar(null));
    }

    @Test
    public void testRemover() {
        System.out.println("remover");
        Pessoa pessoa = null;
        ServicePessoa instance = null;
        boolean expResult = false;
        boolean result = instance.remover(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testLocalizar() {
        System.out.println("localizar");
        Long key = null;
        ServicePessoa instance = null;
        Pessoa expResult = null;
        Pessoa result = instance.localizar(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTodos() {
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
