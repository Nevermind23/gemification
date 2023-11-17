package ic0;

import com.github.mikephil.charting.utils.Utils;
import g91.C32314k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lc0.C25927l;
import lc0.C25934s;
import p341ge.bog.mobilebank.deposits.presentation.prolongation.fragment.main.DepositProlongationMainFragmentArgs;
import p615tg.C17959a;

/* renamed from: ic0.e */
public final class C25167e {
    /* renamed from: a */
    public final C25927l mo63708a(DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs) {
        C41536l.m120489i(depositProlongationMainFragmentArgs, "args");
        String f = depositProlongationMainFragmentArgs.mo58224f();
        double e = depositProlongationMainFragmentArgs.mo58222e();
        double j = depositProlongationMainFragmentArgs.mo58229j();
        double q = depositProlongationMainFragmentArgs.mo58234q();
        double p = depositProlongationMainFragmentArgs.mo58233p();
        String a = C17959a.m61877a(C17959a.m61879c(depositProlongationMainFragmentArgs.mo58222e(), depositProlongationMainFragmentArgs.mo58224f()));
        String a2 = C32314k.m95245a(depositProlongationMainFragmentArgs.mo58224f());
        return new C25927l(f, " " + a2, a, q, p, e, j);
    }

    /* renamed from: b */
    public final C25934s mo63709b(DepositProlongationMainFragmentArgs depositProlongationMainFragmentArgs) {
        C41536l.m120489i(depositProlongationMainFragmentArgs, "args");
        long b = depositProlongationMainFragmentArgs.mo58219b();
        String d = depositProlongationMainFragmentArgs.mo58220d();
        long a = depositProlongationMainFragmentArgs.mo58218a();
        return new C25934s(depositProlongationMainFragmentArgs.mo58241w(), depositProlongationMainFragmentArgs.mo58222e(), Utils.DOUBLE_EPSILON, depositProlongationMainFragmentArgs.mo58222e() - depositProlongationMainFragmentArgs.mo58229j(), depositProlongationMainFragmentArgs.mo58235r(), depositProlongationMainFragmentArgs.mo58239u(), depositProlongationMainFragmentArgs.mo58240v(), depositProlongationMainFragmentArgs.mo58232m(), (int) depositProlongationMainFragmentArgs.mo58236s(), b, (String) null, (String) null, d, Long.valueOf(a), depositProlongationMainFragmentArgs.mo58224f(), depositProlongationMainFragmentArgs.mo58237t(), depositProlongationMainFragmentArgs.mo58225g(), depositProlongationMainFragmentArgs.mo58226h(), depositProlongationMainFragmentArgs.mo58230k(), depositProlongationMainFragmentArgs.mo58231l(), depositProlongationMainFragmentArgs.mo58229j(), 3076, (DefaultConstructorMarker) null);
    }
}
