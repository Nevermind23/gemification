package p218q3;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import p140k3.C6777b;
import p166m3.C7083e;
import p218q3.C7864a;

/* renamed from: q3.e */
public class C7873e implements C7864a {

    /* renamed from: a */
    private final C7883j f22814a;

    /* renamed from: b */
    private final File f22815b;

    /* renamed from: c */
    private final long f22816c;

    /* renamed from: d */
    private final C7868c f22817d = new C7868c();

    /* renamed from: e */
    private C6777b f22818e;

    protected C7873e(File file, long j) {
        this.f22815b = file;
        this.f22816c = j;
        this.f22814a = new C7883j();
    }

    /* renamed from: c */
    public static C7864a m29816c(File file, long j) {
        return new C7873e(file, j);
    }

    /* renamed from: d */
    private synchronized C6777b m29817d() {
        if (this.f22818e == null) {
            this.f22818e = C6777b.m26439y(this.f22815b, 1, 1, this.f22816c);
        }
        return this.f22818e;
    }

    /* renamed from: a */
    public File mo22833a(C7083e eVar) {
        String b = this.f22814a.mo22854b(eVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + b + " for for Key: " + eVar);
        }
        try {
            C6777b.C6782e w = m29817d().mo20829w(b);
            if (w != null) {
                return w.mo20840a(0);
            }
            return null;
        } catch (IOException e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: b */
    public void mo22834b(C7083e eVar, C7864a.C7866b bVar) {
        C6777b.C6780c t;
        String b = this.f22814a.mo22854b(eVar);
        this.f22817d.mo22836a(b);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + b + " for for Key: " + eVar);
            }
            try {
                C6777b d = m29817d();
                if (d.mo20829w(b) == null) {
                    t = d.mo20828t(b);
                    if (t != null) {
                        if (bVar.mo7849a(t.mo20836f(0))) {
                            t.mo20835e();
                        }
                        t.mo20834b();
                        this.f22817d.mo22837b(b);
                        return;
                    }
                    throw new IllegalStateException("Had two simultaneous puts for: " + b);
                }
            } catch (IOException e) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th) {
                t.mo20834b();
                throw th;
            }
        } finally {
            this.f22817d.mo22837b(b);
        }
    }
}
