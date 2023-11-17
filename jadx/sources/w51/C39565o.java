package w51;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.core.view.C1152f3;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import b41.C31128a;
import c10.C19443b;
import c10.C19445c;
import c10.C19454j;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C4956a;
import g91.C32303f;
import g91.C32319m;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import hy0.C36268b;
import hy0.C36270d;
import hy0.C36274h;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import o31.C37588a0;
import o31.C37594d;
import o51.C37646c;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.loading.LoadingView;
import s51.C38427a;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import w51.C39527c;
import w51.C39532c0;
import x00.C29614e;

/* renamed from: w51.o */
public final class C39565o extends C39525b {

    /* renamed from: X */
    public static final C39566a f94044X = new C39566a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C39532c0.C39536c f94045K;

    /* renamed from: L */
    private final C41217g f94046L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C37646c f94047M;
    /* access modifiers changed from: private */

    /* renamed from: N */
    public long f94048N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public long f94049O = Calendar.getInstance().getTimeInMillis();
    /* access modifiers changed from: private */

    /* renamed from: P */
    public long f94050P = Calendar.getInstance().getTimeInMillis();
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public long f94051Q = this.f94048N;

    /* renamed from: R */
    private final C39570c f94052R = new C39570c(this);

    /* renamed from: S */
    private final C39580l f94053S = new C39580l(this);
    /* access modifiers changed from: private */

    /* renamed from: T */
    public final C39550e0 f94054T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public List f94055U;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public C39556f0 f94056V;

    /* renamed from: W */
    private final C29614e f94057W;

    /* renamed from: w51.o$a */
    public static final class C39566a {

        /* renamed from: w51.o$a$a */
        public enum C39567a {
            ONE_MONTH(1, C36274h.statements_one_month),
            THREE_MONTHS(3, C36274h.statements_three_months),
            SIX_MONTHS(6, C36274h.statements_six_months),
            ONE_YEAR(12, C36274h.statements_one_year),
            TWO_YEARS(24, C36274h.statements_two_years);
            

            /* renamed from: d */
            private final int f94064d;

            /* renamed from: e */
            private final int f94065e;

            private C39567a(int i, int i2) {
                this.f94064d = i;
                this.f94065e = i2;
            }

            /* renamed from: b */
            public final int mo93247b() {
                return this.f94064d;
            }

            /* renamed from: c */
            public final int mo93248c() {
                return this.f94065e;
            }
        }

        /* renamed from: w51.o$a$b */
        public enum C39568b {
            DURATIONS_SMALL(C39567a.ONE_MONTH, r3, r6, r8),
            DURATIONS_MEDIUM(r3, r6, r8, C39567a.TWO_YEARS);
            

            /* renamed from: d */
            private final C39567a[] f94069d;

            private C39568b(C39567a... aVarArr) {
                this.f94069d = aVarArr;
            }

            /* renamed from: b */
            public final C39567a[] mo93249b() {
                return this.f94069d;
            }
        }

        private C39566a() {
        }

        public /* synthetic */ C39566a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long mo93245a(C39567a aVar) {
            C41536l.m120489i(aVar, "<this>");
            Calendar instance = Calendar.getInstance();
            instance.add(2, -aVar.mo93247b());
            return instance.getTimeInMillis();
        }

        /* renamed from: b */
        public final C39565o mo93246b(long j, boolean z, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str) {
            C39568b bVar;
            long j2;
            long j3;
            C41536l.m120489i(str, "printNo");
            if (z2) {
                bVar = C39568b.DURATIONS_SMALL;
            } else {
                bVar = C39568b.DURATIONS_MEDIUM;
            }
            C39565o oVar = new C39565o();
            C41224m[] mVarArr = new C41224m[8];
            mVarArr[0] = C41233s.m119492a("ARG_ACC_KEY", Long.valueOf(j));
            mVarArr[1] = C41233s.m119492a("ARG_ACC_KEY_SELECTABLE", Boolean.valueOf(z));
            if (l != null) {
                j2 = l.longValue();
            } else {
                j2 = C39565o.f94044X.mo93245a((C39567a) C41333m.m119797v(bVar.mo93249b()));
            }
            mVarArr[2] = C41233s.m119492a("ARG_START_DATE", Long.valueOf(j2));
            if (l2 != null) {
                j3 = l2.longValue();
            } else {
                j3 = Calendar.getInstance().getTimeInMillis();
            }
            mVarArr[3] = C41233s.m119492a("ARG_END_DATE", Long.valueOf(j3));
            mVarArr[4] = C41233s.m119492a("ARG_DURATIONS_CONFIG", Integer.valueOf(bVar.ordinal()));
            mVarArr[5] = C41233s.m119492a("ARG_IS_CREDIT", Boolean.valueOf(z3));
            mVarArr[6] = C41233s.m119492a("ARG_PRINT_NO", str);
            mVarArr[7] = C41233s.m119492a("ARG_FILL_DATA", Boolean.valueOf(z4));
            oVar.setArguments(C0908e.m3336b(mVarArr));
            return oVar;
        }
    }

    /* renamed from: w51.o$b */
    static final class C39569b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39565o f94070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39569b(C39565o oVar) {
            super(0);
            this.f94070d = oVar;
        }

        public final void invoke() {
            this.f94070d.m114997X2().mo93187Bw().mo93198qm();
        }
    }

    /* renamed from: w51.o$c */
    public static final class C39570c implements C19454j {

        /* renamed from: a */
        final /* synthetic */ C39565o f94071a;

        C39570c(C39565o oVar) {
            this.f94071a = oVar;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            this.f94071a.f94051Q = j;
            C39565o oVar = this.f94071a;
            oVar.m114987L2(oVar.f94049O, this.f94071a.f94051Q, this.f94071a.f94050P, false).mo47662d();
        }
    }

    /* renamed from: w51.o$d */
    static final class C39571d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39565o f94072d;

        /* renamed from: w51.o$d$a */
        static final class C39572a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C39565o f94073d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C39572a(C39565o oVar) {
                super(0);
                this.f94073d = oVar;
            }

            /* renamed from: b */
            public final C39532c0 invoke() {
                return this.f94073d.mo93244Y2().mo32812a(this.f94073d.m114989O2(), this.f94073d.m114996W2(), this.f94073d.m114992S2(), this.f94073d.m114990P2(), this.f94073d.m114994U2(), this.f94073d.m114993T2(), this.f94073d.m114995V2());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39571d(C39565o oVar) {
            super(0);
            this.f94072d = oVar;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C39572a(this.f94072d));
        }
    }

    /* renamed from: w51.o$e */
    static final class C39573e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39565o f94074d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39573e(C39565o oVar) {
            super(1);
            this.f94074d = oVar;
        }

        /* renamed from: a */
        public final void mo93251a(C37223a aVar) {
            Long l = (Long) aVar.mo90296a();
            if (l != null) {
                C39565o oVar = this.f94074d;
                C38427a.f92073P.mo91995a(l.longValue(), oVar.m114994U2()).mo4576A1(oVar.getParentFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93251a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.o$f */
    static final class C39574f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39565o f94075d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39574f(C39565o oVar) {
            super(1);
            this.f94075d = oVar;
        }

        /* renamed from: a */
        public final void mo93252a(C39556f0 f0Var) {
            boolean z;
            this.f94075d.f94056V = f0Var;
            this.f94075d.f94055U = C41358y.m119991B0(f0Var.mo93234i());
            if (f0Var.mo93228e()) {
                this.f94075d.f94055U.add(new C39527c.C39528a());
            } else if (f0Var.mo93230f()) {
                this.f94075d.f94055U.add(new C39527c.C39529b());
            }
            C37646c x2 = this.f94075d.f94047M;
            if (x2 == null) {
                C41536l.m120506z("binding");
                x2 = null;
            }
            Button button = x2.f90425h;
            if (f0Var.mo93227d() || f0Var.mo93231g()) {
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
            C37646c x22 = this.f94075d.f94047M;
            if (x22 == null) {
                C41536l.m120506z("binding");
                x22 = null;
            }
            ConstraintLayout c = x22.f90424g.mo3946b();
            C41536l.m120488h(c, "binding.dataError.root");
            C32343x.m95483r1(c, f0Var.mo93226c(), false, 2, (Object) null);
            C37646c x23 = this.f94075d.f94047M;
            if (x23 == null) {
                C41536l.m120506z("binding");
                x23 = null;
            }
            ConstraintLayout c2 = x23.f90430m.mo3946b();
            C41536l.m120488h(c2, "binding.noData.root");
            C32343x.m95483r1(c2, f0Var.mo93231g(), false, 2, (Object) null);
            C37646c x24 = this.f94075d.f94047M;
            if (x24 == null) {
                C41536l.m120506z("binding");
                x24 = null;
            }
            Button button2 = x24.f90430m.f90498f;
            C41536l.m120488h(button2, "binding.noData.removeFilterButton");
            C37646c x25 = this.f94075d.f94047M;
            if (x25 == null) {
                C41536l.m120506z("binding");
                x25 = null;
            }
            LinearLayout linearLayout = x25.f90423f;
            C41536l.m120488h(linearLayout, "binding.chipsLayout");
            Object o = C40355o.m116857o(C1152f3.m4215b(linearLayout));
            C41536l.m120487g(o, "null cannot be cast to non-null type ge.bog.designsystem.components.chips.Chip");
            C32343x.m95483r1(button2, !((Chip) o).isActivated(), false, 2, (Object) null);
            C37646c x26 = this.f94075d.f94047M;
            if (x26 == null) {
                C41536l.m120506z("binding");
                x26 = null;
            }
            LoadingView loadingView = x26.f90433p;
            C41536l.m120488h(loadingView, "binding.skeletonLoading");
            C32343x.m95483r1(loadingView, f0Var.mo93227d(), false, 2, (Object) null);
            C37646c x27 = this.f94075d.f94047M;
            if (x27 == null) {
                C41536l.m120506z("binding");
                x27 = null;
            }
            Group group = x27.f90426i;
            C41536l.m120488h(group, "binding.downloadGroup");
            C32343x.m95483r1(group, f0Var.mo93232h(), false, 2, (Object) null);
            this.f94075d.f94054T.mo6029i(this.f94075d.f94055U);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93252a((C39556f0) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.o$g */
    static final class C39575g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39565o f94076d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39575g(C39565o oVar) {
            super(1);
            this.f94076d = oVar;
        }

        /* renamed from: a */
        public final void mo93253a(C39532c0.C39533a aVar) {
            if (aVar instanceof C39532c0.C39533a.C39534a) {
                C37646c x2 = this.f94076d.f94047M;
                if (x2 == null) {
                    C41536l.m120506z("binding");
                    x2 = null;
                }
                x2.f90422e.setInputText(((C39532c0.C39533a.C39534a) aVar).mo93201a());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93253a((C39532c0.C39533a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.o$h */
    static final class C39576h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39565o f94077d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39576h(C39565o oVar) {
            super(1);
            this.f94077d = oVar;
        }

        /* renamed from: a */
        public final void mo93254a(C31128a aVar) {
            C37646c cVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C37646c x2 = this.f94077d.f94047M;
                if (x2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = x2;
                }
                cVar.f90425h.setLoading(false);
                C31128a.C31131c cVar2 = (C31128a.C31131c) aVar;
                String c = ((C39523a) cVar2.mo71340a()).mo93179c();
                C1505h activity = this.f94077d.getActivity();
                String string = this.f94077d.getString(C36274h.f87573m);
                String a = ((C39523a) cVar2.mo71340a()).mo93177a();
                C32303f.m95195f(c, activity, string + a, ((C39523a) cVar2.mo71340a()).mo93178b());
            } else if (aVar instanceof C31128a.C31130b) {
                C37646c x22 = this.f94077d.f94047M;
                if (x22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar = x22;
                }
                cVar.f90425h.setLoading(true);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f94077d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93254a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.o$i */
    static final class C39577i extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C39565o f94078d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39577i(C39565o oVar) {
            super(2);
            this.f94078d = oVar;
        }

        /* renamed from: a */
        public final void mo93255a(String str, Bundle bundle) {
            C41536l.m120489i(str, "requestKey");
            C41536l.m120489i(bundle, "bundle");
            if (C41536l.m120484d(str, "SELECTOR_RESULT_ARG")) {
                long j = bundle.getLong("SELECTED_ACC_KEY_ARG", -1);
                if (j == -1) {
                    this.f94078d.mo4577k1();
                } else {
                    this.f94078d.m114997X2().mo93187Bw().mo93199yh(j);
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            mo93255a((String) obj, (Bundle) obj2);
            return C41238w.f97225a;
        }
    }

    /* renamed from: w51.o$j */
    public static final class C39578j extends C29614e {

        /* renamed from: a */
        final /* synthetic */ C39565o f94079a;

        C39578j(C39565o oVar) {
            this.f94079a = oVar;
        }

        /* renamed from: f */
        public boolean mo69510f() {
            boolean z;
            boolean z2;
            List B2 = this.f94079a.f94055U;
            if (!(B2 instanceof Collection) || !B2.isEmpty()) {
                Iterator it = B2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C39527c) it.next()) instanceof C39527c.C39528a) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
            C39556f0 D2 = this.f94079a.f94056V;
            if (D2 == null || !D2.mo93226c()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return false;
        }

        /* renamed from: g */
        public boolean mo69511g() {
            boolean z;
            boolean z2;
            boolean z3;
            List B2 = this.f94079a.f94055U;
            if (!(B2 instanceof Collection) || !B2.isEmpty()) {
                Iterator it = B2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C39527c cVar = (C39527c) it.next();
                    if ((cVar instanceof C39527c.C39529b) || (cVar instanceof C39527c.C39528a)) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (z3) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                return true;
            }
            C39556f0 D2 = this.f94079a.f94056V;
            if (D2 == null || !D2.mo93226c()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo69512h() {
            this.f94079a.m114997X2().mo93187Bw().mo93198qm();
        }
    }

    /* renamed from: w51.o$k */
    static final class C39579k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f94080a;

        C39579k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f94080a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f94080a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f94080a.invoke(obj);
        }
    }

    /* renamed from: w51.o$l */
    public static final class C39580l implements C19454j {

        /* renamed from: a */
        final /* synthetic */ C39565o f94081a;

        C39580l(C39565o oVar) {
            this.f94081a = oVar;
        }

        /* renamed from: a */
        public void mo47670a(long j) {
            C39565o oVar = this.f94081a;
            oVar.f94048N = oVar.f94051Q;
            this.f94081a.f94049O = j;
            this.f94081a.m115030u3();
        }
    }

    /* renamed from: w51.o$m */
    public static final class C39581m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f94082d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39581m(Fragment fragment) {
            super(0);
            this.f94082d = fragment;
        }

        public final Fragment invoke() {
            return this.f94082d;
        }
    }

    /* renamed from: w51.o$n */
    public static final class C39582n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f94083d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39582n(C43064a aVar) {
            super(0);
            this.f94083d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f94083d.invoke();
        }
    }

    /* renamed from: w51.o$o */
    public static final class C39583o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f94084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39583o(C41217g gVar) {
            super(0);
            this.f94084d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f94084d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: w51.o$p */
    public static final class C39584p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f94085d;

        /* renamed from: e */
        final /* synthetic */ C41217g f94086e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39584p(C43064a aVar, C41217g gVar) {
            super(0);
            this.f94085d = aVar;
            this.f94086e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f94085d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f94086e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    public C39565o() {
        C39571d dVar = new C39571d(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C39582n(new C39581m(this)));
        this.f94046L = C1514j0.m5374c(this, C41520a0.m120436b(C39532c0.class), new C39583o(a), new C39584p((C43064a) null, a), dVar);
        C39550e0 e0Var = new C39550e0();
        e0Var.mo93220m(new C39569b(this));
        this.f94054T = e0Var;
        this.f94055U = new ArrayList();
        this.f94057W = new C39578j(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final C19445c m114987L2(long j, long j2, long j3, boolean z) {
        C19454j jVar;
        if (z) {
            jVar = this.f94052R;
        } else {
            jVar = this.f94053S;
        }
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        return new C19443b(requireContext, j, j2, j3, jVar);
    }

    /* renamed from: M2 */
    private final void m114988M2(int i) {
        C37646c cVar = this.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        LinearLayout linearLayout = cVar.f90423f;
        C41536l.m120488h(linearLayout, "binding.chipsLayout");
        for (View view : C1152f3.m4215b(linearLayout)) {
            if (view instanceof Chip) {
                ((Chip) view).setActivated(false);
            }
        }
        C37646c cVar3 = this.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        View childAt = cVar3.f90423f.getChildAt(i);
        C41536l.m120487g(childAt, "null cannot be cast to non-null type ge.bog.designsystem.components.chips.Chip");
        ((Chip) childAt).setActivated(true);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        long a = f94044X.mo93245a(m114991R2().mo93249b()[i]);
        String u = C32319m.m95314u(a);
        String u2 = C32319m.m95314u(timeInMillis);
        C37646c cVar4 = this.f94047M;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
            cVar4 = null;
        }
        Input input = cVar4.f90434q;
        C41536l.m120488h(u, "startDateText");
        input.setInputText(u);
        C37646c cVar5 = this.f94047M;
        if (cVar5 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar5;
        }
        Input input2 = cVar2.f90428k;
        C41536l.m120488h(u2, "endDateText");
        input2.setInputText(u2);
        this.f94048N = a;
        this.f94049O = timeInMillis;
        this.f94050P = timeInMillis;
        this.f94051Q = a;
        m114997X2().mo93187Bw().mo93191Ms(a, timeInMillis);
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public final long m114989O2() {
        return requireArguments().getLong("ARG_ACC_KEY");
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public final boolean m114990P2() {
        return requireArguments().getBoolean("ARG_ACC_KEY_SELECTABLE");
    }

    /* renamed from: R2 */
    private final C39566a.C39568b m114991R2() {
        return C39566a.C39568b.values()[requireArguments().getInt("ARG_DURATIONS_CONFIG")];
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public final long m114992S2() {
        return requireArguments().getLong("ARG_END_DATE");
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public final boolean m114993T2() {
        return requireArguments().getBoolean("ARG_FILL_DATA");
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public final boolean m114994U2() {
        return requireArguments().getBoolean("ARG_IS_CREDIT");
    }

    /* access modifiers changed from: private */
    /* renamed from: V2 */
    public final String m114995V2() {
        String string = requireArguments().getString("ARG_PRINT_NO", "");
        C41536l.m120488h(string, "requireArguments().getString(ARG_PRINT_NO, \"\")");
        return string;
    }

    /* access modifiers changed from: private */
    /* renamed from: W2 */
    public final long m114996W2() {
        return requireArguments().getLong("ARG_START_DATE");
    }

    /* access modifiers changed from: private */
    /* renamed from: X2 */
    public final C39532c0 m114997X2() {
        return (C39532c0) this.f94046L.getValue();
    }

    /* renamed from: Z2 */
    private final int m114998Z2() {
        Rect rect = new Rect();
        requireActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top;
    }

    /* renamed from: a3 */
    private final void m114999a3() {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        String u = C32319m.m95314u(this.f94048N);
        String u2 = C32319m.m95314u(timeInMillis);
        C37646c cVar = this.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        Input input = cVar.f90434q;
        C41536l.m120488h(u, "startDateText");
        input.setInputText(u);
        C37646c cVar3 = this.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        Input input2 = cVar3.f90428k;
        C41536l.m120488h(u2, "endDateText");
        input2.setInputText(u2);
        C37646c cVar4 = this.f94047M;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
            cVar4 = null;
        }
        cVar4.f90431n.setIconImage(new Image.Resource(C36270d.ic_pdf_statements, (Boolean) null, 2, (DefaultConstructorMarker) null));
        C37646c cVar5 = this.f94047M;
        if (cVar5 == null) {
            C41536l.m120506z("binding");
            cVar5 = null;
        }
        cVar5.f90431n.setIconImageVisibility(true);
        C37646c cVar6 = this.f94047M;
        if (cVar6 == null) {
            C41536l.m120506z("binding");
            cVar6 = null;
        }
        cVar6.f90429l.setIconImage(new Image.Resource(C36270d.ic_excell_statements, (Boolean) null, 2, (DefaultConstructorMarker) null));
        C37646c cVar7 = this.f94047M;
        if (cVar7 == null) {
            C41536l.m120506z("binding");
            cVar7 = null;
        }
        cVar7.f90429l.setIconImageVisibility(true);
        if (!m114990P2()) {
            C37646c cVar8 = this.f94047M;
            if (cVar8 == null) {
                C41536l.m120506z("binding");
                cVar8 = null;
            }
            EditText textInput = cVar8.f90422e.getTextInput();
            Context requireContext = requireContext();
            int i = C36268b.f87451c;
            textInput.setTextColor(C0767a.m2893c(requireContext, i));
            C37646c cVar9 = this.f94047M;
            if (cVar9 == null) {
                C41536l.m120506z("binding");
            } else {
                cVar2 = cVar9;
            }
            cVar2.f90422e.getTextInput().setHintTextColor(C0767a.m2893c(requireContext(), i));
            return;
        }
        C37646c cVar10 = this.f94047M;
        if (cVar10 == null) {
            C41536l.m120506z("binding");
            cVar10 = null;
        }
        cVar10.f90422e.setAlpha(1.0f);
        C37646c cVar11 = this.f94047M;
        if (cVar11 == null) {
            C41536l.m120506z("binding");
            cVar11 = null;
        }
        cVar11.f90422e.setEndIconImageSmall(C0767a.m2895e(requireContext(), C36270d.icons_24_system_chevron_up_down));
        C37646c cVar12 = this.f94047M;
        if (cVar12 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar12;
        }
        cVar2.f90422e.setOnClickListener(new C39564n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public static final void m115004h3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114997X2().mo93187Bw().mo93197if();
    }

    /* renamed from: i3 */
    private final void m115006i3() {
        C37646c cVar = this.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f90425h.setOnClickListener(new C39557g(this));
        C37646c cVar3 = this.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f90431n.setOnClickListener(new C39558h(this));
        C37646c cVar4 = this.f94047M;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
            cVar4 = null;
        }
        cVar4.f90429l.setOnClickListener(new C39559i(this));
        C37646c cVar5 = this.f94047M;
        if (cVar5 == null) {
            C41536l.m120506z("binding");
            cVar5 = null;
        }
        cVar5.f90434q.setOnClickListener(new C39560j(this));
        C37646c cVar6 = this.f94047M;
        if (cVar6 == null) {
            C41536l.m120506z("binding");
            cVar6 = null;
        }
        cVar6.f90428k.setOnClickListener(new C39561k(this));
        C37646c cVar7 = this.f94047M;
        if (cVar7 == null) {
            C41536l.m120506z("binding");
            cVar7 = null;
        }
        cVar7.f90424g.f90494f.setOnClickListener(new C39562l(this));
        C37646c cVar8 = this.f94047M;
        if (cVar8 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar8;
        }
        cVar2.f90430m.f90498f.setOnClickListener(new C39563m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public static final void m115008j3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114997X2().mo93187Bw().mo93185A9();
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m115010k3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        C37646c cVar = oVar.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f90431n.setActive(true);
        C37646c cVar3 = oVar.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.f90429l.setActive(false);
        oVar.m114997X2().mo93187Bw().mo93192Sm(C39547d.PDF);
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m115012l3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        C37646c cVar = oVar.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f90431n.setActive(false);
        C37646c cVar3 = oVar.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.f90429l.setActive(true);
        oVar.m114997X2().mo93187Bw().mo93192Sm(C39547d.EXCELL);
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m115014m3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114987L2(oVar.f94048N, f94044X.mo93245a(C39566a.C39567a.TWO_YEARS), oVar.f94050P, true).mo47662d();
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m115016n3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114987L2(oVar.f94049O, oVar.f94048N, oVar.f94050P, false).mo47662d();
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m115018o3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114997X2().mo93187Bw().mo93196c();
    }

    private final void observeData() {
        m114997X2().mo93190Dw().mo93189D7().mo4819k(getViewLifecycleOwner(), new C39579k(new C39573e(this)));
        m114997X2().mo93190Dw().mo93195b().mo4819k(getViewLifecycleOwner(), new C39579k(new C39574f(this)));
        m114997X2().mo93190Dw().mo93194ah().mo4819k(getViewLifecycleOwner(), new C39579k(new C39575g(this)));
        m114997X2().mo93190Dw().mo93193V7().mo4819k(getViewLifecycleOwner(), new C39579k(new C39576h(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m115020p3(C39565o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114988M2(0);
    }

    /* renamed from: q3 */
    private final boolean m115022q3(Date date, Date date2) {
        if (!C37594d.m110562c(date, date2) || !C37594d.m110563d(date, date2) || !C37594d.m110564e(date, date2)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m115024r3(C39565o oVar, DialogInterface dialogInterface) {
        C41536l.m120489i(oVar, "this$0");
        View requireView = oVar.requireView();
        C41536l.m120488h(requireView, "requireView()");
        ViewGroup.LayoutParams layoutParams = requireView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = oVar.getResources().getDisplayMetrics().heightPixels - oVar.m114998Z2();
            requireView.setLayoutParams(layoutParams);
            C37646c cVar = oVar.f94047M;
            if (cVar == null) {
                C41536l.m120506z("binding");
                cVar = null;
            }
            ViewParent parent = cVar.mo3946b().getParent();
            C41536l.m120487g(parent, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent;
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                layoutParams2.height = -1;
                view.setLayoutParams(layoutParams2);
                C41536l.m120487g(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
                BottomSheetBehavior n = ((C4956a) dialogInterface).mo15614n();
                n.mo15579I0(3);
                n.mo15578H0(true);
                n.mo15596w0(false);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* renamed from: s3 */
    private final void m115026s3() {
        boolean z;
        C39566a.C39567a[] b = m114991R2().mo93249b();
        int length = b.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            C39566a.C39567a aVar = b[i];
            int i3 = i2 + 1;
            C37646c cVar = this.f94047M;
            if (cVar == null) {
                C41536l.m120506z("binding");
                cVar = null;
            }
            LinearLayout linearLayout = cVar.f90423f;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            chip.setActivated(z);
            chip.setChipTitle(getString(aVar.mo93248c()));
            chip.setOnClickListener(new C39549e(this, i2));
            linearLayout.addView(chip);
            i++;
            i2 = i3;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m115028t3(C39565o oVar, int i, View view) {
        C41536l.m120489i(oVar, "this$0");
        oVar.m114988M2(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public final void m115030u3() {
        int i;
        String u = C32319m.m95314u(this.f94048N);
        C41536l.m120488h(u, "getDottedDate(startDate)");
        String u2 = C32319m.m95314u(this.f94049O);
        C41536l.m120488h(u2, "getDottedDate(endDate)");
        C37646c cVar = this.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f90434q.setInputText(u);
        C37646c cVar3 = this.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
            cVar3 = null;
        }
        cVar3.f90428k.setInputText(u2);
        C37646c cVar4 = this.f94047M;
        if (cVar4 == null) {
            C41536l.m120506z("binding");
            cVar4 = null;
        }
        LinearLayout linearLayout = cVar4.f90423f;
        C41536l.m120488h(linearLayout, "binding.chipsLayout");
        Iterator it = C1152f3.m4215b(linearLayout).iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            C41536l.m120487g(view, "null cannot be cast to non-null type ge.bog.designsystem.components.chips.Chip");
            ((Chip) view).setActivated(false);
        }
        Date date = new Date(this.f94048N);
        if (m115022q3(new Date(this.f94049O), new Date())) {
            C39566a.C39567a[] b = m114991R2().mo93249b();
            int length = b.length;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                }
                if (m115022q3(date, new Date(f94044X.mo93245a(b[i])))) {
                    break;
                }
                i++;
            }
            if (i >= 0 && i < m114991R2().mo93249b().length) {
                C37646c cVar5 = this.f94047M;
                if (cVar5 == null) {
                    C41536l.m120506z("binding");
                } else {
                    cVar2 = cVar5;
                }
                View childAt = cVar2.f90423f.getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setActivated(true);
                }
            }
        }
        m114997X2().mo93187Bw().mo93191Ms(this.f94048N, this.f94049O);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        C37646c d = C37646c.m110677d(layoutInflater, viewGroup, true);
        C41536l.m120488h(d, "inflate(inflater, container, true)");
        this.f94047M = d;
        this.f94048N = f94044X.mo93245a((C39566a.C39567a) C41333m.m119797v(m114991R2().mo93249b()));
        C1533o.m5446c(this, "SELECTOR_RESULT_ARG", new C39577i(this));
        C37646c cVar = this.f94047M;
        C37646c cVar2 = null;
        if (cVar == null) {
            C41536l.m120506z("binding");
            cVar = null;
        }
        cVar.f90435r.setAdapter(this.f94054T);
        C37646c cVar3 = this.f94047M;
        if (cVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            cVar2 = cVar3;
        }
        cVar2.f90435r.mo5363n(this.f94057W);
        mo26370a2(getString(C36274h.statements_title));
        observeData();
        m115006i3();
        m114999a3();
        m115026s3();
    }

    /* renamed from: Y2 */
    public final C39532c0.C39536c mo93244Y2() {
        C39532c0.C39536c cVar = this.f94045K;
        if (cVar != null) {
            return cVar;
        }
        C41536l.m120506z("listDownloadViewModelAssistedFactory");
        return null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        Bundle bundle = new Bundle();
        bundle.putLong("RESULT_KEY_STATEMENTS_START_DATE", this.f94048N);
        bundle.putLong("RESULT_KEY_STATEMENTS_END_DATE", this.f94049O);
        C41238w wVar = C41238w.f97225a;
        C1533o.m5445b(this, "REQUEST_KEY_STATEMENTS", bundle);
        super.onDismiss(dialogInterface);
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        C4956a aVar;
        Dialog q1 = super.mo710q1(bundle);
        if (q1 instanceof C4956a) {
            aVar = (C4956a) q1;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            aVar.setOnShowListener(new C39555f(this));
        }
        return q1;
    }
}
