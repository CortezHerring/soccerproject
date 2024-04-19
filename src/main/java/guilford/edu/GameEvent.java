package guilford.edu;

import java.time.LocalDateTime;

public class GameEvent {
      // Private fields to store event description and timestamp
      private String description;
      private LocalDateTime timestamp;
  
      // Constructor to create a new GameEvent with a description
      public GameEvent(String description) {
          this.description = description;
          this.timestamp = LocalDateTime.now(); // Timestamp is set to the current date and time
      }
  
      // Getter method to retrieve the event description
      public String getDescription() {
          return description;
      }
  
      public LocalDateTime getTimestamp() {
          return timestamp;
      }
  
      @Override
      public String toString() {
          return "[" + timestamp.toString() + "] " + description;
      }
  }