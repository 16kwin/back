package table.back.entity;
import jakarta.persistence.*;
@Entity
@Table(name = "operation_norm") 
public class Norm {
    @Id
    @Column(name = "NumberOperation")
    private Long Number;

    @Column(name = "timeOperation")
    private Long timeOperation;

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long Number) {
        this.Number = Number;
    }

    public Long getTimeOperation() {
        return timeOperation;
    }

    public void setTimeOperation(Long timeOperation) {
        this.timeOperation = timeOperation;
    }
}
