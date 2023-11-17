package p341ge.bog.mobilebank.settings.presentation.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.C0238h;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32335t0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41238w;
import j11.C36694b;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import n41.C37353c;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.radiobutton.RadioButtonView;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p341ge.bog.mobilebank.settings.presentation.viewmodel.ChangeLanguageViewModel$ViewModel;
import p366bk.C10318g;
import p366bk.C10328q;
import t11.C38620a;
import t11.C38621b;
import t11.C38622c;
import t11.C38623d;
import t11.C38624e;
import ue1.C43064a;
import ue1.C43075l;
import w11.C39502b;

/* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity */
public final class ChangeLanguageActivity extends C34609a {

    /* renamed from: J */
    public static final C34575a f83571J = new C34575a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public PreferencesApiManager f83572G;

    /* renamed from: H */
    private final C41217g f83573H = C41219i.m119470b(new C34578d(this));

    /* renamed from: I */
    private final C41217g f83574I = new C1617p0(C41520a0.m120436b(ChangeLanguageViewModel$ViewModel.class), new C34581g(this), new C34580f(this), new C34582h((C43064a) null, this));

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$a */
    public static final class C34575a {
        private C34575a() {
        }

        public /* synthetic */ C34575a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo84099a(Context context) {
            C41536l.m120489i(context, "context");
            context.startActivity(new Intent(context, ChangeLanguageActivity.class));
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$b */
    /* synthetic */ class C34576b extends C41535k implements C43075l {
        C34576b(Object obj) {
            super(1, obj, ChangeLanguageActivity.class, "selectLocale", "selectLocale(Lge/bog/mobilebank/shared2/locale/MBankLocale;)V", 0);
        }

        /* renamed from: b */
        public final void mo84100b(C37353c cVar) {
            C41536l.m120489i(cVar, "p0");
            ((ChangeLanguageActivity) this.receiver).m101486O2(cVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84100b((C37353c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$c */
    static final class C34577c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ChangeLanguageActivity f83575d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34577c(ChangeLanguageActivity changeLanguageActivity) {
            super(1);
            this.f83575d = changeLanguageActivity;
        }

        /* renamed from: a */
        public final void mo84101a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            C35388f2.m105060c2(this.f83575d, false, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo84101a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$d */
    static final class C34578d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ChangeLanguageActivity f83576d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C34578d(ChangeLanguageActivity changeLanguageActivity) {
            super(0);
            this.f83576d = changeLanguageActivity;
        }

        /* renamed from: b */
        public final C36694b invoke() {
            C36694b d = C36694b.m108821d(this.f83576d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$e */
    static final class C34579e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f83577a;

        C34579e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f83577a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f83577a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f83577a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$f */
    public static final class C34580f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34580f(ComponentActivity componentActivity) {
            super(0);
            this.f83578d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f83578d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$g */
    public static final class C34581g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f83579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34581g(ComponentActivity componentActivity) {
            super(0);
            this.f83579d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f83579d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity$h */
    public static final class C34582h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f83580d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f83581e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C34582h(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f83580d = aVar;
            this.f83581e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f83580d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f83581e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: K2 */
    private final void m101483K2(DarkModeType darkModeType) {
        boolean z;
        boolean z2;
        RadioButtonView radioButtonView = m101484L2().f88534i;
        boolean z3 = true;
        if (darkModeType == DarkModeType.DARK) {
            z = true;
        } else {
            z = false;
        }
        radioButtonView.setChecked(z);
        RadioButtonView radioButtonView2 = m101484L2().f88531f;
        if (darkModeType == DarkModeType.AUTO) {
            z2 = true;
        } else {
            z2 = false;
        }
        radioButtonView2.setChecked(z2);
        RadioButtonView radioButtonView3 = m101484L2().f88536k;
        if (darkModeType != DarkModeType.NONE) {
            z3 = false;
        }
        radioButtonView3.setChecked(z3);
    }

    /* renamed from: L2 */
    private final C36694b m101484L2() {
        return (C36694b) this.f83573H.getValue();
    }

    /* renamed from: N2 */
    private final ChangeLanguageViewModel$ViewModel m101485N2() {
        return (ChangeLanguageViewModel$ViewModel) this.f83574I.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final void m101486O2(C37353c cVar) {
        if (cVar == C37353c.EN) {
            m101484L2().f88542q.setTextColorInt(C0767a.m2893c(this, C10318g.f28630R0));
            m101484L2().f88539n.setVisibility(8);
            m101484L2().f88538m.setVisibility(0);
            m101484L2().f88540o.setTextColorInt(C32335t0.m95358c(this));
            return;
        }
        m101484L2().f88540o.setTextColorInt(C0767a.m2893c(this, C10318g.f28630R0));
        m101484L2().f88538m.setVisibility(8);
        m101484L2().f88539n.setVisibility(0);
        m101484L2().f88542q.setTextColorInt(C32335t0.m95358c(this));
    }

    /* renamed from: P2 */
    private final void m101487P2(DarkModeType darkModeType) {
        mo84098M2().setDarkModeType(darkModeType);
        C0238h.m789O(darkModeType.getValue());
        m101483K2(darkModeType);
    }

    /* renamed from: Q2 */
    private final void m101488Q2() {
        m101484L2().f88543r.setOnClickListener(new C38620a(this));
        m101484L2().f88541p.setOnClickListener(new C38621b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public static final void m101489R2(ChangeLanguageActivity changeLanguageActivity, View view) {
        C41536l.m120489i(changeLanguageActivity, "this$0");
        changeLanguageActivity.m101485N2().mo84134ew(C37353c.KA);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public static final void m101490S2(ChangeLanguageActivity changeLanguageActivity, View view) {
        C41536l.m120489i(changeLanguageActivity, "this$0");
        changeLanguageActivity.m101485N2().mo84134ew(C37353c.EN);
    }

    /* renamed from: T2 */
    private final void m101491T2() {
        LayerView layerView = m101484L2().f88532g;
        C41536l.m120488h(layerView, "binding.darkModeContainer");
        C32343x.m95483r1(layerView, false, false, 2, (Object) null);
        DarkModeType darkModeType = mo84098M2().getDarkModeType();
        C41536l.m120488h(darkModeType, "preferencesApiManager.darkModeType");
        m101483K2(darkModeType);
        m101484L2().f88533h.setOnClickListener(new C38622c(this));
        m101484L2().f88530e.setOnClickListener(new C38623d(this));
        m101484L2().f88535j.setOnClickListener(new C38624e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public static final void m101492U2(ChangeLanguageActivity changeLanguageActivity, View view) {
        C41536l.m120489i(changeLanguageActivity, "this$0");
        changeLanguageActivity.m101487P2(DarkModeType.DARK);
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public static final void m101493V2(ChangeLanguageActivity changeLanguageActivity, View view) {
        C41536l.m120489i(changeLanguageActivity, "this$0");
        changeLanguageActivity.m101487P2(DarkModeType.AUTO);
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public static final void m101494W2(ChangeLanguageActivity changeLanguageActivity, View view) {
        C41536l.m120489i(changeLanguageActivity, "this$0");
        changeLanguageActivity.m101487P2(DarkModeType.NONE);
    }

    /* renamed from: l1 */
    private final void m101495l1() {
        C39502b dw = m101485N2().mo84133dw();
        dw.mo84131Aq().mo4819k(this, new C34579e(new C34576b(this)));
        C37224b.m109963b(dw.mo84132R(), this, new C34577c(this));
    }

    /* renamed from: M2 */
    public final PreferencesApiManager mo84098M2() {
        PreferencesApiManager preferencesApiManager = this.f83572G;
        if (preferencesApiManager != null) {
            return preferencesApiManager;
        }
        C41536l.m120506z("preferencesApiManager");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m101484L2());
        m101488Q2();
        m101491T2();
        m101495l1();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.header_text_change_language);
        C41536l.m120488h(string, "getString(R.string.header_text_change_language)");
        return string;
    }
}
