package p398dn;

import com.github.mikephil.charting.utils.Utils;
import he1.C41224m;
import he1.C41233s;
import java.util.HashMap;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cardapplications.presentation.model.C14235a;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel;
import p383cn.C10515c;
import p537nm.C17081e0;
import p537nm.C17085g0;
import p674xm.C18815q;
import p674xm.C18833r;

/* renamed from: dn.e */
public final class C12333e {

    /* renamed from: a */
    public static final C12333e f36978a = new C12333e();

    /* renamed from: dn.e$a */
    public /* synthetic */ class C12334a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f36979a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                cn.c[] r0 = p383cn.C10515c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cn.c r1 = p383cn.C10515c.CARD_DETAILS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cn.c r1 = p383cn.C10515c.SUMMARY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cn.c r1 = p383cn.C10515c.PICKUP_DETAILS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f36979a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p398dn.C12333e.C12334a.<clinit>():void");
        }
    }

    private C12333e() {
    }

    /* renamed from: b */
    private final float m47273b(C18833r rVar, C14235a aVar) {
        C17085g0 g0Var;
        HashMap l = C41344r0.m119930l(m47276e(rVar.mo46764e()), m47276e(rVar.mo46766f()), m47277f(rVar.mo46771j()));
        if (aVar.mo39886g().mo39792k()) {
            C41224m e = m47276e(rVar.mo46781t());
            l.put(e.mo95678e(), e.mo95680f());
        }
        if (aVar.mo39882d().getPlcSchoolFlag()) {
            C41224m e2 = m47276e(rVar.mo46762c());
            l.put(e2.mo95678e(), e2.mo95680f());
        }
        DebitCardRegTypeUiModel e3 = rVar.mo46764e().mo46669a();
        C17081e0 e0Var = null;
        if (e3 != null) {
            g0Var = e3.mo39595b();
        } else {
            g0Var = null;
        }
        if (g0Var == C17085g0.EXISTING_ACCOUNT) {
            C41224m e4 = m47276e(rVar.mo46763d());
            l.put(e4.mo95678e(), e4.mo95680f());
        }
        if (aVar.mo39886g().mo39786f()) {
            C41224m e5 = m47276e(rVar.mo46775n());
            l.put(e5.mo95678e(), e5.mo95680f());
            DebitCardPinDeliveryTypeUiModel e6 = rVar.mo46775n().mo46669a();
            if (e6 != null) {
                e0Var = e6.mo39561a();
            }
            if (e0Var == C17081e0.SMS) {
                C41224m e7 = m47276e(rVar.mo46774m());
                l.put(e7.mo95678e(), e7.mo95680f());
            }
        }
        return m47278g(l);
    }

    /* renamed from: c */
    private final float m47274c(C18833r rVar, C14235a aVar) {
        HashMap l = C41344r0.m119930l(m47279h(rVar.mo46784v()));
        if (!aVar.mo39890j().mo39956a().isEmpty()) {
            C41224m e = m47276e(rVar.mo46770i());
            l.put(e.mo95678e(), e.mo95680f());
        }
        return m47278g(l);
    }

    /* renamed from: d */
    private final float m47275d(C18833r rVar, C14235a aVar) {
        C17081e0 e0Var;
        HashMap l = C41344r0.m119930l(m47276e(rVar.mo46773l()), m47276e(rVar.mo46783u()));
        if (!aVar.mo39886g().mo39786f()) {
            C41224m e = m47276e(rVar.mo46775n());
            l.put(e.mo95678e(), e.mo95680f());
        }
        if (!aVar.mo39886g().mo39786f()) {
            DebitCardPinDeliveryTypeUiModel e2 = rVar.mo46775n().mo46669a();
            if (e2 != null) {
                e0Var = e2.mo39561a();
            } else {
                e0Var = null;
            }
            if (e0Var == C17081e0.SMS) {
                C41224m f = m47277f(rVar.mo46774m());
                l.put(f.mo95678e(), f.mo95680f());
            }
        }
        if (rVar.mo46773l().mo46728e()) {
            C41224m e3 = m47276e(rVar.mo46768h());
            l.put(e3.mo95678e(), e3.mo95680f());
            C41224m f2 = m47277f(rVar.mo46767g());
            l.put(f2.mo95678e(), f2.mo95680f());
            C41224m e4 = m47276e(rVar.mo46780s());
            l.put(e4.mo95678e(), e4.mo95680f());
            if (C12330d.f36975a.mo32927g(rVar.mo46780s().mo46669a())) {
                C41224m f3 = m47277f(rVar.mo46777p());
                l.put(f3.mo95678e(), f3.mo95680f());
                C41224m f4 = m47277f(rVar.mo46778q());
                l.put(f4.mo95678e(), f4.mo95680f());
                C41224m e5 = m47276e(rVar.mo46776o());
                l.put(e5.mo95678e(), e5.mo95680f());
                C41224m f5 = m47277f(rVar.mo46772k());
                l.put(f5.mo95678e(), f5.mo95680f());
            } else {
                C41224m f6 = m47277f(rVar.mo46779r());
                l.put(f6.mo95678e(), f6.mo95680f());
            }
        }
        return m47278g(l);
    }

    /* renamed from: e */
    private final C41224m m47276e(C18815q qVar) {
        return C41233s.m119492a(qVar, Boolean.valueOf(m47280i(qVar.mo46669a())));
    }

    /* renamed from: f */
    private final C41224m m47277f(C18815q.C18823h hVar) {
        return C41233s.m119492a(hVar, Boolean.valueOf(hVar.mo46709e()));
    }

    /* renamed from: g */
    private final float m47278g(HashMap hashMap) {
        float size = (float) hashMap.size();
        int i = 0;
        if (!hashMap.isEmpty()) {
            for (Map.Entry value : hashMap.entrySet()) {
                if (((Boolean) value.getValue()).booleanValue()) {
                    i++;
                }
            }
        }
        float f = (float) i;
        if (size > Utils.FLOAT_EPSILON) {
            return (f / size) * ((float) 100);
        }
        return Utils.FLOAT_EPSILON;
    }

    /* renamed from: h */
    private final C41224m m47279h(C18815q.C18816a aVar) {
        return C41233s.m119492a(aVar, aVar.mo46669a());
    }

    /* renamed from: i */
    private final boolean m47280i(Object obj) {
        return obj != null;
    }

    /* renamed from: a */
    public final float mo32936a(C18833r rVar, C10515c cVar, C14235a aVar) {
        C41536l.m120489i(rVar, "input");
        C41536l.m120489i(cVar, "step");
        C41536l.m120489i(aVar, "resources");
        int i = C12334a.f36979a[cVar.ordinal()];
        if (i == 1) {
            return m47273b(rVar, aVar);
        }
        if (i == 2) {
            return m47274c(rVar, aVar);
        }
        if (i == 3) {
            return m47275d(rVar, aVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
