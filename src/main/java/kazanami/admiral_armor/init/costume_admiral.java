package kazanami.admiral_armor.init;

import kazanami.admiral_armor.init.items.armor.ItemAdmiralHat;
import kazanami.admiral_armor.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class costume_admiral {

    public static Item ADMIRAL_HAT;

    public static void init(){
        //アイテムインスタンス登録
        ADMIRAL_HAT = registerItem(new ItemAdmiralHat(1, EntityEquipmentSlot.HEAD), "ItemadmiralHAT")
        .setUnlocalizedName("admiral_Hat");

    }

    //アイテム登録するメソッド先頭
    public static Item registerItem(Item item, String registryName) {
        return registerItem(item, registryName, null);
    }

    public static Item registerItem(Item item, String registryName, CreativeTabs tabs) {
        GameRegistry.register(item, new ResourceLocation(Reference.MOD_ID, registryName));
        return item;
    }
    //アイテム登録メソッド末尾
    public static void registerRenders() {
        //アイテムモデル登録
        registerRender(ADMIRAL_HAT);
    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
