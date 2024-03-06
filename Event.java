
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Event{
    private string eventID;
    private string eventName;
    private string eventVenre;
    private localDate eventDate;
    private ArrayList<srting>eventAttendees;

    public Event(string eventID,string eventName,string eventVenre){
         this.eventID = eventID;
         this.eventName = eventName;
         this.eventVenre = eventVenre;
         this.eventDate = eventDate;
         this.eventAttendees = new ArrayList<>()
    }

    public string getEventID(){
        return eventID;
    }

    public void setEventID(string eventID){
        this.eventID = eventID;
    }

    public string getEventName(){
        return eventName;
    }

    public void setEventName(string eventName){
        this.eventName = eventName;
    }

    public string getEventVenre(){
        return eventVenre;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public void setEventVenre(string eventVenre){
        this.eventVenre = eventVenre;
    }
    
    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }

    public ArrayList<String> getEventAttendees() {
        return eventAttendees;
    }

    public void setEventAttendees(ArrayList<String> eventAttendees) {
        this.eventAttendees = eventAttendees;
    }
 public void organizeEvent() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Event ID: ");
        eventID = scanner.nextLine();

        System.out.print("Enter Event Name: ");
        eventName = scanner.nextLine();

        System.out.print("Enter Event Venue: ");
        eventVenue = scanner.nextLine();

        System.out.print("Enter Event Date (yyyy-mm-dd): ");
        eventDate = LocalDate.parse(scanner.nextLine());

        System.out.print("Enter the number of attendees: ");
        int numAttendees = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numAttendees; i++) {
            System.out.print("Enter Attendee Name: ");
            String attendeeName = scanner.nextLine();
            eventAttendees.add(attendeeName);
        }

        System.out.println("Event organized successfully!");
    }

    public void addAttendee(String attendeeName) {
        eventAttendees.add(attendeeName);
    }

    public void removeAttendee(String attendeeName) {
        eventAttendees.remove(attendeeName);
    }

    public void updateAttendee(int index, String attendeeName) {
        eventAttendees.set(index, attendeeName);
    }

    public String findAttendee(String attendeeName) {
        if (eventAttendees.contains(attendeeName)) {
            return "Attendee found!";
        } else {
            return "Attendee not found!";
        }
    }

    public int getTotalAttendees() {
        return eventAttendees.size();
    }

   
