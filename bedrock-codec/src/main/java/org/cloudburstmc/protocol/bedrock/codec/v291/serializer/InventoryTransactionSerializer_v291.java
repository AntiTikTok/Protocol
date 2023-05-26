package org.cloudburstmc.protocol.bedrock.codec.v291.serializer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.BedrockPacketSerializer;
import org.cloudburstmc.protocol.bedrock.data.inventory.transaction.InventoryTransactionType;
import org.cloudburstmc.protocol.bedrock.packet.InventoryTransactionPacket;
import org.cloudburstmc.protocol.common.util.VarInts;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InventoryTransactionSerializer_v291 implements BedrockPacketSerializer<InventoryTransactionPacket> {
    public static final InventoryTransactionSerializer_v291 INSTANCE = new InventoryTransactionSerializer_v291();


    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, InventoryTransactionPacket packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, InventoryTransactionPacket packet) {
        packet.setData(ByteBufUtil.getBytes(buffer));
    }
}
