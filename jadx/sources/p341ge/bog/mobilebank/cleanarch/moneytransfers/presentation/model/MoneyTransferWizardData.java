package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model;

import android.os.Parcel;
import android.os.Parcelable;
import g91.C32343x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p777gz.C24838a;
import p777gz.C24839b;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData */
public final class MoneyTransferWizardData implements Parcelable {
    public static final Parcelable.Creator<MoneyTransferWizardData> CREATOR = new C21226b();

    /* renamed from: s */
    public static final C21225a f56984s = new C21225a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final String f56985d;

    /* renamed from: e */
    private final String f56986e;

    /* renamed from: f */
    private final List f56987f;

    /* renamed from: g */
    private int f56988g;

    /* renamed from: h */
    private String f56989h;

    /* renamed from: i */
    private final String f56990i;

    /* renamed from: j */
    private Double f56991j;

    /* renamed from: k */
    private String f56992k;

    /* renamed from: l */
    private String f56993l;

    /* renamed from: m */
    private List f56994m;

    /* renamed from: n */
    private AccountLov f56995n;

    /* renamed from: o */
    private final List f56996o;

    /* renamed from: p */
    private int f56997p;

    /* renamed from: q */
    private MoneyTransferCurrenciesUiModel f56998q;

    /* renamed from: r */
    private String f56999r;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData$Country */
    public static final class Country implements Parcelable {
        public static final Parcelable.Creator<Country> CREATOR = new C21224a();

        /* renamed from: d */
        private final String f57000d;

        /* renamed from: e */
        private final String f57001e;

        /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData$Country$a */
        public static final class C21224a implements Parcelable.Creator {
            /* renamed from: a */
            public final Country createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new Country(parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final Country[] newArray(int i) {
                return new Country[i];
            }
        }

        public Country(String str, String str2) {
            C41536l.m120489i(str, "code");
            C41536l.m120489i(str2, "caption");
            this.f57000d = str;
            this.f57001e = str2;
        }

        /* renamed from: a */
        public final String mo53188a() {
            return this.f57001e;
        }

        /* renamed from: b */
        public final String mo53189b() {
            return this.f57000d;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f57000d);
            parcel.writeString(this.f57001e);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData$a */
    public static final class C21225a {
        private C21225a() {
        }

        public /* synthetic */ C21225a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final MoneyTransferWizardData mo53196a(C24838a aVar, List list, List list2, Integer num, MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel) {
            Object obj;
            int i;
            int i2;
            C41536l.m120489i(aVar, "moneyTransfer");
            C41536l.m120489i(list, "accounts");
            List<C24839b> b = aVar.mo63248b();
            ArrayList arrayList = new ArrayList(C41343r.m119925u(b, 10));
            for (C24839b bVar : b) {
                arrayList.add(new Country(bVar.mo63258b(), bVar.mo63257a()));
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((Country) obj).mo53189b(), aVar.mo63251e())) {
                    break;
                }
            }
            Country country = (Country) obj;
            if (country != null) {
                i = arrayList.indexOf(country);
            } else {
                i = -1;
            }
            String g = aVar.mo63254g();
            String f = aVar.mo63253f();
            double a = aVar.mo63247a();
            String c = aVar.mo63249c();
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            MoneyTransferWizardData moneyTransferWizardData = r2;
            int i3 = i;
            MoneyTransferWizardData moneyTransferWizardData2 = new MoneyTransferWizardData(g, f, arrayList, i, (String) null, c, Double.valueOf(a), (String) null, (String) null, list, (AccountLov) null, list2, i2, moneyTransferCurrenciesUiModel, (String) null, 17808, (DefaultConstructorMarker) null);
            if (i3 != -1) {
                return moneyTransferWizardData;
            }
            MoneyTransferWizardData moneyTransferWizardData3 = moneyTransferWizardData;
            moneyTransferWizardData3.mo53159C(aVar.mo63251e());
            return moneyTransferWizardData3;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData$b */
    public static final class C21226b implements Parcelable.Creator {
        /* renamed from: a */
        public final MoneyTransferWizardData createFromParcel(Parcel parcel) {
            Class<MoneyTransferWizardData> cls;
            Parcel parcel2 = parcel;
            C41536l.m120489i(parcel2, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            for (int i2 = 0; i2 != readInt; i2++) {
                arrayList.add(Country.CREATOR.createFromParcel(parcel2));
            }
            int readInt2 = parcel.readInt();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel = null;
            Double valueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (true) {
                cls = MoneyTransferWizardData.class;
                if (i == readInt3) {
                    break;
                }
                arrayList2.add(parcel2.readParcelable(cls.getClassLoader()));
                i++;
            }
            AccountLov accountLov = (AccountLov) parcel2.readParcelable(cls.getClassLoader());
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            int readInt4 = parcel.readInt();
            if (parcel.readInt() != 0) {
                moneyTransferCurrenciesUiModel = MoneyTransferCurrenciesUiModel.CREATOR.createFromParcel(parcel2);
            }
            return new MoneyTransferWizardData(readString, readString2, arrayList, readInt2, readString3, readString4, valueOf, readString5, readString6, arrayList2, accountLov, createStringArrayList, readInt4, moneyTransferCurrenciesUiModel, parcel.readString());
        }

        /* renamed from: b */
        public final MoneyTransferWizardData[] newArray(int i) {
            return new MoneyTransferWizardData[i];
        }
    }

    public MoneyTransferWizardData(String str, String str2, List list, int i, String str3, String str4, Double d, String str5, String str6, List list2, AccountLov accountLov, List list3, int i2, MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel, String str7) {
        List list4 = list2;
        String str8 = str7;
        C41536l.m120489i(str, "transferNumber");
        C41536l.m120489i(str2, "sender");
        C41536l.m120489i(list, "countries");
        C41536l.m120489i(str3, "selectedCountry");
        C41536l.m120489i(str4, "currency");
        C41536l.m120489i(list4, "accounts");
        C41536l.m120489i(str8, "conversionCurrency");
        this.f56985d = str;
        this.f56986e = str2;
        this.f56987f = list;
        this.f56988g = i;
        this.f56989h = str3;
        this.f56990i = str4;
        this.f56991j = d;
        this.f56992k = str5;
        this.f56993l = str6;
        this.f56994m = list4;
        this.f56995n = accountLov;
        this.f56996o = list3;
        this.f56997p = i2;
        this.f56998q = moneyTransferCurrenciesUiModel;
        this.f56999r = str8;
    }

    /* renamed from: w */
    private final boolean m68741w() {
        return this.f56995n != null;
    }

    /* renamed from: A */
    public final void mo53157A(String str) {
        this.f56993l = str;
    }

    /* renamed from: B */
    public final void mo53158B(AccountLov accountLov) {
        this.f56995n = accountLov;
    }

    /* renamed from: C */
    public final void mo53159C(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f56989h = str;
    }

    /* renamed from: D */
    public final void mo53160D(int i) {
        this.f56988g = i;
    }

    /* renamed from: a */
    public final List mo53161a() {
        return this.f56994m;
    }

    /* renamed from: b */
    public final Double mo53162b() {
        return this.f56991j;
    }

    /* renamed from: d */
    public final String mo53163d() {
        return this.f56999r;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String mo53165e() {
        return this.f56992k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneyTransferWizardData)) {
            return false;
        }
        MoneyTransferWizardData moneyTransferWizardData = (MoneyTransferWizardData) obj;
        return C41536l.m120484d(this.f56985d, moneyTransferWizardData.f56985d) && C41536l.m120484d(this.f56986e, moneyTransferWizardData.f56986e) && C41536l.m120484d(this.f56987f, moneyTransferWizardData.f56987f) && this.f56988g == moneyTransferWizardData.f56988g && C41536l.m120484d(this.f56989h, moneyTransferWizardData.f56989h) && C41536l.m120484d(this.f56990i, moneyTransferWizardData.f56990i) && C41536l.m120484d(this.f56991j, moneyTransferWizardData.f56991j) && C41536l.m120484d(this.f56992k, moneyTransferWizardData.f56992k) && C41536l.m120484d(this.f56993l, moneyTransferWizardData.f56993l) && C41536l.m120484d(this.f56994m, moneyTransferWizardData.f56994m) && C41536l.m120484d(this.f56995n, moneyTransferWizardData.f56995n) && C41536l.m120484d(this.f56996o, moneyTransferWizardData.f56996o) && this.f56997p == moneyTransferWizardData.f56997p && C41536l.m120484d(this.f56998q, moneyTransferWizardData.f56998q) && C41536l.m120484d(this.f56999r, moneyTransferWizardData.f56999r);
    }

    /* renamed from: f */
    public final String mo53167f() {
        return this.f56993l;
    }

    /* renamed from: g */
    public final List mo53168g() {
        return this.f56987f;
    }

    /* renamed from: h */
    public final MoneyTransferCurrenciesUiModel mo53169h() {
        return this.f56998q;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f56985d.hashCode() * 31) + this.f56986e.hashCode()) * 31) + this.f56987f.hashCode()) * 31) + this.f56988g) * 31) + this.f56989h.hashCode()) * 31) + this.f56990i.hashCode()) * 31;
        Double d = this.f56991j;
        int i = 0;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.f56992k;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f56993l;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f56994m.hashCode()) * 31;
        AccountLov accountLov = this.f56995n;
        int hashCode5 = (hashCode4 + (accountLov == null ? 0 : accountLov.hashCode())) * 31;
        List list = this.f56996o;
        int hashCode6 = (((hashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.f56997p) * 31;
        MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel = this.f56998q;
        if (moneyTransferCurrenciesUiModel != null) {
            i = moneyTransferCurrenciesUiModel.hashCode();
        }
        return ((hashCode6 + i) * 31) + this.f56999r.hashCode();
    }

    /* renamed from: i */
    public final String mo53171i() {
        return this.f56990i;
    }

    /* renamed from: j */
    public final String mo53172j() {
        Double d = this.f56991j;
        if (d != null) {
            return C32343x.m95410Q(d.doubleValue(), this.f56990i, false, 2, (Object) null);
        }
        return null;
    }

    /* renamed from: k */
    public final AccountLov mo53173k() {
        return this.f56995n;
    }

    /* renamed from: l */
    public final Country mo53174l() {
        int size = this.f56987f.size();
        int i = this.f56988g;
        boolean z = false;
        if (i >= 0 && i <= size) {
            z = true;
        }
        if (z) {
            return (Country) this.f56987f.get(i);
        }
        return null;
    }

    /* renamed from: m */
    public final String mo53175m() {
        return this.f56989h;
    }

    /* renamed from: p */
    public final int mo53176p() {
        return this.f56988g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.mo53188a();
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo53177q() {
        /*
            r1 = this;
            ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData$Country r0 = r1.mo53174l()
            if (r0 == 0) goto L_0x000c
            java.lang.String r0 = r0.mo53188a()
            if (r0 != 0) goto L_0x000e
        L_0x000c:
            java.lang.String r0 = r1.f56989h
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData.mo53177q():java.lang.String");
    }

    /* renamed from: r */
    public final String mo53178r() {
        List list = this.f56996o;
        if (list != null) {
            return (String) C41358y.m120010Z(list, this.f56997p);
        }
        return null;
    }

    /* renamed from: s */
    public final int mo53179s() {
        return this.f56997p;
    }

    /* renamed from: t */
    public final String mo53180t() {
        return this.f56986e;
    }

    public String toString() {
        String str = this.f56985d;
        String str2 = this.f56986e;
        List list = this.f56987f;
        int i = this.f56988g;
        String str3 = this.f56989h;
        String str4 = this.f56990i;
        Double d = this.f56991j;
        String str5 = this.f56992k;
        String str6 = this.f56993l;
        List list2 = this.f56994m;
        AccountLov accountLov = this.f56995n;
        List list3 = this.f56996o;
        int i2 = this.f56997p;
        MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel = this.f56998q;
        String str7 = this.f56999r;
        return "MoneyTransferWizardData(transferNumber=" + str + ", sender=" + str2 + ", countries=" + list + ", selectedCountryIndex=" + i + ", selectedCountry=" + str3 + ", currency=" + str4 + ", amount=" + d + ", conversionRate=" + str5 + ", convertedAmount=" + str6 + ", accounts=" + list2 + ", selectedAccount=" + accountLov + ", transferCurrencies=" + list3 + ", selectedTransferCurrencyIndex=" + i2 + ", currencies=" + moneyTransferCurrenciesUiModel + ", conversionCurrency=" + str7 + ")";
    }

    /* renamed from: u */
    public final List mo53182u() {
        return this.f56996o;
    }

    /* renamed from: v */
    public final String mo53183v() {
        return this.f56985d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        parcel.writeString(this.f56985d);
        parcel.writeString(this.f56986e);
        List<Country> list = this.f56987f;
        parcel.writeInt(list.size());
        for (Country writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.f56988g);
        parcel.writeString(this.f56989h);
        parcel.writeString(this.f56990i);
        Double d = this.f56991j;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.f56992k);
        parcel.writeString(this.f56993l);
        List<Parcelable> list2 = this.f56994m;
        parcel.writeInt(list2.size());
        for (Parcelable writeParcelable : list2) {
            parcel.writeParcelable(writeParcelable, i);
        }
        parcel.writeParcelable(this.f56995n, i);
        parcel.writeStringList(this.f56996o);
        parcel.writeInt(this.f56997p);
        MoneyTransferCurrenciesUiModel moneyTransferCurrenciesUiModel = this.f56998q;
        if (moneyTransferCurrenciesUiModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            moneyTransferCurrenciesUiModel.writeToParcel(parcel, i);
        }
        parcel.writeString(this.f56999r);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002f, code lost:
        if (r0 != false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        if (r0 != false) goto L_0x0062;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53185x() {
        /*
            r4 = this;
            java.lang.String r0 = r4.f56985d
            boolean r0 = cf1.C40439w.m117118v(r0)
            r1 = 1
            r0 = r0 ^ r1
            r2 = 0
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = r4.mo53182u()
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0018
            goto L_0x001a
        L_0x0018:
            r0 = r2
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            r0 = r0 ^ r1
            if (r0 == 0) goto L_0x003e
            java.util.List r0 = r4.f56996o
            if (r0 == 0) goto L_0x0032
            int r0 = r0.size()
            int r3 = r4.f56997p
            if (r3 < 0) goto L_0x002e
            if (r3 > r0) goto L_0x002e
            r0 = r1
            goto L_0x002f
        L_0x002e:
            r0 = r2
        L_0x002f:
            if (r0 == 0) goto L_0x0067
            goto L_0x003e
        L_0x0032:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Required value was null."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x003e:
            boolean r0 = r4.m68741w()
            if (r0 == 0) goto L_0x0067
            java.util.List r0 = r4.f56987f
            int r0 = r0.size()
            int r3 = r4.f56988g
            if (r3 < 0) goto L_0x0052
            if (r3 > r0) goto L_0x0052
            r0 = r1
            goto L_0x0053
        L_0x0052:
            r0 = r2
        L_0x0053:
            if (r0 != 0) goto L_0x0062
            java.lang.String r0 = r4.f56989h
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x005f
            r0 = r1
            goto L_0x0060
        L_0x005f:
            r0 = r2
        L_0x0060:
            if (r0 == 0) goto L_0x0067
        L_0x0062:
            java.lang.Double r0 = r4.f56991j
            if (r0 == 0) goto L_0x0067
            goto L_0x0068
        L_0x0067:
            r1 = r2
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData.mo53185x():boolean");
    }

    /* renamed from: y */
    public final void mo53186y(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f56999r = str;
    }

    /* renamed from: z */
    public final void mo53187z(String str) {
        this.f56992k = str;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MoneyTransferWizardData(java.lang.String r19, java.lang.String r20, java.util.List r21, int r22, java.lang.String r23, java.lang.String r24, java.lang.Double r25, java.lang.String r26, java.lang.String r27, java.util.List r28, p341ge.bog.mobilebank.model.account.AccountLov r29, java.util.List r30, int r31, p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel r32, java.lang.String r33, int r34, kotlin.jvm.internal.DefaultConstructorMarker r35) {
        /*
            r18 = this;
            r0 = r34
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = ie1.C41341q.m119907j()
            r5 = r1
            goto L_0x000e
        L_0x000c:
            r5 = r21
        L_0x000e:
            r1 = r0 & 8
            r2 = -1
            if (r1 == 0) goto L_0x0015
            r6 = r2
            goto L_0x0017
        L_0x0015:
            r6 = r22
        L_0x0017:
            r1 = r0 & 16
            java.lang.String r3 = ""
            if (r1 == 0) goto L_0x001f
            r7 = r3
            goto L_0x0021
        L_0x001f:
            r7 = r23
        L_0x0021:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0027
            r8 = r3
            goto L_0x0029
        L_0x0027:
            r8 = r24
        L_0x0029:
            r1 = r0 & 64
            r4 = 0
            if (r1 == 0) goto L_0x0030
            r9 = r4
            goto L_0x0032
        L_0x0030:
            r9 = r25
        L_0x0032:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0038
            r10 = r4
            goto L_0x003a
        L_0x0038:
            r10 = r26
        L_0x003a:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0040
            r11 = r4
            goto L_0x0042
        L_0x0040:
            r11 = r27
        L_0x0042:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004c
            java.util.List r1 = ie1.C41341q.m119907j()
            r12 = r1
            goto L_0x004e
        L_0x004c:
            r12 = r28
        L_0x004e:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0054
            r13 = r4
            goto L_0x0056
        L_0x0054:
            r13 = r29
        L_0x0056:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005c
            r14 = r4
            goto L_0x005e
        L_0x005c:
            r14 = r30
        L_0x005e:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0064
            r15 = r2
            goto L_0x0066
        L_0x0064:
            r15 = r31
        L_0x0066:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006d
            r16 = r4
            goto L_0x006f
        L_0x006d:
            r16 = r32
        L_0x006f:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0076
            r17 = r3
            goto L_0x0078
        L_0x0076:
            r17 = r33
        L_0x0078:
            r2 = r18
            r3 = r19
            r4 = r20
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData.<init>(java.lang.String, java.lang.String, java.util.List, int, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, java.lang.String, java.util.List, ge.bog.mobilebank.model.account.AccountLov, java.util.List, int, ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
