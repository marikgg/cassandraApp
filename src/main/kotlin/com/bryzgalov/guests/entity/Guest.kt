package com.bryzgalov.guests.entity

import org.springframework.data.cassandra.core.mapping.CassandraType
import org.springframework.data.cassandra.core.mapping.Column
import org.springframework.data.cassandra.core.mapping.PrimaryKey
import org.springframework.data.cassandra.core.mapping.Table
import java.util.*

@Table("guests")
data class Guest (
    @PrimaryKey
    var pk: GuestPrimaryKey? = null,
    @Column("first_name")
    var firstName: String? = null,
    var emails: Set<String>? = setOf(),
    @Column("phone_numbers")
    var phoneNumbers: List<String>? = listOf()
)