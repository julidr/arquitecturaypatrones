/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronConstructor;

import patronConstructor.builders.SQLBuilder;

/**
 *
 * @author Labing
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SQLBuilder builder = new SQLBuilder();
        Director director = new Director();
        System.out.println(director.Build("where name = 'Juli'", "from names", builder).Execute());
        
    }
    
}
