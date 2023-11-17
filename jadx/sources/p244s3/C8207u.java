package p244s3;

import p166m3.C7082d;
import p205p3.C7674b;

/* renamed from: s3.u */
public class C8207u implements C7082d {

    /* renamed from: a */
    private final C7674b f23383a;

    public C8207u(C7674b bVar) {
        this.f23383a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d A[Catch:{ all -> 0x0033 }] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0044 A[SYNTHETIC, Splitter:B:24:0x0044] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004f A[SYNTHETIC, Splitter:B:29:0x004f] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo7975a(java.io.InputStream r5, java.io.File r6, p166m3.C7088h r7) {
        /*
            r4 = this;
            java.lang.String r7 = "StreamEncoder"
            p3.b r0 = r4.f23383a
            r1 = 65536(0x10000, float:9.18355E-41)
            java.lang.Class<byte[]> r2 = byte[].class
            java.lang.Object r0 = r0.mo22387c(r1, r2)
            byte[] r0 = (byte[]) r0
            r1 = 0
            r2 = 0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0035 }
            r3.<init>(r6)     // Catch:{ IOException -> 0x0035 }
        L_0x0015:
            int r6 = r5.read(r0)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r2 = -1
            if (r6 == r2) goto L_0x0020
            r3.write(r0, r1, r6)     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            goto L_0x0015
        L_0x0020:
            r3.close()     // Catch:{ IOException -> 0x0030, all -> 0x002d }
            r3.close()     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            p3.b r5 = r4.f23383a
            r5.mo22389e(r0)
            r1 = 1
            goto L_0x004c
        L_0x002d:
            r5 = move-exception
            r2 = r3
            goto L_0x004d
        L_0x0030:
            r5 = move-exception
            r2 = r3
            goto L_0x0036
        L_0x0033:
            r5 = move-exception
            goto L_0x004d
        L_0x0035:
            r5 = move-exception
        L_0x0036:
            r6 = 3
            boolean r6 = android.util.Log.isLoggable(r7, r6)     // Catch:{ all -> 0x0033 }
            if (r6 == 0) goto L_0x0042
            java.lang.String r6 = "Failed to encode data onto the OutputStream"
            android.util.Log.d(r7, r6, r5)     // Catch:{ all -> 0x0033 }
        L_0x0042:
            if (r2 == 0) goto L_0x0047
            r2.close()     // Catch:{ IOException -> 0x0047 }
        L_0x0047:
            p3.b r5 = r4.f23383a
            r5.mo22389e(r0)
        L_0x004c:
            return r1
        L_0x004d:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ IOException -> 0x0052 }
        L_0x0052:
            p3.b r6 = r4.f23383a
            r6.mo22389e(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p244s3.C8207u.mo7975a(java.io.InputStream, java.io.File, m3.h):boolean");
    }
}
