package s11;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import f11.C31907a;
import g91.C32316l;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import iu0.C36546y;
import j11.C36693a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m11.C37196a;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.rest.model.DarkModeType;
import p341ge.bog.mobilebank.settings.presentation.viewmodel.DarkModeSwitchViewModel$ViewModel;
import p380ck.C10463g;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;
import w11.C39506f;

/* renamed from: s11.d */
public final class C38406d extends C38417f {

    /* renamed from: M */
    public static final C38407a f91990M = new C38407a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C36693a f91991K;

    /* renamed from: L */
    private final C41217g f91992L;

    /* renamed from: s11.d$a */
    public static final class C38407a {
        private C38407a() {
        }

        public /* synthetic */ C38407a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C38406d mo91940a() {
            return new C38406d();
        }
    }

    /* renamed from: s11.d$b */
    /* synthetic */ class C38408b extends C41535k implements C43075l {
        C38408b(Object obj) {
            super(1, obj, C38406d.class, "chooseDarkModeType", "chooseDarkModeType(Lge/bog/mobilebank/rest/model/DarkModeType;)V", 0);
        }

        /* renamed from: b */
        public final void mo91941b(DarkModeType darkModeType) {
            C41536l.m120489i(darkModeType, "p0");
            ((C38406d) this.receiver).m112801o2(darkModeType);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91941b((DarkModeType) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: s11.d$c */
    /* synthetic */ class C38409c extends C41535k implements C43075l {
        C38409c(Object obj) {
            super(1, obj, C38406d.class, "onConfigurationChange", "onConfigurationChange(Z)V", 0);
        }

        /* renamed from: b */
        public final void mo91942b(boolean z) {
            ((C38406d) this.receiver).m112804r2(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo91942b(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: s11.d$d */
    static final class C38410d implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f91993a;

        C38410d(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f91993a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f91993a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f91993a.invoke(obj);
        }
    }

    /* renamed from: s11.d$e */
    public static final class C38411e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f91994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38411e(Fragment fragment) {
            super(0);
            this.f91994d = fragment;
        }

        public final Fragment invoke() {
            return this.f91994d;
        }
    }

    /* renamed from: s11.d$f */
    public static final class C38412f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f91995d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38412f(C43064a aVar) {
            super(0);
            this.f91995d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f91995d.invoke();
        }
    }

    /* renamed from: s11.d$g */
    public static final class C38413g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f91996d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38413g(C41217g gVar) {
            super(0);
            this.f91996d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f91996d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: s11.d$h */
    public static final class C38414h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f91997d;

        /* renamed from: e */
        final /* synthetic */ C41217g f91998e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38414h(C43064a aVar, C41217g gVar) {
            super(0);
            this.f91997d = aVar;
            this.f91998e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f91997d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f91998e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: s11.d$i */
    public static final class C38415i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f91999d;

        /* renamed from: e */
        final /* synthetic */ C41217g f92000e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38415i(Fragment fragment, C41217g gVar) {
            super(0);
            this.f91999d = fragment;
            this.f92000e = gVar;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b bVar;
            C1638u0 a = C1514j0.m5375d(this.f92000e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            if (iVar == null || (bVar = iVar.getDefaultViewModelProviderFactory()) == null) {
                bVar = this.f91999d.getDefaultViewModelProviderFactory();
            }
            C41536l.m120488h(bVar, "(owner as? HasDefaultVie…tViewModelProviderFactory");
            return bVar;
        }
    }

    public C38406d() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new C38412f(new C38411e(this)));
        this.f91992L = C1514j0.m5374c(this, C41520a0.m120436b(DarkModeSwitchViewModel$ViewModel.class), new C38413g(a), new C38414h((C43064a) null, a), new C38415i(this, a));
    }

    /* renamed from: j2 */
    private final void m112796j2() {
        m112802p2().f88526g.mo3946b().setOnClickListener(new C38403a(this));
        m112802p2().f88527h.mo3946b().setOnClickListener(new C38404b(this));
        m112802p2().f88528i.mo3946b().setOnClickListener(new C38405c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m112797k2(C38406d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m112803q2().mo84137dw().mo84135Ag(DarkModeType.DARK);
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public static final void m112798l2(C38406d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m112803q2().mo84137dw().mo84135Ag(DarkModeType.NONE);
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final void m112799m2(C38406d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.m112803q2().mo84137dw().mo84135Ag(DarkModeType.AUTO);
    }

    /* renamed from: n2 */
    private final void m112800n2() {
        C39506f ew = m112803q2().mo84138ew();
        ew.mo84139mn().mo4819k(getViewLifecycleOwner(), new C38410d(new C38408b(this)));
        LiveData R = ew.mo84136R();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(R, viewLifecycleOwner, new C38409c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final void m112801o2(DarkModeType darkModeType) {
        boolean z;
        boolean z2;
        RadioButton radioButton = m112802p2().f88527h.f88580h;
        boolean z3 = true;
        if (darkModeType == DarkModeType.NONE) {
            z = true;
        } else {
            z = false;
        }
        radioButton.setChecked(z);
        RadioButton radioButton2 = m112802p2().f88526g.f88580h;
        if (darkModeType == DarkModeType.DARK) {
            z2 = true;
        } else {
            z2 = false;
        }
        radioButton2.setChecked(z2);
        RadioButton radioButton3 = m112802p2().f88528i.f88580h;
        if (darkModeType != DarkModeType.AUTO) {
            z3 = false;
        }
        radioButton3.setChecked(z3);
    }

    /* renamed from: p2 */
    private final C36693a m112802p2() {
        C36693a aVar = this.f91991K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: q2 */
    private final DarkModeSwitchViewModel$ViewModel m112803q2() {
        return (DarkModeSwitchViewModel$ViewModel) this.f91992L.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public final void m112804r2(boolean z) {
    }

    /* renamed from: s2 */
    private final void m112805s2() {
        mo26370a2(C32343x.m95388F("theme.switcher.actionsheet.title", new Object[0]));
        AppCompatImageView appCompatImageView = m112802p2().f88526g.f88577e;
        C41536l.m120488h(appCompatImageView, "binding.modeDark.darkModeCardImage");
        C18368l.m62746A(appCompatImageView, new Image.Attribute(C31907a.img_mode_dark, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        AppCompatImageView appCompatImageView2 = m112802p2().f88527h.f88577e;
        C41536l.m120488h(appCompatImageView2, "binding.modeLight.darkModeCardImage");
        C18368l.m62746A(appCompatImageView2, new Image.Attribute(C31907a.img_mode_light, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        AppCompatImageView appCompatImageView3 = m112802p2().f88528i.f88577e;
        C41536l.m120488h(appCompatImageView3, "binding.modeSystemDefault.darkModeCardImage");
        C18368l.m62746A(appCompatImageView3, new Image.Attribute(C31907a.img_mode_system_default, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        m112802p2().f88527h.f88579g.setText(C32343x.m95388F("theme.switcher.actionsheet.radiobutton.light", new Object[0]));
        m112802p2().f88526g.f88579g.setText(C32343x.m95388F("theme.switcher.actionsheet.radiobutton.dark", new Object[0]));
        m112802p2().f88528i.f88579g.setText(C32343x.m95388F("theme.switcher.actionsheet.radiobutton.system", new Object[0]));
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f91991K = C36693a.m108817d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f91991K = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        super.onDismiss(dialogInterface);
        C1533o.m5445b(this, "REQUEST_KEY_DARK_MODE_ACTION_SHEET", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_DARK_MODE_DISMISSED", Boolean.TRUE)));
    }

    public void onStart() {
        super.onStart();
        C37196a.C37201e eVar = C37196a.C37201e.f89611d;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        C32316l.m95278a(eVar, F);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m112805s2();
        m112796j2();
        m112800n2();
    }
}
