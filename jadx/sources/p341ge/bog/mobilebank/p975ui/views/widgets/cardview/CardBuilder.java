package p341ge.bog.mobilebank.p975ui.views.widgets.cardview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.C0430g1;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;
import g91.C32303f;
import g91.C32307h;
import hd0.C24978b;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jg1.C41438c;
import l50.C25832l;
import l50.C25836p;
import l50.C25838r;
import p341ge.bog.mobilebank.cleanarch.domain.products.model.CardBlockStatus;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusAmexUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCasServiceUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusCashBackUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusScoolUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.plo.BonusPrloUiModel;
import p341ge.bog.mobilebank.eventbus.events.SwipeItemClickEvent;
import p341ge.bog.mobilebank.model.BondsWrapper;
import p341ge.bog.mobilebank.model.DepositBond;
import p341ge.bog.mobilebank.model.DepositBondsListWrapper;
import p341ge.bog.mobilebank.model.PensionResult;
import p341ge.bog.mobilebank.model.credit.CreditCardAccount;
import p341ge.bog.mobilebank.model.credit.CreditCardsWrapper;
import p341ge.bog.mobilebank.model.deposits.Deposit;
import p341ge.bog.mobilebank.model.deposits.DepositsWrapper;
import p341ge.bog.mobilebank.model.loans.AcctRefEntity;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.p975ui.views.widgets.AccountItemView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.ProductBlockView;
import p341ge.bog.mobilebank.p975ui.views.widgets.SwipeMenuButton;
import p366bk.C10318g;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder */
public class CardBuilder {
    /* access modifiers changed from: private */
    public List<C25838r> accountCards;
    /* access modifiers changed from: private */
    public C25836p accounts;
    private Activity activity;
    /* access modifiers changed from: private */
    public BondsWrapper bondsWrapper;
    /* access modifiers changed from: private */
    public BonusAmexUiModel bonusAmex;
    private BonusCasServiceUiModel bonusCasService;
    /* access modifiers changed from: private */
    public BonusCashBackUiModel bonusCashback;
    /* access modifiers changed from: private */
    public BonusPlusUiModel bonusPlus;
    /* access modifiers changed from: private */
    public BonusPrloUiModel bonusPrlo;
    /* access modifiers changed from: private */
    public BonusScoolUiModel bonusScool;
    /* access modifiers changed from: private */
    public CreditCardsWrapper credits;
    /* access modifiers changed from: private */
    public DepositBondsListWrapper depositBondsListWrapper;
    /* access modifiers changed from: private */
    public DepositsWrapper deposits;
    private int depositsSize = 0;
    private boolean isDepositBond = false;
    /* access modifiers changed from: private */
    public LoansWrapper loans;
    /* access modifiers changed from: private */
    public PensionResult pension;
    /* access modifiers changed from: private */
    public long productKey;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$a */
    final class C35769a {
        C35769a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87604a(int i, C41438c cVar) {
            boolean z;
            boolean z2;
            int i2 = i;
            C25832l lVar = (C25832l) CardBuilder.this.accounts.mo64561a().mo64555a().get(i2);
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setAccount(lVar, i2, true);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            linkedHashMap.put(5, new C35777i(cardBuilder, cardBuilder.getContext().getString(C10328q.f28929Ha), C10320i.ic_account_swipe_gadaricxva, C10320i.ic_account_swipe_gadaricxva_blocked, false, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            linkedHashMap.put(2, new C35777i(cardBuilder2, cardBuilder2.getContext().getString(C10328q.product_item_button_text_share), C10320i.ic_account_swipe_rekvizitebis_gaziareba, C10320i.ic_account_swipe_rekvizitebis_gaziareba_blocked, false, false));
            CardBuilder cardBuilder3 = CardBuilder.this;
            String string = cardBuilder3.getContext().getString(C10328q.f28922Da);
            int i3 = C10320i.ic_requisite;
            C35777i iVar = r9;
            C35777i iVar2 = new C35777i(cardBuilder3, string, i3, i3, false, false);
            linkedHashMap.put(30, iVar);
            CardBuilder cardBuilder4 = CardBuilder.this;
            String string2 = cardBuilder4.getContext().getString(C10328q.product_item_button_text_statement);
            int i4 = C10320i.ic_deposit_statement;
            C35777i iVar3 = r9;
            C35777i iVar4 = new C35777i(cardBuilder4, string2, i4, i4, false, false);
            linkedHashMap.put(6, iVar3);
            CardBuilder cardBuilder5 = CardBuilder.this;
            String string3 = cardBuilder5.getContext().getString(C10328q.product_item_button_text_top_up);
            int i5 = C10320i.ic_account_swipe_charicxva;
            View view = inflate;
            C35777i iVar5 = r9;
            C35777i iVar6 = new C35777i(cardBuilder5, string3, i5, i5, false, false);
            linkedHashMap.put(8, iVar5);
            if (C32303f.m95212w("OUT_TRANSFER", lVar.mo64540q())) {
                ((C35777i) linkedHashMap.get(5)).f86423d = true;
                C35777i iVar7 = (C35777i) linkedHashMap.get(5);
                if (lVar.mo64532i() <= Utils.DOUBLE_EPSILON) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                iVar7.f86424e = z2;
            }
            if (C32303f.m95212w("REQUISITE", lVar.mo64540q())) {
                z = true;
                ((C35777i) linkedHashMap.get(2)).f86423d = true;
            } else {
                z = true;
            }
            if (C32303f.m95212w("REQUISITE_PRINT", lVar.mo64540q())) {
                ((C35777i) linkedHashMap.get(30)).f86423d = z;
            }
            if (C32303f.m95212w("STATEMENT", lVar.mo64540q())) {
                ((C35777i) linkedHashMap.get(6)).f86423d = z;
            }
            if (C32303f.m95212w("ADD_AMOUNT", lVar.mo64540q())) {
                ((C35777i) linkedHashMap.get(8)).f86423d = z;
            }
            CardBuilder.this.setUpButtons(view, linkedHashMap, i, 1, cVar);
            return view;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$b */
    final class C35770b {
        C35770b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87605a(int i, C41438c cVar, ArrayList arrayList) {
            int i2;
            Context context;
            int i3;
            int i4;
            LayoutInflater s = CardBuilder.this.getLayoutInflater();
            View inflate = s.inflate(C10324m.layout_card_view, (ViewGroup) null);
            View inflate2 = s.inflate(C10324m.card_details_card_top, (ViewGroup) null);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(inflate2, new ViewGroup.LayoutParams(-1, -1));
            C25838r rVar = (C25838r) CardBuilder.this.accountCards.get(i);
            ((ImageView) inflate2.findViewById(C10322k.card_view_card_iv)).setImageResource(C32307h.m95225b(rVar));
            BogTextView bogTextView = (BogTextView) inflate.findViewById(C10322k.card_view_card_valid_tv);
            View findViewById = inflate.findViewById(C10322k.card_indicator);
            BogTextView bogTextView2 = (BogTextView) inflate.findViewById(C10322k.digital_card_indicator_label);
            ((BogTextView) inflate.findViewById(C10322k.card_view_card_title)).setText(rVar.mo64587l());
            ((BogTextView) inflate.findViewById(C10322k.card_view_card_holder_name)).setText(rVar.mo64581g());
            ((BogTextView) inflate.findViewById(C10322k.card_view_card_number)).setText(C32307h.m95232i(rVar.mo64593r()));
            bogTextView.setText(rVar.mo64597u());
            if (rVar.mo64598v().mo63390c()) {
                context = CardBuilder.this.getContext();
                i2 = C10318g.card_renewal_color;
            } else {
                context = CardBuilder.this.getContext();
                i2 = C10318g.card_view_title_color;
            }
            bogTextView.setTextColor(C0767a.m2893c(context, i2));
            if (rVar.mo64598v().mo63390c()) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            findViewById.setVisibility(i3);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (rVar.mo64575b()) {
                CardBuilder cardBuilder = CardBuilder.this;
                String string = cardBuilder.getContext().getString(C10328q.f28936Q1);
                int i5 = C10320i.ic_card_details;
                linkedHashMap.put(27, new C35777i(cardBuilder, string, i5, i5, true, false));
            }
            if (rVar.mo64598v().mo63390c()) {
                CardBuilder cardBuilder2 = CardBuilder.this;
                String string2 = cardBuilder2.getContext().getString(C10328q.product_item_button_text_order_card);
                int i6 = C10320i.ic_account_swipe_card_update;
                linkedHashMap.put(24, new C35777i(cardBuilder2, string2, i6, i6, true, false));
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    CardBlockStatus cardBlockStatus = (CardBlockStatus) it.next();
                    if (rVar.mo64582h() == cardBlockStatus.mo52082a()) {
                        if (cardBlockStatus.mo52083b() == C24978b.YES) {
                            CardBuilder cardBuilder3 = CardBuilder.this;
                            String string3 = cardBuilder3.getContext().getString(C10328q.product_item_button_text_unblock);
                            int i7 = C10320i.ic_account_swipe_baratis_unblock;
                            C35777i iVar = r10;
                            C35777i iVar2 = new C35777i(cardBuilder3, string3, i7, i7, true, false);
                            linkedHashMap.put(25, iVar);
                            CardBuilder cardBuilder4 = CardBuilder.this;
                            cardBuilder4.setPanelLocked(inflate, cardBuilder4.getContext().getString(C10328q.product_item_text_card_blocked));
                        } else {
                            CardBuilder cardBuilder5 = CardBuilder.this;
                            linkedHashMap.put(12, new C35777i(cardBuilder5, cardBuilder5.getContext().getString(C10328q.product_item_button_text_block), C10320i.ic_account_swipe_baratis_dablokva, C10320i.ic_account_swipe_baratis_dablokva_blocked, true, false));
                        }
                    }
                }
            }
            if (rVar.mo64601y()) {
                i4 = 0;
            } else {
                i4 = 8;
            }
            bogTextView2.setVisibility(i4);
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, i, 6, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$c */
    final class C35771c {
        C35771c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87606a(int i) {
            AccountItemView accountItemView = new AccountItemView(CardBuilder.this.getContext(), true);
            accountItemView.getWhiteRectView().setVisibility(8);
            accountItemView.getShadowLayer().setVisibility(8);
            accountItemView.changeMargins();
            accountItemView.setBond(CardBuilder.this.bondsWrapper.getBonds().get(i), i);
            return accountItemView;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$d */
    final class C35772d {
        C35772d() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87607a(C41438c cVar) {
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setBonusAmex(CardBuilder.this.bonusAmex);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            linkedHashMap.put(31, new C35777i(cardBuilder, cardBuilder.getContext().getString(C10328q.convert_mr_to_plus), C10320i.exchange_image, C10320i.exchange_points_blocked, true, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            String string = cardBuilder2.getContext().getString(C10328q.product_item_button_text_statement);
            int i = C10320i.ic_deposit_statement;
            linkedHashMap.put(6, new C35777i(cardBuilder2, string, i, i, true, false));
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, 0, 8, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$e */
    final class C35773e {
        C35773e() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87608a(C41438c cVar) {
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setBonusCashback(CardBuilder.this.bonusCashback);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            String string = cardBuilder.getContext().getString(C10328q.product_item_button_text_statement);
            int i = C10320i.ic_deposit_statement;
            linkedHashMap.put(6, new C35777i(cardBuilder, string, i, i, true, false));
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, 0, 10, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$f */
    final class C35774f {
        C35774f() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87609a(C41438c cVar) {
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setBonusPLus(CardBuilder.this.bonusPlus);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            linkedHashMap.put(18, new C35777i(cardBuilder, cardBuilder.getContext().getString(C10328q.product_item_button_text_plus_exchange_points), C10320i.exchange_image, C10320i.exchange_points_blocked, true, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            linkedHashMap.put(19, new C35777i(cardBuilder2, cardBuilder2.getContext().getString(C10328q.f28929Ha), C10320i.ic_account_swipe_gadaricxva, C10320i.ic_account_swipe_gadaricxva_blocked, true, false));
            CardBuilder cardBuilder3 = CardBuilder.this;
            linkedHashMap.put(20, new C35777i(cardBuilder3, cardBuilder3.getContext().getString(C10328q.product_item_button_text_invite), C10320i.ic_mocveva_bog, C10320i.ic_mocveva_bog_blocked, true, false));
            CardBuilder cardBuilder4 = CardBuilder.this;
            String string = cardBuilder4.getContext().getString(C10328q.product_item_button_text_statement);
            int i = C10320i.ic_deposit_statement;
            linkedHashMap.put(6, new C35777i(cardBuilder4, string, i, i, true, false));
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, 0, 16, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$g */
    final class C35775g {
        C35775g() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87610a(C41438c cVar) {
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setBonusPrlo(CardBuilder.this.bonusPrlo);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            CardBuilder.this.setUpButtons(inflate, new LinkedHashMap(), 0, 17, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$h */
    final class C35776h {
        C35776h() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87611a(int i, C41438c cVar) {
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setScoolCard(CardBuilder.this.bonusScool, i);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            String string = cardBuilder.getContext().getString(C10328q.product_item_button_text_statement);
            int i2 = C10320i.ic_deposit_statement;
            linkedHashMap.put(6, new C35777i(cardBuilder, string, i2, i2, true, false));
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, i, 15, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$i */
    private class C35777i {

        /* renamed from: a */
        public String f86420a;

        /* renamed from: b */
        public int f86421b;

        /* renamed from: c */
        public int f86422c;

        /* renamed from: d */
        public boolean f86423d;

        /* renamed from: e */
        public boolean f86424e;

        /* renamed from: f */
        public boolean f86425f;

        C35777i(CardBuilder cardBuilder, String str, int i, int i2, boolean z, boolean z2) {
            this(str, i, i2, z, z2, false);
        }

        C35777i(String str, int i, int i2, boolean z, boolean z2, boolean z3) {
            this.f86420a = str;
            this.f86421b = i;
            this.f86425f = z3;
            this.f86422c = i2;
            this.f86423d = z;
            this.f86424e = z2;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$j */
    final class C35778j {
        C35778j() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87612a(int i, C41438c cVar) {
            boolean z;
            int i2 = i;
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            CreditCardAccount creditCardAccount = CardBuilder.this.credits.getCardsContainer().getAccounts().get(i2);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setCreditCard(creditCardAccount, false, i2);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            linkedHashMap.put(15, new C35777i(cardBuilder, cardBuilder.getContext().getString(C10328q.product_item_button_text_credit_card_fill), C10320i.ic_account_swipe_charicxva, C10320i.ic_account_swipe_charicxva_blocked, false, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            linkedHashMap.put(2, new C35777i(cardBuilder2, cardBuilder2.getContext().getString(C10328q.product_item_button_text_share), C10320i.ic_account_swipe_rekvizitebis_gaziareba, C10320i.ic_account_swipe_rekvizitebis_gaziareba_blocked, false, false));
            CardBuilder cardBuilder3 = CardBuilder.this;
            String string = cardBuilder3.getContext().getString(C10328q.f28922Da);
            int i3 = C10320i.ic_requisite;
            C35777i iVar = r9;
            C35777i iVar2 = new C35777i(cardBuilder3, string, i3, i3, false, false);
            linkedHashMap.put(30, iVar);
            CardBuilder cardBuilder4 = CardBuilder.this;
            String string2 = cardBuilder4.getContext().getString(C10328q.product_item_button_text_statement);
            int i4 = C10320i.ic_deposit_statement;
            C35777i iVar3 = r9;
            C35777i iVar4 = new C35777i(cardBuilder4, string2, i4, i4, false, false);
            linkedHashMap.put(6, iVar3);
            ((C35777i) linkedHashMap.get(15)).f86423d = true;
            C35777i iVar5 = (C35777i) linkedHashMap.get(15);
            if (creditCardAccount.getBillInfo() == null) {
                z = true;
            } else {
                z = false;
            }
            iVar5.f86424e = z;
            if (C32303f.m95212w("REQUISITE", creditCardAccount.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(2)).f86423d = true;
            }
            if (C32303f.m95212w("REQUISITE_PRINT", creditCardAccount.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(30)).f86423d = true;
            }
            if (C32303f.m95212w("STATEMENT", creditCardAccount.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(6)).f86423d = true;
            }
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, i, 2, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$k */
    final class C35779k {
        C35779k() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87613a(int i, C41438c cVar) {
            int i2 = i;
            DepositBond depositBond = CardBuilder.this.depositBondsListWrapper.getBonds().getBonds().get(i2);
            CardBuilder.this.productKey = depositBond.cdGroupId.longValue();
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setDepositBond(depositBond, i2);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            String string = cardBuilder.getContext().getString(C10328q.product_item_button_text_share);
            int i3 = C10320i.ic_account_swipe_rekvizitebis_gaziareba;
            linkedHashMap.put(2, new C35777i(cardBuilder, string, i3, i3, false, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            String string2 = cardBuilder2.getContext().getString(C10328q.f28929Ha);
            int i4 = C10320i.ic_account_swipe_gadaricxva;
            linkedHashMap.put(5, new C35777i(cardBuilder2, string2, i4, i4, false, false));
            CardBuilder cardBuilder3 = CardBuilder.this;
            String string3 = cardBuilder3.getContext().getString(C10328q.product_item_button_text_top_up);
            int i5 = C10320i.ic_account_swipe_charicxva;
            linkedHashMap.put(7, new C35777i(cardBuilder3, string3, i5, i5, false, false));
            CardBuilder cardBuilder4 = CardBuilder.this;
            String string4 = cardBuilder4.getContext().getString(C10328q.product_item_button_text_moneybox);
            int i6 = C10320i.ic_moneybox;
            linkedHashMap.put(9, new C35777i(cardBuilder4, string4, i6, i6, false, false));
            CardBuilder cardBuilder5 = CardBuilder.this;
            String string5 = cardBuilder5.getContext().getString(C10328q.product_item_button_text_statement);
            int i7 = C10320i.ic_deposit_statement;
            linkedHashMap.put(6, new C35777i(cardBuilder5, string5, i7, i7, false, false));
            ((C35777i) linkedHashMap.get(6)).f86423d = true;
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, i2, 4, cVar);
            return inflate;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$l */
    final class C35780l {
        C35780l() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87614a(int i, C41438c cVar) {
            Integer num;
            int i2 = i;
            Deposit deposit = CardBuilder.this.deposits.getDeposits().get(i2);
            CardBuilder.this.productKey = deposit.getAgreeKey();
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setDeposit(deposit, i2);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            String string = cardBuilder.getContext().getString(C10328q.product_item_button_text_share);
            int i3 = C10320i.ic_account_swipe_rekvizitebis_gaziareba;
            linkedHashMap.put(2, new C35777i(cardBuilder, string, i3, i3, false, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            String string2 = cardBuilder2.getContext().getString(C10328q.f28929Ha);
            int i4 = C10320i.ic_account_swipe_gadaricxva;
            linkedHashMap.put(5, new C35777i(cardBuilder2, string2, i4, i4, false, false));
            CardBuilder cardBuilder3 = CardBuilder.this;
            String string3 = cardBuilder3.getContext().getString(C10328q.product_item_button_text_top_up);
            int i5 = C10320i.ic_account_swipe_charicxva;
            linkedHashMap.put(7, new C35777i(cardBuilder3, string3, i5, i5, false, false));
            CardBuilder cardBuilder4 = CardBuilder.this;
            String string4 = cardBuilder4.getContext().getString(C10328q.product_item_button_text_deposit_goal_create);
            int i6 = C10320i.ic_account_swipe_damateba;
            C35777i iVar = r9;
            C35777i iVar2 = new C35777i(cardBuilder4, string4, i6, i6, false, false);
            linkedHashMap.put(24, iVar);
            CardBuilder cardBuilder5 = CardBuilder.this;
            String string5 = cardBuilder5.getContext().getString(C10328q.product_item_button_text_deposit_goal_edit);
            int i7 = C10320i.ic_account_swipe_redaktireba;
            View view = inflate;
            C35777i iVar3 = r9;
            C35777i iVar4 = new C35777i(cardBuilder5, string5, i7, i7, false, false);
            linkedHashMap.put(25, iVar3);
            CardBuilder cardBuilder6 = CardBuilder.this;
            String string6 = cardBuilder6.getContext().getString(C10328q.product_item_button_text_moneybox);
            int i8 = C10320i.ic_moneybox;
            C35777i iVar5 = r9;
            C35777i iVar6 = new C35777i(cardBuilder6, string6, i8, i8, false, false);
            linkedHashMap.put(9, iVar5);
            CardBuilder cardBuilder7 = CardBuilder.this;
            String string7 = cardBuilder7.getContext().getString(C10328q.product_item_button_text_statement);
            int i9 = C10320i.ic_deposit_statement;
            C35777i iVar7 = r9;
            C35777i iVar8 = new C35777i(cardBuilder7, string7, i9, i9, false, false);
            linkedHashMap.put(6, iVar7);
            CardBuilder cardBuilder8 = CardBuilder.this;
            String string8 = cardBuilder8.getContext().getString(C10328q.product_item_button_text_deposit_violation);
            int i12 = C10320i.ic_account_swipe_dargveva;
            C35777i iVar9 = r9;
            C35777i iVar10 = new C35777i(cardBuilder8, string8, i12, i12, false, false);
            linkedHashMap.put(23, iVar9);
            if (C32303f.m95212w("REQUISITE", deposit.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(2)).f86423d = true;
            }
            if (C32303f.m95212w("OUT_TRANSFER", deposit.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(5)).f86423d = true;
            }
            if (C32303f.m95212w("IN_TRANSFER", deposit.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(7)).f86423d = true;
            }
            if (C32303f.m95212w("SAVING_GOALS", deposit.getProductFunctions())) {
                if (deposit.hasSavingGoal()) {
                    ((C35777i) linkedHashMap.get(25)).f86423d = true;
                    num = 24;
                } else {
                    num = 24;
                    ((C35777i) linkedHashMap.get(24)).f86423d = true;
                }
                try {
                    ((C35777i) linkedHashMap.get(num)).f86425f = false;
                    ((C35777i) linkedHashMap.get(25)).f86425f = false;
                } catch (Exception unused) {
                }
            }
            if (C32303f.m95212w("CAS", deposit.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(9)).f86423d = true;
            }
            if (C32303f.m95212w("STATEMENT", deposit.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(6)).f86423d = true;
            }
            if (deposit.isBreakable()) {
                ((C35777i) linkedHashMap.get(23)).f86423d = true;
            }
            CardBuilder.this.setUpButtons(view, linkedHashMap, i, 4, cVar);
            return view;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$m */
    final class C35781m {
        C35781m() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87615a(int i, C41438c cVar) {
            Loan loan = CardBuilder.this.loans.getLoans().get(i);
            boolean equalsIgnoreCase = loan.getProdType().equalsIgnoreCase("INSTALLMENT");
            String repaymentFlag = loan.getDetails().getDetails().getRepaymentFlag();
            String loanType = loan.getLoanType();
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setLoan(loan, loan.getDetails(), -1, equalsIgnoreCase);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            Context r = cardBuilder.getContext();
            int i2 = C10328q.product_item_button_text_loan_payment;
            String string = r.getString(i2);
            int i3 = C10320i.ic_account_swipe_gadaricxva;
            linkedHashMap.put(32, new C35777i(cardBuilder, string, i3, i3, false, false));
            CardBuilder cardBuilder2 = CardBuilder.this;
            int i4 = i3;
            int i5 = i3;
            linkedHashMap.put(21, new C35777i(cardBuilder2, cardBuilder2.getContext().getString(i2), i4, i5, false, false));
            CardBuilder cardBuilder3 = CardBuilder.this;
            linkedHashMap.put(22, new C35777i(cardBuilder3, cardBuilder3.getContext().getString(C10328q.product_item_button_text_loan_prepayment), i4, i5, false, false));
            CardBuilder cardBuilder4 = CardBuilder.this;
            String string2 = cardBuilder4.getContext().getString(C10328q.product_item_button_text_statement);
            int i6 = C10320i.ic_deposit_statement;
            View view = inflate;
            C35777i iVar = r10;
            C35777i iVar2 = new C35777i(cardBuilder4, string2, i6, i6, false, false);
            linkedHashMap.put(6, iVar);
            CardBuilder cardBuilder5 = CardBuilder.this;
            String a = C27950a.m86284a("online.inst.product.button.reversal");
            int i7 = C10320i.ic_account_swipe_dargveva;
            C35777i iVar3 = r10;
            C35777i iVar4 = new C35777i(cardBuilder5, a, i7, i7, false, false);
            linkedHashMap.put(28, iVar3);
            CardBuilder cardBuilder6 = CardBuilder.this;
            String a2 = C27950a.m86284a("online.inst.product.button.reversal.status");
            int i8 = C10320i.ic_installment_reversal_status;
            C35777i iVar5 = r10;
            C35777i iVar6 = new C35777i(cardBuilder6, a2, i8, i8, false, false);
            linkedHashMap.put(29, iVar5);
            if (loanType.equals("PLN")) {
                ((C35777i) linkedHashMap.get(32)).f86423d = true;
            }
            boolean z = false;
            if (repaymentFlag != null) {
                if (repaymentFlag.equals("Y")) {
                    ((C35777i) linkedHashMap.get(21)).f86423d = true;
                    ((C35777i) linkedHashMap.get(22)).f86423d = false;
                } else if (repaymentFlag.equals("P") || repaymentFlag.equals("F")) {
                    ((C35777i) linkedHashMap.get(21)).f86423d = false;
                    ((C35777i) linkedHashMap.get(22)).f86423d = true;
                }
            }
            if (C32303f.m95212w("STATEMENT", loan.getProductFunctions())) {
                C35777i iVar7 = (C35777i) linkedHashMap.get(6);
                if (loan.acctRef != AcctRefEntity.COSIGNER) {
                    z = true;
                }
                iVar7.f86423d = z;
            }
            if (C32303f.m95212w("REVERSAL", loan.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(28)).f86423d = true;
            }
            if (C32303f.m95212w("REVERSAL_STATUS", loan.getProductFunctions())) {
                ((C35777i) linkedHashMap.get(29)).f86423d = true;
            }
            CardBuilder.this.setUpButtons(view, linkedHashMap, i, 3, cVar);
            return view;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$n */
    private class C35782n {

        /* renamed from: a */
        Object f86431a;

        /* renamed from: b */
        Object f86432b;

        C35782n(Object obj, Object obj2) {
            this.f86431a = obj;
            this.f86432b = obj2;
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.cardview.CardBuilder$o */
    final class C35783o {
        C35783o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public View mo87616a(C41438c cVar) {
            View inflate = CardBuilder.this.getLayoutInflater().inflate(C10324m.layout_card_view, (ViewGroup) null);
            AccountItemView t = CardBuilder.this.getOptimizedCard();
            t.setPension(CardBuilder.this.pension);
            ((LinearLayout) inflate.findViewById(C10322k.card_view_top_container)).addView(t);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            CardBuilder cardBuilder = CardBuilder.this;
            String string = cardBuilder.getContext().getString(C10328q.f28970z5);
            int i = C10320i.ic_account_swipe_damalva;
            linkedHashMap.put(26, new C35777i(cardBuilder, string, i, i, true, false));
            CardBuilder.this.setUpButtons(inflate, linkedHashMap, 0, 18, cVar);
            return inflate;
        }
    }

    private CardBuilder() {
    }

    private SwipeMenuButton createButton() {
        SwipeMenuButton swipeMenuButton = new SwipeMenuButton(getContext());
        swipeMenuButton.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        return swipeMenuButton;
    }

    private int getButtonId(String str, Set<Map.Entry<Integer, C35777i>> set) {
        for (Map.Entry next : set) {
            if (((C35777i) next.getValue()).f86420a.equals(str)) {
                return ((Integer) next.getKey()).intValue();
            }
        }
        return -1;
    }

    /* access modifiers changed from: private */
    public Context getContext() {
        return this.activity;
    }

    /* access modifiers changed from: private */
    public LayoutInflater getLayoutInflater() {
        return LayoutInflater.from(getContext());
    }

    /* access modifiers changed from: private */
    public AccountItemView getOptimizedCard() {
        AccountItemView accountItemView = new AccountItemView(getLayoutInflater().getContext(), true);
        accountItemView.setRoundCornerType(AccountItemView.RoundCornerType.TOP);
        accountItemView.optimizeCard(true);
        return accountItemView;
    }

    private int getVisibleButtonsCount(Set<Map.Entry<Integer, C35777i>> set) {
        int i = 0;
        for (Map.Entry<Integer, C35777i> value : set) {
            if (((C35777i) value.getValue()).f86423d) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpButtons$0(Map.Entry entry, C41438c cVar, int i, int i2, View view) {
        onButtonClick(((Integer) entry.getKey()).intValue(), cVar, i, i2);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ boolean lambda$setUpButtons$1(LinkedHashMap linkedHashMap, C41438c cVar, int i, int i2, MenuItem menuItem) {
        int buttonId;
        if (menuItem.getTitle() == null || (buttonId = getButtonId(menuItem.getTitle().toString(), linkedHashMap.entrySet())) == -1) {
            return false;
        }
        onButtonClick(buttonId, cVar, i, i2);
        return true;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$setUpButtons$2(C35782n nVar, LinkedHashMap linkedHashMap, C41438c cVar, int i, int i2, View view) {
        C36546y.m108282F().mo27152s("deposits", "", "more");
        C0430g1 g1Var = new C0430g1(getContext(), view);
        int intValue = ((Integer) nVar.f86432b).intValue();
        while (true) {
            intValue++;
            if (intValue < linkedHashMap.size()) {
                C35777i iVar = (C35777i) linkedHashMap.values().toArray()[intValue];
                if (iVar.f86423d) {
                    g1Var.mo2096a().add(iVar.f86420a);
                }
            } else {
                g1Var.mo2099d(new C35788a(this, linkedHashMap, cVar, i, i2));
                g1Var.mo2100e();
                return;
            }
        }
    }

    private void onButtonClick(int i, C41438c cVar, int i2, int i3) {
        if (this.isDepositBond) {
            i2 += this.depositsSize;
        }
        SwipeItemClickEvent swipeItemClickEvent = new SwipeItemClickEvent(i2);
        if (i3 == 4) {
            swipeItemClickEvent = new SwipeItemClickEvent(i2, this.productKey);
        }
        swipeItemClickEvent.setIndex(i);
        swipeItemClickEvent.setAdditionalData(i3);
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 6) {
                            if (i3 == 18) {
                                swipeItemClickEvent.setType(26);
                            } else if (i3 != 15) {
                                if (i3 != 16) {
                                    switch (i3) {
                                        case 8:
                                            if (swipeItemClickEvent.getIndex() != 6) {
                                                if (swipeItemClickEvent.getIndex() == 31) {
                                                    C36546y.m108282F().mo27152s("mr", "plus_converter", "click");
                                                    swipeItemClickEvent.setType(31);
                                                    break;
                                                }
                                            } else {
                                                swipeItemClickEvent.setType(6);
                                                C36546y.m108282F().mo27152s("mr", "statement", "click");
                                                break;
                                            }
                                            break;
                                        case 9:
                                            if (swipeItemClickEvent.getIndex() != 6) {
                                                if (swipeItemClickEvent.getIndex() != 1) {
                                                    if (swipeItemClickEvent.getIndex() == 17) {
                                                        swipeItemClickEvent.setType(17);
                                                        C36546y.m108282F().mo27152s("cas", "deactivate", "click");
                                                        break;
                                                    }
                                                } else {
                                                    swipeItemClickEvent.setType(1);
                                                    C36546y.m108282F().mo27152s("cas", "edit", "click");
                                                    break;
                                                }
                                            } else {
                                                swipeItemClickEvent.setType(6);
                                                C36546y.m108282F().mo27152s("cas", "statement", "click");
                                                break;
                                            }
                                            break;
                                        case 10:
                                            if (swipeItemClickEvent.getIndex() == 6) {
                                                swipeItemClickEvent.setType(6);
                                                C36546y.m108282F().mo27152s("cashback", "statement", "click");
                                                break;
                                            }
                                            break;
                                    }
                                } else if (swipeItemClickEvent.getIndex() == 18) {
                                    swipeItemClickEvent.setType(18);
                                    C36546y.m108282F().mo27152s("plus", "exchange_points", "click");
                                } else if (swipeItemClickEvent.getIndex() == 19) {
                                    swipeItemClickEvent.setType(19);
                                    C36546y.m108282F().mo27152s("plus", "transfer_points", "click");
                                } else if (swipeItemClickEvent.getIndex() == 20) {
                                    swipeItemClickEvent.setType(20);
                                    C36546y.m108282F().mo27152s("plus", "invite", "click");
                                } else if (swipeItemClickEvent.getIndex() == 6) {
                                    swipeItemClickEvent.setType(6);
                                    C36546y.m108282F().mo27152s("plus", "statement", "click");
                                }
                            } else if (swipeItemClickEvent.getIndex() == 6) {
                                swipeItemClickEvent.setType(6);
                                C36546y.m108282F().mo27152s("scool", "statement", "click");
                            }
                        } else if (swipeItemClickEvent.getIndex() == 12) {
                            swipeItemClickEvent.setType(12);
                            C36546y.m108282F().mo27152s("cards", "card_block", "click");
                        } else if (swipeItemClickEvent.getIndex() == 25) {
                            swipeItemClickEvent.setType(25);
                            C36546y.m108282F().mo27152s("cards", "card_block", "click");
                        } else if (swipeItemClickEvent.getIndex() == 24) {
                            swipeItemClickEvent.setType(24);
                            C36546y.m108282F().mo27152s("cards", "order_card", "click");
                        } else if (swipeItemClickEvent.getIndex() == 27) {
                            swipeItemClickEvent.setType(27);
                            C36546y.m108282F().mo27152s("cards", "card_details", "click");
                        }
                    } else if (swipeItemClickEvent.getIndex() == 2) {
                        swipeItemClickEvent.setType(2);
                        C36546y.m108282F().mo27152s("deposits", "", "share");
                    } else if (swipeItemClickEvent.getIndex() == 5) {
                        swipeItemClickEvent.setType(5);
                        C36546y.m108282F().mo27152s("deposits", "", "transfer");
                    } else if (swipeItemClickEvent.getIndex() == 7) {
                        swipeItemClickEvent.setType(7);
                        C36546y.m108282F().mo27152s("deposits", "", "add_money");
                    } else if (swipeItemClickEvent.getIndex() == 23) {
                        swipeItemClickEvent.setType(23);
                        C36546y.m108282F().mo27152s("deposits", "", "deposit_violation");
                    } else if (swipeItemClickEvent.getIndex() == 9) {
                        swipeItemClickEvent.setType(9);
                        C36546y.m108282F().mo27152s("deposits", "", "money_box");
                    } else if (swipeItemClickEvent.getIndex() == 6) {
                        swipeItemClickEvent.setType(6);
                        C36546y.m108282F().mo27152s("deposits", "", "statement");
                    } else if (swipeItemClickEvent.getIndex() == 24) {
                        swipeItemClickEvent.setType(24);
                        C36546y.m108282F().mo27152s("deposits", "saving_goal_add", "add_saving_goal");
                    } else if (swipeItemClickEvent.getIndex() == 25) {
                        swipeItemClickEvent.setType(25);
                        C36546y.m108282F().mo27152s("deposits", "saving_goal_edit", "edit_saving_goal");
                    }
                } else if (swipeItemClickEvent.getIndex() == 21) {
                    swipeItemClickEvent.setType(21);
                    C36546y.m108282F().mo27152s("loans", "loan_repayment", "click");
                } else if (swipeItemClickEvent.getIndex() == 22) {
                    swipeItemClickEvent.setType(22);
                    C36546y.m108282F().mo27152s("loans", "loan_prepayment", "click");
                } else if (swipeItemClickEvent.getIndex() == 32) {
                    swipeItemClickEvent.setType(32);
                } else if (swipeItemClickEvent.getIndex() == 6) {
                    swipeItemClickEvent.setType(6);
                    C36546y.m108282F().mo27152s("loans", "statement", "click");
                } else if (swipeItemClickEvent.getIndex() == 28) {
                    swipeItemClickEvent.setType(28);
                } else if (swipeItemClickEvent.getIndex() == 29) {
                    swipeItemClickEvent.setType(29);
                }
            } else if (swipeItemClickEvent.getIndex() == 4) {
                swipeItemClickEvent.setType(4);
                C36546y.m108282F().mo27152s("credit_cards", "payment", "click");
            } else if (swipeItemClickEvent.getIndex() == 15) {
                swipeItemClickEvent.setType(15);
                C36546y.m108282F().mo27152s("credit_cards", "pay_debt", "click");
            } else if (swipeItemClickEvent.getIndex() == 2) {
                swipeItemClickEvent.setType(2);
                C36546y.m108282F().mo27152s("credit_cards", "share", "click");
            } else if (swipeItemClickEvent.getIndex() == 6) {
                swipeItemClickEvent.setType(6);
                C36546y.m108282F().mo27152s("credit_cards", "statement", "click");
            } else if (swipeItemClickEvent.getIndex() == 30) {
                C36546y.m108282F().mo27152s("products", "productGroup", "print_requisites");
                swipeItemClickEvent.setType(30);
            }
        } else if (swipeItemClickEvent.getIndex() == 4) {
            swipeItemClickEvent.setType(4);
            C36546y.m108282F().mo27152s("accounts", "payment", "click");
        } else if (swipeItemClickEvent.getIndex() == 5) {
            swipeItemClickEvent.setType(5);
            C36546y.m108282F().mo27152s("accounts", "transfer", "click");
        } else if (swipeItemClickEvent.getIndex() == 2) {
            swipeItemClickEvent.setType(2);
            C36546y.m108282F().mo27152s("accounts", "share", "click");
        } else if (swipeItemClickEvent.getIndex() == 6) {
            swipeItemClickEvent.setType(6);
            C36546y.m108282F().mo27152s("accounts", "statement", "click");
        } else if (swipeItemClickEvent.getIndex() == 8) {
            swipeItemClickEvent.setType(8);
            C36546y.m108282F().mo27152s("accounts", "add_money", "click");
        } else if (swipeItemClickEvent.getIndex() == 30) {
            C36546y.m108282F().mo27152s("products", "productGroup", "print_requisites");
            swipeItemClickEvent.setType(30);
        }
        swipeItemClickEvent.setPosition(i2);
        if (cVar != null) {
            cVar.mo96184m(swipeItemClickEvent);
        }
    }

    /* access modifiers changed from: private */
    public void setPanelLocked(View view, String str) {
        view.findViewById(C10322k.card_view_top_container).setAlpha(0.5f);
        view.findViewById(C10322k.deposit_card_swipe_iv).setAlpha(0.5f);
        int i = C10322k.blocked_card_info;
        view.findViewById(i).setVisibility(0);
        ((ProductBlockView) view.findViewById(i)).setText(str);
    }

    /* access modifiers changed from: private */
    public void setUpButtons(View view, LinkedHashMap<Integer, C35777i> linkedHashMap, int i, int i2, C41438c cVar) {
        View view2 = view;
        LinearLayout linearLayout = (LinearLayout) view2.findViewById(C10322k.f28879p5);
        C35782n nVar = new C35782n(0, 0);
        Iterator<Map.Entry<Integer, C35777i>> it = linkedHashMap.entrySet().iterator();
        int i3 = 0;
        while (true) {
            int i4 = 8;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            C35777i iVar = (C35777i) next.getValue();
            if (iVar.f86423d && ((Integer) nVar.f86431a).intValue() < 4) {
                SwipeMenuButton createButton = createButton();
                nVar.f86431a = Integer.valueOf(((Integer) nVar.f86431a).intValue() + (iVar.f86423d ? 1 : 0));
                nVar.f86432b = Integer.valueOf(i3);
                if (iVar.f86423d) {
                    i4 = 0;
                }
                createButton.setVisibility(i4);
                createButton.setTitle(iVar.f86420a);
                createButton.setImageId(iVar.f86421b);
                createButton.setBlockedImageId(iVar.f86422c);
                createButton.setBackgroundColorId(C10318g.f28649t2);
                createButton.setBorderColorId(C10318g.f28631S0);
                createButton.setTextColorId(C10318g.f28626L0);
                createButton.removeShadow();
                createButton.setShouldTint(true);
                createButton.setBlocked(iVar.f86424e);
                createButton.setImageSize(C10319h.product_detailed_card_button_circle_height);
                createButton.setTitleTopPadding(C10319h.swipe_button_shadow_padding);
                createButton.showNewIcon(iVar.f86425f);
                if (!iVar.f86424e) {
                    createButton.setOnClickListener(new C35789b(this, next, cVar, i, i2));
                }
                linearLayout.addView(createButton);
            }
            i3++;
        }
        View findViewById = view2.findViewById(C10322k.settings_btn);
        if (((Integer) nVar.f86431a).intValue() != 4 || getVisibleButtonsCount(linkedHashMap.entrySet()) <= 4) {
            findViewById.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new C35790c(this, nVar, linkedHashMap, cVar, i, i2));
    }

    public static CardBuilder with(Activity activity2) {
        CardBuilder cardBuilder = new CardBuilder();
        cardBuilder.activity = activity2;
        return cardBuilder;
    }

    public C35778j forObject(CreditCardsWrapper creditCardsWrapper) {
        this.credits = creditCardsWrapper;
        return new C35778j();
    }

    public C35781m forObject(LoansWrapper loansWrapper) {
        this.loans = loansWrapper;
        return new C35781m();
    }

    public C35771c forObject(BondsWrapper bondsWrapper2) {
        this.bondsWrapper = bondsWrapper2;
        return new C35771c();
    }

    public C35780l forObject(DepositsWrapper depositsWrapper) {
        this.deposits = depositsWrapper;
        return new C35780l();
    }

    public C35779k forObject(DepositBondsListWrapper depositBondsListWrapper2, int i) {
        this.depositBondsListWrapper = depositBondsListWrapper2;
        this.isDepositBond = true;
        this.depositsSize = i;
        return new C35779k();
    }

    public C35770b forObject(List<C25838r> list) {
        this.accountCards = list;
        return new C35770b();
    }

    public C35769a forObject(C25836p pVar) {
        this.accounts = pVar;
        return new C35769a();
    }

    public C35772d forObject(BonusAmexUiModel bonusAmexUiModel) {
        this.bonusAmex = bonusAmexUiModel;
        return new C35772d();
    }

    public C35774f forObject(BonusPlusUiModel bonusPlusUiModel) {
        this.bonusPlus = bonusPlusUiModel;
        return new C35774f();
    }

    public C35775g forObject(BonusPrloUiModel bonusPrloUiModel) {
        this.bonusPrlo = bonusPrloUiModel;
        return new C35775g();
    }

    public C35773e forObject(BonusCashBackUiModel bonusCashBackUiModel) {
        this.bonusCashback = bonusCashBackUiModel;
        return new C35773e();
    }

    public C35776h forObject(BonusScoolUiModel bonusScoolUiModel) {
        this.bonusScool = bonusScoolUiModel;
        return new C35776h();
    }

    public C35783o forObject(PensionResult pensionResult) {
        this.pension = pensionResult;
        return new C35783o();
    }
}
