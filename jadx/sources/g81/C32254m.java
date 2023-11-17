package g81;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import g91.C32289b0;
import g91.C32307h;
import hd0.C24978b;
import java.util.ArrayList;
import java.util.List;
import l50.C25838r;
import p341ge.bog.mobilebank.model.cards.PaymentsCard;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: g81.m */
public class C32254m extends RecyclerView.C1736h {

    /* renamed from: d */
    private List f79554d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f79555e;

    /* renamed from: f */
    private ArrayList f79556f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C32260f f79557g;

    /* renamed from: g81.m$a */
    class C32255a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C25838r f79558d;

        C32255a(C25838r rVar) {
            this.f79558d = rVar;
        }

        public void onClick(View view) {
            ManageAccountsAndCardsActivity manageAccountsAndCardsActivity = (ManageAccountsAndCardsActivity) C32254m.this.f79555e;
            C25838r rVar = this.f79558d;
            manageAccountsAndCardsActivity.mo86245U2(rVar, rVar.mo64600x() == C24978b.NO);
        }
    }

    /* renamed from: g81.m$b */
    class C32256b implements SwipeLayout.C2361e {

        /* renamed from: a */
        final /* synthetic */ int f79560a;

        C32256b(int i) {
            this.f79560a = i;
        }

        /* renamed from: a */
        public void mo7626a(boolean z, String str) {
            C32254m.this.f79557g.mo72772q(z, ((this.f79560a - 1) - C32254m.this.m94973k()) - 1);
        }
    }

    /* renamed from: g81.m$c */
    public class C32257c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79562d;

        /* renamed from: e */
        BogTextView f79563e;

        /* renamed from: f */
        ImageView f79564f;

        /* renamed from: g */
        ImageView f79565g;

        /* renamed from: h */
        View f79566h;

        public C32257c(View view) {
            super(view);
            this.f79562d = (BogTextView) view.findViewById(C10322k.card_no_tv);
            this.f79563e = (BogTextView) view.findViewById(C10322k.card_name_tv);
            this.f79564f = (ImageView) view.findViewById(C10322k.card_icon_iv);
            this.f79565g = (ImageView) view.findViewById(C10322k.favorite_icon_iv);
            this.f79566h = view.findViewById(C10322k.root_view);
        }

        /* renamed from: h */
        public void mo72771h(C25838r rVar) {
            if (rVar.mo64580f() == null || rVar.mo64580f().getFileUrl() == null) {
                this.f79564f.setImageResource(C32307h.m95225b(rVar));
            } else {
                ((C2394j) C2379b.m9210t(this.f79564f.getContext()).mo7757y(C32289b0.m95091c(rVar.mo64580f().getFileUrl())).mo7232j(C32307h.m95225b(rVar))).mo7718L0(this.f79564f);
            }
        }
    }

    /* renamed from: g81.m$d */
    public class C32258d extends RecyclerView.C1734f0 {
        public C32258d(View view) {
            super(view);
        }
    }

    /* renamed from: g81.m$e */
    public class C32259e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        SwipeLayout f79569d;

        /* renamed from: e */
        BogTextView f79570e;

        /* renamed from: f */
        BogTextView f79571f;

        /* renamed from: g */
        ImageView f79572g;

        public C32259e(View view) {
            super(view);
            this.f79569d = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
            this.f79570e = (BogTextView) view.findViewById(C10322k.card_no_tv);
            this.f79571f = (BogTextView) view.findViewById(C10322k.card_exp_tv);
            this.f79572g = (ImageView) view.findViewById(C10322k.card_ic_iv);
        }
    }

    /* renamed from: g81.m$f */
    public interface C32260f {
        /* renamed from: q */
        void mo72772q(boolean z, int i);
    }

    public C32254m(Context context, C32260f fVar) {
        this.f79555e = context;
        this.f79557g = fVar;
    }

    /* renamed from: i */
    private void m94972i(Context context, SwipeLayout swipeLayout) {
        swipeLayout.setRightSwipeItem(new SwipeLayout.C2363g("DELETE_ID", context.getString(C10328q.template_swipe_menu_delete), Integer.valueOf(C10320i.ic_swipe_delete), Integer.valueOf(C0767a.m2893c(context, C10318g.swipe_menu_delete_item_color)), Integer.valueOf(C0767a.m2893c(context, C10318g.swipe_menu_item_text_white_color)), (Integer) null, (Float) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public int m94973k() {
        List list = this.f79554d;
        if (list == null || list.size() <= 0) {
            return 0;
        }
        return 0 + this.f79554d.size();
    }

    /* renamed from: l */
    private int m94974l() {
        ArrayList arrayList = this.f79556f;
        if (arrayList == null || arrayList.size() <= 0) {
            return 0;
        }
        return 0 + this.f79556f.size();
    }

    public int getItemCount() {
        return m94973k() + 1 + 1 + m94974l();
    }

    public int getItemViewType(int i) {
        if (i == 0) {
            return 10;
        }
        if (i <= m94973k()) {
            return 20;
        }
        if (i == m94973k() + 1) {
            return 15;
        }
        return 8882;
    }

    /* renamed from: j */
    public List mo72767j() {
        return this.f79554d;
    }

    /* renamed from: m */
    public void mo72768m(List list) {
        this.f79554d = list;
        notifyDataSetChanged();
    }

    /* renamed from: n */
    public void mo72769n(ArrayList arrayList) {
        this.f79556f = arrayList;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        int itemViewType = f0Var.getItemViewType();
        if (itemViewType == 20) {
            C32257c cVar = (C32257c) f0Var;
            C25838r rVar = (C25838r) this.f79554d.get(i - 1);
            if (rVar.mo64600x() == C24978b.YES) {
                cVar.f79565g.setImageResource(C10320i.ic_favorite_filled);
            } else {
                cVar.f79565g.setImageResource(C10320i.ic_favorite);
            }
            cVar.f79565g.setOnClickListener(new C32255a(rVar));
            if (TextUtils.isEmpty(rVar.mo64584i())) {
                cVar.f79563e.setText(rVar.mo64587l());
            } else {
                cVar.f79563e.setText(rVar.mo64584i());
            }
            cVar.f79562d.setText(C32307h.m95232i(rVar.mo64593r()));
            cVar.mo72771h(rVar);
        } else if (itemViewType == 8882) {
            C32259e eVar = (C32259e) f0Var;
            PaymentsCard paymentsCard = (PaymentsCard) this.f79556f.get(((i - 1) - m94973k()) - 1);
            eVar.f79569d.setOnSwipeItemClickListener(new C32256b(i));
            eVar.f79571f.setText(paymentsCard.getExpDateStr(true));
            eVar.f79570e.setText(C32307h.m95232i(paymentsCard.getLastFour()));
            eVar.f79572g.setImageResource(C32307h.m95224a(paymentsCard.getSubProductCode()));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 10) {
            return new C32258d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.manage_cards_header_list_item, viewGroup, false));
        }
        if (i == 15) {
            return new C32258d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.saved_cards_header_list_item, viewGroup, false));
        }
        if (i == 20) {
            return new C32257c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.favorite_card_item, viewGroup, false));
        }
        if (i != 8882) {
            return null;
        }
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.saved_cards_list_item, viewGroup, false);
        m94972i(viewGroup.getContext(), (SwipeLayout) inflate);
        return new C32259e(inflate);
    }
}
