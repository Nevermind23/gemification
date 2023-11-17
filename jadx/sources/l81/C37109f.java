package l81;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.widget.ImageView;
import com.github.mikephil.charting.utils.Utils;

/* renamed from: l81.f */
public class C37109f implements SensorEventListener {

    /* renamed from: a */
    private SensorManager f89290a;

    /* renamed from: b */
    private Sensor f89291b;

    /* renamed from: c */
    private Sensor f89292c;

    /* renamed from: d */
    private float[] f89293d = new float[3];

    /* renamed from: e */
    private float[] f89294e = new float[3];

    /* renamed from: f */
    private float f89295f = Utils.FLOAT_EPSILON;

    /* renamed from: g */
    private float f89296g = Utils.FLOAT_EPSILON;

    /* renamed from: h */
    private C37110a f89297h;

    /* renamed from: i */
    public ImageView f89298i = null;

    /* renamed from: l81.f$a */
    public interface C37110a {
        /* renamed from: a */
        void mo86283a(float f, float f2);
    }

    public C37109f(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f89290a = sensorManager;
        this.f89291b = sensorManager.getDefaultSensor(1);
        this.f89292c = this.f89290a.getDefaultSensor(2);
    }

    /* renamed from: a */
    public boolean mo90037a() {
        return this.f89292c != null;
    }

    /* renamed from: b */
    public void mo90038b(C37110a aVar) {
        this.f89297h = aVar;
    }

    /* renamed from: c */
    public void mo90039c() {
        this.f89290a.registerListener(this, this.f89291b, 1);
        this.f89290a.registerListener(this, this.f89292c, 1);
    }

    /* renamed from: d */
    public void mo90040d() {
        this.f89290a.unregisterListener(this);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        synchronized (this) {
            if (sensorEvent.sensor.getType() == 1) {
                float[] fArr = this.f89293d;
                float[] fArr2 = sensorEvent.values;
                fArr[0] = (fArr[0] * 0.97f) + (fArr2[0] * 0.029999971f);
                fArr[1] = (fArr[1] * 0.97f) + (fArr2[1] * 0.029999971f);
                fArr[2] = (fArr[2] * 0.97f) + (fArr2[2] * 0.029999971f);
            }
            if (sensorEvent.sensor.getType() == 2) {
                float[] fArr3 = this.f89294e;
                float[] fArr4 = sensorEvent.values;
                fArr3[0] = (fArr3[0] * 0.97f) + (fArr4[0] * 0.029999971f);
                fArr3[1] = (fArr3[1] * 0.97f) + (fArr4[1] * 0.029999971f);
                fArr3[2] = (fArr3[2] * 0.97f) + (fArr4[2] * 0.029999971f);
            }
            float[] fArr5 = new float[9];
            if (SensorManager.getRotationMatrix(fArr5, new float[9], this.f89293d, this.f89294e)) {
                float[] fArr6 = new float[3];
                SensorManager.getOrientation(fArr5, fArr6);
                float degrees = (((float) Math.toDegrees((double) fArr6[0])) + 360.0f) % 360.0f;
                this.f89295f = degrees;
                C37110a aVar = this.f89297h;
                if (aVar != null) {
                    aVar.mo86283a(this.f89296g, degrees);
                }
                this.f89296g = this.f89295f;
            }
        }
    }
}
