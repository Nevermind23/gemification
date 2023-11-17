package androidx.recyclerview.widget;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.C1773c;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: androidx.recyclerview.widget.d */
public class C1775d {

    /* renamed from: h */
    private static final Executor f5303h = new C1780c();

    /* renamed from: a */
    private final C1821p f5304a;

    /* renamed from: b */
    final C1773c f5305b;

    /* renamed from: c */
    Executor f5306c;

    /* renamed from: d */
    private final List f5307d;

    /* renamed from: e */
    private List f5308e;

    /* renamed from: f */
    private List f5309f;

    /* renamed from: g */
    int f5310g;

    /* renamed from: androidx.recyclerview.widget.d$a */
    class C1776a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ List f5311d;

        /* renamed from: e */
        final /* synthetic */ List f5312e;

        /* renamed from: f */
        final /* synthetic */ int f5313f;

        /* renamed from: g */
        final /* synthetic */ Runnable f5314g;

        /* renamed from: androidx.recyclerview.widget.d$a$a */
        class C1777a extends C1796h.C1798b {
            C1777a() {
            }

            /* renamed from: a */
            public boolean mo5907a(int i, int i2) {
                Object obj = C1776a.this.f5311d.get(i);
                Object obj2 = C1776a.this.f5312e.get(i2);
                if (obj != null && obj2 != null) {
                    return C1775d.this.f5305b.mo5898b().mo5976a(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                throw new AssertionError();
            }

            /* renamed from: b */
            public boolean mo5908b(int i, int i2) {
                Object obj = C1776a.this.f5311d.get(i);
                Object obj2 = C1776a.this.f5312e.get(i2);
                if (obj != null && obj2 != null) {
                    return C1775d.this.f5305b.mo5898b().mo5977b(obj, obj2);
                }
                if (obj == null && obj2 == null) {
                    return true;
                }
                return false;
            }

            /* renamed from: c */
            public Object mo5909c(int i, int i2) {
                Object obj = C1776a.this.f5311d.get(i);
                Object obj2 = C1776a.this.f5312e.get(i2);
                if (obj != null && obj2 != null) {
                    return C1775d.this.f5305b.mo5898b().mo5978c(obj, obj2);
                }
                throw new AssertionError();
            }

            /* renamed from: d */
            public int mo5910d() {
                return C1776a.this.f5312e.size();
            }

            /* renamed from: e */
            public int mo5911e() {
                return C1776a.this.f5311d.size();
            }
        }

        /* renamed from: androidx.recyclerview.widget.d$a$b */
        class C1778b implements Runnable {

            /* renamed from: d */
            final /* synthetic */ C1796h.C1801e f5317d;

            C1778b(C1796h.C1801e eVar) {
                this.f5317d = eVar;
            }

            public void run() {
                C1776a aVar = C1776a.this;
                C1775d dVar = C1775d.this;
                if (dVar.f5310g == aVar.f5313f) {
                    dVar.mo5903c(aVar.f5312e, this.f5317d, aVar.f5314g);
                }
            }
        }

        C1776a(List list, List list2, int i, Runnable runnable) {
            this.f5311d = list;
            this.f5312e = list2;
            this.f5313f = i;
            this.f5314g = runnable;
        }

        public void run() {
            C1775d.this.f5306c.execute(new C1778b(C1796h.m6928b(new C1777a())));
        }
    }

    /* renamed from: androidx.recyclerview.widget.d$b */
    public interface C1779b {
        /* renamed from: a */
        void mo5913a(List list, List list2);
    }

    /* renamed from: androidx.recyclerview.widget.d$c */
    private static class C1780c implements Executor {

        /* renamed from: d */
        final Handler f5319d = new Handler(Looper.getMainLooper());

        C1780c() {
        }

        public void execute(Runnable runnable) {
            this.f5319d.post(runnable);
        }
    }

    public C1775d(RecyclerView.C1736h hVar, C1796h.C1802f fVar) {
        this((C1821p) new C1772b(hVar), new C1773c.C1774a(fVar).mo5900a());
    }

    /* renamed from: d */
    private void m6852d(List list, Runnable runnable) {
        for (C1779b a : this.f5307d) {
            a.mo5913a(list, this.f5309f);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public void mo5901a(C1779b bVar) {
        this.f5307d.add(bVar);
    }

    /* renamed from: b */
    public List mo5902b() {
        return this.f5309f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo5903c(List list, C1796h.C1801e eVar, Runnable runnable) {
        List list2 = this.f5309f;
        this.f5308e = list;
        this.f5309f = Collections.unmodifiableList(list);
        eVar.mo5974b(this.f5304a);
        m6852d(list2, runnable);
    }

    /* renamed from: e */
    public void mo5904e(List list) {
        mo5905f(list, (Runnable) null);
    }

    /* renamed from: f */
    public void mo5905f(List list, Runnable runnable) {
        int i = this.f5310g + 1;
        this.f5310g = i;
        List list2 = this.f5308e;
        if (list != list2) {
            List list3 = this.f5309f;
            if (list == null) {
                int size = list2.size();
                this.f5308e = null;
                this.f5309f = Collections.emptyList();
                this.f5304a.mo5894b(0, size);
                m6852d(list3, runnable);
            } else if (list2 == null) {
                this.f5308e = list;
                this.f5309f = Collections.unmodifiableList(list);
                this.f5304a.mo5893a(0, list.size());
                m6852d(list3, runnable);
            } else {
                this.f5305b.mo5897a().execute(new C1776a(list2, list, i, runnable));
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public C1775d(C1821p pVar, C1773c cVar) {
        this.f5307d = new CopyOnWriteArrayList();
        this.f5309f = Collections.emptyList();
        this.f5304a = pVar;
        this.f5305b = cVar;
        if (cVar.mo5899c() != null) {
            this.f5306c = cVar.mo5899c();
        } else {
            this.f5306c = f5303h;
        }
    }
}
