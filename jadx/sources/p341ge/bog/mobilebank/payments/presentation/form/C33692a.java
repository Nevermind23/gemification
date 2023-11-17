package p341ge.bog.mobilebank.payments.presentation.form;

import androidx.lifecycle.LiveData;
import dy0.C31622e;
import java.util.HashMap;
import java.util.List;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;

/* renamed from: ge.bog.mobilebank.payments.presentation.form.a */
public interface C33692a {

    /* renamed from: ge.bog.mobilebank.payments.presentation.form.a$a */
    public static final class C33693a {
        /* renamed from: a */
        public static /* synthetic */ void m99009a(C33692a aVar, C21503d dVar, String str, String str2, String str3, String str4, List list, int i, Object obj) {
            if (obj == null) {
                List list2 = null;
                String str5 = (i & 2) != 0 ? null : str;
                String str6 = (i & 4) != 0 ? null : str2;
                String str7 = (i & 8) != 0 ? null : str3;
                String str8 = (i & 16) != 0 ? null : str4;
                if ((i & 32) == 0) {
                    list2 = list;
                }
                aVar.mo56536sc(dVar, str5, str6, str7, str8, list2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: newScaState");
        }
    }

    /* renamed from: A */
    void mo56479A(C31622e eVar);

    /* renamed from: Bd */
    LiveData mo56481Bd();

    /* renamed from: Bg */
    void mo56482Bg();

    /* renamed from: Ce */
    LiveData mo56486Ce();

    /* renamed from: Da */
    LiveData mo56487Da();

    /* renamed from: H1 */
    void mo56489H1();

    /* renamed from: Hq */
    void mo56491Hq(String str, List list, List list2);

    /* renamed from: I2 */
    LiveData mo56492I2();

    /* renamed from: Kk */
    String mo56496Kk();

    /* renamed from: P5 */
    LiveData mo56498P5();

    /* renamed from: R1 */
    void mo56501R1(List list);

    /* renamed from: Tu */
    boolean mo56503Tu();

    /* renamed from: W3 */
    HashMap mo56506W3(List list, String str);

    /* renamed from: Wl */
    LiveData mo56507Wl();

    /* renamed from: Xk */
    LiveData mo56510Xk();

    /* renamed from: bs */
    void mo56515bs();

    /* renamed from: ed */
    LiveData mo56518ed();

    /* renamed from: jn */
    LiveData mo56523jn();

    /* renamed from: ju */
    void mo56524ju(List list);

    /* renamed from: ml */
    List mo56527ml();

    /* renamed from: sc */
    void mo56536sc(C21503d dVar, String str, String str2, String str3, String str4, List list);

    /* renamed from: si */
    LiveData mo56537si();

    /* renamed from: v9 */
    LiveData mo56541v9();

    /* renamed from: wm */
    LiveData mo56544wm();

    /* renamed from: xj */
    LiveData mo56546xj();
}
