package yc1;

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
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.buttonlist.ButtonListView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.sso_client.models.SessionUserInfo;
import qc1.C42253o0;
import ua1.C28625a0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: yc1.c */
public final class C43337c extends Fragment {

    /* renamed from: g */
    public static final C43338a f101156g = new C43338a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28625a0 f101157d;

    /* renamed from: e */
    private final C41217g f101158e = C41219i.m119469a(C41222k.NONE, new C43342e(this, (C41806a) null, (C43064a) null, new C43341d(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f101159f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C43340c(this, (C41806a) null, (C43064a) null));

    /* renamed from: yc1.c$a */
    public static final class C43338a {
        private C43338a() {
        }

        public /* synthetic */ C43338a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C43337c mo102018a() {
            return new C43337c();
        }
    }

    /* renamed from: yc1.c$b */
    static final class C43339b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43337c f101160d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43339b(C43337c cVar) {
            super(0);
            this.f101160d = cVar;
        }

        public final void invoke() {
            this.f101160d.m124354l1().mo97711Cw();
        }
    }

    /* renamed from: yc1.c$c */
    public static final class C43340c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f101161d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101162e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101163f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43340c(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f101161d = componentCallbacks;
            this.f101162e = aVar;
            this.f101163f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f101161d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f101162e, this.f101163f);
        }
    }

    /* renamed from: yc1.c$d */
    public static final class C43341d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101164d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43341d(Fragment fragment) {
            super(0);
            this.f101164d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f101164d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f101164d.requireActivity());
        }
    }

    /* renamed from: yc1.c$e */
    public static final class C43342e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f101165d;

        /* renamed from: e */
        final /* synthetic */ C41806a f101166e;

        /* renamed from: f */
        final /* synthetic */ C43064a f101167f;

        /* renamed from: g */
        final /* synthetic */ C43064a f101168g;

        /* renamed from: h */
        final /* synthetic */ C43064a f101169h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43342e(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f101165d = fragment;
            this.f101166e = aVar;
            this.f101167f = aVar2;
            this.f101168g = aVar3;
            this.f101169h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f101165d, this.f101166e, this.f101167f, this.f101168g, C41520a0.m120436b(C42253o0.class), this.f101169h);
        }
    }

    /* renamed from: k1 */
    private final C10146d0.C10172e m124353k1() {
        return (C10146d0.C10172e) this.f101159f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l1 */
    public final C42253o0 m124354l1() {
        return (C42253o0) this.f101158e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m124355m1(C43337c cVar, SessionUserInfo sessionUserInfo) {
        String str;
        String avatarUrl;
        C41536l.m120489i(cVar, "this$0");
        C28625a0 a0Var = cVar.f101157d;
        if (a0Var == null) {
            C41536l.m120506z("binding");
            a0Var = null;
        }
        ButtonListView buttonListView = a0Var.f72647g;
        if (sessionUserInfo == null || (str = sessionUserInfo.getUsername()) == null) {
            str = "";
        }
        buttonListView.setBottomText(str);
        if (!(sessionUserInfo == null || (avatarUrl = sessionUserInfo.getAvatarUrl()) == null)) {
            C41536l.m120488h(buttonListView, "");
            ButtonListView.m49639n(buttonListView, (Integer) null, (Drawable) null, avatarUrl, 3, (Object) null);
        }
        buttonListView.setOnButtonClicked(new C43339b(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m124356n1(C43337c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.m124354l1().mo97714Ex();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28625a0 d = C28625a0.m87595d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f101157d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ScrollView c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        String a;
        C41536l.m120489i(view, "view");
        C28625a0 a0Var = this.f101157d;
        C28625a0 a0Var2 = null;
        if (a0Var == null) {
            C41536l.m120506z("binding");
            a0Var = null;
        }
        ButtonListView buttonListView = a0Var.f72647g;
        C41536l.m120488h(buttonListView, "");
        ButtonListView.m49639n(buttonListView, (Integer) null, C0767a.m2895e(buttonListView.getContext(), C10214s.f28278a), (String) null, 5, (Object) null);
        m124354l1().mo97721Mw().mo4819k(getViewLifecycleOwner(), new C43335a(this));
        C28625a0 a0Var3 = this.f101157d;
        if (a0Var3 == null) {
            C41536l.m120506z("binding");
            a0Var3 = null;
        }
        PageDescriptionView pageDescriptionView = a0Var3.f72646f;
        C10195g0 g = m124353k1().mo26716g();
        String str = "text.sso.loginServices.username_change_requirements";
        if (!(g == null || (a = g.mo26763a(str, new Object[0])) == null)) {
            str = a;
        }
        pageDescriptionView.setText(str);
        C28625a0 a0Var4 = this.f101157d;
        if (a0Var4 == null) {
            C41536l.m120506z("binding");
        } else {
            a0Var2 = a0Var4;
        }
        a0Var2.f72645e.setOnClickListener(new C43336b(this));
    }
}
