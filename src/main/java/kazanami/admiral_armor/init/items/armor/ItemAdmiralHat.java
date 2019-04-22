package kazanami.admiral_armor.init.items.armor;

import kazanami.admiral_armor.init.Admiral_armorTabs;
import kazanami.admiral_armor.init.Armor_Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class ItemAdmiralHat extends ItemArmor {
    public ItemAdmiralHat(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn){
        super(Armor_Material.ADMIRAL_HAT, renderIndexIn, equipmentSlotIn);
        this.setCreativeTab(Admiral_armorTabs.tabAdmiralArmor);
    }
}
