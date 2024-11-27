package edu.iesam.examaad1eval.features.ex1.data.local

import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import edu.iesam.examaad1eval.features.ex1.domain.Item
import edu.iesam.examaad1eval.features.ex1.domain.Services
import edu.iesam.examaad1eval.features.ex1.domain.User

class Ex1LocalDataSource(private val context: Context) {

    private val gson = Gson()

    private val sharedPreferences: SharedPreferences by lazy {
        context.getSharedPreferences("Ex1", Context.MODE_PRIVATE)
    }

    fun saveUsers(users: List<User>) {
        val user = gson.toJson(users)
        sharedPreferences.edit().putString("users", user).apply()
    }

    fun getUsers(): List<User> {
        return emptyList()
    }

    fun saveItems(items: List<Item>) {
        val item = gson.toJson(items)
        sharedPreferences.edit().putString("items", item).apply()
    }

    fun getItems(): List<Item> {
        return emptyList()
    }

    fun saveServices(services: List<Services>) {
        val service = gson.toJson(services)
        sharedPreferences.edit().putString("services", service).apply()
    }

    fun getServices(): List<Services> {
        return emptyList()
    }

}