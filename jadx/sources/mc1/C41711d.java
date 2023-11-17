package mc1;

import ah1.C40314b;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import ba1.C10212q;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc1.C41665k;
import nh1.C41806a;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import ua1.C28685u0;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: mc1.d */
public final class C41711d extends Fragment {

    /* renamed from: f */
    public static final C41712a f97976f = new C41712a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28685u0 f97977d;

    /* renamed from: e */
    private final C41217g f97978e = C41219i.m119469a(C41222k.NONE, new C41714c(this, (C41806a) null, (C43064a) null, new C41713b(this), (C43064a) null));

    /* renamed from: mc1.d$a */
    public static final class C41712a {
        private C41712a() {
        }

        public /* synthetic */ C41712a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41711d mo96512a() {
            return new C41711d();
        }
    }

    /* renamed from: mc1.d$b */
    public static final class C41713b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97979d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41713b(Fragment fragment) {
            super(0);
            this.f97979d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            Fragment fragment = this.f97979d;
            return aVar.mo102076a(fragment, fragment);
        }
    }

    /* renamed from: mc1.d$c */
    public static final class C41714c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97980d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97981e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97982f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97983g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97984h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41714c(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97980d = fragment;
            this.f97981e = aVar;
            this.f97982f = aVar2;
            this.f97983g = aVar3;
            this.f97984h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97980d, this.f97981e, this.f97982f, this.f97983g, C41520a0.m120436b(C41665k.class), this.f97984h);
        }
    }

    /* renamed from: i1 */
    private final C28685u0 m120974i1() {
        C28685u0 u0Var = this.f97977d;
        C41536l.m120486f(u0Var);
        return u0Var;
    }

    /* renamed from: j1 */
    private final C41665k m120975j1() {
        return (C41665k) this.f97978e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: k1 */
    public static final void m120976k1(C41711d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        dVar.requireActivity().finish();
    }

    /* renamed from: l1 */
    private final void m120977l1(AppCompatImageView appCompatImageView, LayerView layerView, boolean z) {
        Drawable drawable;
        if (z) {
            appCompatImageView.setVisibility(0);
            Context context = getContext();
            if (context != null) {
                drawable = C0767a.m2895e(context, C10212q.f28273g);
            } else {
                drawable = null;
            }
            layerView.setBackground(drawable);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f97977d = C28685u0.m87857d(layoutInflater);
        ConstraintLayout c = m120974i1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97977d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m120974i1().f73002j.setOnClickListener(new C41710c(this));
        m120974i1().f72999g.setDrawableTint(C10212q.f28272f);
        AppCompatImageView appCompatImageView = m120974i1().f73000h;
        C41536l.m120488h(appCompatImageView, "binding.passcodeCheckImageView");
        LayerView layerView = m120974i1().f73001i;
        C41536l.m120488h(layerView, "binding.passcodeLayerView");
        m120977l1(appCompatImageView, layerView, m120975j1().mo96472nw());
        AppCompatImageView appCompatImageView2 = m120974i1().f72997e;
        C41536l.m120488h(appCompatImageView2, "binding.biometricCheckImageView");
        LayerView layerView2 = m120974i1().f72998f;
        C41536l.m120488h(layerView2, "binding.biometricLayerView");
        m120977l1(appCompatImageView2, layerView2, m120975j1().mo96470lw());
        AppCompatImageView appCompatImageView3 = m120974i1().f73003k;
        C41536l.m120488h(appCompatImageView3, "binding.trustedDeviceCheckImageView");
        LayerView layerView3 = m120974i1().f73004l;
        C41536l.m120488h(layerView3, "binding.trustedDeviceLayerView");
        m120977l1(appCompatImageView3, layerView3, m120975j1().mo96475rw());
    }
}
