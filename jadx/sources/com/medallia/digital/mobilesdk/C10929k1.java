package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.k1 */
abstract class C10929k1<T> {

    /* renamed from: b */
    private static final int f31393b = 50;

    /* renamed from: c */
    private static final int f31394c = 100;

    /* renamed from: a */
    private int f31395a = 0;

    C10929k1() {
    }

    /* renamed from: a */
    private void m39955a() {
        if (this.f31395a >= 50) {
            this.f31395a = 0;
            if (C10876i1.m39698a().mo28473d()) {
                String str = "DELETE FROM " + mo28233e() + " WHERE _id IN (SELECT _id FROM " + mo28233e() + " ORDER BY " + mo28274f() + " ASC LIMIT " + 100 + ")";
                C10876i1.m39698a().getWritableDatabase().execSQL(str);
                C10735b4.m39109b("clearOutdatedDataIfNeeded: query: " + str);
                Broadcasts.C10695h.m38952a("clearOutdatedDataIfNeeded: query: " + str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo28221a(Object... objArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ContentValues mo28223b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract T mo28224b(Object... objArr);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28624b() {
        boolean z = C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "1", (String[]) null) > 0;
        m39956a(0);
        mo28623a(!z, "delete all");
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract long mo28225c();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract ArrayList<T> mo28226c(Object... objArr);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28228c(T t) {
        int i = 0;
        boolean z = C10876i1.m39698a().getWritableDatabase().insert(mo28233e(), (String) null, mo28223b(t)) != -1;
        try {
            mo28623a(!z, "insert - " + t.getClass().getSimpleName());
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
        if (z) {
            i = this.f31395a + 1;
        }
        m39956a(i);
        m39955a();
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract HashMap<String, String> mo28230d();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28232d(T t) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract String mo28233e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo28274f() {
        return null;
    }

    /* renamed from: a */
    private void m39956a(int i) {
        this.f31395a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28623a(boolean z, String str) {
        if (z) {
            C10735b4.m39111c(mo28233e() + " : Failed to " + str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(T t) {
        return true;
    }
}
