package com.gtshgame.common.msg.protobuf;

public final class FirstChargeSerializer {
public static byte[] serialize(com.gtshgame.common.msg.protobuf.FirstCharge message) {
try {
assertInitialized(message);
int totalSize = 0;
if (message.hasUserId()) {
totalSize += ProtobufOutputStream.computeInt32Size(1, message.getUserId());
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasUserId()) {
position = ProtobufOutputStream.writeInt32(1, message.getUserId(), result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.gtshgame.common.msg.protobuf.FirstCharge message, java.io.OutputStream os) {
try {
assertInitialized(message);
if (message.hasUserId()) {
ProtobufOutputStream.writeInt32(1, message.getUserId(), os);
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.gtshgame.common.msg.protobuf.FirstCharge parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.FirstCharge parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.gtshgame.common.msg.protobuf.FirstCharge parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.FirstCharge message = new com.gtshgame.common.msg.protobuf.FirstCharge();
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
message.setUserId(ProtobufInputStream.readInt32(data,cursor));
break;
}
}
}
public static com.gtshgame.common.msg.protobuf.FirstCharge parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.FirstCharge parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.gtshgame.common.msg.protobuf.FirstCharge parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.gtshgame.common.msg.protobuf.FirstCharge message = new com.gtshgame.common.msg.protobuf.FirstCharge();
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
message.setUserId(ProtobufInputStream.readInt32(is,cursor));
break;
}
}
}
private static void assertInitialized(com.gtshgame.common.msg.protobuf.FirstCharge message) {
if( !message.hasUserId()) {
throw new IllegalArgumentException("Required field not initialized: userId");
}
}
}
