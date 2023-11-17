package p077f5;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: f5.a */
public interface C6157a extends IInterface {

    /* renamed from: f5.a$a */
    public static abstract class C6158a extends Binder implements C6157a {

        /* renamed from: f5.a$a$a */
        private static class C6159a implements C6157a {

            /* renamed from: c */
            public static C6157a f19139c;

            /* renamed from: b */
            private IBinder f19140b;

            C6159a(IBinder iBinder) {
                this.f19140b = iBinder;
            }

            /* renamed from: H */
            public int mo19733H(Bundle bundle) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.f19140b.transact(1, obtain, obtain2, 0) && C6158a.m24576x() != null) {
                        return C6158a.m24576x().mo19733H(bundle);
                    }
                    obtain2.readException();
                    int readInt = obtain2.readInt();
                    obtain2.recycle();
                    obtain.recycle();
                    return readInt;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.f19140b;
            }
        }

        /* renamed from: k */
        public static C6157a m24575k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C6157a)) {
                return new C6159a(iBinder);
            }
            return (C6157a) queryLocalInterface;
        }

        /* renamed from: x */
        public static C6157a m24576x() {
            return C6159a.f19139c;
        }
    }

    /* renamed from: H */
    int mo19733H(Bundle bundle);
}
