package cindodcindy.sirihpinang.nodependencyinjection;

public class LightKnight {

    Senjata senjata = new Senjata();

    String pedang(){
        return "ligth knight pake " + senjata.pedang();
    }
}
