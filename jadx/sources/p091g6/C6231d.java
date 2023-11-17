package p091g6;

import com.google.android.gms.common.api.C3860c;
import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import p143k6.C6819b;
import p143k6.C6821c;
import p156l6.C6954m;
import p182n6.C7264i;
import p221q6.C7895a;

/* renamed from: g6.d */
public final class C6231d implements Runnable {

    /* renamed from: f */
    private static final C7895a f19258f = new C7895a("RevokeAccessOperation", new String[0]);

    /* renamed from: d */
    private final String f19259d;

    /* renamed from: e */
    private final C6954m f19260e = new C6954m((C3860c) null);

    public C6231d(String str) {
        this.f19259d = C7264i.m27898g(str);
    }

    /* renamed from: a */
    public static C6819b m24780a(String str) {
        if (str == null) {
            return C6821c.m26555a(new Status(4), (C3860c) null);
        }
        C6231d dVar = new C6231d(str);
        new Thread(dVar).start();
        return dVar.f19260e;
    }

    public final void run() {
        Status status = Status.f12254l;
        try {
            String str = this.f19259d;
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://accounts.google.com/o/oauth2/revoke?token=" + str).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f12252j;
            } else {
                f19258f.mo22864b("Unable to revoke access!", new Object[0]);
            }
            C7895a aVar = f19258f;
            aVar.mo22863a("Response Code: " + responseCode, new Object[0]);
        } catch (IOException e) {
            f19258f.mo22864b("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            f19258f.mo22864b("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.f19260e.mo11977i(status);
    }
}
