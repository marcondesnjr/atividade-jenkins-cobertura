/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

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
        
    }

    @Test
    public void testRemover_Pessoa() {
        System.out.println("remover");
        Pessoa pessoa = null;
        RepositorioPessoa instance = new RepositorioPessoa();
        boolean expResult = false;
        boolean result = instance.remover(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemover_Long() {
        System.out.println("remover");
        Long key = null;
        RepositorioPessoa instance = new RepositorioPessoa();
        boolean expResult = false;
        boolean result = instance.remover(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testLocalizar() {
        Pessoa p = new RepositorioPessoa().localizar(new Long(3));
        assertNotNull(p);
        assertEquals(p.getCpf(), "233.431.563-0");
    }

    @Test
    public void testTodos() {
        System.out.println("todos");
        RepositorioPessoa instance = new RepositorioPessoa();
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.todos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
