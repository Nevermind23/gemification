package g81;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32290b1;
import g91.C32303f;
import g91.C32314k;
import g91.C32335t0;
import java.util.ArrayList;
import p341ge.bog.mobilebank.model.account.ManageableAccount;
import p341ge.bog.mobilebank.p975ui.activities.ManageAccountsAndCardsActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: g81.l */
public class C32240l extends RecyclerView.C1736h {

    /* renamed from: d */
    private ArrayList f79512d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f79513e;

    /* renamed from: g81.l$a */
    class C32241a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ ManageableAccount f79514d;

        C32241a(ManageableAccount manageableAccount) {
            this.f79514d = manageableAccount;
        }

        public void onClick(View view) {
            ManageableAccount manageableAccount = this.f79514d;
            ((ManageAccountsAndCardsActivity) C32240l.this.f79513e).mo86244T2(manageableAccount, !manageableAccount.isDefault());
        }
    }

    /* renamed from: g81.l$b */
    class C32242b implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ ManageableAccount f79516d;

        C32242b(ManageableAccount manageableAccount) {
            this.f79516d = manageableAccount;
        }

        public void onClick(View view) {
            ManageableAccount manageableAccount = this.f79516d;
            ((ManageAccountsAndCardsActivity) C32240l.this.f79513e).mo86248X2(manageableAccount, !manageableAccount.isHidden());
        }
    }

    /* renamed from: g81.l$c */
    public class C32243c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        BogTextView f79518d;

        /* renamed from: e */
        BogTextView f79519e;

        /* renamed from: f */
        ImageView f79520f;

        /* renamed from: g */
        BogImageView f79521g;

        public C32243c(View view) {
            super(view);
            this.f79518d = (BogTextView) view.findViewById(C10322k.acct_name_tv);
            this.f79519e = (BogTextView) view.findViewById(C10322k.acct_amt_tv);
            this.f79520f = (ImageView) view.findViewById(C10322k.hide_icon_iv);
            this.f79521g = (BogImageView) view.findViewById(C10322k.favorite_icon_iv);
        }
    }

    /* renamed from: g81.l$d */
    public class C32244d extends RecyclerView.C1734f0 {
        public C32244d(View view) {
            super(view);
        }
    }

    public C32240l(Context context) {
        this.f79513e = context;
    }

    /* renamed from: g */
    public void mo72760g(ArrayList arrayList) {
        this.f79512d = arrayList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        ArrayList arrayList = this.f79512d;
        if (arrayList == null || arrayList.size() <= 0) {
            return 1;
        }
        return 1 + this.f79512d.size();
    }

    public int getItemViewType(int i) {
        return i == 0 ? 10 : 20;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        int i2;
        String str;
        if (f0Var.getItemViewType() == 20) {
            C32243c cVar = (C32243c) f0Var;
            ManageableAccount manageableAccount = (ManageableAccount) this.f79512d.get(i - 1);
            if (manageableAccount.isDefault()) {
                cVar.f79521g.setImageResource(C10320i.ic_favorite_filled);
                if (C32335t0.m95361f() != 0) {
                    cVar.f79521g.applyAccentTint();
                }
            } else {
                cVar.f79521g.setImageResource(C10320i.ic_favorite);
            }
            if (manageableAccount.isHidden()) {
                cVar.f79520f.setImageResource(C10320i.ic_pref_hide_off);
                BogTextView bogTextView = cVar.f79518d;
                Context context = this.f79513e;
                int i3 = C10318g.f28627N0;
                bogTextView.setTextColor(C0767a.m2893c(context, i3));
                cVar.f79519e.setTextColor(C0767a.m2893c(this.f79513e, i3));
            } else {
                Context context2 = this.f79513e;
                cVar.f79520f.setImageDrawable(C32290b1.m95122l(context2, C0767a.m2895e(context2, C10320i.ic_pref_hide_on), C32335t0.m95367l(this.f79513e, true)));
                BogTextView bogTextView2 = cVar.f79518d;
                Context context3 = this.f79513e;
                int i4 = C10318g.f28630R0;
                bogTextView2.setTextColor(C0767a.m2893c(context3, i4));
                cVar.f79519e.setTextColor(C0767a.m2893c(this.f79513e, i4));
            }
            cVar.f79521g.setOnClickListener(new C32241a(manageableAccount));
            cVar.f79520f.setOnClickListener(new C32242b(manageableAccount));
            Context context4 = this.f79513e;
            if (manageableAccount.isHidden()) {
                i2 = C10318g.f28627N0;
            } else {
                i2 = C10318g.f28630R0;
            }
            int c = C0767a.m2893c(context4, i2);
            cVar.f79518d.setTextColor(c);
            cVar.f79519e.setTextColor(c);
            BogTextView bogTextView3 = cVar.f79518d;
            if (TextUtils.isEmpty(manageableAccount.getAcctName())) {
                str = manageableAccount.getPrintAcctNo();
            } else {
                str = manageableAccount.getAcctName();
            }
            bogTextView3.setText(str);
            cVar.f79519e.setText(String.format("%s%s", new Object[]{C32303f.m95204o(manageableAccount.getAvailableAmount().doubleValue()), C32314k.m95245a(manageableAccount.getCcy())}));
        }
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 10) {
            return new C32244d(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.manage_accounts_header_list_item, viewGroup, false));
        }
        if (i != 20) {
            return null;
        }
        return new C32243c(LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.favorite_or_hidden_acct_item, viewGroup, false));
    }
}
