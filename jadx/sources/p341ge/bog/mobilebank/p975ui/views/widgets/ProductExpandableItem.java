package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g81.C32139d0;
import g91.C32290b1;
import g91.C32303f;
import g91.C32355x0;
import iu0.C36546y;
import java.util.ArrayList;
import l50.C25836p;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.CasTotalUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.eventbus.events.BondsEvent;
import p341ge.bog.mobilebank.eventbus.events.LoansEvent;
import p341ge.bog.mobilebank.eventbus.events.PensionsEvent;
import p341ge.bog.mobilebank.model.BondsWrapper;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepositBondsContainer;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10464h;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductExpandableItem */
public class ProductExpandableItem extends FrameLayout implements View.OnClickListener, View.OnLongClickListener {
    private static final long HEIGHT_ANIM_DURATION = 350;
    private static final long SUPER_SLOW_HEIGHT_ANIM_DURATION = 1800;
    public static final int TYPE_ACCOUNTS_AND_CARDS = 1;
    public static final int TYPE_BONDS_AND_SHARES = 5;
    public static final int TYPE_BONUS = 11;
    public static final int TYPE_BONUS_AMEX = 8;
    public static final int TYPE_BONUS_CAS = 9;
    public static final int TYPE_BONUS_CASH_BACK = 10;
    public static final int TYPE_BONUS_EXPRESS = 7;
    public static final int TYPE_BONUS_PLUS = 16;
    public static final int TYPE_BONUS_PRLOT = 17;
    public static final int TYPE_BONUS_SCOOL = 15;
    public static final int TYPE_CARDS = 6;
    public static final int TYPE_CREDIT_CARDS = 2;
    public static final int TYPE_DEPOSITS = 4;
    public static final int TYPE_LOANS = 3;
    public static final int TYPE_OPERATIONS_FRAGMENT = 12;
    public static final int TYPE_OPERATIONS_HOME_FRAGMENT = 14;
    public static final int TYPE_PENSIONS = 18;
    public static final int TYPE_UNAUTHORIZED_OPERATIONS_FRAGMENT = 13;
    private C25836p accounsWithCards;
    private BonusAmexUiModel amexPoints;
    private ImageView arrowImage;
    private View backgroundWhiteView;
    private BondsEvent bondsEvent;
    private BondsWrapper bondsWrapper;
    private BonusPrloUiModel bonusPrlo;
    private BonusCashBackUiModel cacCashbackPoints;
    private ArrayList<BonusCasServiceUiModel> casServices;
    private int childHeight;
    private int childTopMargin;
    int color;
    /* access modifiers changed from: private */
    public View container;
    private CreditCardsWrapper creditCardsWrapper;
    private int defaultMargin;
    private DepositBondsContainer depositBondsContainer;
    private boolean expanded;
    private boolean forceExpanded;
    private FragmentManager fragmentManager;
    private View indicator;
    /* access modifiers changed from: private */
    public View item;
    private View lastLayer;
    private FrameLayout layerContainer;
    private LoansEvent loansEvent;
    private LoansWrapper loansWrapper;
    private View middleLayer;
    private BogTextView moneyTV;
    private View.OnClickListener onClickListener;
    /* access modifiers changed from: private */
    public OnHeightChangedListener onHeightChangedListener;
    private OnNewLoanButtonClickedListener onNewLoanButtonClickedListener;
    private View parentContainer;
    private int parentContainerHeight;
    private PensionResult pensionResult;
    private PensionsEvent pensionsEvent;
    private BonusPlusUiModel plusPoints;
    private int positionToScroll;
    private ImageView productIconIV;
    private ImageView productLargeBackground;
    /* access modifiers changed from: private */
    public int productType;
    private C32139d0 productsRecyclerAdapter;
    private int recyclerTopMargin;
    private ArrayList<BonusScoolUiModel> scoolCards;
    private Boolean showNewLoanButton;
    private RecyclerView subViewsRecycler;
    private boolean superSlow;
    private BogTextView titleTV;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductExpandableItem$OnHeightChangedListener */
    public interface OnHeightChangedListener {
        void onHeightAnimationEnded(ProductExpandableItem productExpandableItem);

        void onHeightAnimationStarted(ProductExpandableItem productExpandableItem);

        void onHeightAnimationWorking(ProductExpandableItem productExpandableItem);
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductExpandableItem$OnNewLoanButtonClickedListener */
    public interface OnNewLoanButtonClickedListener {
        void onNewLoanButtonClicked();
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductExpandableItem$a */
    class C35759a implements View.OnClickListener {
        C35759a() {
        }

        public void onClick(View view) {
            if (!ProductExpandableItem.this.isExpanded()) {
                C36546y.m108282F().mo27152s(C10464h.m38032a(ProductExpandableItem.this.productType), C10464h.m38033b(ProductExpandableItem.this.productType), "expand");
            }
            ProductExpandableItem productExpandableItem = ProductExpandableItem.this;
            productExpandableItem.onClick(productExpandableItem.item);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductExpandableItem$b */
    class C35760b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        final /* synthetic */ int f86399d;

        C35760b(int i) {
            this.f86399d = i;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            C32290b1.m95124n(ProductExpandableItem.this.container, intValue);
            if (ProductExpandableItem.this.onHeightChangedListener == null) {
                return;
            }
            if (this.f86399d != intValue) {
                ProductExpandableItem.this.onHeightChangedListener.onHeightAnimationWorking(ProductExpandableItem.this);
            } else {
                ProductExpandableItem.this.onHeightChangedListener.onHeightAnimationEnded(ProductExpandableItem.this);
            }
        }
    }

    public ProductExpandableItem(Context context, int i, FragmentManager fragmentManager2) {
        super(context);
        this.showNewLoanButton = Boolean.FALSE;
        this.positionToScroll = -1;
        this.container = View.inflate(getContext(), C10324m.product_expandable_layout, this);
        this.fragmentManager = fragmentManager2;
        if (!isInEditMode()) {
            this.color = i;
            init();
        }
    }

    private void createAdapter() {
        C32139d0 d0Var = new C32139d0(this.subViewsRecycler, this.color, this.fragmentManager);
        this.productsRecyclerAdapter = d0Var;
        this.subViewsRecycler.setAdapter(d0Var);
    }

    private void init() {
        this.productIconIV = (ImageView) findViewById(C10322k.f28842hq);
        this.productLargeBackground = (ImageView) findViewById(C10322k.product_large_background);
        this.subViewsRecycler = (RecyclerView) this.container.findViewById(C10322k.product_parent_sub_views_recycler);
        this.subViewsRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        this.subViewsRecycler.setNestedScrollingEnabled(false);
        this.subViewsRecycler.setVisibility(4);
        this.backgroundWhiteView = findViewById(C10322k.background_white_color_view);
        this.item = this.container.findViewById(C10322k.product_parent_item_background);
        this.middleLayer = this.container.findViewById(C10322k.product_parent_middle_layer);
        this.lastLayer = this.container.findViewById(C10322k.product_parent_last_layer);
        this.titleTV = (BogTextView) this.container.findViewById(C10322k.product_parent_title);
        this.moneyTV = (BogTextView) this.container.findViewById(C10322k.product_parent_money);
        this.layerContainer = (FrameLayout) findViewById(C10322k.product_layer_container);
        this.parentContainer = findViewById(C10322k.product_parent_text_container);
        this.arrowImage = (ImageView) findViewById(C10322k.product_parent_rotate_arrow);
        this.indicator = findViewById(C10322k.product_indicator);
        this.moneyTV.setPivotX(Utils.FLOAT_EPSILON);
        this.moneyTV.setPivotY(Utils.FLOAT_EPSILON);
        this.item.setOnClickListener(new C35759a());
        this.item.setOnLongClickListener(this);
        this.titleTV.setOnClickListener(this);
        this.childHeight = C32355x0.m95516g(C10319h.product_child_item_height);
        this.defaultMargin = C32355x0.m95516g(C10319h.product_item_default_margin);
        this.childTopMargin = C32355x0.m95516g(C10319h.product_child_item_top_margin);
        this.parentContainerHeight = C32355x0.m95516g(C10319h.product_parent_container_height);
        this.recyclerTopMargin = C32355x0.m95516g(C10319h.product_recycler_top_margin);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setLoansEvent$0() {
        this.onNewLoanButtonClickedListener.onNewLoanButtonClicked();
    }

    private void setExpanded() {
        this.layerContainer.setVisibility(8);
        this.parentContainer.setVisibility(8);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.subViewsRecycler.getLayoutParams();
        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, 0, marginLayoutParams.rightMargin, 0);
        this.subViewsRecycler.requestLayout();
        this.recyclerTopMargin = 0;
        this.childTopMargin = 0;
        this.defaultMargin = 0;
        this.forceExpanded = true;
        this.productsRecyclerAdapter.mo72631H(14, false);
        this.subViewsRecycler.setVisibility(0);
        C32290b1.m95124n(this.container, getExpandedHeight());
    }

    private void setRecyclerHeight() {
        C32290b1.m95124n(this.subViewsRecycler, getExpandedHeight());
    }

    public void clear() {
        this.accounsWithCards = null;
        this.creditCardsWrapper = null;
        this.depositBondsContainer = null;
        this.loansWrapper = null;
        this.bondsWrapper = null;
        this.pensionResult = null;
        this.moneyTV.setText("");
    }

    public C25836p getAccountsWithCards() {
        return this.accounsWithCards;
    }

    public int getAdditionalScroll() {
        RecyclerView recyclerView;
        int i = this.positionToScroll;
        int i2 = 0;
        if (i >= 0 && (recyclerView = this.subViewsRecycler) != null) {
            AccountItemView accountItemView = (AccountItemView) recyclerView.getChildAt(i);
            if (accountItemView != null) {
                i2 = this.positionToScroll * accountItemView.getHeight();
            }
            this.positionToScroll = -1;
        }
        return i2;
    }

    public BondsEvent getBondsEvent() {
        return this.bondsEvent;
    }

    public int getExpandedHeight() {
        int i;
        C32139d0 d0Var = this.productsRecyclerAdapter;
        if (d0Var == null) {
            i = 0;
        } else {
            i = d0Var.mo72627D();
        }
        int i2 = (i * (this.childHeight + this.childTopMargin)) + this.recyclerTopMargin + this.defaultMargin;
        if (this.depositBondsContainer != null) {
            i2 = ((i2 + C32355x0.m95516g(C10319h.add_item_height)) - this.childTopMargin) - this.childHeight;
        }
        if (this.accounsWithCards != null) {
            i2 += C32355x0.m95516g(C10319h.add_item_height);
        }
        if (this.loansWrapper == null || !this.showNewLoanButton.booleanValue()) {
            return i2;
        }
        return i2 + C32355x0.m95516g(C10319h.add_item_height);
    }

    public LoansEvent getLoansEvent() {
        return this.loansEvent;
    }

    public PensionsEvent getPensionsEvent() {
        return this.pensionsEvent;
    }

    public boolean isExpanded() {
        return this.expanded;
    }

    public boolean isSuperSlow() {
        return this.superSlow;
    }

    public void onClick(View view) {
        if (view != this.item) {
            return;
        }
        if (this.loansWrapper != null || this.accounsWithCards != null || this.depositBondsContainer != null || this.creditCardsWrapper != null || this.bondsWrapper != null || this.casServices != null || this.amexPoints != null || this.scoolCards != null || this.plusPoints != null || this.bonusPrlo != null || this.pensionResult != null) {
            this.superSlow = false;
            toggle();
            View.OnClickListener onClickListener2 = this.onClickListener;
            if (onClickListener2 != null) {
                onClickListener2.onClick(this);
            }
        }
    }

    public boolean onLongClick(View view) {
        this.superSlow = true;
        toggle();
        View.OnClickListener onClickListener2 = this.onClickListener;
        if (onClickListener2 != null) {
            onClickListener2.onClick(this);
        }
        return true;
    }

    public void refreshData() {
        this.productsRecyclerAdapter.notifyDataSetChanged();
    }

    public void removeItemAt(int i) {
        C32290b1.m95124n(this.subViewsRecycler.getLayoutManager().mo5199O(i), 0);
    }

    public void resetFavorite() {
        for (int i = 0; i < this.subViewsRecycler.getLayoutManager().mo5660V(); i++) {
            if (this.subViewsRecycler.getLayoutManager().mo5658U(i) instanceof AccountItemView) {
                ((AccountItemView) this.subViewsRecycler.getLayoutManager().mo5658U(i)).resetFavorite();
            }
        }
    }

    public void setAccountsWithCards(C25836p pVar, boolean z) {
        this.accounsWithCards = pVar;
        createAdapter();
        this.productsRecyclerAdapter.mo72629F(this.accounsWithCards, z);
        if (!isExpanded()) {
            this.subViewsRecycler.setVisibility(4);
        }
        setRecyclerHeight();
        if (this.accounsWithCards.mo64561a().mo64555a().size() > 0) {
            setVisibility(0);
            double doubleValue = this.accounsWithCards.mo64561a().mo64557c().mo64482a().doubleValue();
            String h = C32303f.m95197h(this.accounsWithCards.mo64561a().mo64557c().mo64483b());
            BogTextView bogTextView = this.moneyTV;
            bogTextView.setText(C32303f.m95204o(doubleValue) + " " + h);
        } else {
            setVisibility(8);
        }
        ViewCompat.m3568O0(this, (float) (this.accounsWithCards.mo64561a().mo64555a().size() + 1));
        if (isExpanded()) {
            this.productsRecyclerAdapter.mo72631H(14, false);
            C32290b1.m95124n(this.container, getExpandedHeight());
        }
    }

    public void setAmexPoints(BonusAmexUiModel bonusAmexUiModel) {
        this.amexPoints = bonusAmexUiModel;
        createAdapter();
        this.productsRecyclerAdapter.mo72630G(bonusAmexUiModel);
        setRecyclerHeight();
        setExpanded();
        ViewCompat.m3568O0(this, 2.0f);
    }

    public void setBondsEvent(BondsEvent bondsEvent2) {
        this.bondsEvent = bondsEvent2;
        this.bondsWrapper = bondsEvent2.getBondsWrapper();
        createAdapter();
        this.productsRecyclerAdapter.mo72632I(this.bondsWrapper);
        setRecyclerHeight();
        if (this.bondsWrapper.getBonds().size() > 0) {
            setVisibility(0);
            double doubleValue = this.bondsWrapper.getClientInfo().getTotalValue().doubleValue();
            String i = C32303f.m95198i("GEL", true);
            if (this.bondsWrapper.getClientInfo().getCcy() != null) {
                i = C32303f.m95198i(this.bondsWrapper.getClientInfo().getCcy(), true);
            }
            BogTextView bogTextView = this.moneyTV;
            bogTextView.setText(C32303f.m95204o(doubleValue) + i);
        } else {
            setVisibility(8);
        }
        ViewCompat.m3568O0(this, (float) (this.bondsWrapper.getBonds().size() + 1));
    }

    public void setBonusPlus(BonusPlusUiModel bonusPlusUiModel) {
        this.plusPoints = bonusPlusUiModel;
        createAdapter();
        this.productsRecyclerAdapter.mo72639P(bonusPlusUiModel);
        setRecyclerHeight();
        setExpanded();
        ViewCompat.m3568O0(this, 2.0f);
    }

    public void setBonusPrlo(BonusPrloUiModel bonusPrloUiModel) {
        this.bonusPrlo = bonusPrloUiModel;
        createAdapter();
        this.productsRecyclerAdapter.mo72633J(bonusPrloUiModel);
        setRecyclerHeight();
        setExpanded();
        ViewCompat.m3568O0(this, 2.0f);
    }

    public void setCachBackPoints(BonusCashBackUiModel bonusCashBackUiModel) {
        this.cacCashbackPoints = bonusCashBackUiModel;
        createAdapter();
        this.productsRecyclerAdapter.mo72635L(this.cacCashbackPoints);
        setRecyclerHeight();
        setExpanded();
        ViewCompat.m3568O0(this, 2.0f);
    }

    public void setCasServices(ArrayList<BonusCasServiceUiModel> arrayList, ArrayList<CasTotalUiModel> arrayList2, Client client) {
        this.casServices = arrayList;
        createAdapter();
        this.productsRecyclerAdapter.mo72634K(arrayList, client);
        setRecyclerHeight();
        if (arrayList2 != null && arrayList2.size() > 0) {
            double doubleValue = arrayList2.get(0).mo52816b().doubleValue();
            String i = C32303f.m95198i(arrayList2.get(0).mo52815a(), true);
            BogTextView bogTextView = this.moneyTV;
            bogTextView.setText(C32303f.m95204o(doubleValue) + i);
        }
        ViewCompat.m3568O0(this, (float) (arrayList.size() + 1));
    }

    public void setLoansEvent(LoansEvent loansEvent2, Boolean bool) {
        this.loansEvent = loansEvent2;
        this.loansWrapper = loansEvent2.getLoansWrapper();
        this.showNewLoanButton = bool;
        createAdapter();
        this.productsRecyclerAdapter.mo72636M(this.loansWrapper, bool);
        if (this.onNewLoanButtonClickedListener != null) {
            this.productsRecyclerAdapter.mo72637N(new C35820s(this));
        }
        if (!isExpanded()) {
            this.subViewsRecycler.setVisibility(4);
        }
        setRecyclerHeight();
        if (this.loansWrapper.getLoans().size() > 0) {
            setVisibility(0);
            double doubleValue = this.loansWrapper.getSummary().getAmount().doubleValue();
            String h = C32303f.m95197h(this.loansWrapper.getSummary().getCcy());
            BogTextView bogTextView = this.moneyTV;
            bogTextView.setText(C32303f.m95204o(doubleValue) + " " + h);
        } else {
            setVisibility(8);
        }
        ViewCompat.m3568O0(this, (float) (this.loansWrapper.getLoans().size() + 1));
        if (isExpanded()) {
            this.productsRecyclerAdapter.mo72631H(14, false);
            C32290b1.m95124n(this.container, getExpandedHeight());
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
    }

    public void setOnHeightChangedListener(OnHeightChangedListener onHeightChangedListener2) {
        this.onHeightChangedListener = onHeightChangedListener2;
    }

    public void setOnNewLoanButtonClickedListener(OnNewLoanButtonClickedListener onNewLoanButtonClickedListener2) {
        this.onNewLoanButtonClickedListener = onNewLoanButtonClickedListener2;
    }

    public void setPensionsEvent(PensionsEvent pensionsEvent2) {
        this.pensionsEvent = pensionsEvent2;
        this.pensionResult = pensionsEvent2.pensionResult;
        createAdapter();
        PensionResult pensionResult2 = this.pensionResult;
        if (pensionResult2 == null || !pensionResult2.isMember) {
            setVisibility(8);
        } else {
            this.productsRecyclerAdapter.mo72638O(pensionResult2);
            setRecyclerHeight();
            setVisibility(0);
            double doubleValue = this.pensionResult.totalSaving.doubleValue();
            String i = C32303f.m95198i("GEL", true);
            BogTextView bogTextView = this.moneyTV;
            bogTextView.setText(C32303f.m95204o(doubleValue) + i);
        }
        ViewCompat.m3568O0(this, 2.0f);
    }

    public void setProductType(int i) {
        this.productLargeBackground.setVisibility(8);
        this.productType = i;
        if (i == 2) {
            this.productIconIV.setImageResource(C10320i.ic_creditcards);
            this.titleTV.setText(getResources().getString(C10328q.product_type_title_credit_cards));
        } else if (i == 3) {
            this.productIconIV.setImageResource(C10320i.ic_loans);
            this.titleTV.setText(getResources().getString(C10328q.product_type_title_loans));
        } else if (i == 4) {
            this.productIconIV.setImageResource(C10320i.ic_deposits);
            this.titleTV.setText(getResources().getString(C10328q.product_type_title_deposits));
        } else if (i == 5) {
            this.productIconIV.setImageResource(C10320i.ic_bonds);
            this.titleTV.setText(getResources().getString(C10328q.f28963nb));
        } else if (i == 8) {
            this.productIconIV.setVisibility(8);
            this.titleTV.setText(getContext().getString(C10328q.product_type_title_mr_points));
        } else if (i != 10) {
            switch (i) {
                case 15:
                    this.productIconIV.setVisibility(8);
                    this.productLargeBackground.setVisibility(0);
                    this.productLargeBackground.setImageResource(C10320i.product_background_scool);
                    this.titleTV.setText(getContext().getString(C10328q.product_type_title_scool_card));
                    return;
                case 16:
                    this.productIconIV.setVisibility(8);
                    this.titleTV.setText(getContext().getString(C10328q.product_type_title_plus));
                    return;
                case 17:
                    this.productIconIV.setVisibility(8);
                    this.titleTV.setText(getContext().getString(C10328q.product_type_title_prlo));
                    return;
                case 18:
                    this.productIconIV.setImageResource(C10320i.ic_pensions);
                    this.titleTV.setText(C27950a.m86284a("text.pensions.product.group.title"));
                    return;
                default:
                    return;
            }
        } else {
            this.productIconIV.setVisibility(8);
            this.titleTV.setText(getContext().getString(C10328q.product_type_title_cash_back));
        }
    }

    public void setScoolCards(ArrayList<BonusScoolUiModel> arrayList, int i) {
        this.scoolCards = arrayList;
        createAdapter();
        this.productsRecyclerAdapter.mo72640Q(arrayList);
        setRecyclerHeight();
        this.moneyTV.setText(String.valueOf(i));
        ViewCompat.m3568O0(this, (float) (arrayList.size() + 1));
    }

    public void setSwipeInitialStates(boolean z) {
        C32139d0 d0Var = this.productsRecyclerAdapter;
        if (d0Var != null) {
            d0Var.mo72641R(z);
        }
    }

    public void showIndicator(boolean z) {
        this.indicator.setVisibility(z ? 0 : 8);
    }

    public void toggle() {
        float f;
        float f2;
        long j;
        long j2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i;
        if (!this.forceExpanded) {
            int i2 = this.parentContainerHeight;
            if (!this.expanded) {
                i2 = getExpandedHeight();
            }
            boolean z = this.expanded;
            float f8 = 1.0f;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.7f;
            }
            if (z) {
                f2 = 1.0f;
            } else {
                f2 = 0.0f;
            }
            this.moneyTV.animate().scaleY(f).scaleX(f);
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.container.getHeight(), i2});
            if (this.superSlow) {
                j = SUPER_SLOW_HEIGHT_ANIM_DURATION;
            } else {
                j = HEIGHT_ANIM_DURATION;
            }
            ofInt.setDuration(j);
            ofInt.addUpdateListener(new C35760b(i2));
            ViewPropertyAnimator animate = this.layerContainer.animate();
            if (!this.expanded) {
                j2 = 300;
            } else {
                j2 = 0;
            }
            animate.setStartDelay(j2).alpha(f2);
            OnHeightChangedListener onHeightChangedListener2 = this.onHeightChangedListener;
            if (onHeightChangedListener2 != null) {
                onHeightChangedListener2.onHeightAnimationStarted(this);
            }
            ofInt.start();
            ViewPropertyAnimator animate2 = this.arrowImage.animate();
            if (this.expanded) {
                f3 = 0.0f;
            } else {
                f3 = 180.0f;
            }
            animate2.rotation(f3);
            ViewPropertyAnimator animate3 = this.arrowImage.animate();
            if (this.expanded) {
                f4 = 0.0f;
            } else {
                f4 = 1.0f;
            }
            animate3.alpha(f4);
            ViewPropertyAnimator animate4 = this.indicator.animate();
            if (this.expanded) {
                f5 = 1.0f;
            } else {
                f5 = 0.0f;
            }
            animate4.alpha(f5);
            ViewPropertyAnimator animate5 = this.backgroundWhiteView.animate();
            if (this.expanded) {
                f6 = 0.0f;
            } else {
                f6 = 1.0f;
            }
            animate5.alpha(f6);
            ViewPropertyAnimator animate6 = this.productIconIV.animate();
            if (this.expanded) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            animate6.alpha(f7);
            ViewPropertyAnimator animate7 = this.productLargeBackground.animate();
            if (!this.expanded) {
                f8 = 0.0f;
            }
            animate7.alpha(f8);
            C32139d0 d0Var = this.productsRecyclerAdapter;
            if (d0Var != null) {
                if (!this.expanded) {
                    i = 11;
                } else {
                    i = 12;
                }
                d0Var.mo72631H(i, this.superSlow);
                if (this.subViewsRecycler.getVisibility() != 0) {
                    this.subViewsRecycler.setVisibility(0);
                }
                this.expanded = !this.expanded;
                this.superSlow = false;
                setSwipeInitialStates(true);
                return;
            }
            return;
        }
        OnHeightChangedListener onHeightChangedListener3 = this.onHeightChangedListener;
        if (onHeightChangedListener3 != null) {
            onHeightChangedListener3.onHeightAnimationStarted(this);
        }
    }

    public ProductExpandableItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.showNewLoanButton = Boolean.FALSE;
        this.positionToScroll = -1;
    }
}
