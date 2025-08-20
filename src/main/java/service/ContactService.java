package service;

import dto.ContactDTO;
import model.Contact;
import model.User;

import java.util.List;

public interface ContactService {
    Contact createContact(ContactDTO contactDTO, User user);
    List<Contact> getContactsByUser(User user);

    // 👇 Add this line
    List<Contact> getAllContacts();
}