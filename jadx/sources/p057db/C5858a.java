package p057db;

import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p196o7.C7465c;

/* renamed from: db.a */
abstract class C5858a {

    /* renamed from: a */
    protected final C7465c f18377a;

    /* renamed from: b */
    private final Map f18378b = new HashMap();

    /* renamed from: c */
    protected final Map f18379c = new HashMap();

    /* renamed from: db.a$a */
    class C5859a implements Runnable {
        C5859a() {
        }

        public void run() {
            C5858a.this.mo19073k();
        }
    }

    /* renamed from: db.a$b */
    public class C5860b {

        /* renamed from: a */
        private final Set f18381a = new LinkedHashSet();

        public C5860b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo19075a(Object obj) {
            this.f18381a.add(obj);
            C5858a.this.f18379c.put(obj, this);
        }

        /* renamed from: b */
        public void mo19076b() {
            for (Object next : this.f18381a) {
                C5858a.this.mo19072j(next);
                C5858a.this.f18379c.remove(next);
            }
            this.f18381a.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public boolean mo19077c(Object obj) {
            if (!this.f18381a.remove(obj)) {
                return false;
            }
            C5858a.this.f18379c.remove(obj);
            C5858a.this.mo19072j(obj);
            return true;
        }
    }

    public C5858a(C7465c cVar) {
        this.f18377a = cVar;
        new Handler(Looper.getMainLooper()).post(new C5859a());
    }

    /* renamed from: i */
    public boolean mo19071i(Object obj) {
        C5860b bVar = (C5860b) this.f18379c.get(obj);
        if (bVar == null || !bVar.mo19077c(obj)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public abstract void mo19072j(Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public abstract void mo19073k();
}
