package com.google.firebase.remoteconfig.internal;

import com.github.mikephil.charting.utils.Utils;
import p251sa.C8287j;

/* renamed from: com.google.firebase.remoteconfig.internal.v */
public class C5472v implements C8287j {

    /* renamed from: a */
    private final String f17492a;

    /* renamed from: b */
    private final int f17493b;

    C5472v(String str, int i) {
        this.f17492a = str;
        this.f17493b = i;
    }

    /* renamed from: f */
    private String m21794f() {
        return mo18156a().trim();
    }

    /* renamed from: g */
    private void m21795g() {
        if (this.f17492a == null) {
            throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
        }
    }

    /* renamed from: a */
    public String mo18156a() {
        if (this.f17493b == 0) {
            return "";
        }
        m21795g();
        return this.f17492a;
    }

    /* renamed from: b */
    public int mo18157b() {
        return this.f17493b;
    }

    /* renamed from: c */
    public boolean mo18158c() {
        if (this.f17493b == 0) {
            return false;
        }
        String f = m21794f();
        if (C5459o.f17436f.matcher(f).matches()) {
            return true;
        }
        if (C5459o.f17437g.matcher(f).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{f, "boolean"}));
    }

    /* renamed from: d */
    public long mo18159d() {
        if (this.f17493b == 0) {
            return 0;
        }
        String f = m21794f();
        try {
            return Long.valueOf(f).longValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{f, "long"}), e);
        }
    }

    /* renamed from: e */
    public double mo18160e() {
        if (this.f17493b == 0) {
            return Utils.DOUBLE_EPSILON;
        }
        String f = m21794f();
        try {
            return Double.valueOf(f).doubleValue();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", new Object[]{f, "double"}), e);
        }
    }
}
