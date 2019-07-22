package patepeli;

import java.util.ArrayList;
import java.util.HashMap;


public class Attribuutit {

    private RandomGen r;
    public ArrayList<String> attr = new ArrayList<>();
    public HashMap<String, Integer> attrit = new HashMap<>();
    public ArrayList<String> rodut = new ArrayList<>();
    public String[] adjektiivit;
    public String[] statit;

    public Attribuutit() {
        statit = new String[]{"Vahvuus", "Vikkelyys", "Kestävyys", "Charmi", "Äly", "Magia", "Tekno"};
        adjektiivit = new String[]{"vahva ", "vikkelä ", "kestävä ", "charmikas ", "älykäs ", "maaginen ", "tekno-"};

        for (String string : statit) {
            attrit.put(string, 0);
            attr.add(string);
        }

        r = new RandomGen();
        rodut.add("ihminen");
        rodut.add("kääpiö");
        rodut.add("haltia");
        rodut.add("puolituinen");
        rodut.add("örkki");
        rodut.add("gobo");
        rodut.add("ogre");
        rodut.add("rottajäbä");
    }

    public String luodaanHahmo() {
        StringBuilder hahmo = new StringBuilder();
        hahmo.append(annaAttri(true));
        hahmo.append("ja ");
        hahmo.append(annaAttri(false));
        hahmo.append(annaRotu());
        hahmo.append(" ");

        Ominaisuudet om = new Ominaisuudet();
        hahmo.append(om.annaOminaisuus());
        hahmo.append("\n");
        int hp = attrit.get("Kestävyys") + 1;
        hahmo.append("HP: " + hp + " ");

        for (String string : attrit.keySet()) {
            if (attrit.get(string) > 0) {
                hahmo.append(string + ": " + attrit.get(string) + " ");
            }
        }
        hahmo.append("\n");
        
        for (String string : statit) {
            attrit.put(string, 0);
        }
        
        return hahmo.toString();
    }

    public String annaAttri(boolean iso) {
        int rand = r.giveRandomInt(0, attrit.size() - 1);

        attrit.put(attr.get(rand), attrit.get(attr.get(rand)) + 1);

        String output = adjektiivit[rand];
        if (iso) {
            output = output.substring(0, 1).toUpperCase() + output.substring(1);
        }
        return output;

    }

    public String annaRotu() {
        int rot = r.giveRandomInt(0, rodut.size() - 1);
        lisaaRodunStatit(rot);
        return rodut.get(rot);

    }

    public String lisaaRodunStatit(int rotuNum) {
        switch (rotuNum) {
            case 0: //ihminen
                attrit.put("Oma valinta", 1);
                break;
            case 1: //kääpiö
                attrit.put("Vahvuus", attrit.get("Vahvuus") + 1);
                attrit.put("Tekno", attrit.get("Tekno") + 1);
                break;
            case 2: //haltia
                attrit.put("Magia", attrit.get("Magia") + 1);
                attrit.put("Charmi", attrit.get("Charmi") + 1);
                break;
            case 3: //puolituinen
                attrit.put("Charmi", attrit.get("Charmi") + 1);
                attrit.put("Vikkelyys", attrit.get("Vikkelyys") + 1);
                break;
            case 4: //Örkki
                attrit.put("Vahvuus", attrit.get("Vahvuus") + 1);
                attrit.put("Vikkelyys", attrit.get("Vikkelyys") + 1);
                break;
            case 5: //Gobo
                attrit.put("Äly", attrit.get("Äly") + 1);
                attrit.put("Tekno", attrit.get("Tekno") + 1);
                break;
            case 6: //Ogre
                attrit.put("Vahvuus", attrit.get("Vahvuus") + 1);
                attrit.put("Kestävyys", attrit.get("Kestävyys") + 1);
                break;
            case 7: //Rottajäbä
                attrit.put("Vikkelyys", attrit.get("Vikkelyys") + 1);
                attrit.put("Pimeänäkö", 1);
                break;

            default: // Optional
            // Statements
        }
        return "";
    }

}
