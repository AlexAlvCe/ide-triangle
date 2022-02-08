/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.CodeGenerator;

/**
 *
 * @author Alexander
 */
public class KnownValueInitialized extends KnownAddress{
    public KnownValueInitialized(){
    super();
    
  }
  
  public KnownValueInitialized (int size, int level, int displacement, int value) {
    super(size, level, displacement);
    this.value = value;
  }
  
  public int value;
}
