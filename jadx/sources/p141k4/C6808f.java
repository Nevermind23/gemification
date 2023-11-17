package p141k4;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import p334z4.C9207a;

/* renamed from: k4.f */
class C6808f implements SensorEventListener {

    /* renamed from: a */
    private C6809a f20460a;

    /* renamed from: k4.f$a */
    public interface C6809a {
        /* renamed from: a */
        void mo20851a();
    }

    C6808f() {
    }

    /* renamed from: a */
    public void mo20874a(C6809a aVar) {
        if (!C9207a.m34024c(this)) {
            try {
                this.f20460a = aVar;
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        C9207a.m34024c(this);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!C9207a.m34024c(this)) {
            try {
                if (this.f20460a != null) {
                    float[] fArr = sensorEvent.values;
                    float f = fArr[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (fArr[1] / 9.80665f);
                    double d3 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                        this.f20460a.mo20851a();
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}
