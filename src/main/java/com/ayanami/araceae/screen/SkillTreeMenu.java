package com.ayanami.araceae.screen;

import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerData;
import net.minecraft.world.inventory.SimpleContainerData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;

public class SkillTreeMenu extends AbstractContainerMenu {
    private final Level level;
    private final ContainerData data;

    public SkillTreeMenu(int pContainerId, Inventory inv, FriendlyByteBuf extraData) {
        this(pContainerId, inv, inv.player.level().getBlockEntity(extraData.readBlockPos()), new SimpleContainerData(2));
    }

    public SkillTreeMenu(int pContainerId, Inventory inv, BlockEntity entity, ContainerData data) {
        super(ModMenuTypes.SKILL_TREE_MENU.get(), pContainerId);
        checkContainerSize(inv, 2);
        this.level = inv.player.level();
        this.data = data;


        addDataSlots(data);
    }

    public boolean isCrafting() { return data.get(0) > 0; }


}
