// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.nbt;

import java.io.DataInput;
import java.io.IOException;
import java.io.DataOutput;

public class NBTTagInt extends NBTPrimitive
{
    private int data;
    
    NBTTagInt() {
    }
    
    public NBTTagInt(final int data) {
        this.data = data;
    }
    
    @Override
    void write(final DataOutput output) throws IOException {
        output.writeInt(this.data);
    }
    
    @Override
    void read(final DataInput input, final int depth, final NBTSizeTracker sizeTracker) throws IOException {
        sizeTracker.read(96L);
        this.data = input.readInt();
    }
    
    @Override
    public byte getId() {
        return 3;
    }
    
    @Override
    public String toString() {
        return String.valueOf(this.data);
    }
    
    @Override
    public NBTTagInt copy() {
        return new NBTTagInt(this.data);
    }
    
    @Override
    public boolean equals(final Object p_equals_1_) {
        return super.equals(p_equals_1_) && this.data == ((NBTTagInt)p_equals_1_).data;
    }
    
    @Override
    public int hashCode() {
        return super.hashCode() ^ this.data;
    }
    
    @Override
    public long getLong() {
        return this.data;
    }
    
    @Override
    public int getInt() {
        return this.data;
    }
    
    @Override
    public short getShort() {
        return (short)(this.data & 0xFFFF);
    }
    
    @Override
    public byte getByte() {
        return (byte)(this.data & 0xFF);
    }
    
    @Override
    public double getDouble() {
        return this.data;
    }
    
    @Override
    public float getFloat() {
        return (float)this.data;
    }
}
