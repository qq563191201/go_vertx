// Generated by the protocol buffer compiler.  DO NOT EDIT!

package protobuf_unittest;

public  final class Vehicle extends
    com.google.protobuf.GeneratedMessage {
  // Use Vehicle.newBuilder() to construct.
  private Vehicle() {
    initFields();
  }
  private Vehicle(boolean noInit) {}
  
  private static final Vehicle defaultInstance;
  public static Vehicle getDefaultInstance() {
    return defaultInstance;
  }
  
  public Vehicle getDefaultInstanceForType() {
    return defaultInstance;
  }
  
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_descriptor;
  }
  
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return protobuf_unittest.NestedBuilders.internal_static_protobuf_unittest_Vehicle_fieldAccessorTable;
  }
  
  // optional .protobuf_unittest.Engine engine = 1;
  public static final int ENGINE_FIELD_NUMBER = 1;
  private boolean hasEngine;
  private protobuf_unittest.Engine engine_;
  public boolean hasEngine() { return hasEngine; }
  public protobuf_unittest.Engine getEngine() { return engine_; }
  
  // repeated .protobuf_unittest.Wheel wheel = 2;
  public static final int WHEEL_FIELD_NUMBER = 2;
  private java.util.List<protobuf_unittest.Wheel> wheel_ =
    java.util.Collections.emptyList();
  public java.util.List<protobuf_unittest.Wheel> getWheelList() {
    return wheel_;
  }
  public int getWheelCount() { return wheel_.size(); }
  public protobuf_unittest.Wheel getWheel(int index) {
    return wheel_.get(index);
  }
  
  private void initFields() {
    engine_ = protobuf_unittest.Engine.getDefaultInstance();
  }
  public final boolean isInitialized() {
    return true;
  }
  
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    getSerializedSize();
    if (hasEngine()) {
      output.writeMessage(1, getEngine());
    }
    for (protobuf_unittest.Wheel element : getWheelList()) {
      output.writeMessage(2, element);
    }
    getUnknownFields().writeTo(output);
  }
  
  private int memoizedSerializedSize = -1;
  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;
  
    size = 0;
    if (hasEngine()) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getEngine());
    }
    for (protobuf_unittest.Wheel element : getWheelList()) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, element);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSerializedSize = size;
    return size;
  }
  
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.Vehicle parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data).buildParsed();
  }
  public static protobuf_unittest.Vehicle parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return newBuilder().mergeFrom(data, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.Vehicle parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static protobuf_unittest.Vehicle parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  public static protobuf_unittest.Vehicle parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static protobuf_unittest.Vehicle parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    Builder builder = newBuilder();
    if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
      return builder.buildParsed();
    } else {
      return null;
    }
  }
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input).buildParsed();
  }
  public static protobuf_unittest.Vehicle parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return newBuilder().mergeFrom(input, extensionRegistry)
             .buildParsed();
  }
  
  public static Builder newBuilder() { return Builder.create(); }
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder(protobuf_unittest.Vehicle prototype) {
    return newBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() { return newBuilder(this); }
  
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> {
    private protobuf_unittest.Vehicle result;
    
    // Construct using protobuf_unittest.Vehicle.newBuilder()
    private Builder() {}
    
    private static Builder create() {
      Builder builder = new Builder();
      builder.result = new protobuf_unittest.Vehicle();
      return builder;
    }
    
    protected protobuf_unittest.Vehicle internalGetResult() {
      return result;
    }
    
    public Builder clear() {
      if (result == null) {
        throw new IllegalStateException(
          "Cannot call clear() after build().");
      }
      result = new protobuf_unittest.Vehicle();
      return this;
    }
    
    public Builder clone() {
      return create().mergeFrom(result);
    }
    
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return protobuf_unittest.Vehicle.getDescriptor();
    }
    
    public protobuf_unittest.Vehicle getDefaultInstanceForType() {
      return protobuf_unittest.Vehicle.getDefaultInstance();
    }
    
    public boolean isInitialized() {
      return result.isInitialized();
    }
    public protobuf_unittest.Vehicle build() {
      if (result != null && !isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return buildPartial();
    }
    
    private protobuf_unittest.Vehicle buildParsed()
        throws com.google.protobuf.InvalidProtocolBufferException {
      if (!isInitialized()) {
        throw newUninitializedMessageException(
          result).asInvalidProtocolBufferException();
      }
      return buildPartial();
    }
    
    public protobuf_unittest.Vehicle buildPartial() {
      if (result == null) {
        throw new IllegalStateException(
          "build() has already been called on this Builder.");
      }
      if (result.wheel_ != java.util.Collections.EMPTY_LIST) {
        result.wheel_ =
          java.util.Collections.unmodifiableList(result.wheel_);
      }
      protobuf_unittest.Vehicle returnMe = result;
      result = null;
      return returnMe;
    }
    
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof protobuf_unittest.Vehicle) {
        return mergeFrom((protobuf_unittest.Vehicle)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }
    
    public Builder mergeFrom(protobuf_unittest.Vehicle other) {
      if (other == protobuf_unittest.Vehicle.getDefaultInstance()) return this;
      if (other.hasEngine()) {
        mergeEngine(other.getEngine());
      }
      if (!other.wheel_.isEmpty()) {
        if (result.wheel_.isEmpty()) {
          result.wheel_ = new java.util.ArrayList<protobuf_unittest.Wheel>();
        }
        result.wheel_.addAll(other.wheel_);
      }
      this.mergeUnknownFields(other.getUnknownFields());
      return this;
    }
    
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder(
          this.getUnknownFields());
      while (true) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            this.setUnknownFields(unknownFields.build());
            return this;
          default: {
            if (!parseUnknownField(input, unknownFields,
                                   extensionRegistry, tag)) {
              this.setUnknownFields(unknownFields.build());
              return this;
            }
            break;
          }
          case 10: {
            protobuf_unittest.Engine.Builder subBuilder = protobuf_unittest.Engine.newBuilder();
            if (hasEngine()) {
              subBuilder.mergeFrom(getEngine());
            }
            input.readMessage(subBuilder, extensionRegistry);
            setEngine(subBuilder.buildPartial());
            break;
          }
          case 18: {
            protobuf_unittest.Wheel.Builder subBuilder = protobuf_unittest.Wheel.newBuilder();
            input.readMessage(subBuilder, extensionRegistry);
            addWheel(subBuilder.buildPartial());
            break;
          }
        }
      }
    }
    
    
    // optional .protobuf_unittest.Engine engine = 1;
    public boolean hasEngine() {
      return result.hasEngine();
    }
    public protobuf_unittest.Engine getEngine() {
      return result.getEngine();
    }
    public Builder setEngine(protobuf_unittest.Engine value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result.hasEngine = true;
      result.engine_ = value;
      return this;
    }
    public Builder setEngine(protobuf_unittest.Engine.Builder builderForValue) {
      result.hasEngine = true;
      result.engine_ = builderForValue.build();
      return this;
    }
    public Builder mergeEngine(protobuf_unittest.Engine value) {
      if (result.hasEngine() &&
          result.engine_ != protobuf_unittest.Engine.getDefaultInstance()) {
        result.engine_ =
          protobuf_unittest.Engine.newBuilder(result.engine_).mergeFrom(value).buildPartial();
      } else {
        result.engine_ = value;
      }
      result.hasEngine = true;
      return this;
    }
    public Builder clearEngine() {
      result.hasEngine = false;
      result.engine_ = protobuf_unittest.Engine.getDefaultInstance();
      return this;
    }
    
    // repeated .protobuf_unittest.Wheel wheel = 2;
    public java.util.List<protobuf_unittest.Wheel> getWheelList() {
      return java.util.Collections.unmodifiableList(result.wheel_);
    }
    public int getWheelCount() {
      return result.getWheelCount();
    }
    public protobuf_unittest.Wheel getWheel(int index) {
      return result.getWheel(index);
    }
    public Builder setWheel(int index, protobuf_unittest.Wheel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      result.wheel_.set(index, value);
      return this;
    }
    public Builder setWheel(int index, protobuf_unittest.Wheel.Builder builderForValue) {
      result.wheel_.set(index, builderForValue.build());
      return this;
    }
    public Builder addWheel(protobuf_unittest.Wheel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (result.wheel_.isEmpty()) {
        result.wheel_ = new java.util.ArrayList<protobuf_unittest.Wheel>();
      }
      result.wheel_.add(value);
      return this;
    }
    public Builder addWheel(protobuf_unittest.Wheel.Builder builderForValue) {
      if (result.wheel_.isEmpty()) {
        result.wheel_ = new java.util.ArrayList<protobuf_unittest.Wheel>();
      }
      result.wheel_.add(builderForValue.build());
      return this;
    }
    public Builder addAllWheel(
        java.lang.Iterable<? extends protobuf_unittest.Wheel> values) {
      if (result.wheel_.isEmpty()) {
        result.wheel_ = new java.util.ArrayList<protobuf_unittest.Wheel>();
      }
      super.addAll(values, result.wheel_);
      return this;
    }
    public Builder clearWheel() {
      result.wheel_ = java.util.Collections.emptyList();
      return this;
    }
    
    // @@protoc_insertion_point(builder_scope:protobuf_unittest.Vehicle)
  }
  
  static {
    defaultInstance = new Vehicle(true);
    protobuf_unittest.NestedBuilders.internalForceInit();
    defaultInstance.initFields();
  }
  
  // @@protoc_insertion_point(class_scope:protobuf_unittest.Vehicle)
}

