package dev.the456gamer.ccnoborder;

import dan200.computercraft.shared.util.Colour;
import dan200.computercraft.shared.util.Palette;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;
import org.jetbrains.annotations.NotNull;

public class CustomPalette extends Palette {

  double[] BLACK = {0, 0, 0};
  byte[] BYTE_BLACK = {0, 0, 0, (byte) 255};

  public CustomPalette() {
    super(false);
  }

  @Override
  public void resetColour(int i) {
  }

  @Override
  public void resetColours() {
  }

  @Override
  public void write(FriendlyByteBuf buffer) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void read(FriendlyByteBuf buffer) {
    throw new UnsupportedOperationException();
  }

  @Override
  public CompoundTag writeToNBT(CompoundTag nbt) {
    throw new UnsupportedOperationException();
  }

  @Override
  public void readFromNBT(CompoundTag nbt) {
    throw new UnsupportedOperationException();
  }

  @Override
  public byte @NotNull [] getRenderColours(int i) {
    return BYTE_BLACK;
  }

  @Override
  public void setColour(int i, Colour colour) {
  }

  @Override
  public void setColour(int i, double r, double g, double b) {
  }

  @Override
  public double[] getColour(int i) {
    return BLACK;
  }
}
