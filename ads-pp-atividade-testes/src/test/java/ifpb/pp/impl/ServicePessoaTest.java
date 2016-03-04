/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.impl;

import ifpb.pp.impl.ServicePessoa;
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
public class ServicePessoaTest {
    
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
        System.out.println("salvar");
        Pessoa pessoa = null;
        ServicePessoa instance = null;
        boolean expResult = false;
        boolean result = instance.salvar(pessoa);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
        System.out.println("todos");
        ServicePessoa instance = null;
        List<Pessoa> expResult = null;
        List<Pessoa> result = instance.todos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
