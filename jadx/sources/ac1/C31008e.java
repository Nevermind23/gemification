package ac1;

import af1.C40303i;
import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.viewpager2.widget.ViewPager2;
import ba1.C10145d;
import ba1.C10146d0;
import gb1.C32395y;
import he1.C41217g;
import he1.C41222k;
import ib1.C36382c1;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import nh1.C41806a;
import p601sg.C17779d;
import p601sg.C17786k;
import p642vh.C18338b0;
import p642vh.C18388y;
import ua1.C28634d0;
import ue1.C43064a;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: ac1.e */
public final class C31008e extends Fragment {

    /* renamed from: j */
    public static final C31009a f77163j = new C31009a((DefaultConstructorMarker) null);

    /* renamed from: k */
    static final /* synthetic */ C40303i[] f77164k = {C41520a0.m120439e(new C41539o(C31008e.class, "slider", "getSlider()Lge/bog/designsystem/components/common/Slider;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C28634d0 f77165d;

    /* renamed from: e */
    private final C41217g f77166e = C41219i.m119469a(C41222k.NONE, new C31015g(this, (C41806a) null, (C43064a) null, new C31014f(this), (C43064a) null));

    /* renamed from: f */
    private final C41217g f77167f = C41219i.m119469a(C41222k.SYNCHRONIZED, new C31012d(this, (C41806a) null, (C43064a) null));

    /* renamed from: g */
    private final C41217g f77168g = C41219i.m119470b(new C31010b(this));
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List f77169h;

    /* renamed from: i */
    private final C41555e f77170i;

    /* renamed from: ac1.e$a */
    public static final class C31009a {
        private C31009a() {
        }

        public /* synthetic */ C31009a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C31008e mo71211a() {
            return new C31008e();
        }
    }

    /* renamed from: ac1.e$b */
    static final class C31010b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C31008e f77171d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C31010b(C31008e eVar) {
            super(0);
            this.f77171d = eVar;
        }

        /* renamed from: b */
        public final C31002b invoke() {
            return new C31002b(this.f77171d.m92357o1().mo26716g());
        }
    }

    /* renamed from: ac1.e$c */
    public static final class C31011c extends C18388y {

        /* renamed from: c */
        final /* synthetic */ C31008e f77172c;

        C31011c(C31008e eVar) {
            this.f77172c = eVar;
        }

        /* renamed from: a */
        public void mo46187a(int i) {
            C18338b0.C18339a b = this.f77172c.m92359q1().mo46117b();
            List m1 = this.f77172c.f77169h;
            if (m1 == null) {
                C41536l.m120506z("infoCards");
                m1 = null;
            }
            b.mo46119a(m1.size(), i);
        }
    }

    /* renamed from: ac1.e$d */
    public static final class C31012d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f77173d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77174e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77175f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31012d(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f77173d = componentCallbacks;
            this.f77174e = aVar;
            this.f77175f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f77173d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f77174e, this.f77175f);
        }
    }

    /* renamed from: ac1.e$e */
    public static final class C31013e extends C41553c {

        /* renamed from: a */
        final /* synthetic */ C31008e f77176a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31013e(Object obj, C31008e eVar) {
            super(obj);
            this.f77176a = eVar;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C18338b0 b0Var = (C18338b0) obj2;
            C18338b0 b0Var2 = (C18338b0) obj;
            this.f77176a.m92358p1().mo71208p(b0Var);
            C28634d0 j1 = this.f77176a.f77165d;
            List list = null;
            if (j1 == null) {
                C41536l.m120506z("binding");
                j1 = null;
            }
            ViewPager2 viewPager2 = j1.f72703i;
            C18338b0.C18347f c = b0Var.mo46118c();
            List m1 = this.f77176a.f77169h;
            if (m1 == null) {
                C41536l.m120506z("infoCards");
            } else {
                list = m1;
            }
            viewPager2.mo6606l(c.mo46123a(list.size()), false);
        }
    }

    /* renamed from: ac1.e$f */
    public static final class C31014f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77177d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31014f(Fragment fragment) {
            super(0);
            this.f77177d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f77177d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f77177d.requireActivity());
        }
    }

    /* renamed from: ac1.e$g */
    public static final class C31015g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f77178d;

        /* renamed from: e */
        final /* synthetic */ C41806a f77179e;

        /* renamed from: f */
        final /* synthetic */ C43064a f77180f;

        /* renamed from: g */
        final /* synthetic */ C43064a f77181g;

        /* renamed from: h */
        final /* synthetic */ C43064a f77182h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31015g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f77178d = fragment;
            this.f77179e = aVar;
            this.f77180f = aVar2;
            this.f77181g = aVar3;
            this.f77182h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f77178d, this.f77179e, this.f77180f, this.f77181g, C41520a0.m120436b(C36382c1.class), this.f77182h);
        }
    }

    public C31008e() {
        C41551a aVar = C41551a.f97718a;
        this.f77170i = new C31013e(C18338b0.C18346e.f51796d, this);
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public final C10146d0.C10172e m92357o1() {
        return (C10146d0.C10172e) this.f77167f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p1 */
    public final C31002b m92358p1() {
        return (C31002b) this.f77168g.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: q1 */
    public final C18338b0 m92359q1() {
        return (C18338b0) this.f77170i.getValue(this, f77164k[0]);
    }

    /* renamed from: r1 */
    private final C36382c1 m92360r1() {
        return (C36382c1) this.f77166e.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: s1 */
    public static final void m92361s1(C31008e eVar, List list) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120488h(list, "result");
        eVar.f77169h = list;
        eVar.m92363u1();
    }

    /* renamed from: t1 */
    private final void m92362t1(C18338b0 b0Var) {
        this.f77170i.setValue(this, f77164k[0], b0Var);
    }

    /* renamed from: u1 */
    private final void m92363u1() {
        C28634d0 d0Var = this.f77165d;
        List list = null;
        if (d0Var == null) {
            C41536l.m120506z("binding");
            d0Var = null;
        }
        d0Var.f72703i.mo6603h(new C31011c(this));
        C18338b0.C18340b bVar = C18338b0.f51787c;
        List list2 = this.f77169h;
        if (list2 == null) {
            C41536l.m120506z("infoCards");
            list2 = null;
        }
        C18338b0 b = C18338b0.C18340b.m62692b(bVar, list2.size(), C17786k.f49830h, false, false, 8, (Object) null);
        C28634d0 d0Var2 = this.f77165d;
        if (d0Var2 == null) {
            C41536l.m120506z("binding");
            d0Var2 = null;
        }
        ViewPager2 viewPager2 = d0Var2.f72703i;
        C41536l.m120488h(viewPager2, "binding.viewPager");
        C28634d0 d0Var3 = this.f77165d;
        if (d0Var3 == null) {
            C41536l.m120506z("binding");
            d0Var3 = null;
        }
        FrameLayout frameLayout = d0Var3.f72702h;
        C41536l.m120488h(frameLayout, "binding.sliderContainer");
        m92362t1(b.mo46116a(viewPager2, frameLayout));
        C28634d0 d0Var4 = this.f77165d;
        if (d0Var4 == null) {
            C41536l.m120506z("binding");
            d0Var4 = null;
        }
        d0Var4.f72699e.setOnClickListener(new C31007d(this));
        C31002b p1 = m92358p1();
        List list3 = this.f77169h;
        if (list3 == null) {
            C41536l.m120506z("infoCards");
        } else {
            list = list3;
        }
        p1.mo71207o(list);
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m92364v1(C31008e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        C28634d0 d0Var = eVar.f77165d;
        C28634d0 d0Var2 = null;
        if (d0Var == null) {
            C41536l.m120506z("binding");
            d0Var = null;
        }
        int currentItem = d0Var.f72703i.getCurrentItem();
        List list = eVar.f77169h;
        if (list == null) {
            C41536l.m120506z("infoCards");
            list = null;
        }
        if (currentItem < list.size() - 1) {
            C28634d0 d0Var3 = eVar.f77165d;
            if (d0Var3 == null) {
                C41536l.m120506z("binding");
                d0Var3 = null;
            }
            ViewPager2 viewPager2 = d0Var3.f72703i;
            C18338b0.C18347f c = eVar.m92359q1().mo46118c();
            List list2 = eVar.f77169h;
            if (list2 == null) {
                C41536l.m120506z("infoCards");
                list2 = null;
            }
            int size = list2.size();
            C28634d0 d0Var4 = eVar.f77165d;
            if (d0Var4 == null) {
                C41536l.m120506z("binding");
            } else {
                d0Var2 = d0Var4;
            }
            viewPager2.mo6606l(c.mo46124b(size, d0Var2.f72703i.getCurrentItem() + 1), true);
            return;
        }
        eVar.m92360r1().mo89139Lx();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C28634d0 d = C28634d0.m87634d(layoutInflater);
        C41536l.m120488h(d, "inflate(inflater)");
        this.f77165d = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onResume() {
        super.onResume();
        m92363u1();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        C28634d0 d0Var = this.f77165d;
        if (d0Var == null) {
            C41536l.m120506z("binding");
            d0Var = null;
        }
        ViewPager2 viewPager2 = d0Var.f72703i;
        viewPager2.setAdapter(m92358p1());
        C41536l.m120488h(viewPager2, "");
        Resources resources = viewPager2.getResources();
        int i = C17779d.f49646T1;
        C32395y.m95667b(viewPager2, resources.getDimensionPixelSize(i), viewPager2.getResources().getDimensionPixelSize(i));
        m92360r1().mo89203xx().mo4819k(getViewLifecycleOwner(), new C31006c(this));
        C1505h activity = getActivity();
        if (activity != null) {
            C41536l.m120488h(activity, "activity");
            C10145d.m37091e(activity, view);
        }
    }
}
