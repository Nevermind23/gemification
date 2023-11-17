package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import iu0.C36546y;
import java.util.Map;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.p975ui.components.ripplepulse.ScrollViewExt;
import p380ck.C10463g;
import p836mz.C26320f;
import p836mz.C26321g;
import p836mz.C26322h;
import p836mz.C26323i;
import p836mz.C26332r;
import p90.C27383o3;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b */
public final class C21250b extends Fragment {

    /* renamed from: j */
    public static final C21251a f57045j = new C21251a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C27383o3 f57046d;

    /* renamed from: e */
    private final C41217g f57047e = C1514j0.m5374c(this, C41520a0.m120436b(C26332r.class), new C21256f(this), new C21257g((C43064a) null, this), new C21258h(this));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f57048f;

    /* renamed from: g */
    private final C41217g f57049g = C41219i.m119470b(C21253c.f57053d);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Runnable f57050h = new C26323i(this);

    /* renamed from: i */
    private final C21259i f57051i = new C21259i(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$a */
    public static final class C21251a {
        private C21251a() {
        }

        public /* synthetic */ C21251a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C21250b mo53238a() {
            return new C21250b();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$b */
    public static final class C21252b extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ View f57052d;

        C21252b(View view) {
            this.f57052d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            super.onAnimationEnd(animator);
            this.f57052d.setVisibility(4);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$c */
    static final class C21253c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C21253c f57053d = new C21253c();

        C21253c() {
            super(0);
        }

        /* renamed from: b */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$d */
    static final class C21254d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C21250b f57054d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21254d(C21250b bVar) {
            super(1);
            this.f57054d = bVar;
        }

        /* renamed from: a */
        public final void mo53241a(C41224m mVar) {
            PageDescriptionView pageDescriptionView = this.f57054d.m68858s1().f69460h;
            String c = C32289b0.m95091c((String) mVar.mo95675a());
            C41536l.m120488h(c, "generateImageUrl(logo)");
            pageDescriptionView.setImage(new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
            this.f57054d.m68858s1().f69460h.setTitle(C32343x.m95388F("text.umts.creditinfo.deny.title", new Object[0]));
            this.f57054d.m68858s1().f69458f.setText((String) mVar.mo95676b());
            this.f57054d.f57048f = false;
            this.f57054d.m68859t1().postDelayed(this.f57054d.f57050h, 50);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53241a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$e */
    static final class C21255e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57055a;

        C21255e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57055a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57055a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57055a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$f */
    public static final class C21256f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f57056d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21256f(Fragment fragment) {
            super(0);
            this.f57056d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57056d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$g */
    public static final class C21257g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57057d;

        /* renamed from: e */
        final /* synthetic */ Fragment f57058e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21257g(C43064a aVar, Fragment fragment) {
            super(0);
            this.f57057d = aVar;
            this.f57058e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57057d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57058e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$h */
    public static final class C21258h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f57059d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21258h(Fragment fragment) {
            super(0);
            this.f57059d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57059d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.b$i */
    public static final class C21259i extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C21250b f57060a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21259i(C21250b bVar) {
            super(5000000, 1);
            this.f57060a = bVar;
        }

        public void onFinish() {
        }

        public void onTick(long j) {
            this.f57060a.m68858s1().f69462j.scrollBy(0, 100);
        }
    }

    /* renamed from: A1 */
    private final void m68841A1() {
        m68858s1().f69461i.setOnClickListener(new C26320f(this));
        m68858s1().f69457e.setOnClickListener(new C26321g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: B1 */
    public static final void m68842B1(C21250b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m68861v1().mo65504jw().mo65496xl(false);
        C10463g F = C36546y.m108282F();
        String d = bVar.m68861v1().mo65507nw().mo53145d();
        String j = bVar.m68861v1().mo65508ow().mo53172j();
        F.mo27152s("remittance", d + " " + j, "remittance_creditinfo_not_agree_final");
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m68843C1(C21250b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        if (!bVar.f57048f) {
            bVar.f57051i.start();
        }
    }

    /* renamed from: D1 */
    private final void m68844D1() {
        m68858s1().f69458f.setVerticalScrollBarEnabled(false);
        m68858s1().f69462j.setScrollViewListener(new C26322h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m68845E1(C21250b bVar, ScrollViewExt scrollViewExt, int i, int i2, int i3, int i4) {
        C41536l.m120489i(bVar, "this$0");
        C41536l.m120489i(scrollViewExt, "v");
        if (i2 == scrollViewExt.getChildAt(0).getMeasuredHeight() - scrollViewExt.getMeasuredHeight() && !bVar.f57048f) {
            bVar.m68863y1();
        }
    }

    /* renamed from: F1 */
    private final void m68846F1() {
        LayerView layerView = m68858s1().f69457e;
        C41536l.m120488h(layerView, "binding.arrowContainer");
        m68857r1(this, layerView, false, Utils.FLOAT_EPSILON, 4, (Object) null);
        Button button = m68858s1().f69461i;
        C41536l.m120488h(button, "binding.receiveRemittance");
        m68857r1(this, button, false, Utils.FLOAT_EPSILON, 6, (Object) null);
    }

    private final void observeData() {
        m68861v1().mo65505lw().mo65499Ll().mo4819k(getViewLifecycleOwner(), new C21255e(new C21254d(this)));
    }

    /* renamed from: p1 */
    private final boolean m68855p1(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (scrollView.getHeight() < childAt.getHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: q1 */
    private final void m68856q1(View view, boolean z, float f) {
        AnimatorListenerAdapter animatorListenerAdapter;
        if (z && view.getVisibility() == 0) {
            return;
        }
        if (z || view.getVisibility() == 0) {
            if (z) {
                view.setAlpha(Utils.FLOAT_EPSILON);
                view.setVisibility(0);
            }
            ViewPropertyAnimator animate = view.animate();
            if (!z) {
                f = 0.0f;
            }
            ViewPropertyAnimator duration = animate.alpha(f).setDuration((long) (((double) view.getResources().getInteger(17694722)) * 1.5d));
            if (z) {
                animatorListenerAdapter = null;
            } else {
                animatorListenerAdapter = m68860u1(view);
            }
            duration.setListener(animatorListenerAdapter);
        }
    }

    /* renamed from: r1 */
    static /* synthetic */ void m68857r1(C21250b bVar, View view, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        bVar.m68856q1(view, z, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public final C27383o3 m68858s1() {
        C27383o3 o3Var = this.f57046d;
        C41536l.m120486f(o3Var);
        return o3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final Handler m68859t1() {
        return (Handler) this.f57049g.getValue();
    }

    /* renamed from: u1 */
    private final AnimatorListenerAdapter m68860u1(View view) {
        return new C21252b(view);
    }

    /* renamed from: v1 */
    private final C26332r m68861v1() {
        return (C26332r) this.f57047e.getValue();
    }

    /* renamed from: x1 */
    private final void m68862x1() {
        m68858s1().f69461i.setVisibility(4);
        LayerView layerView = m68858s1().f69457e;
        C41536l.m120488h(layerView, "binding.arrowContainer");
        m68857r1(this, layerView, false, Utils.FLOAT_EPSILON, 6, (Object) null);
    }

    /* renamed from: y1 */
    private final void m68863y1() {
        this.f57048f = true;
        this.f57051i.cancel();
        m68846F1();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public static final void m68864z1(C21250b bVar) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m68858s1().f69462j.setScrollY(0);
        ScrollViewExt scrollViewExt = bVar.m68858s1().f69462j;
        C41536l.m120488h(scrollViewExt, "binding.scrollView");
        if (!bVar.m68855p1(scrollViewExt)) {
            bVar.m68846F1();
        } else {
            bVar.m68862x1();
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f57046d = C27383o3.m84837d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m68858s1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f57046d = null;
        m68859t1().removeCallbacks(this.f57050h);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m68844D1();
        observeData();
        m68841A1();
    }
}
