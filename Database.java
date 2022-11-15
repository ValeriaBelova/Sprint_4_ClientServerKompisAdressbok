package Sprint4.Övningar.ClientServer.Telefonbok;

import java.util.List;

public class Database {
    //Låt databas-klassen ha en metod getKompis(String name) som returnerar
    //en sträng med en kompis alla data, appendade i en String.
    Kompis k1 = new Kompis("Christine", 0700443322, "1988-01-01", "Chr@gmail.com");
    Kompis k2 = new Kompis("Caroline", 0755664433, "1966-05-06", "car@gmail.com");
    Kompis k3 = new Kompis("Charlotte", 0733445566, "1975-0305", "cha@gmail.com");

    List<Kompis> kompisList = List.of(k1,k2,k3);

    public Database(){}

    public String search(String name){
        for (Kompis k : kompisList){
            if (k.getName().equals(name)){
                return kompisInfo(k);
            }
        }
        return "Denna kompis fanns inte i databasen";
    }

    public String kompisInfo(Kompis k){
        return k.name+" "+k.mobilenumber+" "+k.birthday+" "+k.email;
    }

}
