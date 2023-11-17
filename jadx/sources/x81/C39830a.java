package x81;

import android.content.Context;
import android.location.Location;
import p337z7.C9223e;
import p341ge.bog.mobilebank.p975ui.widgets.atms.ServicePointsWidgetProvider;

/* renamed from: x81.a */
public final /* synthetic */ class C39830a implements C9223e {

    /* renamed from: a */
    public final /* synthetic */ ServicePointsWidgetProvider f94538a;

    /* renamed from: b */
    public final /* synthetic */ Context f94539b;

    /* renamed from: c */
    public final /* synthetic */ int[] f94540c;

    public /* synthetic */ C39830a(ServicePointsWidgetProvider servicePointsWidgetProvider, Context context, int[] iArr) {
        this.f94538a = servicePointsWidgetProvider;
        this.f94539b = context;
        this.f94540c = iArr;
    }

    /* renamed from: a */
    public final void mo17635a(Object obj) {
        this.f94538a.m106288b(this.f94539b, this.f94540c, (Location) obj);
    }
}
