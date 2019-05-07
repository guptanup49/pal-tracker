package io.pivotal.pal.tracker;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Repository
public class InMemoryTimeEntryRepository implements TimeEntryRepository {
    private long counter = 0;

    private HashMap<Long, TimeEntry> TIME_ENTRY_MAP = new HashMap();

    public TimeEntry create(TimeEntry timeEntry) {
        if (timeEntry != null && timeEntry.getId() == 0)
        {
            timeEntry.setId(++counter);
        }
        TIME_ENTRY_MAP.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return TIME_ENTRY_MAP.get(id);
    }

    public List<TimeEntry> list() {
        return (new ArrayList<TimeEntry> (TIME_ENTRY_MAP.values()));
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        if (TIME_ENTRY_MAP.containsKey(id)) {
            TIME_ENTRY_MAP.replace(id, timeEntry);
        return timeEntry;
        } else

        {
            return null;
        }

    }

    public void delete(long id) {
        TIME_ENTRY_MAP.remove(id);

    }
}
