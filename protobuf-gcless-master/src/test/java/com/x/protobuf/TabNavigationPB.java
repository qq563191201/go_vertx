// Generated by the protocol buffer gcless compiler.  DO NOT EDIT!
package com.x.protobuf;

import java.io.IOException;
public final class TabNavigationPB {
private TabNavigationPB() {}
public static class TabNavigation {
private String state;
private boolean hasState;
public boolean hasState() {
return hasState;
}
public String getState() {
return state;
}
public void setState(String State) {
this.state = State;
this.hasState = true;
}
private com.x.protobuf.SyncEnumsPB.SyncEnums.PageTransition pageTransition;
private boolean hasPageTransition;
public boolean hasPageTransition() {
return hasPageTransition;
}
public com.x.protobuf.SyncEnumsPB.SyncEnums.PageTransition getPageTransition() {
return pageTransition;
}
public void setPageTransition(com.x.protobuf.SyncEnumsPB.SyncEnums.PageTransition PageTransition) {
this.pageTransition = PageTransition;
this.hasPageTransition = true;
}
}
public static class TabNavigationSerializer {
public static byte[] serialize(com.x.protobuf.TabNavigationPB.TabNavigation message) {
try {
int totalSize = 0;
byte[] stateBuffer = null;
if (message.hasState()) {
stateBuffer = message.getState().getBytes("UTF-8");
totalSize += stateBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(5);
totalSize += ProtobufOutputStream.computeRawVarint32Size(stateBuffer.length);
}
if (message.hasPageTransition()) {
totalSize += ProtobufOutputStream.computeEnumSize(6, message.getPageTransition().getValue());
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasState()) {
position = ProtobufOutputStream.writeString(5,stateBuffer, result, position);
}
if (message.hasPageTransition()) {
position = ProtobufOutputStream.writeEnum(6, message.getPageTransition().getValue(), result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.x.protobuf.TabNavigationPB.TabNavigation message, java.io.OutputStream os) {
try {
if (message.hasState()) {
ProtobufOutputStream.writeString(5, message.getState(), os);
}
if (message.hasPageTransition()) {
ProtobufOutputStream.writeEnum(6, message.getPageTransition().getValue(), os);
}
} catch (IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.x.protobuf.TabNavigationPB.TabNavigation parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.x.protobuf.TabNavigationPB.TabNavigation parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.x.protobuf.TabNavigationPB.TabNavigation parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.TabNavigationPB.TabNavigation message = new com.x.protobuf.TabNavigationPB.TabNavigation();
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
case 5: 
message.setState(ProtobufInputStream.readString(data,cursor));
break;
case 6: 
message.setPageTransition(com.x.protobuf.SyncEnumsPB.SyncEnums.PageTransition.valueOf(ProtobufInputStream.readEnum(data,cursor)));
break;
}
}
}
public static com.x.protobuf.TabNavigationPB.TabNavigation parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.x.protobuf.TabNavigationPB.TabNavigation parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.x.protobuf.TabNavigationPB.TabNavigation parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.TabNavigationPB.TabNavigation message = new com.x.protobuf.TabNavigationPB.TabNavigation();
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
 break;case 5: 
message.setState(ProtobufInputStream.readString(is,cursor));
break;
case 6: 
message.setPageTransition(com.x.protobuf.SyncEnumsPB.SyncEnums.PageTransition.valueOf(ProtobufInputStream.readEnum(is,cursor)));
break;
}
}
}
}
}

