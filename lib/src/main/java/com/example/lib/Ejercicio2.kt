package com.example.lib

// EJERCICIO 2: Condicionales (if / else)
// ========================================
// Dada una lista de calificaciones, clasifica cada una e imprime su nivel:
//   - Reprobado (0-59)
//   - Suficiente (60-69)
//   - Bien (70-79)
//   - Notable (80-89)
//   - Excelente (90-100)
//
// Salida esperada:
// 45 -> Reprobado
// 72 -> Bien
// 91 -> Excelente
// 60 -> Suficiente
// 85 -> Notable

fun main() {
    val calificaciones = listOf(45, 72, 91, 60, 85)

    for (cal in calificaciones) {
        val nivel = if (cal in 0..59) {
            "Reprobado"
        } else if (cal in 60 .. 69) {
            "Suficiente"
        } else if (cal in 70 .. 79) {
            "Bien"
        } else if (cal in 80 ..89 ) {
            "Notable"
        } else if (cal in 90 .. 100){
            "Excelente"
        }
    else {
            "Ingrese un número valido"
        }
        println("$cal -> $nivel")
    }
}