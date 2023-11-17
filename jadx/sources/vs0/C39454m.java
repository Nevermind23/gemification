package vs0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.recyclerview.widget.RecyclerView;
import p086g1.C6201a;
import p086g1.C6202b;
import p341ge.bog.designsystem.components.emptywidget.EmptyWidget;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import rs0.C38336c;
import rs0.C38337d;

/* renamed from: vs0.m */
public final class C39454m implements C6201a {

    /* renamed from: d */
    private final LinearLayoutCompat f93820d;

    /* renamed from: e */
    public final PageDescriptionView f93821e;

    /* renamed from: f */
    public final TextGroupView f93822f;

    /* renamed from: g */
    public final RecyclerView f93823g;

    /* renamed from: h */
    public final EmptyWidget f93824h;

    /* renamed from: i */
    public final EmptyWidget f93825i;

    /* renamed from: j */
    public final TextGroupView f93826j;

    private C39454m(LinearLayoutCompat linearLayoutCompat, PageDescriptionView pageDescriptionView, TextGroupView textGroupView, RecyclerView recyclerView, EmptyWidget emptyWidget, EmptyWidget emptyWidget2, TextGroupView textGroupView2) {
        this.f93820d = linearLayoutCompat;
        this.f93821e = pageDescriptionView;
        this.f93822f = textGroupView;
        this.f93823g = recyclerView;
        this.f93824h = emptyWidget;
        this.f93825i = emptyWidget2;
        this.f93826j = textGroupView2;
    }

    /* renamed from: a */
    public static C39454m m114671a(View view) {
        int i = C38336c.f91858N;
        PageDescriptionView pageDescriptionView = (PageDescriptionView) C6202b.m24689a(view, i);
        if (pageDescriptionView != null) {
            i = C38336c.monthly_amount;
            TextGroupView textGroupView = (TextGroupView) C6202b.m24689a(view, i);
            if (textGroupView != null) {
                i = C38336c.piggyBankHistoryRecycler;
                RecyclerView recyclerView = (RecyclerView) C6202b.m24689a(view, i);
                if (recyclerView != null) {
                    i = C38336c.piggy_stats;
                    EmptyWidget emptyWidget = (EmptyWidget) C6202b.m24689a(view, i);
                    if (emptyWidget != null) {
                        i = C38336c.stats_header;
                        EmptyWidget emptyWidget2 = (EmptyWidget) C6202b.m24689a(view, i);
                        if (emptyWidget2 != null) {
                            i = C38336c.f91901y1;
                            TextGroupView textGroupView2 = (TextGroupView) C6202b.m24689a(view, i);
                            if (textGroupView2 != null) {
                                return new C39454m((LinearLayoutCompat) view, pageDescriptionView, textGroupView, recyclerView, emptyWidget, emptyWidget2, textGroupView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: d */
    public static C39454m m114672d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(C38337d.fragment_piggy_bank_history, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return m114671a(inflate);
    }

    /* renamed from: c */
    public LinearLayoutCompat mo3946b() {
        return this.f93820d;
    }
}
