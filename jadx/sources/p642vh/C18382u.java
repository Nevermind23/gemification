package p642vh;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: vh.u */
public abstract class C18382u {

    /* renamed from: vh.u$a */
    public static final class C18383a extends C18382u {

        /* renamed from: a */
        private final int f51837a;

        public C18383a(int i) {
            super((DefaultConstructorMarker) null);
            this.f51837a = i;
        }

        /* renamed from: b */
        public final int mo46174b() {
            return this.f51837a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18383a) && this.f51837a == ((C18383a) obj).f51837a;
        }

        public int hashCode() {
            return this.f51837a;
        }

        public String toString() {
            int i = this.f51837a;
            return "Dimen(dimen=" + i + ")";
        }
    }

    /* renamed from: vh.u$b */
    public static final class C18384b extends C18382u {

        /* renamed from: a */
        private final int f51838a;

        public C18384b(int i) {
            super((DefaultConstructorMarker) null);
            this.f51838a = i;
        }

        /* renamed from: b */
        public final int mo46178b() {
            return this.f51838a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C18384b) && this.f51838a == ((C18384b) obj).f51838a;
        }

        public int hashCode() {
            return this.f51838a;
        }

        public String toString() {
            int i = this.f51838a;
            return "LayoutFit(fitInt=" + i + ")";
        }
    }

    private C18382u() {
    }

    public /* synthetic */ C18382u(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: a */
    public final int mo46173a(Context context) {
        C41536l.m120489i(context, "context");
        if (this instanceof C18383a) {
            return context.getResources().getDimensionPixelSize(((C18383a) this).mo46174b());
        }
        if (this instanceof C18384b) {
            return ((C18384b) this).mo46178b();
        }
        throw new NoWhenBranchMatchedException();
    }
}
