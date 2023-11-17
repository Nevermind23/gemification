package a91;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32303f;
import g91.C32335t0;
import g91.C32355x0;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.Iterator;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountItemView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10316e;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: a91.a */
public class C30865a extends C37106c implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList f76868d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public RecyclerView f76869e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f76870f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f76871g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C30869d f76872h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f76873i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public String f76874j;

    /* renamed from: k */
    int f76875k = -1;

    /* renamed from: l */
    private boolean f76876l;

    /* renamed from: m */
    private Client f76877m;

    /* renamed from: n */
    private boolean f76878n;

    /* renamed from: o */
    int f76879o = 11;

    /* renamed from: p */
    int f76880p = 10;

    /* renamed from: a91.a$a */
    class C30866a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ View f76881d;

        /* renamed from: e */
        final /* synthetic */ int f76882e;

        C30866a(View view, int i) {
            this.f76881d = view;
            this.f76882e = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C32290b1.m95124n(this.f76881d, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            if (this.f76882e >= 0) {
                C30865a.this.f76869e.getLayoutManager().mo5197J1(this.f76882e);
            }
        }
    }

    /* renamed from: a91.a$b */
    class C30867b implements Animator.AnimatorListener {
        C30867b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C30865a.this.m91976M();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: a91.a$c */
    private class C30868c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f76885a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f76886b;

        public C30868c(int i, int i2) {
            this.f76885a = i;
            this.f76886b = i2;
        }
    }

    /* renamed from: a91.a$d */
    public interface C30869d {
        /* renamed from: g */
        void mo71050g(int i, int i2, boolean z);
    }

    /* renamed from: a91.a$e */
    public class C30870e extends C37107d implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public LinearLayout f76888f = ((LinearLayout) mo90036h(C10322k.wizard_account_item_sub_accounts));
        /* access modifiers changed from: private */

        /* renamed from: g */
        public View f76889g = mo90036h(C10322k.wizard_account_item_outer_rect);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View[] f76890h = new View[5];

        public C30870e(View view) {
            super(view);
            this.f76890h[0] = mo90036h(C10322k.first_sub_account);
            this.f76890h[1] = mo90036h(C10322k.second_sub_account);
            this.f76890h[2] = mo90036h(C10322k.third_sub_account);
            this.f76890h[3] = mo90036h(C10322k.fourth_sub_account);
            this.f76890h[4] = mo90036h(C10322k.fifth_sub_account);
            ((View) view.getTag()).setTag(this.f76888f);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            boolean z;
            int i;
            View findViewById;
            Iterator<AccountLov> it = ((AccountLov) C30865a.this.f76868d.get(getAdapterPosition())).getSubAccounts().iterator();
            int i2 = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                AccountLov next = it.next();
                if (((AccountLov) C30865a.this.f76868d.get(getAdapterPosition())).getMainAcctKey() != next.getId()) {
                    i2++;
                } else if (next.getId() == C30865a.this.f76873i || C32359z0.m95598z(C30865a.this.f76874j, next.getCcy())) {
                    if (i2 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                }
            }
            for (View view2 : this.f76890h) {
                if (view2.getVisibility() != 8) {
                    view2.setVisibility(8);
                }
            }
            if (C30865a.this.f76870f != getAdapterPosition()) {
                z = false;
            }
            int p = C30865a.this.f76870f;
            if (!z) {
                C30865a.this.f76875k = getAdapterPosition();
                C30865a.this.f76870f = getAdapterPosition();
                C30865a.this.f76871g = i2;
            }
            C30865a.this.f76872h.mo71050g(C30865a.this.f76870f, C30865a.this.f76871g, !z);
            if (!z) {
                i = C30865a.this.m91991x(getAdapterPosition());
            } else {
                i = 0;
            }
            C30865a.this.m91989v(this.f76888f, i, getAdapterPosition());
            if (!z) {
                View O = C30865a.this.f76869e.getLayoutManager().mo5199O(p);
                if (O != null && (findViewById = O.findViewById(C10322k.wizard_account_item_sub_accounts)) != null) {
                    C30865a.this.m91989v(findViewById, 0, -1);
                    return;
                }
                return;
            }
            C30865a.this.f76871g = -1;
            C30865a.this.f76870f = -1;
        }
    }

    public C30865a(RecyclerView recyclerView, Client client) {
        this.f76869e = recyclerView;
        this.f76877m = client;
    }

    /* renamed from: K */
    private void m91974K(BogTextView bogTextView, boolean z) {
        if (z) {
            bogTextView.setBackgroundResource(C32335t0.m95363h(C10316e.account_orange_circle));
        } else {
            bogTextView.setBackgroundResource(C10320i.white_stroke_circle);
        }
    }

    /* renamed from: L */
    private void m91975L(View[] viewArr, int i) {
        boolean z;
        AccountLov w = m91990w(this.f76870f);
        if (w != null) {
            ArrayList<AccountLov> subAccounts = w.getSubAccounts();
            for (int size = subAccounts.size(); size < 5; size++) {
                if (viewArr[size].getVisibility() != 8) {
                    viewArr[size].setVisibility(8);
                }
            }
            for (int i2 = 0; i2 < subAccounts.size(); i2++) {
                View view = viewArr[i2];
                if (this.f76873i != subAccounts.get(i2).getId() && !C32359z0.m95598z(this.f76874j, subAccounts.get(i2).getCcy())) {
                    if (!(i == this.f76879o || view.getVisibility() == 4)) {
                        view.setVisibility(4);
                    }
                    view.setTag(new C30868c(this.f76870f, i2));
                    if (i != this.f76879o) {
                        view.setAlpha(Utils.FLOAT_EPSILON);
                        view.setScaleX(0.95f);
                        view.setScaleY(0.95f);
                        if (view.getVisibility() != 0) {
                            view.setVisibility(0);
                        }
                        view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setStartDelay((long) (i2 * 50));
                    }
                    BogTextView bogTextView = (BogTextView) view.findViewById(C10322k.account_sub_item_ccy_logo_tv);
                    bogTextView.setText(C32303f.m95198i(subAccounts.get(i2).getCcy(), false));
                    if (this.f76871g == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m91974K(bogTextView, z);
                    view.setOnClickListener(this);
                } else if (view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public void m91976M() {
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public void m91989v(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getHeight(), i});
        ofInt.setDuration(400);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C30866a(view, i2));
        ofInt.addListener(new C30867b());
        ofInt.start();
    }

    /* renamed from: w */
    private AccountLov m91990w(int i) {
        try {
            return (AccountLov) this.f76868d.get(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public int m91991x(int i) {
        if (m91990w(i) == null) {
            return 0;
        }
        return C32355x0.m95510a(60.0f);
    }

    /* renamed from: A */
    public void onBindViewHolder(C30870e eVar, int i) {
        int i2;
        super.mo65512i(eVar, i);
        if (this.f76878n) {
            eVar.f89287d.setScaleX(1.0f);
            eVar.f89287d.setScaleY(1.0f);
            eVar.f89287d.setAlpha(1.0f);
        }
        AccountItemView accountItemView = (AccountItemView) eVar.f89287d.getTag();
        AccountLov w = m91990w(i);
        if (w == null || !w.isCreditCard()) {
            accountItemView.setAccountLov(w, i, this.f76877m);
        } else {
            CreditCardAccount creditAccountByAcctKey = this.f76877m.getCreditAccountByAcctKey(w.getId());
            if (creditAccountByAcctKey != null) {
                accountItemView.setCreditCard(creditAccountByAcctKey, true, -1);
                try {
                    accountItemView.findViewById(C10322k.card_moneys_parent).setVisibility(8);
                } catch (Exception unused) {
                }
            } else {
                accountItemView.setAccountLov(w, i, this.f76877m);
            }
        }
        accountItemView.optimizeCard(false);
        accountItemView.changeHeight();
        if (this.f76870f == i) {
            m91975L(eVar.f76890h, this.f76880p);
        }
        if (i == this.f76870f) {
            if (eVar.f76889g.getAlpha() < 1.0f) {
                eVar.f76889g.animate().alpha(1.0f);
            }
        } else if (eVar.f76889g.getAlpha() > Utils.FLOAT_EPSILON) {
            eVar.f76889g.animate().alpha(Utils.FLOAT_EPSILON);
        }
        if (i == this.f76870f) {
            C32290b1.m95124n(eVar.f76888f, m91991x(i));
        } else {
            C32290b1.m95124n(eVar.f76888f, 0);
        }
        if (w != null) {
            i2 = w.getSubAccounts().size();
        } else {
            i2 = 0;
        }
        if (i2 != 1) {
            C32290b1.m95124n(eVar.f89287d, -2);
            ((ViewGroup.MarginLayoutParams) eVar.f89287d.getLayoutParams()).setMargins(0, 0, 0, C32355x0.m95511b(8.0f, eVar.f89287d.getContext()));
            eVar.f89287d.requestLayout();
        } else if (w.getSubAccounts().get(0).getId() == this.f76873i || C32359z0.m95598z(w.getSubAccounts().get(0).getCcy(), this.f76874j)) {
            C32290b1.m95124n(eVar.f89287d, 0);
            ((ViewGroup.MarginLayoutParams) eVar.f89287d.getLayoutParams()).setMargins(0, 0, 0, 0);
            eVar.f89287d.requestLayout();
        } else {
            C32290b1.m95124n(eVar.f89287d, -2);
            ((ViewGroup.MarginLayoutParams) eVar.f89287d.getLayoutParams()).setMargins(0, 0, 0, C32355x0.m95511b(8.0f, eVar.f89287d.getContext()));
            eVar.f89287d.requestLayout();
        }
    }

    /* renamed from: B */
    public C30870e onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = mo90035h(C10324m.wizard_account_item, viewGroup);
        AccountItemView accountItemView = new AccountItemView(viewGroup.getContext(), true);
        accountItemView.setRoundCornerType(AccountItemView.RoundCornerType.BOTH);
        h.setTag(accountItemView);
        ((ViewGroup) h.findViewById(C10322k.wizard_account_item_container)).addView(accountItemView);
        return new C30870e(h);
    }

    /* renamed from: C */
    public void mo71034C() {
        RecyclerView recyclerView;
        if (!this.f76876l && (recyclerView = this.f76869e) != null) {
            recyclerView.mo5425x1(this.f76870f);
            this.f76876l = true;
        }
    }

    /* renamed from: D */
    public void mo71035D(ArrayList arrayList) {
        this.f76868d = arrayList;
    }

    /* renamed from: E */
    public void mo71036E() {
        this.f76878n = true;
    }

    /* renamed from: F */
    public void mo71037F(C30869d dVar) {
        this.f76872h = dVar;
    }

    /* renamed from: G */
    public void mo71038G(long j) {
        this.f76873i = j;
    }

    /* renamed from: H */
    public void mo71039H(String str) {
        this.f76874j = str;
    }

    /* renamed from: I */
    public void mo71040I(int i) {
        this.f76871g = i;
    }

    /* renamed from: J */
    public void mo71041J(int i) {
        this.f76870f = i;
    }

    public int getItemCount() {
        return this.f76868d.size();
    }

    public void onClick(View view) {
        C30868c cVar = (C30868c) view.getTag();
        this.f76871g = cVar.f76886b;
        this.f76875k = this.f76870f;
        int b = cVar.f76885a;
        this.f76870f = b;
        this.f76872h.mo71050g(b, this.f76871g, true);
        C30870e eVar = (C30870e) this.f76869e.mo5320e0(this.f76870f);
        if (eVar != null) {
            m91975L(eVar.f76890h, this.f76879o);
        }
    }

    /* renamed from: y */
    public AccountLov mo71043y() {
        AccountLov w = m91990w(this.f76870f);
        if (w != null) {
            return w.getSubAccounts().get(this.f76871g);
        }
        return null;
    }

    /* renamed from: z */
    public long mo71044z() {
        AccountLov w = m91990w(this.f76870f);
        if (w != null) {
            return w.getSubAccounts().get(this.f76871g).getId();
        }
        return -1;
    }
}
