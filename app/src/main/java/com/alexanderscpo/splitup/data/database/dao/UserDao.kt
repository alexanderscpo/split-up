package com.alexanderscpo.splitup.data.database.dao

class UserDao: BaseDao<UserDao> {
    override suspend fun getAll(): Collection<UserDao> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(entity: UserDao): Int {
        TODO("Not yet implemented")
    }

    override suspend fun update(entity: UserDao) {
        TODO("Not yet implemented")
    }

    override suspend fun insertAll(entities: Collection<UserDao>) {
        TODO("Not yet implemented")
    }

    override suspend fun insertAll(vararg entity: UserDao) {
        TODO("Not yet implemented")
    }

    override suspend fun insert(entity: UserDao): Long {
        TODO("Not yet implemented")
    }
}