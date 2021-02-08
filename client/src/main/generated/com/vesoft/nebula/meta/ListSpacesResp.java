/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vesoft.nebula.meta;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ListSpacesResp implements TBase, java.io.Serializable, Cloneable, Comparable<ListSpacesResp> {
  private static final TStruct STRUCT_DESC = new TStruct("ListSpacesResp");
  private static final TField CODE_FIELD_DESC = new TField("code", TType.I32, (short)1);
  private static final TField LEADER_FIELD_DESC = new TField("leader", TType.STRUCT, (short)2);
  private static final TField SPACES_FIELD_DESC = new TField("spaces", TType.LIST, (short)3);

  /**
   * 
   * @see ErrorCode
   */
  public int code;
  public com.vesoft.nebula.HostAddr leader;
  public List<IdName> spaces;
  public static final int CODE = 1;
  public static final int LEADER = 2;
  public static final int SPACES = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __CODE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(CODE, new FieldMetaData("code", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(LEADER, new FieldMetaData("leader", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.vesoft.nebula.HostAddr.class)));
    tmpMetaDataMap.put(SPACES, new FieldMetaData("spaces", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new StructMetaData(TType.STRUCT, IdName.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ListSpacesResp.class, metaDataMap);
  }

  public ListSpacesResp() {
  }

  public ListSpacesResp(
    int code,
    com.vesoft.nebula.HostAddr leader,
    List<IdName> spaces)
  {
    this();
    this.code = code;
    setCodeIsSet(true);
    this.leader = leader;
    this.spaces = spaces;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ListSpacesResp(ListSpacesResp other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.code = TBaseHelper.deepCopy(other.code);
    if (other.isSetLeader()) {
      this.leader = TBaseHelper.deepCopy(other.leader);
    }
    if (other.isSetSpaces()) {
      this.spaces = TBaseHelper.deepCopy(other.spaces);
    }
  }

  public ListSpacesResp deepCopy() {
    return new ListSpacesResp(this);
  }

  @Deprecated
  public ListSpacesResp clone() {
    return new ListSpacesResp(this);
  }

  /**
   * 
   * @see ErrorCode
   */
  public int  getCode() {
    return this.code;
  }

  /**
   * 
   * @see ErrorCode
   */
  public ListSpacesResp setCode(int code) {
    this.code = code;
    setCodeIsSet(true);
    return this;
  }

  public void unsetCode() {
    __isset_bit_vector.clear(__CODE_ISSET_ID);
  }

  // Returns true if field code is set (has been assigned a value) and false otherwise
  public boolean isSetCode() {
    return __isset_bit_vector.get(__CODE_ISSET_ID);
  }

  public void setCodeIsSet(boolean value) {
    __isset_bit_vector.set(__CODE_ISSET_ID, value);
  }

  public com.vesoft.nebula.HostAddr  getLeader() {
    return this.leader;
  }

  public ListSpacesResp setLeader(com.vesoft.nebula.HostAddr leader) {
    this.leader = leader;
    return this;
  }

  public void unsetLeader() {
    this.leader = null;
  }

  // Returns true if field leader is set (has been assigned a value) and false otherwise
  public boolean isSetLeader() {
    return this.leader != null;
  }

  public void setLeaderIsSet(boolean value) {
    if (!value) {
      this.leader = null;
    }
  }

  public List<IdName>  getSpaces() {
    return this.spaces;
  }

  public ListSpacesResp setSpaces(List<IdName> spaces) {
    this.spaces = spaces;
    return this;
  }

  public void unsetSpaces() {
    this.spaces = null;
  }

  // Returns true if field spaces is set (has been assigned a value) and false otherwise
  public boolean isSetSpaces() {
    return this.spaces != null;
  }

  public void setSpacesIsSet(boolean value) {
    if (!value) {
      this.spaces = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case CODE:
      if (value == null) {
        unsetCode();
      } else {
        setCode((Integer)value);
      }
      break;

    case LEADER:
      if (value == null) {
        unsetLeader();
      } else {
        setLeader((com.vesoft.nebula.HostAddr)value);
      }
      break;

    case SPACES:
      if (value == null) {
        unsetSpaces();
      } else {
        setSpaces((List<IdName>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case CODE:
      return getCode();

    case LEADER:
      return getLeader();

    case SPACES:
      return getSpaces();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case CODE:
      return isSetCode();
    case LEADER:
      return isSetLeader();
    case SPACES:
      return isSetSpaces();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ListSpacesResp)
      return this.equals((ListSpacesResp)that);
    return false;
  }

  public boolean equals(ListSpacesResp that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_code = true;
    boolean that_present_code = true;
    if (this_present_code || that_present_code) {
      if (!(this_present_code && that_present_code))
        return false;
      if (!TBaseHelper.equalsNobinary(this.code, that.code))
        return false;
    }

    boolean this_present_leader = true && this.isSetLeader();
    boolean that_present_leader = true && that.isSetLeader();
    if (this_present_leader || that_present_leader) {
      if (!(this_present_leader && that_present_leader))
        return false;
      if (!TBaseHelper.equalsNobinary(this.leader, that.leader))
        return false;
    }

    boolean this_present_spaces = true && this.isSetSpaces();
    boolean that_present_spaces = true && that.isSetSpaces();
    if (this_present_spaces || that_present_spaces) {
      if (!(this_present_spaces && that_present_spaces))
        return false;
      if (!TBaseHelper.equalsNobinary(this.spaces, that.spaces))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_code = true;
    builder.append(present_code);
    if (present_code)
      builder.append(code);

    boolean present_leader = true && (isSetLeader());
    builder.append(present_leader);
    if (present_leader)
      builder.append(leader);

    boolean present_spaces = true && (isSetSpaces());
    builder.append(present_spaces);
    if (present_spaces)
      builder.append(spaces);

    return builder.toHashCode();
  }

  @Override
  public int compareTo(ListSpacesResp other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCode()).compareTo(other.isSetCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(code, other.code);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetLeader()).compareTo(other.isSetLeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(leader, other.leader);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetSpaces()).compareTo(other.isSetSpaces());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(spaces, other.spaces);
    if (lastComparison != 0) {
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case CODE:
          if (field.type == TType.I32) {
            this.code = iprot.readI32();
            setCodeIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case LEADER:
          if (field.type == TType.STRUCT) {
            this.leader = new com.vesoft.nebula.HostAddr();
            this.leader.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SPACES:
          if (field.type == TType.LIST) {
            {
              TList _list61 = iprot.readListBegin();
              this.spaces = new ArrayList<IdName>(Math.max(0, _list61.size));
              for (int _i62 = 0; 
                   (_list61.size < 0) ? iprot.peekList() : (_i62 < _list61.size); 
                   ++_i62)
              {
                IdName _elem63;
                _elem63 = new IdName();
                _elem63.read(iprot);
                this.spaces.add(_elem63);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
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
    oprot.writeFieldBegin(CODE_FIELD_DESC);
    oprot.writeI32(this.code);
    oprot.writeFieldEnd();
    if (this.leader != null) {
      oprot.writeFieldBegin(LEADER_FIELD_DESC);
      this.leader.write(oprot);
      oprot.writeFieldEnd();
    }
    if (this.spaces != null) {
      oprot.writeFieldBegin(SPACES_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.STRUCT, this.spaces.size()));
        for (IdName _iter64 : this.spaces)        {
          _iter64.write(oprot);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ListSpacesResp");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("code");
    sb.append(space);
    sb.append(":").append(space);
    String code_name = ErrorCode.VALUES_TO_NAMES.get(this. getCode());
    if (code_name != null) {
      sb.append(code_name);
      sb.append(" (");
    }
    sb.append(this. getCode());
    if (code_name != null) {
      sb.append(")");
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("leader");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getLeader() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getLeader(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("spaces");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getSpaces() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getSpaces(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
    if (isSetCode() && !ErrorCode.VALID_VALUES.contains(code)){
      throw new TProtocolException("The field 'code' has been assigned the invalid value " + code);
    }
  }

}

