package kazanami.admiral_armor.init.items.armor;


import kazanami.admiral_armor.init.Admiral_armorTabs;
import kazanami.admiral_armor.init.Armor_Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class Item_DepthadmiralHAT extends ItemArmor {
    public Item_DepthadmiralHAT(int renderIndexIn, EntityEquipmentSlot equipmentSlotIn){
        super(Armor_Material.ADMIRAL_HAT, renderIndexIn, equipmentSlotIn);
        this.setCreativeTab(Admiral_armorTabs.tabAdmiralArmor);
    }
}
