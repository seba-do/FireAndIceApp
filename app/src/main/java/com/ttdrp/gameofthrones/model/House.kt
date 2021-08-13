package com.ttdrp.gameofthrones.model

import com.ttdrp.gameofthrones.database.DatabaseHouse

data class House(
    val url: String,
    val name: String,
    val region: String,
    val coatOfArms: String,
    val words: String,
    val titles: List<String>,
    val seats: List<String>,
    val currentLord: String,
    val heir: String,
    val overlord: String,
    val founded: String,
    val founder: String,
    val diedOut: String,
    val ancestralWeapons: List<String>,
    val cadetBranches: List<String>,
    val swornMembers: List<String>
)

fun List<House>.asDatabaseModel(): List<DatabaseHouse> = map {
    DatabaseHouse(
        url = it.url,
        name = it.name,
        region = it.region,
        coatOfArms = it.coatOfArms,
        words = it.words,
        titles = it.titles,
        seats = it.seats,
        currentLord = it.currentLord,
        heir = it.heir,
        overlord = it.overlord,
        founded = it.founded,
        founder = it.founder,
        diedOut = it.diedOut,
        ancestralWeapons = it.ancestralWeapons,
        cadetBranches = it.cadetBranches,
        swornMembers = it.swornMembers
    )
}
