package p555pc;

import kotlin.jvm.internal.C41536l;
import p485kc.C16346d;

/* renamed from: pc.a */
public final class C17336a {

    /* renamed from: a */
    public static final C17336a f48645a = new C17336a();

    private C17336a() {
    }

    /* renamed from: a */
    public final String mo44742a(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "" : "driver_license_vis" : "non_bio_passport" : "passport" : "residence_license" : "driver_license" : "id";
    }

    /* renamed from: b */
    public final int mo44743b(int i) {
        if (i == 0) {
            return C16346d.identomat_id_card_btn_icon;
        }
        if (i == 1) {
            return C16346d.identomat_driver_license_btn_icon;
        }
        if (i == 2) {
            return C16346d.identomat_residence_permit_btn_icon;
        }
        if (i == 3) {
            return C16346d.identomat_passport_btn_icon;
        }
        if (i == 4) {
            return C16346d.identomat_passport_btn_icon;
        }
        if (i != 5) {
            return C16346d.identomat_id_card_btn_icon;
        }
        return C16346d.identomat_driver_license_btn_icon;
    }

    /* renamed from: c */
    public final String mo44744c(int i) {
        switch (i) {
            case 0:
                return "card";
            case 1:
                return "driver_license";
            case 2:
                return "residence_permit";
            case 3:
                return "passport";
            case 4:
                return "ukr_passport";
            case 5:
                return "ukr_driver_license";
            case 6:
                return "inn";
            default:
                return "";
        }
    }

    /* renamed from: d */
    public final String mo44745d(int i, int i2) {
        String str = "";
        switch (i) {
            case 0:
                str = C41536l.m120497q(str, "card/");
                break;
            case 1:
                str = C41536l.m120497q(str, "license/");
                break;
            case 2:
                str = C41536l.m120497q(str, "residence/");
                break;
            case 3:
                str = C41536l.m120497q(str, "passport/");
                break;
            case 4:
                str = C41536l.m120497q(str, "non-bio-passport/");
                break;
            case 5:
                str = C41536l.m120497q(str, "license-vis/");
                break;
            case 6:
                str = C41536l.m120497q(str, "inn/");
                break;
        }
        if (i == 3 || i == 4 || i == 6) {
            return str;
        }
        if (i2 == 0) {
            return C41536l.m120497q(str, "front/");
        }
        if (i2 != 1) {
            return str;
        }
        return C41536l.m120497q(str, "back/");
    }

    /* renamed from: e */
    public final boolean mo44746e(int i) {
        return (i == 3 || i == 4 || i == 6) ? false : true;
    }
}
