package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TimeEntryController {
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {

    }

    @PostMapping
    public ResponseEntity create(TimeEntry timeEntryToCreate) {
        return null;
    }

    @GetMapping
    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        return null;
    }

    @GetMapping
    public ResponseEntity<List<TimeEntry>> list() {
        return null;
    }

    @PutMapping
    public ResponseEntity update(long timeEntryId, TimeEntry expected) {
        return null;
    }

    @DeleteMapping
    public ResponseEntity<TimeEntry> delete(long timeEntryId) {
        return null;
    }
}
