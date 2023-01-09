// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface LocalizedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.LocalizedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 513150554;</code>
   * @return Whether the locale field is set.
   */
  boolean hasLocale();
  /**
   * <pre>
   * The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 513150554;</code>
   * @return The locale.
   */
  java.lang.String getLocale();
  /**
   * <pre>
   * The locale used following the specification defined at https://www.rfc-editor.org/rfc/bcp/bcp47.txt. Examples are: "en-US", "fr-CH", "es-MX"
   * </pre>
   *
   * <code>optional string locale = 513150554;</code>
   * @return The bytes for locale.
   */
  com.google.protobuf.ByteString
      getLocaleBytes();

  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * The localized error message in the above locale.
   * </pre>
   *
   * <code>optional string message = 418054151;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}
