// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: pwbox_cli.proto at 4:1
package com.pw.box.bean.protobuf.cli;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

/**
 * option java_package = "com.pw.box.bean.protobuf";
 */
public final class SaveKey extends Message<SaveKey, SaveKey.Builder> {
  public static final ProtoAdapter<SaveKey> ADAPTER = new ProtoAdapter_SaveKey();

  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_ACCOUNT = "";

  public static final String DEFAULT_KEY_MD5 = "";

  public static final ByteString DEFAULT_PW1 = ByteString.EMPTY;

  public static final ByteString DEFAULT_PW2 = ByteString.EMPTY;

  public static final Integer DEFAULT_GET_LINE_COUNT = 0;

  @WireField(
      tag = 1,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String account;

  @WireField(
      tag = 2,
      adapter = "com.squareup.wire.ProtoAdapter#STRING"
  )
  public final String key_md5;

  @WireField(
      tag = 3,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString pw1;

  @WireField(
      tag = 4,
      adapter = "com.squareup.wire.ProtoAdapter#BYTES"
  )
  public final ByteString pw2;

  @WireField(
      tag = 5,
      adapter = "com.squareup.wire.ProtoAdapter#INT32"
  )
  public final Integer get_line_count;

  public SaveKey(String account, String key_md5, ByteString pw1, ByteString pw2, Integer get_line_count) {
    this(account, key_md5, pw1, pw2, get_line_count, ByteString.EMPTY);
  }

  public SaveKey(String account, String key_md5, ByteString pw1, ByteString pw2, Integer get_line_count, ByteString unknownFields) {
    super(ADAPTER, unknownFields);
    this.account = account;
    this.key_md5 = key_md5;
    this.pw1 = pw1;
    this.pw2 = pw2;
    this.get_line_count = get_line_count;
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.account = account;
    builder.key_md5 = key_md5;
    builder.pw1 = pw1;
    builder.pw2 = pw2;
    builder.get_line_count = get_line_count;
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof SaveKey)) return false;
    SaveKey o = (SaveKey) other;
    return unknownFields().equals(o.unknownFields())
        && Internal.equals(account, o.account)
        && Internal.equals(key_md5, o.key_md5)
        && Internal.equals(pw1, o.pw1)
        && Internal.equals(pw2, o.pw2)
        && Internal.equals(get_line_count, o.get_line_count);
  }

  @Override
  public int hashCode() {
    int result = super.hashCode;
    if (result == 0) {
      result = unknownFields().hashCode();
      result = result * 37 + (account != null ? account.hashCode() : 0);
      result = result * 37 + (key_md5 != null ? key_md5.hashCode() : 0);
      result = result * 37 + (pw1 != null ? pw1.hashCode() : 0);
      result = result * 37 + (pw2 != null ? pw2.hashCode() : 0);
      result = result * 37 + (get_line_count != null ? get_line_count.hashCode() : 0);
      super.hashCode = result;
    }
    return result;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    if (account != null) builder.append(", account=").append(account);
    if (key_md5 != null) builder.append(", key_md5=").append(key_md5);
    if (pw1 != null) builder.append(", pw1=").append(pw1);
    if (pw2 != null) builder.append(", pw2=").append(pw2);
    if (get_line_count != null) builder.append(", get_line_count=").append(get_line_count);
    return builder.replace(0, 2, "SaveKey{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<SaveKey, Builder> {
    public String account;

    public String key_md5;

    public ByteString pw1;

    public ByteString pw2;

    public Integer get_line_count;

    public Builder() {
    }

    public Builder account(String account) {
      this.account = account;
      return this;
    }

    public Builder key_md5(String key_md5) {
      this.key_md5 = key_md5;
      return this;
    }

    public Builder pw1(ByteString pw1) {
      this.pw1 = pw1;
      return this;
    }

    public Builder pw2(ByteString pw2) {
      this.pw2 = pw2;
      return this;
    }

    public Builder get_line_count(Integer get_line_count) {
      this.get_line_count = get_line_count;
      return this;
    }

    @Override
    public SaveKey build() {
      return new SaveKey(account, key_md5, pw1, pw2, get_line_count, super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_SaveKey extends ProtoAdapter<SaveKey> {
    ProtoAdapter_SaveKey() {
      super(FieldEncoding.LENGTH_DELIMITED, SaveKey.class);
    }

    @Override
    public int encodedSize(SaveKey value) {
      return (value.account != null ? ProtoAdapter.STRING.encodedSizeWithTag(1, value.account) : 0)
          + (value.key_md5 != null ? ProtoAdapter.STRING.encodedSizeWithTag(2, value.key_md5) : 0)
          + (value.pw1 != null ? ProtoAdapter.BYTES.encodedSizeWithTag(3, value.pw1) : 0)
          + (value.pw2 != null ? ProtoAdapter.BYTES.encodedSizeWithTag(4, value.pw2) : 0)
          + (value.get_line_count != null ? ProtoAdapter.INT32.encodedSizeWithTag(5, value.get_line_count) : 0)
          + value.unknownFields().size();
    }

    @Override
    public void encode(ProtoWriter writer, SaveKey value) throws IOException {
      if (value.account != null) ProtoAdapter.STRING.encodeWithTag(writer, 1, value.account);
      if (value.key_md5 != null) ProtoAdapter.STRING.encodeWithTag(writer, 2, value.key_md5);
      if (value.pw1 != null) ProtoAdapter.BYTES.encodeWithTag(writer, 3, value.pw1);
      if (value.pw2 != null) ProtoAdapter.BYTES.encodeWithTag(writer, 4, value.pw2);
      if (value.get_line_count != null) ProtoAdapter.INT32.encodeWithTag(writer, 5, value.get_line_count);
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public SaveKey decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          case 1: builder.account(ProtoAdapter.STRING.decode(reader)); break;
          case 2: builder.key_md5(ProtoAdapter.STRING.decode(reader)); break;
          case 3: builder.pw1(ProtoAdapter.BYTES.decode(reader)); break;
          case 4: builder.pw2(ProtoAdapter.BYTES.decode(reader)); break;
          case 5: builder.get_line_count(ProtoAdapter.INT32.decode(reader)); break;
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
    public SaveKey redact(SaveKey value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
