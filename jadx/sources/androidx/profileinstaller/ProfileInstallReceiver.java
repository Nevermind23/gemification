package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.C1696i;

public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    class C1682a implements C1696i.C1699c {
        C1682a() {
        }

        /* renamed from: a */
        public void mo5126a(int i, Object obj) {
            C1696i.f4949b.mo5126a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }

        /* renamed from: b */
        public void mo5127b(int i, Object obj) {
            C1696i.f4949b.mo5127b(i, obj);
        }
    }

    /* renamed from: a */
    static void m5883a(C1696i.C1699c cVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            Process.sendSignal(Process.myPid(), 10);
            cVar.mo5126a(12, (Object) null);
            return;
        }
        cVar.mo5126a(13, (Object) null);
    }

    public void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent != null) {
            String action = intent.getAction();
            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
                C1696i.m5950k(context, new C1694g(), new C1682a(), true);
            } else if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
                Bundle extras2 = intent.getExtras();
                if (extras2 != null) {
                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
                    if ("WRITE_SKIP_FILE".equals(string)) {
                        C1696i.m5951l(context, new C1694g(), new C1682a());
                    } else if ("DELETE_SKIP_FILE".equals(string)) {
                        C1696i.m5942c(context, new C1694g(), new C1682a());
                    }
                }
            } else if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                m5883a(new C1682a());
            } else if ("androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) && (extras = intent.getExtras()) != null) {
                String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
                C1682a aVar = new C1682a();
                if ("DROP_SHADER_CACHE".equals(string2)) {
                    C1686a.m5903b(context, aVar);
                } else {
                    aVar.mo5126a(16, (Object) null);
                }
            }
        }
    }
}
