public class FactoryMaker {
    
    public static KingdomFactory makeFactory(KingdomType type){

        if (type == KingdomType.ELF)
            return new ElfKingdomFactory();
        else 
            return new OrcKingdomFactory();
        
        
    }
}
