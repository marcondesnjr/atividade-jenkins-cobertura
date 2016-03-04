/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import ifpb.pp.pessoa.CPF;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author José Marcondes do Nascimento Junior
 */
@RunWith(Parameterized.class)
public class ValidaCPFTest {

    private CPF cpf;

    public ValidaCPFTest(CPF c) {
        this.cpf = c;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        Object[][] data = new Object[][]{{new CPF("117.376.474-78")},
        {new CPF("180.806.443-73")},
        {new CPF("772.422.544-34")},
        {new CPF("841.462.592-40")}};
        return Arrays.asList(data);
    }

    @Test
    public void testValidar() {
        ValidaCPF instance = new ValidaCPF();
        assertTrue(instance.validar(cpf));
    }

}
