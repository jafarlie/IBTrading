/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendmarketorder;

import java.sql.SQLException;

/**
 *
 * @author jafarlielvin
 */
public class Main {
    public static void main(String[] args) throws InterruptedException,
            ClassNotFoundException, SQLException{
        
        OrderManagement order = new OrderManagement();
        order.sendMarketOrder("AAPL", "BUY");
    }
}
