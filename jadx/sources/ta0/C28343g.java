package ta0;

import android.view.View;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ue1.C43064a;

/* renamed from: ta0.g */
public final class C28343g implements View.OnClickListener {

    /* renamed from: g */
    public static final C28344a f71853g = new C28344a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final long f71854d;

    /* renamed from: e */
    private final C43064a f71855e;

    /* renamed from: f */
    private long f71856f = -1;

    /* renamed from: ta0.g$a */
    public static final class C28344a {
        private C28344a() {
        }

        public /* synthetic */ C28344a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C28343g(long j, C43064a aVar) {
        C41536l.m120489i(aVar, "onClick");
        this.f71854d = j;
        this.f71855e = aVar;
    }

    /* renamed from: a */
    private final boolean m86977a() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f71856f + this.f71854d >= currentTimeMillis) {
            return false;
        }
        this.f71856f = currentTimeMillis;
        return true;
    }

    public void onClick(View view) {
        if (m86977a()) {
            this.f71855e.invoke();
        }
    }
}
