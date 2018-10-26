package com.dhy.lab.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.CharsetUtil;

public class SimpleClientHandler extends SimpleChannelInboundHandler<ByteBuf> {


    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws Exception {


        System.out.println("client 接收数据");

        String msg = "Client Receive:" + byteBuf.toString(CharsetUtil.UTF_8);
        System.out.println(msg);
    }


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        System.out.println("client 发送消息");
        ctx.writeAndFlush(Unpooled.copiedBuffer("Netty 发送!", CharsetUtil.UTF_8));
    }


}
