package p341ge.bog.mobilebank.releasenotes.presentation;

import a11.C30466a;
import a11.C30467b;
import a11.C30470d;
import a11.C30471e;
import a11.C30473g;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.C0152h;
import androidx.activity.C0160p;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.Gson;
import com.salesforce.marketingcloud.C11398b;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.releasenotes.presentation.model.ReleaseNotes;
import p642vh.C18338b0;
import u01.C39002c;
import ue1.C43064a;
import ue1.C43075l;
import w01.C39499a;

/* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity */
public final class ReleaseNotesActivity extends C35388f2 {

    /* renamed from: J */
    public static final C34437a f83456J = new C34437a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f83457F = C41219i.m119470b(new C34438b(this));

    /* renamed from: G */
    private final C41217g f83458G = new C1617p0(C41520a0.m120436b(ReleaseNotesViewModel$ViewModel.class), new C34448k(this), new C34447j(this), new C34449l((C43064a) null, this));

    /* renamed from: H */
    private final C41217g f83459H = C41219i.m119470b(C34444g.f83467d);

    /* renamed from: I */
    private final C41217g f83460I = C41219i.m119470b(new C34442f(this));

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$a */
    public static final class C34437a {
        private C34437a() {
        }

        public /* synthetic */ C34437a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo83039a(Context context, Bundle bundle) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, ReleaseNotesActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.setFlags(268468224);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$b */
    static final class C34438b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesActivity f83461d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34438b(ReleaseNotesActivity releaseNotesActivity) {
            super(0);
            this.f83461d = releaseNotesActivity;
        }

        /* renamed from: b */
        public final C39499a invoke() {
            return C39499a.m114820d(this.f83461d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$c */
    static final class C34439c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesActivity f83462d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34439c(ReleaseNotesActivity releaseNotesActivity) {
            super(1);
            this.f83462d = releaseNotesActivity;
        }

        /* renamed from: a */
        public final void mo83041a(List list) {
            ReleaseNotesActivity releaseNotesActivity = this.f83462d;
            C41536l.m120488h(list, "features");
            ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C30466a) it.next()).mo70795b());
            }
            releaseNotesActivity.m101287I2(arrayList);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo83041a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$d */
    static final class C34440d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesActivity f83463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34440d(ReleaseNotesActivity releaseNotesActivity) {
            super(1);
            this.f83463d = releaseNotesActivity;
        }

        /* renamed from: a */
        public final void mo83042a(C30466a aVar) {
            C39499a F2 = this.f83463d.m101289K2();
            F2.f93945h.setTitle(aVar.mo70797d());
            F2.f93945h.setText(aVar.mo70794a());
            F2.f93942e.getButton().setButtonText(aVar.mo70796c());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo83042a((C30466a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$e */
    static final class C34441e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesActivity f83464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34441e(ReleaseNotesActivity releaseNotesActivity) {
            super(1);
            this.f83464d = releaseNotesActivity;
        }

        /* renamed from: a */
        public final void mo83043a(C41224m mVar) {
            C39499a F2 = this.f83464d.m101289K2();
            F2.f93947j.setText((String) mVar.mo95676b());
            F2.f93948k.setText((String) mVar.mo95675a());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo83043a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$f */
    static final class C34442f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesActivity f83465d;

        /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$f$a */
        public static final class C34443a extends ViewPager2.C1928i {

            /* renamed from: a */
            final /* synthetic */ ReleaseNotesActivity f83466a;

            C34443a(ReleaseNotesActivity releaseNotesActivity) {
                this.f83466a = releaseNotesActivity;
            }

            public void onPageSelected(int i) {
                super.onPageSelected(i);
                this.f83466a.m101292N2().mo83050iw().mo70809Q(i);
                this.f83466a.m101291M2().notifyItemChanged(i);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34442f(ReleaseNotesActivity releaseNotesActivity) {
            super(0);
            this.f83465d = releaseNotesActivity;
        }

        /* renamed from: b */
        public final C34443a invoke() {
            return new C34443a(this.f83465d);
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$g */
    static final class C34444g extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C34444g f83467d = new C34444g();

        C34444g() {
            super(0);
        }

        /* renamed from: b */
        public final C30467b invoke() {
            return new C30467b();
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$h */
    static final class C34445h implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83468a;

        C34445h(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83468a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83468a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83468a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$i */
    static final class C34446i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ReleaseNotesActivity f83469d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34446i(ReleaseNotesActivity releaseNotesActivity) {
            super(1);
            this.f83469d = releaseNotesActivity;
        }

        /* renamed from: a */
        public final void mo83048a(C0152h hVar) {
            C41536l.m120489i(hVar, "$this$addCallback");
            this.f83469d.m101288J2();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo83048a((C0152h) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$j */
    public static final class C34447j extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83470d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34447j(ComponentActivity componentActivity) {
            super(0);
            this.f83470d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83470d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$k */
    public static final class C34448k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83471d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34448k(ComponentActivity componentActivity) {
            super(0);
            this.f83471d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83471d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity$l */
    public static final class C34449l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83472d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83473e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34449l(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83472d = aVar;
            this.f83473e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83472d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83473e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public final void m101287I2(List list) {
        m101289K2().f93950m.setAdapter(m101291M2());
        m101289K2().f93950m.setOffscreenPageLimit(1);
        C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, list.size(), 0, false, false, 14, (Object) null);
        ViewPager2 viewPager2 = m101289K2().f93950m;
        C41536l.m120488h(viewPager2, "binding.viewPager");
        FrameLayout frameLayout = m101289K2().f93946i;
        C41536l.m120488h(frameLayout, "binding.sliderContainer");
        m101299U2(b.mo46116a(viewPager2, frameLayout), list.size());
        m101291M2().mo70804i(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public final void m101288J2() {
        m101292N2().mo83055nw();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtras(getIntent());
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: K2 */
    public final C39499a m101289K2() {
        return (C39499a) this.f83457F.getValue();
    }

    /* renamed from: L2 */
    private final C34442f.C34443a m101290L2() {
        return (C34442f.C34443a) this.f83460I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: M2 */
    public final C30467b m101291M2() {
        return (C30467b) this.f83459H.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: N2 */
    public final ReleaseNotesViewModel$ViewModel m101292N2() {
        return (ReleaseNotesViewModel$ViewModel) this.f83458G.getValue();
    }

    /* renamed from: O2 */
    private final void m101293O2() {
        C30473g jw = m101292N2().mo83051jw();
        jw.mo70811Ku().mo4819k(this, new C34445h(new C34439c(this)));
        jw.mo70812Z9().mo4819k(this, new C34445h(new C34440d(this)));
        jw.mo70810Cm().mo4819k(this, new C34445h(new C34441e(this)));
    }

    /* renamed from: P2 */
    private final void m101294P2() {
        try {
            InputStream openRawResource = getResources().openRawResource(C39002c.release_notes);
            C41536l.m120488h(openRawResource, "resources.openRawResource(R.raw.release_notes)");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource, "UTF-8"));
            ReleaseNotesViewModel$ViewModel N2 = m101292N2();
            Object j = new Gson().mo18168j(bufferedReader, ReleaseNotes.class);
            C41536l.m120488h(j, "Gson().fromJson(reader, ReleaseNotes::class.java)");
            N2.mo83052kw((ReleaseNotes) j);
        } catch (UnsupportedEncodingException unused) {
        }
    }

    /* renamed from: Q2 */
    private final void m101295Q2() {
        C39499a K2 = m101289K2();
        K2.f93950m.mo6603h(m101290L2());
        K2.f93942e.setOnClickListener(new C30470d(K2, this));
        K2.f93943f.setOnClickListener(new C30471e(this));
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        C41536l.m120488h(onBackPressedDispatcher, "onBackPressedDispatcher");
        C0160p.m420b(onBackPressedDispatcher, (C1619q) null, false, new C34446i(this), 3, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m101296R2(C39499a aVar, ReleaseNotesActivity releaseNotesActivity, View view) {
        C41536l.m120489i(aVar, "$this_with");
        C41536l.m120489i(releaseNotesActivity, "this$0");
        int currentItem = aVar.f93950m.getCurrentItem();
        if (currentItem < releaseNotesActivity.m101291M2().getItemCount() - 1) {
            aVar.f93950m.mo6606l(currentItem + 1, true);
        } else if (currentItem == releaseNotesActivity.m101291M2().getItemCount() - 1) {
            releaseNotesActivity.getOnBackPressedDispatcher().mo345g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m101297S2(ReleaseNotesActivity releaseNotesActivity, View view) {
        C41536l.m120489i(releaseNotesActivity, "this$0");
        releaseNotesActivity.getOnBackPressedDispatcher().mo345g();
    }

    /* renamed from: T2 */
    private final void m101298T2() {
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.getDecorView().setSystemUiVisibility(C11398b.f33141t);
        window.setStatusBarColor(0);
    }

    /* renamed from: U2 */
    private final void m101299U2(C18338b0 b0Var, int i) {
        m101291M2().mo70803h(b0Var);
        m101289K2().f93950m.mo6606l(b0Var.mo46118c().mo46123a(i), false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        setContentView((View) m101289K2().mo3946b());
        super.mo37451O1(bundle);
        m101298T2();
        m101293O2();
        m101295Q2();
        m101294P2();
    }
}
