/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronConstructor;

import patronConstructor.builders.QBuilder;
import patronConstructor.products.Query;

/**
 *
 * @author Labing
 */
public class Director {
    
    public Query Build(String where, String from, QBuilder builder){
        builder.Build();
        builder.setWhere(where);
        builder.setFrom(from);
       
        return builder.getResult();
    }
    
}
