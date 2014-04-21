package com.michaelpellegrini.drools.healthcare.fact.type;

import com.michaelpellegrini.drools.healthcare.fact.value.GenderConstraint;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;


public class Gender {
	
	private final GenderConstraint value;
	
	public Gender(GenderConstraint value) {
		this.value = value;
	}
	
	public GenderConstraint getValue() {
		return value;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this).append("value", value).toString();
	}


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;

        final Gender that = (Gender) obj;

        return Objects.equals(this.value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.value);
    }
}


