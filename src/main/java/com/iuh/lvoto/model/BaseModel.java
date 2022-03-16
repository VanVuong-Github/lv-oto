package com.iuh.lvoto.model;

import com.iuh.lvoto.base.JPACustomType;
import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.ListArrayType;
import com.vladmihalcea.hibernate.type.array.LongArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.basic.PostgreSQLEnumType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonType;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@Getter
@Setter
@TypeDef(name = JPACustomType.STRING_ARRAY, typeClass = StringArrayType.class)
@TypeDef(name = JPACustomType.INT_ARRAY, typeClass = IntArrayType.class)
@TypeDef(name = JPACustomType.LONG_ARRAY, typeClass = LongArrayType.class)
@TypeDef(name = JPACustomType.JSONB, typeClass = JsonBinaryType.class)
@TypeDef(name = JPACustomType.JSON, typeClass = JsonType.class)
@TypeDef(name = JPACustomType.LIST_ARRAY, typeClass = ListArrayType.class)
@TypeDef(name = JPACustomType.ENUM, typeClass = PostgreSQLEnumType.class)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseModel {
    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date updatedDate;
}
