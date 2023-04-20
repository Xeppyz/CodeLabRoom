package com.example.android.roomwordssample.DB

import androidx.annotation.WorkerThread
import com.example.android.roomwordssample.DAO.WordDao
import com.example.android.roomwordssample.Word
import kotlinx.coroutines.flow.Flow


class WordRepository(private val wordDao: WordDao) {
    val allWords: Flow<List<Word>> = wordDao.getAlphabetizedWords()

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    suspend fun insert(word: Word) {
        wordDao.insert(word)
    }
}
