package ic0;

import android.os.Bundle;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p380ck.C10463g;
import p380ck.C10464h;

/* renamed from: ic0.d */
public abstract class C25164d {

    /* renamed from: c */
    public static final C25165a f64615c = new C25165a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C10464h.C10465a f64616a;

    /* renamed from: b */
    private final String f64617b;

    /* renamed from: ic0.d$a */
    public static final class C25165a {
        private C25165a() {
        }

        public /* synthetic */ C25165a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ic0.d$b */
    public static final class C25166b extends C25164d {

        /* renamed from: d */
        private final String f64618d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25166b(String str) {
            super(C10464h.C10465a.FACEBOOKANDFIREBASE, str, (DefaultConstructorMarker) null);
            C41536l.m120489i(str, "label");
            this.f64618d = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C25166b) && C41536l.m120484d(this.f64618d, ((C25166b) obj).f64618d);
        }

        public int hashCode() {
            return this.f64618d.hashCode();
        }

        public String toString() {
            String str = this.f64618d;
            return "NotificationClickEvent(label=" + str + ")";
        }
    }

    public /* synthetic */ C25164d(C10464h.C10465a aVar, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str);
    }

    /* renamed from: a */
    public final void mo63704a(C10463g gVar) {
        C41536l.m120489i(gVar, "analytics");
        gVar.mo27137H("deposit_prolongation", "click", this.f64617b, (Bundle) null, this.f64616a);
    }

    private C25164d(C10464h.C10465a aVar, String str) {
        this.f64616a = aVar;
        this.f64617b = str;
    }
}
