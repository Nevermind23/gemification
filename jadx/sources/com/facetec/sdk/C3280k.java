package com.facetec.sdk;

import android.hardware.Camera;
import android.util.Size;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facetec.sdk.k */
final class C3280k {

    /* renamed from: a */
    static String f10765a = "";

    /* renamed from: b */
    private static String f10766b = "";

    /* renamed from: c */
    private static String f10767c = "";

    /* renamed from: d */
    static int f10768d = 1;

    /* renamed from: e */
    private static final List<String> f10769e = Arrays.asList(new String[]{"ro_kernel", "ro_product", "ro_boot", "ro_hardware", "ro_build"});

    /* renamed from: f */
    private static String f10770f = "";

    /* renamed from: g */
    private static StringBuilder f10771g = new StringBuilder();

    /* renamed from: i */
    private static String f10772i = "";

    C3280k() {
    }

    /* renamed from: b */
    static void m13160b() {
        C2885cd.m11776I(C2790am.f8927x, f10768d);
        C2885cd.m11768E(C2790am.f8928y, f10767c);
        C2885cd.m11768E(C2790am.f8926w, f10766b);
        C2885cd.m11768E(C2790am.f8924u, f10770f);
        C2885cd.m11768E(C2790am.f8885B, f10772i);
    }

    /* renamed from: d */
    static void m13161d() {
        C2885cd.m11768E(C2790am.f8889F, String.valueOf(C2809aw.m10979b("BT")));
        C2885cd.m11768E(C2790am.f8892I, String.valueOf(C2809aw.m10979b("RWT")));
        C2885cd.m11768E(C2790am.f8891H, String.valueOf(C2809aw.m10979b("CTOT")));
        C2885cd.m11768E(C2790am.f8890G, String.valueOf(C2809aw.m10979b("CLOT")));
        C2885cd.m11768E(C2790am.f8895L, String.valueOf(C2809aw.m10979b("CTCPT")));
        C2885cd.m11768E(C2790am.f8897N, String.valueOf(C2809aw.m10979b("CLCPT")));
        C2885cd.m11768E(C2790am.f8894K, String.valueOf(C2809aw.m10979b("CTCCST")));
        C2885cd.m11768E(C2790am.f8901R, String.valueOf(C2809aw.m10979b("CTPRT")));
        C2885cd.m11768E(C2790am.f8899P, String.valueOf(C2809aw.m10979b("CTFFT")));
        C2885cd.m11768E(C2790am.f8898O, String.valueOf(C2809aw.m10979b("CLFFT")));
    }

    /* renamed from: e */
    static void m13164e(Size[] sizeArr) {
        if (f10770f.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Size size : sizeArr) {
                sb.append(size.getWidth());
                sb.append("x");
                sb.append(size.getHeight());
                sb.append(",");
            }
            f10770f = sb.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a8, code lost:
        if (r2 == null) goto L_0x00ad;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m13162d(android.content.Context r9) {
        /*
            java.lang.String r0 = ""
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0098 }
            java.lang.String r4 = "getprop"
            java.lang.Process r2 = r3.exec(r4)     // Catch:{ IOException -> 0x0098 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0098 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0098 }
            java.io.InputStream r5 = r2.getInputStream()     // Catch:{ IOException -> 0x0098 }
            r4.<init>(r5)     // Catch:{ IOException -> 0x0098 }
            r3.<init>(r4)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r4 = r3.readLine()     // Catch:{ IOException -> 0x0098 }
        L_0x0024:
            if (r4 == 0) goto L_0x00aa
            boolean r5 = r4.isEmpty()     // Catch:{ IOException -> 0x0098 }
            if (r5 != 0) goto L_0x00aa
            java.lang.String r5 = "]: \\["
            java.lang.String[] r5 = r4.split(r5)     // Catch:{ IOException -> 0x0098 }
            int r6 = r5.length     // Catch:{ IOException -> 0x0098 }
            r7 = 2
            if (r6 == r7) goto L_0x003c
            java.lang.String r5 = ":"
            java.lang.String[] r5 = r4.split(r5)     // Catch:{ IOException -> 0x0098 }
        L_0x003c:
            int r6 = r5.length     // Catch:{ IOException -> 0x0098 }
            if (r6 < r7) goto L_0x0089
            r6 = 0
            r6 = r5[r6]     // Catch:{ IOException -> 0x0098 }
            java.lang.String r7 = "."
            java.lang.String r8 = "_"
            java.lang.String r6 = r6.replace(r7, r8)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r7 = "["
            java.lang.String r6 = r6.replace(r7, r0)     // Catch:{ IOException -> 0x0098 }
            r7 = 1
            r5 = r5[r7]     // Catch:{ IOException -> 0x0098 }
            java.lang.String r7 = "]"
            java.lang.String r5 = r5.replace(r7, r0)     // Catch:{ IOException -> 0x0098 }
            java.util.List<java.lang.String> r7 = f10769e     // Catch:{ IOException -> 0x0098 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ IOException -> 0x0098 }
        L_0x005f:
            boolean r8 = r7.hasNext()     // Catch:{ IOException -> 0x0098 }
            if (r8 == 0) goto L_0x0089
            java.lang.Object r8 = r7.next()     // Catch:{ IOException -> 0x0098 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0098 }
            boolean r8 = r6.contains(r8)     // Catch:{ IOException -> 0x0098 }
            if (r8 == 0) goto L_0x005f
            boolean r8 = r5.isEmpty()     // Catch:{ IOException -> 0x0098 }
            if (r8 != 0) goto L_0x005f
            java.lang.StringBuilder r7 = f10771g     // Catch:{ IOException -> 0x0098 }
            r7.append(r6)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r6 = ": "
            r7.append(r6)     // Catch:{ IOException -> 0x0098 }
            r7.append(r5)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r5 = ", "
            r7.append(r5)     // Catch:{ IOException -> 0x0098 }
        L_0x0089:
            r1.append(r4)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r4 = "\n"
            r1.append(r4)     // Catch:{ IOException -> 0x0098 }
            java.lang.String r4 = r3.readLine()     // Catch:{ IOException -> 0x0098 }
            goto L_0x0024
        L_0x0096:
            r9 = move-exception
            goto L_0x00c5
        L_0x0098:
            r0 = move-exception
            com.facetec.sdk.c r3 = com.facetec.sdk.C2867c.DEVICE_SYSTEM_PROPERTY_ANNOTATION_ERROR     // Catch:{ all -> 0x0096 }
            java.lang.String r4 = "Error getting device system property: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0096 }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x0096 }
            com.facetec.sdk.C3555s.m13898c((android.content.Context) r9, (com.facetec.sdk.C2867c) r3, (java.lang.String) r0)     // Catch:{ all -> 0x0096 }
            if (r2 == 0) goto L_0x00ad
        L_0x00aa:
            r2.destroy()
        L_0x00ad:
            int r9 = r1.length()
            if (r9 == 0) goto L_0x00b9
            java.lang.String r9 = r1.toString()
            f10765a = r9
        L_0x00b9:
            java.lang.StringBuilder r9 = f10771g
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = com.facetec.sdk.C2790am.f8900Q
            com.facetec.sdk.C2885cd.m11778K(r0, r9)
            return
        L_0x00c5:
            if (r2 == 0) goto L_0x00ca
            r2.destroy()
        L_0x00ca:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.C3280k.m13162d(android.content.Context):void");
    }

    /* renamed from: d */
    static void m13163d(List<Camera.Size> list) {
        if (f10767c.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (Camera.Size next : list) {
                sb.append(next.width);
                sb.append("x");
                sb.append(next.height);
                sb.append(",");
            }
            f10767c = sb.toString();
        }
    }
}
