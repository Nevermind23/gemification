package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.u5 */
public class C11125u5 extends C10929k1<C11204x5> {

    /* renamed from: d */
    private static final String f31990d = "quarantineRules";

    /* renamed from: com.medallia.digital.mobilesdk.u5$a */
    class C11126a extends HashMap<String, String> {
        C11126a() {
            put("ruleId", "TEXT");
            put("expirationTime", "INTEGER");
            put("status", "INTEGER");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u5$b */
    static /* synthetic */ class C11127b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31992a;

        static {
            int[] iArr = new int[C11129d.values().length];
            f31992a = iArr;
            try {
                iArr[C11129d.ASC_EXPIRATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u5$c */
    private static class C11128c {

        /* renamed from: a */
        private static final String f31993a = "ruleId";

        /* renamed from: b */
        private static final String f31994b = "expirationTime";

        /* renamed from: c */
        private static final String f31995c = "status";

        private C11128c() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.u5$d */
    enum C11129d {
        ASC_EXPIRATION
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ContentValues mo28223b(C11204x5 x5Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("ruleId", x5Var.f32240a);
        contentValues.put("expirationTime", x5Var.f32241b);
        Boolean bool = x5Var.f32242c;
        contentValues.put("status", Integer.valueOf((bool == null || !bool.booleanValue()) ? 0 : 1));
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f31990d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11204x5 mo28224b(Object... objArr) {
        C11129d dVar;
        C11204x5 x5Var = null;
        if (objArr != null && objArr.length > 0 && (dVar = objArr[0]) != null && (dVar instanceof C11129d)) {
            Cursor query = C11127b.f31992a[dVar.ordinal()] != 1 ? null : C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "expirationTime ASC");
            if (query != null) {
                if (query.moveToFirst()) {
                    do {
                        x5Var = new C11204x5(query.getString(query.getColumnIndex("ruleId")), Long.valueOf(query.getLong(query.getColumnIndex("expirationTime"))), Boolean.valueOf(query.getInt(query.getColumnIndex("status")) == 1));
                    } while (query.moveToNext());
                }
                query.close();
            }
        }
        return x5Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f31990d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<C11204x5> mo28226c(Object... objArr) {
        ArrayList<C11204x5> arrayList = new ArrayList<>();
        Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    String string = query.getString(query.getColumnIndex("ruleId"));
                    Long valueOf = Long.valueOf(query.getLong(query.getColumnIndex("expirationTime")));
                    boolean z = true;
                    if (query.getInt(query.getColumnIndex("status")) != 1) {
                        z = false;
                    }
                    arrayList.add(new C11204x5(string, valueOf, Boolean.valueOf(z)));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C11126a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28232d(C11204x5 x5Var) {
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(x5Var), "ruleId=?", new String[]{x5Var.mo29196b()}) > 0 || super.mo28228c(x5Var);
    }
}
