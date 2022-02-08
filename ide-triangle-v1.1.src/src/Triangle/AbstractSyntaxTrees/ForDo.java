/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;
import Triangle.SyntacticAnalyzer.Parser;
import Triangle.SyntacticAnalyzer.SourcePosition;
/**
 *
 * @author Alexander
 */
public class ForDo extends Command {
    public ForDo (RangeDeclaration rangeDeclaration, Expression eAST2, Command cAST1, SourcePosition thePosition) {
    super (thePosition);
    R = rangeDeclaration;
    E2 = eAST2;
    C1 = cAST1;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForDoCommand(this, o);
  }
  
  
  
  public RangeDeclaration R;
  public Expression E2;
  public Command C1;
}