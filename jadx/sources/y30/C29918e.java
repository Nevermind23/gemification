package y30;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b50.C19333a;
import com.salesforce.marketingcloud.C11398b;
import d40.C19902c;
import f50.C20432f;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l81.C37107d;
import o81.C37693a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p366bk.C10324m;
import ue1.C43064a;
import ue1.C43075l;
import x00.C29609d;
import x00.C29615f;

/* renamed from: y30.e */
public final class C29918e extends C29609d {

    /* renamed from: C */
    public static final C29919a f75691C = new C29919a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private boolean f75692A;

    /* renamed from: B */
    private boolean f75693B;

    /* renamed from: l */
    private final Activity f75694l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C43075l f75695m;

    /* renamed from: n */
    private C43064a f75696n;

    /* renamed from: o */
    private C43064a f75697o;

    /* renamed from: p */
    private C43064a f75698p;

    /* renamed from: q */
    private C43075l f75699q;

    /* renamed from: r */
    private Drawable f75700r;

    /* renamed from: s */
    private FilterValue.Calendar f75701s = new FilterValue.Calendar(0, (Long) null, (Long) null, 0L);

    /* renamed from: t */
    private String f75702t = "";

    /* renamed from: u */
    private BigDecimal f75703u;

    /* renamed from: v */
    private BigDecimal f75704v;

    /* renamed from: w */
    private ArrayList f75705w;

    /* renamed from: x */
    private int f75706x;

    /* renamed from: y */
    private boolean f75707y;

    /* renamed from: z */
    private boolean f75708z;

    /* renamed from: y30.e$a */
    public static final class C29919a {
        private C29919a() {
        }

        public /* synthetic */ C29919a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: y30.e$b */
    static final class C29920b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C29918e f75709d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29920b(C29918e eVar) {
            super(1);
            this.f75709d = eVar;
        }

        /* renamed from: a */
        public final void mo70218a(AnalysisChildModel analysisChildModel) {
            C41536l.m120489i(analysisChildModel, "selectedCategory");
            C43075l f0 = this.f75709d.f75695m;
            if (f0 != null) {
                f0.invoke(analysisChildModel);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo70218a((AnalysisChildModel) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29918e(Activity activity) {
        super(true, (C37693a) null, 2, (DefaultConstructorMarker) null);
        C41536l.m120489i(activity, "activity");
        this.f75694l = activity;
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal, "ZERO");
        this.f75703u = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal2, "ZERO");
        this.f75704v = bigDecimal2;
        this.f75705w = new ArrayList();
        this.f75706x = -1;
        this.f75707y = true;
        this.f75708z = true;
        this.f75692A = true;
        this.f75693B = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R */
    public void mo69502R() {
        mo69509e0();
        C43064a aVar = this.f75698p;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: V */
    public void mo69504V(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C20432f.C20434b bVar;
        RecyclerView.C1734f0 f0Var2 = f0Var;
        C41536l.m120489i(f0Var2, "holder");
        if (f0Var2 instanceof C19902c) {
            C19902c cVar = (C19902c) f0Var2;
            C19902c.C19904b bVar2 = r2;
            C19902c.C19904b bVar3 = new C19902c.C19904b(this.f75702t, this.f75703u, this.f75704v, this.f75700r, this.f75705w, this.f75701s, true, this.f75692A, this.f75693B, false, this.f75706x, this.f75708z, C11398b.f33140s, (DefaultConstructorMarker) null);
            cVar.mo48272o(bVar2);
            cVar.mo48276t(new C29920b(this));
            cVar.mo48274r(this.f75696n);
            cVar.mo48277u(this.f75697o);
        } else if ((f0Var2 instanceof C20432f) && (bVar = (C20432f.C20434b) mo69499K(i2)) != null) {
            if (bVar instanceof C20432f.C20434b.C20436b) {
                C20432f.m66575q((C20432f) f0Var2, (C20432f.C20434b.C20436b) bVar, (C43075l) null, (Boolean) null, this.f75699q, 6, (Object) null);
            } else if (bVar instanceof C20432f.C20434b.C20435a) {
                C20432f fVar = (C20432f) f0Var2;
                String a = ((C20432f.C20434b.C20435a) bVar).mo48922a();
                if (a == null) {
                    a = "";
                }
                fVar.mo48920r(a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public RecyclerView.C1734f0 mo69505Y(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 0) {
            C19902c a = C19902c.f54412u.mo48279a(viewGroup, this.f75707y);
            this.f75707y = false;
            return a;
        } else if (i == 1) {
            return new C37107d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.analysis_recycler_header_item, viewGroup, false));
        } else {
            return C20432f.C20433a.m66586b(C20432f.f55387t, viewGroup, this.f75694l, "pfm_analysis", false, 8, (Object) null);
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [java.util.List] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70207g0(p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel r4, p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel r5, p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.Calendar r6) {
        /*
            r3 = this;
            java.lang.String r0 = "parentCategory"
            kotlin.jvm.internal.C41536l.m120489i(r4, r0)
            java.lang.String r0 = "selectedCategory"
            kotlin.jvm.internal.C41536l.m120489i(r5, r0)
            java.lang.String r0 = "calendarValue"
            kotlin.jvm.internal.C41536l.m120489i(r6, r0)
            r3.f75701s = r6
            q40.a r6 = q40.C27680a.f70771a
            long r0 = r5.mo54781f()
            java.lang.String r2 = r5.mo54779e()
            int r2 = android.graphics.Color.parseColor(r2)
            android.graphics.drawable.Drawable r6 = r6.mo67217b(r0, r2)
            r3.f75700r = r6
            java.math.BigDecimal r6 = r5.mo54783h()
            r3.f75704v = r6
            java.math.BigDecimal r6 = r4.mo54783h()
            r3.f75703u = r6
            java.lang.String r5 = r5.mo54782g()
            r6 = 0
            r0 = 2
            r1 = 0
            java.lang.String r5 = r90.C27950a.m86287d(r5, r6, r0, r1)
            r3.f75702t = r5
            java.util.List r4 = r4.mo54777d()
            boolean r5 = r4 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0049
            r1 = r4
            java.util.ArrayList r1 = (java.util.ArrayList) r1
        L_0x0049:
            if (r1 != 0) goto L_0x0050
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        L_0x0050:
            r3.f75705w = r1
            r3.mo69516r(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y30.C29918e.mo70207g0(ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel, ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel, ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Calendar):void");
    }

    /* renamed from: h0 */
    public final void mo70208h0(List list, boolean z) {
        C41536l.m120489i(list, "accountOperations");
        mo69501N();
        ArrayList arrayList = new ArrayList();
        for (C20432f.C20434b.C20436b b : C19333a.m64786e(list)) {
            C19333a.m64783b(arrayList, b, false, 2, (Object) null);
        }
        mo69503T(arrayList);
        if (z) {
            mo69506Z();
        } else {
            mo69507c0();
        }
    }

    /* renamed from: i0 */
    public final void mo70209i0(C43064a aVar) {
        this.f75696n = aVar;
    }

    /* renamed from: j0 */
    public final void mo70210j0(C43075l lVar) {
        this.f75695m = lVar;
    }

    /* renamed from: k0 */
    public final void mo70211k0(C43064a aVar) {
        this.f75697o = aVar;
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41358y.m120023m0(C41341q.m119910m(new C29615f.C29617b(0, 1), new C29615f.C29617b(1, 1)), super.mo48134l());
    }

    /* renamed from: l0 */
    public final void mo70212l0(C43064a aVar) {
        this.f75698p = aVar;
    }

    /* renamed from: m0 */
    public final void mo70213m0(C43075l lVar) {
        C41536l.m120489i(lVar, "block");
        this.f75699q = lVar;
    }

    /* renamed from: n0 */
    public final void mo70214n0(boolean z) {
        this.f75693B = z;
    }

    /* renamed from: o0 */
    public final void mo70215o0(int i) {
        this.f75706x = i;
    }

    /* renamed from: p0 */
    public final void mo70216p0(boolean z) {
        this.f75708z = z;
    }

    /* renamed from: q0 */
    public final void mo70217q0(boolean z) {
        this.f75692A = z;
    }
}
