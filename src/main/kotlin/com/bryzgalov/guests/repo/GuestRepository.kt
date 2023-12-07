package com.bryzgalov.guests.repo

import com.bryzgalov.guests.entity.Guest
import org.springframework.data.cassandra.repository.CassandraRepository
import org.springframework.data.cassandra.repository.Query
import java.util.UUID

interface GuestRepository: CassandraRepository<Guest, UUID> {

    fun findByPkLastName(lastName: String) : List<Guest>
}