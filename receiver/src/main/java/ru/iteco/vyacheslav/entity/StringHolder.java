package ru.iteco.vyacheslav.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class StringHolder {

    @Id
    private String id = UUID.randomUUID().toString();

    private String value;

    public StringHolder() {
    }

    public StringHolder(String value) {
        this.value = value;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "StringHolder{" +
                "id='" + id + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
