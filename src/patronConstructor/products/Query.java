/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronConstructor.products;

/**
 *
 * @author Labing
 */
public abstract class Query {
    protected String query ="";
    
    public abstract void setWhere(String where);
    public abstract void setFrom(String from);
    public abstract String Execute();
    
}
