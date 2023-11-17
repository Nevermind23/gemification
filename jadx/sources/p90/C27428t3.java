package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1360g;
import androidx.databinding.ViewDataBinding;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.p975ui.views.widgets.BigDividerView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10324m;

/* renamed from: p90.t3 */
public abstract class C27428t3 extends ViewDataBinding {

    /* renamed from: A */
    public final BogTextView f69831A;

    /* renamed from: B */
    public final BogTextView f69832B;

    /* renamed from: C */
    public final BogTextView f69833C;

    /* renamed from: D */
    public final BogTextView f69834D;

    /* renamed from: E */
    public final ImageView f69835E;

    /* renamed from: F */
    public final InlineFeedback f69836F;

    /* renamed from: G */
    public final LinearLayout f69837G;

    /* renamed from: H */
    public final ConstraintLayout f69838H;

    /* renamed from: I */
    protected Loan f69839I;

    /* renamed from: J */
    protected LoanDetailsWrapper f69840J;

    /* renamed from: K */
    protected String f69841K;

    /* renamed from: y */
    public final BigDividerView f69842y;

    /* renamed from: z */
    public final View f69843z;

    protected C27428t3(Object obj, View view, int i, BigDividerView bigDividerView, View view2, BogTextView bogTextView, BogTextView bogTextView2, BogTextView bogTextView3, BogTextView bogTextView4, ImageView imageView, InlineFeedback inlineFeedback, LinearLayout linearLayout, ConstraintLayout constraintLayout) {
        super(obj, view, i);
        this.f69842y = bigDividerView;
        this.f69843z = view2;
        this.f69831A = bogTextView;
        this.f69832B = bogTextView2;
        this.f69833C = bogTextView3;
        this.f69834D = bogTextView4;
        this.f69835E = imageView;
        this.f69836F = inlineFeedback;
        this.f69837G = linearLayout;
        this.f69838H = constraintLayout;
    }

    /* renamed from: B */
    public static C27428t3 m85020B(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        C1360g.m4684d();
        return m85021C(layoutInflater, viewGroup, z, (Object) null);
    }

    /* renamed from: C */
    public static C27428t3 m85021C(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (C27428t3) ViewDataBinding.m4664r(layoutInflater, C10324m.fragment_loan_details, viewGroup, z, obj);
    }

    /* renamed from: D */
    public abstract void mo66728D(String str);

    /* renamed from: E */
    public abstract void mo66729E(LoanDetailsWrapper loanDetailsWrapper);

    /* renamed from: F */
    public abstract void mo66730F(Loan loan);
}
