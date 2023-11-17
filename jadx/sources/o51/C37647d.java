package o51;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import n51.C37356b;
import n51.C37357c;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.search.SearchView;

/* renamed from: o51.d */
public final class C37647d implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f90436d;

    /* renamed from: e */
    public final Button f90437e;

    /* renamed from: f */
    public final Button f90438f;

    /* renamed from: g */
    public final LinearLayout f90439g;

    /* renamed from: h */
    public final RecyclerView f90440h;

    /* renamed from: i */
    public final SearchView f90441i;

    private C37647d(ConstraintLayout constraintLayout, Button button, Button button2, LinearLayout linearLayout, RecyclerView recyclerView, SearchView searchView) {
        this.f90436d = constraintLayout;
        this.f90437e = button;
        this.f90438f = button2;
        this.f90439g = linearLayout;
        this.f90440h = recyclerView;
        this.f90441i = searchView;
    }

    /* renamed from: a */
    public static C37647d m110680a(View view) {
        int i = C37356b.button_clear;
        Button button = (Button) C6202b.m24689a(view, i);
        if (button != null) {
            i = C37356b.button_filter;
            Button button2 = (Button) C6202b.m24689a(view, i);
            if (button2 != null) {
                i = C37356b.f89825j;
                LinearLayout linearLayout = (LinearLayout) C6202b.m24689a(view, i);
                if (linearLayout != null) {
                    i = C37356b.categories_recycler;
                    RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                    if (recyclerView != null) {
                        i = C37356b.f89833p0;
                        SearchView searchView = (SearchView) C6202b.m24689a(view, i);
                        if (searchView != null) {
                            return new C37647d((ConstraintLayout) view, button, button2, linearLayout, recyclerView, searchView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C37647d m110681d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C37357c.action_sheet_statements_categories, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m110680a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f90436d;
    }
}
