package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.C2396k;
import com.bumptech.glide.load.resource.bitmap.C2520l;
import com.bumptech.glide.load.resource.bitmap.C2556z;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32290b1;
import g91.C32303f;
import g91.C32307h;
import g91.C32343x;
import g91.C32355x0;
import g91.C32359z0;
import i10.C25100c;
import iu0.C36546y;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import jg1.C41438c;
import l50.C25827g;
import l50.C25832l;
import l50.C25837q;
import l50.C25838r;
import n50.C26371b;
import p035c4.C2256h;
import p192o3.C7423a;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview.BudgetProgressBar;
import p341ge.bog.mobilebank.eventbus.events.SwipeItemClickEvent;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.model.CashAgreement;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.model.LoanInvoiceWrapper;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.MerchantDetails;
import p341ge.bog.mobilebank.p975ui.views.widgets.OurSwipeLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.util.InstallmentSpannableTextUtil;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView */
public class AccountItemView extends C35814m {
    private static final int CARD_COUNT = 4;
    public static final int CARD_TYPE_BOND = 3;
    private static final String INSTALLMENT_PROGRESS_LEFT_TEXT = "online.inst.product.progress.bar.text.left";
    private static final String INSTALLMENT_PROGRESS_RIGHT_TEXT = "online.inst.product.progress.bar.text.right";
    private static int blackWithOpacity = C10318g.product_half_black_color;
    private C25832l acc;
    private ImageView accountBackgroundImage;
    /* access modifiers changed from: private */
    public BogTextView accountBalance;
    private View accountDataPanel;
    private FrameLayout accountItemContainer;
    private BogTextView accountTitle;
    private BogTextView accountTitleBold;
    private BogTextView amountCollected;
    private BogTextView amountTarget;
    private BogTextView amountTargetTitle;
    private String analyticsCategory;
    private String analyticsLabel;
    private FrameLayout backgroundLayer;
    private View blockBackground;
    private int blockColor;
    private LinearLayout blockLayout;
    private ProductBlockView blockRedContainer;
    private BogTextView bondsAmountTV;
    private BogTextView bonusBalanceGel;
    private Button[] cardCounterViewList;
    private View[] cardImageListContainer;
    private ImageView[] cardImageViewList;
    private View[] cardIndicatorList;
    private View cardListContainer;
    private SelectableCCYView[] ccyContainerList;
    private View ccyListcontainer;
    private CreditCardAccount creditAcc;
    private BogTextView digitalCardIndicator;
    private FragmentManager fragmentManager;
    private boolean hasCardsBorder;
    private boolean inCardView;
    protected View itemToClick;
    C41438c mEventBus;
    private int[] multiBorderCardIconIds;
    private int[] multiCardIconIds;
    View.OnClickListener onOvalContainerClickListener;
    View.OnClickListener onSwipeItemClick;
    private ProductOvalContainer ovalContainer;
    int position;
    private RoundCornerType roundCornerType;
    private View roundedFrame;
    private RelativeLayout savingGoalContainer;
    private BudgetProgressBar savingProgress;
    private ProductBlockView secondRedContainer;
    private View shadowLayer;
    private int[] singleBorderCardIconIds;
    private int[] singleCardIconIds;
    private SwipeMenuHelper swipeMenuHelper;
    /* access modifiers changed from: private */
    public int type;
    protected View whiteRect;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView$RoundCornerType */
    public enum RoundCornerType {
        NONE,
        BOTH,
        TOP,
        BOTTOM
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView$a */
    class C35706a implements OurSwipeLayout.SwipeListener {
        C35706a() {
        }

        public void onClose(OurSwipeLayout ourSwipeLayout) {
        }

        public void onHandRelease(OurSwipeLayout ourSwipeLayout, float f, float f2) {
        }

        public void onOpen(OurSwipeLayout ourSwipeLayout) {
            C36546y.m108282F().mo27153t(AccountItemView.this.getAnalyticsCategory(), AccountItemView.this.getAnalyticsLabel(), "swipe_product", Long.valueOf(ourSwipeLayout.getDragEdge() == OurSwipeLayout.DragEdge.Left ? 1 : -1));
        }

        public void onStartClose(OurSwipeLayout ourSwipeLayout) {
        }

        public void onStartOpen(OurSwipeLayout ourSwipeLayout) {
        }

        public void onUpdate(OurSwipeLayout ourSwipeLayout, int i, int i2) {
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView$b */
    class C35707b implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ C25832l f86328d;

        C35707b(C25832l lVar) {
            this.f86328d = lVar;
        }

        public void onClick(View view) {
            AccountItemView accountItemView = AccountItemView.this;
            accountItemView.setSummedAmount(this.f86328d, accountItemView.accountBalance);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView$c */
    class C35708c implements View.OnClickListener {
        C35708c() {
        }

        public void onClick(View view) {
            SwipeItemClickEvent swipeItemClickEvent = new SwipeItemClickEvent(AccountItemView.this.position);
            swipeItemClickEvent.setIndex(((Integer) view.getTag()).intValue());
            swipeItemClickEvent.setAdditionalData(AccountItemView.this.type);
            int g = AccountItemView.this.type;
            if (g != 1) {
                if (g != 2) {
                    if (g != 3) {
                        if (g != 4) {
                            if (g == 9) {
                                if (swipeItemClickEvent.getIndex() == 0) {
                                    swipeItemClickEvent.setType(6);
                                    C36546y.m108282F().mo27152s("products", "statement", "swipe_menu_click");
                                } else if (swipeItemClickEvent.getIndex() == 1) {
                                    swipeItemClickEvent.setType(17);
                                    C36546y.m108282F().mo27152s("products", "deactivate", "swipe_menu_click");
                                }
                            }
                        } else if (swipeItemClickEvent.getIndex() == 0) {
                            swipeItemClickEvent.setType(1);
                            C36546y.m108282F().mo27152s("deposits", "edit", "card_swipe_menu_click");
                        } else if (swipeItemClickEvent.getIndex() == 1) {
                            swipeItemClickEvent.setType(23);
                            C36546y.m108282F().mo27152s("deposits", "violate", "card_swipe_menu_click");
                        } else if (swipeItemClickEvent.getIndex() == 2) {
                            swipeItemClickEvent.setType(5);
                            C36546y.m108282F().mo27152s("deposits", "transfer", "card_swipe_menu_click");
                        } else if (swipeItemClickEvent.getIndex() == 3) {
                            swipeItemClickEvent.setType(7);
                            C36546y.m108282F().mo27152s("deposits", "add_money", "card_swipe_menu_click");
                        } else if (swipeItemClickEvent.getIndex() == 4) {
                            swipeItemClickEvent.setType(9);
                            C36546y.m108282F().mo27152s("deposits", "money_box", "card_swipe_menu_click");
                        }
                    } else if (swipeItemClickEvent.getIndex() == 0) {
                        swipeItemClickEvent.setType(1);
                        C36546y.m108282F().mo27152s("products", "edit", "swipe_menu_click");
                    }
                } else if (swipeItemClickEvent.getIndex() == 0) {
                    swipeItemClickEvent.setType(11);
                    C36546y.m108282F().mo27152s("products", "favorite", "swipe_menu_click");
                } else if (swipeItemClickEvent.getIndex() == 1) {
                    swipeItemClickEvent.setType(1);
                    C36546y.m108282F().mo27152s("products", "edit", "swipe_menu_click");
                } else if (swipeItemClickEvent.getIndex() == 2) {
                    swipeItemClickEvent.setType(10);
                    C36546y.m108282F().mo27152s("products", "hide", "swipe_menu_click");
                } else if (swipeItemClickEvent.getIndex() == 3) {
                    swipeItemClickEvent.setType(2);
                    C36546y.m108282F().mo27152s("products", "share", "swipe_menu_click");
                    C36546y.m108282F().mo27140K("account_number");
                } else if (swipeItemClickEvent.getIndex() == 4) {
                    swipeItemClickEvent.setType(5);
                    C36546y.m108282F().mo27152s("products", "transfer", "swipe_menu_click");
                } else if (swipeItemClickEvent.getIndex() == 5) {
                    swipeItemClickEvent.setType(4);
                    C36546y.m108282F().mo27152s("products", "payment", "swipe_menu_click");
                }
            } else if (swipeItemClickEvent.getIndex() == 0) {
                swipeItemClickEvent.setType(11);
                C36546y.m108282F().mo27152s("products", "favorite", "swipe_menu_click");
            } else if (swipeItemClickEvent.getIndex() == 1) {
                swipeItemClickEvent.setType(10);
                C36546y.m108282F().mo27152s("products", "hide", "swipe_menu_click");
            } else if (swipeItemClickEvent.getIndex() == 2) {
                swipeItemClickEvent.setType(1);
                C36546y.m108282F().mo27152s("products", "edit", "swipe_menu_click");
            } else if (swipeItemClickEvent.getIndex() == 3) {
                swipeItemClickEvent.setType(2);
                C36546y.m108282F().mo27152s("products", "share", "swipe_menu_click");
                C36546y.m108282F().mo27140K("account_number");
            } else if (swipeItemClickEvent.getIndex() == 4) {
                swipeItemClickEvent.setType(5);
                C36546y.m108282F().mo27152s("products", "transfer", "swipe_menu_click");
            } else if (swipeItemClickEvent.getIndex() == 5) {
                swipeItemClickEvent.setType(4);
                C36546y.m108282F().mo27152s("products", "payment", "swipe_menu_click");
            } else if (swipeItemClickEvent.getIndex() == 6) {
                swipeItemClickEvent.setType(8);
                C36546y.m108282F().mo27152s("products", "add_money", "swipe_menu_click");
            }
            swipeItemClickEvent.setPosition(AccountItemView.this.position);
            AccountItemView.this.mEventBus.mo96184m(swipeItemClickEvent);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AccountItemView$d */
    class C35709d implements View.OnClickListener {
        C35709d() {
        }

        public void onClick(View view) {
            SwipeItemClickEvent swipeItemClickEvent = new SwipeItemClickEvent(AccountItemView.this.position);
            swipeItemClickEvent.setAdditionalData(AccountItemView.this.type);
            if (AccountItemView.this.type == 2) {
                swipeItemClickEvent.setType(15);
            }
            swipeItemClickEvent.setPosition(AccountItemView.this.position);
            AccountItemView.this.mEventBus.mo96184m(swipeItemClickEvent);
        }
    }

    public AccountItemView(Context context, boolean z) {
        this(context, (AttributeSet) null, -1, ((C1505h) C25100c.m80063b(context)).getSupportFragmentManager(), z);
    }

    private void adaptSubAccountLayout(View view, int i) {
        if (i == ProductProperties.invertBlackColor) {
            view.setBackground(C0767a.m2895e(getContext(), C10320i.account_card_rounded_rect_dark));
        } else {
            view.setBackground(C0767a.m2895e(getContext(), C10320i.account_card_rounded_rect_light));
        }
    }

    private void addSwipeMenu(boolean z, String str, int i, int i2, boolean z2, int i3, boolean z3) {
        SwipeMenuButton swipeMenuButton = new SwipeMenuButton(getContext());
        swipeMenuButton.setTitle(str);
        swipeMenuButton.setShouldTint(z3);
        swipeMenuButton.setImageId(i);
        swipeMenuButton.setBlockedImageId(i2);
        swipeMenuButton.setTextColorId(this.swipeMenuHelper.getTextColorId());
        swipeMenuButton.setBackgroundColorId(this.swipeMenuHelper.getBackgroundColorId());
        swipeMenuButton.setBlocked(z2);
        swipeMenuButton.setTag(Integer.valueOf(i3));
        swipeMenuButton.setSize(C10319h.swipe_menu_button_size);
        if (z) {
            if (getSwipeRightView().getChildCount() == 0) {
                getSwipeRightView().setPadding(0, 0, C32355x0.m95517h(C10319h.item_default_margin, getContext()), 0);
            }
            getSwipeRightView().addView(swipeMenuButton);
        } else {
            if (getSwipeLeftView().getChildCount() == 0) {
                getSwipeLeftView().setPadding(C32355x0.m95517h(C10319h.item_default_margin, getContext()), 0, 0, 0);
            }
            getSwipeLeftView().addView(swipeMenuButton);
        }
        if (!z2) {
            swipeMenuButton.setOnClickListener(this.onSwipeItemClick);
        }
    }

    /* access modifiers changed from: private */
    public String getAnalyticsCategory() {
        return this.analyticsCategory;
    }

    /* access modifiers changed from: private */
    public String getAnalyticsLabel() {
        return this.analyticsLabel;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setAccount$1(C25832l lVar, C13310d dVar, p341ge.bog.designsystem.components.buttons.Button button) {
        TransferForm.startWith(getContext(), "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(lVar.mo64529g()).setAmount(String.valueOf(lVar.mo64523b().mo64495d())).start();
        dVar.mo4577k1();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setAccountBlocked$4(C1483c cVar, View view) {
        cVar.mo4576A1(this.fragmentManager, "Alert");
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setCreditCard$3(CreditCardAccount creditCardAccount, p341ge.bog.designsystem.components.buttons.Button button) {
        TransferForm.startWith(getContext(), "TRANSFER", TransferForm.OPERATION_VIEW).setTransferForm(TransferForm.TRANSFER_FORM_OWN).setDestinationAcctKey(creditCardAccount.getAcctKey()).start();
    }

    private void resetItem() {
        getSwipeLeftView().removeAllViews();
        getSwipeRightView().removeAllViews();
        setBackgroundImage(C10320i.f28688dc);
        this.accountTitleBold.setText("");
        this.accountTitle.setText("");
        this.accountBalance.setText("");
        this.bonusBalanceGel.setText("");
        findViewById(C10322k.card_moneys_parent).setVisibility(8);
        ((LinearLayout) findViewById(C10322k.account_card_moneys_container)).removeAllViews();
        this.ccyListcontainer.setVisibility(8);
        for (SelectableCCYView visibility : this.ccyContainerList) {
            visibility.setVisibility(8);
        }
        for (View visibility2 : this.cardImageListContainer) {
            visibility2.setVisibility(8);
        }
        this.ovalContainer.setVisibility(8);
        this.cardListContainer.setVisibility(8);
        this.blockBackground.setVisibility(8);
        this.blockRedContainer.setVisibility(8);
        this.secondRedContainer.setVisibility(8);
    }

    private void setAccountBalance(String str, String str2, int i) {
        BogTextView bogTextView = this.accountBalance;
        bogTextView.setText(str + " " + str2);
        this.accountBalance.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    private void setAccountBlocked(String str, C1483c cVar) {
        this.blockRedContainer.setVisibility(0);
        this.blockRedContainer.setText(str);
        this.blockBackground.setVisibility(0);
        if (cVar != null) {
            this.blockRedContainer.setOnClickListener(new C35806e(this, cVar));
        }
    }

    private void setAccountTitle(String str, int i) {
        this.accountTitle.setText(str);
        this.accountTitle.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    private void setBackGroundColorId(int i) {
        float f;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float g = (float) C32355x0.m95516g(C10319h.product_card_corner_radius);
        RoundCornerType roundCornerType2 = this.roundCornerType;
        RoundCornerType roundCornerType3 = RoundCornerType.BOTH;
        if (roundCornerType2 == roundCornerType3 || roundCornerType2 == RoundCornerType.TOP) {
            f = g;
        } else {
            f = 0.0f;
        }
        if (!(roundCornerType2 == roundCornerType3 || roundCornerType2 == RoundCornerType.BOTTOM)) {
            g = 0.0f;
        }
        gradientDrawable.setCornerRadii(new float[]{f, f, f, f, g, g, g, g});
        gradientDrawable.setColor(C32355x0.m95514e(i, getContext()));
        this.accountBackgroundImage.setBackground(gradientDrawable);
    }

    private void setBackgroundImage(int i) {
        if (i != -1) {
            int g = C32355x0.m95516g(C10319h.default_corner_radius_redesign);
            RoundCornerType roundCornerType2 = this.roundCornerType;
            RoundCornerType roundCornerType3 = RoundCornerType.BOTH;
            int i2 = (roundCornerType2 == roundCornerType3 || roundCornerType2 == RoundCornerType.TOP) ? g : 0;
            if (!(roundCornerType2 == roundCornerType3 || roundCornerType2 == RoundCornerType.BOTTOM)) {
                g = 0;
            }
            float f = (float) i2;
            float f2 = (float) g;
            C2379b.m9210t(getContext()).mo7755w(Integer.valueOf(i)).mo7215a((C2256h) new C2256h().mo7255x0(new C2520l(), new C2556z(f, f, f2, f2))).mo7718L0(this.accountBackgroundImage);
        }
    }

    private void setBonusBalance(Double d) {
        if (d != null) {
            this.bonusBalanceGel.setText(C32359z0.m95540K(d.toString(), true));
        } else {
            this.bonusBalanceGel.setText("");
        }
    }

    private void setDigitalCardIndicator(C25832l lVar) {
        if (lVar.mo64536m()) {
            this.digitalCardIndicator.setVisibility(0);
        } else {
            this.digitalCardIndicator.setVisibility(8);
        }
    }

    private void setExternalBackgroundImage(AccountLov accountLov, ProductProperties productProperties) {
        C25832l a = C26371b.m82431a(ProductProperties.cardsAndDetailsUIModel, accountLov.getMainAcctKey());
        if (a != null && a.mo64535l() != null && a.mo64535l().getFileUrl() != null) {
            ProductProperties.setTheme(productProperties, a.mo64535l().isDark());
            setBackgroundImage(C32289b0.m95091c(a.mo64535l().getFileUrl()), false);
        }
    }

    /* access modifiers changed from: private */
    public void setSummedAmount(C25832l lVar, TextView textView) {
        int i;
        if (textView.getTag() != null) {
            i = ((Integer) textView.getTag()).intValue() + 1;
            textView.setTag((Object) null);
        } else {
            i = -1;
        }
        if (i == -1) {
            i = lVar.mo64523b().mo64493b();
        }
        int i2 = 0;
        if (i >= lVar.mo64523b().mo64492a().size()) {
            i = 0;
        }
        C25827g gVar = (C25827g) lVar.mo64523b().mo64492a().get(i);
        int i3 = i + 1;
        if (i3 != lVar.mo64523b().mo64492a().size()) {
            i2 = i3;
        }
        lVar.mo64523b().mo64498f(i2);
        textView.setText(C32303f.m95204o(gVar.mo64487a().doubleValue()) + C32303f.m95198i(gVar.mo64488b(), true));
        C36546y.m108282F().mo27152s("accounts", gVar.mo64488b(), "switch_currency");
    }

    private void setUpCard(int i, long j, boolean z) {
        setUpCard(i, j, -1, z);
    }

    private void setUpCcy(int i, String str, int i2, int i3, boolean z) {
        this.ccyListcontainer.setVisibility(0);
        this.ccyContainerList[i].setVisibility(0);
        this.ccyContainerList[i].setCCYSelected(z);
        this.ccyContainerList[i].setText(str);
        this.ccyContainerList[i].setTextColor(i2);
        this.ccyContainerList[i].setBorderColor(i3);
    }

    private void showBondContainer(Bond bond, String str, int i, int i2, int i3) {
        this.ovalContainer.setVisibility(0);
        this.ovalContainer.setBond(bond, str, i, i2, i3);
    }

    private void showCardList(boolean z) {
        this.cardListContainer.setVisibility(0);
        this.hasCardsBorder = z;
    }

    private void showCashBackContainer(BonusCashBackUiModel bonusCashBackUiModel, String str, int i, int i2, int i3) {
        this.ovalContainer.setVisibility(0);
        this.ovalContainer.setCashBack(bonusCashBackUiModel, str, i, i2, i3);
    }

    private void showCreditCardContainer(CreditCardAccount creditCardAccount, int i, int i2, int i3) {
        this.ovalContainer.setVisibility(0);
        this.ovalContainer.setCreditAccount(creditCardAccount, i, i2, i3);
        this.ovalContainer.setOnClickListener(this.onOvalContainerClickListener);
    }

    private void showDepositBondContainer(DepositBond depositBond, int i, int i2, int i3) {
        this.ovalContainer.setVisibility(0);
        this.ovalContainer.setDepositBond(depositBond, i, i2, i3);
    }

    private void showDepositContainer(Deposit deposit, int i, int i2, int i3) {
        this.savingGoalContainer.setVisibility(8);
        this.ovalContainer.setVisibility(0);
        this.ovalContainer.setDeposit(deposit, i, i2, i3);
    }

    private void showInstallmentProgress(BigDecimal bigDecimal, BigDecimal bigDecimal2, String str, ProductProperties productProperties) {
        this.savingGoalContainer.setVisibility(0);
        this.ovalContainer.setVisibility(8);
        int c = C0767a.m2893c(getContext(), C10318g.installment_green);
        BigDecimal scale = bigDecimal.divide(bigDecimal2, new MathContext(4, RoundingMode.HALF_UP)).multiply(new BigDecimal(100)).setScale(0, 4);
        this.savingProgress.setPositiveProgressColor(c);
        this.savingProgress.setNegativeProgressColor(c);
        this.savingProgress.mo53614g(bigDecimal2.floatValue(), bigDecimal.floatValue(), false);
        this.amountCollected.setText(InstallmentSpannableTextUtil.getColorizedText(C27950a.m86284a(INSTALLMENT_PROGRESS_LEFT_TEXT) + " ", scale + "%", c));
        this.amountTarget.setText(C32303f.m95203n(bigDecimal2, str));
        this.amountCollected.setTextColor(C32355x0.m95514e(productProperties.getTitleColorId(), getContext()));
        this.amountTarget.setTextColor(C32355x0.m95514e(productProperties.getTitleColorId(), getContext()));
        this.amountTargetTitle.setText(C27950a.m86284a(INSTALLMENT_PROGRESS_RIGHT_TEXT) + " ");
        this.amountTargetTitle.setTextColor(C32355x0.m95514e(productProperties.getTitleColorId(), getContext()));
    }

    private void showLoanContainer(LoanInvoiceWrapper loanInvoiceWrapper, String str, int i, int i2, int i3) {
        this.ovalContainer.setVisibility(0);
        this.ovalContainer.setLoan(loanInvoiceWrapper, str, i, i2, i3);
    }

    public void changeHeight() {
        C32290b1.m95124n(this, C32355x0.m95511b(133.0f, getContext()));
    }

    public void changeMargins() {
        ((ViewGroup.MarginLayoutParams) this.accountDataPanel.getLayoutParams()).setMargins(0, 0, 0, 0);
        this.accountDataPanel.requestLayout();
        ((ViewGroup.MarginLayoutParams) this.backgroundLayer.getLayoutParams()).setMargins(0, ((ViewGroup.MarginLayoutParams) this.backgroundLayer.getLayoutParams()).topMargin, 0, ((ViewGroup.MarginLayoutParams) this.backgroundLayer.getLayoutParams()).bottomMargin);
        this.backgroundLayer.requestLayout();
        ((ViewGroup.MarginLayoutParams) this.blockBackground.getLayoutParams()).setMargins(0, 0, 0, 0);
        this.blockBackground.requestLayout();
        ((ViewGroup.MarginLayoutParams) this.blockLayout.getLayoutParams()).setMargins(0, ((ViewGroup.MarginLayoutParams) this.blockLayout.getLayoutParams()).topMargin, C32355x0.m95516g(C10319h.product_item_default_margin), 0);
        this.blockBackground.requestLayout();
    }

    public View getBlockBackground() {
        return this.blockBackground;
    }

    public View getShadowLayer() {
        return this.shadowLayer;
    }

    /* access modifiers changed from: protected */
    public LinearLayout getSwipeLeftView() {
        return (LinearLayout) findViewById(C10322k.left_view);
    }

    /* access modifiers changed from: protected */
    public LinearLayout getSwipeRightView() {
        return (LinearLayout) findViewById(C10322k.right_view);
    }

    /* access modifiers changed from: protected */
    public OurSwipeLayout getSwipeView() {
        return (OurSwipeLayout) findViewById(C10322k.swipe_layout);
    }

    public View getWhiteRectView() {
        return this.whiteRect;
    }

    public void optimizeCard(boolean z) {
        getWhiteRectView().setVisibility(8);
        getShadowLayer().setVisibility(8);
        if (z) {
            changeMargins();
        }
    }

    public void removeBottomMargins() {
        ((ViewGroup.MarginLayoutParams) this.accountItemContainer.getLayoutParams()).setMargins(0, ((ViewGroup.MarginLayoutParams) this.accountItemContainer.getLayoutParams()).topMargin, 0, 0);
        this.accountItemContainer.requestLayout();
        this.blockBackground.setVisibility(8);
    }

    public void resetFavorite() {
        SwipeMenuButton swipeMenuButton = (SwipeMenuButton) getSwipeLeftView().getChildAt(0);
        C25832l lVar = this.acc;
        if (lVar == null) {
            CreditCardAccount creditCardAccount = this.creditAcc;
            if (creditCardAccount == null) {
                return;
            }
            if (creditCardAccount.isDefault()) {
                swipeMenuButton.setShouldTint(true);
                swipeMenuButton.setImageId(C10320i.ic_account_swipe_favoriti);
                return;
            }
            swipeMenuButton.setShouldTint(false);
            swipeMenuButton.setImageId(C10320i.ic_account_swipe_favoriti_blocked);
        } else if (lVar.mo64543t()) {
            swipeMenuButton.setShouldTint(true);
            swipeMenuButton.setImageId(C10320i.ic_account_swipe_favoriti);
        } else {
            swipeMenuButton.setShouldTint(false);
            swipeMenuButton.setImageId(C10320i.ic_account_swipe_favoriti_blocked);
        }
    }

    public void resetSwipe(boolean z) {
        getSwipeView().close(z, true);
    }

    public void setAccount(C25832l lVar, int i, boolean z) {
        int i2;
        boolean z2;
        double d;
        boolean z3;
        int i3;
        int i4;
        C25832l lVar2 = lVar;
        this.analyticsCategory = "products";
        this.analyticsLabel = "accounts_and_cards";
        this.position = i;
        this.acc = lVar2;
        resetItem();
        ProductProperties properties = ProductProperties.getProperties(lVar);
        this.type = 1;
        String c = lVar.mo64524c();
        String h = C32303f.m95197h(lVar.mo64533j());
        String o = C32303f.m95204o(lVar.mo64532i());
        setBackGroundColorId(properties.getBackgroundColorId());
        setAccountTitle(c, properties.getTitleColorId());
        setAccountBalance(o, h, properties.getAmountColorId());
        setDigitalCardIndicator(lVar);
        if (!(lVar.mo64523b() == null || lVar.mo64523b().mo64495d() == null || lVar.mo64523b().mo64495d().doubleValue() <= Utils.DOUBLE_EPSILON)) {
            C13310d dVar = new C13310d();
            dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
            Context context = getContext();
            int i5 = C10328q.f28947Wa;
            dVar.mo35648c2(context.getString(i5));
            dVar.mo35639Q1(getContext().getString(C10328q.product_item_view_text_overuse_desc) + " " + C32303f.m95204o(lVar.mo64523b().mo64495d().doubleValue()));
            dVar.mo35642U1(getContext().getString(C10328q.f28928H0));
            dVar.mo35641T1(new C35807f(dVar));
            dVar.mo35646Z1(getContext().getString(C10328q.button_text_pay));
            dVar.mo35645Y1(new C35808g(this, lVar2, dVar));
            setAccountBlocked(getContext().getString(i5), dVar);
        }
        setBackgroundImage(properties.getBackgroundImageId());
        setBackgroundImage(lVar.mo64530h());
        int i6 = 0;
        if (this.inCardView) {
            Drawable l = C32290b1.m95122l(getContext(), C0767a.m2895e(getContext(), C10320i.ic_currency_choose_icon), properties.getAmountColorId());
            this.accountBalance.setCompoundDrawablePadding(C32355x0.m95511b(5.0f, getContext()));
            this.accountBalance.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, l, (Drawable) null);
            ArrayList arrayList = new ArrayList(lVar.mo64523b().mo64496e());
            findViewById(C10322k.card_moneys_parent).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(C10322k.account_card_moneys_container);
            linearLayout.removeAllViews();
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                C25837q qVar = (C25837q) arrayList.get(i7);
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C10324m.account_card_moneys_tv, (ViewGroup) null);
                adaptSubAccountLayout(textView, properties.getCurrencyBorderColorId());
                textView.setText(qVar.mo64571f());
                textView.setTextColor(C32355x0.m95514e(properties.getCurrencyColorId(), getContext()));
                if (qVar.mo64569e() == null || qVar.mo64569e().doubleValue() == Utils.DOUBLE_EPSILON) {
                    textView.setAlpha(0.4f);
                }
                linearLayout.addView(textView);
                textView.getLayoutParams().height = -1;
                if (i7 == 0) {
                    i4 = C32355x0.m95516g(C10319h.item_default_margin);
                } else if (i7 < arrayList.size() - 1) {
                    i4 = C32355x0.m95516g(C10319h.card_moneys_tv_left_margin);
                } else {
                    i4 = C32355x0.m95516g(C10319h.card_moneys_tv_left_margin);
                    i3 = C32355x0.m95516g(C10319h.item_default_margin);
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(i4, 0, i3, 0);
                    textView.requestLayout();
                }
                i3 = 0;
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(i4, 0, i3, 0);
                textView.requestLayout();
            }
            if (z) {
                Iterator it = this.acc.mo64523b().mo64496e().iterator();
                while (it.hasNext() && ((C25837q) it.next()).mo64565a() != lVar.mo64537n()) {
                    i6++;
                }
                this.accountBalance.setTag(Integer.valueOf(i6));
                this.accountBalance.setOnClickListener(new C35707b(lVar2));
                return;
            }
            return;
        }
        for (int i8 = 0; i8 < lVar.mo64523b().mo64496e().size(); i8++) {
            C25837q qVar2 = (C25837q) lVar.mo64523b().mo64496e().get(i8);
            if (i8 == 6) {
                break;
            }
            String h2 = C32303f.m95197h(qVar2.mo64566b());
            int currencyColorId = properties.getCurrencyColorId();
            int currencyBorderColorId = properties.getCurrencyBorderColorId();
            if (qVar2.mo64569e() != null) {
                d = qVar2.mo64569e().doubleValue();
            } else {
                d = 0.0d;
            }
            if (d != Utils.DOUBLE_EPSILON) {
                z3 = true;
            } else {
                z3 = false;
            }
            setUpCcy(i8, h2, currencyColorId, currencyBorderColorId, z3);
        }
        if (lVar.mo64522a().size() > 0) {
            showCardList(properties.hasCardsBorder());
            int i9 = 0;
            boolean z4 = false;
            int i12 = 0;
            boolean z5 = false;
            int i13 = 0;
            boolean z6 = false;
            for (C25838r rVar : lVar.mo64522a()) {
                int e = C32307h.m95228e(rVar);
                if (e == 0) {
                    if (rVar.mo64598v().mo63390c()) {
                        z4 = true;
                    }
                    i9++;
                } else if (e == 1) {
                    if (rVar.mo64598v().mo63390c()) {
                        z5 = true;
                    }
                    i12++;
                } else if (e == 2) {
                    if (rVar.mo64598v().mo63390c()) {
                        z6 = true;
                    }
                    i13++;
                }
            }
            setUpCard(0, (long) i9, z4);
            setUpCard(1, (long) i12, z5);
            setUpCard(2, (long) i13, z6);
        }
        getSwipeLeftView().removeAllViews();
        getSwipeRightView().removeAllViews();
        if (lVar.mo64543t()) {
            addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_favorite_acc), C10320i.ic_account_swipe_favoriti, C10320i.ic_account_swipe_favoriti_blocked, false, 0, true);
        } else {
            String string = getResources().getString(C10328q.product_item_view_swipe_favorite_acc);
            int i14 = C10320i.ic_account_swipe_favoriti_blocked;
            addSwipeMenu(false, string, i14, i14, false, 0, false);
        }
        addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_hide_acc), C10320i.ic_account_swipe_damalva, C10320i.ic_account_swipe_damalva_blocked, false, 1);
        addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_edit), C10320i.ic_account_swipe_redaktireba, C10320i.ic_account_swipe_redaktireba_blocked, false, 2);
        if (C32303f.m95212w("REQUISITE", lVar.mo64540q())) {
            addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_share), C10320i.ic_account_swipe_rekvizitebis_gaziareba, C10320i.ic_account_swipe_rekvizitebis_gaziareba_blocked, false, 3);
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (C32303f.m95212w("OUT_TRANSFER", lVar.mo64540q())) {
            String string2 = getResources().getString(C10328q.f28946Va);
            int i15 = C10320i.ic_account_swipe_gadaricxva;
            int i16 = C10320i.ic_account_swipe_gadaricxva_blocked;
            if (lVar.mo64532i() <= Utils.DOUBLE_EPSILON) {
                z2 = true;
            } else {
                z2 = false;
            }
            addSwipeMenu(true, string2, i15, i16, z2, 4);
            i2++;
        }
        if (C32303f.m95212w("PAYMENT", lVar.mo64540q())) {
            addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_pay), C10320i.ic_account_swipe_gadaxda, C10320i.ic_account_swipe_gadaxda_blocked, false, 5);
            i2++;
        }
        if (i2 < 3 && C32303f.m95212w("ADD_AMOUNT", lVar.mo64540q())) {
            addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_add_money), C10320i.ic_account_swipe_charicxva, C10320i.ic_account_swipe_charicxva_blocked, false, 6);
        }
    }

    public void setAccountLov(AccountLov accountLov, int i, Client client) {
        int i2;
        int i3;
        this.position = i;
        resetItem();
        ProductProperties properties = ProductProperties.getProperties(accountLov, client, true);
        this.type = 1;
        String accountTitle2 = accountLov.getAccountTitle();
        String h = C32303f.m95197h(accountLov.getCcy());
        String o = C32303f.m95204o(accountLov.getAvailableAmount().doubleValue());
        setBackGroundColorId(properties.getBackgroundColorId());
        setBackgroundImage(properties.getBackgroundImageId());
        setExternalBackgroundImage(accountLov, properties);
        setAccountTitle(accountTitle2, properties.getTitleColorId());
        setAccountBalance(o, h, properties.getAmountColorId());
        if (this.inCardView) {
            ArrayList<AccountLov> subAccounts = accountLov.getSubAccounts();
            findViewById(C10322k.card_moneys_parent).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(C10322k.account_card_moneys_container);
            linearLayout.removeAllViews();
            for (int i4 = 0; i4 < subAccounts.size(); i4++) {
                AccountLov accountLov2 = subAccounts.get(i4);
                TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C10324m.account_card_moneys_tv, (ViewGroup) null);
                adaptSubAccountLayout(textView, properties.getCurrencyBorderColorId());
                textView.setText(accountLov2.getRealAmountFormatted());
                textView.setTextColor(C32355x0.m95514e(properties.getCurrencyColorId(), getContext()));
                if (accountLov2.getRealAmount() == null || accountLov2.getRealAmount().doubleValue() == Utils.DOUBLE_EPSILON) {
                    textView.setAlpha(0.4f);
                }
                linearLayout.addView(textView);
                textView.getLayoutParams().height = -1;
                if (i4 == 0) {
                    i3 = C32355x0.m95516g(C10319h.item_default_margin);
                } else if (i4 < subAccounts.size() - 1) {
                    i3 = C32355x0.m95516g(C10319h.card_moneys_tv_left_margin);
                } else {
                    i3 = C32355x0.m95516g(C10319h.card_moneys_tv_left_margin);
                    i2 = C32355x0.m95516g(C10319h.item_default_margin);
                    ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(i3, 0, i2, 0);
                    textView.requestLayout();
                }
                i2 = 0;
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(i3, 0, i2, 0);
                textView.requestLayout();
            }
        }
    }

    public void setBond(Bond bond, int i) {
        int i2;
        int i3;
        this.analyticsCategory = "products";
        this.analyticsLabel = "bonds_and_shares";
        this.position = i;
        ProductProperties properties = ProductProperties.getProperties(bond);
        this.type = 5;
        if (bond.getCashAgreements() == null) {
            String securityName = bond.getSecurityName();
            String h = C32303f.m95197h(bond.getCcy().toUpperCase());
            String o = C32303f.m95204o(bond.getMarketPrice().doubleValue() * ((double) bond.getQuantity()));
            setBackGroundColorId(properties.getBackgroundColorId());
            setAccountTitle(securityName, properties.getTitleColorId());
            setAccountBalance(o, h, properties.getAmountColorId());
            setBackgroundImage(properties.getBackgroundImageId());
            showBondContainer(bond, h, properties.getOvalTextColorId(), properties.getOvalBorderColorId(), properties.getOvalFillColorId());
            showCardList(properties.hasCardsBorder());
            setUpCard(3, bond.getQuantity(), properties.getAmountColorId(), false);
            return;
        }
        String string = getContext().getString(C10328q.product_item_view_title_cash);
        String h2 = C32303f.m95197h("GEL");
        String o2 = C32303f.m95204o(bond.getCashValue().doubleValue());
        setBackGroundColorId(properties.getBackgroundColorId());
        setAccountTitle(string, properties.getTitleColorId());
        setAccountBalance(o2, h2, properties.getAmountColorId());
        setBackgroundImage(properties.getBackgroundImageId());
        int i4 = 0;
        if (!this.inCardView) {
            while (i4 < bond.getCashAgreements().size()) {
                CashAgreement cashAgreement = bond.getCashAgreements().get(i4);
                if (i4 != 6) {
                    setUpCcy(i4, C32303f.m95197h(cashAgreement.getCcy()), properties.getCurrencyColorId(), properties.getCurrencyBorderColorId(), true);
                    i4++;
                } else {
                    return;
                }
            }
            return;
        }
        findViewById(C10322k.card_moneys_parent).setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) findViewById(C10322k.account_card_moneys_container);
        linearLayout.removeAllViews();
        for (int i5 = 0; i5 < bond.getCashAgreements().size(); i5++) {
            CashAgreement cashAgreement2 = bond.getCashAgreements().get(i5);
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C10324m.account_card_moneys_tv, (ViewGroup) null);
            adaptSubAccountLayout(textView, properties.getCurrencyBorderColorId());
            double doubleValue = cashAgreement2.getQuantity().doubleValue();
            textView.setText(C32303f.m95204o(doubleValue) + C32303f.m95198i(cashAgreement2.getCcy(), true));
            textView.setTextColor(C32355x0.m95514e(properties.getCurrencyColorId(), getContext()));
            if (doubleValue == Utils.DOUBLE_EPSILON) {
                textView.setAlpha(0.4f);
            }
            linearLayout.addView(textView);
            textView.getLayoutParams().height = -1;
            if (i5 == 0) {
                i3 = C32355x0.m95516g(C10319h.item_default_margin);
            } else if (i5 < bond.getCashAgreements().size() - 1) {
                i3 = C32355x0.m95516g(C10319h.card_moneys_tv_left_margin);
            } else {
                i3 = C32355x0.m95516g(C10319h.card_moneys_tv_left_margin);
                i2 = C32355x0.m95516g(C10319h.item_default_margin);
                ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(i3, 0, i2, 0);
                textView.requestLayout();
            }
            i2 = 0;
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).setMargins(i3, 0, i2, 0);
            textView.requestLayout();
        }
    }

    public void setBonusAmex(BonusAmexUiModel bonusAmexUiModel) {
        this.analyticsCategory = "more_loyalty_programs";
        this.analyticsLabel = "mr";
        this.type = 8;
        ProductProperties propertiesForAmex = ProductProperties.getPropertiesForAmex(C32343x.m95476p0(getContext()));
        setBackGroundColorId(C10318g.f28625J0);
        setBackgroundImage(propertiesForAmex.getBackgroundImageId());
        String string = getContext().getString(C10328q.f28958hb);
        String string2 = getContext().getString(C10328q.common_text_points_plural);
        String q = C32303f.m95206q(bonusAmexUiModel.mo52696b().doubleValue());
        setAccountTitle(string + " ", string2, propertiesForAmex.getTitleColorId());
        setAccountBalance(q, "", propertiesForAmex.getAmountColorId());
        setBonusBalance(bonusAmexUiModel.mo52695a());
        getWhiteRectView().setVisibility(8);
    }

    public void setBonusCashback(BonusCashBackUiModel bonusCashBackUiModel) {
        this.analyticsCategory = "more_loyalty_programs";
        this.analyticsLabel = "cashback";
        this.type = 10;
        ProductProperties propertiesForCashback = ProductProperties.getPropertiesForCashback();
        setBackGroundColorId(propertiesForCashback.getBackgroundColorId());
        setBackgroundImage(propertiesForCashback.getBackgroundImageId());
        String string = getContext().getString(C10328q.product_item_view_title_cash_back);
        String o = C32303f.m95204o(bonusCashBackUiModel.mo52730d().doubleValue());
        String h = C32303f.m95197h(bonusCashBackUiModel.mo52736h());
        setAccountTitle(string, "", propertiesForCashback.getTitleColorId());
        setAccountBalance(o, h, propertiesForCashback.getAmountColorId());
        showCashBackContainer(bonusCashBackUiModel, h, propertiesForCashback.getOvalTextColorId(), propertiesForCashback.getOvalBorderColorId(), propertiesForCashback.getOvalFillColorId());
        getWhiteRectView().setVisibility(8);
    }

    public void setBonusPLus(BonusPlusUiModel bonusPlusUiModel) {
        this.analyticsCategory = "more_loyalty_programs";
        this.analyticsLabel = "plus";
        this.type = 16;
        ProductProperties propertiesForPlus = ProductProperties.getPropertiesForPlus(C32343x.m95476p0(getContext()));
        setBackGroundColorId(C10318g.f28625J0);
        setBackgroundImage(propertiesForPlus.getBackgroundImageId());
        String string = getContext().getString(C10328q.product_item_view_title_plus_with_sign);
        String q = C32303f.m95206q(bonusPlusUiModel.mo52760b().doubleValue());
        setAccountTitle(string + " ", "", propertiesForPlus.getTitleColorId());
        setAccountBalance(q, "", propertiesForPlus.getAmountColorId());
        setBonusBalance(bonusPlusUiModel.mo52759a());
        getWhiteRectView().setVisibility(8);
    }

    public void setBonusPrlo(BonusPrloUiModel bonusPrloUiModel) {
        int i;
        Context context;
        this.analyticsCategory = "more_loyalty_programs";
        this.analyticsLabel = "prllot";
        this.type = 17;
        ProductProperties propertiesForPrlo = ProductProperties.getPropertiesForPrlo();
        setBackGroundColorId(propertiesForPrlo.getBackgroundColorId());
        setBackgroundImage(propertiesForPrlo.getBackgroundImageId());
        String string = getContext().getString(C10328q.product_item_view_title_prlo);
        if (bonusPrloUiModel.mo52843a() < 2) {
            context = getContext();
            i = C10328q.bonus_ticket;
        } else {
            context = getContext();
            i = C10328q.bonus_tickets;
        }
        String string2 = context.getString(i);
        setAccountTitle(string + " ", "", propertiesForPrlo.getTitleColorId());
        setAccountBalance(String.valueOf(bonusPrloUiModel.mo52843a()), string2, propertiesForPrlo.getAmountColorId());
        getWhiteRectView().setVisibility(8);
    }

    public void setCreditCard(CreditCardAccount creditCardAccount, boolean z, int i) {
        String str;
        boolean z2;
        int i2;
        int i3;
        int i4;
        CreditCardAccount creditCardAccount2 = creditCardAccount;
        this.analyticsCategory = "products";
        this.analyticsLabel = "credit_cards";
        this.position = i;
        this.creditAcc = creditCardAccount2;
        ProductProperties properties = ProductProperties.getProperties(creditCardAccount);
        this.type = 2;
        if (!TextUtils.isEmpty(creditCardAccount.getAcctName())) {
            str = creditCardAccount.getAcctName();
        } else {
            str = C27950a.m86286c(creditCardAccount.getNameDictionaryKey(), false);
        }
        String h = C32303f.m95197h(creditCardAccount.getCcy());
        String o = C32303f.m95204o(creditCardAccount.getAvailableAmount().doubleValue());
        setBackGroundColorId(properties.getBackgroundColorId());
        setAccountTitle(str, properties.getTitleColorId());
        setAccountBalance(o, h, properties.getAmountColorId());
        setBackgroundImage(properties.getBackgroundImageId());
        setBackgroundImage(creditCardAccount.getAttachmentUrl());
        if (z && creditCardAccount.getAccountCreditCards().size() > 0) {
            showCardList(properties.hasCardsBorder());
            Iterator<C25838r> it = creditCardAccount.getAccountCreditCards().iterator();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (it.hasNext()) {
                C25838r next = it.next();
                if (C32307h.m95228e(next) == 0) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                i5 += i2;
                if (C32307h.m95228e(next) == 1) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                i6 += i3;
                if (C32307h.m95228e(next) == 2) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                i7 += i4;
            }
            setUpCard(0, (long) i5, false);
            setUpCard(1, (long) i6, false);
            setUpCard(2, (long) i7, false);
        }
        if (creditCardAccount.getBillInfo() != null) {
            showCreditCardContainer(creditCardAccount2, properties.getOvalTextColorId(), properties.getOvalBorderColorId(), properties.getOvalFillColorId());
            if (creditCardAccount.getBillInfo().getOverusedLimit().doubleValue() > Utils.DOUBLE_EPSILON) {
                C13310d dVar = new C13310d();
                dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
                Context context = getContext();
                int i8 = C10328q.f28947Wa;
                dVar.mo35648c2(context.getString(i8));
                dVar.mo35639Q1(getContext().getString(C10328q.f28950Za) + " " + C32303f.m95204o(creditCardAccount.getBillInfo().getOverusedLimit().doubleValue()));
                dVar.mo35642U1(getContext().getString(C10328q.f28928H0));
                dVar.mo35641T1(new C35768c(dVar));
                dVar.mo35646Z1(getContext().getString(C10328q.f28937S0));
                dVar.mo35645Y1(new C35805d(this, creditCardAccount2));
                setAccountBlocked(getContext().getString(i8), dVar);
            }
        }
        if (!this.inCardView) {
            getSwipeLeftView().removeAllViews();
            getSwipeRightView().removeAllViews();
            if (C32303f.m95212w("OUT_TRANSFER", creditCardAccount.getProductFunctions())) {
                if (creditCardAccount.isDefault()) {
                    addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_favorite_acc), C10320i.ic_account_swipe_favoriti, C10320i.ic_account_swipe_favoriti_blocked, false, 0);
                } else {
                    String string = getResources().getString(C10328q.product_item_view_swipe_favorite_acc);
                    int i9 = C10320i.ic_account_swipe_favoriti_blocked;
                    addSwipeMenu(false, string, i9, i9, false, 0, false);
                }
            }
            addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_edit), C10320i.ic_account_swipe_redaktireba, C10320i.ic_account_swipe_redaktireba_blocked, false, 1);
            addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_hide_acc), C10320i.ic_account_swipe_damalva, C10320i.ic_account_swipe_damalva_blocked, false, 2);
            if (C32303f.m95212w("REQUISITE", creditCardAccount.getProductFunctions())) {
                addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_share), C10320i.ic_account_swipe_rekvizitebis_gaziareba, C10320i.ic_account_swipe_rekvizitebis_gaziareba_blocked, false, 3);
            }
            if (C32303f.m95212w("OUT_TRANSFER", creditCardAccount.getProductFunctions())) {
                String string2 = getResources().getString(C10328q.f28946Va);
                int i12 = C10320i.ic_account_swipe_gadaricxva;
                int i13 = C10320i.ic_account_swipe_gadaricxva_blocked;
                if (creditCardAccount.getAvailableAmount().doubleValue() <= Utils.DOUBLE_EPSILON) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                addSwipeMenu(true, string2, i12, i13, z2, 4);
            }
            if (C32303f.m95212w("PAYMENT", creditCardAccount.getProductFunctions())) {
                addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_pay), C10320i.ic_account_swipe_gadaxda, C10320i.ic_account_swipe_gadaxda_blocked, false, 5);
            }
        }
    }

    public void setDeposit(Deposit deposit, int i) {
        int i2;
        int i3;
        this.analyticsCategory = "products";
        this.analyticsLabel = "deposits";
        this.position = i;
        ProductProperties properties = ProductProperties.getProperties(deposit);
        String depositTitle = deposit.getDepositTitle();
        this.type = 4;
        String h = C32303f.m95197h(deposit.getCcy());
        String balance = deposit.getBalance();
        setBackGroundColorId(properties.getBackgroundColorId());
        setAccountTitle(depositTitle, properties.getTitleColorId());
        setAccountBalance(balance, h, properties.getAmountColorId());
        setBackgroundImage(properties.getBackgroundImageId());
        setBackgroundImage(deposit.getAttachmentUrl());
        if (!deposit.hasSavingGoal()) {
            showDepositContainer(deposit, properties.getOvalTextColorId(), properties.getOvalBorderColorId(), properties.getOvalFillColorId());
        }
        if (!this.inCardView) {
            if (deposit.getDepositCards().size() > 0) {
                showCardList(properties.hasCardsBorder());
                Iterator<C25838r> it = deposit.getDepositCards().iterator();
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    int i7 = 1;
                    if (!it.hasNext()) {
                        break;
                    }
                    C25838r next = it.next();
                    if (C32307h.m95228e(next) == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    i4 += i2;
                    if (C32307h.m95228e(next) == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    i5 += i3;
                    if (C32307h.m95228e(next) != 2) {
                        i7 = 0;
                    }
                    i6 += i7;
                }
                setUpCard(0, (long) i4, false);
                setUpCard(1, (long) i5, false);
                setUpCard(2, (long) i6, false);
            }
            getSwipeLeftView().removeAllViews();
            getSwipeRightView().removeAllViews();
            addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_edit), C10320i.ic_account_swipe_redaktireba, C10320i.ic_account_swipe_redaktireba_blocked, false, 0);
            if (deposit.isBreakable()) {
                String string = getResources().getString(C10328q.product_item_view_swipe_deposit_violation);
                int i8 = C10320i.ic_account_swipe_dargveva;
                addSwipeMenu(false, string, i8, i8, false, 1);
            }
            if (C32303f.m95212w("OUT_TRANSFER", deposit.getProductFunctions())) {
                addSwipeMenu(true, getResources().getString(C10328q.f28946Va), C10320i.ic_account_swipe_gadaricxva, C10320i.ic_account_swipe_gadaricxva_blocked, false, 2);
            }
            if (C32303f.m95212w("IN_TRANSFER", deposit.getProductFunctions())) {
                addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_add_money), C10320i.ic_account_swipe_charicxva, C10320i.ic_account_swipe_charicxva_blocked, false, 3);
            }
            if (C32303f.m95212w("CAS", deposit.getProductFunctions())) {
                addSwipeMenu(true, getResources().getString(C10328q.product_item_view_swipe_moneybox), C10320i.ic_account_swipe_yulaba, C10320i.ic_account_swipe_yulaba_blocked, false, 4);
            }
        }
    }

    public void setDepositBond(DepositBond depositBond, int i) {
        this.analyticsCategory = "products";
        this.analyticsLabel = "deposits";
        this.position = i;
        ProductProperties properties = ProductProperties.getProperties(depositBond);
        String a = C27950a.m86284a(depositBond.getDictionaryKey());
        this.type = 4;
        String h = C32303f.m95197h(depositBond.getCurrencyCode());
        String o = C32303f.m95204o(depositBond.getMarketValue().doubleValue());
        setBackGroundColorId(properties.getBackgroundColorId());
        setAccountTitle(a, properties.getTitleColorId());
        setAccountBalance(o, h, properties.getAmountColorId());
        showDepositBondContainer(depositBond, properties.getOvalTextColorId(), properties.getOvalBorderColorId(), properties.getOvalFillColorId());
    }

    public void setInCardView(boolean z) {
        this.inCardView = z;
    }

    public void setLoan(Loan loan, LoanDetailsWrapper loanDetailsWrapper, int i, boolean z) {
        String str;
        int i2;
        int i3;
        int i4;
        String str2;
        this.analyticsCategory = "products";
        this.analyticsLabel = "loans";
        this.position = i;
        ProductProperties properties = ProductProperties.getProperties(loan);
        this.type = 3;
        if (!TextUtils.isEmpty(loan.getLoanName())) {
            str = loan.getLoanName();
        } else {
            str = C27950a.m86286c(loan.getProductDictionaryKey(), false);
        }
        String h = C32303f.m95197h(loan.getCcy());
        String o = C32303f.m95204o(loan.getAmount().doubleValue());
        setBackGroundColorId(properties.getBackgroundColorId());
        setAccountTitle(str, properties.getTitleColorId());
        setAccountBalance(o, h, properties.getAmountColorId());
        if (z) {
            BigDecimal subtract = loan.getDetails().getDetails().getInitialPrincipal().subtract(loan.getAmount());
            BigDecimal initialPrincipal = loan.getDetails().getDetails().getInitialPrincipal();
            ImageView imageView = (ImageView) findViewById(C10322k.installment_right_image);
            MerchantDetails merchantDetails = loanDetailsWrapper.mmsDetails;
            if (!(merchantDetails == null || (str2 = merchantDetails.merchantLogoURL) == null)) {
                ((C2394j) ((C2394j) C2379b.m9211u(this).mo7757y(C32289b0.m95091c(str2)).mo7242o0(true)).mo7228g(C7423a.f21687b)).mo7718L0(imageView);
                imageView.setVisibility(0);
            }
            if (loanDetailsWrapper.getInvoice() == null) {
                showInstallmentProgress(subtract, initialPrincipal, loan.getCcy(), properties);
            }
        } else {
            setBackgroundImage(properties.getBackgroundImageId());
            setBackgroundImage(loan.getAttachmentUrl());
            findViewById(C10322k.installment_right_image).setVisibility(8);
        }
        if (loanDetailsWrapper.getInvoice() != null) {
            showLoanContainer(loanDetailsWrapper.getInvoice(), h, properties.getOvalTextColorId(), properties.getOvalBorderColorId(), properties.getOvalFillColorId());
        }
        if (!this.inCardView) {
            if (loan.isMortgage() && loan.getLoanCards() != null && loan.getLoanCards().size() > 0) {
                showCardList(properties.hasCardsBorder());
                Iterator<C25838r> it = loan.getLoanCards().iterator();
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (it.hasNext()) {
                    C25838r next = it.next();
                    if (C32307h.m95228e(next) == 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    i5 += i2;
                    if (C32307h.m95228e(next) == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    i6 += i3;
                    if (C32307h.m95228e(next) == 2) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    i7 += i4;
                }
                setUpCard(0, (long) i5, false);
                setUpCard(1, (long) i6, false);
                setUpCard(2, (long) i7, false);
            }
            getSwipeLeftView().removeAllViews();
            addSwipeMenu(false, getResources().getString(C10328q.product_item_view_swipe_edit), C10320i.ic_account_swipe_redaktireba, C10320i.ic_account_swipe_redaktireba_blocked, false, 0);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.itemToClick.setOnClickListener(onClickListener);
    }

    public void setPension(PensionResult pensionResult) {
        this.analyticsCategory = "products";
        this.analyticsLabel = "pension";
        this.type = 18;
        ProductProperties propertiesForPension = ProductProperties.getPropertiesForPension();
        setBackGroundColorId(propertiesForPension.getBackgroundColorId());
        setBackgroundImage(propertiesForPension.getBackgroundImageId());
        String a = C27950a.m86284a("text.georgian.pension.funds.product.title");
        String o = C32303f.m95204o(pensionResult.totalSaving.doubleValue());
        String h = C32303f.m95197h("GEL");
        setAccountTitle(a + " ", "", propertiesForPension.getTitleColorId(), true, true);
        setAccountBalance(o, h, propertiesForPension.getAmountColorId());
        getWhiteRectView().setVisibility(8);
    }

    public void setRoundCornerType(RoundCornerType roundCornerType2) {
        this.roundCornerType = roundCornerType2;
    }

    public void setScoolCard(BonusScoolUiModel bonusScoolUiModel, int i) {
        this.analyticsCategory = "more_loyalty_programs";
        this.analyticsLabel = "scool";
        this.position = i;
        this.type = 15;
        ProductProperties properties = ProductProperties.getProperties(bonusScoolUiModel, Boolean.valueOf(C32343x.m95476p0(getContext())));
        setBackGroundColorId(properties.getBackgroundColorId());
        setBackgroundImage(properties.getBackgroundImageId());
        String a = bonusScoolUiModel.mo52777a();
        String valueOf = String.valueOf(bonusScoolUiModel.mo52779d() + " " + getContext().getString(C10328q.product_item_view_title_scool_point));
        setAccountTitle("", a, properties.getTitleColorId());
        setAccountBalance(valueOf, "", properties.getAmountColorId());
        getSwipeRightView().removeAllViews();
        getWhiteRectView().setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public void setUpView() {
        getSwipeView().addSwipeListener(new C35706a());
        getSwipeView().setShowMode(OurSwipeLayout.ShowMode.LayDown);
        if (this.inCardView) {
            getSwipeView().setSwipeEnabled(false);
        }
        if (!this.inCardView) {
            getSwipeView().addDrag(OurSwipeLayout.DragEdge.Left, (View) getSwipeLeftView());
            getSwipeView().addDrag(OurSwipeLayout.DragEdge.Right, (View) getSwipeRightView());
        }
        this.swipeMenuHelper = new SwipeMenuHelper(C10318g.f28616A, C10318g.f28626L0);
        this.accountItemContainer = (FrameLayout) findViewById(C10322k.account_item_content_container);
        this.accountBackgroundImage = (ImageView) findViewById(C10322k.account_background_image_view);
        this.accountDataPanel = findViewById(C10322k.account_data_panel);
        this.accountTitle = (BogTextView) findViewById(C10322k.account_title);
        this.accountTitleBold = (BogTextView) findViewById(C10322k.account_title_bold);
        this.accountBalance = (BogTextView) findViewById(C10322k.account_balance);
        this.bonusBalanceGel = (BogTextView) findViewById(C10322k.bonus_balance_gel);
        this.ccyListcontainer = findViewById(C10322k.account_ccy_list_container);
        this.cardListContainer = findViewById(C10322k.card_list_container);
        this.itemToClick = findViewById(C10322k.item_to_click);
        this.bondsAmountTV = (BogTextView) findViewById(C10322k.bonds_count_tv);
        this.backgroundLayer = (FrameLayout) findViewById(C10322k.account_item_background_layer);
        this.blockRedContainer = (ProductBlockView) findViewById(C10322k.account_blocked_button);
        this.secondRedContainer = (ProductBlockView) findViewById(C10322k.account_second_blocked_button);
        this.blockLayout = (LinearLayout) findViewById(C10322k.account_item_block_right);
        this.ovalContainer = (ProductOvalContainer) findViewById(C10322k.oval_container);
        this.whiteRect = findViewById(C10322k.account_item_top_white_rect);
        this.shadowLayer = findViewById(C10322k.account_item_shadow_layer);
        this.savingGoalContainer = (RelativeLayout) findViewById(C10322k.account_expanded_layer);
        this.savingProgress = (BudgetProgressBar) findViewById(C10322k.savingProgress);
        this.amountCollected = (BogTextView) findViewById(C10322k.amountCollected);
        this.amountTarget = (BogTextView) findViewById(C10322k.amountTarget);
        this.amountTargetTitle = (BogTextView) findViewById(C10322k.amountTargetTitle);
        this.digitalCardIndicator = (BogTextView) findViewById(C10322k.digital_card_indicator);
        this.blockBackground = findViewById(C10322k.block_background);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius((float) C32355x0.m95516g(C10319h.product_card_corner_radius));
        gradientDrawable.setColor(this.blockColor);
        this.blockBackground.setBackground(gradientDrawable);
        this.blockBackground.setVisibility(8);
        SelectableCCYView[] selectableCCYViewArr = new SelectableCCYView[6];
        this.ccyContainerList = selectableCCYViewArr;
        selectableCCYViewArr[0] = (SelectableCCYView) findViewById(C10322k.ccy_first);
        this.ccyContainerList[1] = (SelectableCCYView) findViewById(C10322k.ccy_second);
        this.ccyContainerList[2] = (SelectableCCYView) findViewById(C10322k.ccy_third);
        this.ccyContainerList[3] = (SelectableCCYView) findViewById(C10322k.ccy_fourth);
        this.ccyContainerList[4] = (SelectableCCYView) findViewById(C10322k.ccy_fifth);
        this.ccyContainerList[5] = (SelectableCCYView) findViewById(C10322k.ccy_sixth);
        ImageView[] imageViewArr = new ImageView[4];
        this.cardImageViewList = imageViewArr;
        imageViewArr[0] = (ImageView) findViewById(C10322k.card_list_first_icon);
        this.cardImageViewList[1] = (ImageView) findViewById(C10322k.card_list_second_icon);
        this.cardImageViewList[2] = (ImageView) findViewById(C10322k.card_list_third_icon);
        Button[] buttonArr = new Button[4];
        this.cardCounterViewList = buttonArr;
        buttonArr[0] = (Button) findViewById(C10322k.card_list_first_counter);
        this.cardCounterViewList[1] = (Button) findViewById(C10322k.card_list_second_counter);
        this.cardCounterViewList[2] = (Button) findViewById(C10322k.card_list_third_counter);
        View[] viewArr = new View[4];
        this.cardIndicatorList = viewArr;
        viewArr[0] = findViewById(C10322k.card_list_first_indicator);
        this.cardIndicatorList[1] = findViewById(C10322k.card_list_second_indicator);
        this.cardIndicatorList[2] = findViewById(C10322k.card_list_third_indicator);
        View[] viewArr2 = new View[4];
        this.cardImageListContainer = viewArr2;
        viewArr2[0] = findViewById(C10322k.card_list_first);
        this.cardImageListContainer[1] = findViewById(C10322k.card_list_second);
        this.cardImageListContainer[2] = findViewById(C10322k.card_list_third);
        this.cardImageListContainer[3] = findViewById(C10322k.card_list_bonds);
        int[] iArr = new int[4];
        this.singleCardIconIds = iArr;
        iArr[0] = C10320i.card_icon_mc_single;
        iArr[1] = C10320i.card_icon_visa_single;
        iArr[2] = C10320i.card_icon_amex_single;
        int[] iArr2 = new int[4];
        this.singleBorderCardIconIds = iArr2;
        iArr2[0] = C10320i.card_icon_mc_border_single;
        iArr2[1] = C10320i.card_icon_visa_border_single;
        iArr2[2] = C10320i.card_icon_amex_border_single;
        int[] iArr3 = new int[4];
        this.multiCardIconIds = iArr3;
        iArr3[0] = C10320i.card_icon_mc_multi;
        iArr3[1] = C10320i.card_icon_visa_multi;
        iArr3[2] = C10320i.card_icon_amex_multi;
        int[] iArr4 = new int[4];
        this.multiBorderCardIconIds = iArr4;
        iArr4[0] = C10320i.card_icon_mc_border_multi;
        iArr4[1] = C10320i.card_icon_visa_border_multi;
        iArr4[2] = C10320i.card_icon_amex_border_multi;
    }

    private void setUpCard(int i, long j, int i2, boolean z) {
        char c;
        int i3;
        if (i != 0) {
            c = 1;
            if (i != 1) {
                c = 2;
                if (i != 2) {
                    c = i != 3 ? (char) 65535 : 3;
                }
            }
        } else {
            c = 0;
        }
        if (c != 65535 && j >= 1) {
            this.cardImageListContainer[c].setVisibility(0);
            if (c != 3) {
                String str = "9+";
                if (this.hasCardsBorder) {
                    if (i3 == 0) {
                        this.cardImageViewList[c].setImageResource(this.singleBorderCardIconIds[c]);
                        this.cardCounterViewList[c].setVisibility(8);
                    } else {
                        this.cardImageViewList[c].setImageResource(this.multiBorderCardIconIds[c]);
                        this.cardCounterViewList[c].setVisibility(0);
                        Button button = this.cardCounterViewList[c];
                        if (j <= 9) {
                            str = j + "";
                        }
                        button.setText(str);
                    }
                } else if (i3 == 0) {
                    this.cardImageViewList[c].setImageResource(this.singleCardIconIds[c]);
                    this.cardCounterViewList[c].setVisibility(8);
                } else {
                    this.cardImageViewList[c].setImageResource(this.multiCardIconIds[c]);
                    this.cardCounterViewList[c].setVisibility(0);
                    Button button2 = this.cardCounterViewList[c];
                    if (j <= 9) {
                        str = j + "";
                    }
                    button2.setText(str);
                }
                if (z) {
                    this.cardIndicatorList[c].setVisibility(0);
                    this.cardCounterViewList[c].setVisibility(8);
                    return;
                }
                this.cardIndicatorList[c].setVisibility(8);
                return;
            }
            this.bondsAmountTV.setText(C32303f.m95199j(j));
            this.bondsAmountTV.setTextColor(C0767a.m2893c(getContext(), i2));
            this.cardImageListContainer[c].setBackground(C32290b1.m95122l(getContext(), this.cardImageListContainer[c].getBackground(), i2));
        }
    }

    public AccountItemView(Context context, int i, FragmentManager fragmentManager2) {
        this(context, (AttributeSet) null, i, fragmentManager2, false);
    }

    private void setAccountTitle(String str, String str2, int i) {
        setAccountTitle(str, str2, i, true);
    }

    public AccountItemView(Context context, AttributeSet attributeSet, int i, FragmentManager fragmentManager2, boolean z) {
        super(context, attributeSet);
        this.roundCornerType = RoundCornerType.BOTH;
        this.position = -1;
        this.onSwipeItemClick = new C35708c();
        this.onOvalContainerClickListener = new C35709d();
        this.inCardView = z;
        View.inflate(getContext(), C10324m.account_item_swipable_view, this);
        if (!isInEditMode()) {
            if (i != -1) {
                this.blockColor = C32355x0.m95514e(i, getContext());
            } else {
                this.blockColor = -1;
            }
            this.fragmentManager = fragmentManager2;
            setUpView();
        }
    }

    private void setAccountTitle(String str, String str2, int i, boolean z) {
        setAccountTitle(str, str2, i, z, false);
    }

    private void setAccountTitle(String str, String str2, int i, boolean z, boolean z2) {
        this.accountTitleBold.setText(str);
        this.accountTitleBold.setSingleLine(z);
        this.accountTitleBold.setTextColor(C32355x0.m95514e(i, getContext()));
        this.accountTitleBold.setTextSize(1, z2 ? 12.0f : 15.0f);
        this.accountTitle.setText(str2);
        this.accountTitle.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    private void setBackgroundImage(String str) {
        setBackgroundImage(str, true);
    }

    private void setBackgroundImage(String str, boolean z) {
        if (str != null && !str.isEmpty()) {
            int g = C32355x0.m95516g(C10319h.default_corner_radius_redesign);
            RoundCornerType roundCornerType2 = this.roundCornerType;
            RoundCornerType roundCornerType3 = RoundCornerType.BOTH;
            int i = (roundCornerType2 == roundCornerType3 || roundCornerType2 == RoundCornerType.TOP) ? g : 0;
            if (!(roundCornerType2 == roundCornerType3 || roundCornerType2 == RoundCornerType.BOTTOM)) {
                g = 0;
            }
            float f = (float) i;
            float f2 = (float) g;
            C2256h hVar = (C2256h) new C2256h().mo7255x0(new C2520l(), new C2556z(f, f, f2, f2));
            C2396k t = C2379b.m9210t(getContext());
            if (z) {
                str = C32289b0.m95093e(str);
            }
            t.mo7757y(str).mo7215a(hVar).mo7718L0(this.accountBackgroundImage);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius((float) C32355x0.m95516g(C10319h.product_card_corner_radius));
            gradientDrawable.setColor(C32355x0.m95514e(blackWithOpacity, getContext()));
            findViewById(C10322k.custom_picture_background).setBackground(gradientDrawable);
        }
    }

    public void addSwipeMenu(boolean z, String str, int i, int i2, boolean z2, int i3) {
        addSwipeMenu(z, str, i, i2, z2, i3, true);
    }
}
