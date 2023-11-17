package com.threatmetrix.TrustDefender;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import p626ue.C18114a;

/* renamed from: com.threatmetrix.TrustDefender.a */
public interface C11873a extends IInterface {

    /* renamed from: com.threatmetrix.TrustDefender.a$a */
    public static abstract class C11874a extends Binder implements C11873a {

        /* renamed from: b */
        private static final String f34678b = C18114a.m62167c("_jg'l_hZUg_VdaWe\u001a?\\^[[*JJHPEEQ\f&%IN>JE7A'8DG923", 129, 4);

        /* renamed from: com.threatmetrix.TrustDefender.a$a$a */
        public private static class C11875a implements C11873a {

            /* renamed from: b */
            private IBinder f34679b;

            public C11875a(IBinder iBinder) {
                this.f34679b = iBinder;
            }

            public IBinder asBinder() {
                return this.f34679b;
            }
        }

        /* renamed from: k */
        public static C11873a m43515k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C18114a.m62167c("\u0015 \u001d\\\"\u0015\u001e\u0010\u000b\u001d\u0015\f\u001a\u0017\r\u001bOt\u0012\u0014\u0011\u0011_}\u0006zz\u0007A[Z~\u0004szlv\\my|ngh", 205, 5));
            return (queryLocalInterface == null || !(queryLocalInterface instanceof C11873a)) ? new C11875a(iBinder) : (C11873a) queryLocalInterface;
        }
    }
}
