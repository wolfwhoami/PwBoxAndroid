// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 4:1
package com.pw.box.bean.protobuf;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * option java_package = "com.pw.box.bean.protobuf";
 */
public final class DeviceInfo extends Message<DeviceInfo, DeviceInfo.Builder> {
  public static final ProtoAdapter<DeviceInfo> ADAPTER = new ProtoAdapter_DeviceInfo();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_DEVICE_ID = "";

  public static final String DEFAULT_DEVICE_NAME = "";

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_id;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String device_name;

  public DeviceInfo(String device_id, String device_name) {
    this(device_id, device_name, ByteString.EMPTY);
  }

  public DeviceInfo(String device_id, String device_name, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.device_id = device_id;
    this.device_name = device_name;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.device_id = device_id;
    builder.device_name = device_name;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof DeviceInfo)) return false;
    DeviceInfo o = (DeviceInfo) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(device_id, o.device_id)
        && Internal.equals(device_name, o.device_name);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (device_id != null ? device_id.hashCode() : 0);
      result = result * 37 + (device_name != null ? device_name.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (device_id != null) builder.append(", device_id=").append(device_id);
    if (device_name != null) builder.append(", device_name=").append(device_name);
    return builder.replace(0, 2, "DeviceInfo{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<DeviceInfo, Builder> {
    public String device_id;

    public String device_name;

    public Builder() {
    }

    public Builder device_id(String device_id) {
      this.device_id = device_id;
      return this;
    }

    public Builder device_name(String device_name) {
      this.device_name = device_name;
      return this;
    }

    @Override
    public DeviceInfo build() {
      return new DeviceInfo(device_id, device_name, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_DeviceInfo extends ProtoAdapter<DeviceInfo> {
    ProtoAdapter_DeviceInfo() {
      super(FieldEncoding.LENGTH_DELIMITED, DeviceInfo.class);
    }

    @Override
    public int encodedSize(DeviceInfo value) {
      return (value.device_id != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.device_id) : 0)
          + (value.device_name != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.device_name) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, DeviceInfo value) throws IOException {
      if (value.device_id != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.device_id);
      if (value.device_name != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.device_name);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public DeviceInfo decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.device_id(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.device_name(ProtoAdapter.STRING.decode(reader)); break;
          default: {
            FieldEncoding fieldEncoding = reader.peekFieldEncoding();
            Object value = fieldEncoding.rawProtoAdapter().decode(reader);
            builder.addUnknownField(tag, fieldEncoding, value);
          }
        }
      }
      reader.endMessage(token);
      return builder.build();
    }

    @Override
    public DeviceInfo redact(DeviceInfo value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}