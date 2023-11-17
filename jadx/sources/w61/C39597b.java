package w61;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.transfers.model.TransferContactAccount;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43075l;

/* renamed from: w61.b */
public final class C39597b extends RecyclerView.C1736h {

    /* renamed from: h */
    public static final C39599b f94096h = new C39599b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final ArrayList f94097d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C43075l f94098e;

    /* renamed from: f */
    private boolean f94099f;

    /* renamed from: g */
    private String f94100g;

    /* renamed from: w61.b$a */
    public final class C39598a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final ImageView f94101d;

        /* renamed from: e */
        private final TextView f94102e;

        /* renamed from: f */
        private final TextView f94103f;

        /* renamed from: g */
        private final ImageView f94104g;

        /* renamed from: h */
        final /* synthetic */ C39597b f94105h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39598a(C39597b bVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f94105h = bVar;
            View findViewById = view.findViewById(C10322k.f28731F7);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.check_image)");
            this.f94101d = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C10322k.budget_account_text);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.budget_account_text)");
            this.f94102e = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.budget_account_name_text);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.…budget_account_name_text)");
            this.f94103f = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C10322k.f28787Rd);
            C41536l.m120488h(findViewById4, "itemView.findViewById(R.id.favorite_image)");
            this.f94104g = (ImageView) findViewById4;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m115076j(C39597b bVar, TransferContactAccount transferContactAccount, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(transferContactAccount, "$account");
            bVar.mo93262j(transferContactAccount.getAccountNumber());
            C43075l f = bVar.f94098e;
            if (f != null) {
                f.invoke(transferContactAccount.getAccountNumber());
            }
        }

        /* renamed from: i */
        public final void mo93263i(TransferContactAccount transferContactAccount) {
            C41536l.m120489i(transferContactAccount, "account");
            this.f94102e.setText(transferContactAccount.getAccountNumber());
            this.f94103f.setText(transferContactAccount.getBudgetName());
            C32343x.m95483r1(this.f94101d, C41536l.m120484d(transferContactAccount.getAccountNumber(), this.f94105h.mo93259g()), false, 2, (Object) null);
            C32343x.m95483r1(this.f94104g, transferContactAccount.isFavorite(), false, 2, (Object) null);
            this.itemView.setOnClickListener(new C39596a(this.f94105h, transferContactAccount));
        }
    }

    /* renamed from: w61.b$b */
    public static final class C39599b {
        private C39599b() {
        }

        public /* synthetic */ C39599b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: w61.b$c */
    public final class C39600c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final ImageView f94106d;

        /* renamed from: e */
        private final TextView f94107e;

        /* renamed from: f */
        private final ImageView f94108f;

        /* renamed from: g */
        final /* synthetic */ C39597b f94109g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39600c(C39597b bVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f94109g = bVar;
            View findViewById = view.findViewById(C10322k.bank_logo_image);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.bank_logo_image)");
            this.f94106d = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C10322k.f28771N);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.account_number_text)");
            this.f94107e = (TextView) findViewById2;
            View findViewById3 = view.findViewById(C10322k.f28787Rd);
            C41536l.m120488h(findViewById3, "itemView.findViewById(R.id.favorite_image)");
            this.f94108f = (ImageView) findViewById3;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m115079j(C39597b bVar, TransferContactAccount transferContactAccount, View view) {
            C41536l.m120489i(bVar, "this$0");
            C41536l.m120489i(transferContactAccount, "$account");
            bVar.mo93262j(transferContactAccount.getAccountNumber());
            C43075l f = bVar.f94098e;
            if (f != null) {
                f.invoke(transferContactAccount.getAccountNumber());
            }
        }

        /* renamed from: i */
        public final void mo93264i(TransferContactAccount transferContactAccount) {
            Drawable drawable;
            C41536l.m120489i(transferContactAccount, "account");
            if (transferContactAccount.getBankDrawableRes() == -1) {
                this.f94106d.setImageDrawable((Drawable) null);
            } else {
                this.f94106d.setImageResource(transferContactAccount.getBankDrawableRes());
            }
            this.f94107e.setText(transferContactAccount.getAccountNumber());
            Context context = this.f94107e.getContext();
            TextView textView = this.f94107e;
            if (C41536l.m120484d(this.f94109g.mo93259g(), transferContactAccount.getAccountNumber())) {
                drawable = context.getDrawable(C10320i.ic_tick_vector);
            } else {
                drawable = null;
            }
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
            C32343x.m95483r1(this.f94108f, transferContactAccount.isFavorite(), false, 2, (Object) null);
            this.itemView.setOnClickListener(new C39601c(this.f94109g, transferContactAccount));
        }
    }

    /* renamed from: g */
    public final String mo93259g() {
        return this.f94100g;
    }

    public int getItemCount() {
        return this.f94097d.size();
    }

    public int getItemViewType(int i) {
        return this.f94099f ? 2 : 1;
    }

    /* renamed from: h */
    public final void mo93260h(C43075l lVar) {
        C41536l.m120489i(lVar, "onAccountSelected");
        this.f94098e = lVar;
    }

    /* renamed from: i */
    public final void mo93261i(List list, boolean z) {
        C41536l.m120489i(list, "accounts");
        this.f94099f = z;
        this.f94097d.clear();
        this.f94097d.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: j */
    public final void mo93262j(String str) {
        this.f94100g = str;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        Object obj = this.f94097d.get(i);
        C41536l.m120488h(obj, "accounts[position]");
        TransferContactAccount transferContactAccount = (TransferContactAccount) obj;
        if (f0Var instanceof C39600c) {
            ((C39600c) f0Var).mo93264i(transferContactAccount);
        } else if (f0Var instanceof C39598a) {
            ((C39598a) f0Var).mo93263i(transferContactAccount);
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == 2) {
            return new C39598a(this, C32343x.m95467m0(viewGroup, C10324m.item_select_budget_account, false));
        }
        return new C39600c(this, C32343x.m95467m0(viewGroup, C10324m.item_select_contct_account, false));
    }
}
