/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author Alexander
 */
public class ForInCommand  extends Command {
    
    public ForInCommand (InDeclaration iAST, Command cAST, SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    C = cAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForInCommand(this, o);
  }
  
  public InDeclaration I;
  public Command C;
}

