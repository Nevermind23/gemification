package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.f */
class C10799f extends C10929k1<C10874i> {

    /* renamed from: d */
    private static final String f30918d = "analyticsEvents";

    /* renamed from: com.medallia.digital.mobilesdk.f$a */
    class C10800a extends HashMap<String, String> {
        C10800a() {
            put("sessionId", "TEXT");
            put("name", "TEXT");
            put("lifetime", "TEXT");
            put("timestamp", "INTEGER");
            put("groupType", "TEXT");
            put("event", "TEXT");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.f$b */
    private static class C10801b {

        /* renamed from: a */
        private static final String f30920a = "sessionId";

        /* renamed from: b */
        private static final String f30921b = "name";

        /* renamed from: c */
        private static final String f30922c = "lifetime";

        /* renamed from: d */
        private static final String f30923d = "timestamp";

        /* renamed from: e */
        private static final String f30924e = "groupType";

        /* renamed from: f */
        private static final String f30925f = "event";

        private C10801b() {
        }
    }

    C10799f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ContentValues mo28223b(C10874i iVar) {
        ContentValues contentValues = new ContentValues();
        if (iVar != null) {
            contentValues.put("sessionId", iVar.mo28458e());
            contentValues.put("name", iVar.mo28453a());
            contentValues.put("timestamp", Long.valueOf(iVar.mo28459f()));
            String str = null;
            contentValues.put("lifetime", iVar.mo28456c() == null ? null : iVar.mo28456c().name());
            contentValues.put("groupType", iVar.mo28455b() == null ? null : iVar.mo28455b().name());
            if (iVar.mo28457d() != null) {
                str = iVar.mo28457d().toString();
            }
            contentValues.put("event", str);
        }
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f30918d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10874i mo28224b(Object... objArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f30918d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo28274f() {
        return "timestamp";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28221a(Object... objArr) {
        String str;
        String[] strArr;
        long j;
        Object[] objArr2 = objArr;
        boolean z = false;
        if (objArr2 == null || objArr2.length == 0) {
            return false;
        }
        Object obj = objArr2[0];
        long j2 = -1;
        if (obj instanceof Long) {
            j = ((Long) obj).longValue();
            strArr = new String[]{String.valueOf(j)};
            str = "timestamp<=?";
        } else {
            strArr = null;
            j = -1;
            str = null;
        }
        if (objArr2.length > 1) {
            Object obj2 = objArr2[1];
            if (obj2 instanceof Long) {
                j2 = ((Long) obj2).longValue();
                if (str == null) {
                    strArr = new String[]{String.valueOf(j2)};
                    str = "timestamp>=?";
                } else {
                    str = str + " AND timestamp>=?";
                    strArr = (strArr == null || strArr.length <= 0) ? new String[]{String.valueOf(j2)} : new String[]{strArr[0], String.valueOf(j2)};
                }
            }
        }
        String[] strArr2 = strArr;
        String str2 = str;
        if (C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), str2, strArr2) > 0) {
            z = true;
        }
        if (z) {
            C10735b4.m39113e("Delete Analytics records from timestamp " + j2 + " to timestamp " + j);
        }
        mo28623a(!z, "delete " + (!z ? C10876i1.m39698a().getReadableDatabase().query(mo28233e(), (String[]) null, str2, strArr2, (String) null, (String) null, "timestamp ASC", (String) null).getCount() : -1) + " analytics records from timestamp " + j2 + " to timestamp " + j);
        return z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.medallia.digital.mobilesdk.C10874i> mo28226c(java.lang.Object... r18) {
        /*
            r17 = this;
            r0 = r18
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 1
            r3 = 0
            r4 = 0
            if (r0 == 0) goto L_0x0026
            int r5 = r0.length
            if (r5 <= 0) goto L_0x0026
            r5 = r0[r3]
            boolean r6 = r5 instanceof java.lang.Long
            if (r6 == 0) goto L_0x0026
            java.lang.Long r5 = (java.lang.Long) r5
            long r5 = r5.longValue()
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r7[r3] = r5
            java.lang.String r5 = "timestamp<=?"
            goto L_0x0028
        L_0x0026:
            r5 = r4
            r7 = r5
        L_0x0028:
            r6 = 2
            if (r0 == 0) goto L_0x0069
            int r8 = r0.length
            if (r8 <= r2) goto L_0x0069
            r8 = r0[r2]
            if (r8 == 0) goto L_0x0069
            boolean r9 = r8 instanceof java.lang.Long
            if (r9 == 0) goto L_0x0069
            java.lang.Long r8 = (java.lang.Long) r8
            long r8 = r8.longValue()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r5)
            java.lang.String r5 = " AND timestamp>?"
            r10.append(r5)
            java.lang.String r5 = r10.toString()
            if (r7 == 0) goto L_0x0061
            int r10 = r7.length
            if (r10 <= 0) goto L_0x0061
            r7 = r7[r3]
            java.lang.String[] r10 = new java.lang.String[r6]
            r10[r3] = r7
            java.lang.String r3 = java.lang.String.valueOf(r8)
            r10[r2] = r3
            r11 = r5
            r12 = r10
            goto L_0x006b
        L_0x0061:
            java.lang.String[] r7 = new java.lang.String[r2]
            java.lang.String r2 = java.lang.String.valueOf(r8)
            r7[r3] = r2
        L_0x0069:
            r11 = r5
            r12 = r7
        L_0x006b:
            if (r0 == 0) goto L_0x007c
            int r2 = r0.length
            if (r2 <= r6) goto L_0x007c
            r0 = r0[r6]
            if (r0 == 0) goto L_0x007c
            boolean r2 = r0 instanceof java.lang.Integer
            if (r2 == 0) goto L_0x007c
            java.lang.String r4 = java.lang.String.valueOf(r0)
        L_0x007c:
            r16 = r4
            com.medallia.digital.mobilesdk.i1 r0 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r8 = r0.getReadableDatabase()
            java.lang.String r9 = r17.mo28233e()
            r10 = 0
            r13 = 0
            r14 = 0
            java.lang.String r15 = "timestamp ASC"
            android.database.Cursor r0 = r8.query(r9, r10, r11, r12, r13, r14, r15, r16)
            if (r0 == 0) goto L_0x00f1
            boolean r2 = r0.moveToFirst()
            if (r2 == 0) goto L_0x00ee
        L_0x009b:
            com.medallia.digital.mobilesdk.i r2 = new com.medallia.digital.mobilesdk.i
            java.lang.String r3 = "event"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r4 = r0.getString(r3)
            java.lang.String r3 = "groupType"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            com.medallia.digital.mobilesdk.GroupType r5 = com.medallia.digital.mobilesdk.GroupType.valueOf(r3)
            java.lang.String r3 = "lifetime"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r3 = r0.getString(r3)
            com.medallia.digital.mobilesdk.Lifetime r6 = com.medallia.digital.mobilesdk.Lifetime.valueOf(r3)
            java.lang.String r3 = "name"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r7 = r0.getString(r3)
            java.lang.String r3 = "timestamp"
            int r3 = r0.getColumnIndex(r3)
            long r8 = r0.getLong(r3)
            java.lang.String r3 = "sessionId"
            int r3 = r0.getColumnIndex(r3)
            java.lang.String r10 = r0.getString(r3)
            r3 = r2
            r3.<init>((java.lang.String) r4, (com.medallia.digital.mobilesdk.GroupType) r5, (com.medallia.digital.mobilesdk.Lifetime) r6, (java.lang.String) r7, (long) r8, (java.lang.String) r10)
            r1.add(r2)
            boolean r2 = r0.moveToNext()
            if (r2 != 0) goto L_0x009b
        L_0x00ee:
            r0.close()
        L_0x00f1:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10799f.mo28226c(java.lang.Object[]):java.util.ArrayList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C10800a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28228c(C10874i iVar) {
        if (!TextUtils.isEmpty(iVar.mo28458e()) && iVar.mo28459f() > 0) {
            return super.mo28228c(iVar);
        }
        mo28623a(true, "insert (invalid data from analytics) - " + iVar);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28232d(C10874i iVar) {
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(iVar), "name=?", new String[]{iVar.mo28453a()}) > 0 || super.mo28228c(iVar);
    }
}
