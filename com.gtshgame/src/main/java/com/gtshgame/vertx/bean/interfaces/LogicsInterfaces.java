package com.gtshgame.vertx.bean.interfaces;

import io.vertx.ext.web.RoutingContext;

public interface LogicsInterfaces<T,T2> {

	public T2 DoBean(T v,RoutingContext ctx);
}
