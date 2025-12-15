public class Mago  extends Personaggio{
    private int mana;
    private int totMana;
    private  boolean potenziamentoM;



    public Mago(int mana,   String nome, int[] pos, int atk, int def, int hp, int maxHp, double range) {
        super(nome, pos, atk, def, hp, maxHp, range);
        this.mana = mana;
        this.totMana=mana;
        potenziamentoM=false;


    }

    public int attaccoMagico(){
        int mana=3;
        int danno = 20 + totMana *4;
        if(potenziamentoM ){
            danno*=3;
            potenziamentoM=false;
        }
        return danno;
    }
    public void potenziamento(){
        potenziamentoM=true;


    }

}
