package p268u1;

import java.util.List;
import p061e2.C6013a;
import p061e2.C6014b;
import p061e2.C6015c;
import p294w1.C8734b;

/* renamed from: u1.o */
public class C8546o extends C8538g {

    /* renamed from: u1.o$a */
    class C8547a extends C6015c {

        /* renamed from: d */
        final /* synthetic */ C6014b f24271d;

        /* renamed from: e */
        final /* synthetic */ C6015c f24272e;

        /* renamed from: f */
        final /* synthetic */ C8734b f24273f;

        C8547a(C6014b bVar, C6015c cVar, C8734b bVar2) {
            this.f24271d = bVar;
            this.f24272e = cVar;
            this.f24273f = bVar2;
        }

        /* renamed from: d */
        public C8734b mo19503a(C6014b bVar) {
            Object obj;
            this.f24271d.mo19502h(bVar.mo19500f(), bVar.mo19495a(), ((C8734b) bVar.mo19501g()).f24565a, ((C8734b) bVar.mo19496b()).f24565a, bVar.mo19498d(), bVar.mo19497c(), bVar.mo19499e());
            String str = (String) this.f24272e.mo19503a(this.f24271d);
            if (bVar.mo19497c() == 1.0f) {
                obj = bVar.mo19496b();
            } else {
                obj = bVar.mo19501g();
            }
            C8734b bVar2 = (C8734b) obj;
            this.f24273f.mo24125a(str, bVar2.f24566b, bVar2.f24567c, bVar2.f24568d, bVar2.f24569e, bVar2.f24570f, bVar2.f24571g, bVar2.f24572h, bVar2.f24573i, bVar2.f24574j, bVar2.f24575k, bVar2.f24576l, bVar2.f24577m);
            return this.f24273f;
        }
    }

    public C8546o(List list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public C8734b mo23857i(C6013a aVar, float f) {
        Object obj;
        float f2;
        C8734b bVar;
        C6015c cVar = this.f24231e;
        if (cVar != null) {
            float f3 = aVar.f18764g;
            Float f4 = aVar.f18765h;
            if (f4 == null) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = f4.floatValue();
            }
            Object obj2 = aVar.f18759b;
            C8734b bVar2 = (C8734b) obj2;
            Object obj3 = aVar.f18760c;
            if (obj3 == null) {
                bVar = (C8734b) obj2;
            } else {
                bVar = (C8734b) obj3;
            }
            return (C8734b) cVar.mo19504b(f3, f2, bVar2, bVar, f, mo23853d(), mo23855f());
        } else if (f != 1.0f || (obj = aVar.f18760c) == null) {
            return (C8734b) aVar.f18759b;
        } else {
            return (C8734b) obj;
        }
    }

    /* renamed from: q */
    public void mo23902q(C6015c cVar) {
        super.mo23862n(new C8547a(new C6014b(), cVar, new C8734b()));
    }
}
