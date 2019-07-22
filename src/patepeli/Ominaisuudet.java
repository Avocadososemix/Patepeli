/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patepeli;

/**
 *
 * @author Käyttäjä 2
 */
public class Ominaisuudet {

    private RandomGen r;
    public String[] ominaisuudet;
    
    public Ominaisuudet() {
    r = new RandomGen();    
    ominaisuudet = new String[] {"jolla revolveri", "jolla bensaa suonissa",
    "joka on epäkuollut", "joka on kirottu", "jolla on silinteri", "jolla on taikasauva",
    "joka on ihmis-hevonen", "jolla äänekäs äänirauta", "jolla on käärmekamu",
    "jolla on vanha scouter", "jolla on parannuspotu", "jolla on taikapapu",
    "jolla on nätti käsiala", "jolla on iso saippuapala", "jolla on teknokäsi",
    "jolla on teknosaha", "joka osaa soittaa tekno-nokkahuilua", "jolla on tiirikkasetti",
    "jolla on piilukkokivääri", "jolla on pienet siivet", "jolla on säkillinen hämähäkkejä",
    "joka on opium-addikti", "jolla on polkupyörä", "jolla on skorpioni-häntä"} ;

    }
    
    public String annaOminaisuus() {
        
        int mones = r.giveRandomInt(0, ominaisuudet.length-1);
        return ominaisuudet[mones];
        
    }
    
    
}
