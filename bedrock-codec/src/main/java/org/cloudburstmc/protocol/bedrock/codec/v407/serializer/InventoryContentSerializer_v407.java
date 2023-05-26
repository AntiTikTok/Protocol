package org.cloudburstmc.protocol.bedrock.codec.v407.serializer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.BedrockPacketSerializer;
import org.cloudburstmc.protocol.bedrock.packet.InventoryContentPacket;
import org.cloudburstmc.protocol.common.util.VarInts;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class InventoryContentSerializer_v407 implements BedrockPacketSerializer<InventoryContentPacket> {
    public static final InventoryContentSerializer_v407 INSTANCE = new InventoryContentSerializer_v407();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, InventoryContentPacket packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, InventoryContentPacket packet) {
        packet.setData(ByteBufUtil.getBytes(buffer));
    }
}
