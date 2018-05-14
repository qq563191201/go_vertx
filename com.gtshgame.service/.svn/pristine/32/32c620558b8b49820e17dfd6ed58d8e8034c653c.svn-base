package com.gojava.msg.protobuf;

public final class FirstChargeReslutSerializer {
public static byte[] serialize(com.gojava.msg.protobuf.FirstChargeReslut message) {
try {
assertInitialized(message);
int totalSize = 0;
if (message.hasState()) {
totalSize += ProtobufOutputStream.computeInt32Size(1, message.getState());
}
if (message.hasIssucc()) {
totalSize += ProtobufOutputStream.computeBoolSize(2, message.getIssucc());
}
byte[] msgBuffer = null;
if (message.hasMsg()) {
msgBuffer = message.getMsg().getBytes("UTF-8");
totalSize += msgBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(3);
totalSize += ProtobufOutputStream.computeRawVarint32Size(msgBuffer.length);
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasState()) {
position = ProtobufOutputStream.writeInt32(1, message.getState(), result, position);
}
if (message.hasIssucc()) {
position = ProtobufOutputStream.writeBool(2, message.getIssucc(), result, position);
}
if (message.hasMsg()) {
position = ProtobufOutputStream.writeString(3,msgBuffer, result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.gojava.msg.protobuf.FirstChargeReslut message, java.io.OutputStream os) {
try {
assertInitialized(message);
if (message.hasState()) {
ProtobufOutputStream.writeInt32(1, message.getState(), os);
}
if (message.hasIssucc()) {
ProtobufOutputStream.writeBool(2, message.getIssucc(), os);
}
if (message.hasMsg()) {
ProtobufOutputStream.writeString(3, message.getMsg(), os);
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.gojava.msg.protobuf.FirstChargeReslut parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.gojava.msg.protobuf.FirstChargeReslut parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.gojava.msg.protobuf.FirstChargeReslut parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.gojava.msg.protobuf.FirstChargeReslut message = new com.gojava.msg.protobuf.FirstChargeReslut();
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
message.setState(ProtobufInputStream.readInt32(data,cursor));
break;
case 2: 
message.setIssucc(ProtobufInputStream.readBool(data,cursor));
break;
case 3: 
message.setMsg(ProtobufInputStream.readString(data,cursor));
break;
}
}
}
public static com.gojava.msg.protobuf.FirstChargeReslut parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.gojava.msg.protobuf.FirstChargeReslut parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.gojava.msg.protobuf.FirstChargeReslut parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.gojava.msg.protobuf.FirstChargeReslut message = new com.gojava.msg.protobuf.FirstChargeReslut();
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
message.setState(ProtobufInputStream.readInt32(is,cursor));
break;
case 2: 
message.setIssucc(ProtobufInputStream.readBool(is,cursor));
break;
case 3: 
message.setMsg(ProtobufInputStream.readString(is,cursor));
break;
}
}
}
private static void assertInitialized(com.gojava.msg.protobuf.FirstChargeReslut message) {
if( !message.hasState()) {
throw new IllegalArgumentException("Required field not initialized: state");
}
if( !message.hasIssucc()) {
throw new IllegalArgumentException("Required field not initialized: issucc");
}
}
}
