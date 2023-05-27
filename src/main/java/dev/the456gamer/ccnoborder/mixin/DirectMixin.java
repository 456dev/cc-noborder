package dev.the456gamer.ccnoborder.mixin;


import dan200.computercraft.client.render.text.DirectFixedWidthFontRenderer;
import dan200.computercraft.shared.util.Palette;
import dev.the456gamer.ccnoborder.CustomPalette;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@org.spongepowered.asm.mixin.Mixin(DirectFixedWidthFontRenderer.class)
public class DirectMixin {

  private static final Palette overridePalette = new CustomPalette();

  @ModifyArg(method = "drawTerminalBackground(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/Terminal;FFFF)V",
      at = @At(value = "INVOKE",
          target = "Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer;drawBackground(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFF)V",
          ordinal = 0),
      index = 4,
      remap = false)
  private static Palette injectedTop(Palette x) {
    return overridePalette;
  }

  @ModifyArg(method = "drawTerminalBackground(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/Terminal;FFFF)V",
      at = @At(value = "INVOKE",
          target = "Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer;drawBackground(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFF)V",
          ordinal = 1),
      index = 4,
      remap = false)
  private static Palette injectedBottom(Palette x) {
    return overridePalette;
  }

  @ModifyArg(method = "drawBackground(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFF)V",
      at = @At(value = "INVOKE",
          target = "Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer;drawQuad(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFFFLdan200/computercraft/shared/util/Palette;C)V",
          ordinal = 0),
      index = 5,
      remap = false)
  private static Palette injectedLeft(Palette x) {
    return overridePalette;
  }

  @ModifyArg(method = "drawBackground(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFF)V",
      at = @At(value = "INVOKE",
          target = "Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer;drawQuad(Ldan200/computercraft/client/render/text/DirectFixedWidthFontRenderer$QuadEmitter;FFFFLdan200/computercraft/shared/util/Palette;C)V",
          ordinal = 1),
      index = 5,
      remap = false)
  private static Palette injectedRight(Palette x) {
    return overridePalette;
  }
}
