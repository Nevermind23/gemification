package p211p9;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: p9.g */
public interface C7774g extends IInterface {

    /* renamed from: p9.g$a */
    public static abstract class C7775a extends Binder implements C7774g {

        /* renamed from: p9.g$a$a */
        private static class C7776a implements C7774g {

            /* renamed from: c */
            public static C7774g f22476c;

            /* renamed from: b */
            private IBinder f22477b;

            C7776a(IBinder iBinder) {
                this.f22477b = iBinder;
            }

            public IBinder asBinder() {
                return this.f22477b;
            }

            /* renamed from: j2 */
            public void mo22533j2(C7772f fVar, String str) {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
                    if (fVar != null) {
                        iBinder = fVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (this.f22477b.transact(1, obtain, obtain2, 0) || C7775a.m29478x() == null) {
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        return;
                    }
                    C7775a.m29478x().mo22533j2(fVar, str);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        /* renamed from: k */
        public static C7774g m29477k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C7774g)) {
                return new C7776a(iBinder);
            }
            return (C7774g) queryLocalInterface;
        }

        /* renamed from: x */
        public static C7774g m29478x() {
            return C7776a.f22476c;
        }
    }

    /* renamed from: j2 */
    void mo22533j2(C7772f fVar, String str);
}
