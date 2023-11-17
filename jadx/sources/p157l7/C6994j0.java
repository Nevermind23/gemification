package p157l7;

import android.app.Activity;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import p156l6.C6948j;
import p337z7.C9227g;

/* renamed from: l7.j0 */
public final /* synthetic */ class C6994j0 implements C6948j {

    /* renamed from: a */
    public final /* synthetic */ PushTokenizeRequest f20863a;

    /* renamed from: b */
    public final /* synthetic */ Activity f20864b;

    /* renamed from: c */
    public final /* synthetic */ int f20865c;

    public /* synthetic */ C6994j0(PushTokenizeRequest pushTokenizeRequest, Activity activity, int i) {
        this.f20863a = pushTokenizeRequest;
        this.f20864b = activity;
        this.f20865c = i;
    }

    public final void accept(Object obj, Object obj2) {
        C9227g gVar = (C9227g) obj2;
        ((C6980c0) ((C6989h) obj).mo12223I()).mo21117C2(this.f20863a, new C6987g(this.f20864b, this.f20865c));
    }
}
