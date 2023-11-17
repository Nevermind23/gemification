package tb0;

import kotlin.jvm.internal.C41536l;
import oy0.C37840f;
import p341ge.bog.mobilebank.deposits.data.entity.depositbreak.DepositBreakProcessValidationStatusEntity;

/* renamed from: tb0.a */
public abstract class C28352a {

    /* renamed from: tb0.a$a */
    public /* synthetic */ class C28353a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71866a;

        static {
            int[] iArr = new int[DepositBreakProcessValidationStatusEntity.values().length];
            try {
                iArr[DepositBreakProcessValidationStatusEntity.WARNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71866a = iArr;
        }
    }

    /* renamed from: a */
    public static final C37840f m86998a(DepositBreakProcessValidationStatusEntity depositBreakProcessValidationStatusEntity) {
        C41536l.m120489i(depositBreakProcessValidationStatusEntity, "<this>");
        if (C28353a.f71866a[depositBreakProcessValidationStatusEntity.ordinal()] == 1) {
            return C37840f.WARNING;
        }
        return C37840f.OKAY;
    }
}
