package com.medallia.digital.mobilesdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import java.util.HashMap;

/* renamed from: com.medallia.digital.mobilesdk.z4 */
class C11239z4 extends C10929k1<C11173w4> {

    /* renamed from: d */
    private static final int f32587d = 7;

    /* renamed from: e */
    private static final int f32588e = 3;

    /* renamed from: f */
    private static final String f32589f = "mediaFeedbacks";

    /* renamed from: com.medallia.digital.mobilesdk.z4$a */
    class C11240a extends HashMap<String, String> {
        C11240a() {
            put("mediaCaptureClientCorrelationId", "TEXT");
            put("feedbackClientCorrelationId", "TEXT");
            put("formId", "TEXT");
            put("formName", "TEXT");
            put("submittedTimestamp", "INTEGER");
            put("mediaPath", "TEXT");
            put("mediaType", "TEXT");
            put("ecId", "TEXT");
            put("numberOfRetries", "INTEGER");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.z4$b */
    static /* synthetic */ class C11241b {

        /* renamed from: a */
        static final /* synthetic */ int[] f32591a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.medallia.digital.mobilesdk.z4$d[] r0 = com.medallia.digital.mobilesdk.C11239z4.C11243d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f32591a = r0
                com.medallia.digital.mobilesdk.z4$d r1 = com.medallia.digital.mobilesdk.C11239z4.C11243d.VIDEO     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f32591a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.medallia.digital.mobilesdk.z4$d r1 = com.medallia.digital.mobilesdk.C11239z4.C11243d.AUDIO     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11239z4.C11241b.<clinit>():void");
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.z4$c */
    private static class C11242c {

        /* renamed from: a */
        private static final String f32592a = "mediaCaptureClientCorrelationId";

        /* renamed from: b */
        private static final String f32593b = "feedbackClientCorrelationId";

        /* renamed from: c */
        private static final String f32594c = "formId";

        /* renamed from: d */
        private static final String f32595d = "formName";

        /* renamed from: e */
        private static final String f32596e = "submittedTimestamp";

        /* renamed from: f */
        private static final String f32597f = "mediaPath";

        /* renamed from: g */
        private static final String f32598g = "mediaType";

        /* renamed from: h */
        private static final String f32599h = "ecId";

        /* renamed from: i */
        private static final String f32600i = "numberOfRetries";

        private C11242c() {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.z4$d */
    enum C11243d {
        VIDEO,
        AUDIO
    }

    C11239z4() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo28220a(C11173w4 w4Var) {
        return C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "mediaCaptureClientCorrelationId=?", new String[]{w4Var.mo29138d()}) > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ContentValues mo28223b(C11173w4 w4Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("mediaCaptureClientCorrelationId", w4Var.mo29138d());
        contentValues.put("feedbackClientCorrelationId", w4Var.mo29135b());
        contentValues.put("formId", w4Var.getFormId());
        contentValues.put("formName", w4Var.mo29137c());
        contentValues.put("submittedTimestamp", Long.valueOf(w4Var.mo29144h()));
        contentValues.put("mediaPath", w4Var.mo29139e());
        contentValues.put("mediaType", w4Var.mo29141f());
        contentValues.put("ecId", w4Var.mo29133a());
        contentValues.put("numberOfRetries", Integer.valueOf(w4Var.mo29142g()));
        return contentValues;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public long mo28225c() {
        try {
            return DatabaseUtils.queryNumEntries(C10876i1.m39698a().getWritableDatabase(), f32589f);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
            return 0;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public C11173w4 mo28224b(Object... objArr) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public String mo28233e() {
        return f32589f;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.medallia.digital.mobilesdk.C11173w4> mo28226c(java.lang.Object... r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r14 == 0) goto L_0x0044
            int r1 = r14.length
            if (r1 <= 0) goto L_0x0044
            r1 = 0
            r14 = r14[r1]
            boolean r1 = r14 instanceof com.medallia.digital.mobilesdk.C11239z4.C11243d
            if (r1 == 0) goto L_0x0042
            com.medallia.digital.mobilesdk.z4$d r14 = (com.medallia.digital.mobilesdk.C11239z4.C11243d) r14
            int[] r1 = com.medallia.digital.mobilesdk.C11239z4.C11241b.f32591a
            int r14 = r14.ordinal()
            r14 = r1[r14]
            r1 = 1
            if (r14 == r1) goto L_0x0032
            r1 = 2
            if (r14 == r1) goto L_0x0022
            goto L_0x0042
        L_0x0022:
            com.medallia.digital.mobilesdk.i1 r14 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.mo28233e()
            r3 = 0
            java.lang.String r4 = "mediaType='audio/wav'"
            goto L_0x0052
        L_0x0032:
            com.medallia.digital.mobilesdk.i1 r14 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.mo28233e()
            r3 = 0
            java.lang.String r4 = "mediaType='video/mp4'"
            goto L_0x0052
        L_0x0042:
            r14 = 0
            goto L_0x005b
        L_0x0044:
            com.medallia.digital.mobilesdk.i1 r14 = com.medallia.digital.mobilesdk.C10876i1.m39698a()
            android.database.sqlite.SQLiteDatabase r1 = r14.getReadableDatabase()
            java.lang.String r2 = r13.mo28233e()
            r3 = 0
            r4 = 0
        L_0x0052:
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.String r8 = "submittedTimestamp DESC"
            android.database.Cursor r14 = r1.query(r2, r3, r4, r5, r6, r7, r8)
        L_0x005b:
            if (r14 == 0) goto L_0x00cf
            boolean r1 = r14.moveToFirst()
            if (r1 == 0) goto L_0x00cc
        L_0x0063:
            com.medallia.digital.mobilesdk.w4 r1 = new com.medallia.digital.mobilesdk.w4
            java.lang.String r2 = "mediaCaptureClientCorrelationId"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r3 = r14.getString(r2)
            java.lang.String r2 = "feedbackClientCorrelationId"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r4 = r14.getString(r2)
            java.lang.String r2 = "mediaPath"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r5 = r14.getString(r2)
            java.lang.String r2 = "formId"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r6 = r14.getString(r2)
            java.lang.String r2 = "formName"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r7 = r14.getString(r2)
            java.lang.String r2 = "mediaType"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r8 = r14.getString(r2)
            java.lang.String r2 = "submittedTimestamp"
            int r2 = r14.getColumnIndex(r2)
            long r9 = r14.getLong(r2)
            java.lang.String r2 = "ecId"
            int r2 = r14.getColumnIndex(r2)
            java.lang.String r11 = r14.getString(r2)
            java.lang.String r2 = "numberOfRetries"
            int r2 = r14.getColumnIndex(r2)
            int r12 = r14.getInt(r2)
            r2 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r12)
            r0.add(r1)
            boolean r1 = r14.moveToNext()
            if (r1 != 0) goto L_0x0063
        L_0x00cc:
            r14.close()
        L_0x00cf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.C11239z4.mo28226c(java.lang.Object[]):java.util.ArrayList");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public HashMap<String, String> mo28230d() {
        return new C11240a();
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
    public boolean mo28228c(C11173w4 w4Var) {
        Cursor cursor;
        String str;
        int size = mo28226c(new Object[0]).size();
        int size2 = mo28226c(C11243d.VIDEO).size();
        String d = C10721a5.m39052d(w4Var.mo29141f());
        if (size2 < 3 || d == null || (!d.equals("video") && !d.equals("upload"))) {
            if (!(size < 7 || (cursor = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), new String[]{"mediaCaptureClientCorrelationId", "submittedTimestamp", "mediaPath"}, (String) null, (String[]) null, (String) null, (String) null, "submittedTimestamp ASC ")) == null || !cursor.moveToFirst() || cursor.getColumnName(0) == null || cursor.getColumnName(1) == null || cursor.getColumnName(2) == null)) {
                if (Long.parseLong(cursor.getString(1)) > w4Var.mo29144h()) {
                    return false;
                }
                C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "mediaCaptureClientCorrelationId=?", new String[]{cursor.getString(0)});
                str = cursor.getString(2);
            }
            return super.mo28228c(w4Var);
        }
        cursor = C10876i1.m39698a().getReadableDatabase().query(mo28233e(), new String[]{"mediaCaptureClientCorrelationId", "submittedTimestamp", "mediaPath"}, "mediaType='video/mp4'", (String[]) null, (String) null, (String) null, "submittedTimestamp ASC ");
        if (!(cursor == null || cursor.getColumnName(0) == null || cursor.getColumnName(1) == null || cursor.getColumnName(2) == null || !cursor.moveToFirst())) {
            if (Long.parseLong(cursor.getString(1)) > w4Var.mo29144h()) {
                return false;
            }
            C10876i1.m39698a().getWritableDatabase().delete(mo28233e(), "mediaCaptureClientCorrelationId=?", new String[]{cursor.getString(0)});
            str = cursor.getColumnName(2);
        }
        return super.mo28228c(w4Var);
        C10930k2.m39983c(str);
        cursor.close();
        return super.mo28228c(w4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo28232d(C11173w4 w4Var) {
        return C10876i1.m39698a().getWritableDatabase().update(mo28233e(), mo28223b(w4Var), "mediaCaptureClientCorrelationId=?", new String[]{w4Var.mo29138d()}) > 0 || mo28228c(w4Var);
    }
}
