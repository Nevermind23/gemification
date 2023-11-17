package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.h2 */
public class C10847h2 extends C10929k1<C10826g2> {

    /* renamed from: d */
    private static final int f31063d = 10;

    /* renamed from: e */
    private static final String f31064e = "feedbacks";

    /* renamed from: com.medallia.digital.mobilesdk.h2$a */
    class C10848a extends HashMap<String, String> {
        C10848a() {
            put("feedbackData", "TEXT");
            put("feedbackUUID", "TEXT");
            put("formId", "TEXT");
            put("submittedTimestamp", "INTEGER");
            put("formTriggerType", "TEXT");
            put("numberOfRetries", "INTEGER");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h2$b */
    private static class C10849b {

        /* renamed from: a */
        private static final String f31066a = "feedbackData";

        /* renamed from: b */
        private static final String f31067b = "feedbackUUID";

        /* renamed from: c */
        private static final String f31068c = "formId";

        /* renamed from: d */
        private static final String f31069d = "submittedTimestamp";

        /* renamed from: e */
        private static final String f31070e = "formTriggerType";

        /* renamed from: f */
        private static final String f31071f = "numberOfRetries";

        private C10849b() {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(C10826g2 g2Var) {
        return C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "feedbackUUID=?", new String[]{g2Var.mo28333b()}) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ContentValues mo28223b(C10826g2 g2Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("feedbackData", C11016n4.m40375f().mo28832b(g2Var.mo28331a()));
        contentValues.put("feedbackUUID", g2Var.mo28333b());
        contentValues.put("formId", g2Var.getFormId());
        contentValues.put("submittedTimestamp", Long.valueOf(g2Var.mo28336e()));
        contentValues.put("formTriggerType", g2Var.mo28334c() != null ? g2Var.mo28334c().toString() : null);
        contentValues.put("numberOfRetries", Integer.valueOf(g2Var.mo28335d()));
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f31064e);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10826g2 mo28224b(Object... objArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f31064e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public ArrayList<C10826g2> mo28226c(Object... objArr) {
        ArrayList<C10826g2> arrayList = new ArrayList<>();
        Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, (String) null, (String[]) null, (String) null, (String) null, "submittedTimestamp DESC");
        if (query != null) {
            if (query.moveToFirst()) {
                do {
                    arrayList.add(new C10826g2(C11016n4.m40375f().mo28830a(query.getString(query.getColumnIndex("feedbackData"))), query.getString(query.getColumnIndex("feedbackUUID")), query.getString(query.getColumnIndex("formId")), FormTriggerType.valueOf(query.getString(query.getColumnIndex("formTriggerType"))), query.getLong(query.getColumnIndex("submittedTimestamp")), query.getInt(query.getColumnIndex("numberOfRetries"))));
                } while (query.moveToNext());
            }
            query.close();
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C10848a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        Object obj;
        if (objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof Long)) {
            return false;
        }
        return C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "submittedTimestamp<=?", new String[]{String.valueOf(objArr[0])}) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28228c(C10826g2 g2Var) {
        int size = mo28226c(new Object[0]).size();
        if (size >= 10) {
            Cursor query = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), new String[]{"feedbackUUID"}, (String) null, (String[]) null, (String) null, (String) null, "submittedTimestamp ASC LIMIT " + ((size - 10) + 1));
            ArrayList arrayList = new ArrayList();
            if (query != null) {
                if (query.moveToFirst()) {
                    do {
                        arrayList.add(query.getString(0));
                    } while (query.moveToNext());
                }
                query.close();
            }
            for (int i = 0; i < arrayList.size(); i++) {
                C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "feedbackUUID=?", new String[]{(String) arrayList.get(i)});
            }
        }
        return super.mo28228c(g2Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28232d(C10826g2 g2Var) {
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(g2Var), "feedbackUUID=?", new String[]{g2Var.mo28333b()}) > 0 || super.mo28228c(g2Var);
    }
}
