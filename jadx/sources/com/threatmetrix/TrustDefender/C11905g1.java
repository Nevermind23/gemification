package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p585re.C17603t;
import p585re.C17604u;

/* renamed from: com.threatmetrix.TrustDefender.g1 */
public abstract class C11905g1 {

    /* renamed from: a */
    private static final String f34834a = C11907h.m43615j(C11905g1.class);

    /* renamed from: com.threatmetrix.TrustDefender.g1$a */
    public static /* synthetic */ class C11906a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f34835a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                re.u[] r0 = p585re.C17604u.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f34835a = r0
                re.u r1 = p585re.C17604u.MD5     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f34835a     // Catch:{ NoSuchFieldError -> 0x001d }
                re.u r1 = p585re.C17604u.SHA256     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11905g1.C11906a.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static MessageDigest m43603a(String str) {
        if (C11996u0.m44036s().mo32072e()) {
            return null;
        }
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            String str2 = f34834a;
            C11907h.C11908a.m43629g(str2, str + " digest failed", e);
            return null;
        }
    }

    /* renamed from: b */
    public static String m43604b(C17603t tVar, C17604u uVar) {
        String C = C11914j.m43652C(tVar);
        String str = f34834a;
        C11907h.C11908a.m43631i(str, "sourceDir: " + C);
        if (C11921k0.m43732o(C)) {
            return m43605c(C, uVar);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008f, code lost:
        throw r7;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m43605c(java.lang.String r6, p585re.C17604u r7) {
        /*
            com.threatmetrix.TrustDefender.u0 r0 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            boolean r0 = r0.mo32072e()
            if (r0 == 0) goto L_0x0013
            com.threatmetrix.TrustDefender.u0 r0 = com.threatmetrix.TrustDefender.C11996u0.m44036s()
            java.lang.String r6 = r0.mo32065E(r6, r7)
            return r6
        L_0x0013:
            java.lang.String r0 = f34834a
            java.lang.String r1 = "Falling back to managed code for hashing"
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r0, r1)
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0090 }
            r1.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0090 }
            java.lang.String r6 = r7.f49319e     // Catch:{ all -> 0x0084 }
            java.security.MessageDigest r6 = m43603a(r6)     // Catch:{ all -> 0x0084 }
            int[] r2 = com.threatmetrix.TrustDefender.C11905g1.C11906a.f34835a     // Catch:{ all -> 0x0084 }
            int r7 = r7.ordinal()     // Catch:{ all -> 0x0084 }
            r7 = r2[r7]     // Catch:{ all -> 0x0084 }
            r2 = 1
            if (r7 == r2) goto L_0x0034
            java.lang.String r7 = "%64s"
            goto L_0x0036
        L_0x0034:
            java.lang.String r7 = "%32s"
        L_0x0036:
            if (r6 != 0) goto L_0x003c
            r1.close()     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0090 }
            return r0
        L_0x003c:
            r3 = 8192(0x2000, float:1.14794E-41)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0084 }
        L_0x0040:
            int r4 = r1.read(r3)     // Catch:{ all -> 0x0084 }
            r5 = 0
            if (r4 <= 0) goto L_0x004b
            r6.update(r3, r5, r4)     // Catch:{ all -> 0x0084 }
            goto L_0x0040
        L_0x004b:
            byte[] r6 = r6.digest()     // Catch:{ all -> 0x0084 }
            java.math.BigInteger r3 = new java.math.BigInteger     // Catch:{ all -> 0x0084 }
            r3.<init>(r2, r6)     // Catch:{ all -> 0x0084 }
            r6 = 16
            java.lang.String r6 = r3.toString(r6)     // Catch:{ all -> 0x0084 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0084 }
            r2[r5] = r6     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = java.lang.String.format(r7, r2)     // Catch:{ all -> 0x0084 }
            r7 = 32
            r2 = 48
            java.lang.String r6 = r6.replace(r7, r2)     // Catch:{ all -> 0x0084 }
            java.lang.String r7 = f34834a     // Catch:{ all -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0084 }
            r2.<init>()     // Catch:{ all -> 0x0084 }
            java.lang.String r3 = "Got : "
            r2.append(r3)     // Catch:{ all -> 0x0084 }
            r2.append(r6)     // Catch:{ all -> 0x0084 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0084 }
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43624b(r7, r2)     // Catch:{ all -> 0x0084 }
            r1.close()     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0090 }
            return r6
        L_0x0084:
            r6 = move-exception
            throw r6     // Catch:{ all -> 0x0086 }
        L_0x0086:
            r7 = move-exception
            r1.close()     // Catch:{ all -> 0x008b }
            goto L_0x008f
        L_0x008b:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0090 }
        L_0x008f:
            throw r7     // Catch:{ FileNotFoundException -> 0x0096, IOException -> 0x0090 }
        L_0x0090:
            r6 = move-exception
            java.lang.String r7 = f34834a
            java.lang.String r1 = "Unable to process file for hashing"
            goto L_0x009b
        L_0x0096:
            r6 = move-exception
            java.lang.String r7 = f34834a
            java.lang.String r1 = "Exception while getting FileInputStream"
        L_0x009b:
            com.threatmetrix.TrustDefender.C11907h.C11908a.m43629g(r7, r1, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C11905g1.m43605c(java.lang.String, re.u):java.lang.String");
    }
}
