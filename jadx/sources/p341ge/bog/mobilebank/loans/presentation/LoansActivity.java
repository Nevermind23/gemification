package p341ge.bog.mobilebank.loans.presentation;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.C0829d;
import androidx.core.p016os.C0908e;
import androidx.core.view.C1200m3;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.C4963b;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37126a;
import lr0.C37128c;
import lr0.C37130e;
import lr0.C37132g;
import lr0.C37133h;
import o31.C37613p;
import p202p0.C7556l;
import p202p0.C7589q;
import p202p0.C7594s;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p642vh.C18368l;
import pr0.C37952f;
import ue1.C43064a;
import ur0.C39068a;
import ur0.C39069b;

/* renamed from: ge.bog.mobilebank.loans.presentation.LoansActivity */
public final class LoansActivity extends C30772sa implements C39068a {

    /* renamed from: J */
    public static final C32569a f80199J = new C32569a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private C37952f f80200F;

    /* renamed from: G */
    private final C41217g f80201G = C41219i.m119470b(new C32570b(this));

    /* renamed from: H */
    private Integer f80202H;

    /* renamed from: I */
    private C7556l f80203I;

    /* renamed from: ge.bog.mobilebank.loans.presentation.LoansActivity$a */
    public static final class C32569a {
        private C32569a() {
        }

        public /* synthetic */ C32569a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo74020a(Context context, LoansFlow loansFlow) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(loansFlow, "loansFlow");
            context.startActivity(C37613p.m110614a(new Intent(context, LoansActivity.class), C41233s.m119492a("LOAN_REPAYMENT_DATA", loansFlow)));
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.LoansActivity$b */
    static final class C32570b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ LoansActivity f80204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32570b(LoansActivity loansActivity) {
            super(0);
            this.f80204d = loansActivity;
        }

        /* renamed from: b */
        public final LoansFlow invoke() {
            Parcelable parcelableExtra = this.f80204d.getIntent().getParcelableExtra("LOAN_REPAYMENT_DATA");
            C41536l.m120486f(parcelableExtra);
            return (LoansFlow) parcelableExtra;
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.LoansActivity$c */
    public static final class C32571c extends FragmentManager.C1454k {

        /* renamed from: a */
        final /* synthetic */ LoansActivity f80205a;

        C32571c(LoansActivity loansActivity) {
            this.f80205a = loansActivity;
        }

        /* renamed from: k */
        public void mo4478k(FragmentManager fragmentManager, Fragment fragment) {
            C41536l.m120489i(fragmentManager, "fm");
            C41536l.m120489i(fragment, "f");
            super.mo4478k(fragmentManager, fragment);
            if (!(fragment instanceof C4963b)) {
                this.f80205a.m96240K2();
            }
        }
    }

    /* renamed from: G2 */
    private final LoansFlow m96236G2() {
        return (LoansFlow) this.f80201G.getValue();
    }

    /* renamed from: H2 */
    private final void m96237H2() {
        boolean z;
        Integer num;
        C37952f fVar = this.f80200F;
        C37952f fVar2 = null;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        C1200m3.m4286b(getWindow(), true);
        C7556l lVar = this.f80203I;
        if (lVar == null) {
            C41536l.m120506z("navController");
            lVar = null;
        }
        C7589q B = lVar.mo22111B();
        if (B == null || B.mo22214w() != C37130e.loansHistoryGraphicsFragment) {
            z = false;
        } else {
            z = true;
        }
        if (!z && (num = this.f80202H) != null) {
            getWindow().setStatusBarColor(num.intValue());
        }
        AppBarLayout appBarLayout = fVar.f91120e;
        C41536l.m120488h(appBarLayout, "appBarLayout");
        appBarLayout.setPadding(appBarLayout.getPaddingLeft(), 0, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
        FragmentContainerView fragmentContainerView = fVar.f91121f;
        C41536l.m120488h(fragmentContainerView, "navHostFragment");
        fragmentContainerView.setPadding(fragmentContainerView.getPaddingLeft(), getResources().getDimensionPixelSize(C37128c.height_toolbar), fragmentContainerView.getPaddingRight(), fragmentContainerView.getPaddingBottom());
        C37952f fVar3 = this.f80200F;
        if (fVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            fVar2 = fVar3;
        }
        FrameLayout c = fVar2.mo3946b();
        C41536l.m120488h(c, "binding.root");
        ViewGroup.LayoutParams layoutParams = c.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = 0;
            c.setLayoutParams(marginLayoutParams);
            mo74019j0(true);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: I2 */
    private final void m96238I2() {
        C37952f fVar = this.f80200F;
        C37952f fVar2 = null;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        getWindow().setStatusBarColor(0);
        fVar.f91122g.setBackground((Drawable) null);
        C1200m3.m4286b(getWindow(), false);
        FragmentContainerView fragmentContainerView = fVar.f91121f;
        C41536l.m120488h(fragmentContainerView, "navHostFragment");
        fragmentContainerView.setPadding(fragmentContainerView.getPaddingLeft(), 0, fragmentContainerView.getPaddingRight(), fragmentContainerView.getPaddingBottom());
        C37952f fVar3 = this.f80200F;
        if (fVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            fVar2 = fVar3;
        }
        ViewCompat.m3550F0(fVar2.mo3946b(), new C39069b(fVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: J2 */
    public static final WindowInsetsCompat m96239J2(C37952f fVar, View view, WindowInsetsCompat windowInsetsCompat) {
        C41536l.m120489i(fVar, "$this_with");
        C41536l.m120489i(view, "view");
        C41536l.m120489i(windowInsetsCompat, "windowInsets");
        C0829d f = windowInsetsCompat.mo3489f(WindowInsetsCompat.C1048m.m3910e());
        C41536l.m120488h(f, "windowInsets.getInsets(W…Compat.Type.systemBars())");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.leftMargin = f.f3465a;
                layoutParams2.bottomMargin = f.f3468d;
                layoutParams2.rightMargin = f.f3467c;
            }
            view.setLayoutParams(layoutParams);
            AppBarLayout appBarLayout = fVar.f91120e;
            C41536l.m120488h(appBarLayout, "appBarLayout");
            appBarLayout.setPadding(appBarLayout.getPaddingLeft(), f.f3466b, appBarLayout.getPaddingRight(), appBarLayout.getPaddingBottom());
            return WindowInsetsCompat.f3676b;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074  */
    /* renamed from: K2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m96240K2() {
        /*
            r7 = this;
            p0.l r0 = r7.f80203I
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "navController"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            p0.q r0 = r0.mo22111B()
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x001d
            int r4 = r0.mo22214w()
            int r5 = lr0.C37130e.repaymentFragment
            if (r4 != r5) goto L_0x001d
            r4 = r2
            goto L_0x001e
        L_0x001d:
            r4 = r3
        L_0x001e:
            if (r4 != 0) goto L_0x0036
            if (r0 == 0) goto L_0x002c
            int r4 = r0.mo22214w()
            int r5 = lr0.C37130e.pawnLoanFragment
            if (r4 != r5) goto L_0x002c
            r4 = r2
            goto L_0x002d
        L_0x002c:
            r4 = r3
        L_0x002d:
            if (r4 == 0) goto L_0x0030
            goto L_0x0036
        L_0x0030:
            int r4 = lr0.C37126a.f89401b
            r7.mo74018M(r4)
            goto L_0x003b
        L_0x0036:
            int r4 = lr0.C37126a.f89401b
            r7.mo74018M(r4)
        L_0x003b:
            pr0.f r4 = r7.f80200F
            if (r4 != 0) goto L_0x0045
            java.lang.String r4 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r4)
            r4 = r1
        L_0x0045:
            ge.bog.designsystem.components.toolbar.ToolbarView r4 = r4.f91122g
            if (r0 == 0) goto L_0x0052
            int r5 = r0.mo22214w()
            int r6 = lr0.C37130e.repaymentSuccessFragment
            if (r5 != r6) goto L_0x0052
            r3 = r2
        L_0x0052:
            r2 = r2 ^ r3
            r4.setNavigationEnabled(r2)
            int r2 = lr0.C37130e.loanDetailsFragment
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.List r2 = ie1.C41339p.m119900e(r2)
            if (r0 == 0) goto L_0x006a
            int r0 = r0.mo22214w()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x006a:
            boolean r0 = ie1.C41358y.m119999O(r2, r1)
            if (r0 == 0) goto L_0x0074
            r7.m96238I2()
            goto L_0x0077
        L_0x0074:
            r7.m96237H2()
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.LoansActivity.m96240K2():void");
    }

    /* renamed from: M */
    public void mo74018M(int i) {
        int d = C18368l.m62755d(this, i);
        C37952f fVar = this.f80200F;
        if (fVar == null) {
            C41536l.m120506z("binding");
            fVar = null;
        }
        fVar.f91122g.setBackgroundColor(d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        int i;
        C37952f d = C37952f.m111553d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f80200F = d;
        C7556l lVar = null;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        this.f80202H = Integer.valueOf(getWindow().getStatusBarColor());
        Fragment j0 = getSupportFragmentManager().mo4415j0(C37130e.f89448v0);
        C41536l.m120487g(j0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        this.f80203I = ((NavHostFragment) j0).mo5009k1();
        LoansFlow G2 = m96236G2();
        if (G2 instanceof LoansFlow.Details) {
            i = C37130e.loanDetailsFragment;
        } else if (G2 instanceof LoansFlow.Repayment) {
            i = C37130e.repaymentFragment;
        } else if (G2 instanceof LoansFlow.PawnLoanPayment) {
            i = C37130e.pawnLoanFragment;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        C7556l lVar2 = this.f80203I;
        if (lVar2 == null) {
            C41536l.m120506z("navController");
            lVar2 = null;
        }
        C7594s b = lVar2.mo22114F().mo22243b(C37132g.loans_nav_graph);
        b.mo22234T(i);
        C7556l lVar3 = this.f80203I;
        if (lVar3 == null) {
            C41536l.m120506z("navController");
        } else {
            lVar = lVar3;
        }
        lVar.mo22133k0(b, C0908e.m3336b(C41233s.m119492a(getString(C37133h.loans_flow_extra), m96236G2())));
        getSupportFragmentManager().mo4427o1(new C32571c(this), true);
    }

    /* renamed from: j0 */
    public void mo74019j0(boolean z) {
        Integer num;
        C7556l lVar = this.f80203I;
        C37952f fVar = null;
        if (lVar == null) {
            C41536l.m120506z("navController");
            lVar = null;
        }
        C7589q B = lVar.mo22111B();
        if (B != null) {
            num = Integer.valueOf(B.mo22214w());
        } else {
            num = null;
        }
        if (C41358y.m119999O(C41341q.m119910m(Integer.valueOf(C37130e.loanDetailsFragment), Integer.valueOf(C37130e.loansHistoryGraphicsFragment)), num)) {
            C37952f fVar2 = this.f80200F;
            if (fVar2 == null) {
                C41536l.m120506z("binding");
                fVar2 = null;
            }
            fVar2.f91122g.mo37106h0(z, true);
            C32343x.m95444e1(this, C32343x.m95476p0(this));
        }
        if (z) {
            if (C41358y.m119999O(C41341q.m119910m(Integer.valueOf(C37130e.repaymentFragment), Integer.valueOf(C37130e.pawnLoanFragment)), num)) {
                mo74018M(C37126a.f89401b);
                C37952f fVar3 = this.f80200F;
                if (fVar3 == null) {
                    C41536l.m120506z("binding");
                } else {
                    fVar = fVar3;
                }
                fVar.f91122g.mo37106h0(true, true);
                return;
            }
        }
        if (!z) {
            if (C41358y.m119999O(C41341q.m119910m(Integer.valueOf(C37130e.repaymentFragment), Integer.valueOf(C37130e.pawnLoanFragment)), num)) {
                mo74018M(C37126a.f89400a);
                C37952f fVar4 = this.f80200F;
                if (fVar4 == null) {
                    C41536l.m120506z("binding");
                } else {
                    fVar = fVar4;
                }
                fVar.f91122g.mo37106h0(false, true);
            }
        }
    }

    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
