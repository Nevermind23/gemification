package p615tg;

import he1.C41217g;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.Amount;
import p561pi.C17365a;
import p561pi.C17367b;
import ue1.C43064a;

/* renamed from: tg.a */
public abstract class C17959a {

    /* renamed from: a */
    private static final C41217g f51152a = C41219i.m119470b(C17960a.f51153d);

    /* renamed from: tg.a$a */
    static final class C17960a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C17960a f51153d = new C17960a();

        C17960a() {
            super(0);
        }

        /* renamed from: b */
        public final C17367b invoke() {
            C17367b bVar = new C17367b((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            bVar.mo44810m("###,##0.00");
            return bVar;
        }
    }

    /* renamed from: a */
    public static final String m61877a(Amount amount) {
        C41536l.m120489i(amount, "<this>");
        String str = " " + C17961b.f51154a.mo45631a(amount.mo34592e());
        C17367b b = m61878b();
        String bigDecimal = amount.mo34590d().toString();
        C41536l.m120488h(bigDecimal, "amount.toString()");
        return C17365a.C17366a.m60762a(b, bigDecimal, (String) null, str, 2, (Object) null);
    }

    /* renamed from: b */
    public static final C17367b m61878b() {
        return (C17367b) f51152a.getValue();
    }

    /* renamed from: c */
    public static final Amount m61879c(double d, String str) {
        C41536l.m120489i(str, "ccy");
        return new Amount(d, str);
    }

    /* renamed from: d */
    public static final Amount m61880d(int i, String str) {
        C41536l.m120489i(str, "ccy");
        return new Amount(i, str);
    }

    /* renamed from: e */
    public static final Amount m61881e(BigDecimal bigDecimal, String str) {
        C41536l.m120489i(bigDecimal, "<this>");
        C41536l.m120489i(str, "ccy");
        return new Amount(bigDecimal, str);
    }
}
