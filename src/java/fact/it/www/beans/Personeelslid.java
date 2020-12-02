/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fact.it.www.beans;

/*
 *Tibeau Vandenbroeck
 r0740502 
 */
public class Personeelslid extends Persoon {

    public Personeelslid(String voornaam, String familienaam) {
        super(voornaam, familienaam);
    }

    @Override
    public String toString() {
        return "Personeelslid " + super.toString();
    }
    
    public String getLetters(){
        String eersteletter;
        String tweedeletter;
        String derdeletter;
        int midden = (this.getFamilienaam().length()) / 2;
        eersteletter = this.getFamilienaam().substring(0,1);
        tweedeletter = this.getFamilienaam().substring(midden, midden +1);
        derdeletter = this.getVoornaam().substring(0,1);
        
        return (eersteletter +"."+ tweedeletter + "." + derdeletter);
    }
}
