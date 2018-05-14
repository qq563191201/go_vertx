package com.gtshgame.common.msg.protobuf;

public final class VipMoneyInfoSerializer {
public static byte[] serialize(com.gtshgame.common.msg.protobuf.VipMoneyInfo message) {
try {
int totalSize = 0;
byte[] dayBuffer = null;
if (message.hasDay()) {
dayBuffer = message.getDay().getBytes("UTF-8");
totalSize += dayBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(1);
totalSize += ProtobufOutputStream.computeRawVarint32Size(dayBuffer.length);
}
byte[] moneyBuffer = null;
if (message.hasMoney()) {
moneyBuffer = message.getMoney().getBytes("UTF-8");
totalSize += moneyBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(2);
totalSize += ProtobufOutputStream.computeRawVarint32Size(moneyBuffer.length);
}
if (message.hasId()) {
totalSize += ProtobufOutputStream.computeInt32Size(3, message.getId());
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasDay()) {
position = ProtobufOutputStream.writeString(1,dayBuffer, result, position);
}
if (message.hasMoney()) {
position = ProtobufOutputStream.writeString(2,moneyBuffer, result, position);
}
if (message.hasId()) {
position = ProtobufOutputStream.writeInt32(3, message.getId(), result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.gtshgame.common.msg.protobuf.VipMoneyInfo message, java.io.OutputStream os) {
try {
if (message.hasDay()) {
ProtobufOutputStream.writeString(1, message.getDay(), os);
}
if (message.hasMoney()) {
ProtobufOutputStream.writeString(2, message.getMoney(), os);
}
if (message.hasId()) {
ProtobufOutputStream.writeInt32(3, message.getId(), os);
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.gtshgame.common.msg.protobuf.VipMoneyInfo parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipMoneyInfo parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipMoneyInfo parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.VipMoneyInfo message = new com.gtshgame.common.msg.protobuf.VipMoneyInfo();
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
message.setDay(ProtobufInputStream.readString(data,cursor));
break;
case 2: 
message.setMoney(ProtobufInputStream.readString(data,cursor));
break;
case 3: 
message.setId(ProtobufInputStream.readInt32(data,cursor));
break;
}
}
}
public static com.gtshgame.common.msg.protobuf.VipMoneyInfo parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipMoneyInfo parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.VipMoneyInfo parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.VipMoneyInfo message = new com.gtshgame.common.msg.protobuf.VipMoneyInfo();
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
message.setDay(ProtobufInputStream.readString(is,cursor));
break;
case 2: 
message.setMoney(ProtobufInputStream.readString(is,cursor));
break;
case 3: 
message.setId(ProtobufInputStream.readInt32(is,cursor));
break;
}
}
}
}
