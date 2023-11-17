package android.support.p013v4.p014os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: android.support.v4.os.a */
public interface C0129a extends IInterface {

    /* renamed from: a */
    public static final String f999a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* renamed from: android.support.v4.os.a$a */
    public static abstract class C0130a extends Binder implements C0129a {

        /* renamed from: android.support.v4.os.a$a$a */
        private static class C0131a implements C0129a {

            /* renamed from: b */
            private IBinder f1000b;

            C0131a(IBinder iBinder) {
                this.f1000b = iBinder;
            }

            public IBinder asBinder() {
                return this.f1000b;
            }
        }

        public C0130a() {
            attachInterface(this, C0129a.f999a);
        }

        /* renamed from: k */
        public static C0129a m372k(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(C0129a.f999a);
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0129a)) {
                return new C0131a(iBinder);
            }
            return (C0129a) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = C0129a.f999a;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            } else if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            } else {
                mo275e1(parcel.readInt(), (Bundle) C0132b.m374b(parcel, Bundle.CREATOR));
                return true;
            }
        }
    }

    /* renamed from: android.support.v4.os.a$b */
    public static class C0132b {
        /* access modifiers changed from: private */
        /* renamed from: b */
        public static Object m374b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    /* renamed from: e1 */
    void mo275e1(int i, Bundle bundle);
}
