package org.cloudburstmc.protocol.bedrock.codec.v340;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufInputStream;
import org.cloudburstmc.nbt.NBTInputStream;
import org.cloudburstmc.nbt.NbtMap;
import org.cloudburstmc.nbt.NbtUtils;
import org.cloudburstmc.protocol.bedrock.codec.EntityDataTypeMap;
import org.cloudburstmc.protocol.bedrock.codec.v332.BedrockCodecHelper_v332;
import org.cloudburstmc.protocol.bedrock.data.definitions.ItemDefinition;
import org.cloudburstmc.protocol.bedrock.data.inventory.ItemData;
import org.cloudburstmc.protocol.bedrock.packet.InventoryTransactionPacket;
import org.cloudburstmc.protocol.common.util.TypeMap;
import org.cloudburstmc.protocol.common.util.VarInts;

import java.io.IOException;

public class BedrockCodecHelper_v340 extends BedrockCodecHelper_v332 {

    protected static final String BLOCKING_ID = "minecraft:shield";

    public BedrockCodecHelper_v340(EntityDataTypeMap entityData, TypeMap<Class<?>> gameRulesTypes) {
        super(entityData, gameRulesTypes);
    }

}
