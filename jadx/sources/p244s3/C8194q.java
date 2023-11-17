package p244s3;

import androidx.core.util.C1005e;
import com.bumptech.glide.C2390g;
import com.bumptech.glide.load.data.C2415d;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p089g4.C6223k;
import p166m3.C7079a;
import p166m3.C7083e;
import p166m3.C7088h;
import p244s3.C8188n;

/* renamed from: s3.q */
class C8194q implements C8188n {

    /* renamed from: a */
    private final List f23356a;

    /* renamed from: b */
    private final C1005e f23357b;

    /* renamed from: s3.q$a */
    static class C8195a implements C2415d, C2415d.C2416a {

        /* renamed from: d */
        private final List f23358d;

        /* renamed from: e */
        private final C1005e f23359e;

        /* renamed from: f */
        private int f23360f = 0;

        /* renamed from: g */
        private C2390g f23361g;

        /* renamed from: h */
        private C2415d.C2416a f23362h;

        /* renamed from: i */
        private List f23363i;

        /* renamed from: j */
        private boolean f23364j;

        C8195a(List list, C1005e eVar) {
            this.f23359e = eVar;
            C6223k.m24729c(list);
            this.f23358d = list;
        }

        /* renamed from: g */
        private void m30907g() {
            if (!this.f23364j) {
                if (this.f23360f < this.f23358d.size() - 1) {
                    this.f23360f++;
                    mo7790e(this.f23361g, this.f23362h);
                    return;
                }
                C6223k.m24730d(this.f23363i);
                this.f23362h.mo7797c(new GlideException("Fetch failed", (List) new ArrayList(this.f23363i)));
            }
        }

        /* renamed from: a */
        public Class mo7781a() {
            return ((C2415d) this.f23358d.get(0)).mo7781a();
        }

        /* renamed from: b */
        public void mo7786b() {
            List list = this.f23363i;
            if (list != null) {
                this.f23359e.mo3439a(list);
            }
            this.f23363i = null;
            for (C2415d b : this.f23358d) {
                b.mo7786b();
            }
        }

        /* renamed from: c */
        public void mo7797c(Exception exc) {
            ((List) C6223k.m24730d(this.f23363i)).add(exc);
            m30907g();
        }

        public void cancel() {
            this.f23364j = true;
            for (C2415d cancel : this.f23358d) {
                cancel.cancel();
            }
        }

        /* renamed from: d */
        public C7079a mo7789d() {
            return ((C2415d) this.f23358d.get(0)).mo7789d();
        }

        /* renamed from: e */
        public void mo7790e(C2390g gVar, C2415d.C2416a aVar) {
            this.f23361g = gVar;
            this.f23362h = aVar;
            this.f23363i = (List) this.f23359e.mo3440b();
            ((C2415d) this.f23358d.get(this.f23360f)).mo7790e(gVar, this);
            if (this.f23364j) {
                cancel();
            }
        }

        /* renamed from: f */
        public void mo7798f(Object obj) {
            if (obj != null) {
                this.f23362h.mo7798f(obj);
            } else {
                m30907g();
            }
        }
    }

    C8194q(List list, C1005e eVar) {
        this.f23356a = list;
        this.f23357b = eVar;
    }

    /* renamed from: a */
    public C8188n.C8189a mo23326a(Object obj, int i, int i2, C7088h hVar) {
        C8188n.C8189a a;
        int size = this.f23356a.size();
        ArrayList arrayList = new ArrayList(size);
        C7083e eVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            C8188n nVar = (C8188n) this.f23356a.get(i3);
            if (nVar.mo23327b(obj) && (a = nVar.mo23326a(obj, i, i2, hVar)) != null) {
                eVar = a.f23349a;
                arrayList.add(a.f23351c);
            }
        }
        if (arrayList.isEmpty() || eVar == null) {
            return null;
        }
        return new C8188n.C8189a(eVar, new C8195a(arrayList, this.f23357b));
    }

    /* renamed from: b */
    public boolean mo23327b(Object obj) {
        for (C8188n b : this.f23356a) {
            if (b.mo23327b(obj)) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f23356a.toArray()) + '}';
    }
}
