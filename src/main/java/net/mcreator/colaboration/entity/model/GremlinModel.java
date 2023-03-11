package net.mcreator.colaboration.entity.model;

import software.bernie.geckolib3.model.AnimatedGeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.colaboration.entity.GremlinEntity;

public class GremlinModel extends AnimatedGeoModel<GremlinEntity> {
	@Override
	public ResourceLocation getAnimationResource(GremlinEntity entity) {
		return new ResourceLocation("colaboration", "animations/gremlin_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GremlinEntity entity) {
		return new ResourceLocation("colaboration", "geo/gremlin_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GremlinEntity entity) {
		return new ResourceLocation("colaboration", "textures/entities/" + entity.getTexture() + ".png");
	}

}
