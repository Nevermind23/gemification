package com.facetec.sdk;

import java.math.BigInteger;

/* renamed from: com.facetec.sdk.ej */
public final class C3008ej extends C3000ee {

    /* renamed from: b */
    private final Object f10135b;

    public C3008ej(Boolean bool) {
        this.f10135b = C3014ep.m12632e(bool);
    }

    /* renamed from: a */
    public final double mo9143a() {
        return mo9192n() ? mo9147d().doubleValue() : Double.parseDouble(mo9144b());
    }

    /* renamed from: b */
    public final String mo9144b() {
        if (mo9192n()) {
            return mo9147d().toString();
        }
        if (mo9191l()) {
            return ((Boolean) this.f10135b).toString();
        }
        return (String) this.f10135b;
    }

    /* renamed from: c */
    public final int mo9146c() {
        return mo9192n() ? mo9147d().intValue() : Integer.parseInt(mo9144b());
    }

    /* renamed from: d */
    public final Number mo9147d() {
        Object obj = this.f10135b;
        return obj instanceof String ? new C3039ew((String) obj) : (Number) obj;
    }

    /* renamed from: e */
    public final long mo9148e() {
        return mo9192n() ? mo9147d().longValue() : Long.parseLong(mo9144b());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3008ej.class != obj.getClass()) {
            return false;
        }
        C3008ej ejVar = (C3008ej) obj;
        if (this.f10135b == null) {
            if (ejVar.f10135b == null) {
                return true;
            }
            return false;
        } else if (!m12613d(this) || !m12613d(ejVar)) {
            Object obj2 = this.f10135b;
            if (!(obj2 instanceof Number) || !(ejVar.f10135b instanceof Number)) {
                return obj2.equals(ejVar.f10135b);
            }
            double doubleValue = mo9147d().doubleValue();
            double doubleValue2 = ejVar.mo9147d().doubleValue();
            if (doubleValue == doubleValue2 || (Double.isNaN(doubleValue) && Double.isNaN(doubleValue2))) {
                return true;
            }
            return false;
        } else if (mo9147d().longValue() == ejVar.mo9147d().longValue()) {
            return true;
        } else {
            return false;
        }
    }

    public final int hashCode() {
        long doubleToLongBits;
        if (this.f10135b == null) {
            return 31;
        }
        if (m12613d(this)) {
            doubleToLongBits = mo9147d().longValue();
        } else {
            Object obj = this.f10135b;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(mo9147d().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    /* renamed from: i */
    public final boolean mo9152i() {
        if (mo9191l()) {
            return ((Boolean) this.f10135b).booleanValue();
        }
        return Boolean.parseBoolean(mo9144b());
    }

    /* renamed from: k */
    public final boolean mo9190k() {
        return this.f10135b instanceof String;
    }

    /* renamed from: l */
    public final boolean mo9191l() {
        return this.f10135b instanceof Boolean;
    }

    /* renamed from: n */
    public final boolean mo9192n() {
        return this.f10135b instanceof Number;
    }

    /* renamed from: d */
    private static boolean m12613d(C3008ej ejVar) {
        Object obj = ejVar.f10135b;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return true;
        }
        return false;
    }

    public C3008ej(Number number) {
        this.f10135b = C3014ep.m12632e(number);
    }

    public C3008ej(String str) {
        this.f10135b = C3014ep.m12632e(str);
    }
}
