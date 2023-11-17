package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.C5455m;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import p251sa.C8277b;
import p251sa.C8278c;
import p337z7.C9231i;
import p337z7.Task;

/* renamed from: com.google.firebase.remoteconfig.internal.b */
public class C5439b {

    /* renamed from: a */
    private final Set f17366a;

    /* renamed from: b */
    private final HttpURLConnection f17367b;

    /* renamed from: c */
    private final C5455m f17368c;

    /* renamed from: d */
    private final C5444f f17369d;

    /* renamed from: e */
    private final C8278c f17370e;

    /* renamed from: f */
    private final ScheduledExecutorService f17371f;

    /* renamed from: g */
    private final Random f17372g = new Random();

    /* renamed from: com.google.firebase.remoteconfig.internal.b$a */
    class C5440a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f17373d;

        /* renamed from: e */
        final /* synthetic */ long f17374e;

        C5440a(int i, long j) {
            this.f17373d = i;
            this.f17374e = j;
        }

        public void run() {
            C5439b.this.mo18075d(this.f17373d, this.f17374e);
        }
    }

    public C5439b(HttpURLConnection httpURLConnection, C5455m mVar, C5444f fVar, Set set, C8278c cVar, ScheduledExecutorService scheduledExecutorService) {
        this.f17367b = httpURLConnection;
        this.f17368c = mVar;
        this.f17369d = fVar;
        this.f17366a = set;
        this.f17370e = cVar;
        this.f17371f = scheduledExecutorService;
    }

    /* renamed from: b */
    private void m21634b(int i, long j) {
        if (i == 0) {
            m21641k(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template.", FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_NOT_FETCHED));
            return;
        }
        this.f17371f.schedule(new C5440a(i, j), (long) this.f17372g.nextInt(4), TimeUnit.SECONDS);
    }

    /* renamed from: c */
    private synchronized void m21635c(C8277b bVar) {
        for (C8278c a : this.f17366a) {
            a.mo18145a(bVar);
        }
    }

    /* renamed from: e */
    private static Boolean m21636e(C5455m.C5456a aVar, long j) {
        boolean z = false;
        if (aVar.mo18107d() != null) {
            if (aVar.mo18107d().mo18095i() >= j) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        if (aVar.mo18109f() == 1) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r5.has("featureDisabled") == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004a, code lost:
        if (r5.getBoolean("featureDisabled") == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        r9.f17370e.mo18146b(new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes.", com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_UNAVAILABLE));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005f, code lost:
        if (m21638g() == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0066, code lost:
        if (r5.has("latestTemplateVersionNumber") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0068, code lost:
        r6 = r9.f17368c.mo18106r();
        r4 = r5.getLong("latestTemplateVersionNumber");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        if (r4 <= r6) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0076, code lost:
        m21634b(3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
        r5 = new org.json.JSONObject(r4);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m21637f(java.io.InputStream r10) {
        /*
            r9 = this;
            java.lang.String r0 = "latestTemplateVersionNumber"
            java.lang.String r1 = "featureDisabled"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            java.lang.String r4 = "utf-8"
            r3.<init>(r10, r4)
            r2.<init>(r3)
            java.lang.String r3 = ""
        L_0x0012:
            r4 = r3
        L_0x0013:
            java.lang.String r5 = r2.readLine()
            if (r5 == 0) goto L_0x0095
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r4)
            r6.append(r5)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = "}"
            boolean r5 = r5.contains(r6)
            if (r5 == 0) goto L_0x0013
            java.lang.String r4 = r9.m21640j(r4)
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L_0x003b
            goto L_0x0013
        L_0x003b:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x007b }
            r5.<init>(r4)     // Catch:{ JSONException -> 0x007b }
            boolean r4 = r5.has(r1)     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x005b
            boolean r4 = r5.getBoolean(r1)     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x005b
            sa.c r4 = r9.f17370e     // Catch:{ JSONException -> 0x007b }
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ JSONException -> 0x007b }
            java.lang.String r6 = "The server is temporarily unavailable. Try again in a few minutes."
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_UNAVAILABLE     // Catch:{ JSONException -> 0x007b }
            r5.<init>((java.lang.String) r6, (com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a) r7)     // Catch:{ JSONException -> 0x007b }
            r4.mo18146b(r5)     // Catch:{ JSONException -> 0x007b }
            goto L_0x0095
        L_0x005b:
            boolean r4 = r9.m21638g()     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x0062
            goto L_0x0095
        L_0x0062:
            boolean r4 = r5.has(r0)     // Catch:{ JSONException -> 0x007b }
            if (r4 == 0) goto L_0x0012
            com.google.firebase.remoteconfig.internal.m r4 = r9.f17368c     // Catch:{ JSONException -> 0x007b }
            long r6 = r4.mo18106r()     // Catch:{ JSONException -> 0x007b }
            long r4 = r5.getLong(r0)     // Catch:{ JSONException -> 0x007b }
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x0012
            r6 = 3
            r9.m21634b(r6, r4)     // Catch:{ JSONException -> 0x007b }
            goto L_0x0012
        L_0x007b:
            r4 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r5 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.Throwable r6 = r4.getCause()
            com.google.firebase.remoteconfig.FirebaseRemoteConfigException$a r7 = com.google.firebase.remoteconfig.FirebaseRemoteConfigException.C5433a.CONFIG_UPDATE_MESSAGE_INVALID
            java.lang.String r8 = "Unable to parse config update message."
            r5.<init>(r8, r6, r7)
            r9.m21641k(r5)
            java.lang.String r5 = "FirebaseRemoteConfig"
            java.lang.String r6 = "Unable to parse latest config update message."
            android.util.Log.e(r5, r6, r4)
            goto L_0x0012
        L_0x0095:
            r2.close()
            r10.close()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.C5439b.m21637f(java.io.InputStream):void");
    }

    /* renamed from: g */
    private synchronized boolean m21638g() {
        return this.f17366a.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Task m21639h(Task task, Task task2, long j, int i, Task task3) {
        if (!task.mo24873r()) {
            return C9231i.m34112f(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", (Throwable) task.mo24868m()));
        }
        if (!task2.mo24873r()) {
            return C9231i.m34112f(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", (Throwable) task2.mo24868m()));
        }
        C5455m.C5456a aVar = (C5455m.C5456a) task.mo24869n();
        C5447g gVar = (C5447g) task2.mo24869n();
        if (!m21636e(aVar, j).booleanValue()) {
            Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
            m21634b(i, j);
            return C9231i.m34113g((Object) null);
        } else if (aVar.mo18107d() == null) {
            Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
            return C9231i.m34113g((Object) null);
        } else {
            if (gVar == null) {
                gVar = C5447g.m21664j().mo18097a();
            }
            Set e = gVar.mo18089e(aVar.mo18107d());
            if (e.isEmpty()) {
                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                return C9231i.m34113g((Object) null);
            }
            m21635c(C8277b.m31124a(e));
            return C9231i.m34113g((Object) null);
        }
    }

    /* renamed from: j */
    private String m21640j(String str) {
        int indexOf = str.indexOf(123);
        int lastIndexOf = str.lastIndexOf(125);
        if (indexOf < 0 || lastIndexOf < 0 || indexOf >= lastIndexOf) {
            return "";
        }
        return str.substring(indexOf, lastIndexOf + 1);
    }

    /* renamed from: k */
    private synchronized void m21641k(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        for (C8278c b : this.f17366a) {
            b.mo18146b(firebaseRemoteConfigException);
        }
    }

    /* renamed from: d */
    public synchronized Task mo18075d(int i, long j) {
        int i2;
        Task n;
        Task e;
        i2 = i - 1;
        n = this.f17368c.mo18105n(C5455m.C5457b.REALTIME, 3 - i2);
        e = this.f17369d.mo18081e();
        return C9231i.m34117k(n, e).mo24867l(this.f17371f, new C5438a(this, n, e, j, i2));
    }

    /* renamed from: i */
    public void mo18076i() {
        HttpURLConnection httpURLConnection = this.f17367b;
        if (httpURLConnection != null) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                m21637f(inputStream);
                inputStream.close();
            } catch (IOException e) {
                Log.d("FirebaseRemoteConfig", "Stream was cancelled due to an exception. Retrying the connection...", e);
            } catch (Throwable th) {
                this.f17367b.disconnect();
                throw th;
            }
            this.f17367b.disconnect();
        }
    }
}
