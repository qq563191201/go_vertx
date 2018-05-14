package com.gtshgame.common.msg.protobuf;

public  class FirstCharge {
private int userId;
private boolean hasUserId;
public boolean hasUserId() {
return hasUserId;
}
public int getUserId() {
return userId;
}
public void setUserId(int UserId) {
this.userId = UserId;
this.hasUserId = true;
}
public java.util.Map toMap() {
java.util.Map map=new java.util.HashMap();
map.put("userId",userId);
return map;
}
}
