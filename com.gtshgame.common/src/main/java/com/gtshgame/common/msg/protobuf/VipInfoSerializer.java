package com.gtshgame.common.msg.protobuf;

public final class VipInfoSerializer {
public static byte[] serialize(com.gtshgame.common.msg.protobuf.VipInfo message) {
try {
int totalSize = 0;
byte[] vipBuffer = null;
if (message.hasVip()) {
vipBuffer = message.getVip().getBytes("UTF-8");
totalSize += vipBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(1);
totalSize += ProtobufOutputStream.computeRawVarint32Size(vipBuffer.length);
}
byte[] nameBuffer = null;
if (message.hasName()) {
nameBuffer = message.getName().getBytes("UTF-8");
totalSize += nameBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(2);
totalSize += ProtobufOutputStream.computeRawVarint32Size(nameBuffer.length);
}
byte[] vipMoneyInfoBuffer = null;
if (message.hasVipMoneyInfo()) {
java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
for( int i=0;i<message.getVipMoneyInfo().size();i++) {
byte[] curMessageData = com.gtshgame.common.msg.protobuf.VipMoneyInfoSerializer.serialize(message.getVipMoneyInfo().get(i));
ProtobufOutputStream.writeMessageTag(3, baos);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, baos);
baos.write(curMessageData);
}
vipMoneyInfoBuffer = baos.toByteArray();
totalSize += vipMoneyInfoBuffer.length;
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasVip()) {
position = ProtobufOutputStream.writeString(1,vipBuffer, result, position);
}
if (message.hasName()) {
position = ProtobufOutputStream.writeString(2,nameBuffer, result, position);
}
if (message.hasVipMoneyInfo()) {
position = ProtobufOutputStream.writeRawBytes(vipMoneyInfoBuffer, result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.gtshgame.common.msg.protobuf.VipInfo message, java.io.OutputStream os) {
try {
if (message.hasVip()) {
ProtobufOutputStream.writeString(1, message.getVip(), os);
}
if (message.hasName()) {
ProtobufOutputStream.writeString(2, message.getName(), os);
}
if (message.hasVipMoneyInfo()) {
for( int i=0;i<message.getVipMoneyInfo().size();i++) {
byte[] curMessageData = com.gtshgame.common.msg.protobuf.VipMoneyInfoSerializer.serialize(message.getVipMoneyInfo().get(i));
ProtobufOutputStream.writeMessageTag(3, os);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, os);
os.write(curMessageData);
}
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.gtshgame.common.msg.protobuf.VipInfo parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipInfo parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipInfo parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.VipInfo message = new com.gtshgame.common.msg.protobuf.VipInfo();
while(true) {
if (ProtobufInputStream.isAtEnd(data, cursor)) {
return message;
}
int varint = ProtobufInputStream.readRawVarint32(data, cursor);
int tag = ProtobufInputStream.getTagFieldNumber(varint);
switch(tag) {
case 0: 
return message;
 default: 
 ProtobufInputStream.skipUnknown(varint, data, cursor);
 break;
case 1: 
message.setVip(ProtobufInputStream.readString(data,cursor));
break;
case 2: 
message.setName(ProtobufInputStream.readString(data,cursor));
break;
case 3: 
if( message.getVipMoneyInfo() == null || message.getVipMoneyInfo().isEmpty()) {
message.setVipMoneyInfo(new java.util.ArrayList<com.gtshgame.common.msg.protobuf.VipMoneyInfo>());
}
int lengthVipMoneyInfo = ProtobufInputStream.readRawVarint32(data,cursor);
message.getVipMoneyInfo().add(com.gtshgame.common.msg.protobuf.VipMoneyInfoSerializer.parseFrom(data, cursor.getCurrentPosition(), lengthVipMoneyInfo));
cursor.addToPosition(lengthVipMoneyInfo);
break;
}
}
}
public static com.gtshgame.common.msg.protobuf.VipInfo parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipInfo parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipInfo parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.VipInfo message = new com.gtshgame.common.msg.protobuf.VipInfo();
while(true) {
if( cursor.getCurrentPosition() == cursor.getProcessUpToPosition() ) {
return message;
}
int varint = ProtobufInputStream.readRawVarint32(is, cursor);
int tag = ProtobufInputStream.getTagFieldNumber(varint);
if (ProtobufInputStream.isAtEnd(cursor)) {
return message;
}
switch(tag) {
case 0: 
return message;
 default: 
 ProtobufInputStream.skipUnknown(varint, is, cursor);
 break;case 1: 
message.setVip(ProtobufInputStream.readString(is,cursor));
break;
case 2: 
message.setName(ProtobufInputStream.readString(is,cursor));
break;
case 3: 
if( message.getVipMoneyInfo() == null || message.getVipMoneyInfo().isEmpty()) {
message.setVipMoneyInfo(new java.util.ArrayList<com.gtshgame.common.msg.protobuf.VipMoneyInfo>());
}
int lengthVipMoneyInfo = ProtobufInputStream.readRawVarint32(is,cursor);
message.getVipMoneyInfo().add(com.gtshgame.common.msg.protobuf.VipMoneyInfoSerializer.parseFrom(is, cursor.getCurrentPosition(), lengthVipMoneyInfo));
cursor.addToPosition(lengthVipMoneyInfo);
break;
}
}
}
}
