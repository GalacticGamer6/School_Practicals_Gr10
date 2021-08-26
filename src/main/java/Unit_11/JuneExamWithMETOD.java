package Unit_11;

public class JuneExamWithMETOD {
    
    public static void main(String[] args) {
        for(int levels = 1 ; levels < 11 ; levels++){
            System.out.println("\n\n");
            System.out.println("LEVEL : " + levels);
            System.out.println("Boss Health :" + Boss_Health(levels));
            Attacks(Boss_Health(levels),levels);
        }
        
    }
    
    
    
    public static int Boss_Health(int levels){
        
        int levelMultiplier = (int)(Math.random()*(4-1+1));
        int Boss_Health = 50 + (levels * 10) * levelMultiplier;

        return Boss_Health;
    }
    
    public static void Attacks(int Boss_Health, int levels){
        int miss_damage = 0; 
        int normal_damage = 0;
        int critical_damage = 0;
        
        for(int attack_num = 1 ; attack_num < 5 ; attack_num++){
                int attack_type = (int)(Math.random()*(6 - 1 + 1));
                switch(attack_type) 
                {
                    case 1: System.out.println("ATTACK: " + attack_num  + " ATTACK TYPE: MISS " + "ATTACK DAMAGE: " + miss_damage);
                            break;
                        
                    case 2:
                    case 3:
                    case 4: normal_damage = attack_type * 15;
                            System.out.println("ATTACK: " + attack_num  + " ATTACK TYPE: NORMAL " + "ATTACK DAMAGE: " + normal_damage);
                            break;
                        
                    case 5: critical_damage = Boss_Health(levels)/2;
                            System.out.println("ATTACK: " + attack_num  + " ATTACK TYPE: NORMAL " + "ATTACK DAMAGE: " + critical_damage);
                            break;
                }
            
        }
    }        
}
