import java.util.ArrayList;
import java.util.List;

public class Event {
    private String eventID;
    private String eventName;
    private String eventVenue;
    private String eventDate;
    private List<String> attendees;

    // Constructor
    public Event(String eventID, String eventName, String eventVenue, String eventDate) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.eventVenue = eventVenue;
        this.eventDate = eventDate;
        this.attendees = new ArrayList<>();
    }

    // Getter and Setter methods
    public String getEventID() {
        return eventID;
    }

    public void setEventID(String eventID) {
        this.eventID = eventID;
    }

    public String getEventName() {
        return eventName;
    }
    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventVenue() {
        return eventVenue;
    }

    public void setEventVenue(String eventVenue) {
        this.eventVenue = eventVenue;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public List<String> getAttendees() {
        return attendees;
    }

    // Method to add an attendee
    public void addAttendee(String attendeeName) {
        attendees.add(attendeeName);
    }

    // Method to remove an attendee
    public void removeAttendee(String attendeeName) {
        attendees.remove(attendeeName);
    }

    // Method to display total attendees
    public void displayTotalAttendees() {
        System.out.println("Total attendees: " + attendees.size());
    }

    // Override toString() method for custom output
    @Override
    public String toString() {
        return "Event ID: " + eventID +
                "\nEvent Name: " + eventName +
                "\nVenue: " + eventVenue +
                "\nDate: " + eventDate +
                "\nAttendees: " + attendees;
    }
}
