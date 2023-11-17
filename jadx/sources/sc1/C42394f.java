package sc1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
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
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p149l.C6856b;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.SessionUserInfo;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.tmx_profiling.TMXFlags;
import p420fh.C12902d;
import p420fh.C12910e;
import qc1.C42253o0;
import ua1.C28654k;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: sc1.f */
public final class C42394f extends Fragment {

    /* renamed from: g */
    public static final C42395a f99665g = new C42395a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28654k f99666d;

    /* renamed from: e */
    private final C41217g f99667e = C41219i.m119469a(C41222k.NONE, new C42398d(this, (C41806a) null, (C43064a) null, new C42397c(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f99668f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C42396b(this, (C41806a) null, (C43064a) null));

    /* renamed from: sc1.f$a */
    public static final class C42395a {
        private C42395a() {
        }

        public /* synthetic */ C42395a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C42394f mo97867a() {
            return new C42394f();
        }
    }

    /* renamed from: sc1.f$b */
    public static final class C42396b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f99669d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99670e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99671f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42396b(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f99669d = componentCallbacks;
            this.f99670e = aVar;
            this.f99671f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f99669d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f99670e, this.f99671f);
        }
    }

    /* renamed from: sc1.f$c */
    public static final class C42397c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f99672d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42397c(Fragment fragment) {
            super(0);
            this.f99672d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f99672d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f99672d.requireActivity());
        }
    }

    /* renamed from: sc1.f$d */
    public static final class C42398d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f99673d;

        /* renamed from: e */
        final /* synthetic */ C41806a f99674e;

        /* renamed from: f */
        final /* synthetic */ C43064a f99675f;

        /* renamed from: g */
        final /* synthetic */ C43064a f99676g;

        /* renamed from: h */
        final /* synthetic */ C43064a f99677h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42398d(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f99673d = fragment;
            this.f99674e = aVar;
            this.f99675f = aVar2;
            this.f99676g = aVar3;
            this.f99677h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f99673d, this.f99674e, this.f99675f, this.f99676g, C41520a0.m120436b(C42253o0.class), this.f99677h);
        }
    }

    /* renamed from: m1 */
    private final void m122956m1() {
        m122960q1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C42389a(this));
        m122960q1().mo97716Gw().mo4819k(getViewLifecycleOwner(), new C42390b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m122957n1(C42394f fVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(fVar, "this$0");
        C28654k kVar = fVar.f99666d;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        ButtonListView buttonListView = kVar.f72789i;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (sessionUserInfo != null && (avatarUrl = sessionUserInfo.getAvatarUrl()) != null) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m122958o1(C42394f fVar, C35947l lVar) {
        C41536l.m120489i(fVar, "this$0");
        if (lVar instanceof C35947l.C35951d) {
            fVar.m122962s1(false);
            C1505h requireActivity = fVar.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            String string = fVar.getString(C10220y.sign_in_activate_channel_success_text);
            C41536l.m120488h(string, "getString(R.string.sign_…ate_channel_success_text)");
            C12910e.m48797o(requireActivity, string, (C12902d.C12905b) null, false, 6, (Object) null);
            fVar.m122960q1().mo97746wx();
        } else if (lVar instanceof C35947l.C35949b) {
            fVar.m122962s1(false);
            C41536l.m120488h(lVar, "result");
            fVar.m122961r1((C35947l.C35949b) lVar);
        } else if (lVar instanceof C35947l.C35950c) {
            fVar.m122962s1(true);
        }
    }

    /* renamed from: p1 */
    private final C10146d0.C10172e m122959p1() {
        return (C10146d0.C10172e) this.f99668f.getValue();
    }

    /* renamed from: q1 */
    private final C42253o0 m122960q1() {
        return (C42253o0) this.f99667e.getValue();
    }

    /* renamed from: r1 */
    private final void m122961r1(C35947l.C35949b bVar) {
        ApiException apiException;
        Throwable a = bVar.mo88517a();
        String str = null;
        if (a instanceof ApiException) {
            apiException = (ApiException) a;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            str = apiException.getErrorMessage();
        }
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        if (str == null) {
            str = getString(C10220y.common_text_service_error);
            C41536l.m120488h(str, "getString(R.string.common_text_service_error)");
        }
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: s1 */
    private final void m122962s1(boolean z) {
        C28654k kVar = this.f99666d;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        kVar.f72785e.setLoading(z);
    }

    /* renamed from: t1 */
    private final void m122963t1() {
        C28654k kVar = this.f99666d;
        C28654k kVar2 = null;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        ButtonListView buttonListView = kVar.f72789i;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        C28654k kVar3 = this.f99666d;
        if (kVar3 == null) {
            C41536l.m120506z("binding");
            kVar3 = null;
        }
        CheckboxView checkboxView = kVar3.f72786f;
        String string = getString(C10220y.sign_in_activate_channel_checkbox_leading_text);
        C41536l.m120488h(string, "getString(R.string.sign_…el_checkbox_leading_text)");
        checkboxView.mo35145g(string, getString(C10220y.sign_in_activate_channel_checkbox_clickable_text));
        checkboxView.setTextClickListener(new C42391c(this));
        checkboxView.setOnCheckedChangeListener(new C42392d(this));
        C28654k kVar4 = this.f99666d;
        if (kVar4 == null) {
            C41536l.m120506z("binding");
        } else {
            kVar2 = kVar4;
        }
        Button button = kVar2.f72785e;
        button.setEnabled(false);
        button.setOnClickListener(new C42393e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m122964u1(C42394f fVar) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m122967y1();
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m122965v1(C42394f fVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(fVar, "this$0");
        C28654k kVar = fVar.f99666d;
        if (kVar == null) {
            C41536l.m120506z("binding");
            kVar = null;
        }
        kVar.f72785e.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m122966x1(C42394f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        fVar.m122960q1().mo97749zw();
    }

    /* renamed from: y1 */
    private final void m122967y1() {
        String a;
        C10195g0 g = m122959p1().mo26716g();
        if (g != null && (a = g.mo26763a("link.terms.channel.activation", new Object[0])) != null) {
            C6856b a2 = new C6856b.C6857a().mo20931a();
            C41536l.m120488h(a2, "Builder().build()");
            try {
                a2.mo20930a(requireContext(), Uri.parse(a));
            } catch (Exception unused) {
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28654k d = C28654k.m87723d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f99666d = d;
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
        m122960q1().mo97710Bx(TMXFlags.TMX_FLAG_ACTIVATE_CHANNEL_KEY);
        m122963t1();
        m122956m1();
    }
}
