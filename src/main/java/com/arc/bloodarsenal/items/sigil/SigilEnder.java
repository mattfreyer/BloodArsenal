package com.arc.bloodarsenal.items.sigil;

import WayofTime.alchemicalWizardry.api.items.interfaces.IBindable;
import WayofTime.alchemicalWizardry.common.items.EnergyItems;
import com.arc.bloodarsenal.BloodArsenal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

import java.util.List;

public class SigilEnder extends EnergyItems implements IBindable
{
    public SigilEnder()
    {
        super();
        setMaxStackSize(1);
        setUnlocalizedName("sigil_of_ender");
        setTextureName("BloodArsenal:sigil_of_ender");
        setCreativeTab(BloodArsenal.BA_TAB);
    }

    @Override
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add(StatCollector.translateToLocal("tooltip.sigil.ender1"));
        par3List.add(StatCollector.translateToLocal("tooltip.sigil.ender2"));

        if (!(par1ItemStack.stackTagCompound == null))
        {
            par3List.add("Current owner: " + par1ItemStack.stackTagCompound.getString("ownerName"));
        }
    }

    @Override
    public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player)
    {
        EnergyItems.checkAndSetItemOwner(itemStack, player);

        if (itemStack.stackTagCompound == null)
        {
            itemStack.setTagCompound(new NBTTagCompound());
        }

        if (player.isSneaking() && !player.isSwingInProgress)
        {
            MovingObjectPosition mop = EnderSigilUtils.getTargetBlock(world, (player.prevPosX + (player.posX - player.prevPosX)),
                    (player.prevPosY + (player.posY - player.prevPosY) + 1.62 - player.yOffset),
                    (player.prevPosZ + (player.posZ - player.prevPosZ)),
                    (player.prevRotationYaw + (player.rotationYaw - player.prevRotationYaw)),
                    (player.prevRotationPitch + (player.rotationPitch - player.prevRotationPitch)), false, 128.0);

            if (mop != null && mop.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK && mop.sideHit != -1)
            {
                double ex = mop.hitVec.xCoord;
                double wy = mop.hitVec.yCoord;
                double zee = mop.hitVec.zCoord;

                switch (mop.sideHit)
                {
                    case 0:
                        wy -= 2.0;
                        break;
                    case 1:
                        break;
                    case 2:
                        zee -= 0.5;
                        break;
                    case 3:
                        zee += 0.5;
                        break;
                    case 4:
                        ex -= 0.5;
                        break;
                    case 5:
                        ex += 0.5;
                        break;
                }

                world.playSoundAtEntity(player, "mob.endermen.portal", 1F, 1F);

                for (int k = 0; k < 8; ++k)
                {
                    world.spawnParticle("portal", player.posX + (world.rand.nextDouble() - 0.5D) * (double)player.width, player.posY + world.rand.nextDouble() * (double)player.height - 0.25D, player.posZ + (world.rand.nextDouble() - 0.5D) * (double)player.width, 0, 0, 0);
                }

                player.setPositionAndUpdate(ex, wy, zee);
                EnergyItems.syphonBatteries(itemStack, player, 2000);

                player.swingItem();
            }
        }
        else if (!player.isSneaking())
        {
            player.displayGUIChest(player.getInventoryEnderChest());
            world.playSoundAtEntity(player, "mob.endermen.portal", 1F, 1F);
            EnergyItems.syphonBatteries(itemStack, player, 200);
        }

        return itemStack;
    }
}