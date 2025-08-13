package dahesor.dfpl.mixin.client;

import net.minecraft.server.integrated.IntegratedServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(IntegratedServer.class)
public class IntegratedServerMixin {

	@Inject(method = "getFunctionPermissionLevel", at = @At("HEAD"), cancellable = true)
	private void forceMaxFunctionPermission(CallbackInfoReturnable<Integer> cir) {
		cir.setReturnValue(4);
	}
}