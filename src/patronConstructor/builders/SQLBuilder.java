/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronConstructor.builders;

import patronConstructor.products.Query;
import patronConstructor.products.SQLQuery;

/**
 *
 * @author Labing
 */
public class SQLBuilder implements QBuilder{
    Query myQuery;
    
    @Override
    public void Build() {
        myQuery = new SQLQuery();
    }

    @Override
    public void setWhere(String where) {
        myQuery.setWhere(where);
    }

    @Override
    public void setFrom(String From) {
       myQuery.setFrom(From);
    }

    @Override
    public Query getResult() {
        return myQuery;
    }

    
}
