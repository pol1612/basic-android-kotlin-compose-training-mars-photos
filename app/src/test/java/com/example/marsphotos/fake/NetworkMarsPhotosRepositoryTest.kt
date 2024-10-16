package com.example.marsphotos.fake

import com.example.marsphotos.data.NetworkMarsPhotosRepository
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class NetworkMarsPhotosRepositoryTest(){

    @Test
    fun networkMarsPhotosRepository_getMarsPhotos_verifyPhotosList() =
        runTest {
            val repository = NetworkMarsPhotosRepository(
                marsApiService = FakeMarsApiService()
            )
            val marsPhotosList = repository.getMarsPhotos()
            assertEquals(FakeDataSource.photosList, marsPhotosList)
        }


}