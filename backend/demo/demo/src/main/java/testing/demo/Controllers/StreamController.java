package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import testing.demo.services.StreamService;
import testing.demo.services.JSubjectService;
import testing.demo.entities.Stream;
import testing.demo.entities.JSubject;

import java.util.List;

@RestController
@RequestMapping("/stream")
public class StreamController {
    @Autowired
    private StreamService streamService;
    @Autowired
    private JSubjectService JSubjectService;

    @PostMapping("/save")
    public ResponseEntity<Stream> saveStream(@RequestBody Stream requirements) {
        return new ResponseEntity<>(streamService.saveStream(requirements), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Stream> getStreamById(@PathVariable Long id) {
        return ResponseEntity.ok(streamService.getStreamById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List> getAllStreams() {
        return ResponseEntity.ok(streamService.getAllStreams());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRequirementById(@PathVariable Long id) {
        return ResponseEntity.ok(streamService.deleteStreamById(id));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteStream() {
        return ResponseEntity.ok(streamService.deleteAllStream());
    }

    @PutMapping("/{subjectId}/streams/{streamId}")
    public JSubject enrolledStreamToSubject(@PathVariable Long subjectId,
                                            @PathVariable Long streamId) {
        JSubject JSubject = JSubjectService.getSubjectById(subjectId);
        Stream stream = streamService.getStreamById(streamId);
        //subject.enrolledStream(stream);
        return JSubjectService.saveSubject(JSubject);
    }

}
