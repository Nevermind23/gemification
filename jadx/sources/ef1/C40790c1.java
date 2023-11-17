package ef1;

import kotlinx.coroutines.internal.C41584a0;

/* renamed from: ef1.c1 */
public abstract class C40790c1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C41584a0 f96516a = new C41584a0("REMOVED_TASK");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C41584a0 f96517b = new C41584a0("CLOSED_EMPTY");

    /* renamed from: c */
    public static final long m118270c(long j) {
        if (j <= 0) {
            return 0;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
