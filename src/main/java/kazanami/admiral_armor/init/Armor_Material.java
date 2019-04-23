package kazanami.admiral_armor.init;

import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

public class Armor_Material {
    public static ItemArmor.ArmorMaterial ADMIRAL_HAT = EnumHelper
            .addArmorMaterial("Admiral HAT","admiralarmor:admiral_hat", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

    public static ItemArmor.ArmorMaterial DEPTH_ADMIRAL_HAT = EnumHelper
            .addArmorMaterial("Depth Admiral Hat","admiralarmor:depth_admiral_hat", 17, new int[] { 2, 6, 7, 2 }, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0);

}

