// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 45:1
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

public final class RegisterReq extends Message<RegisterReq, RegisterReq.Builder> {
  public static final ProtoAdapter<RegisterReq> ADAPTER = new ProtoAdapter_RegisterReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ACCOUNT = "";

  public static final ByteString DEFAULT_PW_LOGGIN = ByteString.EMPTY;

  public static final ByteString DEFAULT_PW_ENCRYPT = ByteString.EMPTY;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String account;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString pw_loggin;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString pw_encrypt;

  @WireField(
      tag = 4,
      adapter = "com.pw.box.bean.protobuf.DeviceInfo#ADAPTER"
  )
  public final DeviceInfo device_info;

  public RegisterReq(String account, ByteString pw_loggin, ByteString pw_encrypt, DeviceInfo device_info) {
    this(account, pw_loggin, pw_encrypt, device_info, ByteString.EMPTY);
  }

  public RegisterReq(String account, ByteString pw_loggin, ByteString pw_encrypt, DeviceInfo device_info, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.account = account;
    this.pw_loggin = pw_loggin;
    this.pw_encrypt = pw_encrypt;
    this.device_info = device_info;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.account = account;
    builder.pw_loggin = pw_loggin;
    builder.pw_encrypt = pw_encrypt;
    builder.device_info = device_info;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RegisterReq)) return false;
    RegisterReq o = (RegisterReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(account, o.account)
        && Internal.equals(pw_loggin, o.pw_loggin)
        && Internal.equals(pw_encrypt, o.pw_encrypt)
        && Internal.equals(device_info, o.device_info);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (account != null ? account.hashCode() : 0);
      result = result * 37 + (pw_loggin != null ? pw_loggin.hashCode() : 0);
      result = result * 37 + (pw_encrypt != null ? pw_encrypt.hashCode() : 0);
      result = result * 37 + (device_info != null ? device_info.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (account != null) builder.append(", account=").append(account);
    if (pw_loggin != null) builder.append(", pw_loggin=").append(pw_loggin);
    if (pw_encrypt != null) builder.append(", pw_encrypt=").append(pw_encrypt);
    if (device_info != null) builder.append(", device_info=").append(device_info);
    return builder.replace(0, 2, "RegisterReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RegisterReq, Builder> {
    public String account;

    public ByteString pw_loggin;

    public ByteString pw_encrypt;

    public DeviceInfo device_info;

    public Builder() {
    }

    public Builder account(String account) {
      this.account = account;
      return this;
    }

    public Builder pw_loggin(ByteString pw_loggin) {
      this.pw_loggin = pw_loggin;
      return this;
    }

    public Builder pw_encrypt(ByteString pw_encrypt) {
      this.pw_encrypt = pw_encrypt;
      return this;
    }

    public Builder device_info(DeviceInfo device_info) {
      this.device_info = device_info;
      return this;
    }

    @Override
    public RegisterReq build() {
      return new RegisterReq(account, pw_loggin, pw_encrypt, device_info, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RegisterReq extends ProtoAdapter<RegisterReq> {
    ProtoAdapter_RegisterReq() {
      super(FieldEncoding.LENGTH_DELIMITED, RegisterReq.class);
    }

    @Override
    public int encodedSize(RegisterReq value) {
      return (value.account != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.account) : 0)
          + (value.pw_loggin != null ? ProtoAdapter.BYTES.encodedSizeWithTag(2, value.pw_loggin) : 0)
          + (value.pw_encrypt != null ? ProtoAdapter.BYTES.encodedSizeWithTag(3, value.pw_encrypt) : 0)
          + (value.device_info != null ? DeviceInfo.ADAPTER.encodedSizeWithTag(4, value.device_info) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RegisterReq value) throws IOException {
      if (value.account != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.account);
      if (value.pw_loggin != null) ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.pw_loggin);
      if (value.pw_encrypt != null) ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.pw_encrypt);
      if (value.device_info != null) DeviceInfo.ADAPTER.encodeWithTag(writer, 4, value.device_info);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RegisterReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.account(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.pw_loggin(ProtoAdapter.BYTES.decode(reader)); break;
          case 3: builder.pw_encrypt(ProtoAdapter.BYTES.decode(reader)); break;
          case 4: builder.device_info(DeviceInfo.ADAPTER.decode(reader)); break;
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
    public RegisterReq redact(RegisterReq value) {
      Builder builder = value.newBuilder();
      if (builder.device_info != null) builder.device_info = DeviceInfo.ADAPTER.redact(builder.device_info);
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}