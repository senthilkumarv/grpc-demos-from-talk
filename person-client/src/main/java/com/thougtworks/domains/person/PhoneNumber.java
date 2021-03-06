// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domains/person/phone_number.proto

package com.thougtworks.domains.person;

/**
 * Protobuf type {@code domains.person.PhoneNumber}
 */
public  final class PhoneNumber extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:domains.person.PhoneNumber)
    PhoneNumberOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PhoneNumber.newBuilder() to construct.
  private PhoneNumber(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PhoneNumber() {
    phoneType_ = 0;
    number_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PhoneNumber();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PhoneNumber(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            int rawValue = input.readEnum();

            phoneType_ = rawValue;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            number_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.thougtworks.domains.person.PhoneNumberOuterClass.internal_static_domains_person_PhoneNumber_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.thougtworks.domains.person.PhoneNumberOuterClass.internal_static_domains_person_PhoneNumber_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.thougtworks.domains.person.PhoneNumber.class, com.thougtworks.domains.person.PhoneNumber.Builder.class);
  }

  public static final int PHONE_TYPE_FIELD_NUMBER = 1;
  private int phoneType_;
  /**
   * <code>.domains.person.PhoneType phone_type = 1;</code>
   * @return The enum numeric value on the wire for phoneType.
   */
  public int getPhoneTypeValue() {
    return phoneType_;
  }
  /**
   * <code>.domains.person.PhoneType phone_type = 1;</code>
   * @return The phoneType.
   */
  public com.thougtworks.domains.person.PhoneType getPhoneType() {
    @SuppressWarnings("deprecation")
    com.thougtworks.domains.person.PhoneType result = com.thougtworks.domains.person.PhoneType.valueOf(phoneType_);
    return result == null ? com.thougtworks.domains.person.PhoneType.UNRECOGNIZED : result;
  }

  public static final int NUMBER_FIELD_NUMBER = 2;
  private volatile java.lang.Object number_;
  /**
   * <code>string number = 2;</code>
   * @return The number.
   */
  public java.lang.String getNumber() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      number_ = s;
      return s;
    }
  }
  /**
   * <code>string number = 2;</code>
   * @return The bytes for number.
   */
  public com.google.protobuf.ByteString
      getNumberBytes() {
    java.lang.Object ref = number_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      number_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (phoneType_ != com.thougtworks.domains.person.PhoneType.MOBILE.getNumber()) {
      output.writeEnum(1, phoneType_);
    }
    if (!getNumberBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, number_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (phoneType_ != com.thougtworks.domains.person.PhoneType.MOBILE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, phoneType_);
    }
    if (!getNumberBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, number_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.thougtworks.domains.person.PhoneNumber)) {
      return super.equals(obj);
    }
    com.thougtworks.domains.person.PhoneNumber other = (com.thougtworks.domains.person.PhoneNumber) obj;

    if (phoneType_ != other.phoneType_) return false;
    if (!getNumber()
        .equals(other.getNumber())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PHONE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + phoneType_;
    hash = (37 * hash) + NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getNumber().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.thougtworks.domains.person.PhoneNumber parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.thougtworks.domains.person.PhoneNumber prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code domains.person.PhoneNumber}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:domains.person.PhoneNumber)
      com.thougtworks.domains.person.PhoneNumberOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.thougtworks.domains.person.PhoneNumberOuterClass.internal_static_domains_person_PhoneNumber_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.thougtworks.domains.person.PhoneNumberOuterClass.internal_static_domains_person_PhoneNumber_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.thougtworks.domains.person.PhoneNumber.class, com.thougtworks.domains.person.PhoneNumber.Builder.class);
    }

    // Construct using com.thougtworks.domains.person.PhoneNumber.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      phoneType_ = 0;

      number_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.thougtworks.domains.person.PhoneNumberOuterClass.internal_static_domains_person_PhoneNumber_descriptor;
    }

    @java.lang.Override
    public com.thougtworks.domains.person.PhoneNumber getDefaultInstanceForType() {
      return com.thougtworks.domains.person.PhoneNumber.getDefaultInstance();
    }

    @java.lang.Override
    public com.thougtworks.domains.person.PhoneNumber build() {
      com.thougtworks.domains.person.PhoneNumber result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.thougtworks.domains.person.PhoneNumber buildPartial() {
      com.thougtworks.domains.person.PhoneNumber result = new com.thougtworks.domains.person.PhoneNumber(this);
      result.phoneType_ = phoneType_;
      result.number_ = number_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.thougtworks.domains.person.PhoneNumber) {
        return mergeFrom((com.thougtworks.domains.person.PhoneNumber)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.thougtworks.domains.person.PhoneNumber other) {
      if (other == com.thougtworks.domains.person.PhoneNumber.getDefaultInstance()) return this;
      if (other.phoneType_ != 0) {
        setPhoneTypeValue(other.getPhoneTypeValue());
      }
      if (!other.getNumber().isEmpty()) {
        number_ = other.number_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.thougtworks.domains.person.PhoneNumber parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.thougtworks.domains.person.PhoneNumber) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int phoneType_ = 0;
    /**
     * <code>.domains.person.PhoneType phone_type = 1;</code>
     * @return The enum numeric value on the wire for phoneType.
     */
    public int getPhoneTypeValue() {
      return phoneType_;
    }
    /**
     * <code>.domains.person.PhoneType phone_type = 1;</code>
     * @param value The enum numeric value on the wire for phoneType to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneTypeValue(int value) {
      phoneType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.domains.person.PhoneType phone_type = 1;</code>
     * @return The phoneType.
     */
    public com.thougtworks.domains.person.PhoneType getPhoneType() {
      @SuppressWarnings("deprecation")
      com.thougtworks.domains.person.PhoneType result = com.thougtworks.domains.person.PhoneType.valueOf(phoneType_);
      return result == null ? com.thougtworks.domains.person.PhoneType.UNRECOGNIZED : result;
    }
    /**
     * <code>.domains.person.PhoneType phone_type = 1;</code>
     * @param value The phoneType to set.
     * @return This builder for chaining.
     */
    public Builder setPhoneType(com.thougtworks.domains.person.PhoneType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      phoneType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.domains.person.PhoneType phone_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPhoneType() {
      
      phoneType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object number_ = "";
    /**
     * <code>string number = 2;</code>
     * @return The number.
     */
    public java.lang.String getNumber() {
      java.lang.Object ref = number_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        number_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string number = 2;</code>
     * @return The bytes for number.
     */
    public com.google.protobuf.ByteString
        getNumberBytes() {
      java.lang.Object ref = number_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        number_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string number = 2;</code>
     * @param value The number to set.
     * @return This builder for chaining.
     */
    public Builder setNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      number_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string number = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumber() {
      
      number_ = getDefaultInstance().getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string number = 2;</code>
     * @param value The bytes for number to set.
     * @return This builder for chaining.
     */
    public Builder setNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      number_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:domains.person.PhoneNumber)
  }

  // @@protoc_insertion_point(class_scope:domains.person.PhoneNumber)
  private static final com.thougtworks.domains.person.PhoneNumber DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.thougtworks.domains.person.PhoneNumber();
  }

  public static com.thougtworks.domains.person.PhoneNumber getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PhoneNumber>
      PARSER = new com.google.protobuf.AbstractParser<PhoneNumber>() {
    @java.lang.Override
    public PhoneNumber parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PhoneNumber(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PhoneNumber> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PhoneNumber> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.thougtworks.domains.person.PhoneNumber getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

