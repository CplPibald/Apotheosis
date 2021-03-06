package shadows.apotheosis.deadly.loot.affix.impl.melee;

import net.minecraft.entity.ai.attributes.AttributeModifier.Operation;
import shadows.apotheosis.deadly.loot.EquipmentType;
import shadows.apotheosis.deadly.loot.affix.impl.AttributeAffix;
import shadows.apotheosis.deadly.loot.attributes.CustomAttributes;

public class CritChanceAffix extends AttributeAffix {

	public CritChanceAffix(int weight) {
		super(CustomAttributes.CRIT_CHANCE, 0.4F, 1.0F, Operation.MULTIPLY_TOTAL, weight);
	}

	@Override
	public boolean canApply(EquipmentType type) {
		return type == EquipmentType.SWORD;
	}

	@Override
	public float getMin() {
		return 0.2F;
	}
}
