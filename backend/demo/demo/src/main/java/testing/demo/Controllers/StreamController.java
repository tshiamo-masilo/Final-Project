package testing.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
<<<<<<< HEAD
import testing.demo.Services.StreamService;
import testing.demo.Services.SubjectService;
import testing.demo.model.Stream;
import testing.demo.model.Subject;

=======

import testing.demo.entities.Stream;
import testing.demo.services.StreamService;

>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
import java.util.List;

@RestController
@RequestMapping("/stream")
public class StreamController {
    @Autowired
<<<<<<< HEAD
    private StreamService streamService;
    @Autowired
    private SubjectService subjectService;
    @PostMapping("/save")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<Stream> saveStream(@RequestBody Stream requirements) {
        return new ResponseEntity<>(streamService.saveStream(requirements), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<Stream> getStreamById(@PathVariable Long id) {
        return ResponseEntity.ok(streamService.getStreamById(id));
    }

    @GetMapping("/getAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<List> getAllStreams() {
        return ResponseEntity.ok(streamService.getAllStreams());
    }

    @DeleteMapping("/delete/{id}")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<String> deleteRequirementById(@PathVariable Long id) {
        return ResponseEntity.ok(streamService.deleteStreamById(id));
    }

    @DeleteMapping("/deleteAll")
    @CrossOrigin(origins = "http://localhost:4200/",allowedHeaders = "*")
    public ResponseEntity<String> deleteStream() {
        return ResponseEntity.ok(streamService.deleteAllStream());
    }

    @PutMapping("/{subjectId}/streams/{streamId}")
    public Subject enrolledStreamToSubject(@PathVariable Long subjectId, @PathVariable Long streamId){
        Subject subject = subjectService.getSubjectById(subjectId);
        Stream stream = streamService.getStreamById(streamId);
        subject.enrolledStream(stream);
        return subjectService.saveSubject(subject);
=======
    private StreamService repository;
    
    @PostMapping("/save")
    public ResponseEntity<Stream> saveStream(Stream requirements) {
        return new ResponseEntity<>(repository.saveStream(requirements), HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Stream> getStreamById(@PathVariable int id) {
        return ResponseEntity.ok(repository.getStreamById(id));
    }

    @GetMapping("/getAll")
    public ResponseEntity<List> getUser() {
        return ResponseEntity.ok(repository.getAllStreams());
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRequirementById(@PathVariable int id) {
        return ResponseEntity.ok(repository.deleteStreamById(id));
    }

    @DeleteMapping("/deleteAll")
    public ResponseEntity<String> deleteStream() {
        return ResponseEntity.ok(repository.deleteAllStream());
    }

    @PutMapping("/update")
    public ResponseEntity<Stream> updateRequirement(@RequestBody Stream requirements) {
        return ResponseEntity.ok(repository.updateStream(requirements));
>>>>>>> db9abb4a47de7be7c0cc363c5cf5ab39f622ccc7
    }

}
