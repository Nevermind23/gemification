package ux0;

import ed1.C40749p;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.payments.data.model.FormOtpParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;

/* renamed from: ux0.i0 */
public interface C39154i0 {

    /* renamed from: ux0.i0$a */
    public static final class C39155a {
        /* renamed from: a */
        public static /* synthetic */ FormOtpParams m114239a(C39154i0 i0Var, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
            if (obj == null) {
                return i0Var.mo56525k5(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, str5, (i & 32) != 0 ? null : list);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createOtpParamsObject");
        }

        /* renamed from: b */
        public static /* synthetic */ void m114240b(C39154i0 i0Var, C21503d dVar, String str, String str2, String str3, String str4, String str5, List list, int i, Object obj) {
            String str6;
            String str7;
            String str8;
            String str9;
            String str10;
            if (obj == null) {
                if ((i & 2) != 0) {
                    str6 = "";
                } else {
                    str6 = str;
                }
                List list2 = null;
                if ((i & 4) != 0) {
                    str7 = null;
                } else {
                    str7 = str2;
                }
                if ((i & 8) != 0) {
                    str8 = null;
                } else {
                    str8 = str3;
                }
                if ((i & 16) != 0) {
                    str9 = null;
                } else {
                    str9 = str4;
                }
                if ((i & 32) != 0) {
                    str10 = null;
                } else {
                    str10 = str5;
                }
                if ((i & 64) == 0) {
                    list2 = list;
                }
                i0Var.mo56517cq(dVar, str6, str7, str8, str9, str10, list2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScaState");
        }
    }

    /* renamed from: Bh */
    C40749p mo56483Bh();

    /* renamed from: Yc */
    HashMap mo56511Yc(OtpParams otpParams);

    /* renamed from: cq */
    void mo56517cq(C21503d dVar, String str, String str2, String str3, String str4, String str5, List list);

    /* renamed from: k5 */
    FormOtpParams mo56525k5(String str, String str2, String str3, String str4, String str5, List list);
}
