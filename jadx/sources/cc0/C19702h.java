package cc0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.mobilebank.deposits.presentation.model.C23183b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p615tg.C17963d;
import ue1.C43080q;
import xb0.C29708a0;
import xb0.C29726n;
import xb0.C29732t;
import xb0.C29733u;
import xb0.C29734v;
import xb0.C29735w;

/* renamed from: cc0.h */
public final class C19702h extends C1819o {

    /* renamed from: f */
    private final C19719i f54044f;

    /* renamed from: cc0.h$a */
    public static abstract class C19703a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final View f54045d;

        /* renamed from: cc0.h$a$a */
        public static final class C19704a extends C19703a {

            /* renamed from: e */
            private final C29726n f54046e;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19704a(xb0.C29726n r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54046e = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19703a.C19704a.<init>(xb0.n):void");
            }

            /* renamed from: o */
            public void mo47906l(C23183b.C23186b bVar) {
                String str;
                C41536l.m120489i(bVar, "item");
                C29726n nVar = this.f54046e;
                nVar.f75124f.setBackgroundResource(bVar.mo57895c());
                nVar.f75123e.setImageResource(bVar.mo57896d());
                nVar.f75123e.setImageTintList(C0767a.m2894d(nVar.mo3946b().getContext(), bVar.mo57897e()));
                nVar.f75126h.setText(C34646b.m101752f(bVar.mo57900h(), (Context) null, 1, (Object) null));
                AppCompatTextView appCompatTextView = nVar.f75125g;
                StringSource f = bVar.mo57898f();
                if (f == null || (str = C34646b.m101752f(f, (Context) null, 1, (Object) null)) == null) {
                    str = "";
                }
                appCompatTextView.setText(str);
                nVar.f75125g.setTextColor(mo47907m(bVar.mo57899g()));
            }
        }

        /* renamed from: cc0.h$a$b */
        public static final class C19705b extends C19703a {

            /* renamed from: e */
            private final C29732t f54047e;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19705b(xb0.C29732t r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54047e = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19703a.C19705b.<init>(xb0.t):void");
            }

            /* renamed from: o */
            public void mo47906l(C23183b.C23216v vVar) {
                boolean z;
                String str;
                C41536l.m120489i(vVar, "item");
                C29732t tVar = this.f54047e;
                boolean z2 = true;
                if (vVar.mo57982d() == null) {
                    z = true;
                } else {
                    z = false;
                }
                SingleLineTextItem singleLineTextItem = tVar.f75143f;
                C41536l.m120488h(singleLineTextItem, "singleText");
                TwoLineTextItem twoLineTextItem = tVar.f75144g;
                C41536l.m120488h(twoLineTextItem, "twoLineText");
                mo47904i(z, singleLineTextItem, twoLineTextItem);
                if (z) {
                    tVar.f75143f.setText(C34646b.m101752f(vVar.mo57983e(), (Context) null, 1, (Object) null));
                } else {
                    tVar.f75144g.setTitle(C34646b.m101752f(vVar.mo57983e(), (Context) null, 1, (Object) null));
                    TwoLineTextItem twoLineTextItem2 = tVar.f75144g;
                    StringSource d = vVar.mo57982d();
                    if (d != null) {
                        str = C34646b.m101752f(d, (Context) null, 1, (Object) null);
                    } else {
                        str = null;
                    }
                    twoLineTextItem2.setText(str);
                }
                AppCompatImageView appCompatImageView = tVar.f75142e;
                C41536l.m120488h(appCompatImageView, "icon");
                if (vVar.mo57981c() == null) {
                    z2 = false;
                }
                C32343x.m95483r1(appCompatImageView, z2, false, 2, (Object) null);
                Integer c = vVar.mo57981c();
                if (c != null) {
                    AppCompatImageView appCompatImageView2 = tVar.f75142e;
                    C41536l.m120488h(appCompatImageView2, "icon");
                    appCompatImageView2.setImageResource(c.intValue());
                }
            }
        }

        /* renamed from: cc0.h$a$c */
        public static final class C19706c extends C19703a {

            /* renamed from: e */
            private final C29735w f54048e;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19706c(xb0.C29735w r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    androidx.appcompat.widget.AppCompatTextView r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54048e = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19703a.C19706c.<init>(xb0.w):void");
            }

            /* renamed from: o */
            public void mo47906l(C23183b.C23220z zVar) {
                C41536l.m120489i(zVar, "item");
                this.f54048e.mo3946b().setText(zVar.mo57995c());
            }
        }

        /* renamed from: cc0.h$a$d */
        public static final class C19707d extends C19703a {

            /* renamed from: e */
            private final C29734v f54049e;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19707d(xb0.C29734v r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54049e = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19703a.C19707d.<init>(xb0.v):void");
            }

            /* renamed from: o */
            public void mo47906l(C23183b.C23219y yVar) {
                boolean z;
                C41536l.m120489i(yVar, "item");
                C29734v vVar = this.f54049e;
                vVar.f75151e.setImageResource(yVar.mo57990d());
                if (yVar.mo57993g() == null) {
                    z = true;
                } else {
                    z = false;
                }
                SingleLineTextItem singleLineTextItem = vVar.f75153g;
                C41536l.m120488h(singleLineTextItem, "singleText");
                TwoLineReverseTextItem twoLineReverseTextItem = vVar.f75154h;
                C41536l.m120488h(twoLineReverseTextItem, "twoLineText");
                mo47904i(z, singleLineTextItem, twoLineReverseTextItem);
                if (yVar.mo57993g() == null) {
                    vVar.f75153g.setText(C34646b.m101752f(yVar.mo57994h(), (Context) null, 1, (Object) null));
                } else {
                    vVar.f75154h.setText(C34646b.m101752f(yVar.mo57994h(), (Context) null, 1, (Object) null));
                    vVar.f75154h.setTitle(C34646b.m101752f(yVar.mo57993g(), (Context) null, 1, (Object) null));
                }
                vVar.f75152f.setText(C34646b.m101752f(yVar.mo57991e(), (Context) null, 1, (Object) null));
                vVar.f75152f.setTextColor(mo47907m(yVar.mo57992f()));
            }
        }

        /* renamed from: cc0.h$a$e */
        public static final class C19708e extends C19703a {

            /* renamed from: e */
            private final C29708a0 f54050e;

            /* renamed from: f */
            private final Button f54051f;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19708e(xb0.C29708a0 r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    android.widget.FrameLayout r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54050e = r3
                    ge.bog.designsystem.components.buttons.Button r3 = r3.f74974e
                    java.lang.String r0 = "binding.allOperationsButton"
                    kotlin.jvm.internal.C41536l.m120488h(r3, r0)
                    r2.f54051f = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19703a.C19708e.<init>(xb0.a0):void");
            }

            /* renamed from: o */
            public void mo47906l(C23183b.C23201i0 i0Var) {
                C41536l.m120489i(i0Var, "item");
                this.f54050e.f74974e.setButtonText(C34646b.m101752f(i0Var.mo57947c(), (Context) null, 1, (Object) null));
            }

            /* access modifiers changed from: protected */
            /* renamed from: p */
            public Button mo47908n() {
                return this.f54051f;
            }
        }

        /* renamed from: cc0.h$a$f */
        public static final class C19709f extends C19703a {

            /* renamed from: e */
            private final C29733u f54052e;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public C19709f(xb0.C29733u r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "binding"
                    kotlin.jvm.internal.C41536l.m120489i(r3, r0)
                    ge.bog.designsystem.components.list.ListItem r0 = r3.mo3946b()
                    java.lang.String r1 = "binding.root"
                    kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    r2.f54052e = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19703a.C19709f.<init>(xb0.u):void");
            }

            /* renamed from: o */
            public void mo47906l(C23183b.C23189c0 c0Var) {
                boolean z;
                String str;
                C41536l.m120489i(c0Var, "item");
                C29733u uVar = this.f54052e;
                uVar.f75146e.setImageResource(c0Var.mo57907c());
                if (c0Var.mo57911g() == null) {
                    z = true;
                } else {
                    z = false;
                }
                SingleLineTextItem singleLineTextItem = uVar.f75148g;
                C41536l.m120488h(singleLineTextItem, "singleText");
                TwoLineReverseTextItem twoLineReverseTextItem = uVar.f75149h;
                C41536l.m120488h(twoLineReverseTextItem, "twoLineText");
                mo47904i(z, singleLineTextItem, twoLineReverseTextItem);
                if (z) {
                    uVar.f75148g.setText(C34646b.m101752f(c0Var.mo57912h(), (Context) null, 1, (Object) null));
                } else {
                    uVar.f75149h.setText(C34646b.m101752f(c0Var.mo57912h(), (Context) null, 1, (Object) null));
                    TwoLineReverseTextItem twoLineReverseTextItem2 = uVar.f75149h;
                    StringSource g = c0Var.mo57911g();
                    if (g != null) {
                        str = C34646b.m101752f(g, (Context) null, 1, (Object) null);
                    } else {
                        str = null;
                    }
                    twoLineReverseTextItem2.setTitle(str);
                }
                uVar.f75147f.setText(C34646b.m101752f(c0Var.mo57908d(), (Context) null, 1, (Object) null));
                C1314o.m4575q(uVar.f75147f, c0Var.mo57909e());
                uVar.f75147f.setTextColor(mo47907m(c0Var.mo57910f()));
            }
        }

        public /* synthetic */ C19703a(View view, DefaultConstructorMarker defaultConstructorMarker) {
            this(view);
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m65378k(C19719i iVar, C23183b bVar, View view) {
            C41536l.m120489i(iVar, "$listener");
            C41536l.m120489i(bVar, "$item");
            iVar.mo47923a(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public final void mo47904i(boolean z, View view, View view2) {
            C41536l.m120489i(view, "singleText");
            C41536l.m120489i(view2, "twoLineText");
            C32343x.m95483r1(view, z, false, 2, (Object) null);
            C32343x.m95483r1(view2, !z, false, 2, (Object) null);
        }

        /* renamed from: j */
        public final void mo47905j(C23183b bVar, C19719i iVar) {
            C19701g gVar;
            C41536l.m120489i(bVar, "item");
            C41536l.m120489i(iVar, "listener");
            mo47906l(bVar);
            View n = mo47908n();
            if (!bVar.mo57888b()) {
                gVar = null;
            } else {
                gVar = new C19701g(iVar, bVar);
            }
            n.setOnClickListener(gVar);
            mo47908n().setClickable(bVar.mo57888b());
            mo47908n().setFocusable(bVar.mo57888b());
        }

        /* renamed from: l */
        public abstract void mo47906l(C23183b bVar);

        /* renamed from: m */
        public final int mo47907m(int i) {
            Context context = this.itemView.getContext();
            C41536l.m120488h(context, "itemView.context");
            return C32343x.m95418U(i, context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public View mo47908n() {
            return this.f54045d;
        }

        private C19703a(View view) {
            super(view);
            this.f54045d = view;
        }
    }

    /* renamed from: cc0.h$b */
    private enum C19710b {
        INTEREST_SECTION,
        ADDITIONAL_FUNCTION_SECTION,
        DEPOSIT_DETAILS_SECTION,
        DEPOSIT_OPERATION_DATE,
        DEPOSIT_OPERATION,
        DEPOSIT_VIEW_ALL_OPERATIONS;
        

        /* renamed from: d */
        public static final C19711a f54053d = null;

        /* renamed from: cc0.h$b$a */
        public static final class C19711a {
            private C19711a() {
            }

            public /* synthetic */ C19711a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C19710b mo47916a(int i) {
                boolean z;
                for (C19710b bVar : C19710b.values()) {
                    if (bVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return bVar;
                    }
                }
                return null;
            }
        }

        static {
            f54053d = new C19711a((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: cc0.h$c */
    public /* synthetic */ class C19712c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54061a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                cc0.h$b[] r0 = cc0.C19702h.C19710b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cc0.h$b r1 = cc0.C19702h.C19710b.INTEREST_SECTION     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cc0.h$b r1 = cc0.C19702h.C19710b.ADDITIONAL_FUNCTION_SECTION     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cc0.h$b r1 = cc0.C19702h.C19710b.DEPOSIT_DETAILS_SECTION     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                cc0.h$b r1 = cc0.C19702h.C19710b.DEPOSIT_OPERATION_DATE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                cc0.h$b r1 = cc0.C19702h.C19710b.DEPOSIT_OPERATION     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                cc0.h$b r1 = cc0.C19702h.C19710b.DEPOSIT_VIEW_ALL_OPERATIONS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f54061a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cc0.C19702h.C19712c.<clinit>():void");
        }
    }

    /* renamed from: cc0.h$d */
    /* synthetic */ class C19713d extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19713d f54062d = new C19713d();

        C19713d() {
            super(3, C29708a0.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/deposits/databinding/ItemDepositViewAllOperationsBinding;", 0);
        }

        /* renamed from: b */
        public final C29708a0 mo47917b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C29708a0.m90199d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47917b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cc0.h$e */
    /* synthetic */ class C19714e extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19714e f54063d = new C19714e();

        C19714e() {
            super(3, C29733u.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/deposits/databinding/ItemDepositInterestSectionBinding;", 0);
        }

        /* renamed from: b */
        public final C29733u mo47918b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C29733u.m90298d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47918b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cc0.h$f */
    /* synthetic */ class C19715f extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19715f f54064d = new C19715f();

        C19715f() {
            super(3, C29726n.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/deposits/databinding/ItemDepositAdditionalFunctionSectionBinding;", 0);
        }

        /* renamed from: b */
        public final C29726n mo47919b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C29726n.m90270d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47919b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cc0.h$g */
    /* synthetic */ class C19716g extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19716g f54065d = new C19716g();

        C19716g() {
            super(3, C29732t.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/deposits/databinding/ItemDepositDetailsSectionBinding;", 0);
        }

        /* renamed from: b */
        public final C29732t mo47920b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C29732t.m90294d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47920b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cc0.h$h */
    /* synthetic */ class C19717h extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19717h f54066d = new C19717h();

        C19717h() {
            super(3, C29735w.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/deposits/databinding/ItemDepositOperationDateHeaderBinding;", 0);
        }

        /* renamed from: b */
        public final C29735w mo47921b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C29735w.m90306d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47921b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* renamed from: cc0.h$i */
    /* synthetic */ class C19718i extends C41535k implements C43080q {

        /* renamed from: d */
        public static final C19718i f54067d = new C19718i();

        C19718i() {
            super(3, C29734v.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lge/bog/mobilebank/deposits/databinding/ItemDepositOperationBinding;", 0);
        }

        /* renamed from: b */
        public final C29734v mo47922b(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
            C41536l.m120489i(layoutInflater, "p0");
            return C29734v.m90302d(layoutInflater, viewGroup, z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return mo47922b((LayoutInflater) obj, (ViewGroup) obj2, ((Boolean) obj3).booleanValue());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19702h(C19719i iVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(iVar, "listener");
        this.f54044f = iVar;
    }

    /* renamed from: m */
    private static final Object m65374m(ViewGroup viewGroup, C43080q qVar) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        C41536l.m120488h(from, "from(parent.context)");
        return qVar.invoke(from, viewGroup, Boolean.FALSE);
    }

    public int getItemViewType(int i) {
        C19710b bVar;
        C23183b bVar2 = (C23183b) mo6027g(i);
        if (bVar2 instanceof C23183b.C23189c0) {
            bVar = C19710b.INTEREST_SECTION;
        } else if (bVar2 instanceof C23183b.C23186b) {
            bVar = C19710b.ADDITIONAL_FUNCTION_SECTION;
        } else if (bVar2 instanceof C23183b.C23216v) {
            bVar = C19710b.DEPOSIT_DETAILS_SECTION;
        } else if (bVar2 instanceof C23183b.C23219y) {
            bVar = C19710b.DEPOSIT_OPERATION;
        } else if (bVar2 instanceof C23183b.C23220z) {
            bVar = C19710b.DEPOSIT_OPERATION_DATE;
        } else if (C41536l.m120484d(bVar2, C23183b.C23201i0.f60755d)) {
            bVar = C19710b.DEPOSIT_VIEW_ALL_OPERATIONS;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return bVar.ordinal();
    }

    /* renamed from: k */
    public void onBindViewHolder(C19703a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo47905j((C23183b) g, this.f54044f);
    }

    /* renamed from: l */
    public C19703a onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2;
        C41536l.m120489i(viewGroup, "parent");
        C19710b a = C19710b.f54053d.mo47916a(i);
        if (a == null) {
            i2 = -1;
        } else {
            i2 = C19712c.f54061a[a.ordinal()];
        }
        switch (i2) {
            case -1:
                throw new UnsupportedOperationException();
            case 1:
                Object m = m65374m(viewGroup, C19714e.f54063d);
                C41536l.m120488h(m, "invokeInflater(ItemDepos…tSectionBinding::inflate)");
                return new C19703a.C19709f((C29733u) m);
            case 2:
                Object m2 = m65374m(viewGroup, C19715f.f54064d);
                C41536l.m120488h(m2, "invokeInflater(ItemDepos…nSectionBinding::inflate)");
                return new C19703a.C19704a((C29726n) m2);
            case 3:
                Object m3 = m65374m(viewGroup, C19716g.f54065d);
                C41536l.m120488h(m3, "invokeInflater(ItemDepos…sSectionBinding::inflate)");
                return new C19703a.C19705b((C29732t) m3);
            case 4:
                Object m4 = m65374m(viewGroup, C19717h.f54066d);
                C41536l.m120488h(m4, "invokeInflater(ItemDepos…teHeaderBinding::inflate)");
                return new C19703a.C19706c((C29735w) m4);
            case 5:
                Object m5 = m65374m(viewGroup, C19718i.f54067d);
                C41536l.m120488h(m5, "invokeInflater(ItemDepos…perationBinding::inflate)");
                return new C19703a.C19707d((C29734v) m5);
            case 6:
                Object m6 = m65374m(viewGroup, C19713d.f54062d);
                C41536l.m120488h(m6, "invokeInflater(ItemDepos…erationsBinding::inflate)");
                return new C19703a.C19708e((C29708a0) m6);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
