package g81;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import l50.C25832l;
import l50.C25836p;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import n50.C26371b;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.model.BondsWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.model.DepositBondsContainer;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.p975ui.activities.ProductDetailedActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountItemView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import q31.C38125h;
import r90.C27950a;

/* renamed from: g81.d0 */
public class C32139d0 extends C37106c {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public C37104a f79132A;

    /* renamed from: B */
    private boolean f79133B;

    /* renamed from: C */
    private Boolean f79134C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C32142c f79135D;

    /* renamed from: E */
    private ArrayList f79136E;

    /* renamed from: d */
    private final String f79137d;

    /* renamed from: e */
    private boolean f79138e;

    /* renamed from: f */
    private LinearLayoutManager f79139f;

    /* renamed from: g */
    private int f79140g;

    /* renamed from: h */
    private FragmentManager f79141h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public LoansWrapper f79142i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C25836p f79143j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public DepositsWrapper f79144k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public DepositBondsContainer f79145l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public CreditCardsWrapper f79146m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public BondsWrapper f79147n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public PensionResult f79148o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BonusPlusUiModel f79149p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BonusPrloUiModel f79150q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public BonusAmexUiModel f79151r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public BonusCashBackUiModel f79152s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public ArrayList f79153t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public ArrayList f79154u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public boolean f79155v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public RecyclerView f79156w;

    /* renamed from: x */
    private int f79157x;

    /* renamed from: y */
    private int f79158y;

    /* renamed from: z */
    private Client f79159z;

    /* renamed from: g81.d0$a */
    class C32140a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ boolean f79160d;

        /* renamed from: e */
        final /* synthetic */ float f79161e;

        C32140a(boolean z, float f) {
            this.f79160d = z;
            this.f79161e = f;
        }

        public void run() {
            if (this.f79160d && this.f79161e == 1.0f) {
                C32139d0.this.f79156w.setVisibility(8);
            }
        }
    }

    /* renamed from: g81.d0$b */
    class C32141b extends C37107d implements View.OnClickListener {
        public C32141b(View view) {
            super(view);
            view.findViewById(C10322k.create_new_layout).setOnClickListener(this);
            BogTextView bogTextView = (BogTextView) view.findViewById(C10322k.add_item_layout_label);
            if (C32139d0.this.f79143j != null) {
                bogTextView.setText(C10328q.f28942T8);
            }
            if (C32139d0.this.f79142i != null) {
                bogTextView.setText(C27950a.m86284a("products.loans.new.loan.button.label"));
            }
        }

        public void onClick(View view) {
            if (C32139d0.this.f79143j != null) {
                C36546y.m108282F().mo27152s("applications", "products_button", "open_debit_card_choice");
                C38125h.m112238c(view.getContext()).mo91597c0(C32139d0.this.m94677B(view));
            } else if (C32139d0.this.f79142i == null) {
                C36546y.m108282F().mo27152s("applications", "products_button", "open_deposit_choice");
                C38125h.m112238c(view.getContext()).mo91611j0(view.getContext(), (String) null);
            } else if (C32139d0.this.f79135D != null) {
                C32139d0.this.f79135D.onNewLoanButtonClicked();
                C36546y.m108282F().mo27152s("applications", "products_button", "CL_APP_PRODUCTS_BUTTON_NEW_LOAN");
            }
        }
    }

    /* renamed from: g81.d0$c */
    public interface C32142c {
        void onNewLoanButtonClicked();
    }

    /* renamed from: g81.d0$d */
    class C32143d extends C37107d implements View.OnClickListener {
        public C32143d(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            if (!C32139d0.this.f79155v) {
                Intent intent = new Intent(view.getContext(), ProductDetailedActivity.class);
                intent.putExtra("PRODUCT_INDEX", getAdapterPosition());
                if (C32139d0.this.f79142i != null) {
                    C36546y.m108282F().mo27152s("products", "loan", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 3);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79143j != null) {
                    C36546y.m108282F().mo27152s("products", "accounts", "open_details");
                    C25832l b = C26371b.m82432b(C32139d0.this.f79143j, getAdapterPosition());
                    if (b != null) {
                        intent.putExtra("PRODUCT_INDEX", C26371b.m82435e(C32139d0.this.f79143j, b.mo64529g()));
                        intent.putExtra("PRODUCT_TYPE_KEY", 1);
                        view.getContext().startActivity(intent);
                    }
                } else if (C32139d0.this.f79144k != null) {
                    C36546y.m108282F().mo27152s("products", "deposits", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 4);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79146m != null) {
                    C36546y.m108282F().mo27152s("products", "credit_cards", "open_details");
                    intent.putExtra("PRODUCT_INDEX", C32139d0.this.f79146m.getVisiblePositionByAcctKey(C32139d0.this.f79146m.getAccountByPos(getAdapterPosition()).getAcctKey()));
                    intent.putExtra("PRODUCT_TYPE_KEY", 2);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79148o != null) {
                    C36546y.m108282F().mo27152s("products", "pension", "open_details");
                    C36546y.m108282F().mo27152s("pension_funds", "", "open_pension_fund_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 18);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79147n != null) {
                    C36546y.m108282F().mo27152s("products", "bonds_and_shares", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 5);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79149p != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "plus", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 16);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79150q != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "prllot", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 17);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79152s != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "cashback", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 10);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79151r != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "mr", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 8);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79153t != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "cas", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 9);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79154u != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "scool", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 15);
                    view.getContext().startActivity(intent);
                } else if (C32139d0.this.f79145l != null) {
                    C36546y.m108282F().mo27152s("more_loyalty_programs", "deposits", "open_details");
                    intent.putExtra("PRODUCT_TYPE_KEY", 4);
                    view.getContext().startActivity(intent);
                }
            } else if (C32139d0.this.f79132A != null) {
                C32139d0.this.f79132A.mo48298Z0(getAdapterPosition());
            }
            C32139d0.this.mo72641R(false);
        }
    }

    public C32139d0(RecyclerView recyclerView, int i, FragmentManager fragmentManager) {
        this(recyclerView, i, fragmentManager, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public Activity m94677B(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* renamed from: S */
    private void m94678S(View view) {
        view.setVisibility(0);
        if (view instanceof AccountItemView) {
            AccountItemView accountItemView = (AccountItemView) view;
            accountItemView.getWhiteRectView().setVisibility(8);
            accountItemView.getShadowLayer().setAlpha(1.0f);
        }
        view.setAlpha(1.0f);
    }

    /* renamed from: T */
    private void m94679T(View view, boolean z, long j, boolean z2) {
        float f;
        long j2;
        if (view.getTag() == null) {
            view.setTag(Float.valueOf(view.getY()));
        }
        float f2 = (float) (-this.f79157x);
        if (!z) {
            view.setY(f2);
        }
        if (z) {
            f = 1.0f;
        } else {
            f = Utils.FLOAT_EPSILON;
        }
        if (!z) {
            f2 = ((Float) view.getTag()).floatValue();
        }
        if (this.f79138e) {
            j2 = 1000;
        } else {
            j2 = 300;
        }
        if (view instanceof AccountItemView) {
            AccountItemView accountItemView = (AccountItemView) view;
            if (accountItemView.getWhiteRectView().getVisibility() != 0) {
                accountItemView.getWhiteRectView().setVisibility(0);
            }
            accountItemView.getWhiteRectView().animate().alpha(f).setStartDelay(j).setDuration(j2);
            accountItemView.getShadowLayer().animate().alpha(1.0f - f).setStartDelay(j).setDuration(j2);
        } else {
            view.animate().alpha(1.0f - f);
        }
        view.animate().y(f2).setDuration(j2).setInterpolator(new DecelerateInterpolator()).setStartDelay(j).withEndAction(new C32140a(z2, f));
    }

    /* renamed from: C */
    public Object mo72626C(int i) {
        if (i < this.f79145l.getDeposits().getDeposits().size()) {
            return this.f79145l.getDeposits().getDeposits().get(i);
        }
        return this.f79145l.getBonds().getBonds().getBonds().get(i - this.f79145l.getDeposits().getDeposits().size());
    }

    /* renamed from: D */
    public int mo72627D() {
        C25836p pVar = this.f79143j;
        int i = 0;
        if (pVar != null) {
            for (C25832l u : pVar.mo64561a().mo64555a()) {
                if (!u.mo64545u()) {
                    i++;
                }
            }
            return i;
        }
        CreditCardsWrapper creditCardsWrapper = this.f79146m;
        if (creditCardsWrapper != null) {
            Iterator<CreditCardAccount> it = creditCardsWrapper.getCardsContainer().getAccounts().iterator();
            while (it.hasNext()) {
                if (!it.next().isHidden()) {
                    i++;
                }
            }
            return i;
        }
        LoansWrapper loansWrapper = this.f79142i;
        if (loansWrapper != null) {
            return loansWrapper.getLoans().size();
        }
        return getItemCount();
    }

    /* renamed from: E */
    public C37107d onCreateViewHolder(ViewGroup viewGroup, int i) {
        AccountItemView accountItemView;
        if (i == 1) {
            if (!this.f79155v) {
                accountItemView = new AccountItemView(viewGroup.getContext(), this.f79140g, this.f79141h);
            } else {
                accountItemView = new AccountItemView(viewGroup.getContext(), true);
                accountItemView.optimizeCard(false);
            }
            this.f79136E.add(accountItemView);
            return new C32143d(accountItemView);
        }
        View h = mo90035h(C10324m.add_item_layout, viewGroup);
        h.setAlpha(Utils.FLOAT_EPSILON);
        return new C32141b(h);
    }

    /* renamed from: F */
    public void mo72629F(C25836p pVar, boolean z) {
        this.f79143j = pVar;
        this.f79133B = z;
    }

    /* renamed from: G */
    public void mo72630G(BonusAmexUiModel bonusAmexUiModel) {
        this.f79151r = bonusAmexUiModel;
    }

    /* renamed from: H */
    public void mo72631H(int i, boolean z) {
        int i2;
        boolean z2;
        long j;
        boolean z3;
        int i3 = i;
        this.f79158y = i3;
        this.f79138e = z;
        int n2 = this.f79139f.mo5219n2();
        int q2 = this.f79139f.mo5223q2();
        int q22 = this.f79139f.mo5223q2();
        if (q2 > 5) {
            q2 = 5;
        }
        for (int i4 = q2; i4 >= n2; i4--) {
            View O = this.f79139f.mo5199O(i4);
            if (O != null) {
                ViewCompat.m3568O0(O, (float) (q2 - i4));
            }
        }
        if (i3 == 11 || i3 == 12) {
            if (q2 < n2) {
                i2 = q2;
            } else {
                i2 = n2;
                n2 = q2;
            }
            int i5 = 0;
            for (int i6 = n2; i6 >= i2; i6--) {
                View O2 = this.f79139f.mo5199O(i6);
                if (O2 != null) {
                    if (i3 == 11) {
                        if (O2 instanceof AccountItemView) {
                            ((AccountItemView) O2).getShadowLayer().setAlpha(Utils.FLOAT_EPSILON);
                        }
                        int i7 = i5 + 1;
                        long j2 = (long) ((i5 + 2) * 50);
                        if (j2 > 400) {
                            j = 400;
                        } else {
                            j = j2;
                        }
                        if (i6 == i2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        m94679T(O2, false, j, z3);
                        i5 = i7;
                    } else {
                        if (i6 == i2) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        m94679T(O2, true, 0, z2);
                    }
                }
            }
        }
        for (int i8 = 5; i8 <= q22; i8++) {
            m94678S(this.f79139f.mo5199O(i8));
        }
    }

    /* renamed from: I */
    public void mo72632I(BondsWrapper bondsWrapper) {
        this.f79147n = bondsWrapper;
    }

    /* renamed from: J */
    public void mo72633J(BonusPrloUiModel bonusPrloUiModel) {
        this.f79150q = bonusPrloUiModel;
    }

    /* renamed from: K */
    public void mo72634K(ArrayList arrayList, Client client) {
        this.f79153t = arrayList;
        this.f79159z = client;
    }

    /* renamed from: L */
    public void mo72635L(BonusCashBackUiModel bonusCashBackUiModel) {
        this.f79152s = bonusCashBackUiModel;
    }

    /* renamed from: M */
    public void mo72636M(LoansWrapper loansWrapper, Boolean bool) {
        this.f79142i = loansWrapper;
        this.f79134C = bool;
    }

    /* renamed from: N */
    public void mo72637N(C32142c cVar) {
        this.f79135D = cVar;
    }

    /* renamed from: O */
    public void mo72638O(PensionResult pensionResult) {
        this.f79148o = pensionResult;
    }

    /* renamed from: P */
    public void mo72639P(BonusPlusUiModel bonusPlusUiModel) {
        this.f79149p = bonusPlusUiModel;
    }

    /* renamed from: Q */
    public void mo72640Q(ArrayList arrayList) {
        this.f79154u = arrayList;
    }

    /* renamed from: R */
    public void mo72641R(boolean z) {
        ArrayList arrayList = this.f79136E;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AccountItemView) it.next()).resetSwipe(z);
            }
        }
    }

    public int getItemCount() {
        if (this.f79142i == null) {
            C25836p pVar = this.f79143j;
            if (pVar != null) {
                return pVar.mo64561a().mo64555a().size() + 1;
            }
            DepositsWrapper depositsWrapper = this.f79144k;
            if (depositsWrapper != null) {
                return depositsWrapper.getDeposits().size();
            }
            CreditCardsWrapper creditCardsWrapper = this.f79146m;
            if (creditCardsWrapper != null) {
                return creditCardsWrapper.getCardsContainer().getAccounts().size();
            }
            BondsWrapper bondsWrapper = this.f79147n;
            if (bondsWrapper != null) {
                return bondsWrapper.getBonds().size();
            }
            if (this.f79148o != null) {
                return 1;
            }
            ArrayList arrayList = this.f79153t;
            if (arrayList != null) {
                return arrayList.size();
            }
            ArrayList arrayList2 = this.f79154u;
            if (arrayList2 != null) {
                return arrayList2.size();
            }
            if (this.f79149p != null || this.f79150q != null || this.f79151r != null || this.f79152s != null) {
                return 1;
            }
            DepositBondsContainer depositBondsContainer = this.f79145l;
            if (depositBondsContainer != null) {
                return depositBondsContainer.getDeposits().getDeposits().size() + this.f79145l.getBonds().getBonds().getBonds().size() + 1;
            }
            return 0;
        } else if (this.f79134C.booleanValue()) {
            return this.f79142i.getLoans().size() + 1;
        } else {
            return this.f79142i.getLoans().size();
        }
    }

    public int getItemViewType(int i) {
        DepositBondsContainer depositBondsContainer = this.f79145l;
        if (depositBondsContainer != null && i == depositBondsContainer.getDeposits().getDeposits().size() + this.f79145l.getBonds().getBonds().getBonds().size()) {
            return 0;
        }
        C25836p pVar = this.f79143j;
        if (pVar != null && i == pVar.mo64561a().mo64555a().size()) {
            return 0;
        }
        LoansWrapper loansWrapper = this.f79142i;
        if (loansWrapper == null || i != loansWrapper.getLoans().size() || !this.f79134C.booleanValue()) {
            return 1;
        }
        return 0;
    }

    /* renamed from: i */
    public void onBindViewHolder(C37107d dVar, int i) {
        if (dVar instanceof C32143d) {
            AccountItemView accountItemView = (AccountItemView) dVar.f89287d;
            if (this.f79155v) {
                accountItemView.optimizeCard(false);
            }
            LoansWrapper loansWrapper = this.f79142i;
            if (loansWrapper != null) {
                accountItemView.setLoan(loansWrapper.getLoans().get(i), this.f79142i.getLoans().get(i).getDetails(), i, false);
                m94678S(dVar.f89287d);
            } else {
                C25836p pVar = this.f79143j;
                if (pVar != null) {
                    accountItemView.setAccount((C25832l) pVar.mo64561a().mo64555a().get(i), i, false);
                    if (((C25832l) this.f79143j.mo64561a().mo64555a().get(i)).mo64545u()) {
                        accountItemView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                    }
                    m94678S(dVar.f89287d);
                } else {
                    DepositsWrapper depositsWrapper = this.f79144k;
                    if (depositsWrapper != null) {
                        accountItemView.setDeposit(depositsWrapper.getDeposits().get(i), i);
                        m94678S(dVar.f89287d);
                    } else {
                        CreditCardsWrapper creditCardsWrapper = this.f79146m;
                        if (creditCardsWrapper != null) {
                            accountItemView.setCreditCard(creditCardsWrapper.getCardsContainer().getAccounts().get(i), true, i);
                            if (this.f79146m.getCardsContainer().getAccounts().get(i).isHidden()) {
                                accountItemView.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                            }
                            m94678S(dVar.f89287d);
                        } else {
                            PensionResult pensionResult = this.f79148o;
                            if (pensionResult != null) {
                                accountItemView.setPension(pensionResult);
                                m94678S(dVar.f89287d);
                            } else {
                                BondsWrapper bondsWrapper = this.f79147n;
                                if (bondsWrapper != null) {
                                    accountItemView.setBond(bondsWrapper.getBonds().get(i), i);
                                    m94678S(dVar.f89287d);
                                } else {
                                    ArrayList arrayList = this.f79154u;
                                    if (arrayList != null) {
                                        accountItemView.setScoolCard((BonusScoolUiModel) arrayList.get(i), i);
                                        m94678S(dVar.f89287d);
                                    } else {
                                        BonusPlusUiModel bonusPlusUiModel = this.f79149p;
                                        if (bonusPlusUiModel != null) {
                                            accountItemView.setBonusPLus(bonusPlusUiModel);
                                            m94678S(dVar.f89287d);
                                        } else {
                                            BonusAmexUiModel bonusAmexUiModel = this.f79151r;
                                            if (bonusAmexUiModel != null) {
                                                accountItemView.setBonusAmex(bonusAmexUiModel);
                                                m94678S(dVar.f89287d);
                                            } else {
                                                BonusPrloUiModel bonusPrloUiModel = this.f79150q;
                                                if (bonusPrloUiModel != null) {
                                                    accountItemView.setBonusPrlo(bonusPrloUiModel);
                                                    m94678S(dVar.f89287d);
                                                } else {
                                                    BonusCashBackUiModel bonusCashBackUiModel = this.f79152s;
                                                    if (bonusCashBackUiModel != null) {
                                                        accountItemView.setBonusCashback(bonusCashBackUiModel);
                                                        m94678S(dVar.f89287d);
                                                    } else if (this.f79145l != null) {
                                                        if (mo72626C(i) instanceof Deposit) {
                                                            accountItemView.setDeposit((Deposit) mo72626C(i), i);
                                                        } else {
                                                            accountItemView.setDepositBond((DepositBond) mo72626C(i), i);
                                                        }
                                                        m94678S(dVar.f89287d);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (14 == this.f79158y) {
                m94678S(dVar.f89287d);
            }
        }
    }

    public C32139d0(RecyclerView recyclerView, int i, FragmentManager fragmentManager, boolean z) {
        this.f79137d = "products.loans.new.loan.button.label";
        this.f79134C = Boolean.FALSE;
        this.f79136E = new ArrayList();
        this.f79140g = i;
        this.f79155v = z;
        this.f79156w = recyclerView;
        this.f79139f = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.f79141h = fragmentManager;
        this.f79157x = C32355x0.m95516g(C10319h.product_recycler_top_margin);
    }
}
