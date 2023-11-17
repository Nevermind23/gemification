package p130j6;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p182n6.C7264i;

/* renamed from: j6.a */
public class C6725a implements ServiceConnection {

    /* renamed from: a */
    boolean f20297a = false;

    /* renamed from: b */
    private final BlockingQueue f20298b = new LinkedBlockingQueue();

    /* renamed from: a */
    public IBinder mo20739a(long j, TimeUnit timeUnit) {
        C7264i.m27901j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f20297a) {
            this.f20297a = true;
            IBinder iBinder = (IBinder) this.f20298b.poll(j, timeUnit);
            if (iBinder != null) {
                return iBinder;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f20298b.add(iBinder);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
