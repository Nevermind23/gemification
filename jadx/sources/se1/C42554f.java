package se1;

import cf1.C40407d;
import java.io.File;
import java.nio.charset.Charset;
import kotlin.jvm.internal.C41536l;

/* renamed from: se1.f */
abstract class C42554f extends C42553e {
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        se1.C42550b.m123187a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m123192a(java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x00a5 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L_0x0083
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00a5 }
            r3 = 0
            r5 = r1
            r6 = r3
        L_0x001d:
            if (r5 <= 0) goto L_0x0028
            int r7 = r0.read(r2, r6, r5)     // Catch:{ all -> 0x00a5 }
            if (r7 < 0) goto L_0x0028
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r5 <= 0) goto L_0x0035
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x00a5 }
            kotlin.jvm.internal.C41536l.m120488h(r2, r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x0065
        L_0x0035:
            int r5 = r0.read()     // Catch:{ all -> 0x00a5 }
            r6 = -1
            if (r5 != r6) goto L_0x003d
            goto L_0x0065
        L_0x003d:
            se1.c r6 = new se1.c     // Catch:{ all -> 0x00a5 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x00a5 }
            r6.write(r5)     // Catch:{ all -> 0x00a5 }
            r5 = 2
            se1.C42549a.m123186b(r0, r6, r3, r5, r8)     // Catch:{ all -> 0x00a5 }
            int r5 = r6.size()     // Catch:{ all -> 0x00a5 }
            int r5 = r5 + r1
            if (r5 < 0) goto L_0x0069
            byte[] r10 = r6.mo97987a()     // Catch:{ all -> 0x00a5 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x00a5 }
            kotlin.jvm.internal.C41536l.m120488h(r2, r7)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            byte[] r2 = ie1.C41331l.m119760d(r10, r2, r1, r3, r4)     // Catch:{ all -> 0x00a5 }
        L_0x0065:
            se1.C42550b.m123187a(r0, r8)
            return r2
        L_0x0069:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            r2.append(r4)     // Catch:{ all -> 0x00a5 }
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00a5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x0083:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r5.<init>()     // Catch:{ all -> 0x00a5 }
            r5.append(r4)     // Catch:{ all -> 0x00a5 }
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big ("
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            r5.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " bytes) to fit in memory."
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x00a5 }
            r3.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r3     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            se1.C42550b.m123187a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.C42554f.m123192a(java.io.File):byte[]");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        se1.C42550b.m123187a(r0, r2);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m123193b(java.io.File r2, java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.C41536l.m120489i(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = se1.C42557i.m123200c(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            se1.C42550b.m123187a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            se1.C42550b.m123187a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.C42554f.m123193b(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: c */
    public static /* synthetic */ String m123194c(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C40407d.f95989b;
        }
        return m123193b(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        se1.C42550b.m123187a(r0, r1);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m123195d(java.io.File r1, byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C41536l.m120489i(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.C41536l.m120489i(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            he1.w r1 = he1.C41238w.f97225a     // Catch:{ all -> 0x0019 }
            r1 = 0
            se1.C42550b.m123187a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            se1.C42550b.m123187a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: se1.C42554f.m123195d(java.io.File, byte[]):void");
    }

    /* renamed from: e */
    public static final void m123196e(File file, String str, Charset charset) {
        C41536l.m120489i(file, "<this>");
        C41536l.m120489i(str, "text");
        C41536l.m120489i(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        m123195d(file, bytes);
    }

    /* renamed from: f */
    public static /* synthetic */ void m123197f(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C40407d.f95989b;
        }
        m123196e(file, str, charset);
    }
}
