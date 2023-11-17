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
import p836mz.C26315a;
import p836mz.C26316b;
import p836mz.C26317c;
import p836mz.C26318d;
import p836mz.C26319e;
import p836mz.C26332r;
import p90.C27374n3;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a */
public final class C21240a extends Fragment {

    /* renamed from: j */
    public static final C21241a f57029j = new C21241a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C27374n3 f57030d;

    /* renamed from: e */
    private final C41217g f57031e = C1514j0.m5374c(this, C41520a0.m120436b(C26332r.class), new C21246f(this), new C21247g((C43064a) null, this), new C21248h(this));
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f57032f;

    /* renamed from: g */
    private final C41217g f57033g = C41219i.m119470b(C21243c.f57037d);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final Runnable f57034h = new C26315a(this);

    /* renamed from: i */
    private final C21249i f57035i = new C21249i(this);

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$a */
    public static final class C21241a {
        private C21241a() {
        }

        public /* synthetic */ C21241a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C21240a mo53230a() {
            return new C21240a();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$b */
    public static final class C21242b extends AnimatorListenerAdapter {

        /* renamed from: d */
        final /* synthetic */ View f57036d;

        C21242b(View view) {
            this.f57036d = view;
        }

        public void onAnimationEnd(Animator animator) {
            C41536l.m120489i(animator, "animation");
            super.onAnimationEnd(animator);
            this.f57036d.setVisibility(4);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$c */
    static final class C21243c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C21243c f57037d = new C21243c();

        C21243c() {
            super(0);
        }

        /* renamed from: b */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$d */
    static final class C21244d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C21240a f57038d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21244d(C21240a aVar) {
            super(1);
            this.f57038d = aVar;
        }

        /* renamed from: a */
        public final void mo53233a(C41224m mVar) {
            PageDescriptionView pageDescriptionView = this.f57038d.m68832t1().f69376j;
            String c = C32289b0.m95091c((String) mVar.mo95675a());
            C41536l.m120488h(c, "generateImageUrl(logo)");
            pageDescriptionView.setImage(new Image.Url(c, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null));
            this.f57038d.m68832t1().f69376j.setTitle(C32343x.m95388F("text.umts.creditinfo.conf.title", new Object[0]));
            this.f57038d.m68832t1().f69376j.setText(C32343x.m95388F("text.umts.creditinfo.conf.subtitle", new Object[0]));
            this.f57038d.m68832t1().f69373g.setText((String) mVar.mo95676b());
            this.f57038d.f57032f = false;
            this.f57038d.m68833u1().postDelayed(this.f57038d.f57034h, 50);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53233a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$e */
    static final class C21245e implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f57039a;

        C21245e(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f57039a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f57039a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f57039a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$f */
    public static final class C21246f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f57040d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21246f(Fragment fragment) {
            super(0);
            this.f57040d = fragment;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f57040d.requireActivity().getViewModelStore();
            C41536l.m120488h(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$g */
    public static final class C21247g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f57041d;

        /* renamed from: e */
        final /* synthetic */ Fragment f57042e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21247g(C43064a aVar, Fragment fragment) {
            super(0);
            this.f57041d = aVar;
            this.f57042e = fragment;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f57041d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f57042e.requireActivity().getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$h */
    public static final class C21248h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f57043d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21248h(Fragment fragment) {
            super(0);
            this.f57043d = fragment;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f57043d.requireActivity().getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.a$i */
    public static final class C21249i extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ C21240a f57044a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21249i(C21240a aVar) {
            super(5000000, 1);
            this.f57044a = aVar;
        }

        public void onFinish() {
        }

        public void onTick(long j) {
            this.f57044a.m68832t1().f69377k.scrollBy(0, 100);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public static final void m68812A1(C21240a aVar) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m68832t1().f69377k.setScrollY(0);
        ScrollViewExt scrollViewExt = aVar.m68832t1().f69377k;
        C41536l.m120488h(scrollViewExt, "binding.scrollView");
        if (!aVar.m68829q1(scrollViewExt)) {
            aVar.m68819H1();
        } else {
            aVar.m68836y1();
        }
    }

    /* renamed from: B1 */
    private final void m68813B1() {
        m68832t1().f69374h.setOnClickListener(new C26316b(this));
        m68832t1().f69372f.setOnClickListener(new C26317c(this));
        m68832t1().f69371e.setOnClickListener(new C26318d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: C1 */
    public static final void m68814C1(C21240a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m68835x1().mo65504jw().mo65495cj();
        aVar.m68832t1().f69374h.setVisibility(4);
        aVar.m68832t1().f69372f.setVisibility(4);
        C36546y.m108282F().mo27152s("remittance", aVar.m68835x1().mo65507nw().mo53145d(), "remittance_creditinfo_not_agree_click");
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public static final void m68815D1(C21240a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        aVar.m68835x1().mo65504jw().mo65496xl(true);
        C10463g F = C36546y.m108282F();
        String d = aVar.m68835x1().mo65507nw().mo53145d();
        String j = aVar.m68835x1().mo65508ow().mo53172j();
        F.mo27152s("remittance", d + " " + j, "remittance_creditinfo_agree_click");
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public static final void m68816E1(C21240a aVar, View view) {
        C41536l.m120489i(aVar, "this$0");
        if (!aVar.f57032f) {
            aVar.f57035i.start();
        }
    }

    /* renamed from: F1 */
    private final void m68817F1() {
        m68832t1().f69372f.setButtonText(C32343x.m95388F("text.umts.btn.creditinfo.conf", new Object[0]));
        m68832t1().f69374h.setButtonText(C32343x.m95388F("text.umts.btn.creditinfo.deny", new Object[0]));
        m68832t1().f69373g.setVerticalScrollBarEnabled(false);
        m68832t1().f69377k.setScrollViewListener(new C26319e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: G1 */
    public static final void m68818G1(C21240a aVar, ScrollViewExt scrollViewExt, int i, int i2, int i3, int i4) {
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(scrollViewExt, "v");
        if (i2 == scrollViewExt.getChildAt(0).getMeasuredHeight() - scrollViewExt.getMeasuredHeight() && !aVar.f57032f) {
            aVar.m68837z1();
        }
    }

    /* renamed from: H1 */
    private final void m68819H1() {
        LayerView layerView = m68832t1().f69371e;
        C41536l.m120488h(layerView, "binding.arrowContainer");
        m68831s1(this, layerView, false, Utils.FLOAT_EPSILON, 4, (Object) null);
        Button button = m68832t1().f69372f;
        C41536l.m120488h(button, "binding.confirm");
        m68831s1(this, button, false, Utils.FLOAT_EPSILON, 6, (Object) null);
        Button button2 = m68832t1().f69374h;
        C41536l.m120488h(button2, "binding.deny");
        m68831s1(this, button2, false, Utils.FLOAT_EPSILON, 6, (Object) null);
    }

    private final void observeData() {
        m68835x1().mo65505lw().mo65497Df().mo4819k(getViewLifecycleOwner(), new C21245e(new C21244d(this)));
    }

    /* renamed from: q1 */
    private final boolean m68829q1(ScrollView scrollView) {
        View childAt = scrollView.getChildAt(0);
        if (childAt == null) {
            return false;
        }
        if (scrollView.getHeight() < childAt.getHeight() + scrollView.getPaddingTop() + scrollView.getPaddingBottom()) {
            return true;
        }
        return false;
    }

    /* renamed from: r1 */
    private final void m68830r1(View view, boolean z, float f) {
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
                animatorListenerAdapter = m68834v1(view);
            }
            duration.setListener(animatorListenerAdapter);
        }
    }

    /* renamed from: s1 */
    static /* synthetic */ void m68831s1(C21240a aVar, View view, boolean z, float f, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            f = 1.0f;
        }
        aVar.m68830r1(view, z, f);
    }

    /* access modifiers changed from: private */
    /* renamed from: t1 */
    public final C27374n3 m68832t1() {
        C27374n3 n3Var = this.f57030d;
        C41536l.m120486f(n3Var);
        return n3Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public final Handler m68833u1() {
        return (Handler) this.f57033g.getValue();
    }

    /* renamed from: v1 */
    private final AnimatorListenerAdapter m68834v1(View view) {
        return new C21242b(view);
    }

    /* renamed from: x1 */
    private final C26332r m68835x1() {
        return (C26332r) this.f57031e.getValue();
    }

    /* renamed from: y1 */
    private final void m68836y1() {
        m68832t1().f69372f.setVisibility(4);
        m68832t1().f69374h.setVisibility(4);
        LayerView layerView = m68832t1().f69371e;
        C41536l.m120488h(layerView, "binding.arrowContainer");
        m68831s1(this, layerView, false, Utils.FLOAT_EPSILON, 6, (Object) null);
    }

    /* renamed from: z1 */
    private final void m68837z1() {
        this.f57032f = true;
        this.f57035i.cancel();
        m68819H1();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f57030d = C27374n3.m84804d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m68832t1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f57030d = null;
        m68833u1().removeCallbacks(this.f57034h);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m68817F1();
        observeData();
        m68813B1();
    }
}
