package jp.ac.uryukyu.ie.e245747;

/**
 * ヒーロークラス。
 *  String name; //敵の名前
 *  int hitPoint; //敵のHP
 *  int attack; //敵の攻撃力
 *  boolean dead; //敵の生死状態。true=死亡。
 * Created by tnal on 2016/11/13.
 */
public class Hero extends LivingThing{
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public String getName(){
        return name;
    }
    // setter メソッド: name を設定する
    public void setName(String name) {
        this.name = name;
    }

    //getterメソッド：hitPointを取得する
    public int getHitPoint(){
        return hitPoint;
    }

    // setter メソッド: hitPointを設定する
    public void setHitPoint(int hitPoint){
        this.hitPoint = hitPoint;
    }

    //getterメソッド：attackを取得する
    public int getAttack(){
        return attack;
    }

    // setter メソッド: attack を設定する
    public void setAttack(int attack) {
        this.attack = attack;
    }

    //getterメソッド：deadを取得する
    public boolean getDead(){
        return dead;
    }

    // setter メソッド: dead を設定する
    public void setDead(boolean dead) {
        this.dead = dead;
    }

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name ヒーロー名
     * @param maximumHP ヒーローのHP
     * @param attack ヒーローの攻撃力
     */
    public Hero (String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
        //System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * Enemyへ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、hero.wounded()によりダメージ処理を実行。
     * @param e 攻撃対象
     
    public void attack(Enemy e){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
        e.wounded(damage);
    }*/

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
            System.out.printf("勇者%sは道半ばで力尽きてしまった。\n", name);
        }
    }
