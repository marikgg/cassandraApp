package com.bryzgalov.guests.entity

import org.springframework.data.cassandra.core.cql.PrimaryKeyType
import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn
import java.io.Serializable
import java.util.*

@PrimaryKeyClass
data class GuestPrimaryKey(
    @PrimaryKeyColumn
    var id: UUID = UUID.randomUUID(),
    @PrimaryKeyColumn(name = "last_name",type = PrimaryKeyType.PARTITIONED)
    var lastName: String? = null
) : Serializable
