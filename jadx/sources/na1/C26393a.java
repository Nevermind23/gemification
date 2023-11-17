package na1;

import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import cd1.C40393c;
import cf1.C40419j;
import dd1.C40578p1;
import gb1.C32383o;
import ha1.C15458b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13368e;
import p341ge.bog.sso_client.models.Rule;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p603si.C17799b;

/* renamed from: na1.a */
public final class C26393a extends C15458b {

    /* renamed from: h */
    private final C10146d0.C10172e f66886h;

    /* renamed from: i */
    private final C40393c f66887i;

    /* renamed from: j */
    private List f66888j = C41341q.m119907j();

    /* renamed from: k */
    private final C32383o f66889k;

    /* renamed from: l */
    private final LiveData f66890l;

    /* renamed from: m */
    private final C32383o f66891m;

    /* renamed from: n */
    private final LiveData f66892n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26393a(C10146d0.C10172e eVar, C40393c cVar) {
        super((C40578p1) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(eVar, "config");
        C41536l.m120489i(cVar, "startTMXProfilingUseCase");
        this.f66886h = eVar;
        this.f66887i = cVar;
        C32383o oVar = new C32383o();
        this.f66889k = oVar;
        this.f66890l = oVar;
        C32383o oVar2 = new C32383o();
        this.f66891m = oVar2;
        this.f66892n = oVar2;
        mo42540ew(cVar.mo94454b(TMXFlags.TMX_FLAG_CHANGE_USER_NAME_KEY));
    }

    /* renamed from: jw */
    public static /* synthetic */ void m82487jw(C26393a aVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        aVar.mo65629iw(str);
    }

    /* renamed from: mw */
    private final boolean m82488mw(Rule rule, String str, boolean z) {
        if (rule.mo88314b() == null || rule.mo88319f() == null) {
            return true;
        }
        if ((!z || C41536l.m120484d(rule.mo88317e(), Boolean.TRUE)) && C41536l.m120484d(rule.mo88319f(), Boolean.valueOf(new C40419j(rule.mo88314b()).mo94489f(str)))) {
            return false;
        }
        return true;
    }

    /* renamed from: nw */
    static /* synthetic */ boolean m82489nw(C26393a aVar, Rule rule, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return aVar.m82488mw(rule, str, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0035, code lost:
        return new he1.C41224m(r2, m82491pw(m82489nw(r9, r10, r11, false, 4, (java.lang.Object) null)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (r1 == null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r2 = r1;
     */
    /* renamed from: ow */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final he1.C41224m m82490ow(p341ge.bog.sso_client.models.Rule r10, java.lang.String r11) {
        /*
            r9 = this;
            he1.m r0 = new he1.m
            ba1.d0$e r1 = r9.f66886h
            ba1.g0 r1 = r1.mo26716g()
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x001c
            java.lang.String r3 = r10.mo88313a()
            if (r3 != 0) goto L_0x0013
            r3 = r2
        L_0x0013:
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r1 = r1.mo26763a(r3, r4)
            if (r1 != 0) goto L_0x0023
        L_0x001c:
            java.lang.String r1 = r10.mo88313a()
            if (r1 != 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r2 = r1
        L_0x0024:
            r6 = 0
            r7 = 4
            r8 = 0
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r10 = m82489nw(r3, r4, r5, r6, r7, r8)
            ge.bog.designsystem.components.list.e r10 = r9.m82491pw(r10)
            r0.<init>(r2, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: na1.C26393a.m82490ow(ge.bog.sso_client.models.Rule, java.lang.String):he1.m");
    }

    /* renamed from: pw */
    private final C13368e m82491pw(boolean z) {
        return z ? C13368e.POSITIVE : C13368e.INFORMATION;
    }

    /* renamed from: iw */
    public final void mo65629iw(String str) {
        C41536l.m120489i(str, "text");
        C32383o oVar = this.f66889k;
        List<Rule> list = this.f66888j;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (Rule ow : list) {
            arrayList.add(m82490ow(ow, str));
        }
        oVar.mo4823o(arrayList);
    }

    /* renamed from: kw */
    public final LiveData mo65630kw() {
        return this.f66892n;
    }

    /* renamed from: lw */
    public final LiveData mo65631lw() {
        return this.f66890l;
    }

    /* renamed from: qw */
    public final void mo65632qw(List list) {
        C41536l.m120489i(list, "rules");
        this.f66888j = list;
        C32383o oVar = this.f66891m;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String b = ((Rule) it.next()).mo88314b();
            if (b == null) {
                b = "";
            }
            arrayList.add(new C17799b.C17807h(new C40419j(b)));
        }
        oVar.mo4823o(arrayList);
    }
}
