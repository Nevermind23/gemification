package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.n */
public final class C39455n implements C6201a {

    /* renamed from: d */
    private final ConstraintLayout f93827d;

    /* renamed from: e */
    public final Guideline f93828e;

    /* renamed from: f */
    public final Guideline f93829f;

    /* renamed from: g */
    public final AppCompatImageView f93830g;

    /* renamed from: h */
    public final AppCompatTextView f93831h;

    /* renamed from: i */
    public final RecyclerView f93832i;

    private C39455n(ConstraintLayout constraintLayout, Guideline guideline, Guideline guideline2, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView, RecyclerView recyclerView) {
        this.f93827d = constraintLayout;
        this.f93828e = guideline;
        this.f93829f = guideline2;
        this.f93830g = appCompatImageView;
        this.f93831h = appCompatTextView;
        this.f93832i = recyclerView;
    }

    /* renamed from: a */
    public static C39455n m114675a(View view) {
        int i = C38336c.f91865Z;
        Guideline guideline = (Guideline) C6202b.m24689a(view, i);
        if (guideline != null) {
            i = C38336c.f91866a0;
            Guideline guideline2 = (Guideline) C6202b.m24689a(view, i);
            if (guideline2 != null) {
                i = C38336c.piggy_bank_image;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C6202b.m24689a(view, i);
                if (appCompatImageView != null) {
                    i = C38336c.piggy_bank_news;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C6202b.m24689a(view, i);
                    if (appCompatTextView != null) {
                        i = C38336c.piggy_bank_news_recycler;
                        RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                        if (recyclerView != null) {
                            return new C39455n((ConstraintLayout) view, guideline, guideline2, appCompatImageView, appCompatTextView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39455n m114676d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.fragment_piggy_bank_info_card, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114675a(inflate);
    }

    /* renamed from: c */
    public ConstraintLayout mo3946b() {
        return this.f93827d;
    }
}
