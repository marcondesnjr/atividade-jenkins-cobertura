/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.impl;

import ifpb.pp.impl.ValidaPessoa;
import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.progress.MockingProgress;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */

@RunWith(Parameterized.class)
public class ValidaPessoaTest {

    private Pessoa p;
    
    public ValidaPessoaTest(Pessoa p) {
        this.p = p;
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Pessoa p1 = new Pessoa();
        p1.setCpf(new CPF("117.376.474-78"));
        p1.setEndereco(new Endereco());
        p1.setFoto(new byte[1]);
        p1.setId(10);
        p1.setNome("João");
        
        Pessoa p2 = new Pessoa();
        p1.setCpf(new CPF("117.376.474-78"));
        p1.setEndereco(new Endereco());
        p1.setFoto(new byte[1]);
        p1.setId(10);
        p1.setNome("José");
        
        Object[][] data = new Object[][] { {p1}, {p2}};
        return Arrays.asList(data);
    }

    @Test
    public void testValidarCorreto() {
                
        ValidaPessoa vp = new ValidaPessoa();
        assertTrue(vp.validar(p));
    }
    
}
