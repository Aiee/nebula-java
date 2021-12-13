/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class VerifyClientVersionReq implements TBase, java.io.Serializable, Cloneable, Comparable<VerifyClientVersionReq> {
  private static final TStruct STRUCT_DESC = new TStruct("VerifyClientVersionReq");
  private static final TField VERSION_FIELD_DESC = new TField("version", TType.STRING, (short)1);
  private static final TField HOST_FIELD_DESC = new TField("host", TType.STRUCT, (short)2);

  public byte[] version;
  public com.vesoft.nebula.HostAddr host;
  public static final int VERSION = 1;
  public static final int HOST = 2;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(VERSION, new FieldMetaData("version", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(HOST, new FieldMetaData("host", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(VerifyClientVersionReq.class, metaDataMap);
  }

  public VerifyClientVersionReq() {
    this.version = "2.6.0".getBytes();

  }

  public VerifyClientVersionReq(
      byte[] version) {
    this();
    this.version = version;
  }

  public VerifyClientVersionReq(
      byte[] version,
      com.vesoft.nebula.HostAddr host) {
    this();
    this.version = version;
    this.host = host;
  }

  public static class Builder {
    private byte[] version;
    private com.vesoft.nebula.HostAddr host;

    public Builder() {
    }

    public Builder setVersion(final byte[] version) {
      this.version = version;
      return this;
    }

    public Builder setHost(final com.vesoft.nebula.HostAddr host) {
      this.host = host;
      return this;
    }

    public VerifyClientVersionReq build() {
      VerifyClientVersionReq result = new VerifyClientVersionReq();
      result.setVersion(this.version);
      result.setHost(this.host);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public VerifyClientVersionReq(VerifyClientVersionReq other) {
    if (other.isSetVersion()) {
      this.version = TBaseHelper.deepCopy(other.version);
    }
    if (other.isSetHost()) {
      this.host = TBaseHelper.deepCopy(other.host);
    }
  }

  public VerifyClientVersionReq deepCopy() {
    return new VerifyClientVersionReq(this);
  }

  public byte[] getVersion() {
    return this.version;
  }

  public VerifyClientVersionReq setVersion(byte[] version) {
    this.version = version;
    return this;
  }

  public void unsetVersion() {
    this.version = null;
  }

  // Returns true if field version is set (has been assigned a value) and false otherwise
  public boolean isSetVersion() {
    return this.version != null;
  }

  public void setVersionIsSet(boolean __value) {
    if (!__value) {
      this.version = null;
    }
  }

  public com.vesoft.nebula.HostAddr getHost() {
    return this.host;
  }

  public VerifyClientVersionReq setHost(com.vesoft.nebula.HostAddr host) {
    this.host = host;
    return this;
  }

  public void unsetHost() {
    this.host = null;
  }

  // Returns true if field host is set (has been assigned a value) and false otherwise
  public boolean isSetHost() {
    return this.host != null;
  }

  public void setHostIsSet(boolean __value) {
    if (!__value) {
      this.host = null;
    }
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case VERSION:
      if (__value == null) {
        unsetVersion();
      } else {
        setVersion((byte[])__value);
      }
      break;

    case HOST:
      if (__value == null) {
        unsetHost();
      } else {
        setHost((com.vesoft.nebula.HostAddr)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case VERSION:
      return getVersion();

    case HOST:
      return getHost();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof VerifyClientVersionReq))
      return false;
    VerifyClientVersionReq that = (VerifyClientVersionReq)_that;

    if (!TBaseHelper.equalsSlow(this.isSetVersion(), that.isSetVersion(), this.version, that.version)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetHost(), that.isSetHost(), this.host, that.host)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {version, host});
  }

  @Override
  public int compareTo(VerifyClientVersionReq other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetVersion()).compareTo(other.isSetVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(version, other.version);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetHost()).compareTo(other.isSetHost());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(host, other.host);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) { 
        break;
      }
      switch (__field.id)
      {
        case VERSION:
          if (__field.type == TType.STRING) {
            this.version = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case HOST:
          if (__field.type == TType.STRUCT) {
            this.host = new com.vesoft.nebula.HostAddr();
            this.host.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.version != null) {
      oprot.writeFieldBegin(VERSION_FIELD_DESC);
      oprot.writeBinary(this.version);
      oprot.writeFieldEnd();
    }
    if (this.host != null) {
      oprot.writeFieldBegin(HOST_FIELD_DESC);
      this.host.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("VerifyClientVersionReq");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("version");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getVersion() == null) {
      sb.append("null");
    } else {
        int __version_size = Math.min(this.getVersion().length, 128);
        for (int i = 0; i < __version_size; i++) {
          if (i != 0) sb.append(" ");
          sb.append(Integer.toHexString(this.getVersion()[i]).length() > 1 ? Integer.toHexString(this.getVersion()[i]).substring(Integer.toHexString(this.getVersion()[i]).length() - 2).toUpperCase() : "0" + Integer.toHexString(this.getVersion()[i]).toUpperCase());
        }
        if (this.getVersion().length > 128) sb.append(" ...");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("host");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getHost() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getHost(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (version == null) {
      throw new TProtocolException(TProtocolException.MISSING_REQUIRED_FIELD, "Required field 'version' was not present! Struct: " + toString());
    }
  }

}

