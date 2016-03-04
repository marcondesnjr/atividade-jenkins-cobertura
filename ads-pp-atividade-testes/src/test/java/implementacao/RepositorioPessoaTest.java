/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */

import pp.dbunitconf.DBUnitHelper;

public class RepositorioPessoaTest {
    
    public RepositorioPessoaTest() {
    }
   
    
    @Before
    public void setUp() {
        new DBUnitHelper().cleanInsert("/Pessoa.xml");
    }
    
    @After
    public void tearDown() {
        new DBUnitHelper().deleteAll("/Pessoa.xml");
    }

    @Test
    public void testSalvar() {
        Pessoa pessoa = new Pessoa();
        pessoa.setId(10);
        pessoa.setCpf(new CPF("180.806.443-73"));
        pessoa.setEndereco(new Endereco("Rua1", "Bairro1"));
        pessoa.setFoto(new byte[10]);
        
        RepositorioPessoa repository = new RepositorioPessoa();
        assertTrue(repository.salvar(pessoa));
        assertEquals(pessoa, repository.localizar(pessoa.getId()));
    }

    @Test
    public void testRemoverPessoa() {
        RepositorioPessoa rep = new RepositorioPessoa();
        Pessoa p = rep.localizar(new Long(1));
        assertTrue(rep.remover(p));
        assertNull(rep.localizar(p.getId()));
    }

    @Test
    public void testRemover_Long() {
//        System.out.println("remover");
//        Long key = null;
//        RepositorioPessoa instance = new RepositorioPessoa();
//        boolean expResult = false;
//        boolean result = instance.remover(key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    @Test
    public void testLocalizar() {
        Pessoa p = new RepositorioPessoa().localizar(new Long(3));
        assertNotNull(p);
        assertEquals(p.getCpf().valor(), "233.431.563-02");
    }
    
    @Test
    public void testLocalizarInexistente() {
        Pessoa p = new RepositorioPessoa().localizar(new Long(333));
        assertNull(p);
    }

    @Test
    public void testTodos() {
        RepositorioPessoa rep = new RepositorioPessoa();
        List<Pessoa> list = rep.todos();
        assertEquals(list.size(), 4);
    }
    
}
