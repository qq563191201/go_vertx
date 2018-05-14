package com.gtshgame.common.msg.protobuf;

public  class VipInfo {
private String vip;
private boolean hasVip;
public boolean hasVip() {
return hasVip;
}
public String getVip() {
return vip;
}
public void setVip(String Vip) {
this.vip = Vip;
this.hasVip = true;
}
private String name;
private boolean hasName;
public boolean hasName() {
return hasName;
}
public String getName() {
return name;
}
public void setName(String Name) {
this.name = Name;
this.hasName = true;
}
private java.util.List<com.gtshgame.common.msg.protobuf.VipMoneyInfo> vipMoneyInfo;
private boolean hasVipMoneyInfo;
public boolean hasVipMoneyInfo() {
return hasVipMoneyInfo;
}
public java.util.List<com.gtshgame.common.msg.protobuf.VipMoneyInfo> getVipMoneyInfo() {
return vipMoneyInfo;
}
public void setVipMoneyInfo(java.util.List<com.gtshgame.common.msg.protobuf.VipMoneyInfo> VipMoneyInfo) {
this.vipMoneyInfo = VipMoneyInfo;
this.hasVipMoneyInfo = true;
}
public java.util.Map toMap() {
java.util.Map map=new java.util.HashMap();
map.put("vip",vip);
map.put("name",name);
if(vipMoneyInfo!=null){
java.util.List<java.util.Map> m_vipMoneyInfo=new java.util.ArrayList<java.util.Map>();
if (vipMoneyInfo instanceof java.util.Collection) {
java.util.Iterator<com.gtshgame.common.msg.protobuf.VipMoneyInfo> it;
it=vipMoneyInfo.iterator();
while(it.hasNext()){
m_vipMoneyInfo.add(it.next().toMap());
}
} else {
for (final com.gtshgame.common.msg.protobuf.VipMoneyInfo value : vipMoneyInfo) {
m_vipMoneyInfo.add(value.toMap());
}
}
map.put("vipMoneyInfo",m_vipMoneyInfo);
}
return map;
}
}
