package mr.anrpts.orders.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sequence {
    @Id
    private int seq;

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

}
