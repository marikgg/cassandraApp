package com.bryzgalov.guests.resource

import com.bryzgalov.guests.entity.Guest
import com.bryzgalov.guests.service.GuestService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/guests")
class GuestResource {

    @Autowired
    private lateinit var guestService: GuestService

    @GetMapping("/all")
    fun findAll() : List<Guest> {
        return guestService.findAll()
    }

    @GetMapping("/allBy")
    fun findAllByLastName(@RequestParam lastName: String) : List<Guest> {
        return guestService.findAllByLastName(lastName)
    }
}