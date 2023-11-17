package hj0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import ee1.C40767b;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.gyroanimation.GyroAnimationView;
import p435gi.C15279a;

/* renamed from: hj0.a */
public final class C25033a implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f64380a;

    /* renamed from: b */
    private final GyroAnimationView f64381b;

    /* renamed from: c */
    private final C40767b f64382c;

    /* renamed from: d */
    private SensorEvent f64383d;

    public C25033a(SensorManager sensorManager, GyroAnimationView gyroAnimationView, C40767b bVar) {
        this.f64380a = sensorManager;
        this.f64381b = gyroAnimationView;
        this.f64382c = bVar;
    }

    /* renamed from: a */
    public final boolean mo63463a() {
        Sensor defaultSensor;
        SensorManager sensorManager = this.f64380a;
        if (sensorManager == null || (defaultSensor = sensorManager.getDefaultSensor(11)) == null) {
            return false;
        }
        return this.f64380a.registerListener(this, defaultSensor, 1);
    }

    /* renamed from: b */
    public final void mo63464b() {
        SensorManager sensorManager = this.f64380a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        C41536l.m120489i(sensor, "sensor");
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        boolean z;
        Sensor sensor;
        boolean z2 = true;
        if (sensorEvent == null || (sensor = sensorEvent.sensor) == null || sensor.getType() != 11) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            SensorEvent sensorEvent2 = this.f64383d;
            if (sensorEvent2 == null) {
                this.f64383d = sensorEvent;
                return;
            }
            if (sensorEvent2 == null) {
                C41536l.m120506z("startOrientation");
                sensorEvent2 = null;
            }
            float[] fArr = sensorEvent2.values;
            C41536l.m120488h(fArr, "startOrientation.values");
            float[] fArr2 = sensorEvent.values;
            C41536l.m120488h(fArr2, "event.values");
            C15279a aVar = new C15279a(fArr, fArr2);
            C40767b bVar = this.f64382c;
            if (bVar != null) {
                bVar.onNext(aVar);
            }
            GyroAnimationView gyroAnimationView = this.f64381b;
            if (gyroAnimationView != null) {
                if (gyroAnimationView.getVisibility() != 0) {
                    z2 = false;
                }
                if (z2) {
                    this.f64381b.mo35780a(aVar);
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C25033a(SensorManager sensorManager, GyroAnimationView gyroAnimationView, C40767b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sensorManager, (i & 2) != 0 ? null : gyroAnimationView, (i & 4) != 0 ? null : bVar);
    }
}
