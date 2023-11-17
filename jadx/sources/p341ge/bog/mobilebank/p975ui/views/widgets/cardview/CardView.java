package p341ge.bog.mobilebank.p975ui.views.widgets.cardview;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.Scroller;
import androidx.viewpager.widget.C1907a;
import androidx.viewpager.widget.ViewPager;
import com.github.mikephil.charting.utils.Utils;
import g91.C32305g;
import g91.C32355x0;
import g91.C32359z0;
import i10.C25100c;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jg1.C41438c;
import l50.C25832l;
import l50.C25836p;
import l50.C25838r;
import n50.C26371b;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.model.BondsWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepositBondsContainer;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10317f;
import p366bk.C10319h;
import p950xy.C29875b;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardView */
public class CardView extends BogViewPager {
    public static final float BIG_SCALE = 1.0f;
    public static final float DIFF_SCALE = 0.19999999f;
    public static final float SMALL_SCALE = 0.8f;
    public List<C25838r> accountCards;
    public C25836p accounts;
    private C35786c adapter;
    /* access modifiers changed from: private */
    public BondsWrapper bondsWrapper;
    /* access modifiers changed from: private */
    public C32305g bonusesHelper;
    private ArrayList<CardBlockStatus> cardStatuses;
    /* access modifiers changed from: private */
    public ArrayList<View> cards;
    private Client client;
    public CreditCardsWrapper credits;
    public int currPage;
    /* access modifiers changed from: private */
    public int defIndex;
    /* access modifiers changed from: private */
    public DepositBondsContainer depositBondsContainer;
    /* access modifiers changed from: private */
    public C41438c eventBus;
    float lastValue;
    public LoansWrapper loans;
    ViewPager.C1902j onPageChangeListener;
    /* access modifiers changed from: private */
    public float pageWidth;
    /* access modifiers changed from: private */
    public PensionResult pension;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardView$a */
    class C35784a implements ViewPager.C1902j {
        C35784a() {
        }

        /* renamed from: L */
        public void mo6548L(int i, float f, int i2) {
            if (f >= Utils.FLOAT_EPSILON && f <= 1.0f) {
                FrameLayout frameLayout = (FrameLayout) CardView.this.getRootView(i);
                FrameLayout frameLayout2 = (FrameLayout) CardView.this.getRootView(i + 1);
                float f2 = f * 0.19999999f;
                float f3 = 0.8f + f2;
                float f4 = 1.0f - f2;
                frameLayout.setScaleY(f4);
                frameLayout.setScaleX(f4);
                if (frameLayout2 != null) {
                    frameLayout2.setScaleY(f3);
                    frameLayout2.setScaleX(f3);
                }
            }
        }

        /* renamed from: Q */
        public void mo6549Q(int i) {
            CardView.this.currPage = i;
        }

        /* renamed from: l0 */
        public void mo6550l0(int i) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardView$b */
    private class C35785b implements ViewPager.C1903k {
        /* renamed from: a */
        public void mo6551a(View view, float f) {
            if (Math.abs(f) >= Utils.FLOAT_EPSILON) {
                float max = Math.max(0.9f, 1.1f - Math.abs(f));
                float max2 = Math.max(0.5f, 1.1f - Math.abs(f));
                if (max > CardView.this.pageWidth) {
                    max = CardView.this.pageWidth;
                    max2 = 1.0f;
                }
                view.setAlpha(max2);
                CardView.this.lastValue = max;
            }
        }

        private C35785b() {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardView$c */
    private class C35786c extends C1907a {

        /* renamed from: c */
        Context f86437c;

        /* renamed from: d */
        ArrayList f86438d;

        C35786c(Context context, ArrayList arrayList) {
            this.f86437c = context;
            this.f86438d = arrayList;
        }

        /* renamed from: a */
        public void mo4594a(ViewGroup viewGroup, int i, Object obj) {
            View view = (View) obj;
            viewGroup.removeView(view);
            CardView.this.cards.remove(view);
        }

        /* renamed from: d */
        public int mo6557d() {
            CardView cardView = CardView.this;
            LoansWrapper loansWrapper = cardView.loans;
            if (loansWrapper != null) {
                return loansWrapper.getLoans().size();
            }
            C25836p pVar = cardView.accounts;
            int i = 0;
            if (pVar != null) {
                int size = pVar.mo64561a().mo64555a().size();
                while (i < CardView.this.accounts.mo64561a().mo64555a().size()) {
                    if (((C25832l) CardView.this.accounts.mo64561a().mo64555a().get(i)).mo64545u()) {
                        size--;
                    }
                    i++;
                }
                return size;
            }
            CreditCardsWrapper creditCardsWrapper = cardView.credits;
            if (creditCardsWrapper != null) {
                int size2 = creditCardsWrapper.getCardsContainer().getAccounts().size();
                while (i < CardView.this.credits.getCardsContainer().getAccounts().size()) {
                    if (CardView.this.credits.getCardsContainer().getAccounts().get(i).isHidden()) {
                        size2--;
                    }
                    i++;
                }
                return size2;
            }
            List<C25838r> list = cardView.accountCards;
            if (list != null) {
                return list.size();
            }
            if (cardView.bondsWrapper != null) {
                return CardView.this.bondsWrapper.getBonds().size();
            }
            if (CardView.this.bonusesHelper != null) {
                return CardView.this.bonusesHelper.mo72828b();
            }
            if (CardView.this.depositBondsContainer != null) {
                return CardView.this.depositBondsContainer.getBonds().getBonds().getBonds().size() + CardView.this.depositBondsContainer.getDeposits().getDeposits().size();
            }
            if (CardView.this.pension != null) {
                return 1;
            }
            return 0;
        }

        /* renamed from: g */
        public float mo6560g(int i) {
            return CardView.this.pageWidth;
        }

        /* renamed from: h */
        public Object mo4596h(ViewGroup viewGroup, int i) {
            View view;
            float f;
            C35388f2 f2Var = (C35388f2) C25100c.m80062a(CardView.this);
            CardView cardView = CardView.this;
            if (cardView.loans != null) {
                view = CardBuilder.with(f2Var).forObject(CardView.this.loans).mo87615a(i, CardView.this.eventBus);
            } else {
                C25836p pVar = cardView.accounts;
                if (pVar != null) {
                    view = CardBuilder.with(f2Var).forObject(CardView.this.accounts).mo87604a(C26371b.m82434d(pVar, i), CardView.this.eventBus);
                } else {
                    CreditCardsWrapper creditCardsWrapper = cardView.credits;
                    if (creditCardsWrapper != null) {
                        view = CardBuilder.with(f2Var).forObject(CardView.this.credits).mo87612a(creditCardsWrapper.getRealPositionByVisiblePosition(i), CardView.this.eventBus);
                    } else if (cardView.accountCards != null) {
                        view = CardBuilder.with(f2Var).forObject(CardView.this.accountCards).mo87605a(i, CardView.this.eventBus, this.f86438d);
                    } else if (cardView.bondsWrapper != null) {
                        view = CardBuilder.with(f2Var).forObject(CardView.this.bondsWrapper).mo87606a(i);
                    } else {
                        if (CardView.this.bonusesHelper != null) {
                            int d = CardView.this.bonusesHelper.mo72830d(i);
                            if (d == 8) {
                                view = CardBuilder.with(f2Var).forObject((BonusAmexUiModel) CardView.this.bonusesHelper.mo72827a(i)).mo87607a(CardView.this.eventBus);
                            } else if (d != 10) {
                                switch (d) {
                                    case 15:
                                        view = CardBuilder.with(f2Var).forObject((BonusScoolUiModel) CardView.this.bonusesHelper.mo72827a(i)).mo87611a(i, CardView.this.eventBus);
                                        break;
                                    case 16:
                                        view = CardBuilder.with(f2Var).forObject((BonusPlusUiModel) CardView.this.bonusesHelper.mo72827a(i)).mo87609a(CardView.this.eventBus);
                                        break;
                                    case 17:
                                        view = CardBuilder.with(f2Var).forObject((BonusPrloUiModel) CardView.this.bonusesHelper.mo72827a(i)).mo87610a(CardView.this.eventBus);
                                        break;
                                }
                            } else {
                                view = CardBuilder.with(f2Var).forObject((BonusCashBackUiModel) CardView.this.bonusesHelper.mo72827a(i)).mo87608a(CardView.this.eventBus);
                            }
                        } else if (CardView.this.depositBondsContainer != null) {
                            if (CardView.this.getDepositBondItem(i) instanceof Deposit) {
                                view = CardBuilder.with(f2Var).forObject(CardView.this.depositBondsContainer.getDeposits()).mo87614a(i, CardView.this.eventBus);
                            } else {
                                view = CardBuilder.with(f2Var).forObject(CardView.this.depositBondsContainer.getBonds(), CardView.this.depositBondsContainer.getDeposits().getDeposits().size()).mo87613a(i - CardView.this.depositBondsContainer.getDeposits().getDeposits().size(), CardView.this.eventBus);
                            }
                        } else if (CardView.this.pension != null) {
                            view = CardBuilder.with(f2Var).forObject(CardView.this.pension).mo87616a(CardView.this.eventBus);
                        }
                        view = null;
                    }
                }
            }
            viewGroup.addView(view, new ViewGroup.LayoutParams(-1, C32355x0.m95516g(C10319h.loan_card_height)));
            CardView.this.cards.add(view);
            view.setTag("view" + i);
            if (i == CardView.this.defIndex) {
                f = 1.0f;
            } else {
                f = 0.8f;
            }
            view.setScaleY(f);
            view.setScaleX(f);
            return view;
        }

        /* renamed from: i */
        public boolean mo4597i(View view, Object obj) {
            return view == obj;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardView$d */
    private class C35787d extends Scroller {

        /* renamed from: a */
        private double f86440a = 2.0d;

        C35787d(Context context, Interpolator interpolator) {
            super(context, interpolator);
        }

        public void startScroll(int i, int i2, int i3, int i4, int i5) {
            super.startScroll(i, i2, i3, i4, (int) (((double) i5) * this.f86440a));
        }
    }

    public CardView(Context context) {
        this(context, (AttributeSet) null);
    }

    private String getLoanTitle(int i) {
        Loan loan = this.loans.getLoans().get(i);
        if (!TextUtils.isEmpty(loan.getLoanName())) {
            return loan.getLoanName();
        }
        return C27950a.m86286c(loan.getProductDictionaryKey(), false);
    }

    private void setUpAdapter() {
        C35786c cVar = new C35786c(getContext(), this.cardStatuses);
        this.adapter = cVar;
        setAdapter(cVar);
        setCurrentItem(this.defIndex);
        setOffscreenPageLimit(3);
    }

    /* access modifiers changed from: protected */
    public boolean canScroll(View view, boolean z, int i, int i2, int i3) {
        return false;
    }

    public List<C25838r> getAccountCards() {
        return this.accountCards;
    }

    public C25836p getAccounts() {
        return this.accounts;
    }

    public BondsWrapper getBondsWrapper() {
        return this.bondsWrapper;
    }

    public C32305g getBonusesHelper() {
        return this.bonusesHelper;
    }

    public CreditCardsWrapper getCredits() {
        return this.credits;
    }

    public int getCurrPage() {
        return this.currPage;
    }

    public Loan getCurrentLoan() {
        LoansWrapper loansWrapper = this.loans;
        if (loansWrapper == null) {
            return null;
        }
        return loansWrapper.getLoans().get(getCurrentItem());
    }

    public Object getDepositBondItem(int i) {
        if (i < this.depositBondsContainer.getDeposits().getDeposits().size()) {
            return this.depositBondsContainer.getDeposits().getDeposits().get(i);
        }
        return this.depositBondsContainer.getBonds().getBonds().getBonds().get(i - this.depositBondsContainer.getDeposits().getDeposits().size());
    }

    public LoansWrapper getLoans() {
        return this.loans;
    }

    public View getRootView(int i) {
        Iterator<View> it = this.cards.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next.getTag() != null) {
                String obj = next.getTag().toString();
                if (obj.equals("view" + i)) {
                    return next;
                }
            }
        }
        return null;
    }

    public void setAccount(C25836p pVar) {
        this.accounts = pVar;
        setUpAdapter();
    }

    public void setAccountCards(List<C25838r> list, ArrayList<CardBlockStatus> arrayList) {
        this.accountCards = list;
        this.cardStatuses = arrayList;
        setUpAdapter();
    }

    public void setBondsWrapper(BondsWrapper bondsWrapper2) {
        this.bondsWrapper = bondsWrapper2;
        setUpAdapter();
    }

    public void setBonusWrapper(int i, BonusWrapperUiModel bonusWrapperUiModel, Client client2) {
        this.client = client2;
        C32305g gVar = new C32305g(bonusWrapperUiModel, new C29875b(client2.hasProduct("AMEX"), client2.hasProduct(ProductType.BONUS_PROD_TYPE_CASHBACK), client2.hasProduct("SCOOLA"), client2.hasProduct("PLUS")));
        this.bonusesHelper = gVar;
        this.defIndex = gVar.mo72829c(i, this.defIndex);
        setUpAdapter();
    }

    public void setCreditAccount(CreditCardsWrapper creditCardsWrapper) {
        this.credits = creditCardsWrapper;
        setUpAdapter();
    }

    public void setCurrPage(int i) {
        this.currPage = i;
    }

    public void setDefIndex(int i) {
        if (i < 0) {
            i = 0;
        }
        this.defIndex = i;
    }

    public void setDepositBondsContainer(DepositBondsContainer depositBondsContainer2) {
        this.depositBondsContainer = depositBondsContainer2;
        setUpAdapter();
    }

    public void setEventBus(C41438c cVar) {
        this.eventBus = cVar;
    }

    public void setLoans(LoansWrapper loansWrapper) {
        this.loans = loansWrapper;
        setUpAdapter();
    }

    public void setPension(PensionResult pensionResult) {
        this.pension = pensionResult;
        setUpAdapter();
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        this.cards = new ArrayList<>();
        this.onPageChangeListener = new C35784a();
        if (!isInEditMode()) {
            Class<ViewPager> cls = ViewPager.class;
            try {
                Field declaredField = cls.getDeclaredField("mScroller");
                declaredField.setAccessible(true);
                Field declaredField2 = cls.getDeclaredField("sInterpolator");
                declaredField2.setAccessible(true);
                declaredField.set(this, new C35787d(getContext(), (Interpolator) declaredField2.get((Object) null)));
            } catch (Exception unused) {
            }
            if (context.getResources().getBoolean(C10317f.isTablet)) {
                i = (int) (TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics()) / 2.0f);
                setPageMargin((-i) * 10);
            } else {
                i = C32355x0.m95516g(C10319h.card_view_margin);
                setPageMargin((int) (((float) (-i)) * 1.5f));
            }
            this.pageWidth = (float) (C32355x0.m95521l(context) / (C32355x0.m95521l(context) - (i * 2)));
            setOverScrollMode(1);
            setPageTransformer(false, new C35785b());
            setPadding(i, i, i, i);
            setClipToPadding(false);
            setOverScrollMode(2);
            addOnPageChangeListener(this.onPageChangeListener);
            if (!C32359z0.m95584o()) {
                setLayerType(1, (Paint) null);
            }
        }
    }
}
