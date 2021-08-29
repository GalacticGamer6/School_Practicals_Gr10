package Unit_11;

public class JuneExamWithMETOD {
    
    public static int num_wins = 0;
    public static void main(String[] args) {
            
        
        for(int levels = 1 ; levels < 11 ; levels++)
        {
            int levelMultiplier = (int)(Math.random()*(3-1+1) + 1);
            System.out.println("\n\n");
            System.out.println("LEVEL : " + levels);
            int Boss_Health = Boss_Health(levels)*levelMultiplier;  //doing this since the level multiplier has to be changed per level and i'd need the boss health method to use levl multiplier and as such created a new bos heralth variabke to act as a final variable
            System.out.println("Boss Health :" + Boss_Health);
            Attacks(Boss_Health,levels);
            if(levels == 10){
                int greatest_damage = (Greatest_Damage(levels, Attacks(Boss_Health, levels)))[0];
                int greatest_damage_level = (Greatest_Damage(levels, Attacks(Boss_Health, levels)))[1];
                
                System.out.println("THE GREATEST DAMAGE WAS: " + greatest_damage + " On Level: " + greatest_damage_level);
            }
        }  
    }
    
    
    
    public static int Boss_Health(int levels){
        
        int Boss_Health = 50 + (levels * 10); // level multiplier is applied in main method
        return Boss_Health;
    }
    
    public static int Attacks(int Boss_Health, int levels){
        int miss_damage = 0; 
        int normal_damage = 0;
        int critical_damage = 0;
        int total_damage_per_level = 0;
        
        for(int attack_num = 1 ; attack_num <= 4 ; attack_num++){
                int attack_type = (int)(Math.random()*(5 - 1 + 1) + 1);
                switch(attack_type)
                {
                    case 1: System.out.println("ATTACK: " + attack_num + "\t"  + " ATTACK TYPE: MISS " + "\t" + "ATTACK DAMAGE: " + miss_damage);
                            total_damage_per_level = total_damage_per_level + miss_damage;
                            break;
                            
                    case 2,3,4: normal_damage = attack_type * 15;
                            System.out.println("ATTACK: " + attack_num + "\t"  + " ATTACK TYPE: NORMAL " + "\t" + "ATTACK DAMAGE: " + normal_damage);
                            total_damage_per_level = total_damage_per_level + normal_damage;
                            break;
                            
                    case 5: critical_damage = Boss_Health/2;
                            System.out.println("ATTACK: " + attack_num + "\t"  + " ATTACK TYPE: CRITICAL " + "\t" + "ATTACK DAMAGE: " + critical_damage);
                            total_damage_per_level = total_damage_per_level + critical_damage;
                            break;
                }
                
        }
        System.out.println("TOTAL DAMAGE : " + total_damage_per_level);
        
        if(total_damage_per_level >= Boss_Health)
            
        {
        System.out.println("BOSS DEFEATED");
        }
        
        else
        {
        System.out.println("BOSS HEALTH REMAINING:" + (Boss_Health - total_damage_per_level) + "\n\n");
        }

        
        return total_damage_per_level; 
    }
    
    public static int [] Greatest_Damage(int level , int total_damage_per_day){
        int current_gratest_damage_per_day = 0;
        int greatest_damage_level = 1;
        int info [] = {0,0};
        if(total_damage_per_day > current_gratest_damage_per_day){
            current_gratest_damage_per_day = total_damage_per_day;
            greatest_damage_level = level;
            info[0] = current_gratest_damage_per_day;
            info[1] = greatest_damage_level;
        }
        return info;
    }
         
}        
