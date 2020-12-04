// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domains/person/phone_type.proto

package com.kroger.domains.person;

public final class PhoneTypeOuterClass {
  private PhoneTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code domains.person.PhoneType}
   */
  public enum PhoneType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>MOBILE = 0;</code>
     */
    MOBILE(0),
    /**
     * <code>WORK = 1;</code>
     */
    WORK(1),
    /**
     * <code>HOME = 2;</code>
     */
    HOME(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>MOBILE = 0;</code>
     */
    public static final int MOBILE_VALUE = 0;
    /**
     * <code>WORK = 1;</code>
     */
    public static final int WORK_VALUE = 1;
    /**
     * <code>HOME = 2;</code>
     */
    public static final int HOME_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static PhoneType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PhoneType forNumber(int value) {
      switch (value) {
        case 0: return MOBILE;
        case 1: return WORK;
        case 2: return HOME;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PhoneType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PhoneType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PhoneType>() {
            public PhoneType findValueByNumber(int number) {
              return PhoneType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.kroger.domains.person.PhoneTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final PhoneType[] VALUES = values();

    public static PhoneType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private PhoneType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:domains.person.PhoneType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037domains/person/phone_type.proto\022\016domai" +
      "ns.person*+\n\tPhoneType\022\n\n\006MOBILE\020\000\022\010\n\004WO" +
      "RK\020\001\022\010\n\004HOME\020\002B\033\n\031com.kroger.domains.per" +
      "sonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
