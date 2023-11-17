package p447hg;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;

/* renamed from: hg.e */
public final class C15502e {

    /* renamed from: a */
    public static final C15502e f44008a = new C15502e();

    private C15502e() {
    }

    /* renamed from: a */
    public final Intent mo42603a() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("*/*");
        intent.addCategory("android.intent.category.OPENABLE");
        return intent;
    }

    /* renamed from: b */
    public final BigDecimal mo42604b(long j) {
        BigDecimal stripTrailingZeros = new BigDecimal(j).divide(new BigDecimal(1048576), 2, 0).stripTrailingZeros();
        C41536l.m120488h(stripTrailingZeros, "BigDecimal(bytes).divide…    .stripTrailingZeros()");
        return stripTrailingZeros;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0058, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        se1.C42550b.m123187a(r9, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        throw r0;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p447hg.C15501d mo42605c(android.content.Context r9, android.net.Uri r10) {
        /*
            r8 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r9, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            android.content.ContentResolver r1 = r9.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r10
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6, r7)
            r10 = 0
            if (r9 == 0) goto L_0x004a
            boolean r0 = r9.moveToFirst()     // Catch:{ all -> 0x0056 }
            if (r0 == 0) goto L_0x004a
            java.lang.String r0 = "_display_name"
            int r0 = r9.getColumnIndex(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r0 = r9.getString(r0)     // Catch:{ all -> 0x0056 }
            java.lang.String r1 = "_size"
            int r1 = r9.getColumnIndex(r1)     // Catch:{ all -> 0x0056 }
            boolean r2 = r9.isNull(r1)     // Catch:{ all -> 0x0056 }
            if (r2 != 0) goto L_0x0040
            long r1 = r9.getLong(r1)     // Catch:{ all -> 0x0056 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0056 }
            goto L_0x0041
        L_0x0040:
            r1 = r10
        L_0x0041:
            hg.d r2 = new hg.d     // Catch:{ all -> 0x0056 }
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0056 }
            se1.C42550b.m123187a(r9, r10)
            return r2
        L_0x004a:
            he1.w r0 = he1.C41238w.f97225a     // Catch:{ all -> 0x0056 }
            se1.C42550b.m123187a(r9, r10)
            hg.d r9 = new hg.d
            r0 = 3
            r9.<init>(r10, r10, r0, r10)
            return r9
        L_0x0056:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x0058 }
        L_0x0058:
            r0 = move-exception
            se1.C42550b.m123187a(r9, r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p447hg.C15502e.mo42605c(android.content.Context, android.net.Uri):hg.d");
    }

    /* renamed from: d */
    public final String mo42606d(Context context, Uri uri) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(uri, "uri");
        return context.getContentResolver().getType(uri);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r6 = new byte[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r1 == null) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r1 != null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0045, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0038, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003a */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final byte[] mo42607e(android.content.Context r6, android.net.Uri r7) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            java.lang.String r0 = "fileUri"
            kotlin.jvm.internal.C41536l.m120489i(r7, r0)
            r0 = 0
            r1 = 0
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ Exception -> 0x003a }
            java.io.InputStream r1 = r6.openInputStream(r7)     // Catch:{ Exception -> 0x003a }
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ Exception -> 0x003a }
            r6.<init>()     // Catch:{ Exception -> 0x003a }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r7]     // Catch:{ Exception -> 0x003a }
        L_0x001d:
            kotlin.jvm.internal.C41536l.m120486f(r1)     // Catch:{ Exception -> 0x003a }
            int r3 = r1.read(r2, r0, r7)     // Catch:{ Exception -> 0x003a }
            r4 = -1
            if (r3 == r4) goto L_0x002b
            r6.write(r2, r0, r3)     // Catch:{ Exception -> 0x003a }
            goto L_0x001d
        L_0x002b:
            byte[] r6 = r6.toByteArray()     // Catch:{ Exception -> 0x003a }
            java.lang.String r7 = "{\n            inputStrea…r.toByteArray()\n        }"
            kotlin.jvm.internal.C41536l.m120488h(r6, r7)     // Catch:{ Exception -> 0x003a }
        L_0x0034:
            r1.close()     // Catch:{ Exception -> 0x003f }
            goto L_0x003f
        L_0x0038:
            r6 = move-exception
            goto L_0x0040
        L_0x003a:
            byte[] r6 = new byte[r0]     // Catch:{ all -> 0x0038 }
            if (r1 == 0) goto L_0x003f
            goto L_0x0034
        L_0x003f:
            return r6
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ Exception -> 0x0045 }
        L_0x0045:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p447hg.C15502e.mo42607e(android.content.Context, android.net.Uri):byte[]");
    }
}
