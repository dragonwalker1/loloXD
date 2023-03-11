
package net.mcreator.colaboration.client.renderer;

import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.colaboration.entity.model.GremlinModel;
import net.mcreator.colaboration.entity.GremlinEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class GremlinRenderer extends GeoEntityRenderer<GremlinEntity> {
	public GremlinRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new GremlinModel());
		this.shadowRadius = 0.5f;
	}

	@Override
	public RenderType getRenderType(GremlinEntity entity, float partialTicks, PoseStack stack, MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn, ResourceLocation textureLocation) {
		stack.scale(1f, 1f, 1f);
		return RenderType.entityTranslucent(getTextureLocation(entity));
	}
}
