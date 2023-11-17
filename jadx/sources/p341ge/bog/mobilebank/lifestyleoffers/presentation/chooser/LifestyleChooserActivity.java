package p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.LinearLayoutManager;
import b41.C31128a;
import eo0.C12785b;
import eo0.C12787c;
import eo0.C12788d;
import eo0.C12789e;
import eo0.C12790f;
import eo0.C12791g;
import eo0.C12792h;
import eo0.C12793i;
import eo0.C12794j;
import fo0.C12941d;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m21.C37205b;
import m41.C37223a;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.shared.chooser.presentation.model.ChooserConfig;
import p366bk.C10318g;
import ue1.C43064a;
import ue1.C43075l;
import xn0.C18844b;

/* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity */
public final class LifestyleChooserActivity extends C14988a {

    /* renamed from: J */
    public static final C14960a f43144J = new C14960a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C18844b f43145G;

    /* renamed from: H */
    private final C41217g f43146H = new C1617p0(C41520a0.m120436b(LifestyleChooserViewModel$ViewModel.class), new C14970k(this), new C14969j(this), new C14971l((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C12941d f43147I = new C12941d();

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$a */
    public static final class C14960a {
        private C14960a() {
        }

        public /* synthetic */ C14960a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m54871b(C14960a aVar, Context context, C0173b bVar, int i, Object obj) {
            if ((i & 2) != 0) {
                bVar = null;
            }
            aVar.mo41896a(context, bVar);
        }

        /* renamed from: a */
        public final void mo41896a(Context context, C0173b bVar) {
            C41238w wVar;
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, LifestyleChooserActivity.class);
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

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$b */
    static final class C14961b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43148d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14961b(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43148d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41897a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f43148d.m54856W2(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f43148d.m54856W2(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f43148d.m54856W2(false);
                C18844b M2 = this.f43148d.f43145G;
                if (M2 == null) {
                    C41536l.m120506z("binding");
                    M2 = null;
                }
                CardView cardView = M2.f52671n;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f43148d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41897a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$c */
    static final class C14962c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14962c(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43149d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41898a(C31128a aVar) {
            C18844b bVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C18844b M2 = this.f43149d.f43145G;
                if (M2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    bVar = M2;
                }
                FrameLayout frameLayout = bVar.f52668k;
                C41536l.m120488h(frameLayout, "binding.progressBar");
                C32343x.m95447f1(frameLayout);
            } else if (aVar instanceof C31128a.C31131c) {
                C18844b M22 = this.f43149d.f43145G;
                if (M22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    bVar = M22;
                }
                FrameLayout frameLayout2 = bVar.f52668k;
                C41536l.m120488h(frameLayout2, "binding.progressBar");
                C32343x.m95455i0(frameLayout2);
                this.f43149d.setResult(-1);
            } else if (aVar instanceof C31128a.C31129a) {
                C18844b M23 = this.f43149d.f43145G;
                if (M23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    bVar = M23;
                }
                FrameLayout frameLayout3 = bVar.f52668k;
                C41536l.m120488h(frameLayout3, "binding.progressBar");
                C32343x.m95455i0(frameLayout3);
                this.f43149d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41898a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$d */
    static final class C14963d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43150d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14963d(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43150d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41899a(List list) {
            this.f43150d.f43147I.mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41899a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$e */
    static final class C14964e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43151d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14964e(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43151d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41900a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                this.f43151d.m54864e3((String) mVar.mo95678e(), (List) mVar.mo95680f());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41900a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$f */
    static final class C14965f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43152d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14965f(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43152d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41901a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f43152d.m54865f3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41901a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$g */
    static final class C14966g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43153d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14966g(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43153d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41902a(Integer num) {
            C41524c0 c0Var = C41524c0.f97701a;
            int i = 0;
            String format = String.format("%s / %s", Arrays.copyOf(new Object[]{String.valueOf(num), 3}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
            C18844b M2 = this.f43153d.f43145G;
            C18844b bVar = null;
            if (M2 == null) {
                C41536l.m120506z("binding");
                M2 = null;
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(C0767a.m2893c(M2.mo3946b().getContext(), C10318g.color_invert_component_tr_100));
            if (format.length() > 1) {
                i = 1;
            }
            spannableStringBuilder.setSpan(foregroundColorSpan, i, format.length(), 33);
            C18844b M22 = this.f43153d.f43145G;
            if (M22 == null) {
                C41536l.m120506z("binding");
            } else {
                bVar = M22;
            }
            bVar.f52662e.setText(spannableStringBuilder);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41902a((Integer) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$h */
    static final class C14967h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ LifestyleChooserActivity f43154d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14967h(LifestyleChooserActivity lifestyleChooserActivity) {
            super(1);
            this.f43154d = lifestyleChooserActivity;
        }

        /* renamed from: a */
        public final void mo41903a(C37223a aVar) {
            if (((C41238w) aVar.mo90296a()) != null) {
                this.f43154d.m54868i3();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo41903a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$i */
    static final class C14968i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f43155a;

        C14968i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f43155a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f43155a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f43155a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$j */
    public static final class C14969j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43156d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14969j(ComponentActivity componentActivity) {
            super(0);
            this.f43156d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f43156d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$k */
    public static final class C14970k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f43157d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14970k(ComponentActivity componentActivity) {
            super(0);
            this.f43157d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f43157d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity$l */
    public static final class C14971l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f43158d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f43159e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14971l(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f43158d = aVar;
            this.f43159e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f43158d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f43159e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: S2 */
    private final LifestyleChooserViewModel$ViewModel m54852S2() {
        return (LifestyleChooserViewModel$ViewModel) this.f43146H.getValue();
    }

    /* renamed from: T2 */
    private final void m54853T2() {
        C18844b bVar = this.f43145G;
        if (bVar == null) {
            C41536l.m120506z("binding");
            bVar = null;
        }
        bVar.f52669l.setLayoutManager(new LinearLayoutManager(this));
        bVar.f52669l.setAdapter(this.f43147I);
    }

    /* renamed from: U2 */
    private final void m54854U2() {
        Intent flags = new Intent(this, MainActivity.class).setAction("ACTION_OPEN_LIFESTYLE_OFFERS_TAB").setFlags(872415232);
        C41536l.m120488h(flags, "Intent(this, MainActivit…_SINGLE_TOP\n            )");
        startActivity(flags);
    }

    /* renamed from: V2 */
    private final void m54855V2() {
        m54852S2().mo41914Rw().mo33456Zq().mo4819k(this, new C14968i(new C14961b(this)));
        m54852S2().mo41914Rw().mo33458vk().mo4819k(this, new C14968i(new C14962c(this)));
        m54852S2().mo41914Rw().mo33453L3().mo4819k(this, new C14968i(new C14963d(this)));
        m54852S2().mo41914Rw().mo33455Y9().mo4819k(this, new C14968i(new C14964e(this)));
        m54852S2().mo41914Rw().mo33454Rj().mo4819k(this, new C14968i(new C14965f(this)));
        m54852S2().mo41906Hw().mo4819k(this, new C14968i(new C14966g(this)));
        m54852S2().mo41914Rw().mo33457vf().mo4819k(this, new C14968i(new C14967h(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final void m54856W2(boolean z) {
        C18844b bVar = this.f43145G;
        if (bVar == null) {
            C41536l.m120506z("binding");
            bVar = null;
        }
        CardView cardView = bVar.f52671n;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        C18844b bVar2 = this.f43145G;
        if (bVar2 == null) {
            C41536l.m120506z("binding");
            bVar2 = null;
        }
        FrameLayout frameLayout = bVar2.f52666i;
        C41536l.m120488h(frameLayout, "binding.loadingView");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: X2 */
    private final void m54857X2() {
        C18844b bVar = this.f43145G;
        if (bVar == null) {
            C41536l.m120506z("binding");
            bVar = null;
        }
        bVar.f52667j.setText(C32343x.m95388F("life.style.chooser.main.page.explanatory.1", new Object[0]));
        bVar.f52664g.setText(C32343x.m95388F("life.style.chooser.counter.text", new Object[0]));
        bVar.f52671n.setOnClickListener(new C12787c(this));
        this.f43147I.mo33713n(new C12788d(this));
        this.f43147I.mo33715p(new C12789e(this));
        this.f43147I.mo33714o(new C12790f(this));
        getSupportFragmentManager().mo4367F1("CHOOSER_REQUEST_KEY", this, new C12791g(this));
        getSupportFragmentManager().mo4367F1("OPEN_OFFERS_REQUEST_KEY", this, new C12792h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: Y2 */
    public static final void m54858Y2(LifestyleChooserActivity lifestyleChooserActivity, View view) {
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C21481a.onRefresh$default(lifestyleChooserActivity.m54852S2(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public static final void m54859Z2(LifestyleChooserActivity lifestyleChooserActivity, String str) {
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C41536l.m120489i(str, "interestType");
        lifestyleChooserActivity.m54852S2().mo41907Jw().mo33452y6(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m54860a3(LifestyleChooserActivity lifestyleChooserActivity, String str) {
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C41536l.m120489i(str, "interestType");
        lifestyleChooserActivity.m54852S2().mo41907Jw().mo33451Xl(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public static final void m54861b3(LifestyleChooserActivity lifestyleChooserActivity, String str) {
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C41536l.m120489i(str, "interestType");
        lifestyleChooserActivity.m54852S2().mo41907Jw().mo33450Mu(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m54862c3(LifestyleChooserActivity lifestyleChooserActivity, String str, Bundle bundle) {
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "b");
        List parcelableArrayList = bundle.getParcelableArrayList("CHOOSER_RESULT_KEY");
        LifestyleChooserViewModel$ViewModel S2 = lifestyleChooserActivity.m54852S2();
        if (parcelableArrayList == null) {
            parcelableArrayList = C41341q.m119907j();
        }
        S2.mo41915Tw(parcelableArrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public static final void m54863d3(LifestyleChooserActivity lifestyleChooserActivity, String str, Bundle bundle) {
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "<anonymous parameter 1>");
        lifestyleChooserActivity.m54854U2();
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final void m54864e3(String str, List list) {
        C37205b.f89617E.mo90271a(new ChooserConfig(str, false, (String) null, 0, false, true, 1, (Integer) null, C32343x.m95388F("life.style.chooser.select.category.action.sheet.button", new Object[0]), "CHOOSER_REQUEST_KEY", (C43075l) null, list, 1182, (DefaultConstructorMarker) null)).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final void m54865f3() {
        C13310d dVar = new C13310d();
        dVar.mo35647a2(C13310d.C13312b.TITLE_CLOSE_TWO_BUTTON);
        dVar.mo35648c2(C32343x.m95388F("life.style.chooser.delete.pop.up.header", new Object[0]));
        dVar.mo35639Q1(C32343x.m95388F("life.style.chooser.delete.pop.up.main.text", new Object[0]));
        dVar.mo35646Z1(C32343x.m95388F("life.style.chooser.delete.pop.up.primary.button", new Object[0]));
        dVar.mo35642U1(C32343x.m95388F("life.style.chooser.delete.pop.up.secondary.button", new Object[0]));
        dVar.mo35645Y1(new C12793i(dVar, this));
        dVar.mo35641T1(new C12794j(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public static final void m54866g3(C13310d dVar, LifestyleChooserActivity lifestyleChooserActivity, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(lifestyleChooserActivity, "this$0");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
        lifestyleChooserActivity.m54852S2().mo41907Jw().mo33449Fg();
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m54867h3(C13310d dVar, Button button) {
        C41536l.m120489i(dVar, "$this_apply");
        C41536l.m120489i(button, "it");
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m54868i3() {
        new C12785b().mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C18844b d = C18844b.m63740d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f43145G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m54853T2();
        m54857X2();
        m54855V2();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("life.style.chooser.main.page.header", new Object[0]);
    }
}
