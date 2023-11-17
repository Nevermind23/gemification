package p174mb;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import p430gd.C12976h;
import p430gd.C12978i;

/* renamed from: mb.b */
public final class C7154b implements SensorEventListener {

    /* renamed from: a */
    private C12976h f21175a;

    /* renamed from: b */
    private C12978i f21176b;

    /* renamed from: c */
    private Sensor f21177c;

    /* renamed from: d */
    private Context f21178d;

    /* renamed from: e */
    private Handler f21179e = new Handler();

    public C7154b(Context context, C12976h hVar, C12978i iVar) {
        this.f21178d = context;
        this.f21175a = hVar;
        this.f21176b = iVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public /* synthetic */ void m27529b(boolean z) {
        this.f21175a.mo33757t(z);
    }

    /* renamed from: c */
    private void m27530c(boolean z) {
        this.f21179e.post(new C7153a(this, z));
    }

    /* renamed from: d */
    public void mo21414d() {
        if (this.f21176b.mo33766d()) {
            SensorManager sensorManager = (SensorManager) this.f21178d.getSystemService("sensor");
            Sensor defaultSensor = sensorManager.getDefaultSensor(5);
            this.f21177c = defaultSensor;
            if (defaultSensor != null) {
                sensorManager.registerListener(this, defaultSensor, 3);
            }
        }
    }

    /* renamed from: e */
    public void mo21415e() {
        if (this.f21177c != null) {
            ((SensorManager) this.f21178d.getSystemService("sensor")).unregisterListener(this);
            this.f21177c = null;
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.f21175a == null) {
            return;
        }
        if (f <= 45.0f) {
            m27530c(true);
        } else if (f >= 450.0f) {
            m27530c(false);
        }
    }
}
