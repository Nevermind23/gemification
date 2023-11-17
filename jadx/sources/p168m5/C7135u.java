package p168m5;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p142k5.C6811b;
import p142k5.C6816g;
import p142k5.C6817h;
import p246s5.C8236e;
import p259t5.C8392r;
import p259t5.C8396v;
import p298w5.C8850a;

/* renamed from: m5.u */
public class C7135u implements C7134t {

    /* renamed from: e */
    private static volatile C7136v f21136e;

    /* renamed from: a */
    private final C8850a f21137a;

    /* renamed from: b */
    private final C8850a f21138b;

    /* renamed from: c */
    private final C8236e f21139c;

    /* renamed from: d */
    private final C8392r f21140d;

    C7135u(C8850a aVar, C8850a aVar2, C8236e eVar, C8392r rVar, C8396v vVar) {
        this.f21137a = aVar;
        this.f21138b = aVar2;
        this.f21139c = eVar;
        this.f21140d = rVar;
        vVar.mo23592c();
    }

    /* renamed from: b */
    private C7118i m27502b(C7127o oVar) {
        return C7118i.m27441a().mo21338i(this.f21137a.mo24276a()).mo21340k(this.f21138b.mo24276a()).mo21339j(oVar.mo21346g()).mo21337h(new C7117h(oVar.mo21341b(), oVar.mo21385d())).mo21336g(oVar.mo21342c().mo20877a()).mo21333d();
    }

    /* renamed from: c */
    public static C7135u m27503c() {
        C7136v vVar = f21136e;
        if (vVar != null) {
            return vVar.mo21365k();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set m27504d(C7115f fVar) {
        if (fVar instanceof C7116g) {
            return Collections.unmodifiableSet(((C7116g) fVar).mo11424a());
        }
        return Collections.singleton(C6811b.m26540b("proto"));
    }

    /* renamed from: f */
    public static void m27505f(Context context) {
        if (f21136e == null) {
            synchronized (C7135u.class) {
                if (f21136e == null) {
                    f21136e = C7112e.m27431n().mo21367b(context).mo21366a();
                }
            }
        }
    }

    /* renamed from: a */
    public void mo21390a(C7127o oVar, C6817h hVar) {
        this.f21139c.mo23421a(oVar.mo21345f().mo21387f(oVar.mo21342c().mo20879c()), m27502b(oVar), hVar);
    }

    /* renamed from: e */
    public C8392r mo21391e() {
        return this.f21140d;
    }

    /* renamed from: g */
    public C6816g mo21392g(C7115f fVar) {
        return new C7131q(m27504d(fVar), C7129p.m27484a().mo21361b(fVar.getName()).mo21362c(fVar.getExtras()).mo21360a(), this);
    }
}
