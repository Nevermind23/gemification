package z30;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import he1.C41217g;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p366bk.C10322k;
import p366bk.C10324m;
import r40.C27917c;
import t40.C28304a;
import ue1.C43064a;
import ue1.C43079p;
import y30.C29912c;

/* renamed from: z30.f */
public final class C30175f extends C35651n1 {

    /* renamed from: h */
    public static final C30176a f76053h = new C30176a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C41217g f76054d = C41219i.m119470b(new C30180e(this));
    /* access modifiers changed from: private */

    /* renamed from: e */
    public AnalysisChildModel f76055e;

    /* renamed from: f */
    private FilterValue.Calendar f76056f;

    /* renamed from: g */
    private C29912c f76057g = new C29912c();

    /* renamed from: z30.f$a */
    public static final class C30176a {
        private C30176a() {
        }

        public /* synthetic */ C30176a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C30175f mo70536a(AnalysisChildModel analysisChildModel, FilterValue.Calendar calendar) {
            C41536l.m120489i(analysisChildModel, "analysisChild");
            C41536l.m120489i(calendar, "calendarValue");
            C30175f fVar = new C30175f();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ANALYSIS_CHILDREN", analysisChildModel);
            bundle.putParcelable("CALENDAR_VALUE", calendar);
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: z30.f$b */
    static final class C30177b extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C30146d f76058d;

        /* renamed from: e */
        final /* synthetic */ C30175f f76059e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30177b(C30146d dVar, C30175f fVar) {
            super(2);
            this.f76058d = dVar;
            this.f76059e = fVar;
        }

        /* renamed from: a */
        public final void mo70537a(long j, boolean z) {
            C30146d dVar = this.f76058d;
            if (dVar != null) {
                AnalysisChildModel j1 = this.f76059e.f76055e;
                if (j1 == null) {
                    C41536l.m120506z("analysisChild");
                    j1 = null;
                }
                dVar.mo70507b2(j1, j, z, true);
            }
            this.f76059e.m91269n1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo70537a(((Number) obj).longValue(), ((Boolean) obj2).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: z30.f$c */
    static final class C30178c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30146d f76060d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30178c(C30146d dVar) {
            super(0);
            this.f76060d = dVar;
        }

        public final void invoke() {
            C30146d dVar = this.f76060d;
            if (dVar != null) {
                dVar.mo70504S1();
            }
        }
    }

    /* renamed from: z30.f$d */
    static final class C30179d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30175f f76061d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30179d(C30175f fVar) {
            super(0);
            this.f76061d = fVar;
        }

        public final void invoke() {
            C28304a aVar = C28304a.f71822a;
            C1505h requireActivity = this.f76061d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            aVar.mo67958a(requireActivity, C27917c.ANALYSIS);
        }
    }

    /* renamed from: z30.f$e */
    static final class C30180e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C30175f f76062d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C30180e(C30175f fVar) {
            super(0);
            this.f76062d = fVar;
        }

        /* renamed from: b */
        public final RecyclerView invoke() {
            return (RecyclerView) this.f76062d.findView(C10322k.f28709Ar);
        }
    }

    /* renamed from: l1 */
    private final RecyclerView m91267l1() {
        Object value = this.f76054d.getValue();
        C41536l.m120488h(value, "<get-recyclerView>(...)");
        return (RecyclerView) value;
    }

    /* renamed from: m1 */
    private final void m91268m1() {
        C30146d dVar;
        boolean z;
        Fragment parentFragment = getParentFragment();
        FilterValue.Calendar calendar = null;
        if (parentFragment instanceof C30146d) {
            dVar = (C30146d) parentFragment;
        } else {
            dVar = null;
        }
        RecyclerView l1 = m91267l1();
        l1.setLayoutManager(new LinearLayoutManager(l1.getContext()));
        boolean z2 = true;
        l1.setHasFixedSize(true);
        l1.setAdapter(this.f76057g);
        C29912c cVar = this.f76057g;
        AnalysisChildModel analysisChildModel = this.f76055e;
        if (analysisChildModel == null) {
            C41536l.m120506z("analysisChild");
            analysisChildModel = null;
        }
        FilterValue.Calendar calendar2 = this.f76056f;
        if (calendar2 == null) {
            C41536l.m120506z("calendarValue");
        } else {
            calendar = calendar2;
        }
        cVar.mo70198H(analysisChildModel, calendar);
        cVar.mo70200J(new C30177b(dVar, this));
        if (dVar != null) {
            z = dVar.mo70499D1();
        } else {
            z = true;
        }
        cVar.mo70203M(z);
        if (dVar != null) {
            z2 = dVar.mo70501F1();
        }
        cVar.mo70202L(z2);
        cVar.mo70199I(new C30178c(dVar));
        cVar.mo70201K(new C30179d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public final void m91269n1() {
        m91267l1().mo5425x1(0);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_analysis_sub_category;
    }

    /* JADX WARNING: type inference failed for: r3v4, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r3) {
        /*
            r2 = this;
            super.onCreate(r3)
            android.os.Bundle r3 = r2.getArguments()
            r0 = 0
            if (r3 == 0) goto L_0x0013
            java.lang.String r1 = "ANALYSIS_CHILDREN"
            android.os.Parcelable r3 = r3.getParcelable(r1)
            ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel r3 = (p341ge.bog.mobilebank.cleanarch.presentation.pfm.analysis.model.AnalysisChildModel) r3
            goto L_0x0014
        L_0x0013:
            r3 = r0
        L_0x0014:
            kotlin.jvm.internal.C41536l.m120486f(r3)
            r2.f76055e = r3
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0028
            java.lang.String r0 = "CALENDAR_VALUE"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r0 = r3
            ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue$Calendar r0 = (p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue.Calendar) r0
        L_0x0028:
            kotlin.jvm.internal.C41536l.m120486f(r0)
            r2.f76056f = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: z30.C30175f.onCreate(android.os.Bundle):void");
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m91268m1();
    }
}
