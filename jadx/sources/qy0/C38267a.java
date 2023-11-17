package qy0;

import ed1.C40734b;
import ed1.C40749p;
import ed1.C40762x;
import java.util.HashMap;
import od0.C26941b;
import qd0.C27774a;

/* renamed from: qy0.a */
public interface C38267a extends C27774a, C26941b {

    /* renamed from: qy0.a$a */
    public static final class C38268a {
        /* renamed from: a */
        public static /* synthetic */ C40749p m112505a(C38267a aVar, boolean z, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    z = false;
                }
                return aVar.mo69121Vf(z);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getDepositsAndBonds");
        }
    }

    /* renamed from: B */
    C40762x mo69108B(String str);

    /* renamed from: Dh */
    C40734b mo69109Dh(double d, String str, String str2, boolean z, boolean z2, Long l, String str3, long j, long j2, long j3, String str4, boolean z3);

    /* renamed from: E5 */
    C40762x mo69110E5(long j, boolean z);

    /* renamed from: Gb */
    void mo69111Gb(long j);

    /* renamed from: Iq */
    C40734b mo69112Iq(long j, boolean z);

    /* renamed from: J0 */
    C40762x mo69113J0(HashMap hashMap);

    /* renamed from: J6 */
    void mo69114J6(long j);

    /* renamed from: M */
    C40734b mo69115M(Long l);

    /* renamed from: M2 */
    C40762x mo69116M2();

    /* renamed from: Or */
    boolean mo69117Or(long j);

    /* renamed from: T0 */
    C40762x mo69118T0(String str, double d, String str2, long j, String str3);

    /* renamed from: U0 */
    C40762x mo69119U0(long j);

    /* renamed from: U8 */
    C40734b mo69120U8(String str, Double d, Double d2, String str2, String str3, Long l, Long l2, long j);

    /* renamed from: Vf */
    C40749p mo69121Vf(boolean z);

    /* renamed from: Yh */
    C40762x mo69122Yh(long j);

    /* renamed from: a2 */
    C40762x mo69123a2(String str, double d, String str2, long j);

    /* renamed from: a3 */
    C40734b mo69124a3(long j, String str);

    /* renamed from: f1 */
    C40762x mo69125f1(String str, String str2, double d, String str3, long j, long j2, long j3, String str4, String str5, double d2, double d3, double d4, String str6, int i, double d5);

    /* renamed from: g1 */
    C40762x mo69126g1(double d, String str, String str2, long j, long j2, String str3);

    /* renamed from: n1 */
    C40734b mo69127n1(long j, long j2);

    /* renamed from: r3 */
    C40762x mo69128r3(long j);

    /* renamed from: r7 */
    C40734b mo69130r7(Long l, String str, Double d, String str2, String str3, Long l2, Long l3, long j);

    void refreshDepositsAndBonds();

    /* renamed from: rs */
    boolean mo69132rs(long j);
}
