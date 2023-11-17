package p199oa;

import p134ja.C6763a;
import p142k5.C6811b;
import p142k5.C6812c;
import p142k5.C6815f;
import p142k5.C6816g;
import p225qa.C7979i;
import p327y9.C9142b;

/* renamed from: oa.b */
final class C7496b {

    /* renamed from: d */
    private static final C6763a f21815d = C6763a.m26371e();

    /* renamed from: a */
    private final String f21816a;

    /* renamed from: b */
    private final C9142b f21817b;

    /* renamed from: c */
    private C6815f f21818c;

    C7496b(C9142b bVar, String str) {
        this.f21816a = str;
        this.f21817b = bVar;
    }

    /* renamed from: a */
    private boolean m28464a() {
        if (this.f21818c == null) {
            C6816g gVar = (C6816g) this.f21817b.get();
            if (gVar != null) {
                this.f21818c = gVar.mo20889a(this.f21816a, C7979i.class, C6811b.m26540b("proto"), new C7495a());
            } else {
                f21815d.mo20812j("Flg TransportFactory is not available at the moment");
            }
        }
        if (this.f21818c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo21930b(C7979i iVar) {
        if (!m28464a()) {
            f21815d.mo20812j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f21818c.mo20888b(C6812c.m26542d(iVar));
        }
    }
}
