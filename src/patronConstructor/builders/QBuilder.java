/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronConstructor.builders;

import patronConstructor.products.Query;

/**
 *
 * @author Labing
 */
public interface QBuilder{
    
    public void Build();
    public void setWhere(String where);
    public void setFrom(String From);
    public Query getResult();
    
}
