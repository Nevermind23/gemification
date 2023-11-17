package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32319m;
import g91.C32355x0;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.model.Bond;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.model.LoanInvoiceWrapper;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.ProductOvalContainer */
public class ProductOvalContainer extends LinearLayout {
    private BogTextView amount;
    private int borderWidth;
    private View container;
    private GradientDrawable containerBackGround;
    private BogTextView firsLine;
    private BogTextView secondLine;

    public ProductOvalContainer(Context context) {
        this(context, (AttributeSet) null);
    }

    private void initWithBase(int i, int i2, int i3) {
        this.containerBackGround.setStroke(this.borderWidth, C32355x0.m95514e(i2, getContext()));
        this.containerBackGround.setColor(C32355x0.m95514e(i3, getContext()));
        this.firsLine.setTextColor(C32355x0.m95514e(i, getContext()));
        this.secondLine.setTextColor(C32355x0.m95514e(i, getContext()));
        this.amount.setTextColor(C32355x0.m95514e(i, getContext()));
    }

    private void setUpViews() {
        View.inflate(getContext(), C10324m.product_oval_container, this);
        if (!isInEditMode()) {
            this.container = findViewById(C10322k.oval_container);
            this.firsLine = (BogTextView) findViewById(C10322k.first_line);
            this.secondLine = (BogTextView) findViewById(C10322k.second_line);
            this.amount = (BogTextView) findViewById(C10322k.f28817a1);
            GradientDrawable gradientDrawable = new GradientDrawable();
            this.containerBackGround = gradientDrawable;
            gradientDrawable.setShape(0);
            this.containerBackGround.setCornerRadius(getContext().getResources().getDimension(C10319h.account_item_credit_view_radius));
            this.container.setBackground(this.containerBackGround);
            this.borderWidth = C32355x0.m95516g(C10319h.loan_stroke_width);
        }
    }

    public void setBond(Bond bond, String str, int i, int i2, int i3) {
        initWithBase(i, i2, i3);
        if (bond != null) {
            this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_nominal));
            this.secondLine.setText(getContext().getString(C10328q.product_item_view_text_price));
            BogTextView bogTextView = this.amount;
            bogTextView.setText(C32303f.m95204o(bond.getMarketPrice().doubleValue()) + " " + str);
        }
    }

    public void setCas(BonusCasServiceUiModel bonusCasServiceUiModel, String str, int i, int i2, int i3) {
        this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_accrued_in_current_month));
        this.secondLine.setVisibility(8);
        if (bonusCasServiceUiModel.mo52716f() != null) {
            BogTextView bogTextView = this.amount;
            bogTextView.setText(C32303f.m95204o(bonusCasServiceUiModel.mo52716f().doubleValue()) + " " + str);
        }
        initWithBase(i, i2, i3);
    }

    public void setCashBack(BonusCashBackUiModel bonusCashBackUiModel, String str, int i, int i2, int i3) {
        this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_accrued_in_current_month));
        this.secondLine.setVisibility(8);
        BogTextView bogTextView = this.amount;
        bogTextView.setText(C32303f.m95204o(bonusCashBackUiModel.mo52734f().doubleValue()) + " " + str);
        initWithBase(i, i2, i3);
    }

    public void setCreditAccount(CreditCardAccount creditCardAccount, int i, int i2, int i3) {
        this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_next_payment));
        if (creditCardAccount.getBillInfo() != null) {
            this.secondLine.setText(C32319m.m95314u(creditCardAccount.getBillInfo().getDueDate().longValue()));
            BogTextView bogTextView = this.amount;
            bogTextView.setText(C32303f.m95204o(creditCardAccount.getBillInfo().getMinimumPayment().doubleValue()) + " " + C32303f.m95197h(creditCardAccount.getBillInfo().getCcy()));
            initWithBase(i, i2, i3);
        }
    }

    public void setDeposit(Deposit deposit, int i, int i2, int i3) {
        String str;
        StringBuilder sb;
        if (deposit.isMaxima()) {
            sb = new StringBuilder();
            sb.append(deposit.getIntAccrued());
            str = deposit.getMaximaDetails().getCcy();
        } else {
            sb = new StringBuilder();
            sb.append(deposit.getIntAccrued());
            str = deposit.getCcy();
        }
        sb.append(C32303f.m95198i(str, true));
        String sb2 = sb.toString();
        this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_interest_accrued));
        this.secondLine.setVisibility(8);
        BogTextView bogTextView = this.amount;
        bogTextView.setText(sb2 + " ");
        initWithBase(i, i2, i3);
    }

    public void setDepositBond(DepositBond depositBond, int i, int i2, int i3) {
        this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_interest_accrued));
        this.secondLine.setVisibility(8);
        this.amount.setText(depositBond.getInterestAccrued() + C32303f.m95198i(depositBond.getCurrencyCode(), true));
        initWithBase(i, i2, i3);
    }

    public void setLoan(LoanInvoiceWrapper loanInvoiceWrapper, String str, int i, int i2, int i3) {
        initWithBase(i, i2, i3);
        if (loanInvoiceWrapper != null) {
            String A = C32319m.m95281A(loanInvoiceWrapper.getPaymentDate());
            this.firsLine.setText(getContext().getString(C10328q.product_item_view_text_loan_payment));
            if (!A.isEmpty()) {
                this.secondLine.setText(C32319m.m95281A(loanInvoiceWrapper.getPaymentDate()));
            } else {
                this.secondLine.setVisibility(8);
            }
            BogTextView bogTextView = this.amount;
            bogTextView.setText(C32303f.m95204o(loanInvoiceWrapper.getAmount().doubleValue()) + " " + str);
            if (loanInvoiceWrapper.getAmount().doubleValue() > Utils.DOUBLE_EPSILON) {
                this.containerBackGround.setColor(C32355x0.m95514e(C10318g.bog_dialog_red_color, getContext()));
                this.containerBackGround.setStroke(this.borderWidth, 0);
                this.firsLine.setTextColor(-1);
                this.secondLine.setTextColor(-1);
                this.amount.setTextColor(-1);
                return;
            }
            return;
        }
        this.container.setVisibility(8);
    }

    public void setTexts(String str, String str2, String str3) {
        this.firsLine.setText(str);
        if (TextUtils.isEmpty(str2)) {
            this.secondLine.setVisibility(8);
        } else {
            this.secondLine.setText(str2);
            this.secondLine.setVisibility(0);
        }
        this.amount.setText(str3);
        int i = C10318g.bog_black_text_color;
        initWithBase(i, i, C10318g.f28616A);
    }

    public ProductOvalContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpViews();
    }
}
