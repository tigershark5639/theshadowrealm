
public static class Modelshadegremlin extends ModelBase {
	private final ModelRenderer head;
	private final ModelRenderer armor;
	private final ModelRenderer leg1;
	private final ModelRenderer leg2;
	private final ModelRenderer leg3;
	private final ModelRenderer leg4;

	public Modelshadegremlin() {
		textureWidth = 64;
		textureHeight = 64;

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, 6.0F, 0.0F);
		head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, 4.0F, -4.0F, 8, 8, 8, 0.0F, false));

		armor = new ModelRenderer(this);
		armor.setRotationPoint(0.0F, 24.0F, 0.0F);

		leg1 = new ModelRenderer(this);
		leg1.setRotationPoint(2.0F, 18.0F, 4.0F);
		leg1.cubeList.add(new ModelBox(leg1, 28, 30, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		leg2 = new ModelRenderer(this);
		leg2.setRotationPoint(-2.0F, 18.0F, 4.0F);
		leg2.cubeList.add(new ModelBox(leg2, 12, 30, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		leg3 = new ModelRenderer(this);
		leg3.setRotationPoint(2.0F, 18.0F, -4.0F);
		leg3.cubeList.add(new ModelBox(leg3, 0, 24, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));

		leg4 = new ModelRenderer(this);
		leg4.setRotationPoint(-2.0F, 18.0F, -4.0F);
		leg4.cubeList.add(new ModelBox(leg4, 20, 20, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		head.render(f5);
		armor.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
		this.leg1.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
		this.leg4.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg2.rotateAngleX = MathHelper.cos(f * 1.0F) * 1.0F * f1;
		this.leg3.rotateAngleX = MathHelper.cos(f * 1.0F) * -1.0F * f1;
	}
}