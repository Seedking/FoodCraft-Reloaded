/*
 * FoodCraft Mod - Add more food to your Minecraft.
 * Copyright (C) 2017 Lasm Gratel
 *
 * This file is part of FoodCraft Mod.
 *
 * FoodCraft Mod is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FoodCraft Mod is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FoodCraft Mod.  If not, see <http://www.gnu.org/licenses/>.
 */

package cc.lasmgratel.foodcraftreloaded.common.util;

import cc.lasmgratel.foodcraftreloaded.api.util.NamedProperty;

import javax.annotation.Nonnull;
import java.util.Objects;

public abstract class AbstractNamedProperty implements NamedProperty {
    @Nonnull
    private String name;

    @Override
    @Nonnull
    public String getName() {
        return name;
    }

    public void setName(@Nonnull String name) {
        if (!name.toLowerCase().equals(name))
            throw new IllegalArgumentException("Name " + name + " cannot be upper case!");
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractNamedProperty)) return false;
        AbstractNamedProperty that = (AbstractNamedProperty) o;
        return Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName());
    }

    @Override
    public String toString() {
        return name;
    }
}
