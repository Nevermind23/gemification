package p90;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import p086g1.C6201a;
import p086g1.C6202b;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: p90.u4 */
public final class C27438u4 implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f69961d;

    /* renamed from: e */
    public final TextView f69962e;

    /* renamed from: f */
    public final Group f69963f;

    /* renamed from: g */
    public final TextView f69964g;

    /* renamed from: h */
    public final TextView f69965h;

    /* renamed from: i */
    public final TextView f69966i;

    /* renamed from: j */
    public final TextView f69967j;

    private C27438u4(ConstraintLayout constraintLayout, TextView textView, Group group, TextView textView2, TextView textView3, TextView textView4, TextView textView5) {
        this.f69961d = constraintLayout;
        this.f69962e = textView;
        this.f69963f = group;
        this.f69964g = textView2;
        this.f69965h = textView3;
        this.f69966i = textView4;
        this.f69967j = textView5;
    }

    /* renamed from: a */
    public static C27438u4 m85062a(View view) {
        int i = C10322k.operations_amount_text;
        TextView textView = (TextView) C6202b.m24689a(view, i);
        if (textView != null) {
            i = C10322k.remaining_amount_group;
            Group group = (Group) C6202b.m24689a(view, i);
            if (group != null) {
                i = C10322k.remaining_amount_label_text;
                TextView textView2 = (TextView) C6202b.m24689a(view, i);
                if (textView2 != null) {
                    i = C10322k.remaining_amount_text;
                    TextView textView3 = (TextView) C6202b.m24689a(view, i);
                    if (textView3 != null) {
                        i = C10322k.split_amount_label_text;
                        TextView textView4 = (TextView) C6202b.m24689a(view, i);
                        if (textView4 != null) {
                            i = C10322k.split_amount_text;
                            TextView textView5 = (TextView) C6202b.m24689a(view, i);
                            if (textView5 != null) {
                                return new C27438u4((ConstraintLayout) view, textView, group, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C27438u4 m85063d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C10324m.item_bill_split_distributed_amounts, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m85062a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f69961d;
    }
}
