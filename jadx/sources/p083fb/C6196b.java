package p083fb;

import com.google.android.gms.maps.model.LatLng;
import p070eb.C6126b;

/* renamed from: fb.b */
public class C6196b {

    /* renamed from: a */
    final double f19196a;

    public C6196b(double d) {
        this.f19196a = d;
    }

    /* renamed from: a */
    public LatLng mo19782a(C6126b bVar) {
        double d = bVar.f19065a;
        double d2 = this.f19196a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (bVar.f19066b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    /* renamed from: b */
    public C6195a mo19783b(LatLng latLng) {
        double sin = Math.sin(Math.toRadians(latLng.f14073d));
        double d = this.f19196a;
        return new C6195a(((latLng.f14074e / 360.0d) + 0.5d) * d, (((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / -6.283185307179586d) + 0.5d) * d);
    }
}
