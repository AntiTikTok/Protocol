package org.cloudburstmc.protocol.bedrock.codec.v557.serializer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import org.cloudburstmc.protocol.bedrock.codec.BedrockCodecHelper;
import org.cloudburstmc.protocol.bedrock.codec.v534.serializer.AddPlayerSerializer_v534;
import org.cloudburstmc.protocol.bedrock.codec.v534.serializer.UpdateAbilitiesSerializer_v534;
import org.cloudburstmc.protocol.bedrock.packet.AddPlayerPacket;
import org.cloudburstmc.protocol.common.util.VarInts;

public class AddPlayerSerializer_v557 extends AddPlayerSerializer_v534 {

    @Override
    public void serialize(ByteBuf buffer, BedrockCodecHelper helper, AddPlayerPacket packet) {
        buffer.writeBytes(packet.getData());
    }

    @Override
    public void deserialize(ByteBuf buffer, BedrockCodecHelper helper, AddPlayerPacket packet) {
        packet.setData(ByteBufUtil.getBytes(buffer));
    }
}
