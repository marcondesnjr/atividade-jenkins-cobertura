/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao;

import br.com.caelum.stella.validation.CPFValidator;
import br.com.caelum.stella.validation.InvalidStateException;
import ifpb.pp.Validador;
import ifpb.pp.pessoa.CPF;

/**
 *
 * @author NandaPC
 */
public class ValidaCPF implements Validador<CPF>{

    @Override
    public boolean validar(CPF cpf) {
        if(cpf != null){
            CPFValidator validator = new CPFValidator();
            try {
                validator.assertValid(cpf.valor());
                System.out.println("Valido");
                
            } catch (InvalidStateException e) {
                System.err.println(e.getInvalidMessages());
            }
            return true;
            }
        return false;
    } 
    
}
