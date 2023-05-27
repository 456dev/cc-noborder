package dev.the456gamer.ccnoborder.mixin;


import dan200.computercraft.client.render.text.FixedWidthFontRenderer;
import dan200.computercraft.shared.util.Palette;
import dev.the456gamer.ccnoborder.CustomPalette;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@org.spongepowered.asm.mixin.Mixin(FixedWidthFontRenderer.class)
public class Mixin {

  private static final Palette overridePalette = new CustomPalette();

  @ModifyArg(method = "drawTerminalBackground(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/Terminal;FFFF)V", at = @At(value = "INVOKE", target = "Ldan200/computercraft/client/render/text/FixedWidthFontRenderer;drawBackground(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFFI)V", ordinal = 0), index = 4, remap = false)
  private static Palette injectedTop(Palette x) {
    return overridePalette;
  }

  @ModifyArg(method = "drawTerminalBackground(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/Terminal;FFFF)V", at = @At(value = "INVOKE", target = "Ldan200/computercraft/client/render/text/FixedWidthFontRenderer;drawBackground(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFFI)V", ordinal = 1), index = 4, remap = false)
  private static Palette injectedBottom(Palette x) {
    return overridePalette;
  }

  @ModifyArg(method = "drawBackground(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFFI)V", at = @At(value = "INVOKE", target = "Ldan200/computercraft/client/render/text/FixedWidthFontRenderer;drawQuad(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFFFLdan200/computercraft/shared/util/Palette;CI)V", ordinal = 0), index = 5, remap = false)
  private static Palette injectedLeft(Palette x) {
    return overridePalette;
  }

  @ModifyArg(method = "drawBackground(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFLdan200/computercraft/core/terminal/TextBuffer;Ldan200/computercraft/shared/util/Palette;FFFI)V", at = @At(value = "INVOKE", target = "Ldan200/computercraft/client/render/text/FixedWidthFontRenderer;drawQuad(Ldan200/computercraft/client/render/text/FixedWidthFontRenderer$QuadEmitter;FFFFLdan200/computercraft/shared/util/Palette;CI)V", ordinal = 1), index = 5, remap = false)
  private static Palette injectedRight(Palette x) {
    return overridePalette;
  }

}
