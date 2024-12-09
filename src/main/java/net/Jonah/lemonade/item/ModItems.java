package net.Jonah.lemonade.item;

import net.Jonah.lemonade.lemonadeMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS,lemonadeMod.MOD_ID);

    public static final RegistryObject<Item> LEMONADE = ITEMS.register("lemonade",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {

    }




}
