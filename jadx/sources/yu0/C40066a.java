package yu0;

import android.support.p013v4.media.session.C0125b;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import d20.C19874l;
import g20.C20592a0;
import h20.C24851a;
import i20.C25106f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.textimagecard.TextImageCardView;
import p548oj.C17202a;
import pu0.C38021b;
import pu0.C38022c;
import pu0.C38023d;
import ue1.C43080q;

/* renamed from: yu0.a */
public final class C40066a extends C19874l {

    /* renamed from: g */
    private final C24851a f95237g;

    /* renamed from: yu0.a$a */
    private static final class C40067a extends C20592a0 {

        /* renamed from: f */
        private final C38021b f95238f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40067a(C38021b bVar) {
            super(bVar);
            C41536l.m120489i(bVar, "binding");
            this.f95238f = bVar;
        }

        /* renamed from: r */
        public void mo49136l(C25106f.C25107a aVar, C17202a aVar2) {
            C41536l.m120489i(aVar, "item");
            C41536l.m120489i(aVar2, "dismissListener");
            TextImageCardView c = this.f95238f.mo3946b();
            c.setDismissButtonVisible(aVar.mo63603j());
            c.setOnDismissCardListener(aVar2);
            c.setDescription(aVar.mo63599g());
            c.setImage(aVar.mo63602i());
            c.setText(aVar.mo63600h());
            c.setCaption(aVar.mo63598f());
        }
    }

    /* renamed from: yu0.a$b */
    private static final class C40068b extends C20592a0 {

        /* renamed from: f */
        private final C38022c f95239f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40068b(C38022c cVar) {
            super(cVar);
            C41536l.m120489i(cVar, "binding");
            this.f95239f = cVar;
        }

        /* renamed from: r */
        public void mo49136l(C25106f.C25108b bVar, C17202a aVar) {
            C41536l.m120489i(bVar, "item");
            C41536l.m120489i(aVar, "dismissListener");
            TextImageCardView c = this.f95239f.mo3946b();
            c.setDismissButtonVisible(bVar.mo63612j());
            c.setOnDismissCardListener(aVar);
            c.setDescription(bVar.mo63607f());
            c.setImage(bVar.mo63609h());
            c.setText(bVar.mo63608g());
        }
    }

    /* renamed from: yu0.a$c */
    private static final class C40069c extends C20592a0 {

        /* renamed from: f */
        private final C38023d f95240f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C40069c(C38023d dVar) {
            super(dVar);
            C41536l.m120489i(dVar, "binding");
            this.f95240f = dVar;
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ void mo49136l(C25106f fVar, C17202a aVar) {
            C0125b.m366a(fVar);
            mo94009r((C25106f.C25109c) null, aVar);
        }

        /* renamed from: r */
        public void mo94009r(C25106f.C25109c cVar, C17202a aVar) {
            C41536l.m120489i(cVar, "item");
            C41536l.m120489i(aVar, "dismissListener");
            this.f95240f.mo3946b();
            throw null;
        }
    }

    /* renamed from: yu0.a$d */
    private enum C40070d {
        TEXT,
        HIGHLIGHT,
        CAPTION_TEXT;
        

        /* renamed from: d */
        public static final C40071a f95241d = null;

        /* renamed from: yu0.a$d$a */
        public static final class C40071a {
            private C40071a() {
            }

            public /* synthetic */ C40071a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C40070d mo94010a(int i) {
                C40070d dVar;
                boolean z;
                C40070d[] values = C40070d.values();
                int length = values.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        dVar = null;
                        break;
                    }
                    dVar = values[i2];
                    if (dVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        break;
                    }
                    i2++;
                }
                if (dVar == null) {
                    return C40070d.TEXT;
                }
                return dVar;
            }
        }

        static {
            f95241d = new C40071a((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: yu0.a$e */
    public /* synthetic */ class C40072e {

        /* renamed from: a */
        public static final /* synthetic */ int[] f95246a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                yu0.a$d[] r0 = yu0.C40066a.C40070d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yu0.a$d r1 = yu0.C40066a.C40070d.TEXT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yu0.a$d r1 = yu0.C40066a.C40070d.HIGHLIGHT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yu0.a$d r1 = yu0.C40066a.C40070d.CAPTION_TEXT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f95246a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yu0.C40066a.C40072e.<clinit>():void");
        }
    }

    /* renamed from: yu0.a$f */
    /* synthetic */ class C40073f extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C40073f f95247d = new C40073f();

        C40073f() {
            super(3, C38023d.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/nbo/databinding/ItemNboCardTextBinding;", 0);
        }

        /* renamed from: b */
        public final C38023d mo94011b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C38023d.m111803d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo94011b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: yu0.a$g */
    /* synthetic */ class C40074g extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C40074g f95248d = new C40074g();

        C40074g() {
            super(3, C38022c.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/nbo/databinding/ItemNboCardHighlightBinding;", 0);
        }

        /* renamed from: b */
        public final C38022c mo94012b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C38022c.m111799d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo94012b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: yu0.a$h */
    /* synthetic */ class C40075h extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C40075h f95249d = new C40075h();

        C40075h() {
            super(3, C38021b.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/nbo/databinding/ItemNboCardCaptionBinding;", 0);
        }

        /* renamed from: b */
        public final C38021b mo94013b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C38021b.m111795d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo94013b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C40066a(C24851a aVar) {
        super(aVar);
        C41536l.m120489i(aVar, "listener");
        this.f95237g = aVar;
    }

    /* renamed from: m */
    private static final Object m116092m(ViewGroup viewGroup, C43080q qVar) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C41536l.m120488h(from, "from(parent.context)");
        return qVar.invoke(from, viewGroup, Boolean.FALSE);
    }

    public int getItemViewType(int i) {
        C25106f fVar = (C25106f) mo6027g(i);
        if (fVar instanceof C25106f.C25108b) {
            return C40070d.HIGHLIGHT.ordinal();
        }
        if (fVar instanceof C25106f.C25107a) {
            return C40070d.CAPTION_TEXT.ordinal();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: k */
    public void onBindViewHolder(C20592a0 a0Var, int i) {
        C41536l.m120489i(a0Var, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        a0Var.mo49135k((C25106f) g, this.f95237g);
    }

    /* renamed from: l */
    public C20592a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        int i2 = C40072e.f95246a[C40070d.f95241d.mo94010a(i).ordinal()];
        if (i2 == 1) {
            Object m = m116092m(viewGroup, C40073f.f95247d);
            C41536l.m120488h(m, "invokeInflater(ItemNboCardTextBinding::inflate)");
            return new C40069c((C38023d) m);
        } else if (i2 == 2) {
            Object m2 = m116092m(viewGroup, C40074g.f95248d);
            C41536l.m120488h(m2, "invokeInflater(ItemNboCa…ighlightBinding::inflate)");
            return new C40068b((C38022c) m2);
        } else if (i2 == 3) {
            Object m3 = m116092m(viewGroup, C40075h.f95249d);
            C41536l.m120488h(m3, "invokeInflater(ItemNboCardCaptionBinding::inflate)");
            return new C40067a((C38021b) m3);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: n */
    public void onViewAttachedToWindow(C20592a0 a0Var) {
        C41536l.m120489i(a0Var, "holder");
        super.onViewAttachedToWindow(a0Var);
        a0Var.mo49138p();
    }

    /* renamed from: o */
    public void onViewDetachedFromWindow(C20592a0 a0Var) {
        C41536l.m120489i(a0Var, "holder");
        super.onViewDetachedFromWindow(a0Var);
        a0Var.mo49137o();
    }
}
