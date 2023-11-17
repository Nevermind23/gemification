package da1;

import ba1.C10146d0;
import fh1.C40951a;
import gh1.C41125a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import nh1.C41806a;
import p341ge.bog.sso_client.models.RelatedCompany;
import ue1.C43064a;

/* renamed from: da1.e */
public final class C12035e extends C12030b {

    /* renamed from: da1.e$a */
    public static final class C12036a implements C41125a {

        /* renamed from: a */
        private final Object f35416a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32140b() {
            return this.f35416a;
        }
    }

    /* renamed from: da1.e$b */
    public static final class C12037b implements C41125a {

        /* renamed from: a */
        private final Object f35417a = mo26679a().mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), (C41806a) null, (C43064a) null);

        /* renamed from: a */
        public C40951a mo26679a() {
            return C41125a.C41126a.m119226a(this);
        }

        /* renamed from: b */
        public final Object mo32141b() {
            return this.f35417a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12035e(C12038f fVar) {
        super(fVar);
        C41536l.m120489i(fVar, "context");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.sso_client.models.RelatedCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ge.bog.sso_client.models.RelatedCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: ge.bog.sso_client.models.RelatedCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.sso_client.models.RelatedCompany} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: ge.bog.sso_client.models.RelatedCompany} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo32123a() {
        /*
            r6 = this;
            r6.mo32124b()
            da1.e$a r0 = new da1.e$a
            r0.<init>()
            java.lang.Object r0 = r0.mo32140b()
            ba1.d0$e r0 = (ba1.C10146d0.C10172e) r0
            va1.i r0 = r0.mo26726q()
            java.lang.String r0 = r0.mo92939a()
            java.lang.String r1 = "m4B"
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 == 0) goto L_0x009f
            da1.f r0 = r6.mo32125c()
            java.util.List r0 = r0.mo32142a()
            if (r0 == 0) goto L_0x0097
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x0097
            int r1 = r0.size()
            r2 = 0
            r3 = 1
            if (r1 <= r3) goto L_0x0080
            ge.bog.sso_client.models.Session r1 = ba1.C10146d0.C10159c.m37143b()
            java.lang.String r1 = r1.getSavedCompanyClientKey$sso_client_release()
            if (r1 == 0) goto L_0x0041
            r2 = r3
        L_0x0041:
            r3 = 0
            if (r2 == 0) goto L_0x0046
            r2 = r0
            goto L_0x0047
        L_0x0046:
            r2 = r3
        L_0x0047:
            if (r2 == 0) goto L_0x0067
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0065
            java.lang.Object r4 = r2.next()
            r5 = r4
            ge.bog.sso_client.models.RelatedCompany r5 = (p341ge.bog.sso_client.models.RelatedCompany) r5
            java.lang.String r5 = r5.mo88300b()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r1)
            if (r5 == 0) goto L_0x004d
            r3 = r4
        L_0x0065:
            ge.bog.sso_client.models.RelatedCompany r3 = (p341ge.bog.sso_client.models.RelatedCompany) r3
        L_0x0067:
            if (r3 == 0) goto L_0x0074
            da1.f r0 = r6.mo32125c()
            r0.mo32163v(r3)
            r6.mo32127e()
            goto L_0x0096
        L_0x0074:
            da1.f r1 = r6.mo32125c()
            androidx.lifecycle.x r1 = r1.mo32146e()
            r1.mo4823o(r0)
            goto L_0x0096
        L_0x0080:
            int r1 = r0.size()
            if (r1 != r3) goto L_0x0096
            da1.f r1 = r6.mo32125c()
            java.lang.Object r0 = r0.get(r2)
            ge.bog.sso_client.models.RelatedCompany r0 = (p341ge.bog.sso_client.models.RelatedCompany) r0
            r1.mo32163v(r0)
            r6.mo32127e()
        L_0x0096:
            return
        L_0x0097:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "There are no companies"
            r0.<init>(r1)
            throw r0
        L_0x009f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "There are no companies for channel: "
            r1.append(r2)
            da1.e$b r2 = new da1.e$b
            r2.<init>()
            java.lang.Object r2 = r2.mo32141b()
            ba1.d0$e r2 = (ba1.C10146d0.C10172e) r2
            va1.i r2 = r2.mo26726q()
            java.lang.String r2 = r2.mo92939a()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: da1.C12035e.mo32123a():void");
    }

    /* renamed from: f */
    public final void mo32139f(RelatedCompany relatedCompany) {
        C41536l.m120489i(relatedCompany, "company");
        mo32125c().mo32163v(relatedCompany);
        mo32127e();
    }
}
