package p267u0;

import androidx.room.EmptyResultSetException;
import ed1.C40733a0;
import ed1.C40762x;
import ed1.C40763y;
import java.util.concurrent.Callable;

/* renamed from: u0.b0 */
public abstract class C8441b0 {

    /* renamed from: a */
    public static final Object f24001a = new Object();

    /* renamed from: u0.b0$a */
    class C8442a implements C40733a0 {

        /* renamed from: a */
        final /* synthetic */ Callable f24002a;

        C8442a(Callable callable) {
            this.f24002a = callable;
        }

        /* renamed from: a */
        public void mo23632a(C40763y yVar) {
            try {
                yVar.mo95093a(this.f24002a.call());
            } catch (EmptyResultSetException e) {
                yVar.mo95094b(e);
            }
        }
    }

    /* renamed from: a */
    public static C40762x m31664a(Callable callable) {
        return C40762x.m118157e(new C8442a(callable));
    }
}
