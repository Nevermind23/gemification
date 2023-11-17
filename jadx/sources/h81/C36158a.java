package h81;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g81.C32148f;
import g91.C32303f;
import j81.C36760b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import p341ge.bog.mobilebank.model.bonus.BonusPrize;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: h81.a */
public class C36158a extends C32148f {

    /* renamed from: h */
    private String f87342h;

    /* renamed from: i */
    private List f87343i = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C36760b f87344j;

    /* renamed from: h81.a$a */
    class C36159a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ BonusPrize f87345d;

        C36159a(BonusPrize bonusPrize) {
            this.f87345d = bonusPrize;
        }

        public void onClick(View view) {
            if (C36158a.this.f87344j != null) {
                C36158a.this.f87344j.mo89648G0(this.f87345d);
            }
        }
    }

    /* renamed from: h81.a$b */
    private static class C36160b extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TextView f87347d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public TextView f87348e;

        public C36160b(View view) {
            super(view);
            this.f87347d = (TextView) view.findViewById(C10322k.prize_name);
            this.f87348e = (TextView) view.findViewById(C10322k.prize_cost);
        }
    }

    /* renamed from: h81.a$c */
    private static class C36161c extends RecyclerView.C1734f0 {
        /* access modifiers changed from: private */

        /* renamed from: d */
        public TextView f87349d;

        public C36161c(View view) {
            super(view);
            this.f87349d = (TextView) view.findViewById(C10322k.spent_points);
        }
    }

    /* renamed from: g */
    public int mo72656g() {
        return this.f87343i.size() + 1;
    }

    /* renamed from: h */
    public int mo72657h(int i) {
        return i == 0 ? 0 : 1;
    }

    /* renamed from: k */
    public void mo72658k(RecyclerView.C1734f0 f0Var, int i) {
        if (f0Var instanceof C36161c) {
            ((C36161c) f0Var).f87349d.setText(this.f87342h);
            return;
        }
        BonusPrize bonusPrize = (BonusPrize) this.f87343i.get(i - 1);
        C36160b bVar = (C36160b) f0Var;
        bVar.f87347d.setText(bonusPrize.getPrizeName());
        bVar.f87348e.setText(C32303f.m95206q((double) bonusPrize.getPrizeCost()));
        f0Var.itemView.setOnClickListener(new C36159a(bonusPrize));
    }

    /* renamed from: l */
    public RecyclerView.C1734f0 mo72659l(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 0) {
            return new C36161c(from.inflate(C10324m.mr_spent_points_item, viewGroup, false));
        }
        return new C36160b(from.inflate(C10324m.mr_history_item, viewGroup, false));
    }

    /* renamed from: q */
    public void mo88914q(C36760b bVar) {
        this.f87344j = bVar;
    }

    /* renamed from: r */
    public void mo88915r(List list) {
        this.f87343i.clear();
        this.f87343i.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: s */
    public void mo88916s(BigDecimal bigDecimal) {
        if (bigDecimal != null) {
            this.f87342h = C32303f.m95206q(bigDecimal.doubleValue());
            notifyItemChanged(0);
        }
    }
}
