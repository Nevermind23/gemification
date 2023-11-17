package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.f7 */
class C10815f7 extends C10929k1<C10797e7> {

    /* renamed from: d */
    private static final String f30969d = "templateData";

    /* renamed from: com.medallia.digital.mobilesdk.f7$a */
    class C10816a extends HashMap<String, String> {
        C10816a() {
            put("templatePath", "TEXT");
            put("templateUrl", "TEXT");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.f7$b */
    private static class C10817b {

        /* renamed from: a */
        private static final String f30971a = "templateUrl";

        /* renamed from: b */
        private static final String f30972b = "templatePath";

        private C10817b() {
        }
    }

    C10815f7() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(C10797e7 e7Var) {
        StringBuilder sb;
        boolean z = false;
        boolean z2 = true;
        if (e7Var == null || TextUtils.isEmpty(e7Var.mo28265b())) {
            sb = new StringBuilder();
            sb.append("delete (invalid data) - ");
            sb.append(e7Var == null ? "record is null" : "templateUrl is not valid");
        } else {
            if (C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "templateUrl=?", new String[]{e7Var.mo28265b()}) > 0) {
                z = true;
            }
            z2 = !z;
            sb = new StringBuilder();
            sb.append("delete - ");
            sb.append(e7Var);
        }
        mo28623a(z2, sb.toString());
        return z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ContentValues mo28223b(C10797e7 e7Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("templatePath", e7Var.mo28263a());
        contentValues.put("templateUrl", e7Var.mo28265b());
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f30969d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10797e7 mo28224b(Object... objArr) {
        String str;
        Cursor query;
        C10797e7 e7Var = null;
        if (!(objArr == null || objArr.length <= 0 || (str = objArr[0]) == null || !(str instanceof String) || (query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, "templateUrl=?", new String[]{str}, (String) null, (String) null, (String) null)) == null)) {
            if (query.moveToFirst()) {
                e7Var = new C10797e7(query.getString(query.getColumnIndex("templatePath")), query.getString(query.getColumnIndex("templateUrl")));
            }
            query.close();
        }
        return e7Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f30969d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<C10797e7> mo28226c(Object... objArr) {
        ArrayList<C10797e7> arrayList = new ArrayList<>();
        Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, (String) null);
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(new C10797e7(query.getString(query.getColumnIndex("templatePath")), query.getString(query.getColumnIndex("templateUrl"))));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C10816a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        String str;
        if (objArr == null || objArr.length <= 0 || (str = objArr[0]) == null || !(str instanceof String)) {
            return false;
        }
        return C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "templateUrl=?", new String[]{str}) > 0;
    }
}
