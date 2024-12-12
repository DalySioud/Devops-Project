package tn.esprit.eventsproject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tn.esprit.eventsproject.entities.Event;

import java.time.LocalDate;

public class EventTest {

    @Test
    public void testEventCreation() {
        // Create an Event object
        Event event = new Event();
        event.setDescription("Test Event");
        event.setDateDebut(LocalDate.now());
        event.setDateFin(LocalDate.now().plusDays(2));
        event.setCout(100.0f);

        // Assert properties are set correctly
        Assertions.assertEquals("Test Event", event.getDescription());
        Assertions.assertEquals(LocalDate.now(), event.getDateDebut());
        Assertions.assertEquals(LocalDate.now().plusDays(2), event.getDateFin());
        Assertions.assertEquals(100.0f, event.getCout());
    }

    @Test
    public void testEmptyEvent() {
        // Create an empty Event object
        Event event = new Event();

        // Assert default values (if applicable) or null values
        Assertions.assertNull(event.getDescription());
        Assertions.assertNull(event.getDateDebut());
        Assertions.assertNull(event.getDateFin());
        Assertions.assertEquals(0.0f, event.getCout());
    }

    // You can add more tests here to cover other functionalities of the Event class
    // For example: testing adding participants, logistics, etc. (depending on implementation)
}