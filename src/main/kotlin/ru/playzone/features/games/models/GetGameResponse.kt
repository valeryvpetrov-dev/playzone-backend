package ru.playzone.features.games.models

import kotlinx.serialization.Serializable

@Serializable
data class GetGameResponse(
    val gameId: String,
    val title: String,
    val description: String,
    val version: String,
    val size: Double
)