// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.util.datafix.fixes;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.datafix.IFixableData;

public class ArmorStandSilent implements IFixableData
{
    @Override
    public int getFixVersion() {
        return 147;
    }
    
    @Override
    public NBTTagCompound fixTagCompound(final NBTTagCompound compound) {
        if ("ArmorStand".equals(compound.getString("id")) && compound.getBoolean("Silent") && !compound.getBoolean("Marker")) {
            compound.removeTag("Silent");
        }
        return compound;
    }
}
