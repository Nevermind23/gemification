package p341ge.bog.mobilebank.loans.presentation.details;

import a41.C30483b;
import android.graphics.drawable.Drawable;
import fs0.C32000a;
import fs0.C32001b;
import g91.C32289b0;
import g91.C32300e0;
import g91.C32319m;
import g91.C32343x;
import ie1.C41324h0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lr0.C37129d;
import o31.C37603j;
import o31.C37614q;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.inlinefeedback2.InlineFeedback2;
import p341ge.bog.designsystem.components.productheader.NewProductHeaderView;
import p341ge.bog.designsystem.components.textprogressbar.TextProgressBarView;
import p341ge.bog.mobilebank.loans.presentation.details.C32587a;
import p341ge.bog.mobilebank.loans.presentation.details.C32608g;
import p341ge.bog.mobilebank.model.LoanInvoiceWrapper;
import p341ge.bog.mobilebank.model.loans.Loan;
import p341ge.bog.mobilebank.model.loans.LoanDetails;
import p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper;
import p341ge.bog.mobilebank.model.loans.LoansWrapper;
import p341ge.bog.mobilebank.model.loans.MerchantDetails;
import p341ge.bog.mobilebank.model.loans.history.LoanHistoryItem;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p394dj.C12132a;
import p394dj.C12138g;
import p617ti.C17966a;
import xr0.C39838b;
import xr0.C39840c;

/* renamed from: ge.bog.mobilebank.loans.presentation.details.f */
public final class C32605f {

    /* renamed from: a */
    public static final C32606a f80266a = new C32606a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.f$a */
    public static final class C32606a {
        private C32606a() {
        }

        public /* synthetic */ C32606a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loans.presentation.details.f$b */
    public /* synthetic */ class C32607b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f80267a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                fs0.b[] r0 = fs0.C32001b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                fs0.b r1 = fs0.C32001b.PAYMENT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                fs0.b r1 = fs0.C32001b.PREPAYMENT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                fs0.b r1 = fs0.C32001b.FULL_PREPAYMENT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f80267a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32605f.C32607b.<clinit>():void");
        }
    }

    /* renamed from: a */
    private final Image m96331a(Loan loan, LoanDetailsWrapper loanDetailsWrapper) {
        String str;
        String str2;
        String str3;
        MerchantDetails merchantDetails;
        if (loanDetailsWrapper == null || (merchantDetails = loanDetailsWrapper.mmsDetails) == null) {
            str = null;
        } else {
            str = merchantDetails.merchantLogoURL;
        }
        if (str != null) {
            if (loan != null) {
                str2 = loan.getProdType();
            } else {
                str2 = null;
            }
            if (C41536l.m120484d(str2, "Installment")) {
                MerchantDetails merchantDetails2 = loanDetailsWrapper.mmsDetails;
                if (merchantDetails2 != null) {
                    str3 = merchantDetails2.merchantLogoURL;
                } else {
                    str3 = null;
                }
                String c = C32289b0.m95091c(str3);
                C41536l.m120488h(c, "generateImageUrl(details…Details?.merchantLogoURL)");
                return new Image.Url(c, new Image.Resource(C37129d.illustration_installment, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null);
            }
        }
        return null;
    }

    /* renamed from: b */
    private final List m96332b(LoanHistoryItem loanHistoryItem, String str) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        BigDecimal bigDecimal3;
        String str2;
        BigDecimal bigDecimal4;
        ArrayList arrayList = new ArrayList();
        if (loanHistoryItem != null) {
            long paymentDate = loanHistoryItem.getPaymentDate();
            StringSource.Dictionary dictionary = new StringSource.Dictionary("text.loans.schedule.column.date", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
            String b = C32319m.m95295b(paymentDate);
            C41536l.m120488h(b, "formatDate(date)");
            arrayList.add(new C39840c(dictionary, b));
        }
        StringSource.Dictionary dictionary2 = new StringSource.Dictionary("text.lnd_schedule_col_names.pri_amt", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        BigDecimal bigDecimal5 = null;
        if (loanHistoryItem != null) {
            bigDecimal = loanHistoryItem.getPrincipal();
        } else {
            bigDecimal = null;
        }
        C37614q.m110615a(arrayList, m96334d(dictionary2, bigDecimal, str));
        StringSource.Dictionary dictionary3 = new StringSource.Dictionary("text.lnd_schedule_col_names.int_amt", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        if (loanHistoryItem != null) {
            bigDecimal2 = loanHistoryItem.getInterest();
        } else {
            bigDecimal2 = null;
        }
        C37614q.m110615a(arrayList, m96334d(dictionary3, bigDecimal2, str));
        StringSource.Dictionary dictionary4 = new StringSource.Dictionary("text.lnd_repeyment_col_names.penalty", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        if (loanHistoryItem != null) {
            bigDecimal3 = loanHistoryItem.getPenalty();
        } else {
            bigDecimal3 = null;
        }
        C37614q.m110615a(arrayList, m96334d(dictionary4, bigDecimal3, str));
        if (loanHistoryItem != null) {
            str2 = loanHistoryItem.getFeeTypeDictionaryKey();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        } else {
            C41536l.m120488h(str2, "lndRepayment?.feeTypeDictionaryKey ?: \"\"");
        }
        StringSource.Dictionary dictionary5 = new StringSource.Dictionary(str2, (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        if (loanHistoryItem != null) {
            bigDecimal4 = loanHistoryItem.getScheduledFee();
        } else {
            bigDecimal4 = null;
        }
        C37614q.m110615a(arrayList, m96334d(dictionary5, bigDecimal4, str));
        StringSource.Dictionary dictionary6 = new StringSource.Dictionary("text.loans.details.insurance.amnt", (Boolean) null, (List) null, 6, (DefaultConstructorMarker) null);
        if (loanHistoryItem != null) {
            bigDecimal5 = loanHistoryItem.getInsAmt();
        }
        C37614q.m110615a(arrayList, m96334d(dictionary6, bigDecimal5, str));
        return arrayList;
    }

    /* renamed from: c */
    private final String m96333c(Loan loan, LoanDetailsWrapper loanDetailsWrapper, Map map) {
        MerchantDetails merchantDetails;
        if (C41536l.m120484d(loan.getProdType(), "Installment")) {
            String str = null;
            if (loanDetailsWrapper != null) {
                merchantDetails = loanDetailsWrapper.mmsDetails;
            } else {
                merchantDetails = null;
            }
            if (merchantDetails != null) {
                MerchantDetails merchantDetails2 = loanDetailsWrapper.mmsDetails;
                if (merchantDetails2 != null) {
                    str = merchantDetails2.merchantName;
                }
                if (str == null) {
                    return "";
                }
                return str;
            }
        }
        String str2 = (String) map.get(Long.valueOf(loan.getLoanKey()));
        if (str2 == null) {
            str2 = loan.getLoanName();
        }
        String str3 = str2;
        if (str3 == null) {
            return C32343x.m95388F(loan.getProductDictionaryKey(), new Object[0]);
        }
        return str3;
    }

    /* renamed from: d */
    private final C39840c m96334d(StringSource stringSource, BigDecimal bigDecimal, String str) {
        if (bigDecimal == null || !C37603j.m110583f(bigDecimal) || str == null) {
            return null;
        }
        return new C39840c(stringSource, C32343x.m95408P(bigDecimal, str));
    }

    /* renamed from: e */
    private final C32000a m96335e(LoanDetailsWrapper loanDetailsWrapper, String str) {
        LoanInvoiceWrapper loanInvoiceWrapper;
        String P;
        String P2;
        C32000a aVar = null;
        if (loanDetailsWrapper != null) {
            loanInvoiceWrapper = loanDetailsWrapper.getInvoice();
        } else {
            loanInvoiceWrapper = null;
        }
        String str2 = "";
        if (loanInvoiceWrapper != null && !loanInvoiceWrapper.isOverdue.booleanValue()) {
            InlineFeedback2.C13350a aVar2 = InlineFeedback2.C13350a.PENDING;
            BigDecimal amount = loanInvoiceWrapper.getAmount();
            if (!(amount == null || (P2 = C32343x.m95408P(amount, str)) == null)) {
                str2 = P2;
            }
            aVar = new C32000a(aVar2, str2);
        } else if (loanInvoiceWrapper != null) {
            Boolean bool = loanInvoiceWrapper.isOverdue;
            C41536l.m120488h(bool, "invoice.isOverdue");
            if (bool.booleanValue()) {
                InlineFeedback2.C13350a aVar3 = InlineFeedback2.C13350a.NEGATIVE;
                BigDecimal amount2 = loanInvoiceWrapper.getAmount();
                if (!(amount2 == null || (P = C32343x.m95408P(amount2, str)) == null)) {
                    str2 = P;
                }
                aVar = new C32000a(aVar3, str2);
            }
        }
        return aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: ge.bog.mobilebank.shared.helper.StringSource$Dictionary} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: ge.bog.mobilebank.shared.helper.StringSource$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: ge.bog.mobilebank.shared.helper.StringSource$Dictionary} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: ge.bog.mobilebank.shared.helper.StringSource$Dictionary} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List m96336f(p341ge.bog.mobilebank.model.loans.schedule.LoanSchedule r19, java.lang.String r20, boolean r21, java.math.BigDecimal r22) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            xr0.c r4 = new xr0.c
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r11 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r6 = "text.loans.schedule.column.date"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            long r5 = r1.payDate
            java.lang.String r5 = g91.C32319m.m95295b(r5)
            java.lang.String r6 = "formatDate(schedule.payDate)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r4.<init>(r11, r5)
            r3.add(r4)
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r13 = "text.lnd_schedule_col_names.pri_amt"
            r14 = 0
            r15 = 0
            r16 = 6
            r17 = 0
            r12 = r4
            r12.<init>(r13, r14, r15, r16, r17)
            java.math.BigDecimal r5 = r19.getPriAmt()
            xr0.c r4 = r0.m96334d(r4, r5, r2)
            o31.C37614q.m110615a(r3, r4)
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r6 = "text.lnd_schedule_col_names.int_amt"
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            java.math.BigDecimal r5 = r19.getIntAmtWithoutOffset()
            xr0.c r4 = r0.m96334d(r4, r5, r2)
            o31.C37614q.m110615a(r3, r4)
            java.lang.String r4 = r1.feeTypeDictionaryKey
            if (r4 == 0) goto L_0x006c
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r6 = r1.feeTypeDictionaryKey
            java.lang.String r5 = "schedule.feeTypeDictionaryKey"
            kotlin.jvm.internal.C41536l.m120488h(r6, r5)
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            goto L_0x0075
        L_0x006c:
            ge.bog.mobilebank.shared.helper.StringSource$Resource r4 = new ge.bog.mobilebank.shared.helper.StringSource$Resource
            int r5 = lr0.C37133h.f89454c
            r6 = 2
            r7 = 0
            r4.<init>(r5, r7, r6, r7)
        L_0x0075:
            java.math.BigDecimal r5 = r19.getFeeAmt()
            xr0.c r4 = r0.m96334d(r4, r5, r2)
            o31.C37614q.m110615a(r3, r4)
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r6 = "text.loans.schedule.column.ins_amt"
            r7 = 0
            r8 = 0
            r9 = 6
            r10 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            java.math.BigDecimal r5 = r19.getInsAmt()
            xr0.c r4 = r0.m96334d(r4, r5, r2)
            o31.C37614q.m110615a(r3, r4)
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r4 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r6 = "text.loans.schedule.column.rli_amt"
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            java.math.BigDecimal r1 = r19.getRliAmt()
            xr0.c r1 = r0.m96334d(r4, r1, r2)
            o31.C37614q.m110615a(r3, r1)
            if (r21 == 0) goto L_0x00c1
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r1 = new ge.bog.mobilebank.shared.helper.StringSource$Dictionary
            java.lang.String r5 = "text.loan.schedule.column.offset"
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r4 = r22
            xr0.c r1 = r0.m96334d(r1, r4, r2)
            o31.C37614q.m110615a(r3, r1)
        L_0x00c1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32605f.m96336f(ge.bog.mobilebank.model.loans.schedule.LoanSchedule, java.lang.String, boolean, java.math.BigDecimal):java.util.List");
    }

    /* renamed from: g */
    private final String m96337g(LoanDetailsWrapper loanDetailsWrapper) {
        long j;
        long j2;
        String str = "";
        if (loanDetailsWrapper == null || (loanDetailsWrapper.getPlnDetails() == null && loanDetailsWrapper.getDetails() == null)) {
            return str;
        }
        if (loanDetailsWrapper.getPlnDetails() != null) {
            j = loanDetailsWrapper.getPlnDetails().getStartDate();
        } else {
            j = loanDetailsWrapper.getDetails().getSignedDate();
        }
        if (loanDetailsWrapper.getPlnDetails() != null) {
            j2 = loanDetailsWrapper.getPlnDetails().getMaturityDate();
        } else {
            j2 = loanDetailsWrapper.getDetails().getMatureDate();
        }
        if (j2 > 0) {
            str = " - " + C32319m.m95295b(j2);
        }
        return C32319m.m95295b(j) + str;
    }

    /* renamed from: j */
    private final List m96338j(Map map, LoansWrapper loansWrapper) {
        LoanDetailsWrapper loanDetailsWrapper;
        T t;
        boolean z;
        ArrayList arrayList = new ArrayList();
        ArrayList<Loan> loans = loansWrapper.getLoans();
        C41536l.m120488h(loans, "loansWrapper.loans");
        for (Loan loan : loans) {
            ArrayList<LoanDetailsWrapper> details = loansWrapper.getDetails();
            Image image = null;
            if (details != null) {
                C41536l.m120488h(details, "details");
                Iterator<T> it = details.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((LoanDetailsWrapper) t).getLoanKey() == loan.getLoanKey()) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                loanDetailsWrapper = (LoanDetailsWrapper) t;
            } else {
                loanDetailsWrapper = null;
            }
            double doubleValue = loan.getAmount().doubleValue();
            String ccy = loan.getCcy();
            C41536l.m120488h(ccy, "loan.ccy");
            C17966a aVar = new C17966a(doubleValue, ccy);
            Image a = m96331a(loan, loanDetailsWrapper);
            if (a == null) {
                C39838b.C39839a aVar2 = C39838b.f94557f;
                String prodType = loan.getProdType();
                if (prodType == null) {
                    prodType = "";
                } else {
                    C41536l.m120488h(prodType, "loan?.prodType ?: \"\"");
                }
                C39838b a2 = aVar2.mo93543a(prodType);
                if (a2 != null) {
                    image = a2.mo93541b();
                }
            }
            C41536l.m120488h(loan, "loan");
            arrayList.add(new C30483b(new C12132a(m96333c(loan, loanDetailsWrapper, map), C41339p.m119900e(aVar), (List) null, (TextProgressBarView.ProgressModel) null, (C12138g) null, false, false, 76, (DefaultConstructorMarker) null), (String) null, image, NewProductHeaderView.C13482a.COLOR_LOAN, loan.getLoanKey(), a));
        }
        return arrayList;
    }

    /* renamed from: h */
    public final C32608g.C32609a mo74113h(LoanDetailsWrapper loanDetailsWrapper, List list, boolean z, String str) {
        C32000a aVar;
        String str2;
        int i;
        LoanDetails details;
        C41536l.m120489i(list, "productFunctions");
        if (str != null) {
            aVar = m96335e(loanDetailsWrapper, str);
        } else {
            aVar = null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new C32587a.C32592e("text.loans.payment.button"));
        } else {
            C32001b.C32002a aVar2 = C32001b.f78787e;
            if (loanDetailsWrapper == null || (details = loanDetailsWrapper.getDetails()) == null) {
                str2 = null;
            } else {
                str2 = details.getRepaymentFlag();
            }
            C32001b a = aVar2.mo72498a(str2);
            if (a == null) {
                i = -1;
            } else {
                i = C32607b.f80267a[a.ordinal()];
            }
            if (i == 1) {
                arrayList.add(new C32587a.C32590c("text.loans.payment.button"));
            } else if (i == 2) {
                arrayList.add(new C32587a.C32591d("text.loans.part_payment.button"));
                arrayList.add(new C32587a.C32589b("text.loans.full_payment.button"));
            } else if (i == 3) {
                arrayList.add(new C32587a.C32589b("text.loans.full_payment.button"));
            }
        }
        if (list.contains("REVERSAL")) {
            arrayList.add(new C32587a.C32588a("online.inst.product.button.reversal"));
        }
        if (list.contains("REVERSAL_STATUS")) {
            arrayList.add(new C32587a.C32593f("online.inst.product.button.reversal.status"));
        }
        if (aVar != null || !arrayList.isEmpty()) {
            return new C32608g.C32609a(aVar, arrayList);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:125:0x017a, code lost:
        if (r2 != null) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x01a6, code lost:
        if (r3 != null) goto L_0x01a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x00ec, code lost:
        if (r11 != null) goto L_0x00ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01cf  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x01de  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x01e3  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x01fc  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x020b  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00d4  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32610b mo74114i(java.lang.String r28, p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper r29, p341ge.bog.mobilebank.model.loans.Loan r30, java.lang.String r31) {
        /*
            r27 = this;
            r0 = r29
            r1 = r31
            r2 = 0
            if (r1 != 0) goto L_0x0008
            return r2
        L_0x0008:
            r3 = 1
            r4 = 0
            if (r30 == 0) goto L_0x0014
            boolean r5 = r30.isLnd()
            if (r5 != r3) goto L_0x0014
            r5 = r3
            goto L_0x0015
        L_0x0014:
            r5 = r4
        L_0x0015:
            if (r5 == 0) goto L_0x002b
            if (r0 == 0) goto L_0x002b
            ge.bog.mobilebank.model.loans.LoanDetails r5 = r29.getDetails()
            if (r5 == 0) goto L_0x002b
            java.math.BigDecimal r5 = r5.getRemainingInterest()
            if (r5 == 0) goto L_0x002b
            java.lang.String r5 = g91.C32343x.m95408P(r5, r1)
            r13 = r5
            goto L_0x002c
        L_0x002b:
            r13 = r2
        L_0x002c:
            if (r30 == 0) goto L_0x0036
            boolean r5 = r30.isMortgage()
            if (r5 != r3) goto L_0x0036
            r5 = r3
            goto L_0x0037
        L_0x0036:
            r5 = r4
        L_0x0037:
            if (r5 == 0) goto L_0x0048
            if (r0 == 0) goto L_0x0048
            java.math.BigDecimal r5 = r29.getTotalOffsetAmount()
            if (r5 == 0) goto L_0x0048
            java.lang.String r5 = g91.C32343x.m95408P(r5, r1)
            r17 = r5
            goto L_0x004a
        L_0x0048:
            r17 = r2
        L_0x004a:
            if (r0 == 0) goto L_0x005a
            ge.bog.mobilebank.model.loans.LoanDetails r5 = r29.getDetails()
            if (r5 == 0) goto L_0x005a
            boolean r5 = r5.hasInsFlag()
            if (r5 != r3) goto L_0x005a
            r5 = r3
            goto L_0x005b
        L_0x005a:
            r5 = r4
        L_0x005b:
            if (r5 == 0) goto L_0x0070
            ge.bog.mobilebank.model.loans.LoanDetails r5 = r29.getDetails()
            if (r5 == 0) goto L_0x0070
            java.math.BigDecimal r5 = r5.getInsAmount()
            if (r5 == 0) goto L_0x0070
            java.lang.String r5 = g91.C32343x.m95408P(r5, r1)
            r18 = r5
            goto L_0x0072
        L_0x0070:
            r18 = r2
        L_0x0072:
            ge.bog.mobilebank.loans.presentation.details.g$b r5 = new ge.bog.mobilebank.loans.presentation.details.g$b
            if (r28 == 0) goto L_0x0083
            int r6 = r28.length()
            if (r6 <= 0) goto L_0x007e
            r6 = r3
            goto L_0x007f
        L_0x007e:
            r6 = r4
        L_0x007f:
            if (r6 != r3) goto L_0x0083
            r6 = r3
            goto L_0x0084
        L_0x0083:
            r6 = r4
        L_0x0084:
            if (r6 == 0) goto L_0x008c
            ge.bog.mobilebank.shared.helper.StringSource$Raw r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101749c(r28)
        L_0x008a:
            r7 = r6
            goto L_0x009d
        L_0x008c:
            if (r30 == 0) goto L_0x009b
            java.lang.String r6 = r30.getProductDictionaryKey()
            if (r6 == 0) goto L_0x009b
            java.lang.Object[] r7 = new java.lang.Object[r4]
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r6, r7)
            goto L_0x008a
        L_0x009b:
            r6 = r2
            goto L_0x008a
        L_0x009d:
            if (r30 == 0) goto L_0x00af
            java.lang.String r6 = r30.getProductDictionaryKey()
            if (r6 == 0) goto L_0x00af
            java.lang.Object[] r8 = new java.lang.Object[r4]
            ge.bog.mobilebank.shared.helper.StringSource$Dictionary r6 = p341ge.bog.mobilebank.shared.helper.C34646b.m101748b(r6, r8)
            r15 = r27
            r8 = r6
            goto L_0x00b2
        L_0x00af:
            r15 = r27
            r8 = r2
        L_0x00b2:
            java.lang.String r9 = r15.m96337g(r0)
            if (r0 == 0) goto L_0x00c7
            ge.bog.mobilebank.model.loans.PLNDetails r6 = r29.getPlnDetails()
            if (r6 == 0) goto L_0x00c7
            java.lang.String r6 = r6.getAcctNo()
            if (r6 != 0) goto L_0x00c5
            goto L_0x00c7
        L_0x00c5:
            r10 = r6
            goto L_0x00d5
        L_0x00c7:
            if (r0 == 0) goto L_0x00d4
            ge.bog.mobilebank.model.loans.LoanDetails r6 = r29.getDetails()
            if (r6 == 0) goto L_0x00d4
            java.lang.String r6 = r6.getLinkAcctNo()
            goto L_0x00c5
        L_0x00d4:
            r10 = r2
        L_0x00d5:
            java.lang.String r6 = ""
            if (r30 == 0) goto L_0x00ee
            java.math.BigDecimal r11 = r30.getAmount()
            if (r11 == 0) goto L_0x00ee
            java.lang.String r12 = r30.getCcy()
            java.lang.String r14 = "loan.ccy"
            kotlin.jvm.internal.C41536l.m120488h(r12, r14)
            java.lang.String r11 = g91.C32343x.m95408P(r11, r12)
            if (r11 != 0) goto L_0x00ef
        L_0x00ee:
            r11 = r6
        L_0x00ef:
            if (r0 == 0) goto L_0x00fd
            ge.bog.mobilebank.model.loans.PLNDetails r12 = r29.getPlnDetails()
            if (r12 == 0) goto L_0x00fd
            java.math.BigDecimal r12 = r12.getInitialPrincipal()
            if (r12 != 0) goto L_0x010b
        L_0x00fd:
            if (r0 == 0) goto L_0x010a
            ge.bog.mobilebank.model.loans.LoanDetails r12 = r29.getDetails()
            if (r12 == 0) goto L_0x010a
            java.math.BigDecimal r12 = r12.getInitialPrincipal()
            goto L_0x010b
        L_0x010a:
            r12 = r2
        L_0x010b:
            if (r12 == 0) goto L_0x0114
            java.lang.String r12 = g91.C32343x.m95408P(r12, r1)
            if (r12 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r12 = r6
        L_0x0115:
            if (r0 == 0) goto L_0x0128
            ge.bog.mobilebank.model.loans.PLNDetails r14 = r29.getPlnDetails()
            if (r14 == 0) goto L_0x0128
            java.math.BigDecimal r14 = r14.getIntAmount()
            if (r14 == 0) goto L_0x0128
            java.lang.String r14 = g91.C32343x.m95408P(r14, r1)
            goto L_0x0129
        L_0x0128:
            r14 = r2
        L_0x0129:
            if (r0 == 0) goto L_0x013c
            ge.bog.mobilebank.model.loans.PLNDetails r16 = r29.getPlnDetails()
            if (r16 == 0) goto L_0x013c
            java.math.BigDecimal r2 = r16.getPenalty()
            if (r2 == 0) goto L_0x013c
            java.lang.String r1 = g91.C32343x.m95408P(r2, r1)
            goto L_0x013d
        L_0x013c:
            r1 = 0
        L_0x013d:
            if (r0 == 0) goto L_0x014b
            ge.bog.mobilebank.model.loans.PLNDetails r2 = r29.getPlnDetails()
            if (r2 == 0) goto L_0x014b
            java.math.BigDecimal r2 = r2.getInterestRate()
            if (r2 != 0) goto L_0x0159
        L_0x014b:
            if (r0 == 0) goto L_0x0158
            ge.bog.mobilebank.model.loans.LoanDetails r2 = r29.getDetails()
            if (r2 == 0) goto L_0x0158
            java.math.BigDecimal r2 = r2.getInterestRate()
            goto L_0x0159
        L_0x0158:
            r2 = 0
        L_0x0159:
            if (r2 == 0) goto L_0x017d
            double r20 = r2.doubleValue()
            java.lang.Double r2 = java.lang.Double.valueOf(r20)
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L_0x017d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = " %"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            if (r2 == 0) goto L_0x017d
            goto L_0x017e
        L_0x017d:
            r2 = r6
        L_0x017e:
            if (r0 == 0) goto L_0x018b
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x018b
            java.lang.String r3 = r3.getFileUrl()
            goto L_0x018c
        L_0x018b:
            r3 = 0
        L_0x018c:
            if (r3 != 0) goto L_0x01a8
            if (r0 == 0) goto L_0x0199
            ge.bog.mobilebank.model.loans.PLNDetails r3 = r29.getPlnDetails()
            if (r3 == 0) goto L_0x0199
            java.lang.String r3 = r3.fileUrl
            goto L_0x019a
        L_0x0199:
            r3 = 0
        L_0x019a:
            if (r3 == 0) goto L_0x01a9
            ge.bog.mobilebank.model.loans.PLNDetails r3 = r29.getPlnDetails()
            if (r3 == 0) goto L_0x01a5
            java.lang.String r3 = r3.fileId
            goto L_0x01a6
        L_0x01a5:
            r3 = 0
        L_0x01a6:
            if (r3 == 0) goto L_0x01a9
        L_0x01a8:
            r4 = 1
        L_0x01a9:
            if (r0 == 0) goto L_0x01b6
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x01b6
            java.lang.String r3 = r3.nextFloatingRate
            r20 = r3
            goto L_0x01b8
        L_0x01b6:
            r20 = 0
        L_0x01b8:
            if (r0 == 0) goto L_0x01c5
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x01c5
            java.lang.Long r3 = r3.nextLoanRateChangeDate
            r21 = r3
            goto L_0x01c7
        L_0x01c5:
            r21 = 0
        L_0x01c7:
            if (r0 == 0) goto L_0x01d4
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x01d4
            java.lang.Float r3 = r3.nextSpreadRate
            r22 = r3
            goto L_0x01d6
        L_0x01d4:
            r22 = 0
        L_0x01d6:
            if (r0 == 0) goto L_0x01e3
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x01e3
            java.lang.Float r3 = r3.nextMinIntRate
            r23 = r3
            goto L_0x01e5
        L_0x01e3:
            r23 = 0
        L_0x01e5:
            if (r0 == 0) goto L_0x01f2
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x01f2
            java.lang.String r3 = r3.nextLoanIntTypeName
            r24 = r3
            goto L_0x01f4
        L_0x01f2:
            r24 = 0
        L_0x01f4:
            if (r0 == 0) goto L_0x0201
            ge.bog.mobilebank.model.loans.LoanDetails r3 = r29.getDetails()
            if (r3 == 0) goto L_0x0201
            java.lang.String r3 = r3.nextLoanIntTypeDictionaryKey
            r25 = r3
            goto L_0x0203
        L_0x0201:
            r25 = 0
        L_0x0203:
            if (r0 == 0) goto L_0x0210
            ge.bog.mobilebank.model.loans.LoanDetails r0 = r29.getDetails()
            if (r0 == 0) goto L_0x0210
            java.lang.String r0 = r0.nextLoanIntTypeDictionaryValue
            r26 = r0
            goto L_0x0212
        L_0x0210:
            r26 = 0
        L_0x0212:
            r6 = r5
            r15 = r1
            r16 = r2
            r19 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32605f.mo74114i(java.lang.String, ge.bog.mobilebank.model.loans.LoanDetailsWrapper, ge.bog.mobilebank.model.loans.Loan, java.lang.String):ge.bog.mobilebank.loans.presentation.details.g$b");
    }

    /* renamed from: k */
    public final C32608g.C32612d mo74115k(LoanDetailsWrapper loanDetailsWrapper) {
        LoanDetails loanDetails;
        String str;
        Float f;
        Float f2;
        Long l;
        String str2;
        String str3;
        String str4;
        String str5;
        Long l2;
        Float f3;
        Float f4;
        String str6;
        String str7;
        String str8 = null;
        if (loanDetailsWrapper != null) {
            loanDetails = loanDetailsWrapper.getDetails();
        } else {
            loanDetails = null;
        }
        C32300e0 e0Var = C32300e0.f79712a;
        Object[] objArr = new Object[6];
        if (loanDetails != null) {
            str = loanDetails.nextFloatingRate;
        } else {
            str = null;
        }
        objArr[0] = str;
        if (loanDetails != null) {
            f = loanDetails.nextSpreadRate;
        } else {
            f = null;
        }
        objArr[1] = f;
        if (loanDetails != null) {
            f2 = loanDetails.nextMinIntRate;
        } else {
            f2 = null;
        }
        objArr[2] = f2;
        if (loanDetails != null) {
            l = loanDetails.nextLoanRateChangeDate;
        } else {
            l = null;
        }
        objArr[3] = l;
        if (loanDetails != null) {
            str2 = loanDetails.nextLoanIntTypeDictionaryKey;
        } else {
            str2 = null;
        }
        objArr[4] = str2;
        if (loanDetails != null) {
            str3 = loanDetails.nextLoanIntTypeDictionaryValue;
        } else {
            str3 = null;
        }
        objArr[5] = str3;
        if (e0Var.mo72816a(objArr)) {
            if (loanDetails != null) {
                str4 = loanDetails.nextFloatingRate;
            } else {
                str4 = null;
            }
            if (!C41536l.m120484d(str4, "N")) {
                if (loanDetails != null) {
                    str5 = loanDetails.nextFloatingRate;
                } else {
                    str5 = null;
                }
                if (loanDetails != null) {
                    l2 = loanDetails.nextLoanRateChangeDate;
                } else {
                    l2 = null;
                }
                if (loanDetails != null) {
                    f3 = loanDetails.nextSpreadRate;
                } else {
                    f3 = null;
                }
                if (loanDetails != null) {
                    f4 = loanDetails.nextMinIntRate;
                } else {
                    f4 = null;
                }
                if (loanDetails != null) {
                    str6 = loanDetails.nextLoanIntTypeName;
                } else {
                    str6 = null;
                }
                if (loanDetails != null) {
                    str7 = loanDetails.nextLoanIntTypeDictionaryKey;
                } else {
                    str7 = null;
                }
                if (loanDetails != null) {
                    str8 = loanDetails.nextLoanIntTypeDictionaryValue;
                }
                return new C32608g.C32612d(str5, l2, f3, f4, str6, str7, str8);
            }
        }
        return null;
    }

    /* renamed from: l */
    public final C32608g.C32615g mo74116l(LoanDetailsWrapper loanDetailsWrapper, String str) {
        BigDecimal bigDecimal;
        String str2;
        String str3 = null;
        if (loanDetailsWrapper == null || str == null || loanDetailsWrapper.getPlnRepayment() == null) {
            return null;
        }
        LoanHistoryItem plnRepayment = loanDetailsWrapper.getPlnRepayment();
        if (plnRepayment != null) {
            bigDecimal = plnRepayment.getAmount();
        } else {
            bigDecimal = null;
        }
        LoanHistoryItem plnRepayment2 = loanDetailsWrapper.getPlnRepayment();
        if (plnRepayment2 != null) {
            str2 = C32319m.m95295b(plnRepayment2.getOperDate());
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        LoanHistoryItem plnRepayment3 = loanDetailsWrapper.getPlnRepayment();
        if (plnRepayment3 != null) {
            str3 = plnRepayment3.getOperTypeDictionaryKey();
        }
        return new C32608g.C32615g(bigDecimal, str, str2, str3);
    }

    /* renamed from: m */
    public final C32608g.C32616h mo74117m(Map map, LoansWrapper loansWrapper, Long l) {
        int i;
        Integer num;
        Object obj;
        boolean z;
        C41536l.m120489i(map, "mapOfNames");
        C41536l.m120489i(loansWrapper, "loansWrapper");
        List j = m96338j(map, loansWrapper);
        Iterator it = C41358y.m119995F0(j).iterator();
        while (true) {
            i = 0;
            num = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            long a = ((C30483b) ((C41324h0) obj).mo95946d()).mo70820a();
            if (l != null && a == l.longValue()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C41324h0 h0Var = (C41324h0) obj;
        if (h0Var != null) {
            num = Integer.valueOf(h0Var.mo95945c());
        }
        if (num != null) {
            i = num.intValue();
        }
        return new C32608g.C32616h(j, i);
    }

    /* renamed from: n */
    public final C32608g.C32613e mo74118n(LoanDetailsWrapper loanDetailsWrapper, Loan loan) {
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        String str;
        String str2;
        LoanDetails details;
        if (loan != null) {
            bigDecimal = loan.getAmount();
        } else {
            bigDecimal = null;
        }
        if (loanDetailsWrapper == null || (details = loanDetailsWrapper.getDetails()) == null) {
            bigDecimal2 = null;
        } else {
            bigDecimal2 = details.getInitialPrincipal();
        }
        if (loan != null) {
            str = loan.getCcy();
        } else {
            str = null;
        }
        if (loan != null) {
            str2 = loan.getProdType();
        } else {
            str2 = null;
        }
        if (!C41536l.m120484d(str2, "Installment") || str == null || bigDecimal == null || bigDecimal2 == null) {
            return null;
        }
        BigDecimal subtract = bigDecimal2.subtract(bigDecimal);
        C41536l.m120488h(subtract, "initialPrincipal.subtract(amount)");
        return new C32608g.C32613e(str, bigDecimal2, subtract);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: xr0.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p341ge.bog.mobilebank.loans.presentation.details.C32608g.C32617i mo74119o(p341ge.bog.mobilebank.model.loans.LoanDetailsWrapper r7, java.lang.String r8, boolean r9) {
        /*
            r6 = this;
            r0 = 0
            if (r7 == 0) goto L_0x0086
            if (r8 == 0) goto L_0x0086
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r1 = r7.getSchedule()
            if (r1 != 0) goto L_0x0013
            ge.bog.mobilebank.model.loans.history.LoanHistoryItem r1 = r7.getLndRepayment()
            if (r1 != 0) goto L_0x0013
            goto L_0x0086
        L_0x0013:
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r1 = r7.getSchedule()
            if (r1 == 0) goto L_0x004e
            xr0.d r1 = new xr0.d
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r2 = r7.getSchedule()
            java.math.BigDecimal r2 = r2.getNextPayAmt()
            java.lang.String r3 = "details.schedule.nextPayAmt"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r3 = r7.getSchedule()
            java.lang.String r4 = "details.schedule"
            kotlin.jvm.internal.C41536l.m120488h(r3, r4)
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r4 = r7.getSchedule()
            java.lang.String r4 = r4.getCcy()
            java.lang.String r5 = "details.schedule.ccy"
            kotlin.jvm.internal.C41536l.m120488h(r4, r5)
            ge.bog.mobilebank.model.loans.LoanDetails r5 = r7.getDetails()
            java.math.BigDecimal r5 = r5.getOffsetIntSaved()
            java.util.List r9 = r6.m96336f(r3, r4, r9, r5)
            r1.<init>(r2, r8, r9)
            goto L_0x004f
        L_0x004e:
            r1 = r0
        L_0x004f:
            ge.bog.mobilebank.model.loans.history.LoanHistoryItem r9 = r7.getLndRepayment()
            if (r9 == 0) goto L_0x0080
            xr0.a r9 = new xr0.a
            ge.bog.mobilebank.model.loans.history.LoanHistoryItem r2 = r7.getLndRepayment()
            if (r2 == 0) goto L_0x0063
            java.math.BigDecimal r2 = r2.getAmountPaid()
            if (r2 != 0) goto L_0x0065
        L_0x0063:
            java.math.BigDecimal r2 = java.math.BigDecimal.ZERO
        L_0x0065:
            java.lang.String r3 = "details.lndRepayment?.am…       ?: BigDecimal.ZERO"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            ge.bog.mobilebank.model.loans.history.LoanHistoryItem r3 = r7.getLndRepayment()
            ge.bog.mobilebank.model.loans.schedule.LoanSchedule r7 = r7.getSchedule()
            if (r7 == 0) goto L_0x0078
            java.lang.String r0 = r7.getCcy()
        L_0x0078:
            java.util.List r7 = r6.m96332b(r3, r0)
            r9.<init>(r2, r8, r7)
            r0 = r9
        L_0x0080:
            ge.bog.mobilebank.loans.presentation.details.g$i r7 = new ge.bog.mobilebank.loans.presentation.details.g$i
            r7.<init>(r1, r0)
            return r7
        L_0x0086:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loans.presentation.details.C32605f.mo74119o(ge.bog.mobilebank.model.loans.LoanDetailsWrapper, java.lang.String, boolean):ge.bog.mobilebank.loans.presentation.details.g$i");
    }
}
