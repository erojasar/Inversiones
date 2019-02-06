/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

/**
 *
 * @author erojasar
 */
public class Client {
    private int id;
    private String name;
    private String lastName;
    private String email; 
    private Asset[] assets;

    public Client(int id, String name, String lastName, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.assets = new Asset[10];
    }
    
    public boolean addAsset(Asset asset){
        //Implementar asignacion
        return false;   
    }
}
