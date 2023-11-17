package tc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import ba1.C10220y;
import he1.C41217g;
import he1.C41222k;
import ia1.C15587a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p420fh.C12902d;
import p420fh.C12910e;
import qc1.C42253o0;
import ua1.C28657l;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: tc1.e */
public final class C42930e extends Fragment {

    /* renamed from: d */
    private C28657l f100199d;

    /* renamed from: e */
    private final C41217g f100200e = C41219i.m119469a(C41222k.NONE, new C42934d(this, (C41806a) null, (C43064a) null, new C42933c(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f100201f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C42932b(this, (C41806a) null, (C43064a) null));

    /* renamed from: tc1.e$a */
    static final class C42931a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C42930e f100202d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42931a(C42930e eVar) {
            super(0);
            this.f100202d = eVar;
        }

        public final void invoke() {
            this.f100202d.m123274p1().mo97711Cw();
        }
    }

    /* renamed from: tc1.e$b */
    public static final class C42932b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f100203d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100204e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100205f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42932b(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f100203d = componentCallbacks;
            this.f100204e = aVar;
            this.f100205f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f100203d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f100204e, this.f100205f);
        }
    }

    /* renamed from: tc1.e$c */
    public static final class C42933c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100206d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42933c(Fragment fragment) {
            super(0);
            this.f100206d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f100206d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f100206d.requireActivity());
        }
    }

    /* renamed from: tc1.e$d */
    public static final class C42934d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f100207d;

        /* renamed from: e */
        final /* synthetic */ C41806a f100208e;

        /* renamed from: f */
        final /* synthetic */ C43064a f100209f;

        /* renamed from: g */
        final /* synthetic */ C43064a f100210g;

        /* renamed from: h */
        final /* synthetic */ C43064a f100211h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42934d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f100207d = fragment;
            this.f100208e = aVar;
            this.f100209f = aVar2;
            this.f100210g = aVar3;
            this.f100211h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f100207d, this.f100208e, this.f100209f, this.f100210g, C41520a0.m120436b(C42253o0.class), this.f100211h);
        }
    }

    /* renamed from: tc1.e$e */
    public static final class C42935e implements C15587a.C15588a {

        /* renamed from: a */
        final /* synthetic */ C42930e f100212a;

        C42935e(C42930e eVar) {
            this.f100212a = eVar;
        }

        /* renamed from: b */
        public void mo42846b() {
            this.f100212a.m123279u1();
        }

        /* renamed from: c */
        public void mo42847c(Throwable th, Integer num) {
            boolean z;
            C10195g0 g;
            String a;
            C41536l.m120489i(th, "throwable");
            this.f100212a.m123279u1();
            if (this.f100212a.getActivity() != null) {
                String a2 = C15587a.f44276a.mo42843a(num);
                if (a2 == null || C40439w.m117118v(a2)) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "Biometric Auth Failed";
                if (!(z || (g = this.f100212a.m123273o1().mo26716g()) == null || (a = g.mo26763a(a2, new Object[0])) == null)) {
                    str = a;
                }
                C1505h requireActivity = this.f100212a.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        /* renamed from: d */
        public void mo42848d() {
            String str;
            String a;
            this.f100212a.m123279u1();
            this.f100212a.m123279u1();
            if (this.f100212a.getActivity() != null) {
                String string = this.f100212a.getString(C10220y.security_settings_biometrics_not_enabled_info_feedback);
                C41536l.m120488h(string, "getString(R.string.secur…ot_enabled_info_feedback)");
                C10195g0 g = this.f100212a.m123273o1().mo26716g();
                if (g == null || (a = g.mo26763a("error.andr.biomet.error_no_biometrics", new Object[0])) == null) {
                    str = string;
                } else {
                    str = a;
                }
                C1505h requireActivity = this.f100212a.requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
            }
        }

        public void onSuccess() {
            this.f100212a.m123279u1();
            this.f100212a.m123274p1().mo97733Zw();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final C10146d0.C10172e m123273o1() {
        return (C10146d0.C10172e) this.f100201f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C42253o0 m123274p1() {
        return (C42253o0) this.f100200e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public static final void m123275q1(C42930e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m123280v1(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public static final void m123276r1(C42930e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m123274p1().mo97736ix();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m123277s1(C42930e eVar, SessionUserInfo sessionUserInfo) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m123274p1().mo97721Mw().mo4819k(eVar.getViewLifecycleOwner(), new C42929d(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public static final void m123278t1(C42930e eVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(eVar, "this$0");
        C28657l lVar = eVar.f100199d;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        ButtonListView buttonListView = lVar.f72806l;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C42931a(eVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final void m123279u1() {
        C28657l lVar = this.f100199d;
        C28657l lVar2 = null;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        lVar.f72807m.setVisibility(0);
        C28657l lVar3 = this.f100199d;
        if (lVar3 == null) {
            C41536l.m120506z("binding");
            lVar3 = null;
        }
        lVar3.f72801g.setVisibility(0);
        C28657l lVar4 = this.f100199d;
        if (lVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            lVar2 = lVar4;
        }
        lVar2.f72802h.setVisibility(0);
    }

    /* renamed from: v1 */
    private final void m123280v1(boolean z) {
        if (m123274p1().mo97731Yw()) {
            C15587a.f44276a.mo42845c(this, new C42935e(this));
        } else if (z) {
            m123279u1();
            if (getActivity() != null) {
                C12902d.C12903a aVar = C12902d.f38098b;
                C1505h requireActivity = requireActivity();
                C41536l.m120488h(requireActivity, "requireActivity()");
                C12902d.m48765o(C12902d.C12903a.m48771e(aVar, requireActivity, false, 2, (Object) null), "Biometric authentication not enabled", (C12902d.C12905b) null, 2, (Object) null);
            }
        } else {
            m123279u1();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28657l d = C28657l.m87737d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f100199d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C28657l lVar = this.f100199d;
        C28657l lVar2 = null;
        if (lVar == null) {
            C41536l.m120506z("binding");
            lVar = null;
        }
        lVar.f72807m.setOnClickListener(new C42926a(this));
        C28657l lVar3 = this.f100199d;
        if (lVar3 == null) {
            C41536l.m120506z("binding");
            lVar3 = null;
        }
        lVar3.f72801g.setOnClickListener(new C42927b(this));
        C28657l lVar4 = this.f100199d;
        if (lVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            lVar2 = lVar4;
        }
        ButtonListView buttonListView = lVar2.f72806l;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        m123274p1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C42928c(this));
        m123280v1(false);
    }
}
