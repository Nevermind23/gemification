package p293w0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import kotlin.jvm.internal.C41536l;
import p267u0.C8503w;
import p318y0.C8991b;
import p318y0.C9007l;

/* renamed from: w0.b */
public abstract class C8722b {
    /* renamed from: a */
    public static final CancellationSignal m32484a() {
        return C8991b.m33279b();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005f, code lost:
        se1.C42550b.m123187a(r1, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m32485b(p318y0.C8998i r6) {
        /*
            java.lang.String r0 = "db"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            java.util.List r0 = ie1.C41339p.m119898c()
            java.lang.String r1 = "SELECT name FROM sqlite_master WHERE type = 'trigger'"
            android.database.Cursor r1 = r6.mo23659b1(r1)
        L_0x000f:
            boolean r2 = r1.moveToNext()     // Catch:{ all -> 0x005c }
            r3 = 0
            if (r2 == 0) goto L_0x001e
            java.lang.String r2 = r1.getString(r3)     // Catch:{ all -> 0x005c }
            r0.add(r2)     // Catch:{ all -> 0x005c }
            goto L_0x000f
        L_0x001e:
            he1.w r2 = he1.C41238w.f97225a     // Catch:{ all -> 0x005c }
            r2 = 0
            se1.C42550b.m123187a(r1, r2)
            java.util.List r0 = ie1.C41339p.m119896a(r0)
            java.util.Iterator r0 = r0.iterator()
        L_0x002c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r4 = "triggerName"
            kotlin.jvm.internal.C41536l.m120488h(r1, r4)
            java.lang.String r4 = "room_fts_content_sync_"
            r5 = 2
            boolean r4 = cf1.C40439w.m117109H(r1, r4, r3, r5, r2)
            if (r4 == 0) goto L_0x002c
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "DROP TRIGGER IF EXISTS "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r6.mo23652L(r1)
            goto L_0x002c
        L_0x005b:
            return
        L_0x005c:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x005e }
        L_0x005e:
            r0 = move-exception
            se1.C42550b.m123187a(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w0.C8722b.m32485b(y0.i):void");
    }

    /* renamed from: c */
    public static final Cursor m32486c(C8503w wVar, C9007l lVar, boolean z, CancellationSignal cancellationSignal) {
        int i;
        C41536l.m120489i(wVar, "db");
        C41536l.m120489i(lVar, "sqLiteQuery");
        Cursor B = wVar.mo23801B(lVar, cancellationSignal);
        if (!z || !(B instanceof AbstractWindowedCursor)) {
            return B;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) B;
        int count = abstractWindowedCursor.getCount();
        if (abstractWindowedCursor.hasWindow()) {
            i = abstractWindowedCursor.getWindow().getNumRows();
        } else {
            i = count;
        }
        if (i < count) {
            return C8721a.m32479a(B);
        }
        return B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        se1.C42550b.m123187a(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        throw r1;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int m32487d(java.io.File r8) {
        /*
            java.lang.String r0 = "databaseFile"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()
            r0 = 4
            java.nio.ByteBuffer r7 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ all -> 0x003b }
            r2 = 60
            r4 = 4
            r6 = 1
            r1 = r8
            r1.tryLock(r2, r4, r6)     // Catch:{ all -> 0x003b }
            r1 = 60
            r8.position(r1)     // Catch:{ all -> 0x003b }
            int r1 = r8.read(r7)     // Catch:{ all -> 0x003b }
            if (r1 != r0) goto L_0x0033
            r7.rewind()     // Catch:{ all -> 0x003b }
            int r0 = r7.getInt()     // Catch:{ all -> 0x003b }
            r1 = 0
            se1.C42550b.m123187a(r8, r1)
            return r0
        L_0x0033:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003b }
            java.lang.String r1 = "Bad database header, unable to read 4 bytes at offset 60"
            r0.<init>(r1)     // Catch:{ all -> 0x003b }
            throw r0     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r1 = move-exception
            se1.C42550b.m123187a(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p293w0.C8722b.m32487d(java.io.File):int");
    }
}
