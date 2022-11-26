
package cavhack.registration.controller;

        import java.util.List;

        import jakarta.servlet.http.Part;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.RestController;

        import cavhack.registration.model.Participant;
        import cavhack.registration.service.ParticipantService;

@RestController
@RequestMapping("/api")
public class ParticipantController {
    @Autowired
    ParticipantService participantService;

    @RequestMapping(value="/participant", method=RequestMethod.POST)
        public Participant createParticipants(@RequestBody Participant par) {
            return participantService.createParticipant(par);
    }

    @RequestMapping(value="/participant", method=RequestMethod.GET)
    public List<Participant> readParticipants() {
        return participantService.getParticipants();
    }

    @RequestMapping(value="/participant/{par_id}", method=RequestMethod.PUT)
    public Participant readParticipants(@PathVariable(value = "par_id") Long id, @RequestBody Participant parDetails) {
        return participantService.updateParticipant(id, parDetails);
    }

    @RequestMapping(value="/participant/{par_id}", method=RequestMethod.DELETE)
    public void deleteParticipants(@PathVariable(value = "par_id") Long id) {
        participantService.deleteParticipant(id);
    }





}
