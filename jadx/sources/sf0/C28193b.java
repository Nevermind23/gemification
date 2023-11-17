package sf0;

import a81.C30772sa;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import ie0.C25190j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p017b.C2106d;

/* renamed from: sf0.b */
public abstract class C28193b extends C30772sa {

    /* renamed from: G */
    public static final C28194a f71535G = new C28194a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C0173b f71536F;

    /* renamed from: sf0.b$a */
    public static final class C28194a {
        private C28194a() {
        }

        public /* synthetic */ C28194a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28193b() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C28192a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f71536F = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: H2 */
    public static final void m86681H2(C28193b bVar, ActivityResult activityResult) {
        C41536l.m120489i(bVar, "this$0");
        if (activityResult.mo371b() == 1) {
            bVar.setResult(1);
            bVar.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public final void mo67714F2() {
        setResult(1);
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G2 */
    public final void mo67715G2(Intent intent) {
        C41536l.m120489i(intent, "intent");
        this.f71536F.mo404a(intent);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C25190j.gt_register);
        C41536l.m120488h(string, "getString(R.string.gt_register)");
        return string;
    }
}
