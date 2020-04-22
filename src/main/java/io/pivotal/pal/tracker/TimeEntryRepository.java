package io.pivotal.pal.tracker;

import java.util.List;

public interface TimeEntryRepository {

    public List<TimeEntry> list();

    public TimeEntry create(TimeEntry timeEntry);

    public TimeEntry find(Long timeEntryId);

    public TimeEntry update(Long timeEntryId, TimeEntry timeEntry);

    public void delete(Long timeEntryId);

}
