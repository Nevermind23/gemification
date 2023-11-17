package p341ge.bog.mobilebank.cleanarch.moremenu.presentation;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.C0767a;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import ba1.C10146d0;
import de1.C40640a;
import g91.C32343x;
import gd1.C40992a;
import he1.C41217g;
import he1.C41222k;
import iu0.C36546y;
import j41.C36728a;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import jg1.C41438c;
import jg1.C41452l;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n41.C37353c;
import p017b.C2106d;
import p341ge.bog.designsystem.components.buttonlist.ButtonListLargeView;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.textbadge.TextBadgeView;
import p341ge.bog.mobilebank.cleanarch.becomesolo.presentation.BecomeSoloDescriptionActivity;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.LoyaltyListActivity;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreViewModel;
import p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.OffersAndApplicationsActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.commissions.CommissionSummariesActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.financemanagement.FinanceManagementActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.referals.ReferalsActivity;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2;
import p341ge.bog.mobilebank.eventbus.events.AvatarChangeEvent;
import p341ge.bog.mobilebank.eventbus.events.NotificationCountEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.usrinfo.ClientInfoWrapper;
import p341ge.bog.mobilebank.model.usrinfo.ClientStarInfo;
import p341ge.bog.mobilebank.model.usrinfo.PlusStatusState;
import p341ge.bog.mobilebank.model.usrinfo.UserInfoConsts;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.DDSTOListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ExchangeActivity;
import p341ge.bog.mobilebank.p975ui.activities.MapActivity;
import p341ge.bog.mobilebank.p975ui.activities.NotificationListActivity;
import p341ge.bog.mobilebank.p975ui.activities.ParametersActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.MenuClickableListItem;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10328q;
import p380ck.C10463g;
import p380ck.C10464h;
import p725cr.C19788a;
import p748eu.C20292b;
import p758fu.C20557a;
import p759fv.C20559a;
import p883rw.C28109a;
import p90.C27464x3;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment */
public final class MoreFragment extends Hilt_MoreFragment {
    private static final String ACTIVATE_JUNIOR_ITEM_TITLE = "more.junior.activation.page";
    public static final int ACTIVITY_RESULT_CODE_RESTART_PACKAGES = 13;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String FRAGMENT_TAG_DARK_MODE = "FRAGMENT_TAG_DARK_MODE";
    private static final String PAGE_ATMS_AND_BRANCHES_TITLE = "text.more.menu.atms.and.branches";
    private static final String SHOW_RB_PACKAGES_IN_MORE_MENU = "SHOW_RB_PACKAGES_IN_MORE_MENU";
    private static final String SHOW_SOLO_CARD_IN_PACKAGES = "SHOW_SOLO_CARD_IN_PACKAGES";
    private static final String SHOW_SOLO_PACKAGES_IN_MORE_MENU = "SHOW_SOLO_PACKAGES_IN_MORE_MENU";
    private C27464x3 _binding;
    public C36728a authHelper;
    public C20292b getAppSettingByNameUseCase;
    public C28109a getReferalBannerInfoUseCase;
    private NotificationCountEvent notificationCountEvent;
    private MenuClickableListItem notificationItem;
    private MenuClickableListItem rates;
    private final C0173b resultListener;
    private final C41217g viewModel$delegate;

    /* renamed from: ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MoreFragment newInstance(boolean z) {
            MoreFragment moreFragment = new MoreFragment();
            moreFragment.setViewPagerFragment(z);
            return moreFragment;
        }
    }

    public MoreFragment() {
        C41217g a = C41219i.m119469a(C41222k.NONE, new MoreFragment$special$$inlined$viewModels$default$2(new MoreFragment$special$$inlined$viewModels$default$1(this)));
        this.viewModel$delegate = C1514j0.m5374c(this, C41520a0.m120436b(MoreViewModel.ViewModel.class), new MoreFragment$special$$inlined$viewModels$default$3(a), new MoreFragment$special$$inlined$viewModels$default$4((C43064a) null, a), new MoreFragment$special$$inlined$viewModels$default$5(this, a));
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C21302b(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.resultListener = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public final void fillSection2(boolean z) {
        boolean z2;
        int i;
        MenuClickableListItem menuClickableListItem;
        MenuClickableListItem menuClickableListItem2;
        boolean z3;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        MenuClickableListItem menuClickableListItem3 = new MenuClickableListItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem3.setId(C10322k.f28859ko);
        MenuClickableListItem.setUpItem$default(menuClickableListItem3, menuClickableListItem3.getContext().getString(C10328q.more_menu_label_packages), C10320i.ic_packages_rb, false, false, 12, (Object) null);
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        MenuClickableListItem menuClickableListItem4 = new MenuClickableListItem(requireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem4.setId(C10322k.packages_solo);
        Context context = menuClickableListItem4.getContext();
        ClientInfoWrapper userInfo = this.mClient.getUserInfo();
        if (userInfo == null || !userInfo.isSolo()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i = C10328q.more_menu_label_solo_packages;
        } else {
            i = C10328q.more_menu_label_become_solo;
        }
        MenuClickableListItem.setUpItem$default(menuClickableListItem4, context.getString(i), C10320i.ic_packages_solo, false, false, 12, (Object) null);
        Context requireContext3 = requireContext();
        C41536l.m120488h(requireContext3, "requireContext()");
        MenuClickableListItem menuClickableListItem5 = new MenuClickableListItem(requireContext3, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem5.setId(C10322k.pfm);
        MenuClickableListItem.setUpItem$default(menuClickableListItem5, getString(C10328q.financial_manager), C10320i.ic_pfm, false, false, 12, (Object) null);
        Context requireContext4 = requireContext();
        C41536l.m120488h(requireContext4, "requireContext()");
        MenuClickableListItem menuClickableListItem6 = new MenuClickableListItem(requireContext4, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem6.setId(C10322k.travel_card_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem6, getString(C10328q.more_menu_label_travel_card), C10320i.ic_bus, false, false, 12, (Object) null);
        Context requireContext5 = requireContext();
        C41536l.m120488h(requireContext5, "requireContext()");
        MenuClickableListItem menuClickableListItem7 = new MenuClickableListItem(requireContext5, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem7.setId(C10322k.insurance_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem7, getString(C10328q.more_menu_label_auto_liability_insurance), C10320i.f28699ta, true, false, 8, (Object) null);
        Context requireContext6 = requireContext();
        C41536l.m120488h(requireContext6, "requireContext()");
        MenuClickableListItem menuClickableListItem8 = new MenuClickableListItem(requireContext6, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem8.setId(C10322k.activate_junior_item);
        menuClickableListItem8.setUpItem(C32343x.m95388F(ACTIVATE_JUNIOR_ITEM_TITLE, new Object[0]), C10320i.f28668K7, false, true);
        Context requireContext7 = requireContext();
        C41536l.m120488h(requireContext7, "requireContext()");
        MenuClickableListItem menuClickableListItem9 = new MenuClickableListItem(requireContext7, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem9.setId(C10322k.referrals_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem9, getString(C10328q.main_activity_burger_menu_referrals), C10320i.ic_referals_gift, false, false, 12, (Object) null);
        menuClickableListItem9.showDivider(true);
        Context requireContext8 = requireContext();
        C41536l.m120488h(requireContext8, "requireContext()");
        MenuClickableListItem menuClickableListItem10 = new MenuClickableListItem(requireContext8, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem10.setId(C10322k.automatic_payments_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem10, getString(C10328q.main_activity_burger_menu_dd_sto), C10320i.ic_auto_payment, false, false, 12, (Object) null);
        Context requireContext9 = requireContext();
        C41536l.m120488h(requireContext9, "requireContext()");
        MenuClickableListItem menuClickableListItem11 = r12;
        MenuClickableListItem menuClickableListItem12 = new MenuClickableListItem(requireContext9, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem11.setId(C10322k.loyalty_program_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem11, getString(C10328q.main_activity_burger_menu_bonuses), C10320i.ic_saving, false, false, 12, (Object) null);
        Context requireContext10 = requireContext();
        C41536l.m120488h(requireContext10, "requireContext()");
        MenuClickableListItem menuClickableListItem13 = new MenuClickableListItem(requireContext10, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem13.setId(C10322k.exchange_rates_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem13, getString(C10328q.main_activity_burger_menu_exchange_rates), C10320i.ic_currency, false, false, 12, (Object) null);
        this.rates = menuClickableListItem13;
        Context requireContext11 = requireContext();
        C41536l.m120488h(requireContext11, "requireContext()");
        MenuClickableListItem menuClickableListItem14 = new MenuClickableListItem(requireContext11, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem14.setId(C10322k.money_transfers_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem14, getString(C10328q.main_activity_burger_menu_receive_transfers), C10320i.ic_money_transfers, false, false, 12, (Object) null);
        Context requireContext12 = requireContext();
        C41536l.m120488h(requireContext12, "requireContext()");
        MenuClickableListItem menuClickableListItem15 = r13;
        MenuClickableListItem menuClickableListItem16 = new MenuClickableListItem(requireContext12, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem15.setId(C10322k.offers_and_applications_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem15, getString(C10328q.apps_and_offers), C10320i.ic_offers, false, false, 12, (Object) null);
        Context requireContext13 = requireContext();
        C41536l.m120488h(requireContext13, "requireContext()");
        MenuClickableListItem menuClickableListItem17 = menuClickableListItem8;
        MenuClickableListItem menuClickableListItem18 = r13;
        MenuClickableListItem menuClickableListItem19 = new MenuClickableListItem(requireContext13, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem18.setId(C10322k.become_solo_item);
        MenuClickableListItem menuClickableListItem20 = menuClickableListItem15;
        menuClickableListItem18.setUpItem(C32343x.m95388F("offers.become.solo.button.more.menu", new Object[0]), C10320i.ic_become_solo_menu_item, false, true);
        Context requireContext14 = requireContext();
        C41536l.m120488h(requireContext14, "requireContext()");
        MenuClickableListItem menuClickableListItem21 = new MenuClickableListItem(requireContext14, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem21.setId(C10322k.atms_and_branches_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem21, C32343x.m95388F(PAGE_ATMS_AND_BRANCHES_TITLE, new Object[0]), C10320i.icons_48_general_service_center_atm_outline, true, false, 8, (Object) null);
        menuClickableListItem21.showDivider(false);
        MenuClickableListItem commissions = getCommissions();
        MenuClickableListItem instantCardItem = getInstantCardItem();
        LinearLayout linearLayout = getBinding().f70215o;
        linearLayout.removeAllViews();
        if (this.mClient.isAuthorized()) {
            if (z) {
                linearLayout.addView(instantCardItem);
            }
            if (showPackages()) {
                linearLayout.addView(menuClickableListItem3);
            }
            if (showSoloPackages()) {
                linearLayout.addView(menuClickableListItem4);
            }
            linearLayout.addView(menuClickableListItem5);
            if (getViewModel().isTransportPassEnabled()) {
                linearLayout.addView(menuClickableListItem6);
            }
            linearLayout.addView(menuClickableListItem7);
            linearLayout.addView(menuClickableListItem9);
            getReferals(menuClickableListItem9);
            linearLayout.addView(menuClickableListItem10);
            linearLayout.addView(menuClickableListItem11);
            linearLayout.addView(menuClickableListItem14);
            if (!this.mClient.getUserRestrictions().contains(UserRestrictions.MORE_OFFERS_AND_APPLICATIONS)) {
                menuClickableListItem2 = menuClickableListItem20;
                linearLayout.addView(menuClickableListItem2);
            } else {
                menuClickableListItem2 = menuClickableListItem20;
            }
            linearLayout.addView(commissions);
            if (showOldBecomeSoloItem()) {
                linearLayout.addView(menuClickableListItem18);
            }
            menuClickableListItem = menuClickableListItem17;
            linearLayout.addView(menuClickableListItem);
        } else {
            menuClickableListItem2 = menuClickableListItem20;
            menuClickableListItem = menuClickableListItem17;
        }
        MenuClickableListItem menuClickableListItem22 = this.rates;
        if (menuClickableListItem22 == null) {
            C41536l.m120506z("rates");
            menuClickableListItem22 = null;
        }
        linearLayout.addView(menuClickableListItem22);
        linearLayout.addView(menuClickableListItem21);
        menuClickableListItem7.setOnClickListener(new C21310f(this));
        menuClickableListItem.setOnClickListener(new C21320k(this));
        menuClickableListItem6.setOnClickListener(new C21322m(this));
        menuClickableListItem11.setOnClickListener(new C21323n(this));
        MenuClickableListItem menuClickableListItem23 = this.rates;
        if (menuClickableListItem23 == null) {
            C41536l.m120506z("rates");
            menuClickableListItem23 = null;
        }
        menuClickableListItem23.setOnClickListener(new C21324o(this));
        menuClickableListItem5.setOnClickListener(new C21325p(this));
        menuClickableListItem10.setOnClickListener(new C21326q(this));
        menuClickableListItem14.setOnClickListener(new C21327r(this));
        menuClickableListItem2.setOnClickListener(new C21328s(this));
        menuClickableListItem21.setOnClickListener(new C21329t(this));
        menuClickableListItem9.setOnClickListener(new C21312g(this));
        menuClickableListItem18.setOnClickListener(new C21314h(this));
        menuClickableListItem3.setOnClickListener(new C21316i(this));
        ClientInfoWrapper userInfo2 = this.mClient.getUserInfo();
        if (userInfo2 != null) {
            z3 = userInfo2.isRBClient();
        } else {
            z3 = false;
        }
        menuClickableListItem4.setOnClickListener(new C21318j(this, z3));
    }

    static /* synthetic */ void fillSection2$default(MoreFragment moreFragment, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        moreFragment.fillSection2(z);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$30(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C20559a.C20568i iVar = C20559a.C20568i.f55604f;
        C10463g F = C36546y.m108282F();
        C41536l.m120488h(F, "getAnalytics()");
        iVar.mo49091a(F);
        Context requireContext = moreFragment.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        C38122f c = C38125h.m112238c(requireContext);
        C1505h requireActivity = moreFragment.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f.C38123a.m112227w(c, requireActivity, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$31(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C1505h requireActivity = moreFragment.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        Context requireContext = moreFragment.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        c.mo91540B(requireContext, (JuniorRequestDataUiModel) null, NavigatorConstants$JuniorFlow.ACTIVATION, true);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$32(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("travel_card", "", "travel_card_click_more_menu");
        C1505h requireActivity = moreFragment.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C38122f c = C38125h.m112238c(requireActivity);
        C1505h requireActivity2 = moreFragment.requireActivity();
        C41536l.m120488h(requireActivity2, "requireActivity()");
        C38122f.C38123a.m112203D(c, requireActivity2, (String) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$33(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "loyalty_programs", "open_module");
        moreFragment.startActivity(LoyaltyListActivity.class);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$34(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "exchange_rates", "open_module");
        moreFragment.startActivity(ExchangeActivity.class);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$35(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        FinanceManagementActivity.C22161a aVar = FinanceManagementActivity.f58918L;
        Context requireContext = moreFragment.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo54998a(requireContext);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$36(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27137H("more", "open_module", "automatic_payments", (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        moreFragment.startActivity(DDSTOListActivity.class);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$38(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27137H("more", "open_module", "remittance", (Bundle) null, C10464h.C10465a.FIREBASE);
        C10463g F = C36546y.m108282F();
        C10464h.C10465a aVar = C10464h.C10465a.FACEBOOKANDFIREBASE;
        F.mo27137H("remittance", "remittance_open_module_more", (String) null, (Bundle) null, aVar);
        C36546y.m108282F().mo27157x("open_remittance_module", aVar);
        C36546y.m108282F().mo27149p("open_remittance_module");
        C1505h activity = moreFragment.getActivity();
        if (activity != null) {
            C38122f.C38123a.m112202C(C38125h.m112238c(activity), activity, (String) null, false, 6, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$39(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "offers_and_applications", "open_module");
        moreFragment.startActivity(OffersAndApplicationsActivity.class);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$40(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "atms_and_branches", "open_module");
        moreFragment.startActivity(MapActivity.class);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$41(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "promo_code", "open_module");
        moreFragment.startActivity(ReferalsActivity.class);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$42(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "become_solo", "open_module");
        BecomeSoloDescriptionActivity.C20838b bVar = BecomeSoloDescriptionActivity.f56100I;
        C1505h requireActivity = moreFragment.requireActivity();
        C41536l.m120487g(requireActivity, "null cannot be cast to non-null type ge.bog.mobilebank.ui.activities.RootActivity");
        bVar.mo49590a((C35388f2) requireActivity, BecomeSoloDescriptionActivity.C20837a.MORE_MENU);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$43(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        moreFragment.sendPackageAnalytics("rb", "click_packages_page_rb");
        startCategoryPackagesActivity$default(moreFragment, (PackageType) null, (Boolean) null, 3, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void fillSection2$lambda$44(MoreFragment moreFragment, boolean z, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        moreFragment.sendPackageAnalytics("solo", "click_packages_page_solo");
        startCategoryPackagesActivity$default(moreFragment, (PackageType) null, Boolean.valueOf(z), 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void fillSection3() {
        getBinding().f70217q.removeAllViews();
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        MenuClickableListItem menuClickableListItem = new MenuClickableListItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem.setId(C10322k.settings_item);
        MenuClickableListItem.setUpItem$default(menuClickableListItem, getString(C10328q.button_text_settings), C10320i.f28680W8, false, false, 12, (Object) null);
        menuClickableListItem.showDivider(true);
        getBinding().f70217q.addView(menuClickableListItem);
        menuClickableListItem.setOnClickListener(new C21331v(this));
        getBinding().f70217q.addView(getDarkModeItem());
    }

    /* access modifiers changed from: private */
    public static final void fillSection3$lambda$51(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "settings", "open_module");
        moreFragment.startActivity(ParametersActivity.class);
    }

    private final void fillSections1() {
        if (this.mClient.isAuthorized()) {
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            MenuClickableListItem menuClickableListItem = new MenuClickableListItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            menuClickableListItem.setId(C10322k.lifestyle_chooser_item);
            menuClickableListItem.showDivider(false);
            MenuClickableListItem.setUpItem$default(menuClickableListItem, C32343x.m95388F("more.menu.life.style.chooser.block.main.text", new Object[0]), C10320i.f28687cb, true, false, 8, (Object) null);
            menuClickableListItem.setOnClickListener(new C21321l(menuClickableListItem, this));
            getBinding().f70219s.setVisibility(0);
            getBinding().f70219s.addView(menuClickableListItem);
        }
        Context requireContext2 = requireContext();
        C41536l.m120488h(requireContext2, "requireContext()");
        MenuClickableListItem menuClickableListItem2 = new MenuClickableListItem(requireContext2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem2.setId(C10322k.notifications_item);
        menuClickableListItem2.showDivider(false);
        MenuClickableListItem.setUpItem$default(menuClickableListItem2, getString(C10328q.main_activity_burger_menu_notifications), C10320i.icons_24_general_notification_outline, true, false, 8, (Object) null);
        this.notificationItem = menuClickableListItem2;
        MenuClickableListItem menuClickableListItem3 = null;
        if (this.mClient.isAuthorized()) {
            LinearLayout linearLayout = getBinding().f70213m;
            MenuClickableListItem menuClickableListItem4 = this.notificationItem;
            if (menuClickableListItem4 == null) {
                C41536l.m120506z("notificationItem");
                menuClickableListItem4 = null;
            }
            linearLayout.addView(menuClickableListItem4);
        }
        MenuClickableListItem menuClickableListItem5 = this.notificationItem;
        if (menuClickableListItem5 == null) {
            C41536l.m120506z("notificationItem");
        } else {
            menuClickableListItem3 = menuClickableListItem5;
        }
        menuClickableListItem3.setOnClickListener(new C21330u(this));
    }

    /* access modifiers changed from: private */
    public static final void fillSections1$lambda$12$lambda$11(MenuClickableListItem menuClickableListItem, MoreFragment moreFragment, View view) {
        C38122f c;
        C41536l.m120489i(menuClickableListItem, "$this_apply");
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "life_style_chooser_more", "open_module");
        Context context = menuClickableListItem.getContext();
        if (context != null && (c = C38125h.m112238c(context)) != null) {
            Context requireContext = moreFragment.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            c.mo91596c(requireContext);
        }
    }

    /* access modifiers changed from: private */
    public static final void fillSections1$lambda$14(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "notifications", "open_module");
        moreFragment.startActivity(NotificationListActivity.class);
    }

    /* access modifiers changed from: private */
    public final C27464x3 getBinding() {
        C27464x3 x3Var = this._binding;
        C41536l.m120486f(x3Var);
        return x3Var;
    }

    private final String getClientUserName() {
        String name = this.mClient.getUserInfo().getClient().getName(this.mPreferencesApiManager.getLanguage());
        if (name == null) {
            return "";
        }
        if (this.mPreferencesApiManager.getLanguage() != C37353c.EN) {
            return name;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return C41358y.m120017g0(C40440x.m117181w0(lowerCase, new char[]{' '}, false, 0, 6, (Object) null), " ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, MoreFragment$getClientUserName$1$1.INSTANCE, 30, (Object) null);
    }

    private final MenuClickableListItem getCommissions() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        MenuClickableListItem menuClickableListItem = new MenuClickableListItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        MenuClickableListItem.setUpItem$default(menuClickableListItem, getString(C10328q.common_text_commission), C10320i.ic_commission, false, false, 12, (Object) null);
        menuClickableListItem.setOnClickListener(new C21306d(this));
        return menuClickableListItem;
    }

    /* access modifiers changed from: private */
    public static final void getCommissions$lambda$49$lambda$48(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        CommissionSummariesActivity.C21429a aVar = CommissionSummariesActivity.f57295I;
        Context requireContext = moreFragment.requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo53515a(requireContext);
    }

    private final C19788a getDarkModeActionSheet() {
        C19788a aVar;
        Fragment k0 = getChildFragmentManager().mo4418k0(FRAGMENT_TAG_DARK_MODE);
        if (k0 instanceof C19788a) {
            aVar = (C19788a) k0;
        } else {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        return C38125h.m112239d(requireContext).mo91649a();
    }

    private final MenuClickableListItem getDarkModeItem() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        MenuClickableListItem menuClickableListItem = new MenuClickableListItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        menuClickableListItem.setId(C10322k.dark_mode_item);
        menuClickableListItem.showDivider(false);
        MenuClickableListItem.setUpItem$default(menuClickableListItem, C32343x.m95388F("more.menu.theme.switcher", new Object[0]), C10320i.f28661E3, true, false, 8, (Object) null);
        menuClickableListItem.showNewBadge(true);
        menuClickableListItem.setOnClickListener(new C21308e(this));
        return menuClickableListItem;
    }

    /* access modifiers changed from: private */
    public static final void getDarkModeItem$lambda$53$lambda$52(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C19788a darkModeActionSheet = moreFragment.getDarkModeActionSheet();
        if (!darkModeActionSheet.isAdded()) {
            darkModeActionSheet.mo4576A1(moreFragment.getChildFragmentManager(), FRAGMENT_TAG_DARK_MODE);
        }
    }

    private final MenuClickableListItem getInstantCardItem() {
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        MenuClickableListItem menuClickableListItem = new MenuClickableListItem(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        MenuClickableListItem.setUpItem$default(menuClickableListItem, C32343x.m95388F(MoreMenuDictionaryKeys.MORE_MENU_INSTANT_CARD_ACTIVATION, new Object[0]), C10320i.f28698sa, true, false, 8, (Object) null);
        menuClickableListItem.setOnClickListener(new C21304c(this));
        return menuClickableListItem;
    }

    /* access modifiers changed from: private */
    public static final void getInstantCardItem$lambda$47$lambda$46(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        Context requireContext = moreFragment.requireContext();
        C41536l.m120488h(requireContext, "getInstantCardItem$lambda$47$lambda$46$lambda$45");
        C38122f.C38123a.m112216l(C38125h.m112238c(requireContext), requireContext, (C0173b) null, 2, (Object) null);
        String lowerCase = C10464h.C10466b.MORE.name().toLowerCase(Locale.ROOT);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        C32343x.m95395I0(moreFragment, "Instant_Delivery", lowerCase, "open_activate", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    private final void getReferals(MenuClickableListItem menuClickableListItem) {
        addDisposable(getGetReferalBannerInfoUseCase().mo67644a().mo94962x(C40640a.m117458b()).mo94957s(C40992a.m118827a()).mo94960v(new C21334y(new MoreFragment$getReferals$1(menuClickableListItem)), new C21335z(new MoreFragment$getReferals$2(menuClickableListItem)), new C21301a0(menuClickableListItem)));
    }

    /* access modifiers changed from: private */
    public static final void getReferals$lambda$54(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void getReferals$lambda$55(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    public static final void getReferals$lambda$56(MenuClickableListItem menuClickableListItem) {
        C41536l.m120489i(menuClickableListItem, "$referals");
        menuClickableListItem.setVisibility(8);
    }

    private final MoreViewModel.ViewModel getViewModel() {
        return (MoreViewModel.ViewModel) this.viewModel$delegate.getValue();
    }

    private final void initLogout() {
        C27464x3 binding = getBinding();
        LinearLayout linearLayout = binding.f70208h;
        C41536l.m120488h(linearLayout, "logoutContainer");
        C32343x.m95483r1(linearLayout, this.mClient.isAuthorized(), false, 2, (Object) null);
        binding.f70208h.setOnClickListener(new C21300a(this));
    }

    /* access modifiers changed from: private */
    public static final void initLogout$lambda$2$lambda$1(MoreFragment moreFragment, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "", "log_out");
        C36728a authHelper2 = moreFragment.getAuthHelper();
        C1505h requireActivity = moreFragment.requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        authHelper2.mo42368a(requireActivity);
    }

    private final void loadAvatar() {
        String avatarUrl = C10146d0.C10159c.m37143b().getAvatarUrl();
        ButtonListLargeView buttonListLargeView = getBinding().f70221u;
        if (avatarUrl == null) {
            avatarUrl = "";
        }
        buttonListLargeView.setIcon(new Image.Url(avatarUrl, (Image.Placeholder) null, new Image.Resource(C10320i.f28675Qa, (Boolean) null, 2, (DefaultConstructorMarker) null), (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 122, (DefaultConstructorMarker) null));
    }

    private final void observeData() {
        getViewModel().getOutputs().getHasKycLiveData().mo4819k(getViewLifecycleOwner(), new MoreFragment$sam$androidx_lifecycle_Observer$0(new MoreFragment$observeData$1(this)));
        getViewModel().getOutputs().getUserInfoChangedLiveData().mo4819k(getViewLifecycleOwner(), new MoreFragment$sam$androidx_lifecycle_Observer$0(new MoreFragment$observeData$2(this)));
    }

    private final void profileHeaderClick(PackageType packageType, String str) {
        if (packageType == null || str == null) {
            C36546y.m108282F().mo27152s("more", "user_profile", "open_module");
            EditProfileActivity2.f59595H.mo55695b(this);
            return;
        }
        C36546y.m108282F().mo27152s("Account_packages", str, "click_active_package_badge");
        C36546y.m108282F().mo27137H("more_menu_click_active_package_badge", "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
        startCategoryPackagesActivity$default(this, packageType, (Boolean) null, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void resultListener$lambda$0(MoreFragment moreFragment, ActivityResult activityResult) {
        C41536l.m120489i(moreFragment, "this$0");
        if (activityResult.mo371b() == 13) {
            startCategoryPackagesActivity$default(moreFragment, PackageType.Companion.getPackageTypeByBadge(moreFragment.mClient.getUserInfo().getPackageBadge()), (Boolean) null, 2, (Object) null);
        }
    }

    private final void sendPackageAnalytics(String str, String str2) {
        C36546y.m108282F().mo27152s("packages_page", str, "click_packages_page");
        C36546y.m108282F().mo27137H(str2, "", "", (Bundle) null, C10464h.C10465a.FACEBOOK);
    }

    private final void setNotificationCount(MenuClickableListItem menuClickableListItem) {
        NotificationCountEvent notificationCountEvent2;
        boolean z;
        if (this.mClient.isAuthorized() && (notificationCountEvent2 = this.notificationCountEvent) != null) {
            if (notificationCountEvent2 == null || notificationCountEvent2.getState() != 20) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                NotificationCountEvent notificationCountEvent3 = this.notificationCountEvent;
                C41536l.m120486f(notificationCountEvent3);
                menuClickableListItem.showNotification(true, notificationCountEvent3.getNotificationTotalCount());
                return;
            }
        }
        menuClickableListItem.showNotification(false, 0);
    }

    private final void setUpPlusStatusSection() {
        String str;
        int i;
        String str2;
        ClientInfoWrapper userInfo;
        ClientStarInfo clientStarInfo;
        ClientInfoWrapper userInfo2;
        ClientStarInfo clientStarInfo2;
        Integer sumStatusPoint;
        ClientInfoWrapper userInfo3;
        ClientStarInfo clientStarInfo3;
        Client client = this.mClient;
        if (client == null || (userInfo3 = client.getUserInfo()) == null || (clientStarInfo3 = userInfo3.getClientStarInfo()) == null || (str = clientStarInfo3.getCurrentLabel()) == null) {
            str = "";
        }
        String F = C32343x.m95388F(UserInfoConsts.TEXT_PLUSPAGE_STATUS, new Object[0]);
        getBinding().f70211k.setText(str + " " + F);
        Client client2 = this.mClient;
        if (client2 == null || (userInfo2 = client2.getUserInfo()) == null || (clientStarInfo2 = userInfo2.getClientStarInfo()) == null || (sumStatusPoint = clientStarInfo2.getSumStatusPoint()) == null) {
            i = 0;
        } else {
            i = sumStatusPoint.intValue();
        }
        String F2 = C32343x.m95388F(UserInfoConsts.TEXT_PLUSPAGE_STARS, new Object[0]);
        getBinding().f70211k.setTitle(i + " " + F2);
        PlusStatusState.Companion companion = PlusStatusState.Companion;
        Client client3 = this.mClient;
        if (client3 == null || (userInfo = client3.getUserInfo()) == null || (clientStarInfo = userInfo.getClientStarInfo()) == null) {
            str2 = null;
        } else {
            str2 = clientStarInfo.getCurrentLabelType();
        }
        PlusStatusState byStatus = companion.getByStatus(str2);
        if (byStatus != null) {
            getBinding().f70210j.setBackgroundColor(C0767a.m2893c(requireContext(), byStatus.getColorRes()));
            getBinding().f70209i.setImageDrawable(C0767a.m2895e(requireContext(), byStatus.getIconRes()));
        }
        getBinding().f70210j.setOnClickListener(new C21303b0(this));
    }

    /* access modifiers changed from: private */
    public static final void setUpPlusStatusSection$lambda$4(MoreFragment moreFragment, View view) {
        C38122f c;
        C41536l.m120489i(moreFragment, "this$0");
        C36546y.m108282F().mo27152s("more", "plus_status", "open_module");
        Context context = moreFragment.getContext();
        if (context != null && (c = C38125h.m112238c(context)) != null) {
            Context requireContext = moreFragment.requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            c.mo91626r(requireContext);
        }
    }

    private final void setUpProfileHeader() {
        PackageType packageTypeByBadge = PackageType.Companion.getPackageTypeByBadge(this.mClient.getUserInfo().getPackageBadge());
        String activePackageName = this.mClient.getUserInfo().getActivePackageName();
        loadAvatar();
        String clientUserName = getClientUserName();
        ButtonListLargeView buttonListLargeView = getBinding().f70221u;
        if (packageTypeByBadge == null || activePackageName == null) {
            buttonListLargeView.setButtonListType(ButtonListLargeView.C13185c.THUMBNAIL_SECONDARY_TEXT);
            buttonListLargeView.setChangeButtonVisible(true);
            buttonListLargeView.setBottomViewType(ButtonListLargeView.C13183a.TEXT_VIEW);
            buttonListLargeView.setButtonText(buttonListLargeView.getResources().getString(C10328q.f28948Wc));
            buttonListLargeView.setLowerText(clientUserName);
            buttonListLargeView.setUpperText(buttonListLargeView.getResources().getString(C10328q.f28949X1));
        } else {
            buttonListLargeView.setIconButtonVisible(true);
            buttonListLargeView.setBottomViewType(ButtonListLargeView.C13183a.TEXT_BADGE_VIEW);
            buttonListLargeView.getTextBadge().setBadgeText(activePackageName);
            TextBadgeView textBadge = buttonListLargeView.getTextBadge();
            int badgeTextColor = packageTypeByBadge.getBadgeTextColor();
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            textBadge.setBadgeTextColor(C32343x.m95418U(badgeTextColor, requireContext));
            buttonListLargeView.getTextBadge().setBackgroundTint(packageTypeByBadge.getBadgeColor());
            buttonListLargeView.setIconButtonDrawable(C32343x.m95424X(C10320i.f28704za, buttonListLargeView.getContext()));
            buttonListLargeView.setUpperText(clientUserName);
            buttonListLargeView.setButtonListType(ButtonListLargeView.C13185c.THUMBNAIL);
        }
        ButtonListLargeView buttonListLargeView2 = getBinding().f70221u;
        buttonListLargeView2.setOnClickListener(new C21332w(this, packageTypeByBadge, activePackageName));
        buttonListLargeView2.setOnButtonClickListener(new C21333x(this, packageTypeByBadge, activePackageName));
    }

    /* access modifiers changed from: private */
    public static final void setUpProfileHeader$lambda$8$lambda$6(MoreFragment moreFragment, PackageType packageType, String str, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        moreFragment.profileHeaderClick(packageType, str);
    }

    /* access modifiers changed from: private */
    public static final void setUpProfileHeader$lambda$8$lambda$7(MoreFragment moreFragment, PackageType packageType, String str, View view) {
        C41536l.m120489i(moreFragment, "this$0");
        moreFragment.profileHeaderClick(packageType, str);
    }

    /* access modifiers changed from: private */
    public final void setUserInfo() {
        if (this.mClient.isAuthorized()) {
            if (this.mClient.getUserInfo() != null) {
                setUpProfileHeader();
            } else {
                getBinding().f70222v.setVisibility(8);
            }
            if (this.mClient.getUserInfo().isPlusStatusSegment()) {
                setUpPlusStatusSection();
            } else {
                getBinding().f70210j.setVisibility(8);
            }
        } else {
            getBinding().f70222v.setVisibility(8);
        }
    }

    private final boolean showOldBecomeSoloItem() {
        Boolean bool;
        boolean z;
        C20557a b = this.getAppSettingByNameUseCase.mo48775b(SHOW_SOLO_CARD_IN_PACKAGES);
        if (b != null) {
            bool = b.mo49084a();
        } else {
            bool = null;
        }
        ClientInfoWrapper userInfo = this.mClient.getUserInfo();
        if (userInfo == null || !userInfo.isRBClient()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || C41536l.m120484d(bool, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    private final boolean showPackages() {
        Boolean bool;
        boolean z;
        C20557a b = this.getAppSettingByNameUseCase.mo48775b(SHOW_RB_PACKAGES_IN_MORE_MENU);
        if (b != null) {
            bool = b.mo49084a();
        } else {
            bool = null;
        }
        ClientInfoWrapper userInfo = this.mClient.getUserInfo();
        if (userInfo == null || !userInfo.isRBClient()) {
            z = false;
        } else {
            z = true;
        }
        if (!z || !C41536l.m120484d(bool, Boolean.TRUE)) {
            return false;
        }
        return true;
    }

    private final boolean showSoloPackages() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ClientInfoWrapper userInfo = this.mClient.getUserInfo();
        if (userInfo == null || !userInfo.isSolo()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C20557a b = this.getAppSettingByNameUseCase.mo48775b(SHOW_SOLO_PACKAGES_IN_MORE_MENU);
            if (b != null) {
                z4 = C41536l.m120484d(b.mo49084a(), Boolean.TRUE);
            } else {
                z4 = false;
            }
            if (z4) {
                return true;
            }
        }
        ClientInfoWrapper userInfo2 = this.mClient.getUserInfo();
        if (userInfo2 == null || !userInfo2.isRBClient()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C20557a b2 = this.getAppSettingByNameUseCase.mo48775b(SHOW_SOLO_CARD_IN_PACKAGES);
            if (b2 != null) {
                z3 = C41536l.m120484d(b2.mo49084a(), Boolean.TRUE);
            } else {
                z3 = false;
            }
            if (z3) {
                return true;
            }
        }
        return false;
    }

    private final void startCategoryPackagesActivity(PackageType packageType, Boolean bool) {
        C38122f c;
        Context context = getContext();
        if (context != null && (c = C38125h.m112238c(context)) != null) {
            boolean d = C41536l.m120484d(bool, Boolean.TRUE);
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            c.mo91616m(packageType, d, (String) null, requireContext, this.resultListener);
        }
    }

    static /* synthetic */ void startCategoryPackagesActivity$default(MoreFragment moreFragment, PackageType packageType, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            packageType = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        moreFragment.startCategoryPackagesActivity(packageType, bool);
    }

    public final C36728a getAuthHelper() {
        C36728a aVar = this.authHelper;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("authHelper");
        return null;
    }

    public final C20292b getGetAppSettingByNameUseCase() {
        C20292b bVar = this.getAppSettingByNameUseCase;
        if (bVar != null) {
            return bVar;
        }
        C41536l.m120506z("getAppSettingByNameUseCase");
        return null;
    }

    public final C28109a getGetReferalBannerInfoUseCase() {
        C28109a aVar = this.getReferalBannerInfoUseCase;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("getReferalBannerInfoUseCase");
        return null;
    }

    public String getHeaderText() {
        String string = getString(C10328q.header_text_more);
        C41536l.m120488h(string, "getString(R.string.header_text_more)");
        return string;
    }

    public final int[] getRatesBoundsAndScroll() {
        C27464x3 binding = getBinding();
        if (binding == null) {
            return new int[0];
        }
        int[] iArr = new int[2];
        MenuClickableListItem menuClickableListItem = this.rates;
        MenuClickableListItem menuClickableListItem2 = null;
        if (menuClickableListItem == null) {
            C41536l.m120506z("rates");
            menuClickableListItem = null;
        }
        menuClickableListItem.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        binding.f70212l.getLocationOnScreen(iArr2);
        int i = iArr[1];
        MenuClickableListItem menuClickableListItem3 = this.rates;
        if (menuClickableListItem3 == null) {
            C41536l.m120506z("rates");
            menuClickableListItem3 = null;
        }
        int height = (i + menuClickableListItem3.getHeight()) - (iArr2[1] + binding.f70212l.getHeight());
        if (height > 0) {
            binding.f70212l.scrollTo(0, height);
        }
        int[] iArr3 = new int[2];
        MenuClickableListItem menuClickableListItem4 = this.rates;
        if (menuClickableListItem4 == null) {
            C41536l.m120506z("rates");
            menuClickableListItem4 = null;
        }
        menuClickableListItem4.getLocationOnScreen(iArr3);
        int[] iArr4 = new int[2];
        int i2 = iArr3[1];
        iArr4[0] = i2;
        MenuClickableListItem menuClickableListItem5 = this.rates;
        if (menuClickableListItem5 == null) {
            C41536l.m120506z("rates");
        } else {
            menuClickableListItem2 = menuClickableListItem5;
        }
        iArr4[1] = i2 + menuClickableListItem2.getHeight();
        return iArr4;
    }

    public final int[] getUserContainerBoundAndScroll() {
        C27464x3 binding = getBinding();
        if (binding == null) {
            return new int[0];
        }
        binding.f70212l.scrollTo(0, 0);
        int[] iArr = new int[2];
        binding.f70220t.getLocationOnScreen(iArr);
        int i = iArr[1];
        return new int[]{i, i + binding.f70220t.getHeight()};
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 5544) {
            boolean z = false;
            if (intent != null && intent.getBooleanExtra("PROFILE_UPDATED", false)) {
                z = true;
            }
            if (z && this._binding != null) {
                loadAvatar();
            }
        }
    }

    @C41452l
    public final void onAvatarChangeEvent(AvatarChangeEvent avatarChangeEvent) {
        C41536l.m120489i(avatarChangeEvent, "event");
        C27464x3 binding = getBinding();
        if (binding != null && avatarChangeEvent.getState() == 20) {
            ButtonListLargeView buttonListLargeView = binding.f70221u;
            File file = avatarChangeEvent.getFile();
            C41536l.m120488h(file, "event.file");
            buttonListLargeView.mo34924o(file, C10320i.f28663F3);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this._binding = C27464x3.m85165d(getLayoutInflater(), viewGroup, false);
        CoordinatorLayout c = getBinding().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mEventBus.mo96186s(this);
        this._binding = null;
    }

    @C41452l
    public final void onNotificationsCount(NotificationCountEvent notificationCountEvent2) {
        C41536l.m120489i(notificationCountEvent2, "event");
        this.notificationCountEvent = notificationCountEvent2;
        MenuClickableListItem menuClickableListItem = this.notificationItem;
        if (menuClickableListItem == null) {
            C41536l.m120506z("notificationItem");
            menuClickableListItem = null;
        }
        setNotificationCount(menuClickableListItem);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        C41438c cVar = this.mEventBus;
        C41536l.m120488h(cVar, "mEventBus");
        C32343x.m95423W0(cVar, this);
        setUserInfo();
        fillSections1();
        fillSection2$default(this, false, 1, (Object) null);
        fillSection3();
        initLogout();
        observeData();
    }

    public final void setAuthHelper(C36728a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.authHelper = aVar;
    }

    public final void setGetAppSettingByNameUseCase(C20292b bVar) {
        C41536l.m120489i(bVar, "<set-?>");
        this.getAppSettingByNameUseCase = bVar;
    }

    public final void setGetReferalBannerInfoUseCase(C28109a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.getReferalBannerInfoUseCase = aVar;
    }
}
