package org.cloudburstmc.protocol.bedrock.codec.v407.serializer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.v291.serializer.InventoryTransactionSerializer_v291;
import org.cloudburstmc.protocol.bedrock.data.inventory.transaction.InventoryTransactionType;
import org.cloudburstmc.protocol.bedrock.data.inventory.transaction.LegacySetItemSlotData;
import org.cloudburstmc.protocol.bedrock.packet.InventoryTransactionPacket;
import org.cloudburstmc.protocol.common.util.VarInts;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public class InventoryTransactionSerializer_v407 extends InventoryTransactionSerializer_v291 {
    public static final InventoryTransactionSerializer_v407 INSTANCE = new InventoryTransactionSerializer_v407();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, InventoryTransactionPacket packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, InventoryTransactionPacket packet) {
        packet.setData(ByteBufUtil.getBytes(buffer));
    }
}
