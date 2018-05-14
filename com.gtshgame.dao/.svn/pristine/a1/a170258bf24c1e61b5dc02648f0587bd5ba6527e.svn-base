package com.gojava.msg.protobuf;

public final class VipChargeInfoSerializer {
public static byte[] serialize(com.gojava.msg.protobuf.VipChargeInfo message) {
return new byte[0];
}
public static void serialize(com.gojava.msg.protobuf.VipChargeInfo message, java.io.OutputStream os) {
return; 
}
public static com.gojava.msg.protobuf.VipChargeInfo parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.gojava.msg.protobuf.VipChargeInfo parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.gojava.msg.protobuf.VipChargeInfo parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.gojava.msg.protobuf.VipChargeInfo message = new com.gojava.msg.protobuf.VipChargeInfo();
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
}
}
}
public static com.gojava.msg.protobuf.VipChargeInfo parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.gojava.msg.protobuf.VipChargeInfo parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.gojava.msg.protobuf.VipChargeInfo parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.gojava.msg.protobuf.VipChargeInfo message = new com.gojava.msg.protobuf.VipChargeInfo();
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
 break;}
}
}
}
