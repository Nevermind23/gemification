package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.StrictMode;
import android.support.p013v4.media.session.C0125b;
import androidx.collection.ArrayMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.u6 */
public abstract class C4433u6 implements C4110b6 {

    /* renamed from: a */
    private static final Map f13729a = new ArrayMap();

    /* renamed from: b */
    static C4433u6 m16956b(Context context, String str, Runnable runnable) {
        if (!C4415t5.m16737b()) {
            synchronized (C4433u6.class) {
                C0125b.m366a(f13729a.get((Object) null));
                StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    throw null;
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
            }
        } else {
            throw null;
        }
    }

    /* renamed from: c */
    static synchronized void m16957c() {
        synchronized (C4433u6.class) {
            Map map = f13729a;
            Iterator it = map.values().iterator();
            if (!it.hasNext()) {
                map.clear();
            } else {
                C0125b.m366a(it.next());
                throw null;
            }
        }
    }
}
