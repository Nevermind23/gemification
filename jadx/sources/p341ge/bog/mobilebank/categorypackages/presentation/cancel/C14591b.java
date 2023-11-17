package p341ge.bog.mobilebank.categorypackages.presentation.cancel;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7593r;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p356ao.C10114f;

/* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.b */
public abstract class C14591b {

    /* renamed from: a */
    public static final C14592a f42510a = new C14592a((DefaultConstructorMarker) null);

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.b$a */
    public static final class C14592a {
        private C14592a() {
        }

        public /* synthetic */ C14592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C7593r mo40973a(PackageType packageType) {
            C41536l.m120489i(packageType, "packageType");
            return new C14593b(packageType);
        }
    }

    /* renamed from: ge.bog.mobilebank.categorypackages.presentation.cancel.b$b */
    private static final class C14593b implements C7593r {

        /* renamed from: a */
        private final PackageType f42511a;

        /* renamed from: b */
        private final int f42512b = C10114f.gotoCancelFeedback;

        public C14593b(PackageType packageType) {
            C41536l.m120489i(packageType, "packageType");
            this.f42511a = packageType;
        }

        /* renamed from: a */
        public int mo22014a() {
            return this.f42512b;
        }

        /* renamed from: b */
        public Bundle mo22015b() {
            Bundle bundle = new Bundle();
            Class<PackageType> cls = PackageType.class;
            if (Parcelable.class.isAssignableFrom(cls)) {
                PackageType packageType = this.f42511a;
                C41536l.m120487g(packageType, "null cannot be cast to non-null type android.os.Parcelable");
                bundle.putParcelable("package_type", (Parcelable) packageType);
            } else if (Serializable.class.isAssignableFrom(cls)) {
                PackageType packageType2 = this.f42511a;
                C41536l.m120487g(packageType2, "null cannot be cast to non-null type java.io.Serializable");
                bundle.putSerializable("package_type", packageType2);
            }
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C14593b) && this.f42511a == ((C14593b) obj).f42511a;
        }

        public int hashCode() {
            return this.f42511a.hashCode();
        }

        public String toString() {
            PackageType packageType = this.f42511a;
            return "GotoCancelFeedback(packageType=" + packageType + ")";
        }
    }
}
