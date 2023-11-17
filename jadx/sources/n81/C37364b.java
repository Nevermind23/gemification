package n81;

import android.content.Context;
import com.google.android.gms.maps.model.CameraPosition;
import p012ab.C0099c;
import p196o7.C7465c;

/* renamed from: n81.b */
public class C37364b extends C0099c {

    /* renamed from: k */
    private C7465c f89848k;

    /* renamed from: l */
    private CameraPosition f89849l;

    /* renamed from: m */
    private C37365a f89850m;

    /* renamed from: n81.b$a */
    public interface C37365a {
        /* renamed from: a */
        void mo86273a();
    }

    public C37364b(Context context, C7465c cVar) {
        super(context, cVar);
        this.f89848k = cVar;
    }

    /* renamed from: a */
    public void mo171a() {
        super.mo171a();
        if (mo180k() instanceof C7465c.C7467b) {
            ((C7465c.C7467b) mo180k()).mo171a();
        }
        CameraPosition e = this.f89848k.mo21876e();
        CameraPosition cameraPosition = this.f89849l;
        if (cameraPosition == null || cameraPosition.f14037e != e.f14037e) {
            this.f89849l = this.f89848k.mo21876e();
            mo174e();
        }
        C37365a aVar = this.f89850m;
        if (aVar != null) {
            aVar.mo86273a();
        }
    }

    /* renamed from: o */
    public void mo90446o(C37365a aVar) {
        this.f89850m = aVar;
    }
}
