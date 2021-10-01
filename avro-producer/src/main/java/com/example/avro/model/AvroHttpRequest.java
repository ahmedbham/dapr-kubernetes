/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.example.avro.model;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class AvroHttpRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8360045382246567310L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroHttpRequest\",\"namespace\":\"com.example.avro.model\",\"fields\":[{\"name\":\"requestTime\",\"type\":\"long\"},{\"name\":\"clientIdentifier\",\"type\":{\"type\":\"record\",\"name\":\"ClientIdentifier\",\"fields\":[{\"name\":\"hostName\",\"type\":\"string\"},{\"name\":\"ipAddress\",\"type\":\"string\"}]}},{\"name\":\"employeeNames\",\"type\":{\"type\":\"array\",\"items\":\"string\"}},{\"name\":\"active\",\"type\":{\"type\":\"enum\",\"name\":\"Active\",\"symbols\":[\"YES\",\"NO\"]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroHttpRequest> ENCODER =
      new BinaryMessageEncoder<AvroHttpRequest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroHttpRequest> DECODER =
      new BinaryMessageDecoder<AvroHttpRequest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<AvroHttpRequest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<AvroHttpRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<AvroHttpRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroHttpRequest>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this AvroHttpRequest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a AvroHttpRequest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a AvroHttpRequest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static AvroHttpRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

   private long requestTime;
   private com.example.avro.model.ClientIdentifier clientIdentifier;
   private java.util.List<java.lang.CharSequence> employeeNames;
   private com.example.avro.model.Active active;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroHttpRequest() {}

  /**
   * All-args constructor.
   * @param requestTime The new value for requestTime
   * @param clientIdentifier The new value for clientIdentifier
   * @param employeeNames The new value for employeeNames
   * @param active The new value for active
   */
  public AvroHttpRequest(java.lang.Long requestTime, com.example.avro.model.ClientIdentifier clientIdentifier, java.util.List<java.lang.CharSequence> employeeNames, com.example.avro.model.Active active) {
    this.requestTime = requestTime;
    this.clientIdentifier = clientIdentifier;
    this.employeeNames = employeeNames;
    this.active = active;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return requestTime;
    case 1: return clientIdentifier;
    case 2: return employeeNames;
    case 3: return active;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: requestTime = (java.lang.Long)value$; break;
    case 1: clientIdentifier = (com.example.avro.model.ClientIdentifier)value$; break;
    case 2: employeeNames = (java.util.List<java.lang.CharSequence>)value$; break;
    case 3: active = (com.example.avro.model.Active)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'requestTime' field.
   * @return The value of the 'requestTime' field.
   */
  public long getRequestTime() {
    return requestTime;
  }


  /**
   * Sets the value of the 'requestTime' field.
   * @param value the value to set.
   */
  public void setRequestTime(long value) {
    this.requestTime = value;
  }

  /**
   * Gets the value of the 'clientIdentifier' field.
   * @return The value of the 'clientIdentifier' field.
   */
  public com.example.avro.model.ClientIdentifier getClientIdentifier() {
    return clientIdentifier;
  }


  /**
   * Sets the value of the 'clientIdentifier' field.
   * @param value the value to set.
   */
  public void setClientIdentifier(com.example.avro.model.ClientIdentifier value) {
    this.clientIdentifier = value;
  }

  /**
   * Gets the value of the 'employeeNames' field.
   * @return The value of the 'employeeNames' field.
   */
  public java.util.List<java.lang.CharSequence> getEmployeeNames() {
    return employeeNames;
  }


  /**
   * Sets the value of the 'employeeNames' field.
   * @param value the value to set.
   */
  public void setEmployeeNames(java.util.List<java.lang.CharSequence> value) {
    this.employeeNames = value;
  }

  /**
   * Gets the value of the 'active' field.
   * @return The value of the 'active' field.
   */
  public com.example.avro.model.Active getActive() {
    return active;
  }


  /**
   * Sets the value of the 'active' field.
   * @param value the value to set.
   */
  public void setActive(com.example.avro.model.Active value) {
    this.active = value;
  }

  /**
   * Creates a new AvroHttpRequest RecordBuilder.
   * @return A new AvroHttpRequest RecordBuilder
   */
  public static com.example.avro.model.AvroHttpRequest.Builder newBuilder() {
    return new com.example.avro.model.AvroHttpRequest.Builder();
  }

  /**
   * Creates a new AvroHttpRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroHttpRequest RecordBuilder
   */
  public static com.example.avro.model.AvroHttpRequest.Builder newBuilder(com.example.avro.model.AvroHttpRequest.Builder other) {
    if (other == null) {
      return new com.example.avro.model.AvroHttpRequest.Builder();
    } else {
      return new com.example.avro.model.AvroHttpRequest.Builder(other);
    }
  }

  /**
   * Creates a new AvroHttpRequest RecordBuilder by copying an existing AvroHttpRequest instance.
   * @param other The existing instance to copy.
   * @return A new AvroHttpRequest RecordBuilder
   */
  public static com.example.avro.model.AvroHttpRequest.Builder newBuilder(com.example.avro.model.AvroHttpRequest other) {
    if (other == null) {
      return new com.example.avro.model.AvroHttpRequest.Builder();
    } else {
      return new com.example.avro.model.AvroHttpRequest.Builder(other);
    }
  }

  /**
   * RecordBuilder for AvroHttpRequest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroHttpRequest>
    implements org.apache.avro.data.RecordBuilder<AvroHttpRequest> {

    private long requestTime;
    private com.example.avro.model.ClientIdentifier clientIdentifier;
    private com.example.avro.model.ClientIdentifier.Builder clientIdentifierBuilder;
    private java.util.List<java.lang.CharSequence> employeeNames;
    private com.example.avro.model.Active active;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.example.avro.model.AvroHttpRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.requestTime)) {
        this.requestTime = data().deepCopy(fields()[0].schema(), other.requestTime);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.clientIdentifier)) {
        this.clientIdentifier = data().deepCopy(fields()[1].schema(), other.clientIdentifier);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (other.hasClientIdentifierBuilder()) {
        this.clientIdentifierBuilder = com.example.avro.model.ClientIdentifier.newBuilder(other.getClientIdentifierBuilder());
      }
      if (isValidValue(fields()[2], other.employeeNames)) {
        this.employeeNames = data().deepCopy(fields()[2].schema(), other.employeeNames);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
      if (isValidValue(fields()[3], other.active)) {
        this.active = data().deepCopy(fields()[3].schema(), other.active);
        fieldSetFlags()[3] = other.fieldSetFlags()[3];
      }
    }

    /**
     * Creates a Builder by copying an existing AvroHttpRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.example.avro.model.AvroHttpRequest other) {
      super(SCHEMA$);
      if (isValidValue(fields()[0], other.requestTime)) {
        this.requestTime = data().deepCopy(fields()[0].schema(), other.requestTime);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.clientIdentifier)) {
        this.clientIdentifier = data().deepCopy(fields()[1].schema(), other.clientIdentifier);
        fieldSetFlags()[1] = true;
      }
      this.clientIdentifierBuilder = null;
      if (isValidValue(fields()[2], other.employeeNames)) {
        this.employeeNames = data().deepCopy(fields()[2].schema(), other.employeeNames);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.active)) {
        this.active = data().deepCopy(fields()[3].schema(), other.active);
        fieldSetFlags()[3] = true;
      }
    }

    /**
      * Gets the value of the 'requestTime' field.
      * @return The value.
      */
    public long getRequestTime() {
      return requestTime;
    }


    /**
      * Sets the value of the 'requestTime' field.
      * @param value The value of 'requestTime'.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder setRequestTime(long value) {
      validate(fields()[0], value);
      this.requestTime = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'requestTime' field has been set.
      * @return True if the 'requestTime' field has been set, false otherwise.
      */
    public boolean hasRequestTime() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'requestTime' field.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder clearRequestTime() {
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'clientIdentifier' field.
      * @return The value.
      */
    public com.example.avro.model.ClientIdentifier getClientIdentifier() {
      return clientIdentifier;
    }


    /**
      * Sets the value of the 'clientIdentifier' field.
      * @param value The value of 'clientIdentifier'.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder setClientIdentifier(com.example.avro.model.ClientIdentifier value) {
      validate(fields()[1], value);
      this.clientIdentifierBuilder = null;
      this.clientIdentifier = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'clientIdentifier' field has been set.
      * @return True if the 'clientIdentifier' field has been set, false otherwise.
      */
    public boolean hasClientIdentifier() {
      return fieldSetFlags()[1];
    }

    /**
     * Gets the Builder instance for the 'clientIdentifier' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.example.avro.model.ClientIdentifier.Builder getClientIdentifierBuilder() {
      if (clientIdentifierBuilder == null) {
        if (hasClientIdentifier()) {
          setClientIdentifierBuilder(com.example.avro.model.ClientIdentifier.newBuilder(clientIdentifier));
        } else {
          setClientIdentifierBuilder(com.example.avro.model.ClientIdentifier.newBuilder());
        }
      }
      return clientIdentifierBuilder;
    }

    /**
     * Sets the Builder instance for the 'clientIdentifier' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.example.avro.model.AvroHttpRequest.Builder setClientIdentifierBuilder(com.example.avro.model.ClientIdentifier.Builder value) {
      clearClientIdentifier();
      clientIdentifierBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'clientIdentifier' field has an active Builder instance
     * @return True if the 'clientIdentifier' field has an active Builder instance
     */
    public boolean hasClientIdentifierBuilder() {
      return clientIdentifierBuilder != null;
    }

    /**
      * Clears the value of the 'clientIdentifier' field.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder clearClientIdentifier() {
      clientIdentifier = null;
      clientIdentifierBuilder = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'employeeNames' field.
      * @return The value.
      */
    public java.util.List<java.lang.CharSequence> getEmployeeNames() {
      return employeeNames;
    }


    /**
      * Sets the value of the 'employeeNames' field.
      * @param value The value of 'employeeNames'.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder setEmployeeNames(java.util.List<java.lang.CharSequence> value) {
      validate(fields()[2], value);
      this.employeeNames = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'employeeNames' field has been set.
      * @return True if the 'employeeNames' field has been set, false otherwise.
      */
    public boolean hasEmployeeNames() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'employeeNames' field.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder clearEmployeeNames() {
      employeeNames = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'active' field.
      * @return The value.
      */
    public com.example.avro.model.Active getActive() {
      return active;
    }


    /**
      * Sets the value of the 'active' field.
      * @param value The value of 'active'.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder setActive(com.example.avro.model.Active value) {
      validate(fields()[3], value);
      this.active = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'active' field has been set.
      * @return True if the 'active' field has been set, false otherwise.
      */
    public boolean hasActive() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'active' field.
      * @return This builder.
      */
    public com.example.avro.model.AvroHttpRequest.Builder clearActive() {
      active = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroHttpRequest build() {
      try {
        AvroHttpRequest record = new AvroHttpRequest();
        record.requestTime = fieldSetFlags()[0] ? this.requestTime : (java.lang.Long) defaultValue(fields()[0]);
        if (clientIdentifierBuilder != null) {
          try {
            record.clientIdentifier = this.clientIdentifierBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("clientIdentifier"));
            throw e;
          }
        } else {
          record.clientIdentifier = fieldSetFlags()[1] ? this.clientIdentifier : (com.example.avro.model.ClientIdentifier) defaultValue(fields()[1]);
        }
        record.employeeNames = fieldSetFlags()[2] ? this.employeeNames : (java.util.List<java.lang.CharSequence>) defaultValue(fields()[2]);
        record.active = fieldSetFlags()[3] ? this.active : (com.example.avro.model.Active) defaultValue(fields()[3]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroHttpRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroHttpRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroHttpRequest>
    READER$ = (org.apache.avro.io.DatumReader<AvroHttpRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeLong(this.requestTime);

    this.clientIdentifier.customEncode(out);

    long size0 = this.employeeNames.size();
    out.writeArrayStart();
    out.setItemCount(size0);
    long actualSize0 = 0;
    for (java.lang.CharSequence e0: this.employeeNames) {
      actualSize0++;
      out.startItem();
      out.writeString(e0);
    }
    out.writeArrayEnd();
    if (actualSize0 != size0)
      throw new java.util.ConcurrentModificationException("Array-size written was " + size0 + ", but element count was " + actualSize0 + ".");

    out.writeEnum(this.active.ordinal());

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.requestTime = in.readLong();

      if (this.clientIdentifier == null) {
        this.clientIdentifier = new com.example.avro.model.ClientIdentifier();
      }
      this.clientIdentifier.customDecode(in);

      long size0 = in.readArrayStart();
      java.util.List<java.lang.CharSequence> a0 = this.employeeNames;
      if (a0 == null) {
        a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("employeeNames").schema());
        this.employeeNames = a0;
      } else a0.clear();
      SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
      for ( ; 0 < size0; size0 = in.arrayNext()) {
        for ( ; size0 != 0; size0--) {
          java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
          e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
          a0.add(e0);
        }
      }

      this.active = com.example.avro.model.Active.values()[in.readEnum()];

    } else {
      for (int i = 0; i < 4; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.requestTime = in.readLong();
          break;

        case 1:
          if (this.clientIdentifier == null) {
            this.clientIdentifier = new com.example.avro.model.ClientIdentifier();
          }
          this.clientIdentifier.customDecode(in);
          break;

        case 2:
          long size0 = in.readArrayStart();
          java.util.List<java.lang.CharSequence> a0 = this.employeeNames;
          if (a0 == null) {
            a0 = new SpecificData.Array<java.lang.CharSequence>((int)size0, SCHEMA$.getField("employeeNames").schema());
            this.employeeNames = a0;
          } else a0.clear();
          SpecificData.Array<java.lang.CharSequence> ga0 = (a0 instanceof SpecificData.Array ? (SpecificData.Array<java.lang.CharSequence>)a0 : null);
          for ( ; 0 < size0; size0 = in.arrayNext()) {
            for ( ; size0 != 0; size0--) {
              java.lang.CharSequence e0 = (ga0 != null ? ga0.peek() : null);
              e0 = in.readString(e0 instanceof Utf8 ? (Utf8)e0 : null);
              a0.add(e0);
            }
          }
          break;

        case 3:
          this.active = com.example.avro.model.Active.values()[in.readEnum()];
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










