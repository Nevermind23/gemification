package kc1;

import ah1.C40314b;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10214s;
import he1.C41217g;
import he1.C41222k;
import ic1.C41286h;
import kc1.C41471f;
import kc1.C41482m;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.designsystem.components.list.C13364a;
import ua1.C28681t;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: kc1.e */
public final class C41467e extends Fragment implements C41471f.C41472a {

    /* renamed from: g */
    public static final C41468a f97608g = new C41468a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28681t f97609d;

    /* renamed from: e */
    private C41471f f97610e = new C41471f();

    /* renamed from: f */
    private final C41217g f97611f = C41219i.m119469a(C41222k.NONE, new C41470c(this, (C41806a) null, (C43064a) null, new C41469b(this), (C43064a) null));

    /* renamed from: kc1.e$a */
    public static final class C41468a {
        private C41468a() {
        }

        public /* synthetic */ C41468a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C41467e mo96232a() {
            return new C41467e();
        }
    }

    /* renamed from: kc1.e$b */
    public static final class C41469b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97612d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41469b(Fragment fragment) {
            super(0);
            this.f97612d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f97612d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f97612d.requireActivity());
        }
    }

    /* renamed from: kc1.e$c */
    public static final class C41470c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f97613d;

        /* renamed from: e */
        final /* synthetic */ C41806a f97614e;

        /* renamed from: f */
        final /* synthetic */ C43064a f97615f;

        /* renamed from: g */
        final /* synthetic */ C43064a f97616g;

        /* renamed from: h */
        final /* synthetic */ C43064a f97617h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41470c(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f97613d = fragment;
            this.f97614e = aVar;
            this.f97615f = aVar2;
            this.f97616g = aVar3;
            this.f97617h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f97613d, this.f97614e, this.f97615f, this.f97616g, C41520a0.m120436b(C41286h.class), this.f97617h);
        }
    }

    /* renamed from: k1 */
    private final C28681t m120304k1() {
        C28681t tVar = this.f97609d;
        C41536l.m120486f(tVar);
        return tVar;
    }

    /* renamed from: l1 */
    private final C41286h m120305l1() {
        return (C41286h) this.f97611f.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m120306m1(C41467e eVar, View view, View view2) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(view, "$view");
        C1493e0 p = eVar.requireActivity().getSupportFragmentManager().mo4428p();
        ViewParent parent = ((ViewGroup) view).getParent();
        if (parent != null) {
            p.mo4640s(((View) parent).getId(), C41482m.C41483a.m120355b(C41482m.f97637m, (String) null, 1, (Object) null), (String) null).mo4515i();
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m120307n1(C41467e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.f97610e.mo96236k(eVar.m120304k1().f72939i.isChecked());
    }

    /* access modifiers changed from: private */
    /* renamed from: o1 */
    public static final void m120308o1(C41467e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        int i = 0;
        int i2 = 0;
        for (Object next : eVar.f97610e.mo96237l()) {
            int i3 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            if (((Boolean) next).booleanValue()) {
                eVar.m120305l1().mo95766vw().remove(i - i2);
                i2++;
            }
            i = i3;
        }
        eVar.f97610e.mo96235j(eVar.m120305l1().mo95766vw());
        eVar.f97610e.notifyDataSetChanged();
    }

    /* renamed from: U */
    public void mo96231U() {
        m120304k1().f72939i.setChecked(false);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f97609d = C28681t.m87840d(layoutInflater, viewGroup, false);
        CoordinatorLayout c = m120304k1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f97609d = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        this.f97610e.mo96238m(this);
        this.f97610e.mo96235j(m120305l1().mo95766vw());
        RecyclerView recyclerView = m120304k1().f72938h;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.f97610e);
        Drawable e = C0767a.m2895e(recyclerView.getContext(), C10214s.f28277I);
        if (e != null) {
            recyclerView.mo5351j(new C13364a(e, true, false));
            m120304k1().f72937g.setOnClickListener(new C41464b(this, view));
            m120304k1().f72939i.setOnClickListener(new C41465c(this));
            m120304k1().f72936f.setOnClickListener(new C41466d(this));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
