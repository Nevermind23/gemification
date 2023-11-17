package com.salesforce.marketingcloud.location;

import android.annotation.SuppressLint;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

@SuppressLint({"ShiftFlags"})
/* renamed from: com.salesforce.marketingcloud.location.b */
public final class C11539b {

    /* renamed from: f */
    public static final C11540a f33490f = new C11540a((DefaultConstructorMarker) null);

    /* renamed from: g */
    public static final int f33491g = 1;

    /* renamed from: h */
    public static final int f33492h = 2;

    /* renamed from: i */
    public static final int f33493i = 4;

    /* renamed from: a */
    private final String f33494a;

    /* renamed from: b */
    private final float f33495b;

    /* renamed from: c */
    private final double f33496c;

    /* renamed from: d */
    private final double f33497d;

    /* renamed from: e */
    private final int f33498e;

    /* renamed from: com.salesforce.marketingcloud.location.b$a */
    public static final class C11540a {
        private C11540a() {
        }

        public /* synthetic */ C11540a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.location.b$b */
    public @interface C11541b {
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.salesforce.marketingcloud.location.b$c */
    public @interface C11542c {
    }

    public C11539b(String str, float f, double d, double d2, int i) {
        C41536l.m120489i(str, "id");
        this.f33494a = str;
        this.f33495b = f;
        this.f33496c = d;
        this.f33497d = d2;
        this.f33498e = i;
    }

    /* renamed from: a */
    public static /* synthetic */ C11539b m42144a(C11539b bVar, String str, float f, double d, double d2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVar.f33494a;
        }
        if ((i2 & 2) != 0) {
            f = bVar.f33495b;
        }
        float f2 = f;
        if ((i2 & 4) != 0) {
            d = bVar.f33496c;
        }
        double d3 = d;
        if ((i2 & 8) != 0) {
            d2 = bVar.f33497d;
        }
        double d4 = d2;
        if ((i2 & 16) != 0) {
            i = bVar.f33498e;
        }
        return bVar.mo30131a(str, f2, d3, d4, i);
    }

    /* renamed from: b */
    public final float mo30133b() {
        return this.f33495b;
    }

    /* renamed from: c */
    public final double mo30134c() {
        return this.f33496c;
    }

    /* renamed from: d */
    public final double mo30135d() {
        return this.f33497d;
    }

    /* renamed from: e */
    public final int mo30136e() {
        return this.f33498e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11539b)) {
            return false;
        }
        C11539b bVar = (C11539b) obj;
        return C41536l.m120484d(this.f33494a, bVar.f33494a) && C41536l.m120484d(Float.valueOf(this.f33495b), Float.valueOf(bVar.f33495b)) && C41536l.m120484d(Double.valueOf(this.f33496c), Double.valueOf(bVar.f33496c)) && C41536l.m120484d(Double.valueOf(this.f33497d), Double.valueOf(bVar.f33497d)) && this.f33498e == bVar.f33498e;
    }

    /* renamed from: f */
    public final String mo30138f() {
        return this.f33494a;
    }

    /* renamed from: g */
    public final double mo30139g() {
        return this.f33496c;
    }

    /* renamed from: h */
    public final double mo30140h() {
        return this.f33497d;
    }

    public int hashCode() {
        return (((((((this.f33494a.hashCode() * 31) + Float.floatToIntBits(this.f33495b)) * 31) + Double.doubleToLongBits(this.f33496c)) * 31) + Double.doubleToLongBits(this.f33497d)) * 31) + this.f33498e;
    }

    /* renamed from: i */
    public final float mo30142i() {
        return this.f33495b;
    }

    /* renamed from: j */
    public final int mo30143j() {
        return this.f33498e;
    }

    public String toString() {
        return "GeofenceRegion(id=" + this.f33494a + ", radius=" + this.f33495b + ", latitude=" + this.f33496c + ", longitude=" + this.f33497d + ", transition=" + this.f33498e + ')';
    }

    /* renamed from: a */
    public final C11539b mo30131a(String str, float f, double d, double d2, int i) {
        C41536l.m120489i(str, "id");
        return new C11539b(str, f, d, d2, i);
    }

    /* renamed from: a */
    public final String mo30132a() {
        return this.f33494a;
    }
}
