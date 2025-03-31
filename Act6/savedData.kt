package robb.stark.holamundo2.Act6

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.map

class savedData(private val context:Context) {

    companion object{
        val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name="settings")
        val EDAD = intPreferencesKey("edad")
        val NOMBRE = stringPreferencesKey("nombre")
        val ALTURA = floatPreferencesKey("altura")  // Cambiado a "altura"
        val MONEDERO = floatPreferencesKey("monedero")  // Cambiado a "monedero"
        val SIGNUP = booleanPreferencesKey("registrado")
    }

    val nombre: Flow<String> = context.dataStore.data.map { preferences ->
        preferences[NOMBRE] ?: ""
    }
    val edad: Flow<Int> = context.dataStore.data.map { preferences ->
        preferences[EDAD] ?: 0
    }
    val altura: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[ALTURA] ?: 0.00f
    }
    val monedero: Flow<Float> = context.dataStore.data.map { preferences ->
        preferences[MONEDERO] ?: 0.00f
    }



    suspend fun getAge():Int{
        val pref = context.dataStore.data.first()
        return pref[EDAD] ?: 0
    }

    suspend fun savePersonData(personName: String, personAge: Int, personAltura: Float, personMonedero: Float) {
        context.dataStore.edit { settings ->
            settings[EDAD] = personAge
            settings[NOMBRE] = personName
            settings[ALTURA] = personAltura
            settings[MONEDERO] = personMonedero
        }
        println("Datos guardados: $personName, $personAge, $personAltura, $personMonedero")
    }


    suspend fun clearPersonData(){
        context.dataStore.edit { settings ->
            //settings[AGE] = personAge
            //settings[NAME] = personName
        }
    }
}

