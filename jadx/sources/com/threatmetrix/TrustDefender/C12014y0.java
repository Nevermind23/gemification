package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.threatmetrix.TrustDefender.y0 */
public abstract class C12014y0 {

    /* renamed from: a */
    private static Set f35381a = new HashSet();

    /* renamed from: b */
    private static final Object f35382b = new Object();

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: a */
    public static void m44137a(java.lang.String r4) {
        /*
            java.lang.String r0 = "android.permission."
            int r0 = r4.indexOf(r0)
            if (r0 != 0) goto L_0x000f
            r0 = 19
        L_0x000a:
            java.lang.String r4 = r4.substring(r0)
            goto L_0x001a
        L_0x000f:
            java.lang.String r0 = "java.lang.SecurityException: "
            int r0 = r4.indexOf(r0)
            if (r0 != 0) goto L_0x001a
            r0 = 29
            goto L_0x000a
        L_0x001a:
            java.lang.Object r0 = f35382b
            monitor-enter(r0)
            java.util.Set r1 = f35381a     // Catch:{ all -> 0x003a }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x003a }
            r2.<init>()     // Catch:{ all -> 0x003a }
            java.lang.String r3 = "\""
            r2.append(r3)     // Catch:{ all -> 0x003a }
            r2.append(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = "\""
            r2.append(r4)     // Catch:{ all -> 0x003a }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x003a }
            r1.add(r4)     // Catch:{ all -> 0x003a }
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            return
        L_0x003a:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.threatmetrix.TrustDefender.C12014y0.m44137a(java.lang.String):void");
    }

    /* renamed from: b */
    public static String m44138b() {
        synchronized (f35382b) {
            if (f35381a.isEmpty()) {
                return "";
            }
            String obj = f35381a.toString();
            return obj;
        }
    }

    /* renamed from: c */
    public static void m44139c(Exception exc) {
        if (exc instanceof SecurityException) {
            String e = C11921k0.m43722e(exc.toString(), "android.permission.", " ", true);
            if (C11921k0.m43732o(e)) {
                m44137a(e);
            }
        }
    }

    /* renamed from: d */
    public static void m44140d() {
        synchronized (f35382b) {
            f35381a.clear();
        }
    }

    /* renamed from: e */
    public static void m44141e(Exception exc, String str) {
        C11907h.C11908a.m43628f(str, "User refuse granting permission {}", exc.toString());
        m44139c(exc);
    }

    /* renamed from: f */
    public static void m44142f(String str, String str2) {
        C11907h.C11908a.m43628f(str2, "User refuse granting permission {}", str);
        m44137a(str);
    }

    /* renamed from: g */
    public static void m44143g(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            m44137a((String) it.next());
        }
    }
}
