package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.events.C11437g;
import java.util.Locale;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.events.predicates.d */
public class C11448d extends C11456h<Integer> {

    /* renamed from: com.salesforce.marketingcloud.events.predicates.d$a */
    static /* synthetic */ class C11449a {

        /* renamed from: a */
        static final /* synthetic */ int[] f33294a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.salesforce.marketingcloud.events.g$a[] r0 = com.salesforce.marketingcloud.events.C11437g.C11438a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33294a = r0
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.EQ     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33294a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.NEQ     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33294a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.LT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33294a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.GT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33294a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.LTEQ     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33294a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.salesforce.marketingcloud.events.g$a r1 = com.salesforce.marketingcloud.events.C11437g.C11438a.GTEQ     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.marketingcloud.events.predicates.C11448d.C11449a.<clinit>():void");
        }
    }

    public C11448d(Object obj, C11437g.C11438a aVar, Object obj2) {
        super(obj, aVar, obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public Integer mo29946a(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Number) {
            return Integer.valueOf(((Number) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29948a(Integer num, C11437g.C11438a aVar, Integer num2) {
        if (num == null || num2 == null) {
            return false;
        }
        switch (C11449a.f33294a[aVar.ordinal()]) {
            case 1:
                return num.equals(num2);
            case 2:
                return !num.equals(num2);
            case 3:
                if (num.intValue() >= num2.intValue()) {
                    return false;
                }
                break;
            case 4:
                if (num.intValue() <= num2.intValue()) {
                    return false;
                }
                break;
            case 5:
                if (num.intValue() > num2.intValue()) {
                    return false;
                }
                break;
            case 6:
                if (num.intValue() < num2.intValue()) {
                    return false;
                }
                break;
            default:
                throw new UnsupportedOperationException(String.format(Locale.ENGLISH, "Operator %s not supported for Integer data types.", new Object[]{aVar}));
        }
        return true;
    }
}
