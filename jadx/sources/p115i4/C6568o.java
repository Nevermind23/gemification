package p115i4;

import android.content.Context;
import com.facebook.GraphRequest;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import p167m4.C7093a;
import p297w4.C8765a;
import p297w4.C8769a0;
import p334z4.C9207a;

/* renamed from: i4.o */
class C6568o {

    /* renamed from: g */
    private static final String f20032g = "o";

    /* renamed from: a */
    private List f20033a = new ArrayList();

    /* renamed from: b */
    private List f20034b = new ArrayList();

    /* renamed from: c */
    private int f20035c;

    /* renamed from: d */
    private C8765a f20036d;

    /* renamed from: e */
    private String f20037e;

    /* renamed from: f */
    private final int f20038f = 1000;

    public C6568o(C8765a aVar, String str) {
        this.f20036d = aVar;
        this.f20037e = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        p334z4.C9207a.m34023b(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001b, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x001d */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m25900g(com.facebook.GraphRequest r4, android.content.Context r5, int r6, org.json.JSONArray r7, boolean r8) {
        /*
            r3 = this;
            boolean r0 = p334z4.C9207a.m34024c(r3)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            o4.c$b r0 = p193o4.C7439c.C7441b.CUSTOM_APP_EVENTS     // Catch:{ JSONException -> 0x001d }
            w4.a r1 = r3.f20036d     // Catch:{ JSONException -> 0x001d }
            java.lang.String r2 = r3.f20037e     // Catch:{ JSONException -> 0x001d }
            org.json.JSONObject r5 = p193o4.C7439c.m28299a(r0, r1, r2, r8, r5)     // Catch:{ JSONException -> 0x001d }
            int r8 = r3.f20035c     // Catch:{ JSONException -> 0x001d }
            if (r8 <= 0) goto L_0x0022
            java.lang.String r8 = "num_skipped_events"
            r5.put(r8, r6)     // Catch:{ JSONException -> 0x001d }
            goto L_0x0022
        L_0x001b:
            r4 = move-exception
            goto L_0x0042
        L_0x001d:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x001b }
            r5.<init>()     // Catch:{ all -> 0x001b }
        L_0x0022:
            r4.mo8179X(r5)     // Catch:{ all -> 0x001b }
            android.os.Bundle r5 = r4.mo8192y()     // Catch:{ all -> 0x001b }
            if (r5 != 0) goto L_0x0030
            android.os.Bundle r5 = new android.os.Bundle     // Catch:{ all -> 0x001b }
            r5.<init>()     // Catch:{ all -> 0x001b }
        L_0x0030:
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x001b }
            if (r6 == 0) goto L_0x003e
            java.lang.String r7 = "custom_events"
            r5.putString(r7, r6)     // Catch:{ all -> 0x001b }
            r4.mo8183b0(r6)     // Catch:{ all -> 0x001b }
        L_0x003e:
            r4.mo8181Z(r5)     // Catch:{ all -> 0x001b }
            return
        L_0x0042:
            p334z4.C9207a.m34023b(r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i4.C6568o.m25900g(com.facebook.GraphRequest, android.content.Context, int, org.json.JSONArray, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0029, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void mo20558a(p115i4.C6535c r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = p334z4.C9207a.m34024c(r2)     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0009
            monitor-exit(r2)
            return
        L_0x0009:
            java.util.List r0 = r2.f20033a     // Catch:{ all -> 0x002a }
            int r0 = r0.size()     // Catch:{ all -> 0x002a }
            java.util.List r1 = r2.f20034b     // Catch:{ all -> 0x002a }
            int r1 = r1.size()     // Catch:{ all -> 0x002a }
            int r0 = r0 + r1
            int r1 = r2.mo20562e()     // Catch:{ all -> 0x002a }
            if (r0 < r1) goto L_0x0023
            int r3 = r2.f20035c     // Catch:{ all -> 0x002a }
            int r3 = r3 + 1
            r2.f20035c = r3     // Catch:{ all -> 0x002a }
            goto L_0x0028
        L_0x0023:
            java.util.List r0 = r2.f20033a     // Catch:{ all -> 0x002a }
            r0.add(r3)     // Catch:{ all -> 0x002a }
        L_0x0028:
            monitor-exit(r2)
            return
        L_0x002a:
            r3 = move-exception
            p334z4.C9207a.m34023b(r3, r2)     // Catch:{ all -> 0x0030 }
            monitor-exit(r2)
            return
        L_0x0030:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p115i4.C6568o.mo20558a(i4.c):void");
    }

    /* renamed from: b */
    public synchronized void mo20559b(boolean z) {
        if (!C9207a.m34024c(this)) {
            if (z) {
                try {
                    this.f20033a.addAll(this.f20034b);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                    return;
                }
            }
            this.f20034b.clear();
            this.f20035c = 0;
        }
    }

    /* renamed from: c */
    public synchronized int mo20560c() {
        if (C9207a.m34024c(this)) {
            return 0;
        }
        try {
            return this.f20033a.size();
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return 0;
        }
    }

    /* renamed from: d */
    public synchronized List mo20561d() {
        if (C9207a.m34024c(this)) {
            return null;
        }
        try {
            List list = this.f20033a;
            this.f20033a = new ArrayList();
            return list;
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public int mo20562e() {
        return C9207a.m34024c(this) ? 0 : 1000;
    }

    /* renamed from: f */
    public int mo20563f(GraphRequest graphRequest, Context context, boolean z, boolean z2) {
        if (C9207a.m34024c(this)) {
            return 0;
        }
        try {
            synchronized (this) {
                int i = this.f20035c;
                C7093a.m27383d(this.f20033a);
                this.f20034b.addAll(this.f20033a);
                this.f20033a.clear();
                JSONArray jSONArray = new JSONArray();
                for (C6535c cVar : this.f20034b) {
                    if (!cVar.mo20516f()) {
                        String str = f20032g;
                        C8769a0.m32649V(str, "Event with invalid checksum: " + cVar.toString());
                    } else if (z || !cVar.mo20513b()) {
                        jSONArray.put(cVar.mo20514c());
                    }
                }
                if (jSONArray.length() == 0) {
                    return 0;
                }
                m25900g(graphRequest, context, i, jSONArray, z2);
                return jSONArray.length();
            }
        } catch (Throwable th) {
            C9207a.m34023b(th, this);
            return 0;
        }
    }
}
