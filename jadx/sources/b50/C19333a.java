package b50;

import com.salesforce.marketingcloud.C11398b;
import f50.C20432f;
import g91.C32303f;
import g91.C32319m;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.domain.home.model.ProductType;
import p341ge.bog.mobilebank.model.account.AccountOperation;
import p341ge.bog.mobilebank.model.bonus.BonusType;
import p366bk.C10318g;

/* renamed from: b50.a */
public abstract class C19333a {

    /* renamed from: b50.a$a */
    public /* synthetic */ class C19334a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53554a;

        static {
            int[] iArr = new int[C19335b.values().length];
            try {
                iArr[C19335b.CASHBACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f53554a = iArr;
        }
    }

    /* renamed from: a */
    public static final void m64782a(List list, C20432f.C20434b.C20436b bVar, boolean z) {
        long j;
        C41536l.m120489i(list, "<this>");
        C41536l.m120489i(bVar, "item");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMM, yyyy", Locale.getDefault());
        Long e = bVar.mo48931e();
        if (e != null) {
            j = e.longValue();
        } else {
            j = C32319m.m95305l();
        }
        String format = simpleDateFormat.format(new Date(j));
        if (list.size() == 0) {
            list.add(new C20432f.C20434b.C20435a(format, z));
        } else {
            Object i0 = C41358y.m120019i0(list);
            C41536l.m120487g(i0, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.pfm.transactions.TransactionViewHolder.OperationUiModel.OperationDetailsUiModel");
            C20432f.C20434b.C20436b bVar2 = (C20432f.C20434b.C20436b) i0;
            if (bVar2.mo48931e() != null && !C41536l.m120484d(format, simpleDateFormat.format(bVar2.mo48931e()))) {
                list.add(new C20432f.C20434b.C20435a(format, false));
            }
        }
        list.add(bVar);
    }

    /* renamed from: b */
    public static /* synthetic */ void m64783b(List list, C20432f.C20434b.C20436b bVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        m64782a(list, bVar, z);
    }

    /* renamed from: c */
    public static final C19335b m64784c(String str) {
        if (str == null) {
            return null;
        }
        if (C41536l.m120484d(str, "AMEX")) {
            return C19335b.MR;
        }
        if (C41536l.m120484d(str, ProductType.BONUS_PROD_TYPE_CASHBACK)) {
            return C19335b.CASHBACK;
        }
        if (C41536l.m120484d(str, BonusType.PLUS.getStringValue())) {
            return C19335b.PLUS;
        }
        return null;
    }

    /* renamed from: d */
    public static final C20432f.C20434b.C20436b m64785d(AccountOperation accountOperation) {
        C19336c cVar;
        int i;
        BigDecimal bigDecimal;
        Integer num;
        String str;
        BigDecimal cashbackAmount;
        C41536l.m120489i(accountOperation, "<this>");
        BigDecimal amount = accountOperation.getAmount();
        if (amount == null) {
            amount = new BigDecimal(0);
        }
        String n = C32303f.m95203n(amount.negate(), accountOperation.getCcy());
        if (amount.compareTo(new BigDecimal(0)) < 0) {
            cVar = C19336c.POSITIVE;
        } else if (amount.compareTo(new BigDecimal(0)) > 0) {
            cVar = C19336c.NEGATIVE;
        } else {
            cVar = C19336c.NEUTRAL;
        }
        C19336c cVar2 = cVar;
        C19335b c = m64784c(accountOperation.getBonusPointType());
        if (c == null) {
            i = -1;
        } else {
            i = C19334a.f53554a[c.ordinal()];
        }
        if (i != -1) {
            if (i != 1) {
                cashbackAmount = accountOperation.getBonusPoint();
            } else {
                cashbackAmount = accountOperation.getCashbackAmount();
            }
            bigDecimal = cashbackAmount;
        } else {
            bigDecimal = null;
        }
        if (cVar2 == C19336c.POSITIVE) {
            num = Integer.valueOf(C10318g.f28641c1);
        } else {
            num = null;
        }
        String benefProfilePicture = accountOperation.getBenefProfilePicture();
        if (benefProfilePicture == null) {
            benefProfilePicture = accountOperation.getImageUrl();
        }
        String str2 = benefProfilePicture;
        if (c != null) {
            str = c.mo47537b();
        } else {
            str = null;
        }
        return new C20432f.C20434b.C20436b(num, bigDecimal, str, str2, Boolean.valueOf(C41536l.m120484d(str2, accountOperation.getGroupImageUrl())), accountOperation, accountOperation.getOperationTitle(), accountOperation.getFullCategoryName(), Long.valueOf(accountOperation.getOperationDate()), n, cVar2, (Boolean) null, C11398b.f33142u, (DefaultConstructorMarker) null);
    }

    /* renamed from: e */
    public static final List m64786e(List list) {
        C41536l.m120489i(list, "<this>");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m64785d((AccountOperation) it.next()));
        }
        return arrayList;
    }
}
