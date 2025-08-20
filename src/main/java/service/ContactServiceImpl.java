package service;

import dto.ContactDTO;
import model.Contact;
import model.User;
import repository.ContactRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    public Contact createContact(ContactDTO contactDTO, User user) {
        Contact contact = new Contact();
        contact.setName(contactDTO.getName());
        contact.setEmail(contactDTO.getEmail());
        contact.setPhone(contactDTO.getPhone());
        contact.setAddress(contactDTO.getAddress());
        contact.setUser(user);
        return contactRepository.save(contact);
    }

    @Override
    public List<Contact> getContactsByUser(User user) {
        return contactRepository.findByUser(user);
    }

    // 👇 Implement the new method
    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }
}