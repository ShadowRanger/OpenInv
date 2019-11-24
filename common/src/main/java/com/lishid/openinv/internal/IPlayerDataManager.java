/*
 * Copyright (C) 2011-2019 lishid. All rights reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, version 3.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.lishid.openinv.internal;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.bukkit.inventory.InventoryView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface IPlayerDataManager {

    /**
     * Loads a Player for an OfflinePlayer.
     * </p>
     * This method is potentially blocking, and should not be called on the main thread.
     *
     * @param offline the OfflinePlayer
     * @return the Player loaded
     */
    @Nullable Player loadPlayer(@NotNull OfflinePlayer offline);

    /**
     * Opens an ISpecialInventory for a Player.
     *
     * @param player the Player opening the ISpecialInventory
     * @param inventory the Inventory
     *`
     * @return the InventoryView opened
     */
    InventoryView openInventory(@NotNull Player player, @NotNull ISpecialInventory inventory);

}
