package da1;

import ba1.C10146d0;
import fh1.C40951a;
import gh1.C41125a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import p341ge.bog.sso_client.models.RelatedCompany;
import ue1.C43064a;

/* renamed from: da1.c */
public final class C12031c extends C12030b {

    /* renamed from: da1.c$a */
    public static final class C12032a implements C41125a {

        /* renamed from: a */
        private final Object f35403a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32128b() {
            return this.f35403a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12031c(C12038f fVar) {
        super(fVar);
        C41536l.m120489i(fVar, "context");
    }

    /* renamed from: a */
    public void mo32123a() {
        mo32124b();
        String a = ((C10146d0.C10172e) new C12032a().mo32128b()).mo26726q().mo92939a();
        int hashCode = a.hashCode();
        if (hashCode != -2095514455) {
            if (hashCode != -2015525726) {
                if (hashCode == 106427 && a.equals("m4B")) {
                    RelatedCompany q = mo32125c().mo32158q();
                    if (q != null) {
                        mo32125c().mo32143b().mo4823o(q.mo88300b());
                        return;
                    }
                    throw new IllegalStateException("Company not selected");
                }
                return;
            } else if (!a.equals("MOBILE")) {
                return;
            }
        } else if (!a.equals("JUNIOR")) {
            return;
        }
        mo32125c().mo32143b().mo4823o("");
    }
}
