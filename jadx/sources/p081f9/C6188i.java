package p081f9;

import androidx.lifecycle.C1612n;
import com.salesforce.marketingcloud.C11398b;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p068e9.C6063h;
import p068e9.C6066i;
import p133j9.C6762f;

/* renamed from: f9.i */
public class C6188i {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6176d f19181a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C6066i f19182b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final String f19183c;

    /* renamed from: d */
    private final C6189a f19184d = new C6189a(false);

    /* renamed from: e */
    private final C6189a f19185e = new C6189a(true);

    /* renamed from: f */
    private final AtomicMarkableReference f19186f = new AtomicMarkableReference((Object) null, false);

    /* renamed from: f9.i$a */
    private class C6189a {

        /* renamed from: a */
        final AtomicMarkableReference f19187a;

        /* renamed from: b */
        private final AtomicReference f19188b = new AtomicReference((Object) null);

        /* renamed from: c */
        private final boolean f19189c;

        public C6189a(boolean z) {
            int i;
            this.f19189c = z;
            if (z) {
                i = 8192;
            } else {
                i = C11398b.f33141t;
            }
            this.f19187a = new AtomicMarkableReference(new C6172b(64, i), false);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ Void m24677c() {
            this.f19188b.set((Object) null);
            m24679e();
            return null;
        }

        /* renamed from: d */
        private void m24678d() {
            C6187h hVar = new C6187h(this);
            if (C1612n.m5659a(this.f19188b, (Object) null, hVar)) {
                C6188i.this.f19182b.mo19558h(hVar);
            }
        }

        /* renamed from: e */
        private void m24679e() {
            Map map;
            synchronized (this) {
                if (this.f19187a.isMarked()) {
                    map = ((C6172b) this.f19187a.getReference()).mo19741a();
                    AtomicMarkableReference atomicMarkableReference = this.f19187a;
                    atomicMarkableReference.set((C6172b) atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                C6188i.this.f19181a.mo19755l(C6188i.this.f19183c, map, this.f19189c);
            }
        }

        /* renamed from: b */
        public Map mo19778b() {
            return ((C6172b) this.f19187a.getReference()).mo19741a();
        }

        /* renamed from: f */
        public boolean mo19779f(String str, String str2) {
            synchronized (this) {
                if (!((C6172b) this.f19187a.getReference()).mo19742d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = this.f19187a;
                atomicMarkableReference.set((C6172b) atomicMarkableReference.getReference(), true);
                m24678d();
                return true;
            }
        }
    }

    public C6188i(String str, C6762f fVar, C6066i iVar) {
        this.f19183c = str;
        this.f19181a = new C6176d(fVar);
        this.f19182b = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public /* synthetic */ Object m24666h() {
        m24669k();
        return null;
    }

    /* renamed from: i */
    public static C6188i m24667i(String str, C6762f fVar, C6066i iVar) {
        C6176d dVar = new C6176d(fVar);
        C6188i iVar2 = new C6188i(str, fVar, iVar);
        ((C6172b) iVar2.f19184d.f19187a.getReference()).mo19743e(dVar.mo19753g(str, false));
        ((C6172b) iVar2.f19185e.f19187a.getReference()).mo19743e(dVar.mo19753g(str, true));
        iVar2.f19186f.set(dVar.mo19754h(str), false);
        return iVar2;
    }

    /* renamed from: j */
    public static String m24668j(String str, C6762f fVar) {
        return new C6176d(fVar).mo19754h(str);
    }

    /* renamed from: k */
    private void m24669k() {
        boolean z;
        String str;
        synchronized (this.f19186f) {
            z = false;
            if (this.f19186f.isMarked()) {
                str = mo19774g();
                this.f19186f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.f19181a.mo19756m(this.f19183c, str);
        }
    }

    /* renamed from: e */
    public Map mo19772e() {
        return this.f19184d.mo19778b();
    }

    /* renamed from: f */
    public Map mo19773f() {
        return this.f19185e.mo19778b();
    }

    /* renamed from: g */
    public String mo19774g() {
        return (String) this.f19186f.getReference();
    }

    /* renamed from: l */
    public boolean mo19775l(String str, String str2) {
        return this.f19184d.mo19779f(str, str2);
    }

    /* renamed from: m */
    public boolean mo19776m(String str, String str2) {
        return this.f19185e.mo19779f(str, str2);
    }

    /* renamed from: n */
    public void mo19777n(String str) {
        String c = C6172b.m24596c(str, C11398b.f33141t);
        synchronized (this.f19186f) {
            if (!C6063h.m24207B(c, (String) this.f19186f.getReference())) {
                this.f19186f.set(c, true);
                this.f19182b.mo19558h(new C6186g(this));
            }
        }
    }
}
