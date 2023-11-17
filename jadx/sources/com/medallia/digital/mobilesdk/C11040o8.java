package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.o8 */
class C11040o8 extends C10929k1<C11024n8> {

    /* renamed from: d */
    private static final String f31735d = "workerManager";

    /* renamed from: e */
    private static final int f31736e = 7;

    /* renamed from: com.medallia.digital.mobilesdk.o8$a */
    class C11041a extends HashMap<String, String> {
        C11041a() {
            put("mediaCaptureClientCorrelationId", "TEXT");
            put("requestId", "TEXT");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.o8$b */
    private static class C11042b {

        /* renamed from: a */
        private static final String f31738a = "mediaCaptureClientCorrelationId";

        /* renamed from: b */
        private static final String f31739b = "requestId";

        private C11042b() {
        }
    }

    C11040o8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(C11024n8 n8Var) {
        return C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "mediaCaptureClientCorrelationId=?", new String[]{n8Var.mo28842a()}) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ContentValues mo28223b(C11024n8 n8Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mediaCaptureClientCorrelationId", n8Var.mo28842a());
        contentValues.put("requestId", n8Var.mo28843b());
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f31735d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11024n8 mo28224b(Object... objArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f31735d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<C11024n8> mo28226c(Object... objArr) {
        ArrayList<C11024n8> arrayList = new ArrayList<>();
        Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(new C11024n8(query.getString(query.getColumnIndex("mediaCaptureClientCorrelationId")), query.getString(query.getColumnIndex("requestId"))));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C11041a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28228c(C11024n8 n8Var) {
        if (mo28226c(new Object[0]).size() >= 7) {
            Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), new String[]{"mediaCaptureClientCorrelationId"}, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            ArrayList arrayList = new ArrayList();
            if (query != null && query.moveToFirst()) {
                do {
                    arrayList.add(query.getString(0));
                } while (query.moveToNext());
                query.close();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "mediaCaptureClientCorrelationId=?", new String[]{(String) arrayList.get(i)});
            }
        }
        return super.mo28228c(n8Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28232d(C11024n8 n8Var) {
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(n8Var), "mediaCaptureClientCorrelationId=?", new String[]{n8Var.mo28842a()}) > 0 || mo28228c(n8Var);
    }
}
