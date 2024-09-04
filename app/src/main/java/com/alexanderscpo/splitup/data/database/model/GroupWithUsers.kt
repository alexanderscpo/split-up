package com.alexanderscpo.splitup.data.database.model

import androidx.room.Embedded
import androidx.room.Relation

data class GroupWithUsers(
    @Embedded val group: Group,
    @Relation(
        parentColumn = "groupId",
        entityColumn = "userId"
    )
    val users: List<User>
)
