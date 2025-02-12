package jp.ac.uryukyu.ie.e245747;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeponSkill(){
        int beforEnemyHP;
        Warrior demoWarrior = new Warrior("デモ戦士",100,100);
        Enemy demoEnemy = new Enemy("スライムもどき",1000,10);

        for(int i=1; i<3; i++){
            beforEnemyHP = demoEnemy.getHitPoint();
            demoWarrior.attackWithWeponSkill(demoEnemy);
            demoEnemy.attack(demoWarrior);

            assertEquals(demoWarrior.getAttack()*1.5,beforEnemyHP-demoEnemy.getHitPoint());
        }
    }
}

