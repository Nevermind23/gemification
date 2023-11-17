package iy0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import hy0.C36271e;
import hy0.C36272f;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.thumbnailpicker.ThumbnailPickerView;

/* renamed from: iy0.q0 */
public final class C36627q0 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f88388d;

    /* renamed from: e */
    public final TextView f88389e;

    /* renamed from: f */
    public final Barrier f88390f;

    /* renamed from: g */
    public final TextView f88391g;

    /* renamed from: h */
    public final TextView f88392h;

    /* renamed from: i */
    public final ThumbnailPickerView f88393i;

    /* renamed from: j */
    public final TextView f88394j;

    private C36627q0(ConstraintLayout constraintLayout, TextView textView, Barrier barrier, TextView textView2, TextView textView3, ThumbnailPickerView thumbnailPickerView, TextView textView4) {
        this.f88388d = constraintLayout;
        this.f88389e = textView;
        this.f88390f = barrier;
        this.f88391g = textView2;
        this.f88392h = textView3;
        this.f88393i = thumbnailPickerView;
        this.f88394j = textView4;
    }

    /* renamed from: a */
    public static C36627q0 m108643a(View view) {
        int i = C36271e.f87527k;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C36271e.f87543s;
            Barrier barrier = (Barrier) C6202b.m24689a(view, i);
            if (barrier != null) {
                i = C36271e.bonus;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C36271e.category;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        i = C36271e.f87489H0;
                        ThumbnailPickerView thumbnailPickerView = (ThumbnailPickerView) C6202b.m24689a(view, i);
                        if (thumbnailPickerView != null) {
                            i = C36271e.operation_title;
                            TextView textView4 = (TextView) C6202b.m24689a(view, i);
                            if (textView4 != null) {
                                return new C36627q0((ConstraintLayout) view, textView, barrier, textView2, textView3, thumbnailPickerView, textView4);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C36627q0 m108644d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C36272f.item_account_operation_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m108643a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f88388d;
    }
}
