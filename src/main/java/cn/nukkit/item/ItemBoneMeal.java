/*
 * https://PowerNukkit.org - The Nukkit you know but Powerful!
 * Copyright (C) 2020  José Roberto de Araújo Júnior
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package cn.nukkit.item;

import cn.nukkit.api.PowerNukkitOnly;
import cn.nukkit.api.Since;

/**
 * @author joserobjr
 * @since 2020-11-20
 */
@PowerNukkitOnly
@Since("1.3.2.0-PN")
public class ItemBoneMeal extends ItemDye {
    @PowerNukkitOnly
    @Since("1.3.2.0-PN")
    public ItemBoneMeal() {
        this(0, 1);
    }

    @PowerNukkitOnly
    @Since("1.3.2.0-PN")
    public ItemBoneMeal(Integer meta) {
        this(meta, 1);
    }

    @PowerNukkitOnly
    @Since("1.3.2.0-PN")
    public ItemBoneMeal(Integer meta, int count) {
        super(BONE_MEAL, meta, count, "Bone Meal");
    }

    @Since("1.3.2.0-PN")
    @PowerNukkitOnly
    @Override
    public boolean isFertilizer() {
        return true;
    }
}
