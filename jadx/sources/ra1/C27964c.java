package ra1;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import ba1.C10199i;
import ce1.C40398b;
import com.facetec.sdk.FaceTecFaceScanProcessor;
import com.facetec.sdk.FaceTecFaceScanResultCallback;
import com.facetec.sdk.FaceTecSDK;
import com.facetec.sdk.FaceTecSessionActivity;
import com.facetec.sdk.FaceTecSessionResult;
import com.facetec.sdk.FaceTecSessionStatus;
import de1.C40640a;
import ed1.C40762x;
import gd1.C40992a;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import ib1.C36425d;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.ValidateOnboardingDataResponse;
import p341ge.bog.sso_client.network.ApiException;
import p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepEnd;
import p341ge.bog.sso_client.onboarding.analytics.facetec.FacetecStepStart;
import ue1.C43075l;
import ue1.C43079p;
import ue1.C43081r;
import ue1.C43082s;

/* renamed from: ra1.c */
public final class C27964c implements FaceTecFaceScanProcessor {

    /* renamed from: a */
    private final String f71173a;

    /* renamed from: b */
    private final C41204a f71174b;

    /* renamed from: c */
    private final C43079p f71175c;

    /* renamed from: d */
    private List f71176d;

    /* renamed from: e */
    private final C43081r f71177e;

    /* renamed from: f */
    private final C43079p f71178f;

    /* renamed from: g */
    private final C43075l f71179g;

    /* renamed from: h */
    private final C43082s f71180h;

    /* renamed from: i */
    private final C10199i f71181i;

    /* renamed from: j */
    private boolean f71182j;

    /* renamed from: k */
    private String f71183k;

    /* renamed from: l */
    private String f71184l;

    /* renamed from: m */
    private FaceTecFaceScanResultCallback f71185m;

    /* renamed from: n */
    private final Handler f71186n = new Handler(Looper.getMainLooper());

    /* renamed from: o */
    private final int f71187o = 70;

    /* renamed from: p */
    private final int[] f71188p = {70};

    /* renamed from: ra1.c$a */
    static final class C27965a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27964c f71189d;

        /* renamed from: e */
        final /* synthetic */ FaceTecFaceScanResultCallback f71190e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27965a(C27964c cVar, FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
            super(1);
            this.f71189d = cVar;
            this.f71190e = faceTecFaceScanResultCallback;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            this.f71189d.m86323k(th, this.f71190e);
        }
    }

    /* renamed from: ra1.c$b */
    static final class C27966b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27964c f71191d;

        /* renamed from: e */
        final /* synthetic */ FaceTecFaceScanResultCallback f71192e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27966b(C27964c cVar, FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
            super(1);
            this.f71191d = cVar;
            this.f71192e = faceTecFaceScanResultCallback;
        }

        /* renamed from: a */
        public final void mo67544a(ValidateOnboardingDataResponse validateOnboardingDataResponse) {
            C27964c cVar = this.f71191d;
            C41536l.m120488h(validateOnboardingDataResponse, "response");
            cVar.m86324l(validateOnboardingDataResponse, this.f71192e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo67544a((ValidateOnboardingDataResponse) obj);
            return C41238w.f97225a;
        }
    }

    public C27964c(String str, String str2, Context context, C41204a aVar, C43079p pVar, List list, C43081r rVar, C43079p pVar2, C43075l lVar, C43082s sVar, C10199i iVar) {
        C41536l.m120489i(str, "faceTecSessionToken");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(context, "context");
        C41536l.m120489i(aVar, "compositeDisposable");
        C41536l.m120489i(pVar, "isRetryCode");
        C41536l.m120489i(list, "retryNotAllowedErrors");
        C41536l.m120489i(rVar, "validateData");
        C41536l.m120489i(pVar2, "logError");
        C41536l.m120489i(lVar, "logFacetecActionStart");
        C41536l.m120489i(sVar, "logFacetecStepFinish");
        C41536l.m120489i(iVar, "localeManager");
        this.f71173a = str2;
        this.f71174b = aVar;
        this.f71175c = pVar;
        this.f71176d = list;
        this.f71177e = rVar;
        this.f71178f = pVar2;
        this.f71179g = lVar;
        this.f71180h = sVar;
        this.f71181i = iVar;
        FaceTecSessionActivity.createAndLaunchSession(context, (FaceTecFaceScanProcessor) this, str);
    }

    /* renamed from: h */
    private final void m86320h(String str, String str2, String str3) {
        this.f71180h.mo41133P0(FacetecStepEnd.SELFIE, C36425d.FAIL, str, str2, str3);
    }

    /* renamed from: i */
    private final void m86321i() {
        this.f71180h.mo41133P0(FacetecStepEnd.SELFIE, C36425d.SUCCESS, (Object) null, (Object) null, (Object) null);
    }

    /* renamed from: j */
    private final void m86322j(ApiException apiException) {
        String str;
        this.f71183k = apiException.getErrorDictionaryKey();
        this.f71184l = apiException.getMessage();
        C43079p pVar = this.f71178f;
        String errorKey = apiException.getErrorKey();
        String str2 = "";
        if (errorKey == null) {
            errorKey = str2;
        }
        String errorMessage = apiException.getErrorMessage();
        if (errorMessage != null) {
            str2 = errorMessage;
        }
        pVar.invoke(errorKey, str2);
        Integer errorCode = apiException.getErrorCode();
        if (errorCode != null) {
            str = errorCode.toString();
        } else {
            str = null;
        }
        m86320h(str, apiException.getErrorKey(), apiException.getErrorMessage());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public final void m86323k(Throwable th, FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
        ApiException apiException;
        ApiException apiException2;
        String str = null;
        this.f71183k = null;
        this.f71184l = null;
        boolean z = th instanceof ApiException;
        if (z) {
            apiException = (ApiException) th;
        } else {
            apiException = null;
        }
        if (apiException != null) {
            m86322j(apiException);
        }
        this.f71185m = null;
        if (z) {
            apiException2 = (ApiException) th;
        } else {
            apiException2 = null;
        }
        if (apiException2 != null) {
            str = apiException2.getErrorKey();
        }
        if (str == null || this.f71176d.contains(str)) {
            faceTecFaceScanResultCallback.cancel();
        } else {
            faceTecFaceScanResultCallback.retry();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m86324l(ValidateOnboardingDataResponse validateOnboardingDataResponse, FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
        this.f71185m = null;
        this.f71183k = null;
        this.f71184l = null;
        if (validateOnboardingDataResponse.getErrorCode() != null) {
            boolean z = false;
            if (((Boolean) this.f71175c.invoke(Boolean.TRUE, validateOnboardingDataResponse.getErrorCode())).booleanValue()) {
                this.f71183k = validateOnboardingDataResponse.getErrorKey();
                String scanResultBlob = validateOnboardingDataResponse.getScanResultBlob();
                if (scanResultBlob == null || C40439w.m117118v(scanResultBlob)) {
                    z = true;
                }
                if (!z) {
                    faceTecFaceScanResultCallback.proceedToNextStep(validateOnboardingDataResponse.getScanResultBlob());
                } else {
                    faceTecFaceScanResultCallback.retry();
                }
            } else {
                this.f71182j = true;
                m86321i();
                String scanResultBlob2 = validateOnboardingDataResponse.getScanResultBlob();
                if (scanResultBlob2 == null || C40439w.m117118v(scanResultBlob2)) {
                    z = true;
                }
                if (!z) {
                    faceTecFaceScanResultCallback.proceedToNextStep(validateOnboardingDataResponse.getScanResultBlob());
                } else {
                    faceTecFaceScanResultCallback.succeed();
                }
            }
        } else {
            this.f71183k = validateOnboardingDataResponse.getErrorKey();
            m86320h(String.valueOf(validateOnboardingDataResponse.getErrorCode()), validateOnboardingDataResponse.getErrorKey(), this.f71184l);
            faceTecFaceScanResultCallback.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m86325m(C27964c cVar, C41205b bVar) {
        C41536l.m120489i(cVar, "this$0");
        cVar.f71179g.invoke(FacetecStepStart.SELFIE);
    }

    /* renamed from: n */
    private final void m86326n() {
        this.f71186n.postDelayed(new C27963b(this), 150);
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m86327o(C27964c cVar) {
        C41536l.m120489i(cVar, "this$0");
        int[] iArr = cVar.f71188p;
        int i = iArr[0] + 1;
        iArr[0] = i;
        FaceTecFaceScanResultCallback faceTecFaceScanResultCallback = cVar.f71185m;
        if (faceTecFaceScanResultCallback != null) {
            float f = ((float) i) / 200.0f;
            if (faceTecFaceScanResultCallback != null) {
                faceTecFaceScanResultCallback.uploadProgress(f);
            }
            cVar.m86326n();
        }
    }

    /* renamed from: e */
    public final String mo67540e() {
        return this.f71183k;
    }

    /* renamed from: f */
    public final String mo67541f() {
        return this.f71184l;
    }

    /* renamed from: g */
    public final boolean mo67542g() {
        return this.f71182j;
    }

    public void processSessionWhileFaceTecSDKWaits(FaceTecSessionResult faceTecSessionResult, FaceTecFaceScanResultCallback faceTecFaceScanResultCallback) {
        C41536l.m120489i(faceTecSessionResult, "sessionResult");
        C41536l.m120489i(faceTecFaceScanResultCallback, "faceScanResultCallback");
        if (faceTecSessionResult.getStatus() != FaceTecSessionStatus.SESSION_COMPLETED_SUCCESSFULLY) {
            faceTecFaceScanResultCallback.cancel();
            return;
        }
        C41204a aVar = this.f71174b;
        C43081r rVar = this.f71177e;
        String createFaceTecAPIUserAgentString = FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId());
        C41536l.m120488h(createFaceTecAPIUserAgentString, "createFaceTecAPIUserAgen…(sessionResult.sessionId)");
        String[] auditTrailCompressedBase64 = faceTecSessionResult.getAuditTrailCompressedBase64();
        C41536l.m120488h(auditTrailCompressedBase64, "sessionResult.auditTrailCompressedBase64");
        List O = C41333m.m119788O(auditTrailCompressedBase64);
        String faceScanBase64 = faceTecSessionResult.getFaceScanBase64();
        String[] lowQualityAuditTrailCompressedBase64 = faceTecSessionResult.getLowQualityAuditTrailCompressedBase64();
        C41536l.m120488h(lowQualityAuditTrailCompressedBase64, "sessionResult.lowQualityAuditTrailCompressedBase64");
        C40762x l = ((C40762x) rVar.invoke(createFaceTecAPIUserAgentString, O, faceScanBase64, C41333m.m119788O(lowQualityAuditTrailCompressedBase64))).mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95083l(new C27962a(this));
        C41536l.m120488h(l, "validateData.invoke(\n   …art.SELFIE)\n            }");
        aVar.mo95660b(C40398b.m116972e(l, new C27965a(this, faceTecFaceScanResultCallback), new C27966b(this, faceTecFaceScanResultCallback)));
        this.f71185m = faceTecFaceScanResultCallback;
        this.f71188p[0] = this.f71187o;
        m86326n();
    }
}
