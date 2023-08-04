public class OrcKingdomFactory implements KingdomFactory{


    public Army createArmy(){
        return new OrcArmy();
    }

    public Castle createCastle(){
        return new OrcCastle();
    }

    public King createKing(){
        return new OrcKing();
    }
}