package cavhack.registration.service;

import jakarta.servlet.http.Part;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cavhack.registration.model.Participant;
import cavhack.registration.repository.ParticipantRepository;
import java.util.List;

@Service
public class ParticipantService {

    @Autowired
    ParticipantRepository participantRepository;

    // CREATE
    public Participant createParticipant(Participant participant) {
        return participantRepository.save(participant);
    }

    // READ
    public List<Participant> getParticipants() {
        return participantRepository.findAll();
    }

    //UPDATE
    public Participant updateParticipant(Long par_id, Participant participantDetails) {
        Participant par = participantRepository.findById(par_id).get();
        par.setFirst_name(participantDetails.getFirst_name());
        par.setLast_name(participantDetails.getLast_name());
        par.setGender(participantDetails.getGender());
        par.setSchool(participantDetails.getSchool());
        par.setGradYr(participantDetails.getGradYr());


        return participantRepository.save(par);
    }


    // DELETE
    public void deleteParticipant(Long empId) {
        participantRepository.deleteById(empId);
    }
}