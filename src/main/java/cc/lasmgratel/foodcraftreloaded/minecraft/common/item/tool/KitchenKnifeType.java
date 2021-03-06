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

package cc.lasmgratel.foodcraftreloaded.minecraft.common.item.tool;

import cc.lasmgratel.foodcraftreloaded.minecraft.client.util.GuiUtils;
import cc.lasmgratel.foodcraftreloaded.minecraft.client.util.masking.Colorable;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.awt.*;

public enum KitchenKnifeType implements Colorable {
    STONE(100, new ItemStack(Blocks.STONE)),
    IRON(300, new ItemStack(Items.IRON_INGOT)),
    GOLD(500, new ItemStack(Items.GOLD_INGOT)),
    DIAMOND(1000, new ItemStack(Items.DIAMOND)),
    EMERALD(1750, new ItemStack(Items.EMERALD));

    private int maxDamage;
    private ItemStack repairMaterial;

    KitchenKnifeType(int maxDamage, ItemStack repairMaterial) {
        this.maxDamage = maxDamage;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public Color getColor() {
        return GuiUtils.getAverageColorOfItem(getRepairItemStack()).orElse(Color.black);
    }

    @Override
    public void setColor(Color color) {
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    @Override
    public String toString() {
        return name().toLowerCase();
    }

    public ItemStack getRepairItemStack() {
        return repairMaterial;
    }
}
