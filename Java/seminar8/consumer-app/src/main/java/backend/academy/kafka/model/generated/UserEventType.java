/**
 * Autogenerated by Avro
 * <p>
 * DO NOT EDIT DIRECTLY
 */

package backend.academy.kafka.model.generated;

@org.apache.avro.specific.AvroGenerated
public enum UserEventType implements org.apache.avro.generic.GenericEnumSymbol<UserEventType> {
    WITHDRAWAL, ACCRUAL;
    public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse(
        "{\"type\":\"enum\",\"name\":\"UserEventType\",\"namespace\":\"backend.academy.kafka.model.generated\","
            + "\"symbols\":[\"WITHDRAWAL\",\"ACCRUAL\"]}");

    public static org.apache.avro.Schema getClassSchema() {
        return SCHEMA$;
    }

    @Override
    public org.apache.avro.Schema getSchema() {
        return SCHEMA$;
    }
}
