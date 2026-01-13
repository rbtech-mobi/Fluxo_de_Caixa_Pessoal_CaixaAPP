package com.caixaapp.util

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Locale

object DateUtils {
    private val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    private val monthFormatter = DateTimeFormatter.ofPattern("MM/yyyy")
    private val chartFormatter = DateTimeFormatter.ofPattern("MMM/yy", Locale("pt", "BR"))

    fun formatDate(date: LocalDate): String {
        return date.format(formatter)
    }

    fun formatMonth(date: LocalDate): String {
        return date.format(monthFormatter)
    }

    fun formatChartDate(date: LocalDate): String {
        return date.format(chartFormatter)
    }
}
