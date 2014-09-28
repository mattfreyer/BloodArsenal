package com.arc.bloodarsenal;

import WayofTime.alchemicalWizardry.api.altarRecipeRegistry.AltarRecipeRegistry;
import WayofTime.alchemicalWizardry.api.bindingRegistry.BindingRegistry;
import WayofTime.alchemicalWizardry.api.items.ShapedBloodOrbRecipe;
import com.arc.bloodarsenal.block.ModBlocks;
import com.arc.bloodarsenal.item.ModItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class BloodArsenalRecipes
{
    public static void registerAltarRecipes()
    {
        AltarRecipeRegistry.registerAltarRecipe(new ItemStack(ModBlocks.blood_tnt), new ItemStack(Blocks.tnt), 3, 3000, 5, 5, false);
        AltarRecipeRegistry.registerAltarRecipe(new ItemStack(ModBlocks.blood_infused_wood), new ItemStack(Blocks.log), 2, 2000, 5, 5, false);
        AltarRecipeRegistry.registerAltarRecipe(new ItemStack(ModBlocks.blood_infused_iron_block), new ItemStack(Blocks.iron_block), 2, 40000, 5, 5, false);
        AltarRecipeRegistry.registerAltarRecipe(new ItemStack(ModItems.blood_infused_iron), new ItemStack(Items.iron_ingot), 2, 5000, 5, 5, false);
        AltarRecipeRegistry.registerAltarRecipe(new ItemStack(ModItems.blood_orange), new ItemStack(Items.dye, 1, 14), 1, 200, 5, 5, false);
        AltarRecipeRegistry.registerAltarRecipe(new ItemStack(ModItems.blood_infused_diamond_active), new ItemStack(ModItems.blood_infused_diamond_unactive), 4, 50000, 5, 5, false);
    }

    public static void registerBindingRecipes()
    {
        BindingRegistry.registerRecipe(new ItemStack(ModItems.bound_bow), new ItemStack(Items.bow));
        BindingRegistry.registerRecipe(new ItemStack(ModItems.bound_sickle), new ItemStack(Items.diamond_hoe));
        BindingRegistry.registerRecipe(new ItemStack(ModItems.bound_shears), new ItemStack(Items.shears));
        BindingRegistry.registerRecipe(new ItemStack(ModItems.blood_infused_diamond_bound), new ItemStack(ModItems.blood_infused_diamond_active));
    }

    public static void registerOrbRecipes()
    {
        int craftingConstant = OreDictionary.WILDCARD_VALUE;

        ItemStack blankSlate = new ItemStack(WayofTime.alchemicalWizardry.ModItems.blankSlate);
        ItemStack reinforcedSlate = new ItemStack(WayofTime.alchemicalWizardry.ModItems.reinforcedSlate);
        ItemStack imbuedSlate = new ItemStack(WayofTime.alchemicalWizardry.ModItems.imbuedSlate);
        ItemStack demonicSlate = new ItemStack(WayofTime.alchemicalWizardry.ModItems.demonicSlate);
        ItemStack weakOrb = new ItemStack(WayofTime.alchemicalWizardry.ModItems.weakBloodOrb, 1, craftingConstant);
        ItemStack apprenticeOrb = new ItemStack(WayofTime.alchemicalWizardry.ModItems.apprenticeBloodOrb, 1, craftingConstant);
        ItemStack magicianOrb = new ItemStack(WayofTime.alchemicalWizardry.ModItems.magicianBloodOrb, 1, craftingConstant);
        ItemStack masterOrb = new ItemStack(WayofTime.alchemicalWizardry.ModItems.masterBloodOrb, 1, craftingConstant);

        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_stone, 4), "aba", "bcb", "aba", 'a', Blocks.stone, 'b', blankSlate, 'c', weakOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_stone, 4, 1), "aba", "bcb", "aba", 'a', Blocks.stone, 'b', reinforcedSlate, 'c', apprenticeOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_stone, 4, 2), "aba", "bcb", "aba", 'a', Blocks.stone, 'b', imbuedSlate, 'c', magicianOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_stone, 4, 3), "aba", "bcb", "aba", 'a', Blocks.stone, 'b', demonicSlate, 'c', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_stained_ice, 8), "aaa", "aba", "aaa", 'a', Blocks.ice, 'b', apprenticeOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_stained_glass, 8), "aaa", "aba", "aaa", 'a', Blocks.glass, 'b', apprenticeOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModBlocks.blood_infused_iron_block), "aaa", "aba", "aaa", 'a', ModItems.blood_infused_iron, 'b', apprenticeOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_axe_iron), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_iron, 'b', ModItems.blood_infused_axe_wood, 'c', ModItems.amorphic_catalyst, 'd', magicianOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_pickaxe_iron), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_iron, 'b', ModItems.blood_infused_pickaxe_wood, 'c', ModItems.amorphic_catalyst, 'd', magicianOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_shovel_iron), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_iron, 'b', ModItems.blood_infused_shovel_wood, 'c', ModItems.amorphic_catalyst, 'd', magicianOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_sword_iron), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_iron, 'b', ModItems.blood_infused_sword_wood, 'c', ModItems.amorphic_catalyst, 'd', magicianOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_sickle_iron), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_iron, 'b', ModItems.blood_infused_sickle_wood, 'c', ModItems.amorphic_catalyst, 'd', magicianOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_diamond), "aba", "bcb", "aba", 'a', Blocks.glass, 'b', Items.diamond, 'c', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_diamond_unactive), "aba", "bcb", "ada", 'a', ModItems.amorphic_catalyst, 'b', ModBlocks.blood_infused_iron_block, 'c', ModItems.blood_diamond, 'd', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_axe_diamond), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_diamond_bound, 'b', ModItems.blood_infused_axe_iron, 'c', ModItems.amorphic_catalyst, 'd', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_pickaxe_diamond), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_diamond_bound, 'b', ModItems.blood_infused_pickaxe_iron, 'c', ModItems.amorphic_catalyst, 'd', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_shovel_diamond), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_diamond_bound, 'b', ModItems.blood_infused_shovel_iron, 'c', ModItems.amorphic_catalyst, 'd', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_sword_diamond), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_diamond_bound, 'b', ModItems.blood_infused_sword_iron, 'c', ModItems.amorphic_catalyst, 'd', masterOrb));
        GameRegistry.addRecipe(new ShapedBloodOrbRecipe(new ItemStack(ModItems.blood_infused_sickle_diamond), "aaa", "aba", "cdc", 'a', ModItems.blood_infused_diamond_bound, 'b', ModItems.blood_infused_sickle_iron, 'c', ModItems.amorphic_catalyst, 'd', masterOrb));
    }

    public static void registerRecipes()
    {
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blood_stained_ice_packed), "aa", "aa", 'a', ModBlocks.blood_stained_ice);
        GameRegistry.addRecipe(new ItemStack(ModBlocks.blood_door_wood), "aa", "aa", "aa", 'a', ModBlocks.blood_infused_planks);
        GameRegistry.addRecipe(new ItemStack(ModItems.blood_infused_stick), "a", "a", 'a', ModBlocks.blood_infused_planks);
        GameRegistry.addRecipe(new ItemStack(ModItems.blood_infused_pickaxe_wood), "aaa", " b ", " b ", 'a', ModBlocks.blood_infused_planks, 'b', ModItems.blood_infused_stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.blood_infused_axe_wood), "aa ", "ab ", " b ", 'a', ModBlocks.blood_infused_planks, 'b', ModItems.blood_infused_stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.blood_infused_shovel_wood), " a ", " b ", " b ", 'a', ModBlocks.blood_infused_planks, 'b', ModItems.blood_infused_stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.blood_infused_sword_wood), " a ", " a ", " b ", 'a', ModBlocks.blood_infused_planks, 'b', ModItems.blood_infused_stick);
        GameRegistry.addRecipe(new ItemStack(ModItems.blood_infused_sickle_wood), " aa", "  a", "baa", 'a', ModBlocks.blood_infused_planks, 'b', ModItems.blood_infused_stick);

        GameRegistry.addShapelessRecipe(new ItemStack(ModBlocks.blood_infused_planks, 4), ModBlocks.blood_infused_wood);
        //This is a long one
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.amorphic_catalyst), WayofTime.alchemicalWizardry.ModItems.blankSlate, WayofTime.alchemicalWizardry.ModItems.aether, WayofTime.alchemicalWizardry.ModItems.terrae, WayofTime.alchemicalWizardry.ModItems.crystallos, WayofTime.alchemicalWizardry.ModItems.sanctus, WayofTime.alchemicalWizardry.ModItems.magicales, WayofTime.alchemicalWizardry.ModItems.crepitous, WayofTime.alchemicalWizardry.ModItems.incendium, WayofTime.alchemicalWizardry.ModItems.aquasalus);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.blood_infused_iron, 8), ModBlocks.blood_infused_iron_block);
    }
}