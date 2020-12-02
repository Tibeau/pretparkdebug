/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

import java.util.ArrayList;

/*
 *Tibeau Vandenbroeck
 r0740502 
 */
public class Bezoeker extends Persoon{
    private ArrayList<String> wishlist = new ArrayList<>();
    private int pretparkcode;

    public Bezoeker(String voornaam, String familienaam) {
        super(voornaam, familienaam);
        this.pretparkcode = -1;
    }

    public ArrayList<String> getWishlist() {
        return wishlist;
    }
    
    public void setPretparkcode(int pretparkcode) {
        this.pretparkcode = pretparkcode;
    }
    
    public int getPretparkcode() {
        return pretparkcode;
    }
    
      public int getAantalOpWishlist() {
       return wishlist.size();
    }
    
    public boolean voegToeAanWishlist(String attractienaam){
        if (wishlist.size() <= 4) {
            wishlist.add(attractienaam);
            return true;
        }
        else{ return false; 
        }               
    }

    @Override
    public String toString() {
        return  "Bezoeker " + super.toString() + " met " + "pretparkcode " + pretparkcode;
    }
}
