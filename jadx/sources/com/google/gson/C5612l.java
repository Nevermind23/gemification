package com.google.gson;

import com.google.gson.internal.C5578f;
import java.math.BigInteger;
import java.util.Objects;

/* renamed from: com.google.gson.l */
public final class C5612l extends C5494h {

    /* renamed from: d */
    private final Object f17802d;

    public C5612l(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f17802d = bool;
    }

    /* renamed from: A */
    private static boolean m22284A(C5612l lVar) {
        Object obj = lVar.f17802d;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public boolean mo18453B() {
        return this.f17802d instanceof Number;
    }

    /* renamed from: C */
    public boolean mo18454C() {
        return this.f17802d instanceof String;
    }

    /* renamed from: b */
    public boolean mo18206b() {
        if (mo18460z()) {
            return ((Boolean) this.f17802d).booleanValue();
        }
        return Boolean.parseBoolean(mo18211k());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5612l.class != obj.getClass()) {
            return false;
        }
        C5612l lVar = (C5612l) obj;
        if (this.f17802d == null) {
            if (lVar.f17802d == null) {
                return true;
            }
            return false;
        } else if (!m22284A(this) || !m22284A(lVar)) {
            Object obj2 = this.f17802d;
            if (!(obj2 instanceof Number) || !(lVar.f17802d instanceof Number)) {
                return obj2.equals(lVar.f17802d);
            }
            double doubleValue = mo18459x().doubleValue();
            double doubleValue2 = lVar.mo18459x().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            if (!Double.isNaN(doubleValue) || !Double.isNaN(doubleValue2)) {
                return false;
            }
            return true;
        } else if (mo18459x().longValue() == lVar.mo18459x().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f17802d == null) {
            return 31;
        }
        if (m22284A(this)) {
            doubleToLongBits = mo18459x().longValue();
        } else {
            Object obj = this.f17802d;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo18459x().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: j */
    public long mo18210j() {
        return mo18453B() ? mo18459x().longValue() : Long.parseLong(mo18211k());
    }

    /* renamed from: k */
    public String mo18211k() {
        Object obj = this.f17802d;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (mo18453B()) {
            return mo18459x().toString();
        }
        if (mo18460z()) {
            return ((Boolean) this.f17802d).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f17802d.getClass());
    }

    /* renamed from: v */
    public double mo18457v() {
        return mo18453B() ? mo18459x().doubleValue() : Double.parseDouble(mo18211k());
    }

    /* renamed from: w */
    public int mo18458w() {
        return mo18453B() ? mo18459x().intValue() : Integer.parseInt(mo18211k());
    }

    /* renamed from: x */
    public Number mo18459x() {
        Object obj = this.f17802d;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new C5578f((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    /* renamed from: z */
    public boolean mo18460z() {
        return this.f17802d instanceof Boolean;
    }

    public C5612l(Number number) {
        Objects.requireNonNull(number);
        this.f17802d = number;
    }

    public C5612l(String str) {
        Objects.requireNonNull(str);
        this.f17802d = str;
    }
}
