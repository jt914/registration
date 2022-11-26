package cavhack.registration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cavhack.registration.model.Participant;


@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {

}
