package com.gtshgame.common.interfaces;

import io.vertx.ext.web.RoutingContext;

public interface MsgInterfaceVertx<T,RT> {
	//处理客户端接口的函数
	RT ProcessMsgInfo(T o,RoutingContext rctx) throws Exception;
}
