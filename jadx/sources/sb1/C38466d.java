package sb1;

import ah1.C40314b;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1613n0;
import androidx.recyclerview.widget.C1806i;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10146d0;
import ba1.C10195g0;
import ba1.C10214s;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41238w;
import ib1.C36382c1;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import la1.C25871d;
import nh1.C41806a;
import p045d.C5769a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.sso_client.models.C35947l;
import p341ge.bog.sso_client.models.C35965u;
import ua1.C28631c0;
import ua1.C28645h;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43081r;
import wg1.C43241a;
import yg1.C43399a;

/* renamed from: sb1.d */
public final class C38466d extends Fragment {

    /* renamed from: j */
    public static final C38467a f92127j = new C38467a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C28631c0 f92128d;

    /* renamed from: e */
    private final C41217g f92129e = C41219i.m119469a(C41222k.NONE, new C38477g(this, (C41806a) null, (C43064a) null, new C38476f(this), (C43064a) null));

    /* renamed from: f */
    private List f92130f = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C41224m f92131g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public String f92132h = "TURNOVER_FREQUENCY";

    /* renamed from: i */
    private final C41217g f92133i = C41219i.m119469a(C41222k.SYNCHRONIZED, new C38475e(this, (C41806a) null, (C43064a) null));

    /* renamed from: sb1.d$a */
    public static final class C38467a {
        private C38467a() {
        }

        public /* synthetic */ C38467a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ C38466d m112916b(C38467a aVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return aVar.mo92026a(z);
        }

        /* renamed from: a */
        public final C38466d mo92026a(boolean z) {
            return new C38466d(z);
        }
    }

    /* renamed from: sb1.d$b */
    public static final class C38468b {

        /* renamed from: a */
        private final C35965u f92134a;

        /* renamed from: b */
        private C43075l f92135b;

        /* renamed from: sb1.d$b$a */
        static final class C38469a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C38469a f92136d = new C38469a();

            C38469a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo92033a(C38468b bVar) {
                C41536l.m120489i(bVar, "it");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo92033a((C38468b) obj);
                return C41238w.f97225a;
            }
        }

        public C38468b(C35965u uVar, C43075l lVar) {
            C41536l.m120489i(uVar, "item");
            C41536l.m120489i(lVar, "change");
            this.f92134a = uVar;
            this.f92135b = lVar;
        }

        /* renamed from: a */
        public final C43075l mo92027a() {
            return this.f92135b;
        }

        /* renamed from: b */
        public final C35965u mo92028b() {
            return this.f92134a;
        }

        /* renamed from: c */
        public final void mo92029c(C43075l lVar) {
            C41536l.m120489i(lVar, "<set-?>");
            this.f92135b = lVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38468b)) {
                return false;
            }
            C38468b bVar = (C38468b) obj;
            return C41536l.m120484d(this.f92134a, bVar.f92134a) && C41536l.m120484d(this.f92135b, bVar.f92135b);
        }

        public int hashCode() {
            return (this.f92134a.hashCode() * 31) + this.f92135b.hashCode();
        }

        public String toString() {
            return "ItemList(item=" + this.f92134a + ", change=" + this.f92135b + ')';
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C38468b(C35965u uVar, C43075l lVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uVar, (i & 2) != 0 ? C38469a.f92136d : lVar);
        }
    }

    /* renamed from: sb1.d$c */
    static final class C38470c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C38466d f92137d;

        /* renamed from: e */
        final /* synthetic */ List f92138e;

        /* renamed from: sb1.d$c$a */
        static final class C38471a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ C38466d f92139d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38471a(C38466d dVar) {
                super(2);
                this.f92139d = dVar;
            }

            /* renamed from: a */
            public final C28645h invoke(C25871d dVar, ViewGroup viewGroup) {
                C41536l.m120489i(dVar, "$this$onCreate");
                C41536l.m120489i(viewGroup, "parent");
                C28645h d = C28645h.m87685d(this.f92139d.getLayoutInflater(), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …  false\n                )");
                return d;
            }
        }

        /* renamed from: sb1.d$c$b */
        static final class C38472b extends C41537m implements C43081r {

            /* renamed from: d */
            final /* synthetic */ C38466d f92140d;

            /* renamed from: e */
            final /* synthetic */ List f92141e;

            /* renamed from: sb1.d$c$b$a */
            static final class C38473a extends C41537m implements C43075l {

                /* renamed from: d */
                final /* synthetic */ C28645h f92142d;

                /* renamed from: e */
                final /* synthetic */ List f92143e;

                /* renamed from: f */
                final /* synthetic */ C38468b f92144f;

                /* renamed from: g */
                final /* synthetic */ C38466d f92145g;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C38473a(C28645h hVar, List list, C38468b bVar, C38466d dVar) {
                    super(1);
                    this.f92142d = hVar;
                    this.f92143e = list;
                    this.f92144f = bVar;
                    this.f92145g = dVar;
                }

                /* renamed from: a */
                public final void mo92037a(C38468b bVar) {
                    boolean z;
                    C41536l.m120489i(bVar, "newListItem");
                    ListItem c = this.f92142d.mo3946b();
                    if (this.f92143e.indexOf(bVar) == this.f92143e.indexOf(this.f92144f)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c.setVisibleRightItemView(z);
                    C38466d dVar = this.f92145g;
                    dVar.f92131g = new C41224m(dVar.f92132h, String.valueOf(bVar.mo92028b().mo88570a()));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo92037a((C38468b) obj);
                    return C41238w.f97225a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C38472b(C38466d dVar, List list) {
                super(4);
                this.f92140d = dVar;
                this.f92141e = list;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public static final void m112925c(C38466d dVar, List list, C38468b bVar, View view) {
                C41536l.m120489i(dVar, "this$0");
                C41536l.m120489i(list, "$dataList");
                C41536l.m120489i(bVar, "$answer");
                if (dVar.m112909r1().mo89182px().mo4814f() == null || !(dVar.m112909r1().mo89182px().mo4814f() instanceof C35947l.C35950c)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C38468b) it.next()).mo92027a().invoke(bVar);
                    }
                }
            }

            /* renamed from: b */
            public final void mo92036b(C25871d dVar, C28645h hVar, C38468b bVar, int i) {
                String str;
                boolean z;
                C41536l.m120489i(dVar, "$this$onBind");
                C41536l.m120489i(hVar, "layoutBinding");
                C41536l.m120489i(bVar, "answer");
                hVar.mo3946b().setOnClickListener(new C38478e(this.f92140d, this.f92141e, bVar));
                ListItem c = hVar.mo3946b();
                Context requireContext = this.f92140d.requireContext();
                C41536l.m120488h(requireContext, "requireContext()");
                SingleLineTextItem singleLineTextItem = new SingleLineTextItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                C38466d dVar2 = this.f92140d;
                List list = this.f92141e;
                if (!dVar2.m112909r1().mo89181ox().containsKey(dVar2.f92132h)) {
                    ListItem c2 = hVar.mo3946b();
                    if (i == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c2.setVisibleRightItemView(z);
                    dVar2.f92131g = new C41224m(dVar2.f92132h, String.valueOf(((C38468b) list.get(0)).mo92028b().mo88570a()));
                } else {
                    hVar.mo3946b().setVisibleRightItemView(C41536l.m120484d(bVar.mo92028b().mo88570a(), dVar2.m112909r1().mo89181ox().get(dVar2.f92132h)));
                    String k1 = dVar2.f92132h;
                    Object obj = dVar2.m112909r1().mo89181ox().get(dVar2.f92132h);
                    C41536l.m120486f(obj);
                    dVar2.f92131g = new C41224m(k1, obj);
                }
                if (C41536l.m120484d(dVar2.f92132h, "TURNOVER_VOLUME")) {
                    str = bVar.mo92028b().mo88571b() + " ₾";
                } else {
                    str = bVar.mo92028b().mo88571b();
                }
                singleLineTextItem.setText(str);
                singleLineTextItem.setSemibold(true);
                c.setMiddleItemView(singleLineTextItem);
                bVar.mo92029c(new C38473a(hVar, this.f92141e, bVar, this.f92140d));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                mo92036b((C25871d) obj, (C28645h) obj2, (C38468b) obj3, ((Number) obj4).intValue());
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C38470c(C38466d dVar, List list) {
            super(1);
            this.f92137d = dVar;
            this.f92138e = list;
        }

        /* renamed from: a */
        public final void mo92034a(C25871d dVar) {
            C41536l.m120489i(dVar, "$this$setup");
            dVar.mo64666i(new C38471a(this.f92137d));
            dVar.mo64664g(new C38472b(this.f92137d, this.f92138e));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo92034a((C25871d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: sb1.d$d */
    public static final class C38474d implements Comparator {
        public final int compare(Object obj, Object obj2) {
            return C41506d.m120406e(((C38468b) obj).mo92028b().mo88572c(), ((C38468b) obj2).mo92028b().mo88572c());
        }
    }

    /* renamed from: sb1.d$e */
    public static final class C38475e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f92146d;

        /* renamed from: e */
        final /* synthetic */ C41806a f92147e;

        /* renamed from: f */
        final /* synthetic */ C43064a f92148f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38475e(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f92146d = componentCallbacks;
            this.f92147e = aVar;
            this.f92148f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f92146d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f92147e, this.f92148f);
        }
    }

    /* renamed from: sb1.d$f */
    public static final class C38476f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92149d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38476f(Fragment fragment) {
            super(0);
            this.f92149d = fragment;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            C1505h requireActivity = this.f92149d.requireActivity();
            C41536l.m120488h(requireActivity, "requireActivity()");
            return aVar.mo102076a(requireActivity, this.f92149d.requireActivity());
        }
    }

    /* renamed from: sb1.d$g */
    public static final class C38477g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f92150d;

        /* renamed from: e */
        final /* synthetic */ C41806a f92151e;

        /* renamed from: f */
        final /* synthetic */ C43064a f92152f;

        /* renamed from: g */
        final /* synthetic */ C43064a f92153g;

        /* renamed from: h */
        final /* synthetic */ C43064a f92154h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C38477g(Fragment fragment, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f92150d = fragment;
            this.f92151e = aVar;
            this.f92152f = aVar2;
            this.f92153g = aVar3;
            this.f92154h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40314b.m116749a(this.f92150d, this.f92151e, this.f92152f, this.f92153g, C41520a0.m120436b(C36382c1.class), this.f92154h);
        }
    }

    public C38466d(boolean z) {
        if (z) {
            this.f92132h = "TURNOVER_FREQUENCY";
        } else {
            this.f92132h = "TURNOVER_VOLUME";
        }
    }

    /* renamed from: n1 */
    private final C25871d m112906n1(List list) {
        return new C25871d(list).mo64668l(new C38470c(this, list));
    }

    /* renamed from: o1 */
    private final List m112907o1() {
        List list = this.f92130f;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (C41536l.m120484d(((C38468b) next).mo92028b().mo88573d(), this.f92132h)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: p1 */
    private final C28631c0 m112908p1() {
        C28631c0 c0Var = this.f92128d;
        C41536l.m120486f(c0Var);
        return c0Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: r1 */
    public final C36382c1 m112909r1() {
        return (C36382c1) this.f92129e.getValue();
    }

    /* renamed from: s1 */
    private final void m112910s1(List list) {
        RecyclerView recyclerView = m112908p1().f72691g;
        C41536l.m120488h(recyclerView, "binding.recyclerView");
        Drawable b = C5769a.m23210b(recyclerView.getContext(), C10214s.f28277I);
        if (b != null) {
            C41536l.m120488h(b, "requireNotNull(\n        …ivider_1dp)\n            )");
            C1806i iVar = new C1806i(recyclerView.getContext(), 1);
            iVar.mo5985l(b);
            recyclerView.mo5351j(iVar);
            recyclerView.setAdapter(m112906n1(list));
            return;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* renamed from: t1 */
    private final void m112911t1() {
        m112909r1().mo89137Jx().mo4819k(getViewLifecycleOwner(), new C38464b(this));
        m112909r1().mo89182px().mo4819k(getViewLifecycleOwner(), new C38465c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u1 */
    public static final void m112912u1(C38466d dVar, List list) {
        String str;
        String str2;
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120488h(list, "response");
        dVar.f92130f = C41358y.m120030t0(C38479f.m112930a(list), new C38474d());
        PageDescriptionView pageDescriptionView = dVar.m112908p1().f72690f;
        String str3 = null;
        if (C41536l.m120484d(dVar.f92132h, "TURNOVER_FREQUENCY")) {
            C10195g0 g = dVar.mo92025q1().mo26716g();
            if (g != null) {
                str2 = g.mo26763a("text.registration.AML.questionary.turnover.frequency.field.label", new Object[0]);
            } else {
                str2 = null;
            }
            pageDescriptionView.setTitle(str2);
            C10195g0 g2 = dVar.mo92025q1().mo26716g();
            if (g2 != null) {
                str3 = g2.mo26763a("text.registration.AML.questionary.turnover.frequency.field.detail", new Object[0]);
            }
            pageDescriptionView.setText(str3);
        } else {
            C10195g0 g3 = dVar.mo92025q1().mo26716g();
            if (g3 != null) {
                str = g3.mo26763a("text.registration.AML.questionary.turnover.volume.field.label", new Object[0]);
            } else {
                str = null;
            }
            pageDescriptionView.setTitle(str);
            C10195g0 g4 = dVar.mo92025q1().mo26716g();
            if (g4 != null) {
                str3 = g4.mo26763a("text.registration.AML.questionary.turnover.volume.field.detail", new Object[0]);
            }
            pageDescriptionView.setText(str3);
        }
        dVar.m112910s1(dVar.m112907o1());
    }

    /* access modifiers changed from: private */
    /* renamed from: v1 */
    public static final void m112913v1(C38466d dVar, C35947l lVar) {
        C41536l.m120489i(dVar, "this$0");
        boolean z = lVar instanceof C35947l.C35950c;
        dVar.m112908p1().f72689e.setLoading(z);
        dVar.m112908p1().f72689e.setEnabled(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: x1 */
    public static final void m112914x1(C38466d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C41224m mVar = dVar.f92131g;
        if (mVar != null) {
            dVar.m112909r1().mo89163gx(C41536l.m120484d(dVar.f92132h, "TURNOVER_FREQUENCY"), mVar);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f92128d = C28631c0.m87621d(layoutInflater);
        ConstraintLayout c = m112908p1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m112911t1();
        if (C41536l.m120484d(this.f92132h, "TURNOVER_FREQUENCY") && !m112909r1().mo89181ox().containsKey(this.f92132h)) {
            m112909r1().mo89136Ix();
        }
        m112908p1().f72689e.setOnClickListener(new C38463a(this));
    }

    /* renamed from: q1 */
    public final C10146d0.C10172e mo92025q1() {
        return (C10146d0.C10172e) this.f92133i.getValue();
    }
}
