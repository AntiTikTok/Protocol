package org.cloudburstmc.protocol.bedrock.codec.v291.serializer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.BedrockPacketSerializer;
import org.cloudburstmc.protocol.bedrock.packet.AddItemEntityPacket;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AddItemEntitySerializer_v291 implements BedrockPacketSerializer<AddItemEntityPacket> {
    public static final AddItemEntitySerializer_v291 INSTANCE = new AddItemEntitySerializer_v291();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, AddItemEntityPacket packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, AddItemEntityPacket packet) {
        packet.setData(ByteBufUtil.getBytes(buffer));
    }
}
