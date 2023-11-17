package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;
import p110i.C6495b;

/* renamed from: androidx.lifecycle.v */
public class C1639v extends C1644x {

    /* renamed from: l */
    private C6495b f4664l = new C6495b();

    /* renamed from: androidx.lifecycle.v$a */
    private static class C1640a implements C1645y {

        /* renamed from: a */
        final LiveData f4665a;

        /* renamed from: b */
        final C1645y f4666b;

        /* renamed from: c */
        int f4667c = -1;

        C1640a(LiveData liveData, C1645y yVar) {
            this.f4665a = liveData;
            this.f4666b = yVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo4958a() {
            this.f4665a.mo4820l(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo4959b() {
            this.f4665a.mo4824p(this);
        }

        public void onChanged(Object obj) {
            if (this.f4667c != this.f4665a.mo4815g()) {
                this.f4667c = this.f4665a.mo4815g();
                this.f4666b.onChanged(obj);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo4821m() {
        Iterator it = this.f4664l.iterator();
        while (it.hasNext()) {
            ((C1640a) ((Map.Entry) it.next()).getValue()).mo4958a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo4822n() {
        Iterator it = this.f4664l.iterator();
        while (it.hasNext()) {
            ((C1640a) ((Map.Entry) it.next()).getValue()).mo4959b();
        }
    }

    /* renamed from: s */
    public void mo4956s(LiveData liveData, C1645y yVar) {
        if (liveData != null) {
            C1640a aVar = new C1640a(liveData, yVar);
            C1640a aVar2 = (C1640a) this.f4664l.mo20414l(liveData, aVar);
            if (aVar2 != null && aVar2.f4666b != yVar) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (aVar2 == null && mo4816h()) {
                aVar.mo4958a();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    /* renamed from: t */
    public void mo4957t(LiveData liveData) {
        C1640a aVar = (C1640a) this.f4664l.mo20415n(liveData);
        if (aVar != null) {
            aVar.mo4959b();
        }
    }
}
