/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
import Triangle.AbstractSyntaxTrees.Declaration;

/**
 *
 * @author sande
 */
public class Pro_funcs extends Declaration {
    public Pro_funcs(Declaration dAST1, Declaration dAST2, SourcePosition thePosition){
        super(thePosition);
        D1 = dAST1;
        D2 = dAST2;
    }

    
    
    
    public Object visit(Visitor v, Object o){
        return v.visitPro_funcs(this, o);
    }
    
    public Declaration D1, D2;
}
