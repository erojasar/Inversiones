/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author erojasar
 */
public class Company {
    private String name;
    private ArrayList<Asset> asset;
    private HashMap<Integer, Client> clients;
    
    public Company(String name) {
        this.name = name;
        this.asset = new ArrayList<>();
        this.clients = new HashMap<>();
    }
    public boolean addClient(int id, String name, String lastName, String email){
        return false;
    }
    public boolea  addStock(int totalShares, String symbol, double totalCost, double currentPrice)
}
