package com.threatmetrix.TrustDefender;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Parcel;
import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.peppep;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.b1 */
public class C11881b1 implements peppep.C11950d {
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final String f34786c = C11907h.m43615j(C11881b1.class);

    /* renamed from: a */
    private final CountDownLatch f34787a;

    /* renamed from: b */
    private final C11882a f34788b;

    /* renamed from: com.threatmetrix.TrustDefender.b1$a */
    public private static class C11882a implements ServiceConnection {

        /* renamed from: a */
        private volatile IBinder f34789a = null;

        /* renamed from: b */
        private final CountDownLatch f34790b;

        public C11882a(CountDownLatch countDownLatch) {
            this.f34790b = countDownLatch;
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: b */
        private static String m43542b(IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String readString = obtain2.readString();
                obtain2.recycle();
                obtain.recycle();
                return readString;
            } catch (Exception e) {
                C11907h.C11908a.m43628f(C11881b1.f34786c, "Failed to obtain Advertising ID {}", e.toString());
                obtain2.recycle();
                obtain.recycle();
                return null;
            } catch (Throwable th) {
                obtain2.recycle();
                obtain.recycle();
                throw th;
            }
        }

        /* renamed from: a */
        public String mo31923a() {
            IBinder iBinder = this.f34789a;
            if (iBinder != null) {
                return m43542b(iBinder);
            }
            return null;
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                this.f34789a = iBinder;
                this.f34790b.countDown();
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f34789a = null;
        }
    }

    public C11881b1() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.f34787a = countDownLatch;
        this.f34788b = new C11882a(countDownLatch);
    }

    /* renamed from: a */
    public String mo31921a(int i) {
        try {
            if (this.f34787a.await((long) i, TimeUnit.MILLISECONDS)) {
                return this.f34788b.mo31923a();
            }
            C11907h.C11908a.m43624b(f34786c, "Failed to get Google Advertising ID, Time out");
            return null;
        } catch (InterruptedException e) {
            C11907h.C11908a.m43628f(f34786c, "Failed to get Google Advertising ID {}", e.toString());
            return null;
        } catch (Exception e2) {
            C11907h.m43607b(f34786c, e2.toString());
            return null;
        }
    }

    /* renamed from: b */
    public boolean mo31922b(C17603t tVar) {
        if (tVar == null || tVar.f49314a == null) {
            C11907h.m43622q(f34786c, "Null context");
            return false;
        }
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return tVar.f49314a.bindService(intent, this.f34788b, 1);
    }
}
