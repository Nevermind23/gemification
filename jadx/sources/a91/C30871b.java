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

/* renamed from: a91.b */
public class C30871b extends C37106c implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public ArrayList f76892d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public RecyclerView f76893e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f76894f = -1;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f76895g = -1;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C30875d f76896h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f76897i;

    /* renamed from: j */
    int f76898j = -1;

    /* renamed from: k */
    private Client f76899k;

    /* renamed from: l */
    private boolean f76900l;

    /* renamed from: m */
    int f76901m = 11;

    /* renamed from: n */
    int f76902n = 10;

    /* renamed from: a91.b$a */
    class C30872a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ View f76903d;

        /* renamed from: e */
        final /* synthetic */ int f76904e;

        C30872a(View view, int i) {
            this.f76903d = view;
            this.f76904e = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C32290b1.m95124n(this.f76903d, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            if (this.f76904e >= 0) {
                C30871b.this.f76893e.getLayoutManager().mo5197J1(this.f76904e);
            }
        }
    }

    /* renamed from: a91.b$b */
    class C30873b implements Animator.AnimatorListener {
        C30873b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C30871b.this.m92012F();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: a91.b$c */
    private class C30874c {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public int f76907a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public int f76908b;

        public C30874c(int i, int i2) {
            this.f76907a = i;
            this.f76908b = i2;
        }
    }

    /* renamed from: a91.b$d */
    public interface C30875d {
        /* renamed from: g */
        void mo67192g(int i, int i2, boolean z);
    }

    /* renamed from: a91.b$e */
    public class C30876e extends C37107d implements View.OnClickListener {
        /* access modifiers changed from: private */

        /* renamed from: f */
        public LinearLayout f76910f = ((LinearLayout) mo90036h(C10322k.wizard_account_item_sub_accounts));
        /* access modifiers changed from: private */

        /* renamed from: g */
        public View f76911g = mo90036h(C10322k.wizard_account_item_outer_rect);
        /* access modifiers changed from: private */

        /* renamed from: h */
        public View[] f76912h = new View[5];

        public C30876e(View view) {
            super(view);
            this.f76912h[0] = mo90036h(C10322k.first_sub_account);
            this.f76912h[1] = mo90036h(C10322k.second_sub_account);
            this.f76912h[2] = mo90036h(C10322k.third_sub_account);
            this.f76912h[3] = mo90036h(C10322k.fourth_sub_account);
            this.f76912h[4] = mo90036h(C10322k.fifth_sub_account);
            ((View) view.getTag()).setTag(this.f76910f);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            boolean z;
            int i;
            View findViewById;
            Iterator<AccountLov> it = ((AccountLov) C30871b.this.f76892d.get(getAdapterPosition())).getSubAccounts().iterator();
            int i2 = 0;
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                AccountLov next = it.next();
                if (((AccountLov) C30871b.this.f76892d.get(getAdapterPosition())).getMainAcctKey() != next.getId()) {
                    i2++;
                } else if (next.getId() == C30871b.this.f76897i) {
                    if (i2 == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                }
            }
            for (View view2 : this.f76912h) {
                if (view2.getVisibility() != 8) {
                    view2.setVisibility(8);
                }
            }
            if (C30871b.this.f76894f != getAdapterPosition()) {
                z = false;
            }
            int o = C30871b.this.f76894f;
            if (!z) {
                C30871b.this.f76898j = getAdapterPosition();
                C30871b.this.f76894f = getAdapterPosition();
                C30871b.this.f76895g = i2;
            }
            C30871b.this.f76896h.mo67192g(C30871b.this.f76894f, C30871b.this.f76895g, !z);
            if (!z) {
                i = C30871b.this.m92026w(getAdapterPosition());
            } else {
                i = 0;
            }
            C30871b.this.m92024u(this.f76910f, i, getAdapterPosition());
            if (!z) {
                View O = C30871b.this.f76893e.getLayoutManager().mo5199O(o);
                if (O != null && (findViewById = O.findViewById(C10322k.wizard_account_item_sub_accounts)) != null) {
                    C30871b.this.m92024u(findViewById, 0, -1);
                    return;
                }
                return;
            }
            C30871b.this.f76895g = -1;
            C30871b.this.f76894f = -1;
        }
    }

    public C30871b(RecyclerView recyclerView, Client client) {
        this.f76893e = recyclerView;
        this.f76899k = client;
    }

    /* renamed from: D */
    private void m92010D(BogTextView bogTextView, boolean z) {
        if (z) {
            bogTextView.setBackgroundResource(C32335t0.m95363h(C10316e.account_orange_circle));
        } else {
            bogTextView.setBackgroundResource(C10320i.white_stroke_circle);
        }
    }

    /* renamed from: E */
    private void m92011E(View[] viewArr, int i) {
        boolean z;
        AccountLov v = m92025v(this.f76894f);
        if (v != null) {
            ArrayList<AccountLov> subAccounts = v.getSubAccounts();
            for (int size = subAccounts.size(); size < 5; size++) {
                if (viewArr[size].getVisibility() != 8) {
                    viewArr[size].setVisibility(8);
                }
            }
            int i2 = 0;
            while (i2 < subAccounts.size() && i2 < viewArr.length) {
                View view = viewArr[i2];
                if (this.f76897i != subAccounts.get(i2).getId()) {
                    if (!(i == this.f76901m || view.getVisibility() == 4)) {
                        view.setVisibility(4);
                    }
                    view.setTag(new C30874c(this.f76894f, i2));
                    if (i != this.f76901m) {
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
                    if (this.f76895g == i2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m92010D(bogTextView, z);
                    view.setOnClickListener(this);
                } else if (view.getVisibility() != 8) {
                    view.setVisibility(8);
                }
                i2++;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public void m92012F() {
        notifyDataSetChanged();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public void m92024u(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{view.getHeight(), i});
        ofInt.setDuration(50);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C30872a(view, i2));
        ofInt.addListener(new C30873b());
        ofInt.start();
    }

    /* renamed from: v */
    private AccountLov m92025v(int i) {
        try {
            return (AccountLov) this.f76892d.get(i);
        } catch (Exception unused) {
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public int m92026w(int i) {
        if (m92025v(i) == null) {
            return 0;
        }
        return C32355x0.m95510a(1.0f);
    }

    /* renamed from: A */
    public void mo71052A() {
        this.f76900l = true;
    }

    /* renamed from: B */
    public void mo71053B(C30875d dVar) {
        this.f76896h = dVar;
    }

    /* renamed from: C */
    public void mo71054C(int i) {
        this.f76894f = i;
    }

    public int getItemCount() {
        return this.f76892d.size();
    }

    public void onClick(View view) {
        C30874c cVar = (C30874c) view.getTag();
        this.f76895g = cVar.f76908b;
        this.f76898j = this.f76894f;
        int b = cVar.f76907a;
        this.f76894f = b;
        this.f76896h.mo67192g(b, this.f76895g, true);
        C30876e eVar = (C30876e) this.f76893e.mo5320e0(this.f76894f);
        if (eVar != null) {
            m92011E(eVar.f76912h, this.f76901m);
        }
    }

    /* renamed from: x */
    public void onBindViewHolder(C30876e eVar, int i) {
        int i2;
        super.mo65512i(eVar, i);
        if (this.f76900l) {
            eVar.f89287d.setScaleX(1.0f);
            eVar.f89287d.setScaleY(1.0f);
            eVar.f89287d.setAlpha(1.0f);
        }
        AccountItemView accountItemView = (AccountItemView) eVar.f89287d.getTag();
        AccountLov v = m92025v(i);
        if (v == null || !v.isCreditCard()) {
            accountItemView.setAccountLov(v, i, this.f76899k);
        } else {
            CreditCardAccount creditAccountByAcctKey = this.f76899k.getCreditAccountByAcctKey(v.getId());
            if (creditAccountByAcctKey != null) {
                accountItemView.setCreditCard(creditAccountByAcctKey, true, -1);
                try {
                    accountItemView.findViewById(C10322k.card_moneys_parent).setVisibility(8);
                } catch (Exception unused) {
                }
            } else {
                accountItemView.setAccountLov(v, i, this.f76899k);
            }
        }
        accountItemView.optimizeCard(false);
        accountItemView.changeHeight();
        if (this.f76894f == i) {
            m92011E(eVar.f76912h, this.f76902n);
        }
        if (i == this.f76894f) {
            if (eVar.f76911g.getAlpha() < 1.0f) {
                eVar.f76911g.animate().alpha(1.0f);
            }
        } else if (eVar.f76911g.getAlpha() > Utils.FLOAT_EPSILON) {
            eVar.f76911g.animate().alpha(Utils.FLOAT_EPSILON);
        }
        if (i == this.f76894f) {
            C32290b1.m95124n(eVar.f76910f, m92026w(i));
        } else {
            C32290b1.m95124n(eVar.f76910f, 0);
        }
        if (v != null) {
            i2 = v.getSubAccounts().size();
        } else {
            i2 = 0;
        }
        if (i2 != 1) {
            C32290b1.m95124n(eVar.f89287d, -2);
            ((ViewGroup.MarginLayoutParams) eVar.f89287d.getLayoutParams()).setMargins(0, 0, 0, C32355x0.m95511b(8.0f, eVar.f89287d.getContext()));
            eVar.f89287d.requestLayout();
        } else if (v.getSubAccounts().get(0).getId() == this.f76897i) {
            C32290b1.m95124n(eVar.f89287d, 0);
            ((ViewGroup.MarginLayoutParams) eVar.f89287d.getLayoutParams()).setMargins(0, 0, 0, 0);
            eVar.f89287d.requestLayout();
        } else {
            C32290b1.m95124n(eVar.f89287d, -2);
            ((ViewGroup.MarginLayoutParams) eVar.f89287d.getLayoutParams()).setMargins(0, 0, 0, C32355x0.m95511b(8.0f, eVar.f89287d.getContext()));
            eVar.f89287d.requestLayout();
        }
    }

    /* renamed from: y */
    public C30876e onCreateViewHolder(ViewGroup viewGroup, int i) {
        View h = mo90035h(C10324m.wizard_account_item, viewGroup);
        AccountItemView accountItemView = new AccountItemView(viewGroup.getContext(), true);
        accountItemView.setRoundCornerType(AccountItemView.RoundCornerType.BOTH);
        h.setTag(accountItemView);
        ((ViewGroup) h.findViewById(C10322k.wizard_account_item_container)).addView(accountItemView);
        return new C30876e(h);
    }

    /* renamed from: z */
    public void mo71058z(ArrayList arrayList) {
        this.f76892d = arrayList;
    }
}
