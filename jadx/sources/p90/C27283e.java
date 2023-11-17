package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.e */
public final class C27283e implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f68565d;

    /* renamed from: e */
    public final Button f68566e;

    /* renamed from: f */
    public final Guideline f68567f;

    /* renamed from: g */
    public final Guideline f68568g;

    /* renamed from: h */
    public final Guideline f68569h;

    /* renamed from: i */
    public final Guideline f68570i;

    /* renamed from: j */
    public final InlineFeedback f68571j;

    /* renamed from: k */
    public final RecyclerView f68572k;

    /* renamed from: l */
    public final Button f68573l;

    private C27283e(ConstraintLayout constraintLayout, Button button, Guideline guideline, Guideline guideline2, Guideline guideline3, Guideline guideline4, InlineFeedback inlineFeedback, RecyclerView recyclerView, Button button2) {
        this.f68565d = constraintLayout;
        this.f68566e = button;
        this.f68567f = guideline;
        this.f68568g = guideline2;
        this.f68569h = guideline3;
        this.f68570i = guideline4;
        this.f68571j = inlineFeedback;
        this.f68572k = recyclerView;
        this.f68573l = button2;
    }

    /* renamed from: a */
    public static C27283e m84431a(View view) {
        int i = C10322k.f28749I7;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C10322k.gdBot;
            Guideline guideline = (Guideline) C6202b.m24689a(view, i);
            if (guideline != null) {
                i = C10322k.gdEnd;
                Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
                if (guideline2 != null) {
                    i = C10322k.gdStart;
                    Guideline guideline3 = (Guideline) C6202b.m24689a(view, i);
                    if (guideline3 != null) {
                        i = C10322k.gdTop;
                        Guideline guideline4 = (Guideline) C6202b.m24689a(view, i);
                        if (guideline4 != null) {
                            i = C10322k.provider_info;
                            InlineFeedback inlineFeedback = (InlineFeedback) C6202b.m24689a(view, i);
                            if (inlineFeedback != null) {
                                i = C10322k.providers_recycler;
                                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                                if (recyclerView != null) {
                                    i = C10322k.f28831ex;
                                    Button button2 = (Button) C6202b.m24689a(view, i);
                                    if (button2 != null) {
                                        return new C27283e((ConstraintLayout) view, button, guideline, guideline2, guideline3, guideline4, inlineFeedback, recyclerView, button2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27283e m84432d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.action_sheet_loan_insurance_provider, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m84431a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f68565d;
    }
}
