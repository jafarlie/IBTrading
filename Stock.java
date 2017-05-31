/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sendmarketorder;

import com.ib.client.CommissionReport;
import com.ib.client.Contract;
import com.ib.client.ContractDetails;
import com.ib.client.EClientSocket;
import com.ib.client.EWrapper;
import com.ib.client.Execution;
import com.ib.client.Order;
import com.ib.client.OrderState;
import com.ib.client.TagValue;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
/**
 *
 * @author jafarlielvin
 */
public class Stock {
    private int StockId;
    private String Symbol;
    
    Contract contract = new Contract();
    
    public Stock(){
        
    }
    
    public Stock(int StockID, String Symbol){
        this.StockId = StockID;
        this.Symbol = Symbol;
    }
    
    public int getStockID(){
        return this.StockId;
    }
    
    public String getSymbol(){
        return this.Symbol;
    }
    
    public void createContract(String ticker){
        contract.m_symbol = ticker;
        contract.m_exchange = "ARCA";
        contract.m_secType = "STK";
        contract.m_currency = "USD";
    }
}
