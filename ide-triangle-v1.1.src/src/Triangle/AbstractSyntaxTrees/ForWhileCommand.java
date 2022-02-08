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
public class ForWhileCommand extends Command {
    public ForWhileCommand (RangeDeclaration rangDeclaration, Expression eAST2, Expression eAST3, Command cAST1, SourcePosition thePosition) {
    super (thePosition);
    R = rangDeclaration;
    E2 = eAST2;
    E3 = eAST3;
    C1 = cAST1;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForWhileCommand(this, o);
  }
  
  public RangeDeclaration R;
  public Expression E2;
  public Expression E3;
  public Command C1;
}
