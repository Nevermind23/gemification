package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.DatabaseUtils;
import android.text.TextUtils;
import com.medallia.digital.mobilesdk.Broadcasts;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.j8 */
class C10920j8 extends C10929k1<C10802f0> {

    /* renamed from: d */
    private static final String f31363d = "userJourney";

    /* renamed from: com.medallia.digital.mobilesdk.j8$a */
    class C10921a extends HashMap<String, String> {
        C10921a() {
            put("sessionId", "TEXT");
            put("name", "TEXT");
            put(C11755a.C11756a.f34100b, "TEXT");
            put("valueType", "TEXT");
            put("lifetime", "TEXT");
            put("timestamp", "INTEGER");
            put("groupType", "TEXT");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j8$b */
    static /* synthetic */ class C10922b {

        /* renamed from: a */
        static final /* synthetic */ int[] f31365a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.medallia.digital.mobilesdk.j8$d[] r0 = com.medallia.digital.mobilesdk.C10920j8.C10924d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31365a = r0
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.ALL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.ALL_DESC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.SESSION     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.EVENTS_SESSION     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.DISTINCT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.DISTINCT_SESSION_COLLECTORS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.CUSTOM_PARAMS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f31365a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.medallia.digital.mobilesdk.j8$d r1 = com.medallia.digital.mobilesdk.C10920j8.C10924d.CUSTOM_PARAMS_SESSION     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10920j8.C10922b.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j8$c */
    private static class C10923c {

        /* renamed from: a */
        private static final String f31366a = "sessionId";

        /* renamed from: b */
        private static final String f31367b = "name";

        /* renamed from: c */
        private static final String f31368c = "value";

        /* renamed from: d */
        private static final String f31369d = "valueType";

        /* renamed from: e */
        private static final String f31370e = "lifetime";

        /* renamed from: f */
        private static final String f31371f = "timestamp";

        /* renamed from: g */
        private static final String f31372g = "groupType";

        private C10923c() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.j8$d */
    enum C10924d {
        ALL,
        ALL_DESC,
        SESSION,
        EVENTS_SESSION,
        DISTINCT,
        DISTINCT_SESSION_COLLECTORS,
        CUSTOM_PARAMS,
        CUSTOM_PARAMS_SESSION
    }

    C10920j8() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public ContentValues mo28223b(C10802f0 f0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("sessionId", f0Var.mo28281g());
        contentValues.put("name", f0Var.getName());
        String str = null;
        contentValues.put(C11755a.C11756a.f34100b, f0Var.mo28284i() == null ? null : f0Var.mo28284i().toString());
        contentValues.put("valueType", f0Var.mo28285j() == null ? null : f0Var.mo28285j().name());
        contentValues.put("timestamp", Long.valueOf(f0Var.mo28283h()));
        contentValues.put("lifetime", f0Var.mo28280f() == null ? null : f0Var.mo28280f().name());
        if (f0Var.mo28279e() != null) {
            str = f0Var.mo28279e().name();
        }
        contentValues.put("groupType", str);
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f31363d);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C10802f0 mo28224b(Object... objArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f31363d;
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
        boolean z = false;
        if (!(objArr == null || objArr.length == 0)) {
            Lifetime lifetime = objArr[0];
            Lifetime lifetime2 = Lifetime.Session;
            Lifetime lifetime3 = lifetime instanceof Lifetime ? lifetime : lifetime2;
            if (lifetime3 != Lifetime.Forever) {
                strArr = new String[]{lifetime3.name()};
                str = "lifetime=?";
                if (objArr.length > 1) {
                    GroupType groupType = objArr[1];
                    if (groupType instanceof GroupType) {
                        str = str + " AND groupType!=?";
                        strArr = new String[]{lifetime3.name(), groupType.name()};
                    }
                }
                if (lifetime3 == Lifetime.Application) {
                    str = str + " OR lifetime=?";
                    strArr = strArr.length > 1 ? new String[]{lifetime3.name(), strArr[1], lifetime2.name()} : new String[]{lifetime3.name(), lifetime2.name()};
                }
            } else {
                strArr = null;
                str = null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Delete query: TableName: ");
            sb.append(mo28233e());
            sb.append(" where: ");
            String str2 = "null";
            sb.append(str != null ? str : str2);
            sb.append(" args: ");
            sb.append(Arrays.toString(strArr));
            C10735b4.m39109b(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Delete query: TableName: ");
            sb2.append(mo28233e());
            sb2.append(" where: ");
            if (str != null) {
                str2 = str;
            }
            sb2.append(str2);
            sb2.append(" args: ");
            sb2.append(Arrays.toString(strArr));
            Broadcasts.C10695h.m38952a(sb2.toString());
            if (C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), str, strArr) > 0) {
                z = true;
            }
            if (z) {
                C10735b4.m39113e("Delete records by criterion " + lifetime3.name());
            }
            mo28623a(!z, "delete by " + lifetime3.name() + " criterion");
        }
        return z;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0109  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.medallia.digital.mobilesdk.C10802f0> mo28226c(java.lang.Object... r15) {
        /*
            r14 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r15 == 0) goto L_0x00f0
            int r1 = r15.length
            if (r1 <= 0) goto L_0x00f0
            r1 = 0
            r2 = r15[r1]
            boolean r3 = r2 instanceof com.medallia.digital.mobilesdk.C10920j8.C10924d
            if (r3 == 0) goto L_0x00ee
            com.medallia.digital.mobilesdk.j8$d r2 = (com.medallia.digital.mobilesdk.C10920j8.C10924d) r2
            int[] r3 = com.medallia.digital.mobilesdk.C10920j8.C10922b.f31365a
            int r2 = r2.ordinal()
            r2 = r3[r2]
            r3 = 1
            switch(r2) {
                case 1: goto L_0x00f0;
                case 2: goto L_0x00da;
                case 3: goto L_0x00b8;
                case 4: goto L_0x0095;
                case 5: goto L_0x007a;
                case 6: goto L_0x0055;
                case 7: goto L_0x0044;
                case 8: goto L_0x0021;
                default: goto L_0x001f;
            }
        L_0x001f:
            goto L_0x00ee
        L_0x0021:
            com.medallia.digital.mobilesdk.i1 r2 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r4 = r2.getReadableDatabase()
            java.lang.String r5 = r14.mo28233e()
            java.lang.String[] r8 = new java.lang.String[r3]
            r15 = r15[r3]
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r8[r1] = r15
            r6 = 0
            java.lang.String r7 = "name='CustomParameters' AND sessionId=?"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "timestamp ASC"
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0107
        L_0x0044:
            com.medallia.digital.mobilesdk.i1 r15 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r15.getReadableDatabase()
            java.lang.String r2 = r14.mo28233e()
            r3 = 0
            java.lang.String r4 = "name='CustomParameters'"
            goto L_0x00fe
        L_0x0055:
            com.medallia.digital.mobilesdk.i1 r2 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r4 = r2.getReadableDatabase()
            java.lang.String r6 = r14.mo28233e()
            java.lang.String[] r9 = new java.lang.String[r3]
            r15 = r15[r3]
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r9[r1] = r15
            r5 = 1
            r7 = 0
            java.lang.String r8 = "sessionId=? AND groupType == collector"
            r10 = 0
            r11 = 0
            java.lang.String r12 = "timestamp ASC"
            r13 = 0
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x0107
        L_0x007a:
            com.medallia.digital.mobilesdk.i1 r15 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r15.getReadableDatabase()
            java.lang.String r3 = r14.mo28233e()
            r2 = 1
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.String r7 = "name"
            r8 = 0
            java.lang.String r9 = "timestamp ASC"
            r10 = 0
            android.database.Cursor r15 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            goto L_0x0107
        L_0x0095:
            com.medallia.digital.mobilesdk.i1 r2 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r4 = r2.getReadableDatabase()
            java.lang.String r5 = r14.mo28233e()
            java.lang.String[] r8 = new java.lang.String[r3]
            r15 = r15[r3]
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r8[r1] = r15
            r6 = 0
            java.lang.String r7 = "sessionId=? AND groupType != collector"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "timestamp ASC"
            r12 = 0
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0107
        L_0x00b8:
            com.medallia.digital.mobilesdk.i1 r2 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r4 = r2.getReadableDatabase()
            java.lang.String r5 = r14.mo28233e()
            java.lang.String[] r8 = new java.lang.String[r3]
            r15 = r15[r3]
            java.lang.String r15 = java.lang.String.valueOf(r15)
            r8[r1] = r15
            r6 = 0
            java.lang.String r7 = "sessionId=?"
            r9 = 0
            r10 = 0
            java.lang.String r11 = "timestamp ASC"
            android.database.Cursor r15 = r4.query(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x0107
        L_0x00da:
            com.medallia.digital.mobilesdk.i1 r15 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r15.getReadableDatabase()
            java.lang.String r2 = r14.mo28233e()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "timestamp DESC"
            goto L_0x0103
        L_0x00ee:
            r15 = 0
            goto L_0x0107
        L_0x00f0:
            com.medallia.digital.mobilesdk.i1 r15 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r15.getReadableDatabase()
            java.lang.String r2 = r14.mo28233e()
            r3 = 0
            r4 = 0
        L_0x00fe:
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "timestamp ASC"
        L_0x0103:
            android.database.Cursor r15 = r1.query(r2, r3, r4, r5, r6, r7, r8)
        L_0x0107:
            if (r15 == 0) goto L_0x0173
            boolean r1 = r15.moveToFirst()
            if (r1 == 0) goto L_0x0170
        L_0x010f:
            com.medallia.digital.mobilesdk.f0 r1 = new com.medallia.digital.mobilesdk.f0
            java.lang.String r2 = "value"
            int r2 = r15.getColumnIndex(r2)
            java.lang.String r3 = r15.getString(r2)
            java.lang.String r2 = "groupType"
            int r2 = r15.getColumnIndex(r2)
            java.lang.String r2 = r15.getString(r2)
            com.medallia.digital.mobilesdk.GroupType r4 = com.medallia.digital.mobilesdk.GroupType.valueOf(r2)
            java.lang.String r2 = "lifetime"
            int r2 = r15.getColumnIndex(r2)
            java.lang.String r2 = r15.getString(r2)
            com.medallia.digital.mobilesdk.Lifetime r5 = com.medallia.digital.mobilesdk.Lifetime.valueOf(r2)
            java.lang.String r2 = "valueType"
            int r2 = r15.getColumnIndex(r2)
            java.lang.String r2 = r15.getString(r2)
            com.medallia.digital.mobilesdk.ValueType r6 = com.medallia.digital.mobilesdk.ValueType.fromString(r2)
            java.lang.String r2 = "name"
            int r2 = r15.getColumnIndex(r2)
            java.lang.String r7 = r15.getString(r2)
            java.lang.String r2 = "timestamp"
            int r2 = r15.getColumnIndex(r2)
            long r8 = r15.getLong(r2)
            java.lang.String r2 = "sessionId"
            int r2 = r15.getColumnIndex(r2)
            java.lang.String r10 = r15.getString(r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            r0.add(r1)
            boolean r1 = r15.moveToNext()
            if (r1 != 0) goto L_0x010f
        L_0x0170:
            r15.close()
        L_0x0173:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C10920j8.mo28226c(java.lang.Object[]):java.util.ArrayList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C10921a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo28228c(C10802f0 f0Var) {
        if (!TextUtils.isEmpty(f0Var.mo28281g()) && f0Var.mo28283h() > 0) {
            return super.mo28228c(f0Var);
        }
        mo28623a(true, "insert (invalid data from event) - " + f0Var);
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo28232d(C10802f0 f0Var) {
        C10735b4.m39109b("Update query: TableName: " + mo28233e() + " where: " + "name" + "=? args: [" + f0Var.getName() + "]");
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(f0Var), "name=?", new String[]{f0Var.getName()}) > 0 || super.mo28228c(f0Var);
    }
}
