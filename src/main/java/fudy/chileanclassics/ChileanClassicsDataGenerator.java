package fudy.chileanclassics;

import fudy.chileanclassics.datagen.ModelProvider;
import fudy.chileanclassics.datagen.TagProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class ChileanClassicsDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(ModelProvider::new);
		pack.addProvider(TagProvider::new);
	}
}
