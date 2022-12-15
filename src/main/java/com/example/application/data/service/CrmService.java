package com.example.application.data.service;

import com.example.application.data.entity.Contact;
import com.example.application.data.repository.CompanyRepository;
import com.example.application.data.repository.ContactRepository;
import com.example.application.data.repository.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrmService {

    private final ContactRepository contactRepository;
    private final CompanyRepository companyRepository;
    private final StatusRepository statusRepository;

    public CrmService(ContactRepository contactRepository,
                      CompanyRepository companyRepository,
                      StatusRepository statusRepository) {
        this.contactRepository = contactRepository;
        this.companyRepository = companyRepository;
        this.statusRepository = statusRepository;
    }

    public List<Contact> findAllContacts(String stringFilter){
        if(stringFilter == null || stringFilter.isEmpty()) {
            return contactRepository.findAll();
        }
//        else {
//            return contactRepository.search(stringFilter);
//        }
        return null; // continue here
    }

}
