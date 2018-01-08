// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox.proto at 95:1
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

public final class RetrievePasswordReq extends Message<RetrievePasswordReq, RetrievePasswordReq.Builder> {
  public static final ProtoAdapter<RetrievePasswordReq> ADAPTER = new ProtoAdapter_RetrievePasswordReq();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ACCOUNT = "";

  public static final ByteString DEFAULT_ANSWER = ByteString.EMPTY;

  public static final ByteString DEFAULT_PASSWORD = ByteString.EMPTY;

  public static final ByteString DEFAULT_RAW_KEY_BY_PASSWORD = ByteString.EMPTY;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String account;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString answer;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString password;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString raw_key_by_password;

  public RetrievePasswordReq(String account, ByteString answer, ByteString password, ByteString raw_key_by_password) {
    this(account, answer, password, raw_key_by_password, ByteString.EMPTY);
  }

  public RetrievePasswordReq(String account, ByteString answer, ByteString password, ByteString raw_key_by_password, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.account = account;
    this.answer = answer;
    this.password = password;
    this.raw_key_by_password = raw_key_by_password;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.account = account;
    builder.answer = answer;
    builder.password = password;
    builder.raw_key_by_password = raw_key_by_password;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof RetrievePasswordReq)) return false;
    RetrievePasswordReq o = (RetrievePasswordReq) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(account, o.account)
        && Internal.equals(answer, o.answer)
        && Internal.equals(password, o.password)
        && Internal.equals(raw_key_by_password, o.raw_key_by_password);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (account != null ? account.hashCode() : 0);
      result = result * 37 + (answer != null ? answer.hashCode() : 0);
      result = result * 37 + (password != null ? password.hashCode() : 0);
      result = result * 37 + (raw_key_by_password != null ? raw_key_by_password.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (account != null) builder.append(", account=").append(account);
    if (answer != null) builder.append(", answer=").append(answer);
    if (password != null) builder.append(", password=").append(password);
    if (raw_key_by_password != null) builder.append(", raw_key_by_password=").append(raw_key_by_password);
    return builder.replace(0, 2, "RetrievePasswordReq{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<RetrievePasswordReq, Builder> {
    public String account;

    public ByteString answer;

    public ByteString password;

    public ByteString raw_key_by_password;

    public Builder() {
    }

    public Builder account(String account) {
      this.account = account;
      return this;
    }

    public Builder answer(ByteString answer) {
      this.answer = answer;
      return this;
    }

    public Builder password(ByteString password) {
      this.password = password;
      return this;
    }

    public Builder raw_key_by_password(ByteString raw_key_by_password) {
      this.raw_key_by_password = raw_key_by_password;
      return this;
    }

    @Override
    public RetrievePasswordReq build() {
      return new RetrievePasswordReq(account, answer, password, raw_key_by_password, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_RetrievePasswordReq extends ProtoAdapter<RetrievePasswordReq> {
    ProtoAdapter_RetrievePasswordReq() {
      super(FieldEncoding.LENGTH_DELIMITED, RetrievePasswordReq.class);
    }

    @Override
    public int encodedSize(RetrievePasswordReq value) {
      return (value.account != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.account) : 0)
          + (value.answer != null ? ProtoAdapter.BYTES.encodedSizeWithTag(2, value.answer) : 0)
          + (value.password != null ? ProtoAdapter.BYTES.encodedSizeWithTag(3, value.password) : 0)
          + (value.raw_key_by_password != null ? ProtoAdapter.BYTES.encodedSizeWithTag(4, value.raw_key_by_password) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, RetrievePasswordReq value) throws IOException {
      if (value.account != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.account);
      if (value.answer != null) ProtoAdapter.BYTES.encodeWithTag(writer, 2, value.answer);
      if (value.password != null) ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.password);
      if (value.raw_key_by_password != null) ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.raw_key_by_password);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public RetrievePasswordReq decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.account(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.answer(ProtoAdapter.BYTES.decode(reader)); break;
          case 3: builder.password(ProtoAdapter.BYTES.decode(reader)); break;
          case 4: builder.raw_key_by_password(ProtoAdapter.BYTES.decode(reader)); break;
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
    public RetrievePasswordReq redact(RetrievePasswordReq value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
