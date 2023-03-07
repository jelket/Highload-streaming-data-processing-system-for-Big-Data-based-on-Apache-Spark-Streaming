/*
 * This file is generated by jOOQ.
 */
package org.jooq.sources.tables;


import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function2;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.sources.Public;
import org.jooq.sources.tables.records.DeduplicationRecord;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Deduplication extends TableImpl<DeduplicationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.deduplication</code>
     */
    public static final Deduplication DEDUPLICATION = new Deduplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeduplicationRecord> getRecordType() {
        return DeduplicationRecord.class;
    }

    /**
     * The column <code>public.deduplication.value</code>.
     */
    public final TableField<DeduplicationRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.deduplication.timestamp</code>.
     */
    public final TableField<DeduplicationRecord, Long> TIMESTAMP = createField(DSL.name("timestamp"), SQLDataType.BIGINT, this, "");

    private Deduplication(Name alias, Table<DeduplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private Deduplication(Name alias, Table<DeduplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>public.deduplication</code> table reference
     */
    public Deduplication(String alias) {
        this(DSL.name(alias), DEDUPLICATION);
    }

    /**
     * Create an aliased <code>public.deduplication</code> table reference
     */
    public Deduplication(Name alias) {
        this(alias, DEDUPLICATION);
    }

    /**
     * Create a <code>public.deduplication</code> table reference
     */
    public Deduplication() {
        this(DSL.name("deduplication"), null);
    }

    public <O extends Record> Deduplication(Table<O> child, ForeignKey<O, DeduplicationRecord> key) {
        super(child, key, DEDUPLICATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public Deduplication as(String alias) {
        return new Deduplication(DSL.name(alias), this);
    }

    @Override
    public Deduplication as(Name alias) {
        return new Deduplication(alias, this);
    }

    @Override
    public Deduplication as(Table<?> alias) {
        return new Deduplication(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Deduplication rename(String name) {
        return new Deduplication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Deduplication rename(Name name) {
        return new Deduplication(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Deduplication rename(Table<?> name) {
        return new Deduplication(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<String, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function2<? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function2<? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
