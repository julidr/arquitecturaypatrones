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
public class SQLQuery extends Query{
    
    @Override
    public void setWhere(String where) {
        super.query=super.query+" " + where;
    }

    @Override
    public void setFrom(String from) {
        super.query=super.query+" " + from;
    }

    @Override
    public String Execute() {
        return "Execute SQLQuery " + super.query;
    }

    


    
}
