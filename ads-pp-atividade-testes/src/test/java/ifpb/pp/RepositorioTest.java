/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

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
public class RepositorioTest {
    
    private Repositorio<Long, Pessoa> rep;
    
    public RepositorioTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSalvar() {
        
    }

    @Test
    public void testRemover_1args_1() {
        System.out.println("remover");
        Object t = null;
        Repositorio instance = new RepositorioImpl();
        boolean expResult = false;
        boolean result = instance.remover(t);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testRemover_1args_2() {
        System.out.println("remover");
        Number key = null;
        Repositorio instance = new RepositorioImpl();
        boolean expResult = false;
        boolean result = instance.remover(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testLocalizar() {
        System.out.println("localizar");
        Number key = null;
        Repositorio instance = new RepositorioImpl();
        Object expResult = null;
        Object result = instance.localizar(key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    @Test
    public void testTodos() {
        System.out.println("todos");
        Repositorio instance = new RepositorioImpl();
        List expResult = null;
        List result = instance.todos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class RepositorioImpl implements Repositorio {

        public boolean salvar(T t) {
            return false;
        }

        public boolean remover(T t) {
            return false;
        }

        public boolean remover(K key) {
            return false;
        }

        public T localizar(K key) {
            return null;
        }

        public List<T> todos() {
            return null;
        }
    }
    
}
