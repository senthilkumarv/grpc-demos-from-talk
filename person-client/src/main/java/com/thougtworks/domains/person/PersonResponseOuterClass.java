// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domains/person/person_response.proto

package com.thougtworks.domains.person;

public final class PersonResponseOuterClass {
  private PersonResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_domains_person_PersonResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_domains_person_PersonResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$domains/person/person_response.proto\022\016" +
      "domains.person\032\033domains/person/person.pr" +
      "oto\032\032domains/common/error.proto\"l\n\016Perso" +
      "nResponse\022(\n\006person\030\001 \001(\0132\026.domains.pers" +
      "on.PersonH\000\022&\n\005error\030\002 \001(\0132\025.domains.com" +
      "mon.ErrorH\000B\010\n\006resultB\"\n\036com.thougtworks" +
      ".domains.personP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.thougtworks.domains.person.PersonOuterClass.getDescriptor(),
          com.thougtworks.domains.common.ErrorOuterClass.getDescriptor(),
        });
    internal_static_domains_person_PersonResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_domains_person_PersonResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_domains_person_PersonResponse_descriptor,
        new java.lang.String[] { "Person", "Error", "Result", });
    com.thougtworks.domains.person.PersonOuterClass.getDescriptor();
    com.thougtworks.domains.common.ErrorOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
