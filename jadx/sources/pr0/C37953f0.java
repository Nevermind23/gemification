package pr0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import lr0.C37130e;
import lr0.C37131f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.accountpicker.AccountPickerView;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;

/* renamed from: pr0.f0 */
public final class C37953f0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f91123d;

    /* renamed from: e */
    public final AccountPickerView f91124e;

    /* renamed from: f */
    public final Input f91125f;

    /* renamed from: g */
    public final LayerView f91126g;

    /* renamed from: h */
    public final EmptyWidget f91127h;

    /* renamed from: i */
    public final RecyclerView f91128i;

    /* renamed from: j */
    public final NestedScrollView f91129j;

    /* renamed from: k */
    public final LinearLayout f91130k;

    /* renamed from: l */
    public final LayerView f91131l;

    /* renamed from: m */
    public final FixedButtonView f91132m;

    /* renamed from: n */
    public final EmptyWidget f91133n;

    /* renamed from: o */
    public final CheckboxView f91134o;

    /* renamed from: p */
    public final FrameLayout f91135p;

    private C37953f0(ConstraintLayout constraintLayout, AccountPickerView accountPickerView, Input input, LayerView layerView, EmptyWidget emptyWidget, RecyclerView recyclerView, NestedScrollView nestedScrollView, LinearLayout linearLayout, LayerView layerView2, FixedButtonView fixedButtonView, EmptyWidget emptyWidget2, CheckboxView checkboxView, FrameLayout frameLayout) {
        this.f91123d = constraintLayout;
        this.f91124e = accountPickerView;
        this.f91125f = input;
        this.f91126g = layerView;
        this.f91127h = emptyWidget;
        this.f91128i = recyclerView;
        this.f91129j = nestedScrollView;
        this.f91130k = linearLayout;
        this.f91131l = layerView2;
        this.f91132m = fixedButtonView;
        this.f91133n = emptyWidget2;
        this.f91134o = checkboxView;
        this.f91135p = frameLayout;
    }

    /* renamed from: a */
    public static C37953f0 m111557a(View view) {
        View view2 = view;
        int i = C37130e.f89428a;
        AccountPickerView accountPickerView = (AccountPickerView) C6202b.m24689a(view2, i);
        if (accountPickerView != null) {
            i = C37130e.f89434l;
            Input input = (Input) C6202b.m24689a(view2, i);
            if (input != null) {
                i = C37130e.pawn_loan_container;
                LayerView layerView = (LayerView) C6202b.m24689a(view2, i);
                if (layerView != null) {
                    i = C37130e.pawn_loan_details_title;
                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view2, i);
                    if (emptyWidget != null) {
                        i = C37130e.pawn_loan_repayment_details;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view2, i);
                        if (recyclerView != null) {
                            i = C37130e.pawn_nested_scroll;
                            NestedScrollView nestedScrollView = (NestedScrollView) C6202b.m24689a(view2, i);
                            if (nestedScrollView != null) {
                                i = C37130e.pawn_parent_linear_layout;
                                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view2, i);
                                if (linearLayout != null) {
                                    i = C37130e.pawn_payment_details_container;
                                    LayerView layerView2 = (LayerView) C6202b.m24689a(view2, i);
                                    if (layerView2 != null) {
                                        i = C37130e.f89424J0;
                                        FixedButtonView fixedButtonView = (FixedButtonView) C6202b.m24689a(view2, i);
                                        if (fixedButtonView != null) {
                                            i = C37130e.payment_details_title;
                                            EmptyWidget emptyWidget2 = (EmptyWidget) C6202b.m24689a(view2, i);
                                            if (emptyWidget2 != null) {
                                                i = C37130e.f89444s1;
                                                CheckboxView checkboxView = (CheckboxView) C6202b.m24689a(view2, i);
                                                if (checkboxView != null) {
                                                    i = C37130e.f89445t1;
                                                    FrameLayout frameLayout = (FrameLayout) C6202b.m24689a(view2, i);
                                                    if (frameLayout != null) {
                                                        return new C37953f0((ConstraintLayout) view2, accountPickerView, input, layerView, emptyWidget, recyclerView, nestedScrollView, linearLayout, layerView2, fixedButtonView, emptyWidget2, checkboxView, frameLayout);
                                                    }
                                                }
                                            }
                                        }
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
    public static C37953f0 m111558d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37131f.pawnloan_fragment, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m111557a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f91123d;
    }
}
