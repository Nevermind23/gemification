package p244s3;

import androidx.core.util.C1005e;
import com.bumptech.glide.Registry;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: s3.p */
public class C8191p {

    /* renamed from: a */
    private final C8196r f23352a;

    /* renamed from: b */
    private final C8192a f23353b;

    /* renamed from: s3.p$a */
    private static class C8192a {

        /* renamed from: a */
        private final Map f23354a = new HashMap();

        /* renamed from: s3.p$a$a */
        private static class C8193a {

            /* renamed from: a */
            final List f23355a;

            public C8193a(List list) {
                this.f23355a = list;
            }
        }

        C8192a() {
        }

        /* renamed from: a */
        public void mo23390a() {
            this.f23354a.clear();
        }

        /* renamed from: b */
        public List mo23391b(Class cls) {
            C8193a aVar = (C8193a) this.f23354a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f23355a;
        }

        /* renamed from: c */
        public void mo23392c(Class cls, List list) {
            if (((C8193a) this.f23354a.put(cls, new C8193a(list))) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public C8191p(C1005e eVar) {
        this(new C8196r(eVar));
    }

    /* renamed from: b */
    private static Class m30897b(Object obj) {
        return obj.getClass();
    }

    /* renamed from: e */
    private synchronized List m30898e(Class cls) {
        List b;
        b = this.f23353b.mo23391b(cls);
        if (b == null) {
            b = Collections.unmodifiableList(this.f23352a.mo23395c(cls));
            this.f23353b.mo23392c(cls, b);
        }
        return b;
    }

    /* renamed from: a */
    public synchronized void mo23387a(Class cls, Class cls2, C8190o oVar) {
        this.f23352a.mo23394b(cls, cls2, oVar);
        this.f23353b.mo23390a();
    }

    /* renamed from: c */
    public synchronized List mo23388c(Class cls) {
        return this.f23352a.mo23397g(cls);
    }

    /* renamed from: d */
    public List mo23389d(Object obj) {
        List e = m30898e(m30897b(obj));
        if (!e.isEmpty()) {
            int size = e.size();
            List emptyList = Collections.emptyList();
            boolean z = true;
            for (int i = 0; i < size; i++) {
                C8188n nVar = (C8188n) e.get(i);
                if (nVar.mo23327b(obj)) {
                    if (z) {
                        emptyList = new ArrayList(size - i);
                        z = false;
                    }
                    emptyList.add(nVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new Registry.NoModelLoaderAvailableException(obj, e);
        }
        throw new Registry.NoModelLoaderAvailableException(obj);
    }

    private C8191p(C8196r rVar) {
        this.f23353b = new C8192a();
        this.f23352a = rVar;
    }
}
