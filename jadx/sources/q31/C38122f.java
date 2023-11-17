package q31;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.activity.result.C0173b;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1619q;
import com.salesforce.marketingcloud.C11398b;
import h00.C24846c;
import h00.C24849e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import ml0.C26252e;
import ml0.C26254g;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.mainactivity.model.ExpiringCardPopUpData;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.cleanarch.presentation.liabilityoverdue.liabilityinfo.LiabilityOverdueInfoUiModel;
import p341ge.bog.mobilebank.model.Application;
import p341ge.bog.mobilebank.model.cards.DigitalCardInfo;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.activities.MapActivity;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.shared.OtherTransferTypeState;
import p341ge.bog.mobilebank.shared.P2PFlowType;
import p341ge.bog.mobilebank.shared.navigation.NavigatorConstants$JuniorFlow;
import p725cr.C19788a;
import p769gr.C24776a;
import p779hr.C25052b;
import q70.C27685a;
import ue1.C43075l;
import ue1.C43079p;
import yd0.C30003b;

/* renamed from: q31.f */
public interface C38122f {

    /* renamed from: q31.f$a */
    public static final class C38123a {
        /* renamed from: A */
        public static /* synthetic */ void m112200A(C38122f fVar, Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, Object obj) {
            if (obj == null) {
                boolean z6 = false;
                boolean z7 = (i & 2) != 0 ? false : z;
                boolean z8 = (i & 4) != 0 ? false : z2;
                boolean z9 = (i & 8) != 0 ? false : z3;
                boolean z12 = (i & 16) != 0 ? false : z4;
                if ((i & 32) == 0) {
                    z6 = z5;
                }
                fVar.mo91589Z0(context, z7, z8, z9, z12, z6);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startMapActivity");
        }

        /* renamed from: B */
        public static /* synthetic */ void m112201B(C38122f fVar, Context context, String str, String str2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                fVar.mo91592a1(context, str, str2, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startPaymentProviderListActivity");
        }

        /* renamed from: C */
        public static /* synthetic */ void m112202C(C38122f fVar, Context context, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    z = false;
                }
                fVar.mo91564N(context, str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startRemittanceProvidersActivity");
        }

        /* renamed from: D */
        public static /* synthetic */ void m112203D(C38122f fVar, Context context, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = "";
                }
                fVar.mo91602f(context, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTransportCardActivity");
        }

        /* renamed from: E */
        public static /* synthetic */ void m112204E(C38122f fVar, Context context, C26254g gVar, C0173b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    gVar = null;
                }
                if ((i & 4) != 0) {
                    bVar = null;
                }
                fVar.mo91614l(context, gVar, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTravelInsuranceActivity");
        }

        /* renamed from: a */
        public static /* synthetic */ C19788a m112205a(C38122f fVar, Long l, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    l = null;
                }
                return fVar.mo91580V(l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getGooglePayActionSheet");
        }

        /* renamed from: b */
        public static /* synthetic */ Fragment m112206b(C38122f fVar, Long l, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    l = null;
                }
                return fVar.mo91557J0(l);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStatementsFragment");
        }

        /* renamed from: c */
        public static /* synthetic */ void m112207c(C38122f fVar, Context context, long j, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                fVar.mo91555I0(context, j, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openAccountDetails");
        }

        /* renamed from: d */
        public static void m112208d(C38122f fVar, long j, FragmentManager fragmentManager) {
            C41536l.m120489i(fragmentManager, "manager");
            fVar.mo91576T(j, fragmentManager, (String) null);
        }

        /* renamed from: e */
        public static void m112209e(C38122f fVar, long j, String str, FragmentManager fragmentManager) {
            C41536l.m120489i(str, "lastFour");
            C41536l.m120489i(fragmentManager, "manager");
            fVar.mo91584X(j, str, fragmentManager, (String) null);
        }

        /* renamed from: f */
        public static void m112210f(C38122f fVar, long j, FragmentManager fragmentManager) {
            C41536l.m120489i(fragmentManager, "manager");
            fVar.mo91634v(j, fragmentManager, (String) null);
        }

        /* renamed from: g */
        public static /* synthetic */ void m112211g(C38122f fVar, Context context, long j, C0173b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    bVar = null;
                }
                fVar.mo91625q0(context, j, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openCardsDetailActivity");
        }

        /* renamed from: h */
        public static /* synthetic */ void m112212h(C38122f fVar, String str, FragmentManager fragmentManager, C1619q qVar, C43075l lVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = "";
                }
                fVar.mo91549F0(str, fragmentManager, qVar, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openClaContractActionSheet");
        }

        /* renamed from: i */
        public static /* synthetic */ void m112213i(C38122f fVar, FragmentManager fragmentManager, String str, long j, boolean z, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str2, int i, Object obj) {
            String str3;
            long j2;
            boolean z5;
            Long l3;
            boolean z6;
            boolean z7;
            String str4;
            int i2 = i;
            if (obj == null) {
                Long l4 = null;
                if ((i2 & 2) != 0) {
                    str3 = null;
                } else {
                    str3 = str;
                }
                if ((i2 & 4) != 0) {
                    j2 = -1;
                } else {
                    j2 = j;
                }
                boolean z8 = false;
                if ((i2 & 8) != 0) {
                    z5 = false;
                } else {
                    z5 = z;
                }
                if ((i2 & 16) != 0) {
                    l3 = null;
                } else {
                    l3 = l;
                }
                if ((i2 & 32) == 0) {
                    l4 = l2;
                }
                if ((i2 & 64) != 0) {
                    z6 = false;
                } else {
                    z6 = z2;
                }
                if ((i2 & 128) == 0) {
                    z8 = z3;
                }
                if ((i2 & C11398b.f33139r) != 0) {
                    z7 = true;
                } else {
                    z7 = z4;
                }
                if ((i2 & C11398b.f33140s) != 0) {
                    str4 = "";
                } else {
                    str4 = str2;
                }
                fVar.mo91565N0(fragmentManager, str3, j2, z5, l3, l4, z6, z8, z7, str4);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: openStatementsActionSheet");
        }

        /* renamed from: j */
        public static void m112214j(C38122f fVar, Activity activity) {
            C41536l.m120489i(activity, "activity");
            fVar.mo91577T0(activity, 10037);
        }

        /* renamed from: k */
        public static /* synthetic */ void m112215k(C38122f fVar, Context context, String str, Bundle bundle, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    bundle = null;
                }
                fVar.mo91617m0(context, str, bundle);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: returnToHome");
        }

        /* renamed from: l */
        public static /* synthetic */ void m112216l(C38122f fVar, Context context, C0173b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    bVar = null;
                }
                fVar.mo91569P0(context, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startActivateInstantCardActivity");
        }

        /* renamed from: m */
        public static /* synthetic */ void m112217m(C38122f fVar, Context context, C26252e eVar, C0173b bVar, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    eVar = null;
                }
                if ((i & 4) != 0) {
                    bVar = null;
                }
                fVar.mo91570Q(context, eVar, bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startAutoLiabilityActivity");
        }

        /* renamed from: n */
        public static void m112218n(C38122f fVar, Context context) {
            C41536l.m120489i(context, "context");
            m112219o(fVar, context, (String) null, (String) null, false, 8, (Object) null);
        }

        /* renamed from: o */
        public static /* synthetic */ void m112219o(C38122f fVar, Context context, String str, String str2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                fVar.mo91594b0(context, str, str2, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCardApplicationTypesActivity");
        }

        /* renamed from: p */
        public static void m112220p(C38122f fVar, Context context, String str) {
            C41536l.m120489i(context, "context");
            fVar.mo91594b0(context, str, (String) null, false);
        }

        /* renamed from: q */
        public static void m112221q(C38122f fVar, Context context, String str, boolean z) {
            C41536l.m120489i(context, "context");
            fVar.mo91594b0(context, (String) null, str, z);
        }

        /* renamed from: r */
        public static /* synthetic */ void m112222r(C38122f fVar, Context context, String str, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    z = false;
                }
                fVar.mo91544D(context, str, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCardApplicationTypesActivityForSubProductCode");
        }

        /* renamed from: s */
        public static /* synthetic */ void m112223s(C38122f fVar, PackageType packageType, boolean z, String str, Context context, C0173b bVar, int i, Object obj) {
            if (obj == null) {
                PackageType packageType2 = (i & 1) != 0 ? null : packageType;
                if ((i & 2) != 0) {
                    z = false;
                }
                fVar.mo91616m(packageType2, z, (i & 4) != 0 ? null : str, context, (i & 16) != 0 ? null : bVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startCategoryPackagesActivity");
        }

        /* renamed from: t */
        public static void m112224t(C38122f fVar, Context context, long j) {
            C41536l.m120489i(context, "context");
            fVar.mo91551G0(context, j, (C0173b) null);
        }

        /* renamed from: u */
        public static /* synthetic */ void m112225u(C38122f fVar, Context context, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                fVar.mo91611j0(context, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startDepositTypesActivity");
        }

        /* renamed from: v */
        public static /* synthetic */ void m112226v(C38122f fVar, Context context, String str, String str2, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                if ((i & 4) != 0) {
                    str2 = null;
                }
                if ((i & 8) != 0) {
                    z = false;
                }
                fVar.mo91538A(context, str, str2, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startGTActivity");
        }

        /* renamed from: w */
        public static /* synthetic */ void m112227w(C38122f fVar, Context context, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    str = null;
                }
                fVar.mo91552H(context, str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startInsurancePolicesActivity");
        }

        /* renamed from: x */
        public static /* synthetic */ void m112228x(C38122f fVar, Context context, JuniorRequestDataUiModel juniorRequestDataUiModel, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 8) != 0) {
                    z = false;
                }
                fVar.mo91540B(context, juniorRequestDataUiModel, navigatorConstants$JuniorFlow, z);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startJuniorActivity");
        }

        /* renamed from: y */
        public static /* synthetic */ void m112229y(C38122f fVar, Context context, Long l, Integer num, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    l = null;
                }
                if ((i & 4) != 0) {
                    num = null;
                }
                fVar.mo91639x0(context, l, num);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startLoanDetails");
        }

        /* renamed from: z */
        public static void m112230z(C38122f fVar, Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
            C41536l.m120489i(context, "context");
            MapActivity.m104322u4(context, z, z2, z3, z4, z5);
        }
    }

    /* renamed from: A */
    void mo91538A(Context context, String str, String str2, boolean z);

    /* renamed from: A0 */
    void mo91539A0(Context context, long j);

    /* renamed from: B */
    void mo91540B(Context context, JuniorRequestDataUiModel juniorRequestDataUiModel, NavigatorConstants$JuniorFlow navigatorConstants$JuniorFlow, boolean z);

    /* renamed from: B0 */
    void mo91541B0(C24846c cVar, Context context);

    /* renamed from: C */
    void mo91542C(Context context);

    /* renamed from: C0 */
    void mo91543C0(Context context, String str, String str2, OfferProductCode offerProductCode);

    /* renamed from: D */
    void mo91544D(Context context, String str, boolean z);

    /* renamed from: D0 */
    void mo91545D0(Context context, long j);

    /* renamed from: E */
    void mo91546E(Context context, long j);

    /* renamed from: E0 */
    void mo91547E0(Context context);

    /* renamed from: F */
    void mo91548F(Context context);

    /* renamed from: F0 */
    void mo91549F0(String str, FragmentManager fragmentManager, C1619q qVar, C43075l lVar);

    /* renamed from: G */
    void mo91550G(Context context, Long l, boolean z);

    /* renamed from: G0 */
    void mo91551G0(Context context, long j, C0173b bVar);

    /* renamed from: H */
    void mo91552H(Context context, String str);

    /* renamed from: H0 */
    void mo91553H0(Context context, Long l);

    /* renamed from: I */
    void mo91554I(long j, FragmentManager fragmentManager);

    /* renamed from: I0 */
    void mo91555I0(Context context, long j, boolean z);

    /* renamed from: J */
    void mo91556J(Context context, String str, long j, String str2, String str3, String str4, ArrayList arrayList, boolean z);

    /* renamed from: J0 */
    Fragment mo91557J0(Long l);

    /* renamed from: K */
    void mo91558K(Context context);

    /* renamed from: K0 */
    void mo91559K0(long j, String str, FragmentManager fragmentManager);

    /* renamed from: L */
    void mo91560L(String str, String str2, Context context);

    /* renamed from: L0 */
    void mo91561L0(long j, String str, Context context);

    /* renamed from: M */
    void mo91562M(Context context, String str);

    /* renamed from: M0 */
    void mo91563M0(Context context, long j);

    /* renamed from: N */
    void mo91564N(Context context, String str, boolean z);

    /* renamed from: N0 */
    void mo91565N0(FragmentManager fragmentManager, String str, long j, boolean z, Long l, Long l2, boolean z2, boolean z3, boolean z4, String str2);

    /* renamed from: O */
    void mo91566O(C35388f2 f2Var, String str, BigDecimal bigDecimal, String str2, String str3, String str4, boolean z);

    /* renamed from: O0 */
    void mo91567O0(Context context, int i);

    /* renamed from: P */
    void mo91568P(Context context, String str, String str2, C0173b bVar);

    /* renamed from: P0 */
    void mo91569P0(Context context, C0173b bVar);

    /* renamed from: Q */
    void mo91570Q(Context context, C26252e eVar, C0173b bVar);

    /* renamed from: Q0 */
    void mo91571Q0(Context context, C0173b bVar, String str, List list);

    /* renamed from: R */
    void mo91572R(Context context, String str);

    /* renamed from: R0 */
    void mo91573R0(Context context);

    /* renamed from: S */
    void mo91574S(Context context, long j);

    /* renamed from: S0 */
    void mo91575S0(Context context, C0173b bVar);

    /* renamed from: T */
    void mo91576T(long j, FragmentManager fragmentManager, String str);

    /* renamed from: T0 */
    void mo91577T0(Activity activity, int i);

    /* renamed from: U */
    void mo91578U(Context context, String str);

    /* renamed from: U0 */
    void mo91579U0(Context context);

    /* renamed from: V */
    C19788a mo91580V(Long l);

    /* renamed from: V0 */
    C19788a mo91581V0();

    /* renamed from: W */
    C19788a mo91582W(DigitalCardInfo digitalCardInfo);

    /* renamed from: W0 */
    void mo91583W0(Context context);

    /* renamed from: X */
    void mo91584X(long j, String str, FragmentManager fragmentManager, String str2);

    /* renamed from: X0 */
    C1483c mo91585X0(ExpiringCardPopUpData expiringCardPopUpData);

    /* renamed from: Y */
    void mo91586Y(Context context);

    /* renamed from: Y0 */
    void mo91587Y0(Context context, long j);

    /* renamed from: Z */
    void mo91588Z(Context context, C27685a aVar);

    /* renamed from: Z0 */
    void mo91589Z0(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5);

    /* renamed from: a */
    void mo91590a(Context context);

    /* renamed from: a0 */
    C25052b mo91591a0(C24776a aVar, C43079p pVar, C43075l lVar);

    /* renamed from: a1 */
    void mo91592a1(Context context, String str, String str2, boolean z);

    /* renamed from: b */
    void mo91593b(Context context, long j);

    /* renamed from: b0 */
    void mo91594b0(Context context, String str, String str2, boolean z);

    /* renamed from: b1 */
    void mo91595b1(Context context, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, String str, BigDecimal bigDecimal4, String str2, long j, BigDecimal bigDecimal5, String str3);

    /* renamed from: c */
    void mo91596c(Context context);

    /* renamed from: c0 */
    void mo91597c0(Context context);

    /* renamed from: d */
    void mo91598d(Context context, ArrayList arrayList, String str, String str2, String str3, OfferProductCode offerProductCode);

    /* renamed from: d0 */
    void mo91599d0(Context context, String str, String str2);

    /* renamed from: e */
    void mo91600e(Context context, Bundle bundle);

    /* renamed from: e0 */
    void mo91601e0(Context context, Application application, boolean z);

    /* renamed from: f */
    void mo91602f(Context context, String str);

    /* renamed from: f0 */
    void mo91603f0(Context context, BigDecimal bigDecimal, String str, String str2, Integer num, Long l, boolean z, Long l2, BigDecimal bigDecimal2, boolean z2, String str3, Long l3, BigDecimal bigDecimal3, BigDecimal bigDecimal4, String str4, String str5, int i);

    /* renamed from: g */
    C1483c mo91604g();

    /* renamed from: g0 */
    void mo91605g0(Context context, P2PFlowType p2PFlowType);

    /* renamed from: h */
    void mo91606h(Context context, long j);

    /* renamed from: h0 */
    void mo91607h0(Context context);

    /* renamed from: i */
    C35651n1 mo91608i(boolean z);

    /* renamed from: i0 */
    void mo91609i0(Context context, long j);

    /* renamed from: j */
    void mo91610j(String str, String str2, Context context);

    /* renamed from: j0 */
    void mo91611j0(Context context, String str);

    /* renamed from: k */
    C19788a mo91612k(Long l, List list, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel);

    /* renamed from: k0 */
    void mo91613k0(Context context);

    /* renamed from: l */
    void mo91614l(Context context, C26254g gVar, C0173b bVar);

    /* renamed from: l0 */
    void mo91615l0(Context context);

    /* renamed from: m */
    void mo91616m(PackageType packageType, boolean z, String str, Context context, C0173b bVar);

    /* renamed from: m0 */
    void mo91617m0(Context context, String str, Bundle bundle);

    /* renamed from: n */
    void mo91618n(Context context);

    /* renamed from: n0 */
    void mo91619n0(Activity activity);

    /* renamed from: o */
    C1483c mo91620o(C30003b bVar);

    /* renamed from: o0 */
    Fragment mo91621o0(boolean z);

    /* renamed from: p */
    void mo91622p(Context context, long j);

    /* renamed from: p0 */
    C1483c mo91623p0(LiabilityOverdueInfoUiModel liabilityOverdueInfoUiModel);

    /* renamed from: q */
    void mo91624q(long j, Context context);

    /* renamed from: q0 */
    void mo91625q0(Context context, long j, C0173b bVar);

    /* renamed from: r */
    void mo91626r(Context context);

    /* renamed from: r0 */
    Fragment mo91627r0(boolean z);

    /* renamed from: s */
    void mo91628s(Activity activity, long j);

    /* renamed from: s0 */
    C1483c mo91629s0(boolean z);

    /* renamed from: t */
    void mo91630t(Context context);

    /* renamed from: t0 */
    void mo91631t0(Context context);

    /* renamed from: u */
    void mo91632u(Context context, OtherTransferTypeState otherTransferTypeState);

    /* renamed from: u0 */
    C35651n1 mo91633u0(boolean z);

    /* renamed from: v */
    void mo91634v(long j, FragmentManager fragmentManager, String str);

    /* renamed from: v0 */
    C19788a mo91635v0(long j, String str, String str2);

    /* renamed from: w */
    void mo91636w(String str, FragmentManager fragmentManager, String str2);

    /* renamed from: w0 */
    void mo91637w0(C24849e eVar, Context context);

    /* renamed from: x */
    void mo91638x(Context context);

    /* renamed from: x0 */
    void mo91639x0(Context context, Long l, Integer num);

    /* renamed from: y */
    void mo91640y(Long l, Long l2, Integer num, FragmentManager fragmentManager);

    /* renamed from: y0 */
    void mo91641y0(Context context, DDSTO ddsto);

    /* renamed from: z */
    void mo91642z(Context context);

    /* renamed from: z0 */
    void mo91643z0(long j, FragmentManager fragmentManager);
}
