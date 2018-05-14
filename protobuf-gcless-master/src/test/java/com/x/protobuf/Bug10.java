// Generated by the protocol buffer gcless compiler.  DO NOT EDIT!
package com.x.protobuf;

public final class Bug10 {
private Bug10() {}
public static class A {
private java.util.List<com.x.protobuf.Bug10.B> entry;
private boolean hasEntry;
public boolean hasEntry() {
return hasEntry;
}
public java.util.List<com.x.protobuf.Bug10.B> getEntry() {
return entry;
}
public void setEntry(java.util.List<com.x.protobuf.Bug10.B> Entry) {
this.entry = Entry;
this.hasEntry = true;
}
private int entry2;
private boolean hasEntry2;
public boolean hasEntry2() {
return hasEntry2;
}
public int getEntry2() {
return entry2;
}
public void setEntry2(int Entry2) {
this.entry2 = Entry2;
this.hasEntry2 = true;
}
private com.x.protobuf.Bug10.B entry3;
private boolean hasEntry3;
public boolean hasEntry3() {
return hasEntry3;
}
public com.x.protobuf.Bug10.B getEntry3() {
return entry3;
}
public void setEntry3(com.x.protobuf.Bug10.B Entry3) {
this.entry3 = Entry3;
this.hasEntry3 = true;
}
@Override
public String toString() {
java.lang.StringBuilder builder = new java.lang.StringBuilder();
try {
toString(builder);
return builder.toString();
} catch (java.io.IOException e) {
throw new RuntimeException("Unable toString", e);
}
}
public void toString(java.lang.Appendable a_) throws java.io.IOException {
a_.append("A [");
a_.append(" entry=");
if (entry != null ) {
a_.append("[");
for( int i=0;i<entry.size();i++ ) {
com.x.protobuf.Bug10.B cur = entry.get(i);
if( i != 0 ) {
 a_.append(", ");
}
cur.toString(a_);
}
a_.append("]");
} else {
a_.append("null");
}
a_.append(",");
a_.append(" entry2=" + entry2);
a_.append(",");
a_.append(" entry3=");
if ( entry3 != null ) {
entry3.toString(a_);
} else {
a_.append("null");
}
a_.append("]");
}
}
public static class ASerializer {
public static byte[] serialize(com.x.protobuf.Bug10.A message) {
try {
int totalSize = 0;
byte[] entryBuffer = null;
if (message.hasEntry()) {
java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
for( int i=0;i<message.getEntry().size();i++) {
byte[] curMessageData = com.x.protobuf.Bug10.BSerializer.serialize(message.getEntry().get(i));
ProtobufOutputStream.writeMessageTag(32904, baos);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, baos);
baos.write(curMessageData);
}
entryBuffer = baos.toByteArray();
totalSize += entryBuffer.length;
}
if (message.hasEntry2()) {
totalSize += ProtobufOutputStream.computeInt32Size(32902, message.getEntry2());
}
byte[] entry3Buffer = null;
if (message.hasEntry3()) {
entry3Buffer = com.x.protobuf.Bug10.BSerializer.serialize(message.getEntry3());
totalSize += ProtobufOutputStream.computeTagSize(32903);
totalSize += ProtobufOutputStream.computeRawVarint32Size(entry3Buffer.length);
totalSize += entry3Buffer.length;
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasEntry()) {
position = ProtobufOutputStream.writeRawBytes(entryBuffer, result, position);
}
if (message.hasEntry2()) {
position = ProtobufOutputStream.writeInt32(32902, message.getEntry2(), result, position);
}
if (message.hasEntry3()) {
position = ProtobufOutputStream.writeBytes(32903, entry3Buffer, result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.x.protobuf.Bug10.A message, java.io.OutputStream os) {
try {
if (message.hasEntry()) {
for( int i=0;i<message.getEntry().size();i++) {
byte[] curMessageData = com.x.protobuf.Bug10.BSerializer.serialize(message.getEntry().get(i));
ProtobufOutputStream.writeMessageTag(32904, os);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, os);
os.write(curMessageData);
}
}
if (message.hasEntry2()) {
ProtobufOutputStream.writeInt32(32902, message.getEntry2(), os);
}
if (message.hasEntry3()) {
byte[] curMessageData = com.x.protobuf.Bug10.BSerializer.serialize(message.getEntry3());
ProtobufOutputStream.writeMessageTag(32903, os);
ProtobufOutputStream.writeRawVarint32(curMessageData.length, os);
os.write(curMessageData);
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.x.protobuf.Bug10.A parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.x.protobuf.Bug10.A parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.x.protobuf.Bug10.A parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.Bug10.A message = new com.x.protobuf.Bug10.A();
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
case 32904: 
if( message.getEntry() == null || message.getEntry().isEmpty()) {
message.setEntry(new java.util.ArrayList<com.x.protobuf.Bug10.B>());
}
int lengthEntry = ProtobufInputStream.readRawVarint32(data,cursor);
message.getEntry().add(com.x.protobuf.Bug10.BSerializer.parseFrom(data, cursor.getCurrentPosition(), lengthEntry));
cursor.addToPosition(lengthEntry);
break;
case 32902: 
message.setEntry2(ProtobufInputStream.readInt32(data,cursor));
break;
case 32903: 
int lengthEntry3 = ProtobufInputStream.readRawVarint32(data,cursor);
message.setEntry3(com.x.protobuf.Bug10.BSerializer.parseFrom(data, cursor.getCurrentPosition(), lengthEntry3));
cursor.addToPosition(lengthEntry3);
break;
}
}
}
public static com.x.protobuf.Bug10.A parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.x.protobuf.Bug10.A parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.x.protobuf.Bug10.A parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.Bug10.A message = new com.x.protobuf.Bug10.A();
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
 break;case 32904: 
if( message.getEntry() == null || message.getEntry().isEmpty()) {
message.setEntry(new java.util.ArrayList<com.x.protobuf.Bug10.B>());
}
int lengthEntry = ProtobufInputStream.readRawVarint32(is,cursor);
message.getEntry().add(com.x.protobuf.Bug10.BSerializer.parseFrom(is, cursor.getCurrentPosition(), lengthEntry));
cursor.addToPosition(lengthEntry);
break;
case 32902: 
message.setEntry2(ProtobufInputStream.readInt32(is,cursor));
break;
case 32903: 
int lengthEntry3 = ProtobufInputStream.readRawVarint32(is,cursor);
message.setEntry3(com.x.protobuf.Bug10.BSerializer.parseFrom(is, cursor.getCurrentPosition(), lengthEntry3));
cursor.addToPosition(lengthEntry3);
break;
}
}
}
}
public static class B {
private String val;
private boolean hasVal;
public boolean hasVal() {
return hasVal;
}
public String getVal() {
return val;
}
public void setVal(String Val) {
this.val = Val;
this.hasVal = true;
}
@Override
public String toString() {
java.lang.StringBuilder builder = new java.lang.StringBuilder();
try {
toString(builder);
return builder.toString();
} catch (java.io.IOException e) {
throw new RuntimeException("Unable toString", e);
}
}
public void toString(java.lang.Appendable a_) throws java.io.IOException {
a_.append("B [");
a_.append(" val=" + val);
a_.append("]");
}
}
public static class BSerializer {
public static byte[] serialize(com.x.protobuf.Bug10.B message) {
try {
int totalSize = 0;
byte[] valBuffer = null;
if (message.hasVal()) {
valBuffer = message.getVal().getBytes("UTF-8");
totalSize += valBuffer.length;
totalSize += ProtobufOutputStream.computeTagSize(1);
totalSize += ProtobufOutputStream.computeRawVarint32Size(valBuffer.length);
}
final byte[] result = new byte[totalSize];
int position = 0;
if (message.hasVal()) {
position = ProtobufOutputStream.writeString(1,valBuffer, result, position);
}
ProtobufOutputStream.checkNoSpaceLeft(result, position);
return result;
} catch (Exception e) {
throw new RuntimeException(e);
}
}
public static void serialize(com.x.protobuf.Bug10.B message, java.io.OutputStream os) {
try {
if (message.hasVal()) {
ProtobufOutputStream.writeString(1, message.getVal(), os);
}
} catch (java.io.IOException e) {
throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e);
}
}
public static com.x.protobuf.Bug10.B parseFrom(byte[] data) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(data, cursor);
}
public static com.x.protobuf.Bug10.B parseFrom(byte[] data, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(data, cursor);
}
public static com.x.protobuf.Bug10.B parseFrom(byte[] data, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.Bug10.B message = new com.x.protobuf.Bug10.B();
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
message.setVal(ProtobufInputStream.readString(data,cursor));
break;
}
}
}
public static com.x.protobuf.Bug10.B parseFrom(java.io.InputStream is) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
return parseFrom(is, cursor);
}
public static com.x.protobuf.Bug10.B parseFrom(java.io.InputStream is, int offset, int length) throws java.io.IOException {
CurrentCursor cursor = new CurrentCursor();
cursor.addToPosition(offset);
cursor.setProcessUpToPosition(offset + length);
return parseFrom(is, cursor);
}
public static com.x.protobuf.Bug10.B parseFrom(java.io.InputStream is, CurrentCursor cursor) throws java.io.IOException {
com.x.protobuf.Bug10.B message = new com.x.protobuf.Bug10.B();
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
message.setVal(ProtobufInputStream.readString(is,cursor));
break;
}
}
}
}
}

