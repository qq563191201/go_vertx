package com.gtshgame.common.msg.protobuf;

public final class VipChargeInfoReslutSerializer {
public static byte[] serialize(com.gtshgame.common.msg.protobuf.VipChargeInfoReslut message) {
try {
int totalSize = 0;
byte[] vipInfoBuffer = null;
if (message.hasVipInfo()) {
java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
for( int i=0;i<message.getVipInfo().size();i++) {
byte[] curMessageData = com.gtshgame.common.msg.protobuf.VipInfoSerializer.serialize(message.getVipInfo().get(i));
ProtobufOutputStream.writeMessageTag(1, baos);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, baos);
baos.write(curMessageData);
}
vipInfoBuffer = baos.toByteArray();
totalSize += vipInfoBuffer.length;
}
if (message.hasIssucc()) {
totalSize += ProtobufOutputStream.computeBoolSize(2, message.getIssucc());
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasVipInfo()) {
position = ProtobufOutputStream.writeRawBytes(vipInfoBuffer, result, position);
}
if (message.hasIssucc()) {
position = ProtobufOutputStream.writeBool(2, message.getIssucc(), result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.gtshgame.common.msg.protobuf.VipChargeInfoReslut message, java.io.OutputStream os) {
try {
if (message.hasVipInfo()) {
for( int i=0;i<message.getVipInfo().size();i++) {
byte[] curMessageData = com.gtshgame.common.msg.protobuf.VipInfoSerializer.serialize(message.getVipInfo().get(i));
ProtobufOutputStream.writeMessageTag(1, os);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, os);
os.write(curMessageData);
}
}
if (message.hasIssucc()) {
ProtobufOutputStream.writeBool(2, message.getIssucc(), os);
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.gtshgame.common.msg.protobuf.VipChargeInfoReslut parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipChargeInfoReslut parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipChargeInfoReslut parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.VipChargeInfoReslut message = new com.gtshgame.common.msg.protobuf.VipChargeInfoReslut();
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
if( message.getVipInfo() == null || message.getVipInfo().isEmpty()) {
message.setVipInfo(new java.util.ArrayList<com.gtshgame.common.msg.protobuf.VipInfo>());
}
int lengthVipInfo = ProtobufInputStream.readRawVarint32(data,cursor);
message.getVipInfo().add(com.gtshgame.common.msg.protobuf.VipInfoSerializer.parseFrom(data, cursor.getCurrentPosition(), lengthVipInfo));
cursor.addToPosition(lengthVipInfo);
break;
case 2: 
message.setIssucc(ProtobufInputStream.readBool(data,cursor));
break;
}
}
}
public static com.gtshgame.common.msg.protobuf.VipChargeInfoReslut parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipChargeInfoReslut parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipChargeInfoReslut parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.VipChargeInfoReslut message = new com.gtshgame.common.msg.protobuf.VipChargeInfoReslut();
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
if( message.getVipInfo() == null || message.getVipInfo().isEmpty()) {
message.setVipInfo(new java.util.ArrayList<com.gtshgame.common.msg.protobuf.VipInfo>());
}
int lengthVipInfo = ProtobufInputStream.readRawVarint32(is,cursor);
message.getVipInfo().add(com.gtshgame.common.msg.protobuf.VipInfoSerializer.parseFrom(is, cursor.getCurrentPosition(), lengthVipInfo));
cursor.addToPosition(lengthVipInfo);
break;
case 2: 
message.setIssucc(ProtobufInputStream.readBool(is,cursor));
break;
}
}
}
}
