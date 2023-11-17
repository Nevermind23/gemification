package p198o9;

import android.content.Intent;
import android.net.Uri;
import com.google.firebase.C5270e;
import p337z7.Task;

/* renamed from: o9.a */
public abstract class C7493a {
    /* renamed from: c */
    public static synchronized C7493a m28459c() {
        C7493a d;
        synchronized (C7493a.class) {
            d = m28460d(C5270e.m20805l());
        }
        return d;
    }

    /* renamed from: d */
    public static synchronized C7493a m28460d(C5270e eVar) {
        C7493a aVar;
        synchronized (C7493a.class) {
            aVar = (C7493a) eVar.mo17480i(C7493a.class);
        }
        return aVar;
    }

    /* renamed from: a */
    public abstract Task mo21927a(Intent intent);

    /* renamed from: b */
    public abstract Task mo21928b(Uri uri);
}
