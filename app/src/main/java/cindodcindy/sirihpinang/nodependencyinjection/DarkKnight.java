package cindodcindy.sirihpinang.nodependencyinjection;

public class DarkKnight {

    Senjata senjata = new Senjata();

    String tombak(){
        return "Kelompok dark knight bertempur menggunakan " + senjata.tombak();
    }
}
