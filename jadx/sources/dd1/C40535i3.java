package dd1;

import androidx.lifecycle.C1644x;
import ba1.C10140b;
import ba1.C10146d0;
import ba1.C10190e;
import ba1.C10196h;
import ba1.C10199i;
import ed1.C40734b;
import ed1.C40736c;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.sso_client.models.C35952m;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.network.ApiException;
import qa1.C27698a;
import qa1.C27700a1;
import sso.type.DeviceType;

/* renamed from: dd1.i3 */
public final class C40535i3 {

    /* renamed from: a */
    private final C27700a1 f96125a;

    /* renamed from: b */
    private final C27698a f96126b;

    /* renamed from: c */
    private final C10140b f96127c;

    /* renamed from: d */
    private final C10199i f96128d;

    /* renamed from: e */
    private final C10190e f96129e;

    /* renamed from: f */
    private final C10196h f96130f;

    /* renamed from: g */
    private boolean f96131g = true;

    /* renamed from: h */
    private boolean f96132h;

    public C40535i3(C27700a1 a1Var, C27698a aVar, C10140b bVar, C10199i iVar, C10190e eVar, C10196h hVar) {
        C41536l.m120489i(a1Var, "storage");
        C41536l.m120489i(aVar, "deviceManagementRepository");
        C41536l.m120489i(bVar, "deviceInfo");
        C41536l.m120489i(iVar, "localeManager");
        C41536l.m120489i(eVar, "fcmTokenProvider");
        C41536l.m120489i(hVar, "keyManager");
        this.f96125a = a1Var;
        this.f96126b = aVar;
        this.f96127c = bVar;
        this.f96128d = iVar;
        this.f96129e = eVar;
        this.f96130f = hVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m117292i(C40535i3 i3Var, C1644x xVar, C40736c cVar) {
        Long deviceId;
        C40535i3 i3Var2 = i3Var;
        C1644x xVar2 = xVar;
        C40736c cVar2 = cVar;
        C41536l.m120489i(i3Var2, "this$0");
        C41536l.m120489i(xVar2, "$resetAuthTypesLiveData");
        C41536l.m120489i(cVar2, "emitter");
        boolean z = false;
        if (!i3Var.mo94571p()) {
            DeviceIdentifier c = i3Var2.f96125a.mo67242c();
            if (!(c == null || (deviceId = c.getDeviceId()) == null || deviceId.longValue() != 0)) {
                z = true;
            }
            String str = null;
            if (z) {
                i3Var2.f96125a.mo67250j((DeviceIdentifier) null);
                i3Var2.m117299q(xVar2, true);
            }
            C27698a aVar = i3Var2.f96126b;
            String valueOf = String.valueOf(i3Var2.f96127c.mo26662b());
            String c2 = i3Var2.f96127c.mo26663c();
            String e = i3Var2.f96127c.mo26665e();
            DeviceType deviceType = DeviceType.ANDROID;
            C35952m a = i3Var2.f96128d.mo26767a();
            String g = i3Var2.f96127c.mo26667g();
            String a2 = i3Var2.f96129e.mo26761a();
            DeviceIdentifier c3 = i3Var2.f96125a.mo67242c();
            if (c3 != null) {
                str = c3.getExtCustomerId();
            }
            aVar.mo67238b(valueOf, c2, e, deviceType, a, g, a2, str, i3Var2.f96130f.mo26764a(), "ecdsaSignatureMessageX962SHA256").mo95070I(new C40496c3(i3Var2, xVar2, cVar2), new C40502d3(i3Var2, xVar2, cVar2));
            return;
        }
        i3Var2.m117299q(xVar2, false);
        cVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m117293j(C40535i3 i3Var, C1644x xVar, C40736c cVar, DeviceIdentifier deviceIdentifier) {
        C41536l.m120489i(i3Var, "this$0");
        C41536l.m120489i(xVar, "$resetAuthTypesLiveData");
        C41536l.m120489i(cVar, "$emitter");
        Long deviceId = deviceIdentifier.getDeviceId();
        if (deviceId == null || deviceId.longValue() != 0) {
            i3Var.m117299q(xVar, false);
            i3Var.f96125a.mo67250j(deviceIdentifier);
            C10146d0.C10148b.C10149a h = C10146d0.C10148b.m37110h();
            if (h != null) {
                h.invoke();
            }
            cVar.onComplete();
        } else if (i3Var.f96131g) {
            i3Var.f96131g = false;
            i3Var.f96125a.mo67250j((DeviceIdentifier) null);
            i3Var.m117299q(xVar, true);
            i3Var.mo94570h(xVar).mo94888G(new C40522g3(cVar), new C40528h3(cVar));
        } else {
            i3Var.m117299q(xVar, false);
            cVar.onComplete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m117294k(C40736c cVar) {
        C41536l.m120489i(cVar, "$emitter");
        cVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m117295l(C40736c cVar, Throwable th) {
        C41536l.m120489i(cVar, "$emitter");
        cVar.onError(th);
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m117296m(C40535i3 i3Var, C1644x xVar, C40736c cVar, Throwable th) {
        Integer errorCode;
        C41536l.m120489i(i3Var, "this$0");
        C41536l.m120489i(xVar, "$resetAuthTypesLiveData");
        C41536l.m120489i(cVar, "$emitter");
        if (!i3Var.f96131g || !(th instanceof ApiException) || (errorCode = ((ApiException) th).getErrorCode()) == null || errorCode.intValue() != 70) {
            i3Var.m117299q(xVar, false);
            cVar.onError(th);
            return;
        }
        i3Var.f96131g = false;
        i3Var.f96125a.mo67250j((DeviceIdentifier) null);
        i3Var.m117299q(xVar, true);
        i3Var.mo94570h(xVar).mo94888G(new C40510e3(cVar), new C40516f3(cVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m117297n(C40736c cVar) {
        C41536l.m120489i(cVar, "$emitter");
        cVar.onComplete();
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m117298o(C40736c cVar, Throwable th) {
        C41536l.m120489i(cVar, "$emitter");
        cVar.onError(th);
    }

    /* renamed from: q */
    private final void m117299q(C1644x xVar, boolean z) {
        if (!this.f96132h) {
            this.f96132h = true;
            xVar.mo4823o(Boolean.valueOf(z));
        }
    }

    /* renamed from: h */
    public final C40734b mo94570h(C1644x xVar) {
        C41536l.m120489i(xVar, "resetAuthTypesLiveData");
        C40734b k = C40734b.m117920k(new C40490b3(this, xVar));
        C41536l.m120488h(k, "create { emitter ->\n    …)\n            }\n        }");
        return k;
    }

    /* renamed from: p */
    public final boolean mo94571p() {
        Long deviceId;
        DeviceIdentifier c = this.f96125a.mo67242c();
        if ((c != null ? c.getDeviceId() : null) == null) {
            return false;
        }
        DeviceIdentifier c2 = this.f96125a.mo67242c();
        return !(c2 != null && (deviceId = c2.getDeviceId()) != null && (deviceId.longValue() > 0 ? 1 : (deviceId.longValue() == 0 ? 0 : -1)) == 0);
    }
}
