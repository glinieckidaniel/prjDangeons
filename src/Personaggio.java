public class Personaggio {
    private String nome;
    private int hp, attk,def;
    private double range;
    private int[] pos;


    public Personaggio(String nome, int hp, int attk, int def, double range, int[] pos) {
        this.nome = nome;
        this.hp = hp;
        this.attk = attk;
        this.def = def;
        this.range = range;
        for(int i = 0;i< pos.length;i++) {
            this.pos[i] = pos[i];
        }
    }

    public int attacco(Personaggio nemico){
        int danno;
        danno = attk*3-nemico.def*2;
        if(danno<=0){
            danno = 1;
        }
        return danno;
    }

    public boolean isVivo(){
        boolean stato = true;
        if(hp<=0){
            stato =  false;
        }
        return stato;
    }

    public boolean subisciDanno(int danno){
          hp-= danno;
          return isVivo();
    }
}

