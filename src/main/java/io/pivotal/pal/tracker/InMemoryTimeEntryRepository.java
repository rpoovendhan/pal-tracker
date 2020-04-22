package io.pivotal.pal.tracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    private Map<Long, TimeEntry> timeEntryData = new HashMap<>();

    Long id = 1L;

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        timeEntry.setId(id);
        timeEntryData.put(id, timeEntry);
        id++;
        return timeEntry;
    }

    @Override
    public TimeEntry find(Long timeEntryId) {
        return timeEntryData.get(timeEntryId);
    }

    @Override
    public TimeEntry update(Long timeEntryId, TimeEntry timeEntry) {
        if (timeEntryData.get(timeEntryId) == null) {
            return null;
        }
        timeEntry.setId(timeEntryId);
        timeEntryData.put(timeEntryId, timeEntry);
        return timeEntry;
    }

    @Override
    public void delete(Long timeEntryId) {
        timeEntryData.remove(timeEntryId);
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList(timeEntryData.values());
    }

}
