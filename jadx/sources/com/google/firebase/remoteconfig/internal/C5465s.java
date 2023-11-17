package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.C5270e;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.salesforce.marketingcloud.C11398b;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;
import p251sa.C8277b;
import p251sa.C8278c;
import p260t6.C8399a;
import p260t6.C8404f;
import p260t6.C8407i;
import p260t6.C8409k;
import p339z9.C9270e;

/* renamed from: com.google.firebase.remoteconfig.internal.s */
public class C5465s {

    /* renamed from: q */
    static final int[] f17463q = {2, 4, 8, 16, 32, 64, 128, C11398b.f33139r};

    /* renamed from: r */
    private static final Pattern f17464r = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* renamed from: a */
    private final Set f17465a;

    /* renamed from: b */
    private boolean f17466b;

    /* renamed from: c */
    private int f17467c;

    /* renamed from: d */
    private boolean f17468d;

    /* renamed from: e */
    private boolean f17469e;

    /* renamed from: f */
    private final int f17470f = 8;

    /* renamed from: g */
    private final ScheduledExecutorService f17471g;

    /* renamed from: h */
    private final C5455m f17472h;

    /* renamed from: i */
    private final C5270e f17473i;

    /* renamed from: j */
    private final C9270e f17474j;

    /* renamed from: k */
    C5444f f17475k;

    /* renamed from: l */
    private final Context f17476l;

    /* renamed from: m */
    private final String f17477m;

    /* renamed from: n */
    private final Random f17478n;

    /* renamed from: o */
    private final C8404f f17479o;

    /* renamed from: p */
    private final C5460p f17480p;

    /* renamed from: com.google.firebase.remoteconfig.internal.s$a */
    class C5466a implements Runnable {
        C5466a() {
        }

        public void run() {
            C5465s.this.mo18139d();
        }
    }

    /* renamed from: com.google.firebase.remoteconfig.internal.s$b */
    class C5467b implements C8278c {
        C5467b() {
        }

        /* renamed from: a */
        public void mo18145a(C8277b bVar) {
        }

        /* renamed from: b */
        public void mo18146b(FirebaseRemoteConfigException firebaseRemoteConfigException) {
            C5465s.this.m21758i();
            C5465s.this.m21769t(firebaseRemoteConfigException);
        }
    }

    public C5465s(C5270e eVar, C9270e eVar2, C5455m mVar, C5444f fVar, Context context, String str, Set set, C5460p pVar, ScheduledExecutorService scheduledExecutorService) {
        this.f17465a = set;
        this.f17466b = false;
        this.f17471g = scheduledExecutorService;
        this.f17478n = new Random();
        this.f17467c = Math.max(8 - pVar.mo18122h().mo18135b(), 1);
        this.f17479o = C8407i.m31544d();
        this.f17473i = eVar;
        this.f17472h = mVar;
        this.f17474j = eVar2;
        this.f17475k = fVar;
        this.f17476l = context;
        this.f17477m = str;
        this.f17480p = pVar;
        this.f17468d = false;
        this.f17469e = false;
    }

    /* renamed from: C */
    private void m21752C(Date date) {
        int b = this.f17480p.mo18122h().mo18135b() + 1;
        this.f17480p.mo18128n(b, new Date(date.getTime() + m21762m(b)));
    }

    /* renamed from: e */
    private synchronized boolean m21756e() {
        boolean z;
        if (this.f17465a.isEmpty() || this.f17466b || this.f17468d || this.f17469e) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    /* renamed from: h */
    private JSONObject m21757h() {
        HashMap hashMap = new HashMap();
        hashMap.put("project", m21759j(this.f17473i.mo17483n().mo17517c()));
        hashMap.put("namespace", this.f17477m);
        hashMap.put("lastKnownVersionNumber", Long.toString(this.f17472h.mo18106r()));
        hashMap.put("appId", this.f17473i.mo17483n().mo17517c());
        hashMap.put("sdkVersion", "21.4.0");
        return new JSONObject(hashMap);
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public synchronized void m21758i() {
        this.f17468d = true;
    }

    /* renamed from: j */
    private static String m21759j(String str) {
        Matcher matcher = f17464r.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    /* renamed from: k */
    private String m21760k() {
        try {
            Context context = this.f17476l;
            byte[] a = C8399a.m31523a(context, context.getPackageName());
            if (a != null) {
                return C8409k.m31556b(a, false);
            }
            Log.e("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + this.f17476l.getPackageName());
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.i("FirebaseRemoteConfig", "No such package: " + this.f17476l.getPackageName());
            return null;
        }
    }

    /* renamed from: l */
    private void m21761l(HttpURLConnection httpURLConnection) {
        this.f17474j.mo17505b(false).mo24874s(this.f17471g, new C5464r(httpURLConnection));
    }

    /* renamed from: m */
    private long m21762m(int i) {
        int[] iArr = f17463q;
        int length = iArr.length;
        if (i >= length) {
            i = length;
        }
        long millis = TimeUnit.MINUTES.toMillis((long) iArr[i - 1]);
        return (millis / 2) + ((long) this.f17478n.nextInt((int) millis));
    }

    /* renamed from: n */
    private String m21763n(String str) {
        return String.format("https://firebaseremoteconfigrealtime.googleapis.com/v1/projects/%s/namespaces/%s:streamFetchInvalidations", new Object[]{m21759j(this.f17473i.mo17483n().mo17517c()), str});
    }

    /* renamed from: o */
    private URL m21764o() {
        try {
            return new URL(m21763n(this.f17477m));
        } catch (MalformedURLException unused) {
            Log.e("FirebaseRemoteConfig", "URL is malformed");
            return null;
        }
    }

    /* renamed from: p */
    private boolean m21765p(int i) {
        return i == 408 || i == 429 || i == 502 || i == 503 || i == 504;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return;
     */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void m21767r(long r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.m21756e()     // Catch:{ all -> 0x0030 }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r3)
            return
        L_0x0009:
            int r0 = r3.f17467c     // Catch:{ all -> 0x0030 }
            if (r0 <= 0) goto L_0x001e
            int r0 = r0 + -1
            r3.f17467c = r0     // Catch:{ all -> 0x0030 }
            java.util.concurrent.ScheduledExecutorService r0 = r3.f17471g     // Catch:{ all -> 0x0030 }
            com.google.firebase.remoteconfig.internal.s$a r1 = new com.google.firebase.remoteconfig.internal.s$a     // Catch:{ all -> 0x0030 }
            r1.<init>()     // Catch:{ all -> 0x0030 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x0030 }
            r0.schedule(r1, r4, r2)     // Catch:{ all -> 0x0030 }
            goto L_0x002e
        L_0x001e:
            boolean r4 = r3.f17469e     // Catch:{ all -> 0x0030 }
            if (r4 != 0) goto L_0x002e
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r4 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x0030 }
            java.lang.String r5 = "Unable to connect to the server. Check your connection and try again."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r0 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_STREAM_ERROR     // Catch:{ all -> 0x0030 }
            r4.<init>((java.lang.String) r5, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a) r0)     // Catch:{ all -> 0x0030 }
            r3.m21769t(r4)     // Catch:{ all -> 0x0030 }
        L_0x002e:
            monitor-exit(r3)
            return
        L_0x0030:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C5465s.m21767r(long):void");
    }

    /* renamed from: s */
    private String m21768s(InputStream inputStream) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
        } catch (IOException unused) {
            if (sb.length() == 0) {
                return "Unable to connect to the server, access is forbidden. HTTP status code: 403";
            }
        }
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public synchronized void m21769t(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (C8278c b : this.f17465a) {
            b.mo18146b(firebaseRemoteConfigException);
        }
    }

    /* renamed from: u */
    private synchronized void m21770u() {
        this.f17467c = 8;
    }

    /* renamed from: w */
    private void m21771w(HttpURLConnection httpURLConnection) {
        m21761l(httpURLConnection);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.f17473i.mo17483n().mo17516b());
        httpURLConnection.setRequestProperty("X-Android-Package", this.f17476l.getPackageName());
        httpURLConnection.setRequestProperty("X-Android-Cert", m21760k());
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Accept-Response-Streaming", "true");
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
    }

    /* renamed from: x */
    private synchronized void m21772x(boolean z) {
        this.f17466b = z;
    }

    /* renamed from: z */
    private void m21773z(HttpURLConnection httpURLConnection) {
        httpURLConnection.setRequestMethod("POST");
        byte[] bytes = m21757h().toString().getBytes("utf-8");
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    /* renamed from: A */
    public synchronized C5439b mo18137A(HttpURLConnection httpURLConnection) {
        HttpURLConnection httpURLConnection2;
        httpURLConnection2 = httpURLConnection;
        return new C5439b(httpURLConnection2, this.f17472h, this.f17475k, this.f17465a, new C5467b(), this.f17471g);
    }

    /* renamed from: B */
    public void mo18138B() {
        m21767r(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0127  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0167  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18139d() {
        /*
            r13 = this;
            java.lang.String r0 = "Unable to connect to the server. Try again in a few minutes. HTTP status code: %d"
            boolean r1 = r13.m21756e()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            com.google.firebase.remoteconfig.internal.p r1 = r13.f17480p
            com.google.firebase.remoteconfig.internal.p$b r1 = r1.mo18122h()
            java.util.Date r2 = new java.util.Date
            t6.f r3 = r13.f17479o
            long r3 = r3.mo23594a()
            r2.<init>(r3)
            java.util.Date r1 = r1.mo18134a()
            boolean r1 = r2.before(r1)
            if (r1 == 0) goto L_0x0028
            r13.mo18142v()
            return
        L_0x0028:
            r1 = 1
            r13.m21772x(r1)
            r2 = 0
            r3 = 403(0x193, float:5.65E-43)
            r4 = 200(0xc8, float:2.8E-43)
            r5 = 0
            java.net.HttpURLConnection r6 = r13.mo18141g()     // Catch:{ IOException -> 0x00b8, all -> 0x00b5 }
            int r7 = r6.getResponseCode()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            int r7 = r2.intValue()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            if (r7 != r4) goto L_0x0053
            r13.m21770u()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            com.google.firebase.remoteconfig.internal.p r7 = r13.f17480p     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            r7.mo18124j()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            com.google.firebase.remoteconfig.internal.b r7 = r13.mo18137A(r6)     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
            r7.mo18076i()     // Catch:{ IOException -> 0x00b0, all -> 0x00aa }
        L_0x0053:
            r13.mo18140f(r6)
            r13.m21772x(r5)
            int r7 = r2.intValue()
            boolean r7 = r13.m21765p(r7)
            if (r7 == 0) goto L_0x0065
            r7 = r1
            goto L_0x0066
        L_0x0065:
            r7 = r5
        L_0x0066:
            if (r7 == 0) goto L_0x0076
            java.util.Date r8 = new java.util.Date
            t6.f r9 = r13.f17479o
            long r9 = r9.mo23594a()
            r8.<init>(r9)
            r13.m21752C(r8)
        L_0x0076:
            if (r7 != 0) goto L_0x00a5
            int r7 = r2.intValue()
            if (r7 != r4) goto L_0x007f
            goto L_0x00a5
        L_0x007f:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r1 = r2.intValue()
            if (r1 != r3) goto L_0x0095
            java.io.InputStream r0 = r6.getErrorStream()
            java.lang.String r0 = r13.m21768s(r0)
        L_0x0095:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r1 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r2 = r2.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r3 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_STREAM_ERROR
            r1.<init>((int) r2, (java.lang.String) r0, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a) r3)
        L_0x00a0:
            r13.m21769t(r1)
            goto L_0x0112
        L_0x00a5:
            r13.mo18142v()
            goto L_0x0112
        L_0x00aa:
            r7 = move-exception
            r12 = r6
            r6 = r2
            r2 = r12
            goto L_0x0114
        L_0x00b0:
            r7 = move-exception
            r12 = r6
            r6 = r2
            r2 = r12
            goto L_0x00ba
        L_0x00b5:
            r7 = move-exception
            r6 = r2
            goto L_0x0114
        L_0x00b8:
            r7 = move-exception
            r6 = r2
        L_0x00ba:
            java.lang.String r8 = "FirebaseRemoteConfig"
            java.lang.String r9 = "Exception connecting to real-time RC backend. Retrying the connection..."
            android.util.Log.d(r8, r9, r7)     // Catch:{ all -> 0x0113 }
            r13.mo18140f(r2)
            r13.m21772x(r5)
            if (r6 == 0) goto L_0x00d6
            int r7 = r6.intValue()
            boolean r7 = r13.m21765p(r7)
            if (r7 == 0) goto L_0x00d4
            goto L_0x00d6
        L_0x00d4:
            r7 = r5
            goto L_0x00d7
        L_0x00d6:
            r7 = r1
        L_0x00d7:
            if (r7 == 0) goto L_0x00e7
            java.util.Date r8 = new java.util.Date
            t6.f r9 = r13.f17479o
            long r9 = r9.mo23594a()
            r8.<init>(r9)
            r13.m21752C(r8)
        L_0x00e7:
            if (r7 != 0) goto L_0x00a5
            int r7 = r6.intValue()
            if (r7 != r4) goto L_0x00f0
            goto L_0x00a5
        L_0x00f0:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r6
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r1 = r6.intValue()
            if (r1 != r3) goto L_0x0106
            java.io.InputStream r0 = r2.getErrorStream()
            java.lang.String r0 = r13.m21768s(r0)
        L_0x0106:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r1 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r2 = r6.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r3 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_STREAM_ERROR
            r1.<init>((int) r2, (java.lang.String) r0, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a) r3)
            goto L_0x00a0
        L_0x0112:
            return
        L_0x0113:
            r7 = move-exception
        L_0x0114:
            r13.mo18140f(r2)
            r13.m21772x(r5)
            if (r6 == 0) goto L_0x0129
            int r8 = r6.intValue()
            boolean r8 = r13.m21765p(r8)
            if (r8 == 0) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r8 = r5
            goto L_0x012a
        L_0x0129:
            r8 = r1
        L_0x012a:
            if (r8 == 0) goto L_0x013a
            java.util.Date r9 = new java.util.Date
            t6.f r10 = r13.f17479o
            long r10 = r10.mo23594a()
            r9.<init>(r10)
            r13.m21752C(r9)
        L_0x013a:
            if (r8 != 0) goto L_0x0167
            int r8 = r6.intValue()
            if (r8 == r4) goto L_0x0167
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r5] = r6
            java.lang.String r0 = java.lang.String.format(r0, r1)
            int r1 = r6.intValue()
            if (r1 != r3) goto L_0x0158
            java.io.InputStream r0 = r2.getErrorStream()
            java.lang.String r0 = r13.m21768s(r0)
        L_0x0158:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r1 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException
            int r2 = r6.intValue()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r3 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_STREAM_ERROR
            r1.<init>((int) r2, (java.lang.String) r0, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a) r3)
            r13.m21769t(r1)
            goto L_0x016a
        L_0x0167:
            r13.mo18142v()
        L_0x016a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C5465s.mo18139d():void");
    }

    /* renamed from: f */
    public void mo18140f(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
                if (httpURLConnection.getErrorStream() != null) {
                    httpURLConnection.getErrorStream().close();
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: g */
    public HttpURLConnection mo18141g() {
        HttpURLConnection httpURLConnection = (HttpURLConnection) m21764o().openConnection();
        m21771w(httpURLConnection);
        m21773z(httpURLConnection);
        return httpURLConnection;
    }

    /* renamed from: v */
    public synchronized void mo18142v() {
        m21767r(Math.max(0, this.f17480p.mo18122h().mo18134a().getTime() - new Date(this.f17479o.mo23594a()).getTime()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo18143y(boolean z) {
        this.f17469e = z;
    }
}
