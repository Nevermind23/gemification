package p117i6;

import android.os.Bundle;
import android.util.Log;
import java.io.IOException;
import p337z7.C9215a;
import p337z7.Task;

/* renamed from: i6.j */
public final /* synthetic */ class C6581j implements C9215a {

    /* renamed from: a */
    public static final /* synthetic */ C6581j f20090a = new C6581j();

    private /* synthetic */ C6581j() {
    }

    /* renamed from: a */
    public final Object mo17447a(Task task) {
        if (task.mo24873r()) {
            return (Bundle) task.mo24869n();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(task.mo24868m());
            StringBuilder sb = new StringBuilder(valueOf.length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.mo24868m());
    }
}
