package kazanami.admiral_armor.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Admiral_armorTabs {
    public static final CreativeTabs tabAdmiralArmor = new CreativeTabs("tabAdmiralArmor") {
        @Override
        public Item getTabIconItem() {
            return Items.APPLE;
        }
    };
}
