// Generated by the protocol buffer gcless compiler.  DO NOT EDIT!
package com.x.protobuf;

import java.io.IOException;
public final class SyncEnumsPB {
private SyncEnumsPB() {}
public static class SyncEnums {
public enum PageTransition {
LINK(0),
TYPED(1),
;
public static PageTransition valueOf(int value) {
switch (value) {
case 0: return LINK;
case 1: return TYPED;
default: return null;
}
}
private PageTransition(int value) {
this.value = value;
}
private int value;
public int getValue() {
return value;
}
}

}
public static class SyncEnumsSerializer {
public static byte[] serialize(com.x.protobuf.SyncEnumsPB.SyncEnums message) {
return new byte[0];
}
public static void serialize(com.x.protobuf.SyncEnumsPB.SyncEnums message, java.io.OutputStream os) {
return; 
}
public static com.x.protobuf.SyncEnumsPB.SyncEnums parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.x.protobuf.SyncEnumsPB.SyncEnums parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.x.protobuf.SyncEnumsPB.SyncEnums parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.SyncEnumsPB.SyncEnums message = new com.x.protobuf.SyncEnumsPB.SyncEnums();
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
public static com.x.protobuf.SyncEnumsPB.SyncEnums parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.x.protobuf.SyncEnumsPB.SyncEnums parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.x.protobuf.SyncEnumsPB.SyncEnums parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.SyncEnumsPB.SyncEnums message = new com.x.protobuf.SyncEnumsPB.SyncEnums();
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
}
