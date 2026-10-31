package oop_133907_SebastianReinhart.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Monster muncul: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Loot ditemukan: ${event.item.name}")
            println("Rarity: ${event.item.rarity}")
        }

        is BattleState.GameOver -> {
            println("Game Over: ${event.reason}")
        }

        BattleState.SafeZone -> {
            println("Pemain berada di Safe Zone.")
        }
    }
}