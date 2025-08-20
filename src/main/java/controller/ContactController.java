package controller;

import dto.ContactDTO;
import model.Contact;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.ContactService;

import java.util.List;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {

    @Autowired
    private ContactService contactService;

    // Dummy user for testing — replace with @AuthenticationPrincipal later
    private User dummyUser() {
        User user = new User();
        user.setId(1L); // Replace with actual logic
        user.setUsername("testuser");
        user.setEmail("test@example.com");
        return user;
    }

    @PostMapping
    public ResponseEntity<Contact> createContact(@RequestBody ContactDTO contactDTO) {
        Contact created = contactService.createContact(contactDTO, dummyUser());
        return ResponseEntity.ok(created);
    }

    @GetMapping("/test-db")
    public ResponseEntity<List<Contact>> testDatabaseConnection() {
        List<Contact> contacts = contactService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }
}