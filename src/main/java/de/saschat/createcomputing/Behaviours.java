package de.saschat.createcomputing;

import com.simibubi.create.content.redstone.displayLink.AllDisplayBehaviours;
import com.simibubi.create.foundation.utility.RegisteredObjects;
import de.saschat.createcomputing.behaviour.source.TextDisplayBehaviour;
import de.saschat.createcomputing.behaviour.target.TextPassBehaviour;
import net.minecraft.resources.ResourceLocation;

public class Behaviours {
    public static void register() {
        AllDisplayBehaviours.assignBlock(
            AllDisplayBehaviours.register(
                new ResourceLocation(CreateComputingMod.MOD_ID,
                    "computerized_display_source"),
                new TextDisplayBehaviour()
            ),
            RegisteredObjects.getKeyOrThrow(Registries.COMPUTERIZED_DISPLAY_SOURCE_TILE.get())
        );
        AllDisplayBehaviours.assignBlock(
            AllDisplayBehaviours.register(
                new ResourceLocation(CreateComputingMod.MOD_ID,
                    "computerized_display_target"),
                new TextPassBehaviour()
            ),
            RegisteredObjects.getKeyOrThrow(Registries.COMPUTERIZED_DISPLAY_TARGET_TILE.get())
        );
    }
}
