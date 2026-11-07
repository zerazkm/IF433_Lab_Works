package oop_133907_SebastianReinhart.week09

fun main() {

    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 15, 8.3, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 10, -12.5, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 3.5, "OPEN"),
        TradeLog("ETHUSDT", "SHORT", 5, 6.7, "OPEN")
    )

    val closedTrades = tradeHistory.filter {
        it.status == "CLOSED"
    }

    println("Closed Trades: $closedTrades")

    val winningTrades = closedTrades.filter {
        it.roe > 0
    }

    println("Winning Trades: $winningTrades")

    val losingTrades = closedTrades.filter {
        it.roe <= 0
    }

    println("Losing Trades: $losingTrades")

    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map {
            "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)"
        }

    println("\n=== TOP PERFORMERS ===")
    topPerformersString.forEach { println(it) }
}