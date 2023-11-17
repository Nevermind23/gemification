package oo0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel;
import xn0.C18853k;

/* renamed from: oo0.b */
public final class C17291b extends C1819o {

    /* renamed from: f */
    private final C17293c f48579f;

    /* renamed from: oo0.b$a */
    public static final class C17292a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C18853k f48580d;

        /* renamed from: e */
        private final C17293c f48581e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17292a(C18853k kVar, C17293c cVar) {
            super(kVar.mo3946b());
            C41536l.m120489i(kVar, "binding");
            C41536l.m120489i(cVar, "onProgressClickListener");
            this.f48580d = kVar;
            this.f48581e = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m60628j(C17292a aVar, OffersProgressListItemUiModel offersProgressListItemUiModel, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(offersProgressListItemUiModel, "$data");
            aVar.f48581e.mo42066a(offersProgressListItemUiModel);
        }

        /* JADX WARNING: Removed duplicated region for block: B:23:0x00d3  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x00d8  */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo44684i(p341ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                java.lang.String r2 = "data"
                kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                xn0.k r2 = r0.f48580d
                ge.bog.designsystem.components.cardobjective.CardObjectiveView r2 = r2.f52758e
                oo0.a r3 = new oo0.a
                r3.<init>(r0, r1)
                r2.setOnClickListener(r3)
                xn0.k r2 = r0.f48580d
                ge.bog.designsystem.components.cardobjective.CardObjectiveView r2 = r2.f52758e
                ge.bog.designsystem.components.cardobjective.TimerViewData r4 = r17.mo41855l()
                java.lang.String r5 = r17.mo41854k()
                ko0.c$a r3 = ko0.C16521c.f46671j
                java.lang.String r6 = r17.mo41843b()
                ko0.c r6 = r3.mo43680a(r6)
                r7 = 0
                if (r6 == 0) goto L_0x0042
                java.lang.Integer r6 = r6.mo43675c()
                if (r6 == 0) goto L_0x003f
                int r6 = r6.intValue()
                ge.bog.designsystem.components.common.Image$Resource r8 = new ge.bog.designsystem.components.common.Image$Resource
                r9 = 2
                r8.<init>(r6, r7, r9, r7)
                goto L_0x0040
            L_0x003f:
                r8 = r7
            L_0x0040:
                r6 = r8
                goto L_0x0043
            L_0x0042:
                r6 = r7
            L_0x0043:
                java.lang.String r9 = r17.mo41846e()
                ge.bog.designsystem.components.textprogressbar.TextProgressBarView$ProgressModel$Progress r8 = r17.mo41853j()
                java.util.List r10 = r17.mo41848f()
                java.lang.String r11 = r17.mo41844d()
                java.lang.String r12 = r17.mo41842a()
                java.lang.StringBuilder r13 = new java.lang.StringBuilder
                r13.<init>()
                r13.append(r11)
                java.lang.String r11 = " "
                r13.append(r11)
                r13.append(r12)
                java.lang.String r11 = r13.toString()
                java.lang.String r12 = r17.mo41843b()
                ko0.c r12 = r3.mo43680a(r12)
                if (r12 == 0) goto L_0x00c8
                java.lang.String r12 = r12.name()
                if (r12 == 0) goto L_0x00c8
                java.util.Locale r13 = java.util.Locale.ROOT
                java.lang.String r14 = "ROOT"
                kotlin.jvm.internal.C41536l.m120488h(r13, r14)
                java.lang.String r12 = r12.toLowerCase(r13)
                java.lang.String r14 = "this as java.lang.String).toLowerCase(locale)"
                kotlin.jvm.internal.C41536l.m120488h(r12, r14)
                if (r12 == 0) goto L_0x00c8
                int r7 = r12.length()
                r15 = 0
                if (r7 <= 0) goto L_0x0096
                r7 = 1
                goto L_0x0097
            L_0x0096:
                r7 = r15
            L_0x0097:
                if (r7 == 0) goto L_0x00c9
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                char r15 = r12.charAt(r15)
                java.lang.String r15 = java.lang.String.valueOf(r15)
                java.lang.String r14 = "null cannot be cast to non-null type java.lang.String"
                kotlin.jvm.internal.C41536l.m120487g(r15, r14)
                java.lang.String r13 = r15.toUpperCase(r13)
                java.lang.String r14 = "this as java.lang.String).toUpperCase(Locale.ROOT)"
                kotlin.jvm.internal.C41536l.m120488h(r13, r14)
                r7.append(r13)
                r13 = 1
                java.lang.String r12 = r12.substring(r13)
                java.lang.String r13 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.C41536l.m120488h(r12, r13)
                r7.append(r12)
                java.lang.String r7 = r7.toString()
            L_0x00c8:
                r12 = r7
            L_0x00c9:
                java.lang.String r1 = r17.mo41843b()
                ko0.c r1 = r3.mo43680a(r1)
                if (r1 == 0) goto L_0x00d8
                int r1 = r1.mo43678g()
                goto L_0x00da
            L_0x00d8:
                int r1 = p601sg.C17778c.f49637v
            L_0x00da:
                r13 = r1
                ge.bog.designsystem.components.cardobjective.CardObjectiveData r1 = new ge.bog.designsystem.components.cardobjective.CardObjectiveData
                r7 = 0
                r14 = 8
                r15 = 0
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
                r2.setData(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oo0.C17291b.C17292a.mo44684i(ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17291b(C17293c cVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(cVar, "onProgressClickListener");
        this.f48579f = cVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C17292a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        OffersProgressListItemUiModel offersProgressListItemUiModel = (OffersProgressListItemUiModel) mo6027g(i);
        C41536l.m120487g(offersProgressListItemUiModel, "null cannot be cast to non-null type ge.bog.mobilebank.lifestyleoffers.domain.model.OffersProgressListItemUiModel");
        aVar.mo44684i(offersProgressListItemUiModel);
    }

    /* renamed from: l */
    public C17292a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C18853k d = C18853k.m63783d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(inflater, parent, false)");
        return new C17292a(d, this.f48579f);
    }
}
