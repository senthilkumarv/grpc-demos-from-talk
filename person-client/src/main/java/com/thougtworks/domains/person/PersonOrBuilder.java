// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domains/person/person.proto

package com.thougtworks.domains.person;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:domains.person.Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string first_name = 2;</code>
   * @return The firstName.
   */
  java.lang.String getFirstName();
  /**
   * <code>string first_name = 2;</code>
   * @return The bytes for firstName.
   */
  com.google.protobuf.ByteString
      getFirstNameBytes();

  /**
   * <code>string last_name = 3;</code>
   * @return The lastName.
   */
  java.lang.String getLastName();
  /**
   * <code>string last_name = 3;</code>
   * @return The bytes for lastName.
   */
  com.google.protobuf.ByteString
      getLastNameBytes();

  /**
   * <code>string email = 4;</code>
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   * <code>string email = 4;</code>
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString
      getEmailBytes();

  /**
   * <code>repeated .domains.person.PhoneNumber phone_numbers = 5;</code>
   */
  java.util.List<com.thougtworks.domains.person.PhoneNumber> 
      getPhoneNumbersList();
  /**
   * <code>repeated .domains.person.PhoneNumber phone_numbers = 5;</code>
   */
  com.thougtworks.domains.person.PhoneNumber getPhoneNumbers(int index);
  /**
   * <code>repeated .domains.person.PhoneNumber phone_numbers = 5;</code>
   */
  int getPhoneNumbersCount();
  /**
   * <code>repeated .domains.person.PhoneNumber phone_numbers = 5;</code>
   */
  java.util.List<? extends com.thougtworks.domains.person.PhoneNumberOrBuilder> 
      getPhoneNumbersOrBuilderList();
  /**
   * <code>repeated .domains.person.PhoneNumber phone_numbers = 5;</code>
   */
  com.thougtworks.domains.person.PhoneNumberOrBuilder getPhoneNumbersOrBuilder(
      int index);

  /**
   * <code>bool active = 6;</code>
   * @return The active.
   */
  boolean getActive();
}