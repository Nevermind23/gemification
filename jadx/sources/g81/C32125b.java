package g81;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32355x0;
import j81.C36759a;
import java.util.List;
import l50.C25838r;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountCardItemView;
import p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout;
import p366bk.C10319h;
import p366bk.C10322k;

/* renamed from: g81.b */
public class C32125b extends RecyclerView.C1736h {

    /* renamed from: d */
    private Context f79070d;

    /* renamed from: e */
    private List f79071e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C36759a f79072f;

    /* renamed from: g81.b$a */
    public class C32126a extends RecyclerView.C1734f0 implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public AccountCardItemView f79073d;

        public C32126a(View view) {
            super(view);
            this.f79073d = (AccountCardItemView) view;
            view.setOnClickListener(this);
            this.f79073d.setOnCardActivateButtonClickedListener(new C32123a(this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public void m94633j(C25838r rVar) {
            C32125b.this.f79072f.mo86627F0(rVar);
        }

        /* renamed from: k */
        public void mo72607k(boolean z) {
            ((OurSwipeLayout) this.f79073d.findViewById(C10322k.swipe_layout)).close(z, true);
        }

        public void onClick(View view) {
            C32125b.this.f79072f.mo48298Z0(getAdapterPosition());
            ((OurSwipeLayout) this.f79073d.findViewById(C10322k.swipe_layout)).close(false, true);
        }
    }

    public C32125b(Context context, List list) {
        this.f79070d = context;
        this.f79071e = list;
    }

    /* renamed from: g */
    public void mo72605g(List list) {
        this.f79071e = list;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        List list = this.f79071e;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    /* renamed from: h */
    public void mo72606h(C36759a aVar) {
        this.f79072f = aVar;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C32126a aVar = (C32126a) f0Var;
        aVar.f79073d.setCard((C25838r) this.f79071e.get(i), i);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        if (i == 0) {
            layoutParams.topMargin = C32355x0.m95516g(C10319h.item_default_margin);
        } else {
            layoutParams.topMargin = C32355x0.m95516g(C10319h.account_card_item_two_dp);
        }
        layoutParams.bottomMargin = C32355x0.m95516g(C10319h.account_card_item_two_dp);
        aVar.f79073d.setLayoutParams(layoutParams);
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C32126a(new AccountCardItemView(this.f79070d));
    }
}
