package p341ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import gb1.C32395y;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import ie0.C25184d;
import ie0.C25190j;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p642vh.C18338b0;
import pf0.C27520a;
import pf0.C27522c;
import pf0.C27525e;
import ue0.C28752t;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity */
public final class GTIntroductionActivity extends C23512a {

    /* renamed from: J */
    public static final C23498a f61386J = new C23498a((DefaultConstructorMarker) null);

    /* renamed from: G */
    private final C41217g f61387G = C41219i.m119470b(new C23504g(this));

    /* renamed from: H */
    private final C41217g f61388H = new C1617p0(C41520a0.m120436b(GTIntroductionViewModel$ViewModel.class), new C23508k(this), new C23507j(this), new C23509l((C43064a) null, this));

    /* renamed from: I */
    private final C41217g f61389I = C41219i.m119470b(C23499b.f61390d);

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$a */
    public static final class C23498a {
        private C23498a() {
        }

        public /* synthetic */ C23498a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo60342a(Context context, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, GTIntroductionActivity.class);
            if (bVar != null) {
                bVar.mo404a(intent);
                wVar = C41238w.f97225a;
            } else {
                wVar = null;
            }
            if (wVar == null) {
                context.startActivity(intent);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$b */
    static final class C23499b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C23499b f61390d = new C23499b();

        C23499b() {
            super(0);
        }

        /* renamed from: b */
        public final C27522c invoke() {
            return new C27522c();
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$c */
    static final class C23500c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTIntroductionActivity f61391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23500c(GTIntroductionActivity gTIntroductionActivity) {
            super(1);
            this.f61391d = gTIntroductionActivity;
        }

        /* renamed from: a */
        public final void mo60344a(List list) {
            GTIntroductionActivity gTIntroductionActivity = this.f61391d;
            C41536l.m120488h(list, "it");
            gTIntroductionActivity.m76043Q2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60344a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$d */
    static final class C23501d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTIntroductionActivity f61392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23501d(GTIntroductionActivity gTIntroductionActivity) {
            super(1);
            this.f61392d = gTIntroductionActivity;
        }

        /* renamed from: a */
        public final void mo60345a(StringSource stringSource) {
            Button button = this.f61392d.m76040N2().f73459e;
            C41536l.m120488h(stringSource, "it");
            button.setButtonText(C34646b.m101752f(stringSource, (Context) null, 1, (Object) null));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60345a((StringSource) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$e */
    static final class C23502e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTIntroductionActivity f61393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23502e(GTIntroductionActivity gTIntroductionActivity) {
            super(1);
            this.f61393d = gTIntroductionActivity;
        }

        /* renamed from: a */
        public final void mo60346a(Integer num) {
            GTIntroductionActivity gTIntroductionActivity = this.f61393d;
            C41536l.m120488h(num, "it");
            gTIntroductionActivity.m76044R2(num.intValue());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60346a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$f */
    static final class C23503f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ GTIntroductionActivity f61394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23503f(GTIntroductionActivity gTIntroductionActivity) {
            super(1);
            this.f61394d = gTIntroductionActivity;
        }

        /* renamed from: a */
        public final void mo60347a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f61394d.m76042P2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo60347a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$g */
    static final class C23504g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ GTIntroductionActivity f61395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23504g(GTIntroductionActivity gTIntroductionActivity) {
            super(0);
            this.f61395d = gTIntroductionActivity;
        }

        /* renamed from: b */
        public final C28752t invoke() {
            return C28752t.m88137d(this.f61395d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$h */
    static final class C23505h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f61396a;

        C23505h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f61396a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f61396a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f61396a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$i */
    public static final class C23506i extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ GTIntroductionActivity f61397a;

        C23506i(GTIntroductionActivity gTIntroductionActivity) {
            this.f61397a = gTIntroductionActivity;
        }

        public void onPageSelected(int i) {
            super.onPageSelected(i);
            this.f61397a.m76041O2().mo60357hw().mo60353V8(i);
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$j */
    public static final class C23507j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23507j(ComponentActivity componentActivity) {
            super(0);
            this.f61398d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f61398d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$k */
    public static final class C23508k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f61399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23508k(ComponentActivity componentActivity) {
            super(0);
            this.f61399d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f61399d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.galtandtaggart.presentation.landing.introduction.GTIntroductionActivity$l */
    public static final class C23509l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f61400d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f61401e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23509l(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f61400d = aVar;
            this.f61401e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f61400d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f61401e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: K2 */
    private final void m76037K2() {
        m76040N2().f73459e.setOnClickListener(new C27520a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m76038L2(GTIntroductionActivity gTIntroductionActivity, View view) {
        C41536l.m120489i(gTIntroductionActivity, "this$0");
        gTIntroductionActivity.m76041O2().mo60357hw().mo60361r();
    }

    /* renamed from: M2 */
    private final C27522c m76039M2() {
        return (C27522c) this.f61389I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final C28752t m76040N2() {
        return (C28752t) this.f61387G.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final GTIntroductionViewModel$ViewModel m76041O2() {
        return (GTIntroductionViewModel$ViewModel) this.f61388H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final void m76042P2() {
        setResult(-1);
        finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public final void m76043Q2(List list) {
        m76039M2().mo6029i(list);
        C18338b0.C18341c cVar = new C18338b0.C18341c(0, false, 3, (DefaultConstructorMarker) null);
        ViewPager2 viewPager2 = m76040N2().f73461g;
        C41536l.m120488h(viewPager2, "binding.introductionSlider");
        FrameLayout frameLayout = m76040N2().f73462h;
        C41536l.m120488h(frameLayout, "binding.scrollingIndicator");
        cVar.mo46116a(viewPager2, frameLayout);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public final void m76044R2(int i) {
        m76040N2().f73461g.setCurrentItem(i);
    }

    /* renamed from: S2 */
    private final void m76045S2() {
        m76040N2().f73461g.setAdapter(m76039M2());
        m76040N2().f73461g.mo6603h(new C23506i(this));
        int dimensionPixelSize = getResources().getDimensionPixelSize(C25184d.f64654a);
        ViewPager2 viewPager2 = m76040N2().f73461g;
        C41536l.m120488h(viewPager2, "binding.introductionSlider");
        C32395y.m95667b(viewPager2, dimensionPixelSize, dimensionPixelSize);
    }

    /* renamed from: l1 */
    private final void m76046l1() {
        C27525e iw = m76041O2().mo60358iw();
        iw.mo60352Mv().mo4819k(this, new C23505h(new C23500c(this)));
        iw.mo60354Yq().mo4819k(this, new C23505h(new C23501d(this)));
        iw.mo60362yc().mo4819k(this, new C23505h(new C23502e(this)));
        C37224b.m109963b(iw.mo60351Mr(), this, new C23503f(this));
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m76040N2());
        m76045S2();
        m76046l1();
        m76037K2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C25190j.gt_page_title_landing_page);
        C41536l.m120488h(string, "getString(R.string.gt_page_title_landing_page)");
        return string;
    }
}
