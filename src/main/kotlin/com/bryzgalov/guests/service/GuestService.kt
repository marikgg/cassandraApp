package com.bryzgalov.guests.service

import com.bryzgalov.guests.entity.Guest
import com.bryzgalov.guests.repo.GuestRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GuestService {
    @Autowired
    private lateinit var guestRepository: GuestRepository


    fun findAll() : List<Guest> {
        return guestRepository.findAll()
    }

    fun findAllByLastName(lastName: String) : List<Guest> {
        return guestRepository.findByPkLastName(lastName)
    }
}