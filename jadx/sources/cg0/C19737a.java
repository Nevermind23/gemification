package cg0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32303f;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.ThreeLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p615tg.C17963d;
import p642vh.C18368l;
import rf0.C28005a;
import ue0.C28745p0;
import ue0.C28747q0;
import ue0.C28749r0;
import ue0.C28751s0;
import ue0.C28753t0;
import ue1.C43075l;
import ue1.C43080q;

/* renamed from: cg0.a */
public final class C19737a extends C1819o {

    /* renamed from: f */
    private final C19755e f54092f;

    /* renamed from: cg0.a$a */
    public static abstract class C19738a extends RecyclerView.C1734f0 {

        /* renamed from: cg0.a$a$a */
        public static final class C19739a extends C19738a {

            /* renamed from: d */
            private final C28745p0 f54093d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19739a(C28745p0 p0Var) {
                super(p0Var, (DefaultConstructorMarker) null);
                C41536l.m120489i(p0Var, "binding");
                this.f54093d = p0Var;
            }

            /* renamed from: j */
            private final void m65433j(C28005a.C28015j jVar) {
                C28745p0 p0Var = this.f54093d;
                SingleLineTextItem singleLineTextItem = p0Var.f73409f;
                C41536l.m120488h(singleLineTextItem, "singleLineText");
                TwoLineReverseTextItem twoLineReverseTextItem = p0Var.f73411h;
                C41536l.m120488h(twoLineReverseTextItem, "twoLineText");
                ThreeLineTextItem threeLineTextItem = p0Var.f73410g;
                C41536l.m120488h(threeLineTextItem, "threeLineText");
                for (View i0 : C41341q.m119910m(singleLineTextItem, twoLineReverseTextItem, threeLineTextItem)) {
                    C32343x.m95455i0(i0);
                }
                if (jVar.mo67560d() != null && jVar.mo67557a() != null) {
                    ThreeLineTextItem threeLineTextItem2 = p0Var.f73410g;
                    C41536l.m120488h(threeLineTextItem2, "threeLineText");
                    C32343x.m95447f1(threeLineTextItem2);
                    p0Var.f73410g.setText(C34646b.m101752f(jVar.mo67559c(), (Context) null, 1, (Object) null));
                    p0Var.f73410g.setTitle(C34646b.m101752f(jVar.mo67560d(), (Context) null, 1, (Object) null));
                    p0Var.f73410g.setSubtitle(C34646b.m101752f(jVar.mo67557a(), (Context) null, 1, (Object) null));
                } else if (jVar.mo67560d() == null && jVar.mo67557a() == null) {
                    SingleLineTextItem singleLineTextItem2 = p0Var.f73409f;
                    C41536l.m120488h(singleLineTextItem2, "singleLineText");
                    C32343x.m95447f1(singleLineTextItem2);
                    p0Var.f73409f.setText(C34646b.m101752f(jVar.mo67559c(), (Context) null, 1, (Object) null));
                } else {
                    StringSource d = jVar.mo67560d();
                    if (d != null || (d = jVar.mo67557a()) != null) {
                        TwoLineReverseTextItem twoLineReverseTextItem2 = p0Var.f73411h;
                        C41536l.m120488h(twoLineReverseTextItem2, "twoLineText");
                        C32343x.m95447f1(twoLineReverseTextItem2);
                        p0Var.f73411h.setTitle(C34646b.m101752f(d, (Context) null, 1, (Object) null));
                        p0Var.f73411h.setText(C34646b.m101752f(jVar.mo67559c(), (Context) null, 1, (Object) null));
                    }
                }
            }

            /* renamed from: i */
            public void mo47943h(C28005a.C28015j jVar, C19755e eVar) {
                C41536l.m120489i(jVar, "item");
                C41536l.m120489i(eVar, "onTermsChecked");
                AppCompatImageView appCompatImageView = this.f54093d.f73408e;
                C41536l.m120488h(appCompatImageView, "binding.icon");
                C18368l.m62746A(appCompatImageView, jVar.mo67558b(), (C43075l) null, 2, (Object) null);
                m65433j(jVar);
            }
        }

        /* renamed from: cg0.a$a$b */
        public static final class C19740b extends C19738a {

            /* renamed from: d */
            private final C28749r0 f54094d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19740b(C28749r0 r0Var) {
                super(r0Var, (DefaultConstructorMarker) null);
                C41536l.m120489i(r0Var, "binding");
                this.f54094d = r0Var;
            }
        }

        /* renamed from: cg0.a$a$c */
        public static final class C19741c extends C19738a {

            /* renamed from: d */
            private final C28751s0 f54095d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19741c(C28751s0 s0Var) {
                super(s0Var, (DefaultConstructorMarker) null);
                C41536l.m120489i(s0Var, "binding");
                this.f54095d = s0Var;
            }

            /* renamed from: i */
            public void mo47943h(C28005a.C28009d dVar, C19755e eVar) {
                C41536l.m120489i(dVar, "item");
                C41536l.m120489i(eVar, "onTermsChecked");
                this.f54095d.f73457e.setTitle(C34646b.m101752f(dVar.mo67556a(), (Context) null, 1, (Object) null));
            }
        }

        /* renamed from: cg0.a$a$d */
        public static final class C19742d extends C19738a {

            /* renamed from: d */
            private final C28753t0 f54096d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19742d(C28753t0 t0Var) {
                super(t0Var, (DefaultConstructorMarker) null);
                C41536l.m120489i(t0Var, "binding");
                this.f54096d = t0Var;
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public static final void m65441m(C28005a.C28016k kVar, C28753t0 t0Var) {
                C41536l.m120489i(kVar, "$item");
                C41536l.m120489i(t0Var, "$this_with");
                String f = C34646b.m101752f(kVar.mo67565e(), (Context) null, 1, (Object) null);
                if (!C41536l.m120484d(f, "")) {
                    C32303f.m95184D(f, t0Var.mo3946b().getContext());
                }
            }

            /* access modifiers changed from: private */
            /* renamed from: n */
            public static final void m65442n(C19755e eVar, C28753t0 t0Var, CompoundButton compoundButton, boolean z, boolean z2) {
                C41536l.m120489i(eVar, "$onTermsChecked");
                C41536l.m120489i(t0Var, "$this_with");
                C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
                eVar.mo47954a(z, t0Var.f73466f.isChecked());
            }

            /* access modifiers changed from: private */
            /* renamed from: o */
            public static final void m65443o(C19755e eVar, C28753t0 t0Var, CompoundButton compoundButton, boolean z, boolean z2) {
                C41536l.m120489i(eVar, "$onTermsChecked");
                C41536l.m120489i(t0Var, "$this_with");
                C41536l.m120489i(compoundButton, "<anonymous parameter 0>");
                eVar.mo47954a(t0Var.f73465e.isChecked(), z);
            }

            /* renamed from: l */
            public void mo47943h(C28005a.C28016k kVar, C19755e eVar) {
                C41536l.m120489i(kVar, "item");
                C41536l.m120489i(eVar, "onTermsChecked");
                C28753t0 t0Var = this.f54096d;
                t0Var.f73467g.setText(C34646b.m101752f(kVar.mo67564d(), (Context) null, 1, (Object) null));
                t0Var.f73465e.setText(C34646b.m101752f(kVar.mo67561a(), (Context) null, 1, (Object) null));
                t0Var.f73466f.mo35145g(C34646b.m101752f(kVar.mo67563c(), (Context) null, 1, (Object) null), C34646b.m101752f(kVar.mo67562b(), (Context) null, 1, (Object) null));
                t0Var.f73466f.setTextClickListener(new C19752b(kVar, t0Var));
                t0Var.f73465e.setOnCheckedStateChangeListener(new C19753c(eVar, t0Var));
                t0Var.f73466f.setOnCheckedStateChangeListener(new C19754d(eVar, t0Var));
            }
        }

        /* renamed from: cg0.a$a$e */
        public static final class C19743e extends C19738a {

            /* renamed from: d */
            private final C28747q0 f54097d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C19743e(C28747q0 q0Var) {
                super(q0Var, (DefaultConstructorMarker) null);
                C41536l.m120489i(q0Var, "binding");
                this.f54097d = q0Var;
            }

            /* renamed from: i */
            public void mo47943h(C28005a.C28018m mVar, C19755e eVar) {
                C41536l.m120489i(mVar, "item");
                C41536l.m120489i(eVar, "onTermsChecked");
                this.f54097d.mo3946b().setTitle(C34646b.m101752f(mVar.mo67569a(), (Context) null, 1, (Object) null));
            }
        }

        public /* synthetic */ C19738a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(aVar);
        }

        /* renamed from: h */
        public void mo47943h(C28005a aVar, C19755e eVar) {
            C41536l.m120489i(aVar, "item");
            C41536l.m120489i(eVar, "onTermsChecked");
        }

        private C19738a(C6201a aVar) {
            super(aVar.mo3946b());
        }
    }

    /* renamed from: cg0.a$b */
    private enum C19744b {
        HEADER,
        TITLE,
        FOOTER,
        DETAIL,
        TERMS;
        

        /* renamed from: d */
        public static final C19745a f54098d = null;

        /* renamed from: cg0.a$b$a */
        public static final class C19745a {
            private C19745a() {
            }

            public /* synthetic */ C19745a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C19744b mo47948a(int i) {
                C19744b bVar;
                boolean z;
                C19744b[] values = C19744b.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = values[i2];
                    if (bVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (bVar == null) {
                    return C19744b.FOOTER;
                }
                return bVar;
            }
        }

        static {
            f54098d = new C19745a((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: cg0.a$c */
    public /* synthetic */ class C19746c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54105a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                cg0.a$b[] r0 = cg0.C19737a.C19744b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cg0.a$b r1 = cg0.C19737a.C19744b.HEADER     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cg0.a$b r1 = cg0.C19737a.C19744b.TITLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cg0.a$b r1 = cg0.C19737a.C19744b.FOOTER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                cg0.a$b r1 = cg0.C19737a.C19744b.DETAIL     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                cg0.a$b r1 = cg0.C19737a.C19744b.TERMS     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f54105a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cg0.C19737a.C19746c.<clinit>():void");
        }
    }

    /* renamed from: cg0.a$d */
    /* synthetic */ class C19747d extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19747d f54106d = new C19747d();

        C19747d() {
            super(3, C28751s0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/galtandtaggart/databinding/ItemGtStartInvestingSectionHeaderBinding;", 0);
        }

        /* renamed from: b */
        public final C28751s0 mo47949b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28751s0.m88133d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47949b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cg0.a$e */
    /* synthetic */ class C19748e extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19748e f54107d = new C19748e();

        C19748e() {
            super(3, C28747q0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/galtandtaggart/databinding/ItemGtStartInvestingDetailSectionTitleBinding;", 0);
        }

        /* renamed from: b */
        public final C28747q0 mo47950b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28747q0.m88115d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47950b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cg0.a$f */
    /* synthetic */ class C19749f extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19749f f54108d = new C19749f();

        C19749f() {
            super(3, C28749r0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/galtandtaggart/databinding/ItemGtStartInvestingSectionFooterBinding;", 0);
        }

        /* renamed from: b */
        public final C28749r0 mo47951b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28749r0.m88124d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47951b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cg0.a$g */
    /* synthetic */ class C19750g extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19750g f54109d = new C19750g();

        C19750g() {
            super(3, C28745p0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/galtandtaggart/databinding/ItemGtStartInvestingDetailBinding;", 0);
        }

        /* renamed from: b */
        public final C28745p0 mo47952b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28745p0.m88106d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47952b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cg0.a$h */
    /* synthetic */ class C19751h extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19751h f54110d = new C19751h();

        C19751h() {
            super(3, C28753t0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/galtandtaggart/databinding/ItemGtStartInvestingTermsBinding;", 0);
        }

        /* renamed from: b */
        public final C28753t0 mo47953b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C28753t0.m88142d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47953b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19737a(C19755e eVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(eVar, "onTermsChecked");
        this.f54092f = eVar;
    }

    /* renamed from: m */
    private static final Object m65429m(ViewGroup viewGroup, C43080q qVar) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C41536l.m120488h(from, "from(parent.context)");
        return qVar.invoke(from, viewGroup, Boolean.FALSE);
    }

    public int getItemViewType(int i) {
        C19744b bVar;
        C28005a aVar = (C28005a) mo6027g(i);
        if (aVar instanceof C28005a.C28009d) {
            bVar = C19744b.HEADER;
        } else if (aVar instanceof C28005a.C28018m) {
            bVar = C19744b.TITLE;
        } else if (aVar instanceof C28005a.C28015j) {
            bVar = C19744b.DETAIL;
        } else if (aVar instanceof C28005a.C28016k) {
            bVar = C19744b.TERMS;
        } else if (aVar instanceof C28005a.C28008c) {
            bVar = C19744b.FOOTER;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return bVar.ordinal();
    }

    /* renamed from: k */
    public void onBindViewHolder(C19738a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47943h((C28005a) g, this.f54092f);
    }

    /* renamed from: l */
    public C19738a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        int i2 = C19746c.f54105a[C19744b.f54098d.mo47948a(i).ordinal()];
        if (i2 == 1) {
            Object m = m65429m(viewGroup, C19747d.f54106d);
            C41536l.m120488h(m, "invokeInflater(ItemGtSta…onHeaderBinding::inflate)");
            return new C19738a.C19741c((C28751s0) m);
        } else if (i2 == 2) {
            Object m2 = m65429m(viewGroup, C19748e.f54107d);
            C41536l.m120488h(m2, "invokeInflater(ItemGtSta…ionTitleBinding::inflate)");
            return new C19738a.C19743e((C28747q0) m2);
        } else if (i2 == 3) {
            Object m3 = m65429m(viewGroup, C19749f.f54108d);
            C41536l.m120488h(m3, "invokeInflater(ItemGtSta…onFooterBinding::inflate)");
            return new C19738a.C19740b((C28749r0) m3);
        } else if (i2 == 4) {
            Object m4 = m65429m(viewGroup, C19750g.f54109d);
            C41536l.m120488h(m4, "invokeInflater(ItemGtSta…ngDetailBinding::inflate)");
            return new C19738a.C19739a((C28745p0) m4);
        } else if (i2 == 5) {
            Object m5 = m65429m(viewGroup, C19751h.f54110d);
            C41536l.m120488h(m5, "invokeInflater(ItemGtSta…ingTermsBinding::inflate)");
            return new C19738a.C19742d((C28753t0) m5);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
