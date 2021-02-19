
public static class Modelcustom_model extends EntityModel<Entity> {
	private final ModelRenderer body;
	private final ModelRenderer left_arm;
	private final ModelRenderer right_arm;
	private final ModelRenderer head;
	private final ModelRenderer head2;

	public Modelcustom_model() {
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, 18.0F, 0.0F);
		setRotationAngle(body, -1.5708F, 0.0F, 0.0F);
		body.setTextureOffset(0, 0).addBox(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F, 0.0F, false);

		left_arm = new ModelRenderer(this);
		left_arm.setRotationPoint(-3.0F, 17.0F, -3.0F);
		left_arm.setTextureOffset(8, 15).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(8, 15).addBox(5.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(8, 15).addBox(-1.0F, 0.0F, 4.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		left_arm.setTextureOffset(8, 15).addBox(5.0F, 0.0F, 4.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		right_arm = new ModelRenderer(this);
		right_arm.setRotationPoint(3.0F, 3.0F, -3.0F);
		setRotationAngle(right_arm, 1.5708F, 0.0F, 0.0F);
		right_arm.setTextureOffset(0, 15).addBox(2.0F, -5.0F, -9.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);
		right_arm.setTextureOffset(0, 15).addBox(-10.0F, -5.0F, -9.0F, 2.0F, 7.0F, 2.0F, 0.0F, false);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 16.5F, -3.0F);
		head.setTextureOffset(32, 0).addBox(-7.5F, -7.0F, 0.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
		head.setTextureOffset(32, 0).addBox(2.5F, -7.0F, 0.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(-5.0F, 5.5F, -3.0F);
		setRotationAngle(head2, 0.0F, 0.0F, 1.5708F);
		head2.setTextureOffset(32, 0).addBox(-2.5F, -7.0F, 0.0F, 5.0F, 4.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setRotationAngles(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks,
			float netHeadYaw, float headPitch) {
		// previously the render function, render code was moved to a method below
	}

	@Override
	public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red,
			float green, float blue, float alpha) {
		body.render(matrixStack, buffer, packedLight, packedOverlay);
		left_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		right_arm.render(matrixStack, buffer, packedLight, packedOverlay);
		head.render(matrixStack, buffer, packedLight, packedOverlay);
		head2.render(matrixStack, buffer, packedLight, packedOverlay);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}