package androidx.lifecycle;

import androidx.lifecycle.C1593j;
import androidx.lifecycle.LiveData.c;
import java.util.Iterator;
import java.util.Map;
import p097h.C6408c;
import p110i.C6495b;

public abstract class LiveData {

    /* renamed from: k */
    static final Object f4512k = new Object();

    /* renamed from: a */
    final Object f4513a;

    /* renamed from: b */
    private C6495b f4514b;

    /* renamed from: c */
    int f4515c;

    /* renamed from: d */
    private boolean f4516d;

    /* renamed from: e */
    private volatile Object f4517e;

    /* renamed from: f */
    volatile Object f4518f;

    /* renamed from: g */
    private int f4519g;

    /* renamed from: h */
    private boolean f4520h;

    /* renamed from: i */
    private boolean f4521i;

    /* renamed from: j */
    private final Runnable f4522j;

    class LifecycleBoundObserver extends c implements C1606m {

        /* renamed from: h */
        final C1619q f4523h;

        LifecycleBoundObserver(C1619q qVar, C1645y yVar) {
            super(yVar);
            this.f4523h = qVar;
        }

        /* JADX WARNING: type inference failed for: r1v0, types: [androidx.lifecycle.LiveData$LifecycleBoundObserver, androidx.lifecycle.LiveData$c] */
        /* renamed from: b */
        public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
            C1593j.C1598b b = this.f4523h.getLifecycle().mo4907b();
            if (b == C1593j.C1598b.DESTROYED) {
                LiveData.this.mo4824p(this.f4527d);
                return;
            }
            C1593j.C1598b bVar = null;
            while (bVar != b) {
                mo4832c(mo4829h());
                bVar = b;
                b = this.f4523h.getLifecycle().mo4907b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4827f() {
            this.f4523h.getLifecycle().mo4909d(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo4828g(C1619q qVar) {
            return this.f4523h == qVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4829h() {
            return this.f4523h.getLifecycle().mo4907b().mo4914b(C1593j.C1598b.STARTED);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    class C1551a implements Runnable {
        C1551a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.f4513a) {
                obj = LiveData.this.f4518f;
                LiveData.this.f4518f = LiveData.f4512k;
            }
            LiveData.this.mo4826r(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    private class C1552b extends C1553c {
        C1552b(C1645y yVar) {
            super(yVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public boolean mo4831h() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    private abstract class C1553c {

        /* renamed from: d */
        final C1645y f4527d;

        /* renamed from: e */
        boolean f4528e;

        /* renamed from: f */
        int f4529f = -1;

        C1553c(C1645y yVar) {
            this.f4527d = yVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo4832c(boolean z) {
            int i;
            if (z != this.f4528e) {
                this.f4528e = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.mo4812c(i);
                if (this.f4528e) {
                    LiveData.this.mo4813e(this);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo4833f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public boolean mo4834g(C1619q qVar) {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public abstract boolean mo4831h();
    }

    public LiveData(Object obj) {
        this.f4513a = new Object();
        this.f4514b = new C6495b();
        this.f4515c = 0;
        this.f4518f = f4512k;
        this.f4522j = new C1551a();
        this.f4517e = obj;
        this.f4519g = 0;
    }

    /* renamed from: b */
    static void m5507b(String str) {
        if (!C6408c.m25463g().mo20293b()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    /* renamed from: d */
    private void m5508d(C1553c cVar) {
        if (cVar.f4528e) {
            if (!cVar.mo4831h()) {
                cVar.mo4832c(false);
                return;
            }
            int i = cVar.f4529f;
            int i2 = this.f4519g;
            if (i < i2) {
                cVar.f4529f = i2;
                cVar.f4527d.onChanged(this.f4517e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo4812c(int i) {
        boolean z;
        boolean z2;
        int i2 = this.f4515c;
        this.f4515c = i + i2;
        if (!this.f4516d) {
            this.f4516d = true;
            while (true) {
                try {
                    int i3 = this.f4515c;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            mo4821m();
                        } else if (z2) {
                            mo4822n();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.f4516d = false;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo4813e(C1553c cVar) {
        if (this.f4520h) {
            this.f4521i = true;
            return;
        }
        this.f4520h = true;
        do {
            this.f4521i = false;
            if (cVar == null) {
                C6495b.C6499d i = this.f4514b.mo20421i();
                while (i.hasNext()) {
                    m5508d((C1553c) ((Map.Entry) i.next()).getValue());
                    if (this.f4521i) {
                        break;
                    }
                }
            } else {
                m5508d(cVar);
                cVar = null;
            }
        } while (this.f4521i);
        this.f4520h = false;
    }

    /* renamed from: f */
    public Object mo4814f() {
        Object obj = this.f4517e;
        if (obj != f4512k) {
            return obj;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo4815g() {
        return this.f4519g;
    }

    /* renamed from: h */
    public boolean mo4816h() {
        return this.f4515c > 0;
    }

    /* renamed from: i */
    public boolean mo4817i() {
        return this.f4514b.size() > 0;
    }

    /* renamed from: j */
    public boolean mo4818j() {
        return this.f4517e != f4512k;
    }

    /* renamed from: k */
    public void mo4819k(C1619q qVar, C1645y yVar) {
        m5507b("observe");
        if (qVar.getLifecycle().mo4907b() != C1593j.C1598b.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(qVar, yVar);
            C1553c cVar = (C1553c) this.f4514b.mo20414l(yVar, lifecycleBoundObserver);
            if (cVar != null && !cVar.mo4834g(qVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (cVar == null) {
                qVar.getLifecycle().mo4906a(lifecycleBoundObserver);
            }
        }
    }

    /* renamed from: l */
    public void mo4820l(C1645y yVar) {
        m5507b("observeForever");
        C1552b bVar = new C1552b(yVar);
        C1553c cVar = (C1553c) this.f4514b.mo20414l(yVar, bVar);
        if (cVar instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (cVar == null) {
            bVar.mo4832c(true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4821m() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4822n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo4823o(Object obj) {
        boolean z;
        synchronized (this.f4513a) {
            if (this.f4518f == f4512k) {
                z = true;
            } else {
                z = false;
            }
            this.f4518f = obj;
        }
        if (z) {
            C6408c.m25463g().mo20294c(this.f4522j);
        }
    }

    /* renamed from: p */
    public void mo4824p(C1645y yVar) {
        m5507b("removeObserver");
        C1553c cVar = (C1553c) this.f4514b.mo20415n(yVar);
        if (cVar != null) {
            cVar.mo4833f();
            cVar.mo4832c(false);
        }
    }

    /* renamed from: q */
    public void mo4825q(C1619q qVar) {
        m5507b("removeObservers");
        Iterator it = this.f4514b.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (((C1553c) entry.getValue()).mo4834g(qVar)) {
                mo4824p((C1645y) entry.getKey());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo4826r(Object obj) {
        m5507b("setValue");
        this.f4519g++;
        this.f4517e = obj;
        mo4813e((C1553c) null);
    }

    public LiveData() {
        this.f4513a = new Object();
        this.f4514b = new C6495b();
        this.f4515c = 0;
        Object obj = f4512k;
        this.f4518f = obj;
        this.f4522j = new C1551a();
        this.f4517e = obj;
        this.f4519g = -1;
    }
}
