package com.google.firebase.remoteconfig.internal;

import com.google.firebase.installations.C5288f;
import java.net.HttpURLConnection;
import p337z7.C9225f;
import p337z7.Task;

/* renamed from: com.google.firebase.remoteconfig.internal.r */
public final /* synthetic */ class C5464r implements C9225f {

    /* renamed from: a */
    public final /* synthetic */ HttpURLConnection f17462a;

    public /* synthetic */ C5464r(HttpURLConnection httpURLConnection) {
        this.f17462a = httpURLConnection;
    }

    /* renamed from: a */
    public final Task mo17657a(Object obj) {
        return this.f17462a.setRequestProperty("X-Goog-Firebase-Installations-Auth", ((C5288f) obj).mo17493b());
    }
}
