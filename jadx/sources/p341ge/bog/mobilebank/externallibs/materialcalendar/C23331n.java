package p341ge.bog.mobilebank.externallibs.materialcalendar;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import ge0.C24710h;
import p342j$.time.DayOfWeek;

/* renamed from: ge.bog.mobilebank.externallibs.materialcalendar.n */
class C23331n extends AppCompatTextView {

    /* renamed from: d */
    private C24710h f61061d = C24710h.f63601a;

    /* renamed from: e */
    private DayOfWeek f61062e;

    public C23331n(Context context, DayOfWeek dayOfWeek) {
        super(context);
        setGravity(17);
        setTextAlignment(4);
        mo59086f(dayOfWeek);
    }

    /* renamed from: f */
    public void mo59086f(DayOfWeek dayOfWeek) {
        this.f61062e = dayOfWeek;
        setText(this.f61061d.mo63108a(dayOfWeek));
    }

    /* renamed from: g */
    public void mo59087g(C24710h hVar) {
        if (hVar == null) {
            hVar = C24710h.f63601a;
        }
        this.f61061d = hVar;
        mo59086f(this.f61062e);
    }
}
