package p341ge.bog.mobilebank.sync;

import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import hd1.C41204a;
import iu0.C36546y;
import java.util.concurrent.TimeUnit;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;

/* renamed from: ge.bog.mobilebank.sync.CommonDataSyncService */
public class CommonDataSyncService extends C34844e {

    /* renamed from: j */
    public static final long f84111j = TimeUnit.HOURS.toMillis(5);

    /* renamed from: k */
    public static final long f84112k = TimeUnit.DAYS.toMillis(7);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C41204a f84113g = new C41204a();

    /* renamed from: h */
    RootBankApiManager f84114h;

    /* renamed from: i */
    PreferencesApiManager f84115i;

    /* renamed from: ge.bog.mobilebank.sync.CommonDataSyncService$a */
    class C34839a implements Runnable {
        C34839a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static /* synthetic */ boolean m102333d(Throwable th) {
            return true;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static /* synthetic */ void m102334e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ void m102335f(Throwable th) {
        }

        public void run() {
            CommonDataSyncService.this.f84113g.mo95660b(C36546y.m108285N().f88061o.mo66336b().mo94883B(new C34840a()).mo94888G(new C34841b(), new C34842c()));
            CommonDataSyncService.this.f84114h.getCcyRates(true);
            if (System.currentTimeMillis() - CommonDataSyncService.this.f84115i.getMapsLastSyncDate() < CommonDataSyncService.f84112k) {
                CommonDataSyncService.this.f84114h.getMapObjects(true);
            }
        }
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onDestroy() {
        this.f84113g.dispose();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f84115i.getExtCustomer() == null || System.currentTimeMillis() - this.f84115i.getCommonDataLastSyncDate() < f84111j) {
            stopSelf();
        } else {
            new Handler().postDelayed(new C34839a(), 5000);
        }
        return super.onStartCommand(intent, i, i2);
    }
}
