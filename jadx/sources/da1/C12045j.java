package da1;

import ba1.C10146d0;
import fh1.C40951a;
import gh1.C41125a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import ue1.C43064a;

/* renamed from: da1.j */
public final class C12045j extends C12030b {

    /* renamed from: da1.j$a */
    public static final class C12046a implements C41125a {

        /* renamed from: a */
        private final Object f35442a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32175b() {
            return this.f35442a;
        }
    }

    /* renamed from: da1.j$b */
    public static final class C12047b implements C41125a {

        /* renamed from: a */
        private final Object f35443a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32176b() {
            return this.f35443a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12045j(C12038f fVar) {
        super(fVar);
        C41536l.m120489i(fVar, "context");
    }

    /* renamed from: a */
    public void mo32123a() {
    }

    /* renamed from: f */
    public final void mo32174f(boolean z) {
        boolean z2;
        String a = ((C10146d0.C10172e) new C12046a().mo32175b()).mo26726q().mo92939a();
        if (C41536l.m120484d(a, "MOBILE")) {
            z2 = true;
        } else {
            z2 = C41536l.m120484d(a, "JUNIOR");
        }
        if (z2) {
            mo32125c().mo32160s().mo4823o(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException("Registration is not implemented yet for channel: " + ((C10146d0.C10172e) new C12047b().mo32176b()).mo26726q().mo92939a());
    }
}
