package org.cloudburstmc.protocol.bedrock.codec.v361.serializer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.BedrockPacketSerializer;
import org.cloudburstmc.protocol.bedrock.packet.LevelChunkPacket;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class LevelChunkSerializer_v361 implements BedrockPacketSerializer<LevelChunkPacket> {
    public static final LevelChunkSerializer_v361 INSTANCE = new LevelChunkSerializer_v361();

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, LevelChunkPacket packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, LevelChunkPacket packet) {
        packet.setData(ByteBufUtil.getBytes(buffer));
    }
}
