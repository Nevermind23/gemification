package com.android.installreferrer.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p087g2.C6203a;
import p323y5.C9061a;

/* renamed from: com.android.installreferrer.api.a */
class C2369a extends InstallReferrerClient {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f7499a = 0;

    /* renamed from: b */
    private final Context f7500b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C9061a f7501c;

    /* renamed from: d */
    private ServiceConnection f7502d;

    /* renamed from: com.android.installreferrer.api.a$b */
    private final class C2371b implements ServiceConnection {

        /* renamed from: a */
        private final InstallReferrerStateListener f7503a;

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            C6203a.m24690a("InstallReferrerClient", "Install Referrer service connected.");
            C9061a unused = C2369a.this.f7501c = C9061a.C9062a.m33547k(iBinder);
            int unused2 = C2369a.this.f7499a = 2;
            this.f7503a.mo7635a(0);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            C6203a.m24691b("InstallReferrerClient", "Install Referrer service disconnected.");
            C9061a unused = C2369a.this.f7501c = null;
            int unused2 = C2369a.this.f7499a = 0;
            this.f7503a.mo7636b();
        }

        private C2371b(InstallReferrerStateListener installReferrerStateListener) {
            if (installReferrerStateListener != null) {
                this.f7503a = installReferrerStateListener;
                return;
            }
            throw new RuntimeException("Please specify a listener to know when setup is done.");
        }
    }

    public C2369a(Context context) {
        this.f7500b = context.getApplicationContext();
    }

    /* renamed from: f */
    private boolean m9150f() {
        try {
            if (this.f7500b.getPackageManager().getPackageInfo("com.android.vending", 128).versionCode >= 80837300) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public ReferrerDetails mo7632a() {
        if (mo7638g()) {
            Bundle bundle = new Bundle();
            bundle.putString("package_name", this.f7500b.getPackageName());
            try {
                return new ReferrerDetails(this.f7501c.mo24581h0(bundle));
            } catch (RemoteException e) {
                C6203a.m24691b("InstallReferrerClient", "RemoteException getting install referrer information");
                this.f7499a = 0;
                throw e;
            }
        } else {
            throw new IllegalStateException("Service not connected. Please start a connection before using the service.");
        }
    }

    /* renamed from: c */
    public void mo7633c(InstallReferrerStateListener installReferrerStateListener) {
        ServiceInfo serviceInfo;
        if (mo7638g()) {
            C6203a.m24690a("InstallReferrerClient", "Service connection is valid. No need to re-initialize.");
            installReferrerStateListener.mo7635a(0);
            return;
        }
        int i = this.f7499a;
        if (i == 1) {
            C6203a.m24691b("InstallReferrerClient", "Client is already in the process of connecting to the service.");
            installReferrerStateListener.mo7635a(3);
        } else if (i == 3) {
            C6203a.m24691b("InstallReferrerClient", "Client was already closed and can't be reused. Please create another instance.");
            installReferrerStateListener.mo7635a(3);
        } else {
            C6203a.m24690a("InstallReferrerClient", "Starting install referrer service setup.");
            this.f7502d = new C2371b(installReferrerStateListener);
            Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
            intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
            List<ResolveInfo> queryIntentServices = this.f7500b.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices == null || queryIntentServices.isEmpty() || (serviceInfo = queryIntentServices.get(0).serviceInfo) == null) {
                this.f7499a = 0;
                C6203a.m24690a("InstallReferrerClient", "Install Referrer service unavailable on device.");
                installReferrerStateListener.mo7635a(2);
                return;
            }
            String str = serviceInfo.packageName;
            String str2 = serviceInfo.name;
            if (!"com.android.vending".equals(str) || str2 == null || !m9150f()) {
                C6203a.m24691b("InstallReferrerClient", "Play Store missing or incompatible. Version 8.3.73 or later required.");
                this.f7499a = 0;
                installReferrerStateListener.mo7635a(2);
                return;
            }
            if (this.f7500b.bindService(new Intent(intent), this.f7502d, 1)) {
                C6203a.m24690a("InstallReferrerClient", "Service was bonded successfully.");
                return;
            }
            C6203a.m24691b("InstallReferrerClient", "Connection to service is blocked.");
            this.f7499a = 0;
            installReferrerStateListener.mo7635a(1);
        }
    }

    /* renamed from: g */
    public boolean mo7638g() {
        return (this.f7499a != 2 || this.f7501c == null || this.f7502d == null) ? false : true;
    }
}
