package q31;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1619q;
import b21.C31108b;
import be0.C19374c;
import bz0.C31226f;
import c90.C19567d;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import d31.C31522b;
import es0.C31772c;
import h00.C24846c;
import h00.C24849e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import jk0.C25465c;
import ko0.C16521c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ml0.C26252e;
import ml0.C26254g;
import p313x7.C8972a;
import p341ge.bog.mobilebank.autoliabilityinsurance.presentation.AutoLiabilityInsuranceActivity;
import p341ge.bog.mobilebank.bnpl.presentation.application.BnplApplicationResultActivity;
import p341ge.bog.mobilebank.bnpl.presentation.details.BnplDetailsActivity;
import p341ge.bog.mobilebank.bnpl.presentation.offers.details.BnplOfferDetailsActivity;
import p341ge.bog.mobilebank.bnpl.presentation.welcome.BnplWelcomeActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardApplicationTypesActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.CardOrderListActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.activity.instantcards.ActivateInstantCardActivity;
import p341ge.bog.mobilebank.cardapplications.presentation.model.CardApplicationTypeData;
import p341ge.bog.mobilebank.cardproducts.presentation.carddetail.CardsDetailActivity;
import p341ge.bog.mobilebank.categorypackages.presentation.CategoryPackagesActivity;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittanceproviders.MoneyTransferProviderListActivity;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.MoreFragment;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.settings.presentation.EditProfileActivity2;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.activity.ClaFirstStageActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.documentsupload.DocumentsUploadActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.limitinfo.ClientLimitInfoActivity;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.result.LimitResultActivity;
import p341ge.bog.mobilebank.ddsto.presentation.ddform.DDFormActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.CombinedOfferActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.deposittypes.activity.DepositTypesActivity;
import p341ge.bog.mobilebank.deposits.presentation.activity.DepositDetailsActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.landing.GTActivity;
import p341ge.bog.mobilebank.galtandtaggart.presentation.parameters.GTParametersInvestmentAccountActivity;
import p341ge.bog.mobilebank.giftcards.presentation.C24054a;
import p341ge.bog.mobilebank.googlepay.presentation.actionsheet.GooglePlayActionSheet;
import p341ge.bog.mobilebank.insurance.presentation.InsurancePolicesActivity;
import p341ge.bog.mobilebank.insurance.travelinsurance.presentation.TravelInsuranceActivity;
import p341ge.bog.mobilebank.junior.presentation.activity.JuniorActivity;
import p341ge.bog.mobilebank.kyc.presentation.KycActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.chooser.LifestyleChooserActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.home.C15000a;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOfferDetailedActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.offer.activity.LifestyleOffersByCategoryActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.LifestyleOffersProgressActivity;
import p341ge.bog.mobilebank.lifestyleoffers.presentation.progress.progresslist.OffersProgressDetailActivity;
import p341ge.bog.mobilebank.linksharing.presentation.P2PLinkActivity;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.LoanActivationActivity;
import p341ge.bog.mobilebank.loanactivation.presentation.subtypes.LoanSubtypesActivity;
import p341ge.bog.mobilebank.loanoffers.presentation.activity.SecuredLoanActivity;
import p341ge.bog.mobilebank.loans.presentation.LoansActivity;
import p341ge.bog.mobilebank.loans.presentation.LoansFlow;
import p341ge.bog.mobilebank.loans.presentation.loancancelation.actionsheet.InstallmentReversalCancelData;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CasDetailsActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreateCasActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.CreatePiggyBankActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.PlusPointsTransferActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusActivity;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.piggybank.PiggyBankDetailsActivity;
import p341ge.bog.mobilebank.loyaltyprogress.presentation.activity.LoyaltyProgressActivity;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.nbo.presentation.activity.NboNavigatorActivity;
import p341ge.bog.mobilebank.p2p.presentation.P2PActivity;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.activities.STOTypeListActivity;
import p341ge.bog.mobilebank.p975ui.activities.SmsNotifManagerActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.payments.presentation.categories.PaymentProvidersActivity;
import p341ge.bog.mobilebank.payments.presentation.formpage.PaymentFormActivity;
import p341ge.bog.mobilebank.products.presentation.addnewproduct.AddNewProductActivity;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.cardinsurance.activity.CardInsuranceStatusesActivity;
import p341ge.bog.mobilebank.products.presentation.details.creditcard.CreditCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.debitcard.DebitCardDetailsActivity;
import p341ge.bog.mobilebank.products.presentation.details.list.LoanListActivity;
import p341ge.bog.mobilebank.products.presentation.details.list.ProductListActivity;
import p341ge.bog.mobilebank.products.presentation.details.pension.PensionDetailsActivity;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.QrWithdrawalActivity;
import p341ge.bog.mobilebank.releasenotes.presentation.ReleaseNotesActivity;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.settings.presentation.activity.ChangeLanguageActivity;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p341ge.bog.mobilebank.stories.presentation.activity.StoryGroupActivity;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p341ge.bog.mobilebank.transfers.other_transfer_type.OtherTransferTypeListActivity;
import p341ge.bog.mobilebank.transportcard.presentation.TransportCardActivity;
import p50.C27236b;
import p552on.C17271d;
import p647vm.C18421c;
import p648vn.C18443d;
import p675xn.C18839c;
import p689yn.C18961d;
import p725cr.C19788a;
import p769gr.C24776a;
import p779hr.C25052b;
import q31.C38122f;
import q70.C27685a;
import t51.C38660f;
import t51.C38686x;
import ue1.C43075l;
import ue1.C43079p;
import uk0.C28808h;
import w21.C39511c;
import w51.C39565o;
import xz0.C39968f;
import yd0.C30003b;

/* renamed from: q31.b */
public final class C38117b implements C38122f {

    /* renamed from: a */
    public static final C38118a f91532a = new C38118a((DefaultConstructorMarker) null);

    /* renamed from: q31.b$a */
    public static final class C38118a {
        private C38118a() {
        }

        public /* synthetic */ C38118a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d1 */
    public static final void m111979d1(C43075l lVar, String str, Bundle bundle) {
        C41536l.m120489i(lVar, "$onResult");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        String string = bundle.getString("RS_ENCODED_CONTRACT");
        if (string != null) {
            lVar.invoke(string);
        }
    }

    /* renamed from: A */
    public void mo91538A(Context context, String str, String str2, boolean z) {
        C41536l.m120489i(context, "context");
        GTActivity.f61292M.mo60258b(context, str, str2, z);
    }

    /* renamed from: A0 */
    public void mo91539A0(Context context, long j) {
        C41536l.m120489i(context, "context");
        CreateCasActivity.f80671K.mo74711a(context, j);
    }

    /* renamed from: B */
    public void mo91540B(Context context, JuniorRequestDataUiModel juniorRequestDataUiModel, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, boolean z) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(navigatorConstants$JuniorFlow, "flow");
        JuniorActivity.f63514J.mo63021a(context, juniorRequestDataUiModel, navigatorConstants$JuniorFlow, z);
    }

    /* renamed from: B0 */
    public void mo91541B0(C24846c cVar, Context context) {
        C41536l.m120489i(cVar, "status");
        C41536l.m120489i(context, "context");
        BnplApplicationResultActivity.f40992J.mo38121a(cVar, context);
    }

    /* renamed from: C */
    public void mo91542C(Context context) {
        C41536l.m120489i(context, "context");
        EditProfileActivity2.f59595H.mo55694a(context);
    }

    /* renamed from: C0 */
    public void mo91543C0(Context context, String str, String str2, OfferProductCode offerProductCode) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str2, "operationType");
        C41536l.m120489i(offerProductCode, "productCode");
        LoanActivationActivity.f79851H.mo73160a(context, str, str2, offerProductCode);
    }

    /* renamed from: D */
    public void mo91544D(Context context, String str, boolean z) {
        C38122f.C38123a.m112221q(this, context, str, z);
    }

    /* renamed from: D0 */
    public void mo91545D0(Context context, long j) {
        C41536l.m120489i(context, "context");
        LifestyleOfferDetailedActivity.f43256J.mo41989a(context, j);
    }

    /* renamed from: E */
    public void mo91546E(Context context, long j) {
        C41536l.m120489i(context, "context");
        CreditCardDetailsActivity.f82501O.mo82091a(context, j);
    }

    /* renamed from: E0 */
    public void mo91547E0(Context context) {
        C41536l.m120489i(context, "context");
        context.startActivity(new Intent(context, KycActivity.class));
    }

    /* renamed from: F */
    public void mo91548F(Context context) {
        C41536l.m120489i(context, "context");
        context.startActivity(new Intent(context, STOTypeListActivity.class));
    }

    /* renamed from: F0 */
    public void mo91549F0(String str, FragmentManager fragmentManager, C1619q qVar, C43075l lVar) {
        C41536l.m120489i(str, "limitType");
        C41536l.m120489i(fragmentManager, "manager");
        C41536l.m120489i(qVar, "lifecycleOwner");
        C41536l.m120489i(lVar, "onResult");
        fragmentManager.mo4367F1("ClaContractActionSheet_REQUEST_KEY", qVar, new C38116a(lVar));
        C19567d.f53868P.mo47801a(str).mo4576A1(fragmentManager, (String) null);
    }

    /* renamed from: G */
    public void mo91550G(Context context, Long l, boolean z) {
        C41536l.m120489i(context, "context");
        StoryGroupActivity.f84032L.mo84996a(context, l, z);
    }

    /* renamed from: G0 */
    public void mo91551G0(Context context, long j, C0173b bVar) {
        C41536l.m120489i(context, "context");
        DepositDetailsActivity.f60610R.mo57767a(context, j, bVar);
    }

    /* renamed from: H */
    public void mo91552H(Context context, String str) {
        C41536l.m120489i(context, "context");
        InsurancePolicesActivity.f63149L.mo62454a(context, str);
    }

    /* renamed from: H0 */
    public void mo91553H0(Context context, Long l) {
        C41536l.m120489i(context, "context");
        CardApplicationTypesActivity.f41365L.mo39070b(context, l);
    }

    /* renamed from: I */
    public void mo91554I(long j, FragmentManager fragmentManager) {
        C38122f.C38123a.m112210f(this, j, fragmentManager);
    }

    /* renamed from: I0 */
    public void mo91555I0(Context context, long j, boolean z) {
        C41536l.m120489i(context, "context");
        DebitCardDetailsActivity.f82717P.mo82285a(context, j, z);
    }

    /* renamed from: J */
    public void mo91556J(Context context, String str, long j, String str2, String str3, String str4, ArrayList arrayList, boolean z) {
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        String str5 = str;
        C41536l.m120489i(str5, "loanName");
        String str6 = str2;
        C41536l.m120489i(str6, "loanCcy");
        String str7 = str3;
        C41536l.m120489i(str7, "loanProdType");
        String str8 = str4;
        C41536l.m120489i(str8, "status");
        ArrayList arrayList2 = arrayList;
        C41536l.m120489i(arrayList2, "repaymentAccounts");
        LoansActivity.f80199J.mo74020a(context2, new LoansFlow.Repayment(str5, j, str6, str7, str8, arrayList2, z, false, 128, (DefaultConstructorMarker) null));
    }

    /* renamed from: J0 */
    public Fragment mo91557J0(Long l) {
        return C38686x.f92575o.mo92336a(l);
    }

    /* renamed from: K */
    public void mo91558K(Context context) {
        C41536l.m120489i(context, "context");
        BnplWelcomeActivity.f41273K.mo38338a(context);
    }

    /* renamed from: K0 */
    public void mo91559K0(long j, String str, FragmentManager fragmentManager) {
        C38122f.C38123a.m112209e(this, j, str, fragmentManager);
    }

    /* renamed from: L */
    public void mo91560L(String str, String str2, Context context) {
        C41536l.m120489i(str, "ed");
        C41536l.m120489i(str2, "aid");
        C41536l.m120489i(context, "context");
        QrWithdrawalActivity.f83339J.mo82866a(str, str2, context);
    }

    /* renamed from: L0 */
    public void mo91561L0(long j, String str, Context context) {
        C41536l.m120489i(context, "context");
        BnplOfferDetailsActivity.f41206K.mo38294a(j, str, context);
    }

    /* renamed from: M */
    public void mo91562M(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "appPackageName");
        Uri.Builder appendQueryParameter = Uri.parse("https://play.google.com/store/apps/details").buildUpon().appendQueryParameter("id", str).appendQueryParameter("launch", "true");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        context.startActivity(intent);
    }

    /* renamed from: M0 */
    public void mo91563M0(Context context, long j) {
        C41536l.m120489i(context, "context");
        PiggyBankDetailsActivity.f80822K.mo74837a(context, j);
    }

    /* renamed from: N */
    public void mo91564N(Context context, String str, boolean z) {
        C41536l.m120489i(context, "context");
        if (z) {
            MoneyTransferProviderListActivity.f57089L.mo53269b(context);
        } else {
            MoneyTransferProviderListActivity.f57089L.mo53268a(context, str);
        }
    }

    /* renamed from: N0 */
    public void mo91565N0(FragmentManager fragmentManager, String str, long j, boolean z, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str2) {
        FragmentManager fragmentManager2 = fragmentManager;
        C41536l.m120489i(fragmentManager, "manager");
        String str3 = str2;
        C41536l.m120489i(str3, "printNo");
        String str4 = str;
        C39565o.f94044X.mo93246b(j, z, l, l2, z2, z3, z4, str3).mo4576A1(fragmentManager, str);
    }

    /* renamed from: O */
    public void mo91566O(C35388f2 f2Var, String str, BigDecimal bigDecimal, String str2, String str3, String str4, boolean z) {
        C41536l.m120489i(f2Var, "activity");
        C41536l.m120489i(str, "status");
        String str5 = str4;
        C41536l.m120489i(str5, "applicationId");
        LimitResultActivity.C22680a.m73532c(LimitResultActivity.f59889L, f2Var, z, str, (String) null, str5, bigDecimal, str2, str3, 8, (Object) null);
    }

    /* renamed from: O0 */
    public void mo91567O0(Context context, int i) {
        C41536l.m120489i(context, "context");
        OffersProgressDetailActivity.f43328K.mo42039a(context, i);
    }

    /* renamed from: P */
    public void mo91568P(Context context, String str, String str2, C0173b bVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "amexAmount");
        C41536l.m120489i(str2, "amexPoints");
        ExchangeMrPointsToPlusActivity.f80760K.mo74783a(context, str, str2, bVar);
    }

    /* renamed from: P0 */
    public void mo91569P0(Context context, C0173b bVar) {
        C41536l.m120489i(context, "context");
        ActivateInstantCardActivity.f41492L.mo39173a(context, bVar);
    }

    /* renamed from: Q */
    public void mo91570Q(Context context, C26252e eVar, C0173b bVar) {
        C41536l.m120489i(context, "context");
        AutoLiabilityInsuranceActivity.f40659K.mo37452a(context, eVar, bVar);
    }

    /* renamed from: Q0 */
    public void mo91571Q0(Context context, C0173b bVar, String str, List list) {
        C41536l.m120489i(context, "context");
        CardOrderListActivity.C13998a.m52073b(CardOrderListActivity.f41389O, context, new CardApplicationTypeData.StandardCardData(str, (StringSource) null, 2, (DefaultConstructorMarker) null), bVar, list, false, false, 48, (Object) null);
    }

    /* renamed from: R */
    public void mo91572R(Context context, String str) {
        C38122f.C38123a.m112220p(this, context, str);
    }

    /* renamed from: R0 */
    public void mo91573R0(Context context) {
        C41536l.m120489i(context, "context");
        ChangeLanguageActivity.f83571J.mo84099a(context);
    }

    /* renamed from: S */
    public void mo91574S(Context context, long j) {
        C41536l.m120489i(context, "context");
        CasDetailsActivity.f80644M.mo74687b(context, j);
    }

    /* renamed from: S0 */
    public void mo91575S0(Context context, C0173b bVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(bVar, "launcher");
        PensionDetailsActivity.f83120I.mo82625a(context, bVar);
    }

    /* renamed from: T */
    public void mo91576T(long j, FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "manager");
        C17271d.f48553O.mo44672a(j).mo4576A1(fragmentManager, str);
    }

    /* renamed from: T0 */
    public void mo91577T0(Activity activity, int i) {
        C41536l.m120489i(activity, "activity");
        C8972a.m33242a(activity).mo21125c(activity, i);
    }

    /* renamed from: U */
    public void mo91578U(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        PaymentFormActivity.f82132c0.mo80357a(str, "", context);
    }

    /* renamed from: U0 */
    public void mo91579U0(Context context) {
        C41536l.m120489i(context, "context");
        SmsNotifManagerActivity.m104811Y2(context);
    }

    /* renamed from: V */
    public C19788a mo91580V(Long l) {
        return GooglePlayActionSheet.f62988P.mo62168a(l);
    }

    /* renamed from: V0 */
    public C19788a mo91581V0() {
        return C31522b.f78084M.mo71930a();
    }

    /* renamed from: W */
    public C19788a mo91582W(DigitalCardInfo digitalCardInfo) {
        C41536l.m120489i(digitalCardInfo, "cardInfo");
        return C18839c.f52652J.mo46800a(digitalCardInfo);
    }

    /* renamed from: W0 */
    public void mo91583W0(Context context) {
        C41536l.m120489i(context, "context");
        PlusPointsTransferActivity.f80719I.mo74755a(context);
    }

    /* renamed from: X */
    public void mo91584X(long j, String str, FragmentManager fragmentManager, String str2) {
        C41536l.m120489i(str, "lastFour");
        C41536l.m120489i(fragmentManager, "manager");
        C18443d.f51902O.mo46229a(j, str).mo4576A1(fragmentManager, str2);
    }

    /* renamed from: X0 */
    public C1483c mo91585X0(ExpiringCardPopUpData expiringCardPopUpData) {
        C41536l.m120489i(expiringCardPopUpData, "data");
        return C18421c.f51875D.mo46213a(expiringCardPopUpData);
    }

    /* renamed from: Y */
    public void mo91586Y(Context context) {
        C41536l.m120489i(context, "context");
        CardOrderListActivity.C13998a.m52073b(CardOrderListActivity.f41389O, context, new CardApplicationTypeData.WishCardData((StringSource) null, 1, (DefaultConstructorMarker) null), (C0173b) null, (List) null, false, false, 60, (Object) null);
    }

    /* renamed from: Y0 */
    public void mo91587Y0(Context context, long j) {
        C41536l.m120489i(context, "context");
        BnplDetailsActivity.f41053L.mo38165a(context, j);
    }

    /* renamed from: Z */
    public void mo91588Z(Context context, C27685a aVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(aVar, "productType");
        ProductListActivity.f83035L.mo82561a(context, aVar);
    }

    /* renamed from: Z0 */
    public void mo91589Z0(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C38122f.C38123a.m112230z(this, context, z, z2, z3, z4, z5);
    }

    /* renamed from: a */
    public void mo91590a(Context context) {
        C41536l.m120489i(context, "context");
        ClaFirstStageActivity.f59670J.mo55979a(context);
    }

    /* renamed from: a0 */
    public C25052b mo91591a0(C24776a aVar, C43079p pVar, C43075l lVar) {
        C41536l.m120489i(aVar, "commonPopup");
        C41536l.m120489i(pVar, "positiveButtonListener");
        C41536l.m120489i(lVar, "dismissListener");
        return C39511c.f93958a.mo93146c(aVar, pVar, lVar);
    }

    /* renamed from: a1 */
    public void mo91592a1(Context context, String str, String str2, boolean z) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "analyticsLabel2");
        PaymentProvidersActivity.f82016I.mo80201a(context, str, str2, z);
    }

    /* renamed from: b */
    public void mo91593b(Context context, long j) {
        C41536l.m120489i(context, "context");
        DebitCardDetailsActivity.C34008a.m100114b(DebitCardDetailsActivity.f82717P, context, j, false, 4, (Object) null);
    }

    /* renamed from: b0 */
    public void mo91594b0(Context context, String str, String str2, boolean z) {
        C41536l.m120489i(context, "context");
        CardApplicationTypesActivity.f41365L.mo39069a(context, str, str2, z);
    }

    /* renamed from: b1 */
    public void mo91595b1(Context context, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, String str2, long j, BigDecimal bigDecimal5, String str3) {
        Context context2 = context;
        C41536l.m120489i(context, "context");
        BigDecimal bigDecimal6 = bigDecimal;
        C41536l.m120489i(bigDecimal6, "principal");
        BigDecimal bigDecimal7 = bigDecimal2;
        C41536l.m120489i(bigDecimal7, "currentIntAmount");
        BigDecimal bigDecimal8 = bigDecimal3;
        C41536l.m120489i(bigDecimal8, "penalty");
        String str4 = str;
        C41536l.m120489i(str4, "accountNo");
        BigDecimal bigDecimal9 = bigDecimal4;
        C41536l.m120489i(bigDecimal9, "availableAmount");
        String str5 = str2;
        C41536l.m120489i(str5, "ccy");
        BigDecimal bigDecimal10 = bigDecimal5;
        C41536l.m120489i(bigDecimal10, "amount");
        String str6 = str3;
        C41536l.m120489i(str6, "productDictionaryKey");
        LoansActivity.f80199J.mo74020a(context, new LoansFlow.PawnLoanPayment(bigDecimal6, bigDecimal7, bigDecimal8, str4, bigDecimal9, str5, j, bigDecimal10, str6));
    }

    /* renamed from: c */
    public void mo91596c(Context context) {
        C41536l.m120489i(context, "context");
        LifestyleChooserActivity.C14960a.m54871b(LifestyleChooserActivity.f43144J, context, (C0173b) null, 2, (Object) null);
    }

    /* renamed from: c0 */
    public void mo91597c0(Context context) {
        C38122f.C38123a.m112218n(this, context);
    }

    /* renamed from: d */
    public void mo91598d(Context context, ArrayList arrayList, String str, String str2, String str3, OfferProductCode offerProductCode) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(arrayList, "offers");
        C41536l.m120489i(str, "limitId");
        C41536l.m120489i(str3, "effectiveRate");
        C41536l.m120489i(offerProductCode, "productCode");
        LoanSubtypesActivity.f80114L.mo73563a(context, arrayList, str, str2, str3, offerProductCode);
    }

    /* renamed from: d0 */
    public void mo91599d0(Context context, String str, String str2) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "productCode");
        SecuredLoanActivity.f80143L.mo73670a(context, str, str2);
    }

    /* renamed from: e */
    public void mo91600e(Context context, Bundle bundle) {
        C41536l.m120489i(context, "context");
        ReleaseNotesActivity.f83456J.mo83039a(context, bundle);
    }

    /* renamed from: e0 */
    public void mo91601e0(Context context, Application application, boolean z) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(application, "application");
        DocumentsUploadActivity.f59725N.mo56021a(context, application, z);
    }

    /* renamed from: f */
    public void mo91602f(Context context, String str) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(str, "passType");
        TransportCardActivity.f84444G.mo85813a(context, str);
    }

    /* renamed from: f0 */
    public void mo91603f0(Context context, BigDecimal bigDecimal, String str, String str2, Integer num, Long l, boolean z, Long l2, BigDecimal bigDecimal2, boolean z2, String str3, Long l3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, String str5, int i) {
        Context context2 = context;
        Context context3 = context2;
        C41536l.m120489i(context2, "context");
        CombinedOfferActivity.C22845a aVar = CombinedOfferActivity.f60203H;
        aVar.mo56924a(context2, bigDecimal, str, str2, num, l, z, l2, bigDecimal2, z2, str3, l3, bigDecimal3, i, bigDecimal4, str4, str5);
    }

    /* renamed from: g */
    public C1483c mo91604g() {
        return C25465c.f65123A.mo64035a();
    }

    /* renamed from: g0 */
    public void mo91605g0(Context context, P2PFlowType p2PFlowType) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(p2PFlowType, "p2pFlowType");
        P2PActivity.f81720H.mo79434a(context, p2PFlowType);
    }

    /* renamed from: h */
    public void mo91606h(Context context, long j) {
        C38122f.C38123a.m112224t(this, context, j);
    }

    /* renamed from: h0 */
    public void mo91607h0(Context context) {
        C41536l.m120489i(context, "context");
        AddNewProductActivity.f82385J.mo81968a(context);
    }

    /* renamed from: i */
    public C35651n1 mo91608i(boolean z) {
        return C15000a.f43228j.mo41973a(z);
    }

    /* renamed from: i0 */
    public void mo91609i0(Context context, long j) {
        C41536l.m120489i(context, "context");
        CasDetailsActivity.f80644M.mo74686a(context, j);
    }

    /* renamed from: j */
    public void mo91610j(String str, String str2, Context context) {
        C41536l.m120489i(str, IRetrofitService.SERVICE_ID);
        C41536l.m120489i(str2, "pageName");
        C41536l.m120489i(context, "context");
        DDFormActivity.f59994Y.mo56477a(str, str2, context);
    }

    /* renamed from: j0 */
    public void mo91611j0(Context context, String str) {
        C41536l.m120489i(context, "context");
        DepositTypesActivity.f60461I.mo57195a(context, str);
    }

    /* renamed from: k */
    public C19788a mo91612k(Long l, List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel) {
        C41536l.m120489i(list, "insuranceList");
        return C31226f.f77593O.mo71480a(l, list, debitCardInsuranceTypeUiModel);
    }

    /* renamed from: k0 */
    public void mo91613k0(Context context) {
        C41536l.m120489i(context, "context");
        P2PLinkActivity.f43406L.mo42149a(context);
    }

    /* renamed from: l */
    public void mo91614l(Context context, C26254g gVar, C0173b bVar) {
        C41536l.m120489i(context, "context");
        TravelInsuranceActivity.f63219G.mo62642a(context, gVar, bVar);
    }

    /* renamed from: l0 */
    public void mo91615l0(Context context) {
        C41536l.m120489i(context, "context");
        LifestyleOffersProgressActivity.C15063b.m55194b(LifestyleOffersProgressActivity.f43312K, context, (C16521c) null, 2, (Object) null);
    }

    /* renamed from: m */
    public void mo91616m(PackageType packageType, boolean z, String str, Context context, C0173b bVar) {
        C41536l.m120489i(context, "context");
        CategoryPackagesActivity.f42161H.mo40562a(context, packageType, z, str, bVar);
    }

    /* renamed from: m0 */
    public void mo91617m0(Context context, String str, Bundle bundle) {
        C41536l.m120489i(context, "context");
        Intent flags = new Intent(context, MainActivity.class).setFlags(872415232);
        if (str != null) {
            flags.setAction(str);
        }
        if (bundle != null) {
            flags.putExtras(bundle);
        }
        C41536l.m120488h(flags, "Intent(context, MainActi…xtras(params) }\n        }");
        context.startActivity(flags);
    }

    /* renamed from: n */
    public void mo91618n(Context context) {
        C41536l.m120489i(context, "context");
        CardInsuranceStatusesActivity.f82463J.mo82043a(context);
    }

    /* renamed from: n0 */
    public void mo91619n0(Activity activity) {
        C38122f.C38123a.m112214j(this, activity);
    }

    /* renamed from: o */
    public C1483c mo91620o(C30003b bVar) {
        C41536l.m120489i(bVar, "data");
        return C19374c.f53604u.mo47587a(bVar);
    }

    /* renamed from: o0 */
    public Fragment mo91621o0(boolean z) {
        return MoreFragment.Companion.newInstance(z);
    }

    /* renamed from: p */
    public void mo91622p(Context context, long j) {
        C41536l.m120489i(context, "context");
        LifestyleOffersByCategoryActivity.C15033a.m55134b(LifestyleOffersByCategoryActivity.f43273L, context, j, false, 4, (Object) null);
    }

    /* renamed from: p0 */
    public C1483c mo91623p0(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel) {
        C41536l.m120489i(liabilityOverdueInfoUiModel, "data");
        return C39968f.f94958B.mo93806a(liabilityOverdueInfoUiModel);
    }

    /* renamed from: q */
    public void mo91624q(long j, Context context) {
        C41536l.m120489i(context, "context");
        CardInsuranceDetailsActivity.f82437K.mo82019a(j, context);
    }

    /* renamed from: q0 */
    public void mo91625q0(Context context, long j, C0173b bVar) {
        C41536l.m120489i(context, "context");
        CardsDetailActivity.f41939V.mo40039a(context, j, bVar);
    }

    /* renamed from: r */
    public void mo91626r(Context context) {
        C41536l.m120489i(context, "context");
        LoyaltyProgressActivity.f81225K.mo75395a(context);
    }

    /* renamed from: r0 */
    public Fragment mo91627r0(boolean z) {
        return C28808h.f73635k.mo68543a(z);
    }

    /* renamed from: s */
    public void mo91628s(Activity activity, long j) {
        C41536l.m120489i(activity, "activity");
        NboNavigatorActivity.f81390K.mo78929a(activity, j);
    }

    /* renamed from: s0 */
    public C1483c mo91629s0(boolean z) {
        return C31108b.f77312v.mo71319a(z);
    }

    /* renamed from: t */
    public void mo91630t(Context context) {
        C41536l.m120489i(context, "context");
        LoanListActivity.f83008K.mo82543a(context);
    }

    /* renamed from: t0 */
    public void mo91631t0(Context context) {
        C41536l.m120489i(context, "context");
        CardOrderListActivity.C13998a.m52073b(CardOrderListActivity.f41389O, context, CardApplicationTypeData.VisaConciergeCardOrderData.f41627f, (C0173b) null, (List) null, false, false, 60, (Object) null);
    }

    /* renamed from: u */
    public void mo91632u(Context context, OtherTransferTypeState otherTransferTypeState) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(otherTransferTypeState, "otherTransferTypeState");
        OtherTransferTypeListActivity.f84353M.mo85457a(context, otherTransferTypeState);
    }

    /* renamed from: u0 */
    public C35651n1 mo91633u0(boolean z) {
        return C24054a.f62399l.mo61566a(z);
    }

    /* renamed from: v */
    public void mo91634v(long j, FragmentManager fragmentManager, String str) {
        C41536l.m120489i(fragmentManager, "manager");
        C18961d.C18962a.m64080b(C18961d.f52968O, j, false, 2, (Object) null).mo4576A1(fragmentManager, str);
    }

    /* renamed from: v0 */
    public C19788a mo91635v0(long j, String str, String str2) {
        C41536l.m120489i(str, "prodType");
        C41536l.m120489i(str2, "loanTypeText");
        return C31772c.f78388O.mo72216a(new InstallmentReversalCancelData(j, str, str2));
    }

    /* renamed from: w */
    public void mo91636w(String str, FragmentManager fragmentManager, String str2) {
        C41536l.m120489i(str, C11769i.C11770a.f34149l);
        C41536l.m120489i(fragmentManager, "manager");
        C27236b.f68247I.mo66514a(str).mo4576A1(fragmentManager, str2);
    }

    /* renamed from: w0 */
    public void mo91637w0(C24849e eVar, Context context) {
        C41536l.m120489i(eVar, "limitInfoPage");
        C41536l.m120489i(context, "context");
        ClientLimitInfoActivity.f59777R.mo56053a(eVar.mo63283b(), eVar.mo63290n(), eVar.mo63291o(), eVar.mo63289l(), eVar.mo63287g(), eVar.mo63292q(), eVar.mo63285e(), eVar.mo63286f(), eVar.mo63284c(), eVar.mo63288h(), context);
    }

    /* renamed from: x */
    public void mo91638x(Context context) {
        C41536l.m120489i(context, "context");
        GTParametersInvestmentAccountActivity.f61668H.mo60526a(context);
    }

    /* renamed from: x0 */
    public void mo91639x0(Context context, Long l, Integer num) {
        C41536l.m120489i(context, "context");
        LoansActivity.f80199J.mo74020a(context, new LoansFlow.Details(l, num));
    }

    /* renamed from: y */
    public void mo91640y(Long l, Long l2, Integer num, FragmentManager fragmentManager) {
        C41536l.m120489i(fragmentManager, "manager");
        C38660f.f92525R.mo92307c(l, l2, num).mo4576A1(fragmentManager, (String) null);
    }

    /* renamed from: y0 */
    public void mo91641y0(Context context, DDSTO ddsto) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(ddsto, "sto");
        TransferForm.startWith(context, "STO", TransferForm.OPERATION_VIEW).setSto(ddsto).start();
    }

    /* renamed from: z */
    public void mo91642z(Context context) {
        C41536l.m120489i(context, "context");
        CreatePiggyBankActivity.f80696I.mo74736a(context);
    }

    /* renamed from: z0 */
    public void mo91643z0(long j, FragmentManager fragmentManager) {
        C38122f.C38123a.m112208d(this, j, fragmentManager);
    }
}
