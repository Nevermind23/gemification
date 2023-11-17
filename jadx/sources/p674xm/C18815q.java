package p674xm;

import cf1.C40419j;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m70.C26148a;
import o31.C37623y;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardCurrencyUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardPinDeliveryTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardReceiveTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRecipientTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.DebitCardRegTypeUiModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.RegionUiModel;
import p341ge.bog.mobilebank.cleanarch.cardinsurance.presentation.model.DebitCardInsuranceTypeUiModel;
import p341ge.bog.mobilebank.shared.cards.presentation.scoolcardlimitchooser.model.CardDailyLimitUiModel;
import p383cn.C10515c;
import p398dn.C12330d;
import p603si.C17799b;
import p603si.C17809c;

/* renamed from: xm.q */
public abstract class C18815q {

    /* renamed from: d */
    public static final C18821f f52571d = new C18821f((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Object f52572a;

    /* renamed from: b */
    private final boolean f52573b;

    /* renamed from: c */
    private final boolean f52574c;

    /* renamed from: xm.q$a */
    public static final class C18816a extends C18815q {

        /* renamed from: e */
        private final boolean f52575e;

        /* renamed from: f */
        private final boolean f52576f;

        /* renamed from: g */
        private final boolean f52577g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18816a(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? true : z3);
        }

        /* renamed from: d */
        public static /* synthetic */ C18816a m63604d(C18816a aVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = aVar.f52575e;
            }
            if ((i & 2) != 0) {
                z2 = aVar.f52576f;
            }
            if ((i & 4) != 0) {
                z3 = aVar.f52577g;
            }
            return aVar.mo46671c(z, z2, z3);
        }

        /* renamed from: c */
        public final C18816a mo46671c(boolean z, boolean z2, boolean z3) {
            return new C18816a(z, z2, z3);
        }

        /* renamed from: e */
        public Boolean mo46669a() {
            return Boolean.valueOf(this.f52575e);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18816a)) {
                return false;
            }
            C18816a aVar = (C18816a) obj;
            return this.f52575e == aVar.f52575e && this.f52576f == aVar.f52576f && this.f52577g == aVar.f52577g;
        }

        public int hashCode() {
            boolean z = this.f52575e;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            boolean z3 = this.f52576f;
            if (z3) {
                z3 = true;
            }
            int i2 = (i + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.f52577g;
            if (!z4) {
                z2 = z4;
            }
            return i2 + (z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.f52575e;
            boolean z2 = this.f52576f;
            boolean z3 = this.f52577g;
            return "BooleanField(data=" + z + ", isVisible=" + z2 + ", isEnabled=" + z3 + ")";
        }

        public C18816a(boolean z, boolean z2, boolean z3) {
            super(Boolean.valueOf(z), false, false, 6, (DefaultConstructorMarker) null);
            this.f52575e = z;
            this.f52576f = z2;
            this.f52577g = z3;
        }
    }

    /* renamed from: xm.q$b */
    public static final class C18817b extends C18815q {

        /* renamed from: e */
        private final CardDailyLimitUiModel f52578e;

        /* renamed from: f */
        private final boolean f52579f;

        /* renamed from: g */
        private final boolean f52580g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18817b(CardDailyLimitUiModel cardDailyLimitUiModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cardDailyLimitUiModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: d */
        public static /* synthetic */ C18817b m63608d(C18817b bVar, CardDailyLimitUiModel cardDailyLimitUiModel, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                cardDailyLimitUiModel = bVar.f52578e;
            }
            if ((i & 2) != 0) {
                z = bVar.f52579f;
            }
            if ((i & 4) != 0) {
                z2 = bVar.f52580g;
            }
            return bVar.mo46676c(cardDailyLimitUiModel, z, z2);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52580g;
        }

        /* renamed from: c */
        public final C18817b mo46676c(CardDailyLimitUiModel cardDailyLimitUiModel, boolean z, boolean z2) {
            return new C18817b(cardDailyLimitUiModel, z, z2);
        }

        /* renamed from: e */
        public CardDailyLimitUiModel mo46669a() {
            return this.f52578e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18817b)) {
                return false;
            }
            C18817b bVar = (C18817b) obj;
            return C41536l.m120484d(this.f52578e, bVar.f52578e) && this.f52579f == bVar.f52579f && this.f52580g == bVar.f52580g;
        }

        /* renamed from: f */
        public boolean mo46679f() {
            return this.f52579f;
        }

        public int hashCode() {
            CardDailyLimitUiModel cardDailyLimitUiModel = this.f52578e;
            int hashCode = (cardDailyLimitUiModel == null ? 0 : cardDailyLimitUiModel.hashCode()) * 31;
            boolean z = this.f52579f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f52580g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            CardDailyLimitUiModel cardDailyLimitUiModel = this.f52578e;
            boolean z = this.f52579f;
            boolean z2 = this.f52580g;
            return "CardLimitField(data=" + cardDailyLimitUiModel + ", isVisible=" + z + ", isEnabled=" + z2 + ")";
        }

        public C18817b(CardDailyLimitUiModel cardDailyLimitUiModel, boolean z, boolean z2) {
            super(cardDailyLimitUiModel, z2, z, (DefaultConstructorMarker) null);
            this.f52578e = cardDailyLimitUiModel;
            this.f52579f = z;
            this.f52580g = z2;
        }
    }

    /* renamed from: xm.q$c */
    public static final class C18818c extends C18815q {

        /* renamed from: e */
        private final C26148a f52581e;

        /* renamed from: f */
        private final boolean f52582f;

        /* renamed from: g */
        private final boolean f52583g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18818c(C26148a aVar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : aVar, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52582f;
        }

        /* renamed from: c */
        public C26148a mo46669a() {
            return this.f52581e;
        }

        /* renamed from: d */
        public boolean mo46683d() {
            return this.f52583g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18818c)) {
                return false;
            }
            C18818c cVar = (C18818c) obj;
            return C41536l.m120484d(this.f52581e, cVar.f52581e) && this.f52582f == cVar.f52582f && this.f52583g == cVar.f52583g;
        }

        public int hashCode() {
            C26148a aVar = this.f52581e;
            int hashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
            boolean z = this.f52582f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f52583g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            C26148a aVar = this.f52581e;
            boolean z = this.f52582f;
            boolean z2 = this.f52583g;
            return "ChosenAccount(data=" + aVar + ", isEnabled=" + z + ", isVisible=" + z2 + ")";
        }

        public C18818c(C26148a aVar, boolean z, boolean z2) {
            super(aVar, z, false, 4, (DefaultConstructorMarker) null);
            this.f52581e = aVar;
            this.f52582f = z;
            this.f52583g = z2;
        }
    }

    /* renamed from: xm.q$d */
    public static final class C18819d extends C18815q {

        /* renamed from: e */
        private final DebitCardRegTypeUiModel f52584e;

        /* renamed from: f */
        private final boolean f52585f;

        /* renamed from: g */
        private final boolean f52586g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18819d(DebitCardRegTypeUiModel debitCardRegTypeUiModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : debitCardRegTypeUiModel, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: d */
        public static /* synthetic */ C18819d m63618d(C18819d dVar, DebitCardRegTypeUiModel debitCardRegTypeUiModel, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                debitCardRegTypeUiModel = dVar.f52584e;
            }
            if ((i & 2) != 0) {
                z = dVar.f52585f;
            }
            if ((i & 4) != 0) {
                z2 = dVar.f52586g;
            }
            return dVar.mo46687c(debitCardRegTypeUiModel, z, z2);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52585f;
        }

        /* renamed from: c */
        public final C18819d mo46687c(DebitCardRegTypeUiModel debitCardRegTypeUiModel, boolean z, boolean z2) {
            return new C18819d(debitCardRegTypeUiModel, z, z2);
        }

        /* renamed from: e */
        public DebitCardRegTypeUiModel mo46669a() {
            return this.f52584e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18819d)) {
                return false;
            }
            C18819d dVar = (C18819d) obj;
            return C41536l.m120484d(this.f52584e, dVar.f52584e) && this.f52585f == dVar.f52585f && this.f52586g == dVar.f52586g;
        }

        /* renamed from: f */
        public boolean mo46690f() {
            return this.f52586g;
        }

        public int hashCode() {
            DebitCardRegTypeUiModel debitCardRegTypeUiModel = this.f52584e;
            int hashCode = (debitCardRegTypeUiModel == null ? 0 : debitCardRegTypeUiModel.hashCode()) * 31;
            boolean z = this.f52585f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f52586g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            DebitCardRegTypeUiModel debitCardRegTypeUiModel = this.f52584e;
            boolean z = this.f52585f;
            boolean z2 = this.f52586g;
            return "ChosenAccountType(data=" + debitCardRegTypeUiModel + ", isEnabled=" + z + ", isVisible=" + z2 + ")";
        }

        public C18819d(DebitCardRegTypeUiModel debitCardRegTypeUiModel, boolean z, boolean z2) {
            super(debitCardRegTypeUiModel, z, false, 4, (DefaultConstructorMarker) null);
            this.f52584e = debitCardRegTypeUiModel;
            this.f52585f = z;
            this.f52586g = z2;
        }
    }

    /* renamed from: xm.q$e */
    public static final class C18820e extends C18815q {

        /* renamed from: e */
        private final DebitCardCurrencyUiModel f52587e;

        /* renamed from: f */
        private final Integer f52588f;

        /* renamed from: g */
        private final boolean f52589g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18820e(DebitCardCurrencyUiModel debitCardCurrencyUiModel, Integer num, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : debitCardCurrencyUiModel, (i & 2) != 0 ? null : num, (i & 4) != 0 ? true : z);
        }

        /* renamed from: c */
        public DebitCardCurrencyUiModel mo46669a() {
            return this.f52587e;
        }

        /* renamed from: d */
        public final Integer mo46694d() {
            return this.f52588f;
        }

        /* renamed from: e */
        public boolean mo46695e() {
            return this.f52589g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18820e)) {
                return false;
            }
            C18820e eVar = (C18820e) obj;
            return C41536l.m120484d(this.f52587e, eVar.f52587e) && C41536l.m120484d(this.f52588f, eVar.f52588f) && this.f52589g == eVar.f52589g;
        }

        public int hashCode() {
            DebitCardCurrencyUiModel debitCardCurrencyUiModel = this.f52587e;
            int i = 0;
            int hashCode = (debitCardCurrencyUiModel == null ? 0 : debitCardCurrencyUiModel.hashCode()) * 31;
            Integer num = this.f52588f;
            if (num != null) {
                i = num.hashCode();
            }
            int i2 = (hashCode + i) * 31;
            boolean z = this.f52589g;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            DebitCardCurrencyUiModel debitCardCurrencyUiModel = this.f52587e;
            Integer num = this.f52588f;
            boolean z = this.f52589g;
            return "ChosenCurrency(data=" + debitCardCurrencyUiModel + ", index=" + num + ", isVisible=" + z + ")";
        }

        public C18820e(DebitCardCurrencyUiModel debitCardCurrencyUiModel, Integer num, boolean z) {
            super(debitCardCurrencyUiModel, false, false, 6, (DefaultConstructorMarker) null);
            this.f52587e = debitCardCurrencyUiModel;
            this.f52588f = num;
            this.f52589g = z;
        }
    }

    /* renamed from: xm.q$f */
    public static final class C18821f {
        private C18821f() {
        }

        public /* synthetic */ C18821f(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C18832q mo46699a(String str, boolean z, boolean z2) {
            C41536l.m120489i(str, "<this>");
            return new C18832q(str, z, z2, (C17799b) null, 8, (DefaultConstructorMarker) null);
        }
    }

    /* renamed from: xm.q$g */
    public static final class C18822g extends C18815q {

        /* renamed from: e */
        private final C18811m f52590e;

        /* renamed from: f */
        private final boolean f52591f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18822g(C18811m mVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : mVar, (i & 2) != 0 ? false : z);
        }

        /* renamed from: d */
        public static /* synthetic */ C18822g m63629d(C18822g gVar, C18811m mVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                mVar = gVar.f52590e;
            }
            if ((i & 2) != 0) {
                z = gVar.f52591f;
            }
            return gVar.mo46700c(mVar, z);
        }

        /* renamed from: c */
        public final C18822g mo46700c(C18811m mVar, boolean z) {
            return new C18822g(mVar, z);
        }

        /* renamed from: e */
        public final String mo46701e() {
            C18811m f = mo46669a();
            if (f != null) {
                String str = f.mo46652a().mo39900a() + ", " + f.mo46653b().mo39913b();
                if (str == null) {
                    return "";
                }
                return str;
            }
            return "";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18822g)) {
                return false;
            }
            C18822g gVar = (C18822g) obj;
            return C41536l.m120484d(this.f52590e, gVar.f52590e) && this.f52591f == gVar.f52591f;
        }

        /* renamed from: f */
        public C18811m mo46669a() {
            return this.f52590e;
        }

        /* renamed from: g */
        public boolean mo46704g() {
            return this.f52591f;
        }

        public int hashCode() {
            C18811m mVar = this.f52590e;
            int hashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
            boolean z = this.f52591f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            C18811m mVar = this.f52590e;
            boolean z = this.f52591f;
            return "DeliveryDistrict(data=" + mVar + ", isVisible=" + z + ")";
        }

        public C18822g(C18811m mVar, boolean z) {
            super(mVar, false, false, 6, (DefaultConstructorMarker) null);
            this.f52590e = mVar;
            this.f52591f = z;
        }
    }

    /* renamed from: xm.q$h */
    public static abstract class C18823h extends C18815q {

        /* renamed from: e */
        private final String f52592e;

        /* renamed from: f */
        private final boolean f52593f;

        /* renamed from: g */
        private final boolean f52594g;

        /* renamed from: h */
        private final C17799b f52595h;

        public /* synthetic */ C18823h(String str, boolean z, boolean z2, C17799b bVar, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z, z2, bVar);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52593f;
        }

        /* renamed from: c */
        public abstract String mo46707c();

        /* renamed from: d */
        public abstract C17799b mo46708d();

        /* renamed from: e */
        public final boolean mo46709e() {
            if (mo46707c() == null) {
                return false;
            }
            return mo46708d().mo45386g(String.valueOf(mo46707c()));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18823h(String str, boolean z, boolean z2, C17799b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? C37623y.C37624a.m110637b(C37623y.f90388f, C17799b.C17805f.f50686d, (C37623y.C37625b) null, 1, (Object) null) : bVar, (DefaultConstructorMarker) null);
        }

        private C18823h(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, (DefaultConstructorMarker) null);
            this.f52592e = str;
            this.f52593f = z;
            this.f52594g = z2;
            this.f52595h = bVar;
        }
    }

    /* renamed from: xm.q$i */
    public static final class C18824i extends C18815q {

        /* renamed from: e */
        private final DebitCardInsuranceTypeUiModel f52596e;

        /* renamed from: f */
        private final boolean f52597f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18824i(DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : debitCardInsuranceTypeUiModel, (i & 2) != 0 ? true : z);
        }

        /* renamed from: d */
        public static /* synthetic */ C18824i m63639d(C18824i iVar, DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                debitCardInsuranceTypeUiModel = iVar.f52596e;
            }
            if ((i & 2) != 0) {
                z = iVar.f52597f;
            }
            return iVar.mo46710c(debitCardInsuranceTypeUiModel, z);
        }

        /* renamed from: c */
        public final C18824i mo46710c(DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel, boolean z) {
            return new C18824i(debitCardInsuranceTypeUiModel, z);
        }

        /* renamed from: e */
        public DebitCardInsuranceTypeUiModel mo46669a() {
            return this.f52596e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18824i)) {
                return false;
            }
            C18824i iVar = (C18824i) obj;
            return C41536l.m120484d(this.f52596e, iVar.f52596e) && this.f52597f == iVar.f52597f;
        }

        public int hashCode() {
            DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel = this.f52596e;
            int hashCode = (debitCardInsuranceTypeUiModel == null ? 0 : debitCardInsuranceTypeUiModel.hashCode()) * 31;
            boolean z = this.f52597f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel = this.f52596e;
            boolean z = this.f52597f;
            return "InsuranceField(data=" + debitCardInsuranceTypeUiModel + ", isEnabled=" + z + ")";
        }

        public C18824i(DebitCardInsuranceTypeUiModel debitCardInsuranceTypeUiModel, boolean z) {
            super(debitCardInsuranceTypeUiModel, false, false, 6, (DefaultConstructorMarker) null);
            this.f52596e = debitCardInsuranceTypeUiModel;
            this.f52597f = z;
        }
    }

    /* renamed from: xm.q$j */
    public static final class C18825j extends C18815q {

        /* renamed from: e */
        private final Long f52598e;

        /* renamed from: f */
        private final boolean f52599f;

        /* renamed from: g */
        private final boolean f52600g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18825j(Long l, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : l, (i & 2) != 0 ? false : z, (i & 4) != 0 ? true : z2);
        }

        /* renamed from: d */
        public static /* synthetic */ C18825j m63643d(C18825j jVar, Long l, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                l = jVar.f52598e;
            }
            if ((i & 2) != 0) {
                z = jVar.f52599f;
            }
            if ((i & 4) != 0) {
                z2 = jVar.f52600g;
            }
            return jVar.mo46715c(l, z, z2);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52600g;
        }

        /* renamed from: c */
        public final C18825j mo46715c(Long l, boolean z, boolean z2) {
            return new C18825j(l, z, z2);
        }

        /* renamed from: e */
        public Long mo46669a() {
            return this.f52598e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18825j)) {
                return false;
            }
            C18825j jVar = (C18825j) obj;
            return C41536l.m120484d(this.f52598e, jVar.f52598e) && this.f52599f == jVar.f52599f && this.f52600g == jVar.f52600g;
        }

        /* renamed from: f */
        public boolean mo46718f() {
            return this.f52599f;
        }

        public int hashCode() {
            Long l = this.f52598e;
            int hashCode = (l == null ? 0 : l.hashCode()) * 31;
            boolean z = this.f52599f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f52600g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            Long l = this.f52598e;
            boolean z = this.f52599f;
            boolean z2 = this.f52600g;
            return "LongField(data=" + l + ", isVisible=" + z + ", isEnabled=" + z2 + ")";
        }

        public C18825j(Long l, boolean z, boolean z2) {
            super(l, false, false, 6, (DefaultConstructorMarker) null);
            this.f52598e = l;
            this.f52599f = z;
            this.f52600g = z2;
        }
    }

    /* renamed from: xm.q$l */
    public static final class C18827l extends C18815q {

        /* renamed from: e */
        private final DebitCardReceiveTypeUiModel f52604e;

        /* renamed from: f */
        private final int f52605f;

        /* renamed from: g */
        private final boolean f52606g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18827l(DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : debitCardReceiveTypeUiModel, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? true : z);
        }

        /* renamed from: c */
        public DebitCardReceiveTypeUiModel mo46669a() {
            return this.f52604e;
        }

        /* renamed from: d */
        public final int mo46727d() {
            return this.f52605f;
        }

        /* renamed from: e */
        public final boolean mo46728e() {
            return C12330d.f36975a.mo32926f(mo46669a());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18827l)) {
                return false;
            }
            C18827l lVar = (C18827l) obj;
            return C41536l.m120484d(this.f52604e, lVar.f52604e) && this.f52605f == lVar.f52605f && this.f52606g == lVar.f52606g;
        }

        public int hashCode() {
            DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel = this.f52604e;
            int hashCode = (((debitCardReceiveTypeUiModel == null ? 0 : debitCardReceiveTypeUiModel.hashCode()) * 31) + this.f52605f) * 31;
            boolean z = this.f52606g;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel = this.f52604e;
            int i = this.f52605f;
            boolean z = this.f52606g;
            return "PickupType(data=" + debitCardReceiveTypeUiModel + ", index=" + i + ", isVisible=" + z + ")";
        }

        public C18827l(DebitCardReceiveTypeUiModel debitCardReceiveTypeUiModel, int i, boolean z) {
            super(debitCardReceiveTypeUiModel, false, false, 6, (DefaultConstructorMarker) null);
            this.f52604e = debitCardReceiveTypeUiModel;
            this.f52605f = i;
            this.f52606g = z;
        }
    }

    /* renamed from: xm.q$n */
    public static final class C18829n extends C18815q {

        /* renamed from: e */
        private final DebitCardRecipientTypeUiModel f52611e;

        /* renamed from: f */
        private final int f52612f;

        /* renamed from: g */
        private final boolean f52613g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18829n(DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : debitCardRecipientTypeUiModel, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? false : z);
        }

        /* renamed from: d */
        public static /* synthetic */ C18829n m63666d(C18829n nVar, DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                debitCardRecipientTypeUiModel = nVar.f52611e;
            }
            if ((i2 & 2) != 0) {
                i = nVar.f52612f;
            }
            if ((i2 & 4) != 0) {
                z = nVar.f52613g;
            }
            return nVar.mo46739c(debitCardRecipientTypeUiModel, i, z);
        }

        /* renamed from: c */
        public final C18829n mo46739c(DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel, int i, boolean z) {
            return new C18829n(debitCardRecipientTypeUiModel, i, z);
        }

        /* renamed from: e */
        public DebitCardRecipientTypeUiModel mo46669a() {
            return this.f52611e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18829n)) {
                return false;
            }
            C18829n nVar = (C18829n) obj;
            return C41536l.m120484d(this.f52611e, nVar.f52611e) && this.f52612f == nVar.f52612f && this.f52613g == nVar.f52613g;
        }

        /* renamed from: f */
        public final int mo46742f() {
            return this.f52612f;
        }

        /* renamed from: g */
        public boolean mo46743g() {
            return this.f52613g;
        }

        public int hashCode() {
            DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel = this.f52611e;
            int hashCode = (((debitCardRecipientTypeUiModel == null ? 0 : debitCardRecipientTypeUiModel.hashCode()) * 31) + this.f52612f) * 31;
            boolean z = this.f52613g;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel = this.f52611e;
            int i = this.f52612f;
            boolean z = this.f52613g;
            return "RecipientType(data=" + debitCardRecipientTypeUiModel + ", index=" + i + ", isVisible=" + z + ")";
        }

        public C18829n(DebitCardRecipientTypeUiModel debitCardRecipientTypeUiModel, int i, boolean z) {
            super(debitCardRecipientTypeUiModel, false, false, 6, (DefaultConstructorMarker) null);
            this.f52611e = debitCardRecipientTypeUiModel;
            this.f52612f = i;
            this.f52613g = z;
        }
    }

    /* renamed from: xm.q$o */
    public static final class C18830o extends C18815q {

        /* renamed from: e */
        private final RegionUiModel f52614e;

        /* renamed from: f */
        private final boolean f52615f;

        /* renamed from: g */
        private final boolean f52616g;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18830o(RegionUiModel regionUiModel, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : regionUiModel, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
        }

        /* renamed from: d */
        public static /* synthetic */ C18830o m63672d(C18830o oVar, RegionUiModel regionUiModel, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                regionUiModel = oVar.f52614e;
            }
            if ((i & 2) != 0) {
                z = oVar.f52615f;
            }
            if ((i & 4) != 0) {
                z2 = oVar.f52616g;
            }
            return oVar.mo46746c(regionUiModel, z, z2);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52615f;
        }

        /* renamed from: c */
        public final C18830o mo46746c(RegionUiModel regionUiModel, boolean z, boolean z2) {
            return new C18830o(regionUiModel, z, z2);
        }

        /* renamed from: e */
        public RegionUiModel mo46669a() {
            return this.f52614e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18830o)) {
                return false;
            }
            C18830o oVar = (C18830o) obj;
            return C41536l.m120484d(this.f52614e, oVar.f52614e) && this.f52615f == oVar.f52615f && this.f52616g == oVar.f52616g;
        }

        public int hashCode() {
            RegionUiModel regionUiModel = this.f52614e;
            int hashCode = (regionUiModel == null ? 0 : regionUiModel.hashCode()) * 31;
            boolean z = this.f52615f;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f52616g;
            if (!z3) {
                z2 = z3;
            }
            return i + (z2 ? 1 : 0);
        }

        public String toString() {
            RegionUiModel regionUiModel = this.f52614e;
            boolean z = this.f52615f;
            boolean z2 = this.f52616g;
            return "RegionField(data=" + regionUiModel + ", isEnabled=" + z + ", isVisible=" + z2 + ")";
        }

        public C18830o(RegionUiModel regionUiModel, boolean z, boolean z2) {
            super(regionUiModel, z, z2, (DefaultConstructorMarker) null);
            this.f52614e = regionUiModel;
            this.f52615f = z;
            this.f52616g = z2;
        }
    }

    /* renamed from: xm.q$p */
    public static final class C18831p extends C18815q {

        /* renamed from: e */
        private final C18810l f52617e;

        /* renamed from: f */
        private final boolean f52618f;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18831p(C18810l lVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : lVar, (i & 2) != 0 ? true : z);
        }

        /* renamed from: d */
        public static /* synthetic */ C18831p m63677d(C18831p pVar, C18810l lVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                lVar = pVar.f52617e;
            }
            if ((i & 2) != 0) {
                z = pVar.f52618f;
            }
            return pVar.mo46751c(lVar, z);
        }

        /* renamed from: c */
        public final C18831p mo46751c(C18810l lVar, boolean z) {
            return new C18831p(lVar, z);
        }

        /* renamed from: e */
        public C18810l mo46669a() {
            return this.f52617e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18831p)) {
                return false;
            }
            C18831p pVar = (C18831p) obj;
            return C41536l.m120484d(this.f52617e, pVar.f52617e) && this.f52618f == pVar.f52618f;
        }

        public int hashCode() {
            C18810l lVar = this.f52617e;
            int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
            boolean z = this.f52618f;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            C18810l lVar = this.f52617e;
            boolean z = this.f52618f;
            return "ServiceCenter(data=" + lVar + ", isVisible=" + z + ")";
        }

        public C18831p(C18810l lVar, boolean z) {
            super(lVar, false, false, 6, (DefaultConstructorMarker) null);
            this.f52617e = lVar;
            this.f52618f = z;
        }
    }

    public /* synthetic */ C18815q(Object obj, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z, z2);
    }

    /* renamed from: a */
    public abstract Object mo46669a();

    /* renamed from: b */
    public boolean mo46670b() {
        return this.f52573b;
    }

    /* renamed from: xm.q$k */
    public static final class C18826k extends C18823h {

        /* renamed from: i */
        private final String f52601i;

        /* renamed from: j */
        private final boolean f52602j;

        /* renamed from: k */
        private final C17799b f52603k;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18826k(String str, boolean z, C17799b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? C37623y.C37624a.m110637b(C37623y.f90388f, C17799b.C17805f.f50686d, (C37623y.C37625b) null, 1, (Object) null) : bVar);
        }

        /* renamed from: g */
        public static /* synthetic */ C18826k m63649g(C18826k kVar, String str, boolean z, C17799b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = kVar.f52601i;
            }
            if ((i & 2) != 0) {
                z = kVar.f52602j;
            }
            if ((i & 4) != 0) {
                bVar = kVar.f52603k;
            }
            return kVar.mo46722f(str, z, bVar);
        }

        /* renamed from: c */
        public String mo46669a() {
            return this.f52601i;
        }

        /* renamed from: d */
        public C17799b mo46708d() {
            return this.f52603k;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18826k)) {
                return false;
            }
            C18826k kVar = (C18826k) obj;
            return C41536l.m120484d(this.f52601i, kVar.f52601i) && this.f52602j == kVar.f52602j && C41536l.m120484d(this.f52603k, kVar.f52603k);
        }

        /* renamed from: f */
        public final C18826k mo46722f(String str, boolean z, C17799b bVar) {
            C41536l.m120489i(bVar, "validator");
            return new C18826k(str, z, bVar);
        }

        /* renamed from: h */
        public boolean mo46723h() {
            return this.f52602j;
        }

        public int hashCode() {
            String str = this.f52601i;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f52602j;
            if (z) {
                z = true;
            }
            return ((hashCode + (z ? 1 : 0)) * 31) + this.f52603k.hashCode();
        }

        public String toString() {
            String str = this.f52601i;
            boolean z = this.f52602j;
            C17799b bVar = this.f52603k;
            return "PhoneNumber(data=" + str + ", isVisible=" + z + ", validator=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18826k(String str, boolean z, C17799b bVar) {
            super(str, false, z, bVar, 2, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "validator");
            this.f52601i = str;
            this.f52602j = z;
            this.f52603k = bVar;
        }
    }

    /* renamed from: xm.q$m */
    public static final class C18828m extends C18815q {

        /* renamed from: e */
        private final DebitCardPinDeliveryTypeUiModel f52607e;

        /* renamed from: f */
        private final Integer f52608f;

        /* renamed from: g */
        private final C10515c f52609g;

        /* renamed from: h */
        private final boolean f52610h;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18828m(DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel, Integer num, C10515c cVar, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : debitCardPinDeliveryTypeUiModel, (i & 2) != 0 ? null : num, (i & 4) != 0 ? C10515c.CARD_DETAILS : cVar, (i & 8) != 0 ? true : z);
        }

        /* renamed from: d */
        public static /* synthetic */ C18828m m63659d(C18828m mVar, DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel, Integer num, C10515c cVar, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                debitCardPinDeliveryTypeUiModel = mVar.f52607e;
            }
            if ((i & 2) != 0) {
                num = mVar.f52608f;
            }
            if ((i & 4) != 0) {
                cVar = mVar.f52609g;
            }
            if ((i & 8) != 0) {
                z = mVar.f52610h;
            }
            return mVar.mo46732c(debitCardPinDeliveryTypeUiModel, num, cVar, z);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52610h;
        }

        /* renamed from: c */
        public final C18828m mo46732c(DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel, Integer num, C10515c cVar, boolean z) {
            C41536l.m120489i(cVar, "visibilityStep");
            return new C18828m(debitCardPinDeliveryTypeUiModel, num, cVar, z);
        }

        /* renamed from: e */
        public DebitCardPinDeliveryTypeUiModel mo46669a() {
            return this.f52607e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18828m)) {
                return false;
            }
            C18828m mVar = (C18828m) obj;
            return C41536l.m120484d(this.f52607e, mVar.f52607e) && C41536l.m120484d(this.f52608f, mVar.f52608f) && this.f52609g == mVar.f52609g && this.f52610h == mVar.f52610h;
        }

        /* renamed from: f */
        public final Integer mo46735f() {
            return this.f52608f;
        }

        /* renamed from: g */
        public final C10515c mo46736g() {
            return this.f52609g;
        }

        public int hashCode() {
            DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel = this.f52607e;
            int i = 0;
            int hashCode = (debitCardPinDeliveryTypeUiModel == null ? 0 : debitCardPinDeliveryTypeUiModel.hashCode()) * 31;
            Integer num = this.f52608f;
            if (num != null) {
                i = num.hashCode();
            }
            int hashCode2 = (((hashCode + i) * 31) + this.f52609g.hashCode()) * 31;
            boolean z = this.f52610h;
            if (z) {
                z = true;
            }
            return hashCode2 + (z ? 1 : 0);
        }

        public String toString() {
            DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel = this.f52607e;
            Integer num = this.f52608f;
            C10515c cVar = this.f52609g;
            boolean z = this.f52610h;
            return "PinDeliveryType(data=" + debitCardPinDeliveryTypeUiModel + ", index=" + num + ", visibilityStep=" + cVar + ", isEnabled=" + z + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18828m(DebitCardPinDeliveryTypeUiModel debitCardPinDeliveryTypeUiModel, Integer num, C10515c cVar, boolean z) {
            super(debitCardPinDeliveryTypeUiModel, false, false, 6, (DefaultConstructorMarker) null);
            C41536l.m120489i(cVar, "visibilityStep");
            this.f52607e = debitCardPinDeliveryTypeUiModel;
            this.f52608f = num;
            this.f52609g = cVar;
            this.f52610h = z;
        }
    }

    private C18815q(Object obj, boolean z, boolean z2) {
        this.f52572a = obj;
        this.f52573b = z;
        this.f52574c = z2;
    }

    /* renamed from: xm.q$q */
    public static final class C18832q extends C18823h {

        /* renamed from: i */
        private final String f52619i;

        /* renamed from: j */
        private final boolean f52620j;

        /* renamed from: k */
        private final boolean f52621k;

        /* renamed from: l */
        private final C17799b f52622l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C18832q(String str, boolean z, boolean z2, C17799b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (i & 8) != 0 ? C37623y.C37624a.m110637b(C37623y.f90388f, C17809c.m61562a(new C17799b.C17807h(new C40419j("^[a-zA-Z0-9-. ]+$")), C32343x.m95388F("text.card.applications.name.on.card.error", new Object[0])), (C37623y.C37625b) null, 1, (Object) null) : bVar);
        }

        /* renamed from: g */
        public static /* synthetic */ C18832q m63681g(C18832q qVar, String str, boolean z, boolean z2, C17799b bVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = qVar.f52619i;
            }
            if ((i & 2) != 0) {
                z = qVar.f52620j;
            }
            if ((i & 4) != 0) {
                z2 = qVar.f52621k;
            }
            if ((i & 8) != 0) {
                bVar = qVar.f52622l;
            }
            return qVar.mo46757f(str, z, z2, bVar);
        }

        /* renamed from: b */
        public boolean mo46670b() {
            return this.f52620j;
        }

        /* renamed from: c */
        public String mo46669a() {
            return this.f52619i;
        }

        /* renamed from: d */
        public C17799b mo46708d() {
            return this.f52622l;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C18832q)) {
                return false;
            }
            C18832q qVar = (C18832q) obj;
            return C41536l.m120484d(this.f52619i, qVar.f52619i) && this.f52620j == qVar.f52620j && this.f52621k == qVar.f52621k && C41536l.m120484d(this.f52622l, qVar.f52622l);
        }

        /* renamed from: f */
        public final C18832q mo46757f(String str, boolean z, boolean z2, C17799b bVar) {
            C41536l.m120489i(bVar, "validator");
            return new C18832q(str, z, z2, bVar);
        }

        /* renamed from: h */
        public boolean mo46758h() {
            return this.f52621k;
        }

        public int hashCode() {
            String str = this.f52619i;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            boolean z = this.f52620j;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.f52621k;
            if (!z3) {
                z2 = z3;
            }
            return ((i + (z2 ? 1 : 0)) * 31) + this.f52622l.hashCode();
        }

        public String toString() {
            String str = this.f52619i;
            boolean z = this.f52620j;
            boolean z2 = this.f52621k;
            C17799b bVar = this.f52622l;
            return "StringField(data=" + str + ", isEnabled=" + z + ", isVisible=" + z2 + ", validator=" + bVar + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C18832q(String str, boolean z, boolean z2, C17799b bVar) {
            super(str, z, z2, bVar, (DefaultConstructorMarker) null);
            C41536l.m120489i(bVar, "validator");
            this.f52619i = str;
            this.f52620j = z;
            this.f52621k = z2;
            this.f52622l = bVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18815q(Object obj, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? true : z, (i & 4) != 0 ? true : z2, (DefaultConstructorMarker) null);
    }
}
