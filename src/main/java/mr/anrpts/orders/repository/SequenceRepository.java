package mr.anrpts.orders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import mr.anrpts.orders.model.Sequence;

public interface SequenceRepository extends JpaRepository<Sequence ,Integer>{

    @Query(value = "SELECT SEQ FROM sequence", nativeQuery = true)
    Integer findAllSEQ();

    @Modifying
    @Transactional
    @Query("UPDATE Sequence s SET s.seq = s.seq + 1")
    void incrementSeq();
}
