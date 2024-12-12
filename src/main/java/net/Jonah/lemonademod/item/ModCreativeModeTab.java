package net.Jonah.lemonademod.item;

import net.Jonah.lemonademod.Block.ModBlocks;
import net.Jonah.lemonademod.lemonademod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, lemonademod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> LEMONADE_MOD_TAB = CREATIVE_MODE_TABS.register("lemonade_mod_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.LEMONADE.get()))
                    .title(Component.translatable("creativetab.lemonademod.lemonade_mod_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.LEMONADE.get());
                        output.accept(ModItems.CITRINE.get());
                        output.accept(ModBlocks.CITRINE_BLOCK.get());
                        output.accept(ModBlocks.CITRINE_ORE.get());

                    }).build());



    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
