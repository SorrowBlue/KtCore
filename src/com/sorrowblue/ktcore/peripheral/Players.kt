package com.sorrowblue.ktcore.peripheral

import com.sorrowblue.ktcore.core.Entity
import com.sorrowblue.ktcore.core.ModAPI
import com.sorrowblue.ktcore.core.Player

class Players {

	companion object {
		fun getHealth() = Entity.getHealth(Player.get())
	}
}


