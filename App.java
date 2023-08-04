import java.util.logging.Logger;

public class App{
    private static Logger LOGGER = Logger.getLogger("App");
    private Army army;
    private Castle castle;
    private King king;

    public App(){

    }

    public void createKingdom(KingdomFactory factory){

        this.army = factory.createArmy();
        this.castle = factory.createCastle();
        this.king = factory.createKing();

    }

    public Army getArmy(){

        return army;

    }

    public Army getArmy(KingdomFactory factory){
        return factory.createArmy();
    }

    public Castle getCastle(){

        return castle;

    }

    Castle getCastle(KingdomFactory factory){

        return factory.createCastle();

    }

    public King getKing(){

        return king;

    }



    King getKing(KingdomFactory factory){

        return factory.createKing();

    }

    public static void main(String[] args) {


        var app = new App();


        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));

        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());


        app.createKingdom(FactoryMaker.makeFactory(KingdomType.ORC));

        System.out.println(app.getArmy().getDescription());
        System.out.println(app.getCastle().getDescription());
        System.out.println(app.getKing().getDescription());

        

        



        
        
    }

    private void setArmy(Army army){

        this.army = army;

    }

    private void setCastle(Castle castle){
        this.castle = castle;

    }

    private void setKing(King king){

        this.king = king;

    }

    



}