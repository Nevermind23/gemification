package oc1;

import android.os.Bundle;
import androidx.core.p016os.C0908e;
import ba1.C10146d0;
import ca1.C10379a;
import com.salesforce.marketingcloud.UrlHandler;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ib1.C36425d;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.sso_client.models.DeviceIdentifier;
import p341ge.bog.sso_client.network.ApiException;
import qa1.C27700a1;
import sso.type.ProcessFlow;
import ue1.C43064a;

/* renamed from: oc1.a */
public interface C41809a {

    /* renamed from: oc1.a$a */
    public static final class C41810a {
        /* renamed from: a */
        public static void m121208a(C41809a aVar, String str, C36425d dVar, ApiException apiException, C41224m... mVarArr) {
            Integer num;
            String str2;
            C41536l.m120489i(str, "actionName");
            C41536l.m120489i(dVar, "result");
            C41536l.m120489i(mVarArr, "extraParams");
            String str3 = null;
            if (apiException != null) {
                num = apiException.getErrorCode();
            } else {
                num = null;
            }
            String valueOf = String.valueOf(num);
            if (apiException != null) {
                str2 = apiException.getErrorKey();
            } else {
                str2 = null;
            }
            if (apiException != null) {
                str3 = apiException.getErrorMessage();
            }
            aVar.mo89159dr(str, dVar, valueOf, str2, str3, (C41224m[]) Arrays.copyOf(mVarArr, mVarArr.length));
        }

        /* renamed from: b */
        public static void m121209b(C41809a aVar, String str, C36425d dVar, C41224m... mVarArr) {
            C41536l.m120489i(str, "actionName");
            C41536l.m120489i(dVar, "result");
            C41536l.m120489i(mVarArr, "extraParams");
            aVar.mo89159dr(str, dVar, (String) null, (String) null, (String) null, (C41224m[]) Arrays.copyOf(mVarArr, mVarArr.length));
        }

        /* renamed from: c */
        public static void m121210c(C41809a aVar, String str, C41224m... mVarArr) {
            C41536l.m120489i(str, "actionName");
            C41536l.m120489i(mVarArr, "extraParams");
            aVar.mo89159dr(str, (C36425d) null, (String) null, (String) null, (String) null, (C41224m[]) Arrays.copyOf(mVarArr, mVarArr.length));
        }
    }

    /* renamed from: oc1.a$b */
    public static final class C41811b implements C41809a {

        /* renamed from: d */
        private final C10379a f98145d;

        /* renamed from: e */
        private final C27700a1 f98146e;

        /* renamed from: f */
        private C43064a f98147f = C41812a.f98148d;

        /* renamed from: oc1.a$b$a */
        static final class C41812a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C41812a f98148d = new C41812a();

            C41812a() {
                super(0);
            }

            public final String invoke() {
                return C10146d0.C10176g.m37221b();
            }
        }

        public C41811b(C10379a aVar, C27700a1 a1Var) {
            C41536l.m120489i(a1Var, "storage");
            this.f98145d = aVar;
            this.f98146e = a1Var;
        }

        /* renamed from: Bu */
        public void mo89126Bu(String str, C36425d dVar, ApiException apiException, C41224m... mVarArr) {
            C41810a.m121208a(this, str, dVar, apiException, mVarArr);
        }

        /* renamed from: dr */
        public void mo89159dr(String str, C36425d dVar, String str2, String str3, String str4, C41224m... mVarArr) {
            Long l;
            String l2;
            C41536l.m120489i(str, "actionName");
            C41536l.m120489i(mVarArr, "extraParams");
            C10379a aVar = this.f98145d;
            if (aVar != null) {
                C41224m[] mVarArr2 = new C41224m[5];
                mVarArr2[0] = C41233s.m119492a(UrlHandler.ACTION, str);
                mVarArr2[1] = C41233s.m119492a("pin", C10146d0.C10176g.m37224e());
                DeviceIdentifier c = this.f98146e.mo67242c();
                String str5 = null;
                if (c != null) {
                    l = c.getDeviceId();
                } else {
                    l = null;
                }
                mVarArr2[2] = C41233s.m119492a("dev_id", String.valueOf(l));
                mVarArr2[3] = C41233s.m119492a("process_reference", this.f98147f.invoke());
                ProcessFlow a = C10146d0.C10176g.m37222c().mo88492a();
                if (a != null) {
                    str5 = a.getRawValue();
                }
                mVarArr2[4] = C41233s.m119492a("path", str5);
                Bundle b = C0908e.m3336b(mVarArr2);
                if (dVar != null) {
                    b.putString("result", dVar.mo89240b());
                }
                if (str2 != null) {
                    b.putString("err_code", str2);
                }
                if (str3 != null) {
                    b.putString("err_key", str3);
                }
                if (str4 != null) {
                    b.putString("err_msg", str4);
                }
                Long b2 = C10146d0.C10175f.m37217b();
                if (!(b2 == null || (l2 = b2.toString()) == null)) {
                    b.putString("userId", l2);
                }
                for (C41224m mVar : mVarArr) {
                    if (((String) mVar.mo95680f()) != null) {
                        b.putString((String) mVar.mo95678e(), (String) mVar.mo95680f());
                    }
                }
                C41238w wVar = C41238w.f97225a;
                C10379a.C10380a.m37703a(aVar, "digital_onboarding", str, (String) null, b, C10379a.C10381b.FIREBASE, 4, (Object) null);
            }
        }

        /* renamed from: hc */
        public void mo89166hc(C43064a aVar) {
            C41536l.m120489i(aVar, "getProcessReference");
            this.f98147f = aVar;
        }

        /* renamed from: s7 */
        public void mo89187s7(String str, C36425d dVar, C41224m... mVarArr) {
            C41810a.m121209b(this, str, dVar, mVarArr);
        }

        /* renamed from: tn */
        public void mo89192tn(String str, C41224m... mVarArr) {
            C41810a.m121210c(this, str, mVarArr);
        }
    }

    /* renamed from: Bu */
    void mo89126Bu(String str, C36425d dVar, ApiException apiException, C41224m... mVarArr);

    /* renamed from: dr */
    void mo89159dr(String str, C36425d dVar, String str2, String str3, String str4, C41224m... mVarArr);

    /* renamed from: hc */
    void mo89166hc(C43064a aVar);

    /* renamed from: s7 */
    void mo89187s7(String str, C36425d dVar, C41224m... mVarArr);

    /* renamed from: tn */
    void mo89192tn(String str, C41224m... mVarArr);
}
